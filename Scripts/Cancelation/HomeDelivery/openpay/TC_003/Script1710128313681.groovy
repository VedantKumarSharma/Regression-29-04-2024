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
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.exception.StepErrorException as StepErrorException
import com.kms.katalon.core.exception.StepFailedException as StepFailedException
import com.kms.katalon.core.logging.ErrorCollector as ErrorCollector
import com.kms.katalon.core.logging.KeywordLogger as KeywordLogger

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.Subarbia)

WebUI.callTestCase(findTestCase('smoke suit/CommonMethods/login_odtaqab'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('smoke suit/CommonMethods/SearchForAProduct_search'), [('searchTerm') : GlobalVariable.product], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('smoke Suit/PDPPage/Size1_PDP'))

WebUI.click(findTestObject('smoke Suit/PDPPage/AddToCart_PDP'))

WebUI.click(findTestObject('smoke Suit/HomePage/bag_header_HP'))

WebUI.click(findTestObject('smoke Suit/CartPage/BuyButton_Cart'))

WebUI.click(findTestObject('smoke Suit/OPCPage/changeADDRESS_OPC'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('smoke Suit/OPCPage/Select_delivery_adress_option1_POPup_OPC'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('smoke Suit/OPCPage/OPCPage/ContinueButtonAddAddress_Checkout'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('smoke Suit/OPCPage/paymentMethod_change_OPC'))

WebUI.click(findTestObject('smoke Suit/OPCPage/paymentMethod_button3_OPC'))

WebUI.click(findTestObject('smoke Suit/OPCPage/OPCPage/Continue_payment_3rdmethod_OPC'))

WebUI.delay(5)

WebUI.click(findTestObject('smoke Suit/OPCPage/OPCPage/Final_comparar_OPC'))

WebUI.click(findTestObject('smoke Suit/ConfirmationPage/My_orders_CP'))

WebUI.click(findTestObject('smoke Suit/MyOrdersPage/Cancel_order_Product1_OP'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('smoke Suit/MyOrdersPage/Select_All_checkBox_OP'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('smoke Suit/MyOrdersPage/Tiempo_De_Entrega_OP'))

WebUI.click(findTestObject('smoke Suit/AccountManagement/ContinueButton_Account'))

WebUI.click(findTestObject('smoke Suit/MyOrdersPage/ConfirmarCancelacion_OP'))

if (WebUI.verifyElementPresent(findTestObject('smoke Suit/MyOrdersPage/Cancelation_start_POPup'), 0) == true) {
    KeywordUtil.markPassed('passed')
} else if (WebUI.verifyElementPresent(findTestObject('smoke Suit/MyOrdersPage/Cancelation_not_Placed_OP'), 0) == false) {
    KeywordUtil.markFailedAndStop('failed')
}

