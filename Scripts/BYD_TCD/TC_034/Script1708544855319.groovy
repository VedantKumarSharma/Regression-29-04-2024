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

WebUI.enhancedClick(findTestObject('smoke Suit/BYD/BYD_HP/Banner_Right_arrow_BYD_HP'))

WebUI.delay(0)

WebUI.enhancedClick(findTestObject('smoke Suit/BYD/BYD_HP/Banner_Right_arrow_BYD_HP'))

WebUI.delay(0)

WebUI.click(findTestObject('smoke Suit/BYD/BYD_HP/Active_Conocelo_BYD_HP'))

WebUI.enhancedClick(findTestObject('smoke Suit/BYD/BYD_PDP/Detalles_Del_Exterior_button_BYD_PDP'))

WebUI.verifyElementPresent(findTestObject('smoke Suit/BYD/BYD_PDP/Detalles_del_exterior_POP-up_BYD_PDP'), 0)

WebUI.verifyElementPresent(findTestObject('smoke Suit/BYD/BYD_PDP/Detalles_del_exterior_POP-up(car detail)_BYD_PDP'), 0)

WebUI.verifyElementPresent(findTestObject('smoke Suit/BYD/BYD_PDP/Detalles_del_exterior_POP-up(car img)_BYD_PDP'), 0)

WebUI.click(findTestObject('smoke Suit/BYD/BYD_PDP/Detalles_del_exterior_POP-up_Close_BYD_PDP'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementNotPresent(findTestObject('smoke Suit/BYD/BYD_PDP/Detalles_del_exterior_POP-up_BYD_PDP'), 0)

WebUI.verifyElementNotPresent(findTestObject('smoke Suit/BYD/BYD_PDP/Detalles_del_exterior_POP-up(car detail)_BYD_PDP'), 0)

WebUI.verifyElementNotPresent(findTestObject('smoke Suit/BYD/BYD_PDP/Detalles_del_exterior_POP-up(car img)_BYD_PDP'), 0)

