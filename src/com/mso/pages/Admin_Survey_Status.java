package com.mso.pages;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Admin_Survey_Status extends PageBase {
	

	
	@FindBy(how=How.XPATH,using=".//*[@id='menucontainer']/ul")
	List<WebElement> links;
	
	@FindBy(how=How.XPATH,using=".//*[@id='user-welcome']/span/strong")
	WebElement welcomeUser_Text;
	
	@FindBy(how=How.XPATH,using=".//*[@id='dashBoardContainer']/div[3]/h2")
	WebElement FVA_HEADER;
	
	@FindBy(how=How.XPATH,using=".//*[@id='dashBoardContainer']/div[4]/h2")
	WebElement FFR_HEADER;
	
	@FindBy(how=How.XPATH,using=".//*[@id='dashBoardContainer']/div[5]/h2")
	WebElement QS_HEADER;
	
	public Admin_Survey_Status(WebDriver driver)
	{
		super(driver);
	}
	
	public void admin_links()
	{
		Iterator<WebElement> li = links.iterator();
		while(li.hasNext())
		{
			WebElement ele = li.next();
			String linkName = ele.getText();
			System.out.println("The name of the link is " + ele);
		}
			
	}
		






}
