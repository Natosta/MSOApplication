package com.mso.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CaseSummaryPage extends PageBase
{

	public CaseSummaryPage(WebDriver driver)
	{
		super(driver);
		
	}

	
	
   @FindBy(how=How.XPATH,using=".//*[@id='btn-GetIllustration']")
   WebElement Illustration;
   
   
   @FindBy(how=How.XPATH,using="//button[@class='btn btn-default']")
   WebElement DecisionButon;
   
   
   public LoanRequirementsPage ChooseOption()
   {
	  DecisionButon.click();
   return new LoanRequirementsPage (driver);
   
   }
   
   public LoanRequirementsPage GetIllustration()
   {
	   Illustration.click();
   return new LoanRequirementsPage (driver);
   }
   
   
   
  }
