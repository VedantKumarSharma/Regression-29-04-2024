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

WebUI.navigateToUrl(GlobalVariable.URLQA2)

WebUI.callTestCase(findTestCase('smoke suit/CommonMethods/login_odtaqab'), [:], FailureHandling.OPTIONAL)

WebUI.callTestCase(findTestCase('smoke suit/CommonMethods/EliminarProduct1_whislistFrom_HP_LOGEDIN'), [:], FailureHandling.OPTIONAL)

WebUI.callTestCase(findTestCase('smoke suit/CommonMethods/SearchForAProduct_search'), [('searchTerm') : 'iphone'], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('smoke Suit/HomePage/FirstProduct_plp'))

WebUI.scrollToElement(findTestObject('smoke Suit/PDPPage/ComplementaryServices_Div_PDP'), 0)

WebUI.click(findTestObject('smoke Suit/PDPPage/ComplementaryServices_Div_option1_RadioButton_PDP'), FailureHandling.STOP_ON_FAILURE)

WebUI.enhancedClick(findTestObject('smoke Suit/PDPPage/AddToCart_PDP'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('smoke Suit/HomePage/bag_header_HP'))

WebUI.click(findTestObject('smoke Suit/CartPage/Product1_AddToWishlist_CartPage'))

WebUI.click(findTestObject('smoke Suit/CartPage/WishList_option1_cartpage'))

WebUI.verifyElementPresent(findTestObject('smoke Suit/CartPage/AddedToWishlist_AlertPOP'), 0)

WebUI.verifyElementNotPresent(findTestObject('smoke Suit/CartPage/Product1_title_celluarProtection_CartPage'), 0)

WebUI.mouseOver(findTestObject('smoke Suit/HomePage/AfterLogin_Homepage'))

WebUI.click(findTestObject('smoke Suit/HomePage/Wishlist_MouseOverProfileName_HP'))

WebUI.click(findTestObject('smoke Suit/WishListPage/wishlistOption1_WP'))

WebUI.verifyElementPresent(findTestObject('smoke Suit/WishListPage/VerOpcionesDeCompra_button_Wp'), 0)

WebUI.click(findTestObject('smoke Suit/WishListPage/VerOpcionesDeCompra_button_Wp'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

WebUI.callTestCase(findTestCase('smoke suit/CommonMethods/assertProductDetails_pdp'), [:], FailureHandling.STOP_ON_FAILURE)
