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


// Test case untuk filter produk berdasarkan kategori
WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://advantageonlineshopping.com/#/search/')

// Mendapatkan kategori yang dipilih dari pengguna
String kategori = "LAPTOPS"; // Ganti dengan kategori yang dipilih dari pengguna

// Switch case untuk filter produk berdasarkan kategori
switch (kategori) {
	case "LAPTOPS":
		WebUI.click(findTestObject('Object Repository/filtering/fitlering_coba/Page_Advantage Shopping/input_CATEGORIES_category'))
		WebUI.click(findTestObject('Object Repository/filtering/categories/label selected project/Page_Advantage Shopping/hp paviliun'))
	
		break;
	case "HEADPHONES":
		WebUI.click(findTestObject('Object Repository/filtering/fitlering_coba/Page_Advantage Shopping/input_LAPTOPS_category'))
		break;
	case "TABLETS":
		WebUI.click(findTestObject('Object Repository/filtering/fitlering_coba/Page_Advantage Shopping/input_TABLETS_category'))
		break;
	case "SPEAKERS":
		WebUI.click(findTestObject('Object Repository/filtering/fitlering_coba/Page_Advantage Shopping/input_SPEAKERS_category'))
		break;
	default:
		println("Kategori tidak valid.")
		break;
}
// Verifikasi apakah produk dalam kategori yang dipilih telah ditampilkan
WebUI.waitForElementVisible(findTestObject('Object Repository/data driven/h1_laptop_name'), 10)


WebUI.closeBrowser()
