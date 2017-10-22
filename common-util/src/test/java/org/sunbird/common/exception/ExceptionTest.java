/**
 * 
 */
package org.sunbird.common.exception;

import org.junit.Assert;
import org.junit.Test;
import org.sunbird.common.responsecode.ResponseCode;

/**
 * @author Manzarul
 *
 */
public class ExceptionTest {
  
  @Test 
  public void testProjectCommonException() {
    ProjectCommonException exception = new ProjectCommonException(ResponseCode.apiKeyRequired.getErrorCode(), ResponseCode.apiKeyRequired.getErrorMessage(), ResponseCode.CLIENT_ERROR.getResponseCode());
    Assert.assertEquals(exception.getCode(), ResponseCode.apiKeyRequired.getErrorCode());
    Assert.assertEquals(exception.getMessage(), ResponseCode.apiKeyRequired.getErrorMessage());
    Assert.assertEquals(exception.getResponseCode(), ResponseCode.CLIENT_ERROR.getResponseCode());
  }

  @Test 
  public void testProjectCommonExceptionUsingSetters() {
    ProjectCommonException exception = new ProjectCommonException(ResponseCode.apiKeyRequired.getErrorCode(), ResponseCode.apiKeyRequired.getErrorMessage(), ResponseCode.CLIENT_ERROR.getResponseCode());
    Assert.assertEquals(exception.getCode(), ResponseCode.apiKeyRequired.getErrorCode());
    Assert.assertEquals(exception.getMessage(), ResponseCode.apiKeyRequired.getErrorMessage());
    Assert.assertEquals(exception.getResponseCode(), ResponseCode.CLIENT_ERROR.getResponseCode());
    exception.setCode(ResponseCode.userAlreadyExist.getErrorCode());
    exception.setMessage(ResponseCode.userAlreadyExist.getErrorMessage());
    exception.setResponseCode(ResponseCode.SERVER_ERROR.getResponseCode());
    Assert.assertEquals(exception.getCode(), ResponseCode.userAlreadyExist.getErrorCode());
    Assert.assertEquals(exception.getMessage(), ResponseCode.userAlreadyExist.getErrorMessage());
    Assert.assertEquals(exception.getResponseCode(), ResponseCode.SERVER_ERROR.getResponseCode());
  }
  
}
