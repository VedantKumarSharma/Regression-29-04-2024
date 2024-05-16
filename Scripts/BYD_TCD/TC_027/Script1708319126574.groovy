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

WebUI.verifyElementPresent(findTestObject('smoke Suit/BYD/BYD_HP/BYD_Header_Logo_img_HP'), 0)

WebUI.verifyElementPresent(findTestObject('smoke Suit/BYD/BYD_PDP/Dolphin_PDP/Dolphin_Title_img_BYD_PDP'), 0)

WebUI.verifyElementPresent(findTestObject('smoke Suit/BYD/BYD_PDP/Dolphin_PDP/Dolphin_Car_img_BYD_PDP'), 0)

WebUI.verifyElementPresent(findTestObject('smoke Suit/BYD/BYD_PDP/Dolphin_PDP/Discription_BYD_PDP'), 0)

WebUI.verifyElementPresent(findTestObject('smoke Suit/BYD/BYD_PDP/Dolphin_PDP/Performance_BYD_PDP'), 0)

WebUI.verifyElementPresent(findTestObject('smoke Suit/BYD/BYD_PDP/Dolphin_PDP/Car_Price_BYD_PDP'), 0)

WebUI.verifyElementPresent(findTestObject('smoke Suit/BYD/BYD_PDP/Visible_ExteriorCar_IMG_BYD_PDP'), 0)

WebUI.verifyElementPresent(findTestObject('smoke Suit/BYD/BYD_PDP/Available_Exterior_Color_BYD_PDP'), 0)

WebUI.verifyElementPresent(findTestObject('smoke Suit/BYD/BYD_PDP/Visible_InteriorCar_IMG_BYD_PDP'), 0)

WebUI.verifyElementPresent(findTestObject('smoke Suit/BYD/BYD_PDP/Visible_TechnologyCar_IMG_BYD_PDP'), 0)

WebUI.verifyElementPresent(findTestObject('smoke Suit/BYD/BYD_PDP/Download_PDF_button_BYD_PDP'), 0)

WebUI.verifyElementPresent(findTestObject('smoke Suit/BYD/BYD_PDP/CarPrice_BYD_PDP'), 0)

WebUI.verifyElementPresent(findTestObject('smoke Suit/BYD/BYD_PDP/CarSpecifications_BYD_PDP'), 0)

