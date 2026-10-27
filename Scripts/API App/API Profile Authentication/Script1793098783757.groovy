import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import internal.GlobalVariable

def request = findTestObject('MockEcommerceAPI/GetProfile')
request.setRestUrl("${GlobalVariable.baseUrlApi}/api/profile")
request.setHttpHeaderProperties([
    new TestObjectProperty('x-course-token', ConditionType.EQUALS, 'farizagati-open-api-test'),
    new TestObjectProperty('Authorization', ConditionType.EQUALS, 'Bearer auth_bearer_practice_key')
])

def response = WS.sendRequest(request)
WS.verifyResponseStatusCode(response, 200)
WS.verifyElementPropertyValue(response, 'data.id', 99)
WS.verifyElementPropertyValue(response, 'data.role', 'QA_Master')
WS.verifyElementPropertyValue(response, 'data.status', 'Active')