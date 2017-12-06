package com.mso.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;



public class AddApplicantPage extends PageBase

{

	public AddApplicantPage(WebDriver driver) 
	{
		super(driver);
		
	}
	
	@FindBy(how=How.XPATH,using="//select[@id='applicant1Type']")
	WebElement drop;

	@FindBy(how=How.XPATH,using=".//*[@id='forename']")
	WebElement forname;
	
	@FindBy(how=How.XPATH,using=".//*[@id='surname']")
	WebElement surname;
	
	@FindBy(how=How.XPATH,using=".//*[@id='dateOfBirth']")
	WebElement dateOfBirth;
	
	@FindBy(how=How.XPATH,using="//button[@class='btn btn-link']")
	WebElement button;
	

	@FindBy(how=How.XPATH,using=".//*[@id='viewContainer']/div/div[2]/mso-cm-footer-nav/div/div[1]/a/span[1]")
     WebElement createCaseButton;
	
	
   public AddApplicantPage selectValue(String sValue)
   {
     Select oSelect = new Select(drop);
     oSelect.selectByVisibleText(sValue);
     return new AddApplicantPage (driver);
   }		 
   
  
   public AddApplicantPage name()
   {
	   forname.sendKeys("Sunny");
	   return new AddApplicantPage (driver);
   }

   public AddApplicantPage Secondname()
   {
        surname.sendKeys("Spearmint");
        return new AddApplicantPage(driver);
   }
	
   public AddApplicantPage Age()
   {
	   dateOfBirth.sendKeys("20/08/1962");
	   return new AddApplicantPage(driver);
   }
   
   public AddApplicantPage Add()
   {
	   button.click();
	   return new AddApplicantPage (driver);
   }
	
   public CaseSummaryPage CreateCase()
   {
      createCaseButton.click();
      return new CaseSummaryPage(driver);   
   }
   
} 
   
   
   
   