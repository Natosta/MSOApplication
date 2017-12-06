package com.mso.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ForgottonPassword extends PageBase
{
	
		@FindBy(how=How.CSS,using="#mainCol>h1")
		WebElement forgottonPassLabel;
		
		@FindBy(how=How.NAME,using="UserName")
		WebElement forgottonUserName;
		
		@FindBy(how=How.ID,using="EmailAddress")
		WebElement forgottonEmail;
		
		@FindBy(how=How.ID,using="btnSaveUser")
		WebElement forgottonSubmitButton;
		
		@FindBy(how=How.CSS,using="div[id='tenantServices']")
		WebElement forgottonDetailsContactDetails;
	
	
		
	
	
		public ForgottonPassword(WebDriver driver)
		{
			super(driver);
		}
		
		public ForgottonPassword typeDetails(String username, String emailaddress)
		{
			forgottonUserName.sendKeys(username);
			forgottonEmail.sendKeys(emailaddress);
			forgottonSubmitButton.click();
			
			return new ForgottonPassword(driver);
		}
		
		public void submit_forGottonDetails()
		{
			forgottonSubmitButton.click();
		}
		
		public String forgotContactDetailsText()
		{
			return forgottonDetailsContactDetails.getText();
			
		}
	
	
}
