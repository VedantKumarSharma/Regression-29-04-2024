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

WebUI.verifyElementPresent(findTestObject('smoke Suit/HomePage/Logo_hp'), 0)

WebUI.verifyElementPresent(findTestObject('smoke Suit/HomePage/Departamentos'), 0)

WebUI.verifyElementPresent(findTestObject('smoke Suit/HomePage/brand1_HP'), 0)

WebUI.verifyElementPresent(findTestObject('smoke Suit/HomePage/brand2_HP'), 0)

WebUI.verifyElementPresent(findTestObject('smoke Suit/HomePage/brand3_HP'), 0)

WebUI.verifyElementPresent(findTestObject('smoke Suit/HomePage/brand4_HP'), 0)

WebUI.verifyElementPresent(findTestObject('smoke Suit/HomePage/mesa_de_regalos_HP'), 0)

WebUI.verifyElementPresent(findTestObject('smoke Suit/HomePage/credito_HP'), 0)

WebUI.verifyElementPresent(findTestObject('smoke Suit/HomePage/MainSearchbar_HP'), 0)

WebUI.verifyElementPresent(findTestObject('smoke Suit/HomePage/Iniciar sesion'), 0)

WebUI.verifyElementPresent(findTestObject('smoke Suit/HomePage/Tiendas_HP'), 0)

WebUI.verifyElementPresent(findTestObject('smoke Suit/HomePage/Ayuda_HP'), 0)
