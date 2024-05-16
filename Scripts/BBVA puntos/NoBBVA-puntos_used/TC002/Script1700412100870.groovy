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

WebUI.verifyElementPresent(findTestObject('smoke Suit/AccountManagement/Otros métodos de pago_AM'), 0)

WebUI.verifyElementPresent(findTestObject('smoke Suit/AccountManagement/Help_paymentMethod_AM'), 0)

WebUI.click(findTestObject('smoke Suit/AccountManagement/MisTarjestra_AM'))

WebUI.click(findTestObject('smoke Suit/AccountManagement/AddCardButton_Account'))

Cardname = CustomKeywords.'customkeywords.myKeywords.randomString'()

WebUI.setText(findTestObject('smoke Suit/AccountManagement/CardName_Account'), Cardname)

WebUI.callTestCase(findTestCase('smoke suit/CommonMethods/AddCard_Account_AM_withPuntos'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForPageLoad(0)

CardName = WebUI.getText(findTestObject('smoke Suit/AccountManagement/CardNameGrid_Account'))

if (Cardname == CardName) {
    println('Add Card Successful')
} else {
    KeywordUtil.markFailed('Card is not Added !')
}

WebUI.callTestCase(findTestCase('smoke suit/CommonMethods/DeletePuntosCard_AM'), [:], FailureHandling.STOP_ON_FAILURE)

