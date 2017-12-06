package com.mso.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class AdviceAndFeesPage extends PageBase
{

	public AdviceAndFeesPage(WebDriver driver) 
	{
		super(driver);
		
	}

	@FindBy(how=How.XPATH,using=".//*[@id='levelOfService']")
	WebElement LevelOfAdvice;
	
	@FindBy(how=How.XPATH,using=".//*[@id='feeChargedToApplicant']")
	WebElement ChargeApplicant;
	
	@FindBy(how=How.XPATH,using=".//*[@id='valuationType']")
	WebElement Valuation;
	
	@FindBy(how=How.XPATH,using=".//*[@id='feePayableHows0']")
	WebElement PayFees;
	
	@FindBy(how=How.XPATH,using=".//*[@id='viewContainer']/div[1]/div[5]/div[2]/a")
	WebElement GenerateIllus;
	
		
	//Elements to be verified
	
	
	@FindBy(how=How.XPATH,using=".//*[@id='viewContainer']/div[1]/div[2]/div[2]/a")
	WebElement NextButton;
	
	public AdviceAndFeesPage Add()
	{
	NextButton.click();
	return new AdviceAndFeesPage (driver);
	}
	
	// Begin Method
	public AdviceAndFeesPage selectValue(String sValue)
	   {
	     Select oSelect = new Select(LevelOfAdvice);
	     oSelect.selectByVisibleText(sValue);
	     return new AdviceAndFeesPage (driver);
	   }	
	
	public AdviceAndFeesPage Charge()
	{
	ChargeApplicant.sendKeys("0");
	return new AdviceAndFeesPage (driver);
	}
	
	public AdviceAndFeesPage selectValue1(String sValue)
	   {
	     Select oSelect = new Select(Valuation);
	     oSelect.selectByVisibleText(sValue);
	     return new AdviceAndFeesPage (driver);
	   }	
	
	public AdviceAndFeesPage selectValue2(String sValue)
	   {
	     Select oSelect = new Select(PayFees);
	     oSelect.selectByVisibleText(sValue);
	     return new AdviceAndFeesPage (driver);
	   }	
	
	
	public GetIllustrationPage Get()
	{
		GenerateIllus.click();
	return new GetIllustrationPage (driver);
	}
	
 }
	

