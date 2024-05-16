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

WebUI.click(findTestObject('smoke Suit/BYD/BYD_HP/Active_Conocelo_BYD_HP'))

WebUI.verifyElementPresent(findTestObject('smoke Suit/BYD/BYD_PDP/Visita_el_Showroom_BYD_PDP'), 0)

WebUI.click(findTestObject('smoke Suit/BYD/BYD_PDP/Visita_el_Showroom_BYD_PDP'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('smoke Suit/BYD/Visita el Showroom/Visita_el_Showroom_BreadCrumb_BYD_SR'), 0)

WebUI.verifyElementPresent(findTestObject('smoke Suit/BYD/Visita el Showroom/Ven_a_conocer_tu_próximo_auto_text_BYD_SR'), 0)

WebUI.verifyElementPresent(findTestObject('smoke Suit/BYD/Visita el Showroom/Showrrom_title_BYD_SR'), 0)

WebUI.verifyElementPresent(findTestObject('smoke Suit/BYD/Visita el Showroom/Showroom_list_container_BYD_SR'), 0)

WebUI.verifyElementPresent(findTestObject('smoke Suit/BYD/Visita el Showroom/Ver_ubicación_en_mapas_BYD_SR'), 0)

WebUI.verifyElementPresent(findTestObject('smoke Suit/BYD/Visita el Showroom/Aparta_en_linea_stickyBar_BYD_SR'), 0)

