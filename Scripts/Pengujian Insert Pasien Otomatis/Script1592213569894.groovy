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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://testingjarkom.000webhostapp.com/admin/login.php')

WebUI.setText(findTestObject('Object Repository/Page_Login/input_Login Akun_username'), 'admin')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login/input_Login Akun_password'), '8SQVv/p9jVScEs4/2CZsLw==')

WebUI.click(findTestObject('Object Repository/Page_Login/button_Login'))

if (true) {
    WebUI.navigateToUrl('https://testingjarkom.000webhostapp.com/admin/dashboard.php')
} else {
    WebUI.navigateToUrl('https://testingjarkom.000webhostapp.com/admin/login.php')
}

WebUI.click(findTestObject('Object Repository/Page_Sistem Antrian Disabilitas/a_Pasien'))

WebUI.click(findTestObject('Object Repository/Page_Sistem Antrian Disabilitas/a_Tambah'))

WebUI.setText(findTestObject('Object Repository/Page_Sistem Antrian Disabilitas/input_Nama_name'), nama)

WebUI.setText(findTestObject('Object Repository/Page_Sistem Antrian Disabilitas/input_Nomor Rekam Medis_medical_record_number'), 
    nomerRekam)

WebUI.setText(findTestObject('Object Repository/Page_Sistem Antrian Disabilitas/input_Nomor Telepon_phone_number'), noTelp)

WebUI.setText(findTestObject('Object Repository/Page_Sistem Antrian Disabilitas/input_Tanggal Lahir_dob'), tglLahir)

WebUI.setText(findTestObject('Object Repository/Page_Sistem Antrian Disabilitas/textarea_Alamat_address'), alamat)

WebUI.click(findTestObject('Object Repository/Page_Sistem Antrian Disabilitas/label_Disabilitas'))

WebUI.click(findTestObject('Object Repository/Page_Sistem Antrian Disabilitas/button_Simpan'))

index_pasien = WebUI.getUrl()

WebUI.verifyMatch(index_pasien, '"https://testingjarkom.000webhostapp.com/admin/patients/index.php"', false)

