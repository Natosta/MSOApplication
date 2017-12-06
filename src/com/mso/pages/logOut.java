package com.mso.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class logOut extends PageBase {
	
	
	
	public logOut (WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(how=How.ID,using="logout")
	WebElement adminLogOut;
	
	
	
	public HomePage logOut()
	{
		adminLogOut.click();
		return new HomePage(driver);
	}
	
	
}
