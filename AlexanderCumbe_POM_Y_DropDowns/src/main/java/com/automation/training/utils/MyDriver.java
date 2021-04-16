package com.automation.training.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Class MyDriver
 * 
 * Define the browser to use
 */
public class MyDriver {
    private WebDriver driver;

	/**
	 * Define the browser to use
	 * @param browser the browser to use
	 */
    public MyDriver(String browser) {
		switch (browser) {
		case "firefox":
			System.setProperty("webdriver.gecko.driver","C:\\driver_firefox\\geckodriver.exe");
			driver = new FirefoxDriver();
			break;
		case "chrome":
			System.setProperty("webdriver.chrome.driver", "C:\\driver_chrome\\chromedriver.exe");
			driver = new ChromeDriver();
			break;
		default:
			break;
		}
	}
	
	/**
	 * Method to get the driver
	 * @return the dirver
	 */
	public WebDriver getDriver() {
		return this.driver;
	}
}
