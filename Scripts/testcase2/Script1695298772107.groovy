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

WebUI.navigateToUrl('https://qa-practice.netlify.app/calendar')

WebUI.click(findTestObject('Object Repository/Page_QA Practice  Learn with RV/th_Feb 2018'))

WebUI.click(findTestObject('Object Repository/Page_QA Practice  Learn with RV/th_Feb 2018'))

WebUI.click(findTestObject('Object Repository/Page_QA Practice  Learn with RV/th_Feb 2018'))

WebUI.click(findTestObject('Object Repository/Page_QA Practice  Learn with RV/th_Feb 2018'))

WebUI.click(findTestObject('Object Repository/Page_QA Practice  Learn with RV/th_Feb 2018'))

WebUI.doubleClick(findTestObject('Object Repository/Page_QA Practice  Learn with RV/th_Feb 2018'))

WebUI.click(findTestObject('Object Repository/Page_QA Practice  Learn with RV/th_Feb 2018_next available'))

WebUI.click(findTestObject('Object Repository/Page_QA Practice  Learn with RV/span'))

WebUI.click(findTestObject('Object Repository/Page_QA Practice  Learn with RV/span'))

WebUI.click(findTestObject('Object Repository/Page_QA Practice  Learn with RV/span'))

WebUI.click(findTestObject('Object Repository/Page_QA Practice  Learn with RV/button_Apply'))

WebUI.click(findTestObject('Object Repository/Page_QA Practice  Learn with RV/input_Basic Date Picker Example_calendar'))

WebUI.click(findTestObject('Object Repository/Page_QA Practice  Learn with RV/td_23'))

WebUI.click(findTestObject('Object Repository/Page_QA Practice  Learn with RV/div_Home                                   _6acd46'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_QA Practice  Learn with RV/input_Basic Date Picker Example_calendar'), 
    '')

WebUI.verifyElementText(findTestObject('Object Repository/Page_QA Practice  Learn with RV/input_Range Date Picker Example_daterange'), 
    '')

