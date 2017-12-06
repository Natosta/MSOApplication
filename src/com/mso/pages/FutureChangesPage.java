package com.mso.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class FutureChangesPage extends PageBase
{

	public FutureChangesPage(WebDriver driver) 
	{
		super(driver);
		
	}
	 @FindBy(how=How.XPATH,using=".//*[@id='changesExpectedNo']")
	  WebElement RadioButton;
	 
	 @FindBy(how=How.XPATH,using=".//*[@id='viewContainer']/div/div[2]/mso-dip-footer-nav/div/div[1]/a/span[1]")
	  WebElement ExistingMortgage;
	 
	 
	 public FutureChangesPage CheckBox()
		{
			RadioButton.click();
			return new  FutureChangesPage (driver);
		}
		
	 public ExistingMortgagesPage ProgressButton()
		{
		 ExistingMortgage.click();
			return new  ExistingMortgagesPage (driver);
		}
	 
}
