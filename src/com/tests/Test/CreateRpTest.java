package com.tests.Test;

import org.testng.annotations.Test;

import com.mso.pages.AddNewProvider;
import com.mso.pages.ManageProviders;

public class CreateRpTest extends TestBase
{
		
	
	
			
	
			@Test
			public void createNewRP() throws Exception
			{
				login.login("Ken Dev/QA PM", "7xA[+c4Bz1D[}t");
				ManageProviders providers = new ManageProviders(driver);
				providers.clickOnManageProvidersLink();
				providers.clickaddProviderbtn();
			
				
				AddNewProvider details = new AddNewProvider(driver);
			//	details.setEmail("Kenneth.Ichenwo@hca.gsi.gov.uk");
			//	details.setAddNewProviderDetails("23244510", "23244510");
				
				
			
			
				
				
			}
	
}
