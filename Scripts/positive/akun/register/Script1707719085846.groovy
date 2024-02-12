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

WebUI.navigateToUrl('https://advantageonlineshopping.com/#/')

WebUI.click(findTestObject('Object Repository/login/register/Page_Advantage Shopping/svg_CHECKOUT  (0.00)_menuUser'))

WebUI.click(findTestObject('Object Repository/login/register/Page_Advantage Shopping/a_CREATE NEW ACCOUNT'))

WebUI.setText(findTestObject('Object Repository/login/register/Page_Advantage Shopping/input__usernameRegisterPage'), 'clae123')

WebUI.click(findTestObject('Object Repository/login/register/Page_Advantage Shopping/label_Email'))

WebUI.setText(findTestObject('Object Repository/login/register/Page_Advantage Shopping/input__emailRegisterPage'), 'clae123@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/login/register/Page_Advantage Shopping/input__passwordRegisterPage'), 
    'eORqx8DpZuw=')

WebUI.click(findTestObject('Object Repository/login/register/Page_Advantage Shopping/label_Confirm password'))

WebUI.setEncryptedText(findTestObject('Object Repository/login/register/Page_Advantage Shopping/input__confirm_passwordRegisterPage'), 
    'eORqx8DpZuw=')

WebUI.setText(findTestObject('Object Repository/login/register/Page_Advantage Shopping/input_PERSONAL DETAILS_first_nameRegisterPage'), 
    'Clae')

WebUI.setText(findTestObject('Object Repository/login/register/Page_Advantage Shopping/input_- Use maximum 30 character_last_nameR_6ef033'), 
    '123')

WebUI.setText(findTestObject('Object Repository/login/register/Page_Advantage Shopping/input_- Use maximum 30 character_phone_numb_7c938a'), 
    '123')

WebUI.selectOptionByValue(findTestObject('Object Repository/login/register/Page_Advantage Shopping/select_AfganistanAlbaniaAlgeriaAmerican Sam_3cef8a'), 
    'object:177', true)

WebUI.click(findTestObject('Object Repository/login/register/Page_Advantage Shopping/label_City'))

WebUI.setText(findTestObject('Object Repository/login/register/Page_Advantage Shopping/input_Country_cityRegisterPage'), 
    'sby')

WebUI.setText(findTestObject('Object Repository/login/register/Page_Advantage Shopping/input_- Use maximum 25 character_addressReg_9e23b3'), 
    'sby')

WebUI.click(findTestObject('Object Repository/login/register/Page_Advantage Shopping/label_State  Province  Region'))

WebUI.setText(findTestObject('Object Repository/login/register/Page_Advantage Shopping/input_- Use maximum 50 character_state__pro_272a54'), 
    'sby')

WebUI.setText(findTestObject('Object Repository/login/register/Page_Advantage Shopping/input_- Use maximum 10 character_postal_cod_639c2f'), 
    '123')

WebUI.click(findTestObject('Object Repository/login/register/Page_Advantage Shopping/input_Receive exclusive offers and promotio_5c7450'))

WebUI.click(findTestObject('Object Repository/login/register/Page_Advantage Shopping/button_REGISTER'))

WebUI.closeBrowser()

