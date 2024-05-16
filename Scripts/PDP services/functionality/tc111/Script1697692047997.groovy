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

WebUI.navigateToUrl(GlobalVariable.URLQA2)

WebUI.callTestCase(findTestCase('smoke suit/CommonMethods/login_odtaqab'), [:], FailureHandling.OPTIONAL)

WebUI.callTestCase(findTestCase('smoke suit/CommonMethods/SearchForAProduct_search'), [('searchTerm') : 'samsung'], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('smoke Suit/PLPPage/product-2-DiscountPrice_PLP'))

WebUI.callTestCase(findTestCase('smoke suit/CommonMethods/login_odtaqab'), [:], FailureHandling.OPTIONAL)

WebUI.callTestCase(findTestCase('smoke suit/CommonMethods/SearchForAProduct_search'), [('searchTerm') : 'samsung'], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('smoke Suit/PLPPage/product-2-DiscountPrice_PLP'))

WebUI.scrollToElement(findTestObject('smoke Suit/PDPPage/ComplementaryServices_Div_PDP'), 0)

WebUI.verifyElementPresent(findTestObject('smoke Suit/PDPPage/Conoce_Mas_sobre_ComplementaryServices_MoreOption_PDP'), 0)

WebUI.click(findTestObject('smoke Suit/PDPPage/Conoce_Mas_sobre_ComplementaryServices_MoreOption_PDP'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('smoke Suit/PDPPage/POP_up_complemntaryServices_PDP'), 0)

WebUI.verifyElementPresent(findTestObject('smoke Suit/PDPPage/NoGracias_ComplementaryServices_popup_PDP'), 0)

WebUI.verifyElementPresent(findTestObject('smoke Suit/PDPPage/AgregorProtection_ComplementaryServices_popup_PDP - Copy'), 0)

WebUI.verifyElementPresent(findTestObject('smoke Suit/PDPPage/CellulorProtectionLogo_ComplementaryServices_popup_PDP'), 0)

WebUI.verifyElementPresent(findTestObject('smoke Suit/PDPPage/StaticText_POPup_ComplementaryServices_PDP'), 0)

WebUI.click(findTestObject('smoke Suit/OPCPage/OPCPage/close_popup_OPC'))

WebUI.verifyElementNotPresent(findTestObject('smoke Suit/PDPPage/POP_up_complemntaryServices_PDP'), 0)

WebUI.delay(4)

WebUI.click(findTestObject('smoke Suit/PDPPage/ComplementaryServices_Div_option1_RadioButton_PDP'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementChecked(findTestObject('smoke Suit/PDPPage/ComplementaryServices_Div_option1_RadioButton_PDP'), 0)

WebUI.enhancedClick(findTestObject('smoke Suit/PDPPage/ComplementaryServices_Div_option2_RadioButton_PDP'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementNotChecked(findTestObject('smoke Suit/PDPPage/ComplementaryServices_Div_option1_RadioButton_PDP'), 0)

WebUI.enhancedClick(findTestObject('smoke Suit/PDPPage/AddToCart_PDP'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('smoke Suit/HomePage/bag_header_HP'))

WebUI.click(findTestObject('smoke Suit/CartPage/BuyButton_Cart'))

WebUI.verifyElementPresent(findTestObject('smoke Suit/OPCPage/OPCPage/couponOption_product1_Protection_OPCpage'), 0)

WebUI.click(findTestObject('smoke Suit/OPCPage/OPCPage/couponOption_product1_Protection_OPCpage'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementNotVisible(findTestObject('smoke Suit/OPCPage/OPCPage/coupons_POP_UP_options_OPCpage'), FailureHandling.STOP_ON_FAILURE)

