package com.tests.Test;

import org.testng.annotations.Test;

public class InvalidLoginTest extends TestBase
{
		
			
	@Test
	public void testInvaidLogin()
	{
		login.loginExpectingError("username1", "Password123");
		// Assert.assertEquals(login.getErrorText(),"Login was unsuccessful. Please correct the errors and try again.The username and/or password are incorrect. Please try again.");
		
	}
	
	
	
	
}
