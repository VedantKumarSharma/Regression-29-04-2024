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

WebUI.mouseOver(findTestObject('smoke Suit/HomePage/AfterLogin_Homepage'))

WebUI.click(findTestObject('smoke Suit/AccountManagement/MyAccountButton_Account'))

WebUI.click(findTestObject('smoke Suit/AccountManagement/DeliveryAddress_Account'))

WebUI.enhancedClick(findTestObject('smoke Suit/AccountManagement/ClickAndCollectStores_accounts'))

WebUI.click(findTestObject('smoke Suit/AccountManagement/AddClickNCollectionAddress_Account'))

WebUI.click(findTestObject('smoke Suit/AccountManagement/SelectStateClickNCollection_Account'))

WebUI.click(findTestObject('smoke Suit/AccountManagement/StateOptionClickNCollection_Account'))

WebUI.click(findTestObject('smoke Suit/AccountManagement/SelectAddressRadioButton_Account'))

WebUI.scrollToElement(findTestObject('smoke Suit/AccountManagement/KeepButtonClickNCollection_Account'), 0)

WebUI.click(findTestObject('smoke Suit/AccountManagement/KeepButtonClickNCollection_Account'))

WebUI.click(findTestObject('smoke Suit/AccountManagement/ClickAndCollectStores_accounts'))

WebUI.verifyElementPresent(findTestObject('smoke Suit/AccountManagement/ClickNCollectionFirstAddress_Account'), 0)

WebUI.verifyElementPresent(findTestObject('smoke Suit/AccountManagement/liverpoolSatellite_clickAndCollect_address'), 0)

////////
WebUI.click(findTestObject('smoke Suit/AccountManagement/liverpoolSatellite_clickAndCollect_address'))

WebUI.click(findTestObject('smoke Suit/AccountManagement/liverpoolSatellite_clickAndCollect_eliminar_AM'))

WebUI.click(findTestObject('smoke Suit/AccountManagement/acceptar_RemoveAdress_AM'))
