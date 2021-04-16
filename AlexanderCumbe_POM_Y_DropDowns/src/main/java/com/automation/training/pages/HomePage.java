package com.automation.training.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

/**
 * Class HomePage
 * 
 * Define the methods to interact with the home page
 */
public class HomePage extends BasePage {

    /**
     * Send the browser and set the url on the browser
     * @param pDriver
     */
    public HomePage(WebDriver pDriver) {
        super(pDriver);
        pDriver.get("http://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
        //TODO Auto-generated constructor stub
    }

    @FindBy(id="select-demo")
	private WebElement listDemo;

    @FindBy(css = ".selected-value")
    private WebElement daySelected;

    @FindBy(id="multi-select")
	private WebElement multiSelectDemo;

    @FindBy(id = "printMe")
    private WebElement btnFirstSelected;

    @FindBy(css = ".getall-selected")
    private WebElement optionSelected;

    /**
     * The day is selected in the list
     * @param day
     * @return the the day selected
     */
    public String  getTextLIst( String day) {
        getWait().until(ExpectedConditions.visibilityOf(listDemo));
        Select selectList = new Select(listDemo);
        selectList.selectByValue(day);
        return daySelected.getText();
    }

    /**
     * The city is selected in the multiple select list
     * @param city
     * @return the city selected
     */
    public String  getTexMultiSelect( String city) {
        Select selectList = new Select(multiSelectDemo);
        selectList.selectByValue(city);
        btnFirstSelected.click();
        return optionSelected.getText();
    }

}
