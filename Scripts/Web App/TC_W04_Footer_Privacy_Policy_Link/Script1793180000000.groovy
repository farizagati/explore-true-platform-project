import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

// Expected to FAIL while BUG-09 exists: footer links still point to "#".
WebUI.openBrowser('')
WebUI.maximizeWindow()
WebUI.navigateToUrl(GlobalVariable.baseUrlWeb + '#/login')
WebUI.scrollToElement(findTestObject('ClinicFlow/Footer/lnk_privacyPolicy'), 10)
WebUI.click(findTestObject('ClinicFlow/Footer/lnk_privacyPolicy'))
WebUI.delay(1)
String currentUrl = WebUI.getUrl()
WebUI.verifyMatch(currentUrl, '.*privacy.*', true)
WebUI.closeBrowser()
