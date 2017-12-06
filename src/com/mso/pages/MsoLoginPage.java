package com.mso.pages;


import java.util.logging.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.tests.Test.TestBase;

public class MsoLoginPage extends PageBase
{
	
   static Logger log = Logger.getLogger(TestBase.class.getName());
	public MsoLoginPage(WebDriver driver)
	{
		super(driver);
	}
	
	
	
	@FindBy(how=How.ID,using="username")
	WebElement userNameField;
	
	@FindBy(how=How.ID,using="password")
	WebElement passwordField;
	
	@FindBy(how=How.XPATH, using="//a[@ng-click='login()']")
	WebElement HomePageLoginButton;
	
	
	// @FindBy(how=How.XPATH,using=".//*[@id='viewContainer']/div/div[1]/div/form/div[1]/div/div[2]/fieldset/div[2]/div[4]/div/a")
	
	/*
	@FindBy(how=How.ID,using="RememberMe")
	WebElement rememberMeCheckbox;
	
	@FindBy(how=How.ID,using="submit")
	WebElement submitButton;
	
	@FindBy(how=How.LINK_TEXT,using="Forgotten Password?")
	WebElement forgottonPassWord;
	
	@FindBy(how=How.CSS,using="#user-welcome>span>strong")
	WebElement welcomeText;
	
	@FindBy(how=How.CSS,using="div[id='validationSummaryErrors']")
	WebElement errorText;
	
	@FindBy(how=How.XPATH,using="//ul[@id='menu']")
	List<WebElement> links_home;
	
	@FindBy(how=How.XPATH,using="//div[@id='site']")
	WebElement sources_home_screen;
	
	@FindBy(how=How.XPATH,using="//footer")
	WebElement footer;
	
	*/
	
	// Set password in password textbox
	
	
	
	public MsoLoginPage setUserName(String name)
	{
		
		userNameField.sendKeys(name);
		
		return new MsoLoginPage(driver);
	}
	
	
	public MsoLoginPage setPassword(String password)
	{
		passwordField.sendKeys(password);
		
		return new MsoLoginPage(driver);
	}
	
	
	
	public  HomePage login(String username, String password)
	{
		log.info("Login IN to MSO");
		userNameField.sendKeys(username);
		passwordField.sendKeys(password);
		HomePageLoginButton.click();
		return new HomePage(driver);
		
	}
	
	
	private static void click() {
		// TODO Auto-generated method stub
		
	}


	public void clickOnRememberCheckBox()
	{
	//	rememberMeCheckbox.click();
	}
	
	public MsoLoginPage clickForgottonPassWordLink()
	{
	//	forgottonPassWord.click();
		return new MsoLoginPage(driver);
	}
	
	
	public HomePage clickLoginButton()
	{
	   // LoginButton.click();
		return new HomePage(driver);
	}
	
	//public boolean isLoginSuccessful(String username)
	{
	//	return welcomeText.getText().contains(username);
		
	}
	
	public HomePage loginExpectingError(String username, String password) 
	{
		userNameField.sendKeys(username);
		passwordField.sendKeys(password);
		// submitButton.click();
		return new HomePage(driver);
	}
	
	//public String getErrorText()
	{
	// 	return errorText.getText();
		
		
	}
	
	public HomePage clickOnHomeLink()
	{
	//	links_home.size();
	//	Iterator<WebElement> links = links_home.iterator();
		
	//	while(links.hasNext())
		{
		//	WebElement ele = links.next();
		//	String total_links = ele.getText();
			
		//if(total_links.equalsIgnoreCase("home"));
		//	ele.click();
		//	break;
			
		}
		
		return new HomePage(driver);
		
		
		
	
	}
	
	public HomePage homePageText()
	{
	//	sources_home_screen.getText();
		return new HomePage(driver);
	}


	public void login_to_mso(String name, String password) {
		// TODO Auto-generated method stub
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
