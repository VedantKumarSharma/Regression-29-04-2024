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
import org.apache.commons.lang.RandomStringUtils as RandomStringUtils
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil

WebUI.callTestCase(findTestCase('smoke suit/CommonMethods/SearchForAProduct_search'), [('searchTerm') : 'pantalon'], FailureHandling.STOP_ON_FAILURE)

a = GenerateRandomEmail()

System.out.println(a)

WebUI.click(findTestObject('smoke Suit/PLPPage/product-2-DiscountPrice_PLP'))

WebUI.verifyElementClickable(findTestObject('smoke Suit/PDPPage/ProductName_PDP'))

WebUI.verifyElementClickable(findTestObject('smoke Suit/PDPPage/ProductID_pdp'))

WebUI.verifyElementClickable(findTestObject('smoke Suit/PDPPage/discountPrice_PDP'))

WebUI.verifyElementClickable(findTestObject('smoke Suit/PDPPage/Colour1_PDP'))

WebUI.verifyElementClickable(findTestObject('smoke Suit/PDPPage/Alternate_Img_pdp'))

WebUI.verifyElementClickable(findTestObject('smoke Suit/PDPPage/AddToCart_PDP'))

WebUI.verifyElementClickable(findTestObject('smoke Suit/PDPPage/Detail_PDP'))

WebUI.verifyElementClickable(findTestObject('smoke Suit/PDPPage/breadCrumb_pdp'))

def GenerateRandomEmail() {
    String firstName = 'automation'

    String generatedstring = RandomStringUtils.randomAlphabetic(8)

    String Email = (firstName + generatedstring) + '@digisprint.com'

    KeywordUtil.logInfo(Email)

    return Email
}

