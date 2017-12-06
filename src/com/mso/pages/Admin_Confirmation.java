package com.mso.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Admin_Confirmation extends PageBase{
	
	
	@FindBy(how=How.XPATH,using=".//*[@id='confirmationContent']/h1")
	WebElement confirmationLabel;
	
	@FindBy(how=How.XPATH,using=".//*[@id='confirmationDialog']")
	WebElement confirmationDialoguBox;
	
	@FindBy(how=How.XPATH,using=".//*[@id='confirmationDialog']/input[2]")
	WebElement cancelButton;
	
	@FindBy(how=How.XPATH,using=".//*[@id='confirmationDialog']/input[1]")
	WebElement OKbutton;
	
	@FindBy(how=How.XPATH,using="//button[@type='button']")
	WebElement ClickOKonPopScreen;
	
	public Admin_Confirmation(WebDriver driver)
	{
		super(driver);
	}
	
	public void verifyConfirmationLabel()
	{
		if(confirmationLabel.equals("Confirmation"))
		{
			System.out.println("This is the confirmation screen");
		}
	}
	
	public void adminCancelButton()
	{
		cancelButton.click();
	}
	
	public void clickOKbutton()
	{
		OKbutton.click();
		ClickOKonPopScreen.click();
	}





















}
