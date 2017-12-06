package com.mso.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class AddressHistoryPage extends PageBase 
{

	public AddressHistoryPage(WebDriver driver)
	{
		super(driver);
		
	}
	
	
	@FindBy(how=How.XPATH,using=".//*[@id='viewContainer']/div/div[1]/div/form/div[1]/div[1]/div[2]/div/div[2]/button")
	WebElement AddButton;
  
    @FindBy(how=How.XPATH,using=".//*[@id='moveindatemonths']")
    WebElement Month;
    
    @FindBy(how=How.XPATH,using=".//*[@id='moveindateyears']")
    WebElement Years;
    
    @FindBy(how=How.XPATH,using=".//*[@id='occupancyType']")
    WebElement Occupancy;
    
    @FindBy(how=How.XPATH,using=".//*[@id='enterManually']")
    WebElement AddressManul;
    
    @FindBy(how=How.XPATH,using=".//*[@id='buildingNo']")
    WebElement Number;
    
    @FindBy(how=How.XPATH,using=".//*[@id='street']")
    WebElement Street;
    
    @FindBy(how=How.XPATH,using=".//*[@id='town']")
    WebElement Town;
    
    @FindBy(how=How.XPATH,using=".//*[@id='county']")
    WebElement County;
    
    @FindBy(how=How.XPATH,using=".//*[@id='postcode']")
    WebElement PostCode;
    
    @FindBy(how=How.XPATH,using=".//*[@id='viewContainer']/div/div[2]/mso-dip-footer-nav/div/div[1]/a")
    WebElement Save;
    
    @FindBy(how=How.XPATH,using=".//*[@id='viewContainer']/div/div[2]/mso-dip-footer-nav/div/div[1]/a/span[1]")
    WebElement CommittedExp;
    
    
    
    
    public AddressHistoryPage Add()
	{
    	AddButton.click();
		return new AddressHistoryPage (driver);
	}

    public AddressHistoryPage selectValue(String sValue)
	   {
	     Select oSelect = new Select(Month);
	     oSelect.selectByVisibleText(sValue);
	     return new AddressHistoryPage (driver);
	   }  
    
    public AddressHistoryPage selectValue1(String sValue)
	   {
	     Select oSelect = new Select(Years);
	     oSelect.selectByVisibleText(sValue);
	     return new AddressHistoryPage (driver);
	   }  
    
    public AddressHistoryPage selectValue5(String sValue)
	   {
		 Select oSelect = new Select(Occupancy);
		 oSelect.selectByVisibleText(sValue);
		 return new AddressHistoryPage (driver);		   
       }    
	     
    public AddressHistoryPage AddAddress()
   	{
    	AddressManul.click();
   		return new AddressHistoryPage (driver);
   	}
    
    public AddressHistoryPage BuildingNumber()
   	{
    	Number.sendKeys("1");
   		return new AddressHistoryPage (driver);
   	}
    
    public AddressHistoryPage StreetName()
   	{
    	Street.sendKeys("Misletoe Lane");
   		return new AddressHistoryPage (driver);
   	}
    
    public AddressHistoryPage Area()
   	{
    	Town.sendKeys("Test Town");
   		return new AddressHistoryPage (driver);
   	}
    
    public AddressHistoryPage Zone()
   	{
    	County.sendKeys("Tyne & Wear");
   		return new AddressHistoryPage (driver);
   	}
    
    
    public AddressHistoryPage AddButton()
   	{
    	PostCode.sendKeys("BT99 9AA");
   		return new AddressHistoryPage (driver);
   	}
    
    public AddressHistoryPage SaveButton()
   	{
    	Save.click();
   		return new AddressHistoryPage (driver);
   	}
    
    public CurrentIncomePage CurrentIncome()
   	{
    	CommittedExp.click();
   		return new CurrentIncomePage (driver);
   	}
    
    
}