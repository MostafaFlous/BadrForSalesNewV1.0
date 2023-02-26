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

WebUI.navigateToUrl('https://badrforsales-test.souqalbadr.top/login')

WebUI.setText(findTestObject('Object Repository/AddNewItem/Page_/input__user_name'), 'flous')

WebUI.setEncryptedText(findTestObject('Object Repository/AddNewItem/Page_/input__password'), 'aeHFOx8jV/A=')

WebUI.click(findTestObject('Object Repository/AddNewItem/Page_/button_'))

WebUI.click(findTestObject('Object Repository/AddNewItem/Page_albadr home page/a_'))

WebUI.click(findTestObject('Object Repository/AddNewItem/Page_albadr home page/a__1'))

WebUI.click(findTestObject('Object Repository/AddNewItem/Page_/a_'))

WebUI.setText(findTestObject('Object Repository/AddNewItem/Page_/input__item_name'), 'زيت اذره البوادى')

WebUI.setText(findTestObject('Object Repository/AddNewItem/Page_/input__pay_price'), '60')

WebUI.setText(findTestObject('Object Repository/AddNewItem/Page_/input__sale_price'), '80')

WebUI.click(findTestObject('Object Repository/AddNewItem/Page_/div_'))

WebUI.setText(findTestObject('Object Repository/AddNewItem/Page_/input__lowest_price'), '70')

WebUI.click(findTestObject('Object Repository/AddNewItem/Page_/div__1'))

WebUI.click(findTestObject('Object Repository/AddNewItem/Page_/div__1'))

WebUI.click(findTestObject('Object Repository/AddNewItem/Page_/div__1_2'))

WebUI.click(findTestObject('Object Repository/AddNewItem/Page_/div__1_2'))

WebUI.click(findTestObject('Object Repository/AddNewItem/Page_/div__1_2_3'))

WebUI.click(findTestObject('Object Repository/AddNewItem/Page_/div__1_2_3'))

WebUI.click(findTestObject('Object Repository/AddNewItem/Page_/div__1_2_3'))

WebUI.click(findTestObject('Object Repository/AddNewItem/Page_/span_'))

WebUI.selectOptionByValue(findTestObject('Object Repository/AddNewItem/Page_/select_'), '660', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/AddNewItem/Page_/select_'), '660', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/AddNewItem/Page_/select_'), '660', true)

WebUI.deselectOptionByValue(findTestObject('Object Repository/AddNewItem/Page_/select_'), '662', true)

WebUI.click(findTestObject('Object Repository/AddNewItem/Page_/a__1'))

WebUI.selectOptionByValue(findTestObject('Object Repository/AddNewItem/Page_/select_'), '662', true)

WebUI.click(findTestObject('Object Repository/AddNewItem/Page_/a__1_2'))

WebUI.selectOptionByValue(findTestObject('Object Repository/AddNewItem/Page_/select_'), '664', true)

WebUI.click(findTestObject('Object Repository/AddNewItem/Page_/div_a'))

WebUI.click(findTestObject('Object Repository/AddNewItem/Page_/div__1_2_3_4'))

WebUI.click(findTestObject('Object Repository/AddNewItem/Page_/span__1'))

WebUI.selectOptionByValue(findTestObject('Object Repository/AddNewItem/Page_/select__1'), '1', true)

WebUI.click(findTestObject('Object Repository/AddNewItem/Page_/div__1_2_3_4'))

WebUI.click(findTestObject('Object Repository/AddNewItem/Page_/a__1_2_3'))

WebUI.selectOptionByValue(findTestObject('Object Repository/AddNewItem/Page_/select__1_2'), '2', true)

WebUI.click(findTestObject('Object Repository/AddNewItem/Page_/button__1'))

WebUI.click(findTestObject('Object Repository/AddNewItem/Page_/span__1'))

WebUI.selectOptionByValue(findTestObject('Object Repository/AddNewItem/Page_/select__1_2'), '1', true)

WebUI.click(findTestObject('Object Repository/AddNewItem/Page_/th_'))

WebUI.click(findTestObject('Object Repository/AddNewItem/Page_/button__1_2'))

WebUI.click(findTestObject('Object Repository/AddNewItem/Page_/button__1_2_3'))

WebUI.rightClick(findTestObject('Object Repository/AddNewItem/Page_/ul_'))

WebUI.verifyElementText(findTestObject('Object Repository/AddNewItem/Page_/ul_'), 'تم حفظ البيانات بنجاح')

WebUI.closeBrowser()

