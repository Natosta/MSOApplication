package com.mso.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class CurrentIncomePage extends PageBase
{

	public CurrentIncomePage(WebDriver driver)
	{
		super(driver);
		
	}
	
	@FindBy(how=How.XPATH,using=".//*[@id='netMonthlyIncome']")
	WebElement TotalNetIncome;
	
	@FindBy(how=How.XPATH,using=".//*[@id='mainEmploymentStatus']")
	WebElement MainEployment;
	
	@FindBy(how=How.XPATH,using=".//*[@id='incomeType']")
	WebElement IncomeType;
	
	@FindBy(how=How.XPATH,using=".//*[@id='employmentStatus']")
	WebElement EploymentStatus;
	
	@FindBy(how=How.XPATH,using=".//*[@id='employmentContract']")
	WebElement EploymentContract;
	
	@FindBy(how=How.XPATH,using=".//*[@id='viewContainer']/div/div[1]/div[3]/div[2]/form/div/div[2]/div[5]/button")
	WebElement AddButton;
    
	@FindBy(how=How.XPATH,using=".//*[@id='occupation']")
	WebElement Ocupation;
	
	@FindBy(how=How.XPATH,using=".//*[@id='employerName']")
	WebElement EploymentName;
	
	@FindBy(how=How.XPATH,using=".//*[@id='mainEmploymentYes']")
	WebElement MainEmployment;
	
	@FindBy(how=How.XPATH,using=".//*[@id='startMonth']")
	WebElement StartMonth;
	
	@FindBy(how=How.XPATH,using=".//*[@id='startYear']")
	WebElement StartYear;
	
	@FindBy(how=How.XPATH,using=".//*[@id='basicSalary']")
	WebElement BasicSalary;
	
	@FindBy(how=How.XPATH,using=".//*[@id='basicSalary-frequency']")
	WebElement BasicGross; 
	
	@FindBy(how=How.XPATH,using=".//*[@id='viewContainer']/div/div[2]/mso-dip-footer-nav/div/div[1]/a/span[1]")
	WebElement SaveButton;
    
	@FindBy(how=How.XPATH,using=".//*[@id='viewContainer']/div/div[2]/mso-dip-footer-nav/div/div[1]/a/span[1]")
	WebElement CommitedExpenditure; 
	
	
	
	
	public CurrentIncomePage Income()
	{
		TotalNetIncome.sendKeys("4800");
		return new CurrentIncomePage  (driver);
	}
	
	public CurrentIncomePage selectValue1(String sValue)
	   {
	     Select oSelect = new Select(MainEployment);
	     oSelect.selectByVisibleText(sValue);
	     return new CurrentIncomePage (driver);
	   }
	
	public CurrentIncomePage selectValue2(String sValue)
	   {
	     Select oSelect = new Select(IncomeType);
	     oSelect.selectByVisibleText(sValue);
	     return new CurrentIncomePage (driver);
	   }
	
	public CurrentIncomePage selectValue3(String sValue)
	   {
	     Select oSelect = new Select(EploymentStatus);
	     oSelect.selectByVisibleText(sValue);
	     return new CurrentIncomePage (driver);
	   }
	
	public CurrentIncomePage selectValue4(String sValue)
	   {
	     Select oSelect = new Select(EploymentContract);
	     oSelect.selectByVisibleText(sValue);
	     return new CurrentIncomePage (driver);
	   }
	
	public CurrentIncomePage Add()
	{
		AddButton.click();
		return new CurrentIncomePage  (driver);
	}
	
	public CurrentIncomePage selectValue5(String sValue)
	   {
	     Select oSelect = new Select(Ocupation);
	     oSelect.selectByVisibleText(sValue);
	     return new CurrentIncomePage (driver);
	   }
	
	public CurrentIncomePage selectValue6(String sValue)
	   {
	     Select oSelect = new Select(EploymentName);
	     oSelect.selectByVisibleText(sValue);
	     return new CurrentIncomePage (driver);
	   }
	
	public CurrentIncomePage selectValue7(String sValue)
	   {
	     Select oSelect = new Select(StartMonth);
	     oSelect.selectByVisibleText(sValue);
	     return new CurrentIncomePage (driver);
	   }
	
	public CurrentIncomePage selectValue8(String sValue)
	   {
	     Select oSelect = new Select(StartYear);
	     oSelect.selectByVisibleText(sValue);
	     return new CurrentIncomePage (driver);
	   }
	
	public CurrentIncomePage selectValue9(String sValue)
	   {
	     Select oSelect = new Select(BasicSalary);
	     oSelect.selectByVisibleText(sValue);
	     return new CurrentIncomePage (driver);
	   }
	
	public CurrentIncomePage selectValue10(String sValue)
	   {
	     Select oSelect = new Select(BasicGross);
	     oSelect.selectByVisibleText(sValue);
	     return new CurrentIncomePage (driver);
	   }
	
	public CurrentIncomePage Save()
	{
		SaveButton.click();
		return new CurrentIncomePage (driver);
	}
	
	public CommittedExpenditurePage Committed()
	{
		CommitedExpenditure.click();
		return new CommittedExpenditurePage (driver);
	}
}



