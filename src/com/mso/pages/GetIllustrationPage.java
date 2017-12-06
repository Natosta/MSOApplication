package com.mso.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class GetIllustrationPage extends PageBase 
{

	public GetIllustrationPage(WebDriver driver)
	{
		super(driver);
		
	}

	@FindBy(how=How.XPATH,using=".//*[@id='viewContainer']/div[1]/div[2]/div[2]/div/div/a")
	WebElement PromoteDecision;
	
	@FindBy(how=How.XPATH,using="=.//*[@id='viewContainer']/div[1]/div[2]/div[2]/div/div/a")
	WebElement PromoteCase;
	
	
	public GetIllustrationPage GetIllus()
	{
		PromoteDecision.click();
		return new GetIllustrationPage (driver);
	}
	
	public LoanRequirementsPage PushCase()
	{
		PromoteCase.click();
		return new LoanRequirementsPage (driver);
	}
}
