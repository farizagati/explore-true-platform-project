import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')
WebUI.maximizeWindow()
WebUI.navigateToUrl(GlobalVariable.baseUrlWeb + '#/login')
WebUI.setText(findTestObject('ClinicFlow/Login/input_email'), GlobalVariable.memberEmail)
WebUI.setText(findTestObject('ClinicFlow/Login/input_password'), 'PasswordSalah123')
WebUI.click(findTestObject('ClinicFlow/Login/btn_login'))
WebUI.verifyElementText(findTestObject('ClinicFlow/Login/txt_loginError'), 'Invalid email or password')
WebUI.closeBrowser()
