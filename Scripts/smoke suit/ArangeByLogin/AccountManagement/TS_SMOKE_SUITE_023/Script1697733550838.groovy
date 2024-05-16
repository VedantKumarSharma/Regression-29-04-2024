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
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil

WebUI.callTestCase(findTestCase('smoke suit/CommonMethods/login_odtaqab'), [:], FailureHandling.OPTIONAL)

WebUI.mouseOver(findTestObject('smoke Suit/HomePage/AfterLogin_Homepage'))

WebUI.click(findTestObject('smoke Suit/AccountManagement/MyAccountButton_Account'))

WebUI.click(findTestObject('smoke Suit/AccountManagement/MyPaymentMethod_Account'))

WebUI.click(findTestObject('smoke Suit/AccountManagement/MyCardButton_Account'))

WebUI.click(findTestObject('smoke Suit/AccountManagement/AddCardButton_Account'), FailureHandling.STOP_ON_FAILURE)

Cardname = CustomKeywords.'customkeywords.myKeywords.randomString'()

WebUI.setText(findTestObject('smoke Suit/AccountManagement/CardName_Account'), Cardname)

WebUI.callTestCase(findTestCase('smoke suit/CommonMethods/AddCard_Account'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForPageLoad(0)

CardName = WebUI.getText(findTestObject('smoke Suit/AccountManagement/CardNameGrid_Account'))

if (Cardname == CardName) {
    println('Add Card Successful')
} else {
    KeywordUtil.markFailed('Card is not Added !')
}

WebUI.click(findTestObject('smoke Suit/AccountManagement/Select3DotAddress2Nd_Account'))

WebUI.click(findTestObject('smoke Suit/AccountManagement/EditCardDetails_Account'), FailureHandling.STOP_ON_FAILURE)

Name = CustomKeywords.'customkeywords.myKeywords.randomString'()

WebUI.sendKeys(findTestObject('smoke Suit/AccountManagement/firstName_update_accountManagement'), Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('smoke Suit/AccountManagement/firstName_update_accountManagement'), Keys.chord(Keys.BACK_SPACE))

WebUI.clearText(findTestObject('smoke Suit/AccountManagement/firstName_update_accountManagement'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(0)

WebUI.setText(findTestObject('smoke Suit/AccountManagement/firstName_update_accountManagement'), Name)

WebUI.setText(findTestObject('smoke Suit/AccountManagement/firstName_update_accountManagement'), Name)

WebUI.click(findTestObject('smoke Suit/AccountManagement/AcceptButton_AccountM'))

WebUI.click(findTestObject('smoke Suit/AccountManagement/Select3DotAddress2Nd_Account'))

WebUI.click(findTestObject('smoke Suit/AccountManagement/RemoveCardDetails_Account'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('smoke Suit/OPCPage/accept_deletion_card_OPC'))

if (WebUI.verifyElementNotPresent(findTestObject('smoke Suit/AccountManagement/Select3DotAddress2Nd_Account'), 0)) {
    println('Card remove Successful')
} else {
    KeywordUtil.markFailed('Card is not Removed !')
}

