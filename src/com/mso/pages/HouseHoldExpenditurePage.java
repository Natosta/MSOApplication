package com.mso.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HouseHoldExpenditurePage extends PageBase 
{

	public HouseHoldExpenditurePage(WebDriver driver)
	{
		super(driver);
		
	}

	
  @FindBy(how=How.XPATH,using=".//*[@id='otherExpenditureAmount6']")
  WebElement House_Expenditure;
  
  @FindBy(how=How.XPATH,using=".//*[@id='viewContainer']/div/div[2]/mso-dip-footer-nav/div/div[1]/a/span[1]")
  WebElement Future_Changes;
  
  
  public HouseHoldExpenditurePage Expenditure()
	{
	  House_Expenditure.sendKeys("1800");
		return new  HouseHoldExpenditurePage (driver);
	}
  
  public FutureChangesPage FutureChangesButton()
	{
	  Future_Changes.click();
		return new  FutureChangesPage (driver);
	}
	
}
  
