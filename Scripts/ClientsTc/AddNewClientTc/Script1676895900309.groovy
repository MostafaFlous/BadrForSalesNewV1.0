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

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://badrforsales-test.souqalbadr.top/login')

WebUI.setText(findTestObject('Object Repository/addNewClientRepo/Page_/Page_/input__user_name'), 'flous')

WebUI.setEncryptedText(findTestObject('Object Repository/addNewClientRepo/Page_/Page_/input__password'), 'aeHFOx8jV/A=')

WebUI.click(findTestObject('Object Repository/addNewClientRepo/Page_/Page_/button_'))

WebUI.click(findTestObject('Object Repository/addNewClientRepo/Page_/Page_albadr home page/a_'))

WebUI.click(findTestObject('Object Repository/addNewClientRepo/Page_/Page_albadr home page/a__1'))

WebUI.click(findTestObject('Object Repository/addNewClientRepo/Page_/Page_/div_'))

WebUI.click(findTestObject('Object Repository/addNewClientRepo/Page_/Page_/span_'))

WebUI.selectOptionByValue(findTestObject('Object Repository/addNewClientRepo/Page_/Page_/select_'), '0', true)

WebUI.setText(findTestObject('Object Repository/addNewClientRepo/Page_/Page_/input__client_name'), ' عبوده')

WebUI.click(findTestObject('Object Repository/addNewClientRepo/Page_/Page_/div__1'))

WebUI.setText(findTestObject('Object Repository/addNewClientRepo/Page_/Page_/input__form-control'), 'مصر')

WebUI.click(findTestObject('Object Repository/addNewClientRepo/Page_/Page_/a_'))

WebUI.selectOptionByValue(findTestObject('Object Repository/addNewClientRepo/Page_/Page_/select__1'), '63', true)

WebUI.setText(findTestObject('Object Repository/addNewClientRepo/Page_/Page_/input__address'), 'المنصورة')

WebUI.setText(findTestObject('Object Repository/addNewClientRepo/Page_/Page_/input__national_id'), '29876543219876')

WebUI.setText(findTestObject('Object Repository/addNewClientRepo/Page_/Page_/input__mobile1'), '01205323221')

WebUI.setText(findTestObject('Object Repository/addNewClientRepo/Page_/Page_/textarea__addition_data'), 'عميل موجود من قبل')

WebUI.scrollToElement(findTestObject('addNewClientRepo/Page_/button__1'), 0)

WebUI.click(findTestObject('Object Repository/addNewClientRepo/Page_/Page_/button__1'))

WebUI.verifyElementText(findTestObject('addNewClientRepo/Page_/li_ExistClientName'), 'اسم العميل موجود بالفعل')

WebUI.closeBrowser()

