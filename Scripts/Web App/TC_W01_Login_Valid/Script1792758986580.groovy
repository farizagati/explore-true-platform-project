import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')
WebUI.maximizeWindow()
WebUI.navigateToUrl(GlobalVariable.baseUrlWeb + '#/login')
WebUI.setText(findTestObject('ClinicFlow/Login/input_email'), GlobalVariable.memberEmail)
WebUI.setText(findTestObject('ClinicFlow/Login/input_password'), GlobalVariable.memberPassword)
WebUI.click(findTestObject('ClinicFlow/Login/btn_login'))
WebUI.verifyElementVisible(findTestObject('ClinicFlow/Navbar/btn_logout'))
WebUI.verifyElementText(findTestObject('ClinicFlow/Navbar/txt_userProfile'), 'Johny Member (member)')
WebUI.verifyElementVisible(findTestObject('ClinicFlow/Navbar/lnk_bookAppointment'))
WebUI.closeBrowser()