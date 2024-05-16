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

WebUI.callTestCase(findTestCase('smoke suit/CommonMethods/login_odtaqab'), [:], FailureHandling.OPTIONAL)

WebUI.callTestCase(findTestCase('smoke suit/CommonMethods/EmptyCart_RunAt_HP'), [:], FailureHandling.OPTIONAL)

WebUI.callTestCase(findTestCase('smoke suit/CommonMethods/SearchForAProduct_search'), [('searchTerm') : 'tv'], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('smoke Suit/PLPPage/product-2-DiscountPrice_PLP'))

WebUI.scrollToElement(findTestObject('smoke Suit/PDPPage/ComplementaryServices_Div_PDP'), 0)

WebUI.verifyElementPresent(findTestObject('smoke Suit/PDPPage/ComplementaryServices_Div_PDP'), 0)

WebUI.verifyElementPresent(findTestObject('smoke Suit/PDPPage/ComplementaryServices_Div_option1_PDP'), 0)

WebUI.verifyElementPresent(findTestObject('smoke Suit/PDPPage/ComplementaryServices_Div_option2_PDP'), 0)

WebUI.verifyElementPresent(findTestObject('smoke Suit/PDPPage/ComplementaryServices_Div_noRequire_ExtendedWarranty_PDP'), 0)

WebUI.comment('their are multi option currently verifying for 2 and of no reqiure select option')

WebUI.click(findTestObject('smoke Suit/PDPPage/ComplementaryServices_Div_option2_RadioButton_PDP'), FailureHandling.STOP_ON_FAILURE)

WebUI.enhancedClick(findTestObject('smoke Suit/PDPPage/AddToCart_PDP'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('smoke Suit/HomePage/bag_header_HP'))

WebUI.verifyElementPresent(findTestObject('smoke Suit/CartPage/prduct1_PcServices_AddQuantity_disabled_CartPage'), 0)

'the button should not be available for product associated with cellular gurante'
WebUI.verifyElementNotPresent(findTestObject('smoke Suit/CartPage/Product1_ComprarParaMesaDeRegalos_CartPage'), 0)

plan = WebUI.getText(findTestObject('smoke Suit/CartPage/Product1_title_celluarProtection_CartPage'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('smoke Suit/CartPage/CambiarGarantia_ChangeProtection1_cartPage'))

WebUI.click(findTestObject('smoke Suit/CartPage/PopUP_CambiarProteccion_ChangeProtection1_Option1_cartPage'))

WebUI.click(findTestObject('smoke Suit/CartPage/PopUP_Aceptar_cartPage'))

plan2 = WebUI.getText(findTestObject('smoke Suit/CartPage/Product1_title_celluarProtection_CartPage'), FailureHandling.STOP_ON_FAILURE)

if (plan != plan2) {
    System.out.println('changed')
}

WebUI.click(findTestObject('smoke Suit/CartPage/BuyButton_Cart'))

'the button should not be available for product associated with cellular gurante'
WebUI.verifyElementNotPresent(findTestObject('smoke Suit/OPCPage/Product1_ComprarParaMesaDeRegalos_OPCPage'), 0)

plan = WebUI.getText(findTestObject('smoke Suit/OPCPage/Product1_title_celluarProtection_OPCPage'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('smoke Suit/CartPage/CambiarProteccion_ChangeProtection1_cartPage'))

WebUI.click(findTestObject('smoke Suit/CartPage/PopUP_CambiarProteccion_ChangeProtection1_Option2_cartPage'))

WebUI.click(findTestObject('smoke Suit/CartPage/PopUP_Aceptar_cartPage'))

plan2 = WebUI.getText(findTestObject('smoke Suit/OPCPage/Product1_title_celluarProtection_OPCPage'), FailureHandling.STOP_ON_FAILURE)

if (plan != plan2) {
    System.out.println('changed')
}

