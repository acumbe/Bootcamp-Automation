package com.automation.training.tests;

import com.automation.training.pages.HomePage;
import com.automation.training.utils.MyDriver;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;


/**
 * Class BaseTests
 * 
 * Define the generics methods for the tests
 */
public class BaseTests {
    
    MyDriver myDriver;
	
	private HomePage homePage;
	
	
	@BeforeSuite(alwaysRun=true)
	@Parameters({"browser"})
	/**
	 * Create an instance of the driver with the browser and send it to the Home page 
	 */
	public void beforeSuite(String browser) {
		myDriver = new MyDriver(browser);
		homePage = new HomePage(myDriver.getDriver());
	}
	
	@AfterSuite(alwaysRun=true)
	/**
	 * The browser closes
	 */
	public void afterSuite() {
		homePage.dispose();
	}

	/**
	 * Return the driver to the home page
	 * @return the home page with the driver
	 */
	public HomePage getHomePage() {
		return homePage;
	}
}
