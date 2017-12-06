package com.mso.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SubmitDecisionPage extends PageBase
{

	public SubmitDecisionPage(WebDriver driver) 
	{
		super(driver);
		
	}
	
	@FindBy(how=How.XPATH,using=".//*[@id='consentCheckbox']")
	  WebElement RadioButton;
	 
	@FindBy(how=How.XPATH,using=".//*[@id='viewContainer']/div/div[1]/form/div/div[2]/div[2]/div[2]/div[2]/button")
	  WebElement SubmitDecision;
	 
	public SubmitDecisionPage CheckBox()
	{
		RadioButton.click();
		return new SubmitDecisionPage (driver);
	}

	
	public DecisionInPrinciplePage GetDip()
	{
		SubmitDecision.click();
		return new DecisionInPrinciplePage (driver);
	}


}
