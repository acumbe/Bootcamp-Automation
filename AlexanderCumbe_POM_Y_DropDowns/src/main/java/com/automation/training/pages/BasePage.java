package com.automation.training.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Class BasePage
 * 
 * Contains generic methods for the pages
 */
public class BasePage {

    private WebDriver driver;
    private WebDriverWait wait;
    
    /**
     * Method that initializes the diver.
     * @param pDriver
     */
    public BasePage (WebDriver pDriver){
        PageFactory.initElements(pDriver, this);
        wait = new WebDriverWait(pDriver, 20);
        driver = pDriver;
        driver.manage().window().maximize();
    }

    /**
     * Method to access the driver
     * @return the driver
     */
    protected WebDriver getDriver(){
        return driver;
    }

    /**
     * Method to access the waits
     * @return the wait
     */
    public WebDriverWait getWait (){
        return wait;
    }
    

    /**
     * Close the browser
     */
    public void dispose() {
        if(driver!=null){
            driver.quit();
        }
    }    
    
}
