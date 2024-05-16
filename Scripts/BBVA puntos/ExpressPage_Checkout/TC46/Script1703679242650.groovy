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

WebUI.callTestCase(findTestCase('smoke suit/CommonMethods/SearchForAProduct_search'), [('searchTerm') : 'jeans'], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('smoke Suit/HomePage/FirstProduct_plp'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('smoke Suit/PDPPage/Size1_PDP'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('PDPPage/AddToCart_pdp'))

WebUI.click(findTestObject('smoke Suit/HomePage/Cart_header'))

WebUI.click(findTestObject('smoke Suit/CartPage/BuyButton_Cart'))

WebUI.click(findTestObject('smoke Suit/OPCPage/paymentMethod_change_OPC'))

WebUI.click(findTestObject('smoke Suit/OPCPage/paymentMethod_button1_OPC'))

WebUI.click(findTestObject('smoke Suit/OPCPage/PuntosCard_paymentCard_PopUp_OPC'))

WebUI.setText(findTestObject('smoke Suit/OPCPage/OPCPage/enterCardCVV_OPC'), '243')

WebUI.setText(findTestObject('smoke Suit/OPCPage/OPCPage/enterCardExpire_OPC'), '1226')

WebUI.click(findTestObject('smoke Suit/OPCPage/OPCPage/Continue_OPC'))

WebUI.click(findTestObject('smoke Suit/OPCPage/UsePuntosCheckbox_OPC'))

WebUI.verifyElementPresent(findTestObject('smoke Suit/OPCPage/n_de_Descuento_Text_OPC'), 0)

WebUI.click(findTestObject('smoke Suit/OPCPage/OPCPage/Final_comparar_OPC'))

WebUI.verifyElementPresent(findTestObject('smoke Suit/ConfirmationPage/Card_Img_CP'), 0)

WebUI.verifyElementPresent(findTestObject('smoke Suit/ConfirmationPage/BBVAputos_IMG_CP'), 0)

WebUI.verifyElementPresent(findTestObject('smoke Suit/ConfirmationPage/BBVAputos_IMG_CP'), 0)

WebUI.verifyElementText(findTestObject('smoke Suit/ConfirmationPage/Detalle_de_puntos_BBVA_confirmPage'), 'Detalle de puntos BBVA')

WebUI.verifyElementPresent(findTestObject('smoke Suit/ConfirmationPage/Saldo_anterior_title_CP'), 0)

WebUI.verifyElementPresent(findTestObject('smoke Suit/ConfirmationPage/Monto_utilizado_title_CP'), 0)

WebUI.verifyElementPresent(findTestObject('smoke Suit/ConfirmationPage/Saldo_actual_CP'), 0)

WebUI.verifyElementPresent(findTestObject('smoke Suit/ConfirmationPage/Total_(IVA incluido)_CP'), 0)

WebUI.verifyElementPresent(findTestObject('smoke Suit/ConfirmationPage/puntos_before_purchase_CP'), 0)

WebUI.verifyElementPresent(findTestObject('smoke Suit/ConfirmationPage/puntos_Remaining_CP'), 0)

WebUI.verifyElementPresent(findTestObject('smoke Suit/ConfirmationPage/puntos_Used_CP'), 0)

