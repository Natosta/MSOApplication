package com.mso.pages;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LinkStatus extends PageBase 
{
	
		
		public LinkStatus(WebDriver driver)
		{
			super(driver);
		}
		
		
		@FindBy(how=How.TAG_NAME,using="a")
		List<WebElement>allLinks;
		
		public void verify_link_status()
		{
			Iterator<WebElement> li = allLinks.iterator();
			int totalLinks = allLinks.size();
			
			System.out.println("Total amount of links is " + totalLinks);
			
			while(li.hasNext())
			{
				WebElement ele = li.next();
				String linkName = ele.getText();
				
				System.out.println("The name of the link is " + linkName);
				
				boolean linkStatus = ele.isDisplayed();
				System.out.println(linkStatus);
			}
		}






}
