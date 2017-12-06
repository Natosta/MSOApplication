package com.tests.Test;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class CommAuthTesting extends TestBase
{
		WebDriver driver;
	
	List<WebElement> dram_Links;
		
	@Test
	public void verifyAllLinks()
	{
		List<WebElement> dram_Links = driver.findElements(By.tagName("a"));
		int totalSize = dram_Links.size();
		System.out.println(totalSize);
		
		Iterator<WebElement> lis = dram_Links.iterator();
			
			while(lis.hasNext())
			{
				WebElement ele = lis.next();
				String linkNames = ele.getText();
				System.out.println("The name of the link is " + ele);
				
				System.out.println("The name of the link is " + linkNames);
				
				boolean link_Status = ele.isDisplayed();
				System.out.println(link_Status);
				
			}
				
			
		}
		
		
		
		
	}
	
	/*@Test
	public void verifyImageLinks()
	{
		List<WebElement> img = driver.findElements(By.tagName("img"));
		int image_total = img.size();
		System.out.println("The total images is " + image_total);
		
		Iterator<WebElement> ele1 = img.iterator();
		while(ele1.hasNext())
		{
			WebElement ele2 = ele1.next();
			String image_name = ele2.getText();
			System.out.println(image_name);
			boolean image_status = ele2.isEnabled();
			System.out.println(image_status);
			String attributeName = ele2.getAttribute("innerHTML");
			System.out.println("The attribute name is" + attributeName );
			
		}*/
	

