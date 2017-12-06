package com.mso.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CreateNewCasePage extends PageBase 

{

	   public CreateNewCasePage(WebDriver driver) 
	{
		super(driver);
		
   	}
   	
	@FindBy(how=How.XPATH,using=".//*[@id='applicationType2']")
	WebElement applicationType2;
	
	@FindBy(how=How.XPATH,using=".//*[@id='confirmStatementsCheckbox']")
	WebElement confirmStatementsCheckbox;
	
	@FindBy(how=How.XPATH,using=".//*[@id='confirmReadUseOfInfo']")
	WebElement confirmReadUseOfInfo;
	
	@FindBy(how=How.XPATH,using="//span[@data-i18n='common.Add applicants']")
	WebElement AddApplicants;
	
	

    public CreateNewCasePage RadioButton1()
    {
    	applicationType2.click();
    	return new CreateNewCasePage (driver);    	
    }
    
    
    public CreateNewCasePage RadioButton2()
    {	
        confirmStatementsCheckbox.click();
        return new CreateNewCasePage (driver);    
    }
    	
    public CreateNewCasePage RadioButton3()
    {
        confirmReadUseOfInfo.click();
        return new CreateNewCasePage (driver);
    }
    
    public AddApplicantPage AddApplicants()
    {
	    AddApplicants.click();
	    return new AddApplicantPage (driver);	
   }
    
  }
