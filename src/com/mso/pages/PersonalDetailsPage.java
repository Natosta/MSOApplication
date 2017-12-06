package com.mso.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class PersonalDetailsPage extends PageBase
{

	public PersonalDetailsPage(WebDriver driver)
	{
		super(driver);
		
	}

	
	@FindBy(how=How.XPATH,using=".//*[@id='title']")
	WebElement drop;
	
	@FindBy(how=How.XPATH,using=".//*[@id='forename']")
	WebElement Forename;
	
	@FindBy(how=How.XPATH,using=".//*[@id='surname']")
	WebElement Surname;
	
	@FindBy(how=How.XPATH,using=".//*[@id='gender1']")
	WebElement Gender;
	
	@FindBy(how=How.XPATH,using=".//*[@id='mobNumId']")
	WebElement Number;
	
	@FindBy(how=How.XPATH,using=".//*[@id='emailAddress']")
	WebElement MailAddress;
	
	@FindBy(how=How.XPATH,using=".//*[@id='nationality']")
	WebElement Origination;
	
	@FindBy(how=How.XPATH,using=".//*[@id='dateOfBirth']")
	WebElement Dob;
	
	@FindBy(how=How.XPATH,using=".//*[@id='maritalStatus']")
	WebElement Status;
	
	@FindBy(how=How.XPATH,using=".//*[@id='retirementAge']")
	WebElement RetireAge;
	
	@FindBy(how=How.XPATH,using=".//*[@id='financialDependantsChild']")
	WebElement DependentChild;
	
	@FindBy(how=How.XPATH,using=".//*[@id='financialDependantsAdult']")
	WebElement DependentAdult;
	
	@FindBy(how=How.XPATH,using=".//*[@id='viewContainer']/div/div[2]/mso-dip-footer-nav/div/div[1]/a/span[1]")
	WebElement AddressHistoryButton;
	
	
	
	public PersonalDetailsPage selectValue1(String sValue)
	   {
	     Select oSelect = new Select(drop);
	     oSelect.selectByVisibleText(sValue);
	     return new PersonalDetailsPage (driver);
	   }
	
	public PersonalDetailsPage forname()
	{
		Forename.sendKeys("Sunny");
		return new  PersonalDetailsPage (driver);
	}
	
	public PersonalDetailsPage surname()
	{
		Surname.sendKeys("Spearmint");
		return new  PersonalDetailsPage (driver);
	}
		
	public PersonalDetailsPage gender()
	{
		Gender.click();
		return new  PersonalDetailsPage (driver);
	}
	
	public PersonalDetailsPage MobileNumber()
	{
		Number.sendKeys("07455686444");
		return new  PersonalDetailsPage (driver);
    }  
	
	public PersonalDetailsPage emailAddress()
	{
		MailAddress.sendKeys("anderfanx+72@gmail.com");
		return new  PersonalDetailsPage (driver);
	}
	public PersonalDetailsPage selectValue11(String sValue)
	   {
	     Select oSelect = new Select(drop);
	     oSelect.selectByVisibleText(sValue);
	     return new PersonalDetailsPage (driver);
       }    
	  
	public PersonalDetailsPage DateOfB()
	{
		Dob.sendKeys("20/08/1960");
		return new  PersonalDetailsPage (driver);
	}
	
	public PersonalDetailsPage selectValue12(String sValue)
	   {
	     Select oSelect = new Select(drop);
	     oSelect.selectByVisibleText(sValue);
	     return new PersonalDetailsPage (driver);
	
	   }
	
	public PersonalDetailsPage RetAge()
	{
		RetireAge.sendKeys("75");
		return new  PersonalDetailsPage (driver);
	}
	
	public PersonalDetailsPage DependChild()
	{
		DependentChild.sendKeys("0");
		return new  PersonalDetailsPage (driver);
	}
	
	public PersonalDetailsPage DependAdult()
	{
		DependentAdult.sendKeys("0");
		return new  PersonalDetailsPage (driver);
	}
	
	
	public AddressHistoryPage AddressPage()
	{
		AddressHistoryButton.click();
		return new  AddressHistoryPage (driver);
	}

	
	
}
