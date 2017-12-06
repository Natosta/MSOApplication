package com.test.util;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;



public class BrowserPageFactory {
	

	public static WebDriver driver;
	public static String driverPath1 = "C:\\ChromeDrive\\chromedriver.exe";
	public static String driverPath = "C:\\IEDriverServer.exe";
	public static String driverPath3 = "C:\\Firefox driver.geckodriver.exe";
	
	
	
	public static WebDriver startBrowser(String browserName,  String appUrl) 
	{
		
		if(browserName.equalsIgnoreCase("firefox")) 
		{
			driver = new FirefoxDriver();
			System.setProperty("webdriver.gecko.driver", driverPath3);
			System.out.println("launching Firebox browser....");
			
		}
		
		else if(browserName.equalsIgnoreCase("chrome")) 
		{
			System.setProperty("webdriver.chrome.driver", driverPath1);
			driver = new ChromeDriver();
			System.out.println("Launching chrome browser...");
		}
		
		else if(browserName.equalsIgnoreCase("internet Explorer")) 
		{
			System.setProperty("webdriver.ie.driver", driverPath);
			driver = new InternetExplorerDriver();
			System.out.println("launching IE");
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(appUrl);
		return driver;
		
		
	}
}	

