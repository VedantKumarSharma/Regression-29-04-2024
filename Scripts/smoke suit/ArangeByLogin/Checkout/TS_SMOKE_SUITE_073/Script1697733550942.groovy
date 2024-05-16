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

WebUI.waitForPageLoad(0)

WebUI.click(findTestObject('smoke Suit/HomePage/Logo_hp'))

WebUI.callTestCase(findTestCase('smoke suit/CommonMethods/SearchForAProduct_search'), [('searchTerm') : GlobalVariable.SL1], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('smoke Suit/PLPPage/product1_PLP'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('smoke Suit/PDPPage/AddToCart_PDP'))

WebUI.click(findTestObject('smoke Suit/HomePage/bag_header_HP'))

WebUI.click(findTestObject('smoke Suit/CartPage/BuyButton_Cart'))

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('smoke Suit/OPCPage/3DotButton2_Checkout'))

WebUI.click(findTestObject('smoke Suit/OPCPage/OPCPage/EditAddress_Checkout'))

WebUI.setText(findTestObject('OPCPage/shortName_addAddress_opc'), GlobalVariable.ShortName)

WebUI.waitForPageLoad(0)

WebUI.enhancedClick(findTestObject('smoke Suit/OPCPage/OPCPage/ContinueButtonAddAddress_Checkout'))

WebUI.enhancedClick(findTestObject('smoke Suit/OPCPage/OPCPage/ContinueButtonAddAddress_Checkout'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('smoke Suit/HomePage/Logo_hp'))

WebUI.mouseOver(findTestObject('smoke Suit/HomePage/span_HolaUser_hp'))

WebUI.click(findTestObject('smoke Suit/HomePage/myAccount_hp'))

WebUI.click(findTestObject('smoke Suit/AccountManagement/deliveryAddress_MyAccount'))

addressBlockContainer = WebUI.getText(findTestObject('smoke Suit/AccountManagement/addressBlockContainer_Account'))

if (addressBlockContainer == GlobalVariable.ShortName) {
    println('Checked')
}

