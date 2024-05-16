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

WebUI.callTestCase(findTestCase('smoke suit/CommonMethods/clickMyAccountFromHeader'), [:], FailureHandling.OPTIONAL)

WebUI.click(findTestObject('smoke Suit/OPCPage/OPCPage/deliveryAddressHeading_address_opc'))

WebUI.callTestCase(findTestCase('smoke suit/CommonMethods/ClickDelivery_MyAccount'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('smoke Suit/AccountManagement/ClickAndCollectStores_accounts'))

WebUI.click(findTestObject('smoke Suit/OPCPage/3DotButton_Checkout'))

WebUI.click(findTestObject('smoke Suit/AccountManagement/ClickNCollectionDefault_Account'))

TitleAddress = WebUI.getText(findTestObject('smoke Suit/AccountManagement/ClickNCollectionAddressTitle_Account'))

WebUI.click(findTestObject('smoke Suit/HomePage/Logo_hp'))

WebUI.callTestCase(findTestCase('smoke suit/CommonMethods/SearchForAProduct_search'), [('searchTerm') : GlobalVariable.jeans], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('smoke Suit/PLPPage/product1_PLP'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('smoke Suit/PDPPage/AddToCart_PDP'))

WebUI.click(findTestObject('smoke Suit/HomePage/bag_header_HP'))

WebUI.click(findTestObject('smoke Suit/CartPage/BuyButton_Cart'))

DefaultAddress = WebUI.getText(findTestObject('smoke Suit/OPCPage/OPCPage/DefaultAddress_Checkout'))

if (TitleAddress == DefaultAddress) {
    Println('Checked')
}

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('smoke Suit/OPCPage/AddAddressButtonPopup_checkout'))

WebUI.click(findTestObject('smoke Suit/OPCPage/AddressPopupCLickNCollect_Checkout'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('smoke Suit/OPCPage/CheckAddressDefault_Checkout'), 0)

WebUI.verifyElementPresent(findTestObject('smoke Suit/OPCPage/OPCPage/ClickNCollectionRadioButton_Checkout'), 0)

