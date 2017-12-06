package com.test.util;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

	public abstract class TakeScreenshots implements ITestListener {
	
	protected static WebDriver driver;
	static String filePath = "C:\\Screenshots";
	
	
	 
		public static void onTestFailure(WebDriver driver, ITestResult result,String methodName) {
	    	System.out.println("***** Error "+result.getName()+" test has failed *****");
	    	methodName=result.getName().toString().trim();
	    	takeScreenShot(methodName);
	 
	    	File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	         //The below method will save the screen shot in d drive with test method name 
	            try {
					FileUtils.copyFile(scrFile, new File(filePath+methodName+".png"));
					System.out.println("***Placed screen shot in "+filePath+" ***");
				} catch (IOException e) {
					e.printStackTrace();
				}
	    }
		
		public static void takeScreenShot(String methodName) {
			// TODO Auto-generated method stub
			
		}

		public void onFinish(ITestContext context) {}
	  
	    public void onTestStart(ITestResult result) {   }
	  
	    public void onTestSuccess(ITestResult result) {   }

	    public void onTestSkipped(ITestResult result) {   }

	    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {   }

	    public void onStart(ITestContext context) {   }
		public static void onTestFailure(WebDriver driver2, ITestResult arg0) {
			// TODO Auto-generated method stub
			
		}
	}  