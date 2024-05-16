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

WebUI.callTestCase(findTestCase('smoke suit/CommonMethods/SearchForAProduct_search'), [('searchTerm') : GlobalVariable.SL1], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForPageLoad(0)

WebUI.click(findTestObject('smoke Suit/PLPPage/product1_PLP'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('smoke Suit/PDPPage/AddToCart_PDP'))

WebUI.click(findTestObject('smoke Suit/HomePage/bag_header_HP'))

WebUI.click(findTestObject('smoke Suit/CartPage/BuyButton_Cart'))

WebUI.click(findTestObject('smoke Suit/OPCPage/paymentMethod_change_OPC'))

WebUI.click(findTestObject('smoke Suit/OPCPage/paymentMethod_button2_OPC'))

WebUI.click(findTestObject('smoke Suit/OPCPage/OPCPage/label_Cambiar_payment_opc'), FailureHandling.OPTIONAL)

WebUI.callTestCase(findTestCase('smoke suit/CommonMethods/paypal(changepaymentmethod)pay'), [:], FailureHandling.OPTIONAL)

WebUI.click(findTestObject('smoke Suit/OPCPage/button_Continuar_payment_opc'))

WebUI.click(findTestObject('smoke Suit/OPCPage/OPCPage/Final_paypal_final(terminar)_OPC'))

WebUI.verifyElementPresent(findTestObject('smoke Suit/OPCPage/OPCPage/ConfirmOrder_Checkout'), 0)

WebUI.click(findTestObject('smoke Suit/HomePage/logo_confirmPage'))

