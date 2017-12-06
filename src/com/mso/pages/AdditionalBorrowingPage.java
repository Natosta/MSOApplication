package com.mso.pages;

import java.util.logging.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

import com.tests.Test.TestBase;

public class AdditionalBorrowingPage extends PageBase
{
	static Logger log = Logger.getLogger(TestBase.class.getName());
	public AdditionalBorrowingPage(WebDriver driver) 
	{
		super(driver);
		
	}
    
	
	@FindBy(how=How.XPATH,using=".//*[@id='reason']")
	WebElement drop;
	
	@FindBy(how=How.XPATH,using=".//*[@id='amount']")
	WebElement Amount;
	
	@FindBy(how=How.XPATH,using="//button[@class='btn btn-link pull-right']")
	WebElement AddButton;
	
	@FindBy(how=How.XPATH,using=".//*[@id='viewContainer']/div/div[2]/mso-dip-footer-nav/div/div[1]/a/span[1]")
	WebElement PersonaDetailsButton;
	
	
	
	public AdditionalBorrowingPage selectValue1(String sValue)
	   {
		 log.info("Additional Borrowing");
	     Select oSelect = new Select(drop);
	     oSelect.selectByVisibleText(sValue);
	     return new AdditionalBorrowingPage (driver);
	   }		 
	
	public AdditionalBorrowingPage Amount()
	{  
		log.info("Additional Amount");
		Amount.sendKeys("40000");
		return new AdditionalBorrowingPage (driver);
	}
		
	public AdditionalBorrowingPage AddButton()
	{
		log.info("Adding Amount");
		AddButton.click();
		return new AdditionalBorrowingPage (driver);
		
	}
	
	public PersonalDetailsPage PersonalDetail()
	{
		log.info("Navigating to Personal Details Page");
		PersonaDetailsButton.click();
		return new PersonalDetailsPage (driver);
	}	
}
	
