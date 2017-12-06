package com.tests.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.mso.pages.ForgottonPassword;

public class ForgottonDetailsTest extends TestBase
{
	
		@Test
		public void retrieveDetails()
		{
			login.clickForgottonPassWordLink();
			Assert.assertEquals("- NROSH+", login.getTilte(), "This is Not the Forgotton Password screen");
			ForgottonPassword forgottenDetails;
			forgottenDetails = PageFactory.initElements(driver, ForgottonPassword.class);
			Assert.assertEquals("Please enter both your username and email address as detailed in our records and click submit.", driver.findElement(By.cssSelector(".census-intro>p")).getText());
			Assert.assertTrue(forgottenDetails.forgotContactDetailsText().contains("Homes and Communities Agency"));
			forgottenDetails.typeDetails("Ken Dev/QA PM", "Kenneth.Ichenwo@hca.gsi.gov.uk");
			
			
		}
	
	
}
