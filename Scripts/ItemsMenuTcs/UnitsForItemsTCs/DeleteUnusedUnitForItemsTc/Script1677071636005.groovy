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

WebUI.setText(findTestObject('Object Repository/AddNewUnitRepo/DeletUnusedUnitrepo/Page_/input__user_name'), 'flous')

WebUI.setEncryptedText(findTestObject('Object Repository/AddNewUnitRepo/DeletUnusedUnitrepo/Page_/input__password'), 'aeHFOx8jV/A=')

WebUI.click(findTestObject('Object Repository/AddNewUnitRepo/DeletUnusedUnitrepo/Page_/i__fa  fa-angle-right'))

WebUI.click(findTestObject('Object Repository/AddNewUnitRepo/DeletUnusedUnitrepo/Page_albadr home page/a_'))

WebUI.click(findTestObject('Object Repository/AddNewUnitRepo/DeletUnusedUnitrepo/Page_albadr home page/a__1'))

WebUI.click(findTestObject('Object Repository/AddNewUnitRepo/DeletUnusedUnitrepo/Page_/button_'))

WebUI.verifyAlertPresent(2)

WebUI.acceptAlert()

WebUI.closeBrowser()

