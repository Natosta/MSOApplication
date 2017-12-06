package com.mso.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ManageProviders extends PageBase {
	
	
	
	
	public ManageProviders(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(how=How.LINK_TEXT,using="Manage Providers")
	WebElement manageProvidersLink;
	
	@FindBy(how=How.LINK_TEXT,using="Add New Provider")
	WebElement addNewProviderBtn;
	
	@FindBy(how=How.LINK_TEXT,using="Assign Survey")
	WebElement assignSurveyButton;
	
	@FindBy(how=How.LINK_TEXT,using="Providers Without Account")
	WebElement providersWithoutAcct;
	
	@FindBy(how=How.ID,using="rpnumber")
	WebElement RPnumber;
	
	@FindBy(how=How.ID,using="rpName")
	WebElement RPName;
	
	@FindBy(how=How.ID,using="btnSearchUser")
	WebElement searchRPbutton;
	
	@FindBy(how=How.CLASS_NAME,using="button large blue")
	WebElement surveyFullReport;
	
	
	
	public void clickOnManageProvidersLink() throws Exception
	{
		manageProvidersLink.click();
	}
	
	
	public void clickaddProviderbtn() throws Exception
	{
		addNewProviderBtn.click();
		
	}
	
	public void clickOnAssignSurveyBtn() throws Exception
	{
		assignSurveyButton.click();
	}
	
	public void ClickOnproviderWithoutAcct()
	{
		providersWithoutAcct.click();
	}
	
	public void EnterRpNum(String rpNumber)
	{
		RPnumber.sendKeys(rpNumber);
	}
	
	public void enterRPName(String rpName)
	{
		RPName.sendKeys(rpName);
	}
	
	public void clickOnSearchButton()
	{
		searchRPbutton.click();
	}

}
