package com.mso.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class ExistingMortgagesPage extends PageBase
{

	public ExistingMortgagesPage(WebDriver driver)
	{
		super(driver);
		
	}

	@FindBy(how=How.XPATH,using="//button[@type='button']")
	WebElement AddButton;
	
	@FindBy(how=How.XPATH,using=".//*[@id='balanceOwing']")
	WebElement CurrentBalance;
	
	@FindBy(how=How.XPATH,using=".//*[@id='monthlyPayment']")
	WebElement MonthlyRepayment;
	
	@FindBy(how=How.XPATH,using=".//*[@id='monthlyPayment']")
	WebElement Repaid;
	
	@FindBy(how=How.XPATH,using=".//*[@id='lender']")
	WebElement dropDown;
	
	@FindBy(how=How.XPATH,using=".//*[@id='accountNumber']")
	WebElement MortgageAccount;
	
	@FindBy(how=How.XPATH,using=".//*[@id='accountNumber']")
	WebElement SaveButton;
	
	
	public ExistingMortgagesPage Add()
	{
		AddButton.click();
		return new ExistingMortgagesPage (driver);
		
	}	
	
	public ExistingMortgagesPage OutStandingBalance()
	{
		CurrentBalance.sendKeys("30000");
		return new ExistingMortgagesPage (driver);		
	}	
	
	public ExistingMortgagesPage MonthlyPayment()
	{
		MonthlyRepayment.sendKeys("450");
		return new ExistingMortgagesPage (driver);	
	}
	
	public ExistingMortgagesPage MortgageRepaid()
	{
		Repaid.click();
		return new ExistingMortgagesPage (driver);	
	}
	
	public ExistingMortgagesPage selectValue1(String sValue)
	   {
	     Select oSelect = new Select(dropDown);
	     oSelect.selectByVisibleText(sValue);
	     return new ExistingMortgagesPage (driver);
	   }		 
	
	public ExistingMortgagesPage AccountNumber()
	{
		MortgageAccount.sendKeys("Test12345");
		return new ExistingMortgagesPage (driver);	
	}
	
	public SubmitDecisionPage SaveButton()
	{
		SaveButton.click();
		return new SubmitDecisionPage (driver);	
	}
	
}
