package com.mso.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AddNewProvider extends PageBase
{
	 
		public AddNewProvider(WebDriver driver)
		{
			super(driver);
		}
		
		
		@FindBy(how=How.ID,using="providerRPNumber")
		WebElement provider_registration_number;
		
		@FindBy(how=How.ID,using="RPName")
		WebElement Provider_Name;
		
		@FindBy(how=How.ID,using="Username")
		WebElement username;
		
		@FindBy(how=How.ID,using="EmailId")
		WebElement setEmailAddress;
		
		@FindBy(how=How.ID,using="btnSaveUser")
		WebElement createRPButton;
		
	//	public AddNewProvider setProviderNumber(String number)
		{
	//		provider_registration_number.sendKeys(number);
	//		return this;
		}
		
	//	public AddNewProvider setProviderName(String name)
		{
	//		Provider_Name.sendKeys(name);
	//		return this;
		}
		
	//	public AddNewProvider setUserName(String user)
		{
		//	username.sendKeys(user);
		//	return this;
		}
		
	//	public AddNewProvider setEmail(String email)
		{
	//		setEmailAddress.sendKeys(email);
		//	return this;
		}
		
		
	//	public AddNewProvider setAddNewProviderDetails(String registraion_number, String provider_name)
		{
		//	provider_registration_number.sendKeys(registraion_number);
	//		Provider_Name.sendKeys(provider_name);
			createRPButton.click();
		//	return new AddNewProvider(driver);
			
		}
		
	












}
