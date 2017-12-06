package com.tests.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import com.mso.pages.MsoLoginPage;
import com.sun.istack.internal.logging.Logger;
import com.test.util.Utility;
import com.test.util.WebDriverHelper;

public class TestBase 
{
	
		protected static WebDriver driver;
		protected static MsoLoginPage login;
		protected Properties testConfig;
		static Logger log = Logger.getLogger(TestBase.class);
		

	  @BeforeClass(alwaysRun = true)
	  public void beforeMethod() throws FileNotFoundException, IOException 
	  {
		  Reporter.log("Setting up Environment for Testing ",true);
		  testConfig = new Properties();
		  testConfig.load(new FileInputStream("TestConfig.properties"));
		  PageFactory.initElements(driver, this);
			
		  driver = WebDriverHelper.createDriver(testConfig.getProperty("browser"));
		 
		  driver.get(testConfig.getProperty("appURL")); 
		  login = new MsoLoginPage(driver);
		
		//  Log.info("Application started successfully");
		//  login = PageFactory.initElements(driver, LoginPage.class);
		  
	  }
	  
	  
	 /* @AfterMethod(description="This method will capture screenhsots of failed tests")
	  public void screenShots(ITestResult testResult) throws IOException
	  {
		 
		  Utility.captureScreenShot(driver, "Screenhsots");
		  Reporter.log("Screenhots has been captured and saved successfully", true);
	  }*/
	  
	  @AfterMethod
	  public void tearDown(ITestResult result)
	  {
		  if(result.getStatus()==ITestResult.FAILURE)
	  {
	  
		String screenshot_path=Utility.captureScreenShot(driver, result.getName());
		/*
		String image= logger.addScreenCapture(screenshot_path);
		logger.log(LogStatus.PASS, "screenShots Captured", image);
		logger.log(LogStatus.INFO, "ScreenSHots have been captured and can be found when the project is refreshed");
		
	    */
	  
	  } 
	   
	  }
	  
	  
	  
	  @AfterClass(description="This method will closse the browser after all tests have been executed")
	  public void closeBrowser() 
	  {
		//  WebDriverHelper.quitDriver(driver);
		  
	  }
}
	

	

