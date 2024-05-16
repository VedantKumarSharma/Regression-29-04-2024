import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import org.apache.commons.lang.RandomStringUtils as RandomStringUtils
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

String cardnumber = '49118488' + RandomStringUtils.randomNumeric(8)

System.out.println(cardnumber)

String cardname = RandomStringUtils.randomAlphabetic(8)

WebUI.setText(findTestObject('smoke Suit/OPCPage/newCardNumber_OPC'), cardnumber)

WebUI.setText(findTestObject('smoke Suit/OPCPage/OPCPage/EnterCardAlias_OPC'), cardname)

WebUI.setText(findTestObject('smoke Suit/OPCPage/OPCPage/enterCardName_OPC'), 'vedant')

not_run: WebUI.setText(findTestObject('smoke Suit/OPCPage/newCard_expireDATE_POPup_Addcard_OPC'), '12/24')

WebUI.click(findTestObject('smoke Suit/AccountManagement/PostalCodeCard_Account'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('smoke Suit/AccountManagement/PostalCodeCard_Account'), GlobalVariable.PostalCode)

WebUI.click(findTestObject('smoke Suit/OPCPage/street_addAddress_opc'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('smoke Suit/OPCPage/street_addAddress_opc'), GlobalVariable.StreetAddAddress)

WebUI.setText(findTestObject('smoke Suit/OPCPage/noExt_addAddress_opc'), GlobalVariable.NoExtAddAddress)

WebUI.setText(findTestObject('OPCPage/cellphone_addAddress_opc'), GlobalVariable.CellPhoneAddAddress)

WebUI.setText(findTestObject('smoke Suit/OPCPage/LADA_addAddress_opc (1)'), GlobalVariable.LADAaddAddress)

WebUI.setText(findTestObject('smoke Suit/OPCPage/phone_addAddress_opc (1)'), GlobalVariable.phoneAddAddress)

not_run: WebUI.setText(findTestObject('smoke Suit/OPCPage/OPCPage/enterCardCVV_OPC'), '123')

not_run: WebUI.click(findTestObject('smoke Suit/OPCPage/selectAddress_Card_create_popup'))

WebUI.click(findTestObject('smoke Suit/CartPage/PopUP_Aceptar_cartPage'))

WebUI.delay(4)

WebUI.callTestCase(findTestCase('smoke suit/CommonMethods/close any pop up'), [:], FailureHandling.OPTIONAL)
