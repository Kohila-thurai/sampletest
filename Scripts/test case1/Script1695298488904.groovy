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

WebUI.navigateToUrl('https://qa-practice.netlify.app/register')

WebUI.setText(findTestObject('Object Repository/Page_QA Practice  Learn with RV/input_First Name_firstName'), 'test')

WebUI.setText(findTestObject('Object Repository/Page_QA Practice  Learn with RV/input_Last Name_lastName'), 'name')

WebUI.setText(findTestObject('Object Repository/Page_QA Practice  Learn with RV/input_Phone number_phone'), '9876543210')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_QA Practice  Learn with RV/select_Select a country.              Afgha_f92af3'), 
    'India', true)

WebUI.setText(findTestObject('Object Repository/Page_QA Practice  Learn with RV/input_Email address_emailAddress'), 'test@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_QA Practice  Learn with RV/input_Password_password'), 'iGDxf8hSRT4=')

WebUI.click(findTestObject('Object Repository/Page_QA Practice  Learn with RV/input_Password_exampleCheck1'))

WebUI.click(findTestObject('Object Repository/Page_QA Practice  Learn with RV/button_Register'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_QA Practice  Learn with RV/div_The account has been successfully created'), 
    'The account has been successfully created!')

