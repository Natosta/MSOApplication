package com.tests.Test;

import org.testng.annotations.Test;

import com.mso.pages.LinkStatus;

public class LinkStatusTest extends TestBase 
{
		
	
			
			@Test
			public void verifyLinksStatus()
			{
				login.login("KenPM-SR", "saDnHZb2:c3k:a");
				LinkStatus links = new LinkStatus(driver);
				links.verify_link_status();
				
												
			}
}
