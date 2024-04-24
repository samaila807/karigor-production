package com.psptech.unitech.steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.psptech.unitech.Pages.HomePage;
import com.psptech.unitech.baseClass.BaseClass;
import com.psptech.unitech.browserFactory.BrowserFactory;
import com.psptech.unitech.utilities.CommonMethods;

public class Homepage_TC_001 extends BaseClass {

	public Homepage_TC_001() {
		super(driver);
	}
	
	HomePage homepage;
	
	@BeforeTest
	public void setUp() {
		driver = BrowserFactory.initiateBrowser();
		logger.info("Browser is getting Initialized in Before Test");
		homepage = PageFactory.initElements(driver, HomePage.class);
		CommonMethods.maximizeBrowser();
		
	}
	
	@Test
	
	public void TC_001_VerifyWebsiteTitle() {
		System.out.println("System is getting the Title");
		CommonMethods.getTitle(getDriver(), "PSPTech – PSP Technology | Websites | Apps | Digital Solutions - PSPTech");
		
	}
	@Test
	public void TC_002_HomePageHeaderHomeButtonClick() {
		logger.info("Test Case_001 clicked on Home page home button");
		CommonMethods.click(homepage.ClickHome, driver);
	}
	
	
	
	
	
	

}
