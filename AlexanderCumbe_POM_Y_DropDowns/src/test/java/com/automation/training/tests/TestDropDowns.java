package com.automation.training.tests;

import com.automation.training.pages.HomePage;
import com.automation.training.Data.ListData;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Class TestDropDowns
 * 
 * Class to execute the tests
 */
public class TestDropDowns extends BaseTests {
    

    /**
     * This method validates that the day selected in the list is the same as that shown in the result
     * @param day
     * @param spected
     */
    @Test(dataProvider = "selectOptionList", dataProviderClass = ListData.class)
    public void testSelectList(String day, String spected){
        HomePage home = getHomePage();
        String daySeleted = home.getTextLIst(day);
        Assert.assertEquals(daySeleted, spected);
    }


    /**
     * This method validates that the city selected in the select list is the same as that shown in the result
     * @param city
     * @param spected
     */
    @Test(dataProvider = "multiSeletList", dataProviderClass = ListData.class)
    public void testMultiSelect(String city, String spected){
        HomePage home = getHomePage();
        String citySelected = home.getTexMultiSelect(city);
        Assert.assertEquals(citySelected, spected);
    }

}
