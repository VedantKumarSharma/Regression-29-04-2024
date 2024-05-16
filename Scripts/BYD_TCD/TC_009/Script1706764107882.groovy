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

WebUI.verifyElementPresent(findTestObject('smoke Suit/HomePage/BYD_HP'), 0)

WebUI.enhancedClick(findTestObject('smoke Suit/HomePage/BYD_HP'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('smoke Suit/BYD/BYD_HP/LP_Logo_Img_Header_BYD_HP'), 0)

WebUI.verifyElementPresent(findTestObject('smoke Suit/BYD/BYD_HP/BYD_Header_Logo_img_HP'), 0)

WebUI.verifyElementPresent(findTestObject('smoke Suit/BYD/BYD_HP/inicio_BYD_HP'), 0)

WebUI.verifyElementPresent(findTestObject('smoke Suit/BYD/BYD_HP/Models_BYD_HP'), 0)

WebUI.verifyElementPresent(findTestObject('smoke Suit/BYD/BYD_HP/Aparta_en_linea_BYD_HP'), 0)

WebUI.verifyElementPresent(findTestObject('smoke Suit/BYD/BYD_HP/Conoce_BYD_HP'), 0)

WebUI.verifyElementPresent(findTestObject('smoke Suit/BYD/BYD_HP/Banner_Img_BYD_HP'), 0)

WebUI.verifyElementPresent(findTestObject('smoke Suit/BYD/BYD_HP/Banner_Left_arrow_BYD_HP'), 0)

WebUI.verifyElementPresent(findTestObject('smoke Suit/BYD/BYD_HP/Banner_Right_arrow_BYD_HP'), 0)

WebUI.verifyElementPresent(findTestObject('smoke Suit/BYD/BYD_HP/Footer_BYD_HP/Footer_Container_BYD_HP'), 0)
