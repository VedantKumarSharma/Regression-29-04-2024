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

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.URL)

WebUI.verifyElementPresent(findTestObject('smoke Suit/HomePage/BYD_HP'), 0)

WebUI.callTestCase(findTestCase('smoke suit/CommonMethods/SearchForAProduct_search'), [('searchTerm') : 'BYD'], FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementNotChecked(findTestObject('smoke Suit/BYD/BYD_HP/Subcribe section/CheckBox/CheckboxDolphin_BYD_HP'), 0)

WebUI.check(findTestObject('smoke Suit/BYD/BYD_HP/Subcribe section/CheckBox/CheckboxDolphin_BYD_HP'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementChecked(findTestObject('smoke Suit/BYD/BYD_HP/Subcribe section/CheckBox/CheckboxDolphin_BYD_HP'), 0)

WebUI.verifyElementPresent(findTestObject('smoke Suit/BYD/BYD_HP/Subcribe section/Nombre_BYD_HP'), 0)

WebUI.setText(findTestObject('smoke Suit/BYD/BYD_HP/Subcribe section/Nombre_BYD_HP'), 'abc')

WebUI.verifyElementPresent(findTestObject('smoke Suit/BYD/BYD_HP/Subcribe section/PrimerApellido_BYD_HP'), 0)

WebUI.setText(findTestObject('smoke Suit/BYD/BYD_HP/Subcribe section/PrimerApellido_BYD_HP'), 'xyz')

WebUI.verifyElementPresent(findTestObject('smoke Suit/BYD/BYD_HP/Subcribe section/SegundoApellido_BYD_HP'), 0)

WebUI.setText(findTestObject('smoke Suit/BYD/BYD_HP/Subcribe section/SegundoApellido_BYD_HP'), 'pqr')

WebUI.verifyElementPresent(findTestObject('smoke Suit/BYD/BYD_HP/Subcribe section/IngresaTuCorreo_BYD_HP'), 0)

WebUI.setText(findTestObject('smoke Suit/BYD/BYD_HP/Subcribe section/IngresaTuCorreo_BYD_HP'), 'aqz@gmail.com')

WebUI.verifyElementPresent(findTestObject('smoke Suit/BYD/BYD_HP/Subcribe section/TelefonoCellular_BYD_HP'), 0)

WebUI.setText(findTestObject('smoke Suit/BYD/BYD_HP/Subcribe section/TelefonoCellular_BYD_HP'), '9817231298')

WebUI.check(findTestObject('smoke Suit/BYD/BYD_HP/Subcribe section/Accept_termAndCondition_BYD_HP'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('smoke Suit/BYD/BYD_HP/Subcribe section/Subcribe_button_BYD_HP'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('smoke Suit/BYD/BYD_HP/Subcribe section/Subcribe_button_BYD_HP'), FailureHandling.STOP_ON_FAILURE)

