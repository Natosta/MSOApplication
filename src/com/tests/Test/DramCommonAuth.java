package com.tests.Test;

/*import java.util.Iterator;
import java.util.List;

import org.apache.http.client.utils.HttpClientUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.http.HttpClient;
import org.testng.annotations.Test;

public class DramCommonAuth extends TestBase 
{*/

import java.util.List;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class DramCommonAuth extends TestBase {
	
	private WebDriver driver;
	private int invalidLinksCount;

	
	@Test
	public void validateInvalidLinks() {

		try {
			invalidLinksCount = 0;
			List<WebElement> anchorTagsList = driver.findElements(By.tagName("a"));
			System.out.println("Total no. of links are "
					+ anchorTagsList.size());
			for (WebElement anchorTagElement : anchorTagsList) {
				if (anchorTagElement != null) {
					String url = anchorTagElement.getAttribute("href");
					if (url != null && !url.contains("javascript")) {
						verifyURLStatus(url);
					} else {
						invalidLinksCount++;
					}
				}
			}

			System.out.println("Total no. of invalid links are "
					+ invalidLinksCount);

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}

	
	
	public void verifyURLStatus(String URL) {

		HttpClient client = HttpClientBuilder.create().build();
		HttpGet request = new HttpGet(URL);
		try {
			HttpResponse response = client.execute(request);
			// verifying response code and The HttpStatus should be 200 if not,
			// increment invalid link count
			////We can also check for 404 status code like response.getStatusLine().getStatusCode() == 404
			if (response.getStatusLine().getStatusCode() != 200)
				invalidLinksCount++;
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
	
	
			
	
		
			
	
	
	
	
	
	
			
	
	
	
	
	
	
	
	
	
	
	
	
	
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
			/*@Test
			public void verifyAllLinks()
			{
				List<WebElement> links = driver.findElements(By.tagName("a"));
				int link_size = links.size();
				System.out.println("The size of links are " + link_size);
				
				Iterator<WebElement> li = links.iterator();
				
				while(li.hasNext())
				{
					WebElement ele = li.next();
					String link_Text = ele.getText();
					System.out.println("Name of link is " + link_Text);
					
					boolean status = ele.isDisplayed();
					System.out.println(status);
					break;
					
				}
				
				
				
				
			}
			
			@Test
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
					
				}
			}*/
	
	


