import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.URL)

WebUI.callTestCase(findTestCase('smoke suit/CommonMethods/login_odtaqab'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.mouseOver(findTestObject('smoke Suit/HomePage/AfterLogin_Homepage'))

WebUI.click(findTestObject('smoke Suit/AccountManagement/MyAccountButton_Account'))

WebUI.click(findTestObject('smoke Suit/AccountManagement/Mis formas de pago'))

WebUI.click(findTestObject('smoke Suit/AccountManagement/Tiempo_aire_MyAccount'))

WebUI.click(findTestObject('smoke Suit/AccountManagement/ATT/checkbox1_MyAccount'))

WebUI.click(findTestObject('smoke Suit/AccountManagement/ATT/DigitalWallet_radioButton_ATT'))

WebUI.verifyElementNotPresent(findTestObject('smoke Suit/AccountManagement/ATT/Ussar_BBVA_Puntos_Checkbox_ATT'), 0)

WebUI.click(findTestObject('smoke Suit/AccountManagement/ATT/finalize_recharge_MyAccount'))

'verify thank you page'
WebUI.verifyElementPresent(findTestObject('smoke Suit/ConfirmationPage/gracias_por_comprar_CP'), 0)

