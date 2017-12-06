package com.mso.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class TestLoginPage extends PageBase
{
	
	WebDriver driver;
	
	public TestLoginPage(WebDriver driver)
	{
		super(driver);
	}
	
	
	@FindBy(how=How.CSS,using="input#UserName")
	WebElement userName;
	
	@FindBy(how=How.CSS,using="input#Password")
	WebElement password;
	
	
	@FindBy(how=How.LINK_TEXT,using="Forgotten Password?")
	WebElement forgotton_Password;
	
	@FindBy(how=How.LINK_TEXT,using="Forgotten Username")
	WebElement Forgotten_Username;
	
	@FindBy(how=How.CSS,using="//span[for='Password']")
	WebElement invalidPassword;
	
	@FindBy(how=How.CSS,using="input#Login")
	WebElement Login_button;
	
	
	public HomePage login_to_nrosh(String username, String passWord)
	{
		userName.sendKeys(username);
	//	password.sendKeys(password);
		//Forgotten password.click();
		Login_button.click();
		return new HomePage(driver);
		
	}
	
	public HomePage clickOnSignInButton(String username, String password)
	{
		Login_button.click();
		return new HomePage(driver);
	}
	
	public TestLoginPage loginAsInvalidUser(String username, String ipassword)
	{
		userName.sendKeys(username);
		password.sendKeys(ipassword);
		//submit_button.click();
		return new TestLoginPage(driver);
	}
	

































}
