package com.mso.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class LoanRequirementsPage extends PageBase
{

	public LoanRequirementsPage(WebDriver driver) 
	{
		super(driver);
	
	}

	@FindBy(how=How.XPATH,using=".//*[@id='propertyLocatedtrue']")
	WebElement RadioButton;
	
	@FindBy(how=How.XPATH,using=".//*[@id='propertyType']")
	WebElement drop;
	
	@FindBy(how=How.XPATH,using=".//*[@id='totalLoanAmount']")
	WebElement LoanAmount;
	
	@FindBy(how=How.XPATH,using=".//*[@id='purchasePrice']")
	WebElement Price;
	
	@FindBy(how=How.XPATH,using=".//*[@id='mortgageTermYears']")
	WebElement Years;
	
	@FindBy(how=How.XPATH,using=".//*[@id='viewContainer']/div/div[2]/mso-dip-footer-nav/div/div[1]/a/span[1]")
	WebElement DepositeDetails;
    
	@FindBy(how=How.XPATH,using=".//*[@id='viewContainer']/div[2]/mso-pm-footer-nav/div/div[1]/a/span[1]")
	WebElement Next;
	
	public LoanRequirementsPage LoanRequirement()
	{
		RadioButton.click();
		return new LoanRequirementsPage(driver);
	}
	
	 public LoanRequirementsPage selectValue(String sValue)
	   {
	     Select oSelect = new Select(drop);
	     oSelect.selectByVisibleText(sValue);
	     return new LoanRequirementsPage (driver);
	   }		 
	
	 
	 public LoanRequirementsPage Price()
		{
			LoanAmount.sendKeys("60,000");
			return new LoanRequirementsPage(driver);
		}	
	 
	 public LoanRequirementsPage Loan()
	   {
			Price.sendKeys("100,000");
			return new LoanRequirementsPage(driver);
	   }

	 public LoanRequirementsPage Year()
	   {
			Years.sendKeys("15");
			return new LoanRequirementsPage(driver);
	   }

     public DepositDetailsPage Deposit()
       {
    	 DepositeDetails.click();
		return new DepositDetailsPage(driver);
       }
     
     public ProductSelectionPage NextButton()
     {
  	 Next.click();
		return new ProductSelectionPage (driver);
     }
}
