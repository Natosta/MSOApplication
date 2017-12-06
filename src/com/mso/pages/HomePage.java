package com.mso.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage extends PageBase 
{
	
	
	
	
	public HomePage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(how=How.XPATH,using="//button[@class='btn btn-success btn-full btn-case']")
	WebElement createNewCase;
	
	public CreateNewCasePage CreateNewCase()
	{
		createNewCase.click();
		return new CreateNewCasePage (driver);
		
	}
	/*
	@FindBy(how=How.CSS,using="#menucontainer>ul")
	List<WebElement> links;
	
	@FindBy(how=How.CSS,using="#tenantServices")
	WebElement contactDetailsInfo;
	
	@FindBy(how=How.CSS,using="#user-welcome>span")
	WebElement welcomeMessage;
	
	@FindBy(how=How.CSS,using="div[class='box-wide welcome']>p")
	WebElement welcomeText;
	
	@FindBy(how=How.ID,using="logout")
	WebElement logOut;
	
	@FindBy(how=How.CSS,using=".census-intro>p")
	WebElement dashBoardText;
	
	@FindBy(how=How.CSS,using=".affiliates>li>a>img")
	WebElement hcaLogo;
	
	@FindBy(how=How.CSS,using="div[class='box about']>h2")
	WebElement aboutNroshText;
	
	public void myNroshLinks()
	{
		System.out.println(links.size());
		Iterator<WebElement> li = links.iterator();
		while(li.hasNext())
		{
			WebElement ele = li.next();
			String everyLinks = ele.getText();
			System.out.println(everyLinks);
			
			
		}
	}
	
	 */
	
 //	public boolean isLoginSuccessful(String username)
	{
	//	return welcomeMessage.getText().contains(username);
	}
	
 //	public MsoLoginPage logOutWeb()
	{
	//	logOut.click();
	//	return new MsoLoginPage(driver);
	}
	
 //	public String verifyContactDetails()
	{
 //		contactDetailsInfo.getText();
	//	return contactDetailsInfo.getText();
	}
	
 //	public String verifyWelcomeText()
	{
	//	return welcomeText.getText();
	}
	
	//public String verifyNroshText()
	{
	//	return aboutNroshText.getText();
	}


}
