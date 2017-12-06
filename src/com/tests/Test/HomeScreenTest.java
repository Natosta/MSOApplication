package com.tests.Test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.mso.pages.HomePage;

public class HomeScreenTest extends TestBase 
{
	
	
			
		@Test
	/*	public void verifyHomePageSources()
		{
			boolean homeResult = login.homePageText() != null;
			Assert.assertTrue(homeResult, "Text does not match");
			
								
		}
		
	*/
		public void HomePage()
		{
		HomePage Home = PageFactory.initElements(driver, HomePage.class);
	    Home.CreateNewCase();
		}
		
		
		

}
