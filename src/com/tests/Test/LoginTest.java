package com.tests.Test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.mso.pages.MsoLoginPage;

public class LoginTest extends TestBase
{
	
	@Test
	
	// login into MSO Web and logging out
	public void verifyValidLogin() throws InterruptedException
	{
		MsoLoginPage login = PageFactory.initElements(driver, MsoLoginPage.class);
	
		login.login("Anderson2", "Mesh@85000");
		
	}
}
	/*
	
	    HomePage Home = PageFactory.initElements(driver, HomePage.class);
	    Thread.sleep(5000);
	    Home.CreateNewCase();

        CreateNewCasePage Case = PageFactory.initElements(driver, CreateNewCasePage.class);
        Case.RadioButton1();
        Case.RadioButton2();
        Case.RadioButton3();
        Case.AddApplicants();
         
         
        AddApplicantPage Details = PageFactory.initElements(driver, AddApplicantPage.class);
        Details.selectValue("Borrower with other lender");
        Details.name();
        Details.Secondname();
        Details.Age();
        Details.Add();
        Thread.sleep(5000);
        Details.CreateCase();
        
        
        CaseSummaryPage Outcome = PageFactory.initElements(driver, CaseSummaryPage.class);
        Outcome.ChooseOption();
        
        
        LoanRequirementsPage Information = PageFactory.initElements(driver, LoanRequirementsPage.class);
        Information.LoanRequirement();
        Information.selectValue("Terraced House");
        Information.Price();
        Information.Loan();
        Information.Year();
        Information.Deposit();
        
        
	}	
	
	
	
	
		/*
		logger.log(LogStatus.INFO, "Logged in to Nrosh+ Successfully");
		Assert.assertTrue(login.isLoginSuccessful("Ken Dev/QA PM"), "This login is not Valid mate");
		Assert.assertEquals(login.getTilte(), "MyData - NROSH+");
		logger.log(LogStatus.PASS, "Page title verified successfully");
		
		*/
		
		
		
		
						
	
	
	/*@Test
	public void testInvaidLogin()
	{
		startPage.loginExpectingError("test", "1234");
		Assert.assertEquals(startPage.verifyErrorMessage(),"Login was unsuccessful. Please correct the errors and try again.The username and/or password are incorrect. Please try again.");
		
	}*/
	


