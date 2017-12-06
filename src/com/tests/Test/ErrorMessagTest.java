package com.tests.Test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.mso.pages.ErrorPage;

public class ErrorMessagTest extends TestBase {
	
	
	@Test
	public void testUnsuccessfulLogin()
	{
		login.loginExpectingError("Test", "password");
		ErrorPage ep = new ErrorPage(driver);
		Assert.assertEquals(ep.getErrorText(), "Login was unsuccessful. Please correct the errors and try again.The username and/or password are incorrect. Please try again.");
	}

}
