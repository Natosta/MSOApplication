package com.mso.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ErrorPage extends PageBase {

	public ErrorPage(WebDriver driver) 
	{
		super(driver);
		
	}
	
	@FindBy(how=How.XPATH,using="//div[@id='validationSummaryErrors']")
	WebElement errorMsg;
	
	
	public ErrorPage getErrorText()
	{
		errorMsg.getText();
		return new ErrorPage(driver);
	}
	

}
