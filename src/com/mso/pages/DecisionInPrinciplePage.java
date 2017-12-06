package com.mso.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class DecisionInPrinciplePage extends PageBase
{

	public DecisionInPrinciplePage(WebDriver driver)
	{
		super(driver);
	
	}
    //Upon Submission of DIP this screen/Page is displayed
	@FindBy(how=How.XPATH,using=".//*[@id='decline']/div/div/div/div[1]/h2/span")
	  WebElement DecisonIcon;
}
