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

WebUI.selectOptionByValue(findTestObject('Home/Page_CURA Healthcare Service/Page_CURA Healthcare Service (1)/select_Tokyo CURA Healthcare Center        _5b4107'), 
    'Seoul CURA Healthcare Center', true)

WebUI.click(findTestObject('Home/Page_CURA Healthcare Service/Page_CURA Healthcare Service (1)/input_Apply for hospital readmission_hospit_63901f'))

WebUI.click(findTestObject('Home/Page_CURA Healthcare Service/Page_CURA Healthcare Service (1)/input_Medicaid_programs'))

String date = CustomKeywords.'com.ksat.function.date.DateUtil.getTodayDate'()

WebUI.setText(findTestObject('Home/Page_CURA Healthcare Service/Page_CURA Healthcare Service (1)/input_Visit Date (Required)_visit_date'), 
    date)

WebUI.setText(findTestObject('Home/Page_CURA Healthcare Service/Page_CURA Healthcare Service (1)/textarea_Comment_comment'), 
    'Sakitnya tuh disini')

WebUI.click(findTestObject('Object Repository/Home/Page_CURA Healthcare Service/button_Book Appointment'))

WebUI.verifyElementText(findTestObject('Home/Page_CURA Healthcare Service/Page_CURA Healthcare Service/label_facility'), 
    'Seoul CURA Healthcare Center')

not_run: WebUI.verifyElementText(findTestObject('Home/Page_CURA Healthcare Service/Page_CURA Healthcare Service/label_applyforreadmission'), 
    'Yes')

not_run: WebUI.verifyElementText(findTestObject('Home/Page_CURA Healthcare Service/Page_CURA Healthcare Service/label_healtcareprogram'), 
    'Medicaid')

WebUI.verifyElementText(findTestObject('Home/Page_CURA Healthcare Service/Page_CURA Healthcare Service/label_visitdate'), 
    date)

not_run: WebUI.verifyElementText(findTestObject('Home/Page_CURA Healthcare Service/Page_CURA Healthcare Service/label_comment'), 
    'Sakitnya tuh disini')

