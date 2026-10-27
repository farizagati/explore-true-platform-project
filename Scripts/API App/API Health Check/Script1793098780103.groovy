import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import internal.GlobalVariable

def request = findTestObject('MockEcommerceAPI/GetHealth')
request.setRestUrl("${GlobalVariable.baseUrlApi}/api/health")
request.setHttpHeaderProperties([
    new TestObjectProperty('x-course-token', ConditionType.EQUALS, 'farizagati-open-api-test')
])

def response = WS.sendRequest(request)
WS.verifyResponseStatusCode(response, 200)
WS.verifyElementPropertyValue(response, 'status', 'ok')
WS.verifyElementPropertyValue(response, 'message', 'Mock API infrastructure is ready')