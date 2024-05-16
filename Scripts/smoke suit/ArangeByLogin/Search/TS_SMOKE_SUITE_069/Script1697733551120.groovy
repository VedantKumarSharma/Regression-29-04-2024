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

WebUI.callTestCase(findTestCase('smoke suit/CommonMethods/SearchForAProduct_search'), [('searchTerm') : GlobalVariable.rate], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('smoke Suit/PLPPage/Sortby_PLP'))

WebUI.click(findTestObject('smoke Suit/PLPPage/LowPricetoHighSortBy_PLP'))

productcardprice1 = WebUI.getText(findTestObject('smoke Suit/PLPPage/product1_cardPrice_PLP'))

productcardprice2 = WebUI.getText(findTestObject('smoke Suit/PLPPage/product2_cardPrice_PLP'))

productcardprice3 = WebUI.getText(findTestObject('smoke Suit/PLPPage/product3_cardPrice_PLP'))

if ((productcardprice1 <= productcardprice2) && (productcardprice2 <= productcardprice3)) {
    println('in sorted order arccording to first three product')
} else {
    KeywordUtil.markFailed('failed not sorted low to high')
}

WebUI.click(findTestObject('smoke Suit/PLPPage/Sortby_PLP'))

WebUI.click(findTestObject('smoke Suit/PLPPage/HighToLowPriceSortby_PLP'))

productcardprice1 = WebUI.getText(findTestObject('smoke Suit/PLPPage/product1_cardPrice_PLP'))

productcardprice2 = WebUI.getText(findTestObject('smoke Suit/PLPPage/product2_cardPrice_PLP'))

productcardprice3 = WebUI.getText(findTestObject('smoke Suit/PLPPage/product3_cardPrice_PLP'))

if ((productcardprice1 >= productcardprice2) && (productcardprice2 >= productcardprice3)) {
    println('in sorted order arccording to first three product')
} else {
    KeywordUtil.markFailed('failed not sorted high to low')
}

