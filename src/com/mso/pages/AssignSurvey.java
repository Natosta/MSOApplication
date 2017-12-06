package com.mso.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AssignSurvey {
	
	WebDriver driver;
	
	@FindBy(how=How.LINK_TEXT,using="Assign Survey")
	WebElement assignSurveyLink;
	
	@FindBy(how=How.XPATH,using="//input[@id='rpnumber']")
	WebElement enterRPnumber;
	
	@FindBy(how=How.XPATH,using="//input[@id='rpname']")
	WebElement enterRPname;
	
	@FindBy(how=How.ID,using="listRPs")
	WebElement listRPSbutton;
	
	@FindBy(how=How.ID,using="selectallCheck")
	WebElement assignAllCheckbox;
	
	@FindBy(how=How.ID,using="assignSurvey")
	WebElement confirmChangeButton;
	
	public AssignSurvey(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void clickOnAssignSurvey() throws Exception
	{
		assignSurveyLink.click();
	}
	
	public void setRPNumber(String number) throws Exception
	{
		enterRPnumber.sendKeys(number);
	}
	
	public void setRPName(String name) throws Exception
	{
		enterRPname.sendKeys(name);
	}
	
	public void clickListRPbutton() throws Exception
	{
		listRPSbutton.click();
	}
	
	public void clickAssignAllCheckBox() throws Exception
	{
		assignAllCheckbox.click();
	}
	
	public void confirmChangeButton() throws Exception
	{
		confirmChangeButton.click();
	}
	
	































}
