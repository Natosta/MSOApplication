package com.mso.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class CommittedExpenditurePage extends PageBase
{

	public CommittedExpenditurePage(WebDriver driver)
    {
		super(driver);

	}

	@FindBy(how=How.XPATH,using=".//*[@id='expenditureTypeSelection']")
	WebElement ExpenditureType;
	
	@FindBy(how=How.XPATH,using="//button[@class='btn btn-link']")
	WebElement AddButton;
	
	@FindBy(how=How.XPATH,using=".//*[@id='currentBalanceOwing']")
	WebElement BalanceOwing;
	
	@FindBy(how=How.XPATH,using=".//*[@id='regularMonthlyPayment']")
	WebElement RegularMonPayment;
	
	@FindBy(how=How.XPATH,using=".//*[@id='balanceBeingPaid']")
	WebElement BalanceOnCompletion;
	
	@FindBy(how=How.XPATH,using=".//*[@id='ongoingMonthlyPayment']")
	WebElement OngoingMonthlyPayment;
	
	@FindBy(how=How.XPATH,using=".//*[@id='provider']")
	WebElement Provider;
	
	@FindBy(how=How.XPATH,using=".//*[@id='viewContainer']/div/div[2]/mso-dip-footer-nav/div/div[1]/a/span[1]")
	WebElement SaveButton;
	
	@FindBy(how=How.XPATH,using=".//*[@id='expenditureTypeSelection']")
	WebElement HouseHoldExp;
	
	
	
	public CommittedExpenditurePage selectValue1(String sValue)
	   {
	     Select oSelect = new Select(ExpenditureType);
	     oSelect.selectByVisibleText(sValue);
	     return new CommittedExpenditurePage (driver);
	   }		 
	
	public CommittedExpenditurePage Amount()
	{
		AddButton.click();
		return new CommittedExpenditurePage (driver);
	}
	
	public CommittedExpenditurePage Add()
	{
		AddButton.click();
		return new CommittedExpenditurePage (driver);
	}
	
	public CommittedExpenditurePage BalanceOwing()
	{
		BalanceOwing.sendKeys("2500");
		return new CommittedExpenditurePage (driver);
	}
	
	public CommittedExpenditurePage MonthlyPayment()
	{
		RegularMonPayment.sendKeys("250");
		return new CommittedExpenditurePage (driver);
	}
	
	public CommittedExpenditurePage BalanceCompletion()
	{
		 BalanceOnCompletion.sendKeys("250");
		return new CommittedExpenditurePage (driver);
	}
	
	public CommittedExpenditurePage OngoingPayment()
	{
		OngoingMonthlyPayment.sendKeys("250");
		return new CommittedExpenditurePage (driver);
	}
	
	public CommittedExpenditurePage ProviderOptional()
	{
		Provider.sendKeys("Test101");
		return new CommittedExpenditurePage (driver);
	}
	
	public HouseHoldExpenditurePage SaveButton()
	{
		HouseHoldExp.click();
		return new HouseHoldExpenditurePage (driver);
	}
	
}
