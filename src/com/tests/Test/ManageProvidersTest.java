package com.tests.Test;

import org.testng.annotations.Test;

import com.mso.pages.ManageProviders;

public class ManageProvidersTest extends TestBase
{
			
			
		
		@Test
		public void addProvider() throws Exception
		{
		//	boolean loginResult = login.login("Ken Dev/QA PM", "7xA[+c4Bz1D[}t")
			//						.isLoginSuccessful("Ken Dev/QA PM");
		//	Assert.assertTrue(loginResult, "Incorrect username mate, please enter a valid username");
			
			ManageProviders providers = new ManageProviders(driver);
			providers.clickOnManageProvidersLink();
			providers.clickaddProviderbtn();
			
			
			
										
									
				
		}
	
	
}
