package com.test.util;
	import java.security.InvalidParameterException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

	public class WebDriverHelper
	{
		
		
		protected static WebDriver driver;
		protected static String driverPath1 = "C:\\Dev\\chromedriver.exe";
		protected static String driverPath2 = "C:\\Dev\\IEDriverServer.exe";
		protected static String driverPath3 = "C:\\Dev\\geckodriver.exe";
		
		
		public static WebDriver createDriver(String browser)
		{
			WebDriver driver=null;
			
			
			if(browser.equalsIgnoreCase("firefox"))
			{
				System.setProperty("webdriver.gecko.driver", driverPath3);
				driver = new FirefoxDriver();
				System.out.println("launching Firebox browser....");
			}
			else if(browser.equalsIgnoreCase("Chrome"))
			{
				System.setProperty("webdriver.chrome.driver", driverPath1);
				driver = new ChromeDriver();
				System.out.println("Launching chrome browser...");
			}
			else if(browser.equalsIgnoreCase("IE"))
			{
				System.setProperty("webdriver.ie.driver", driverPath2);
				driver = new InternetExplorerDriver();
				System.out.println("launching IE");
			}
			else
			{
				throw new InvalidParameterException(browser + " - is not a valid web browser for WebDriver mate.");
			}

			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			
			return driver;
			}
		
			public static void quitDriver(WebDriver driver)
			{
				System.out.println("Closing all browsers");
				driver.quit();
			}

		} 
		


