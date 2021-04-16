package com.automation.training.Data;

import org.testng.annotations.DataProvider;

/**
 * Class ListData
 * 
 *  This class provides the data for the list tests 
 */
public class ListData {
    
    @DataProvider(name="selectOptionList")

    public static Object [][] inputDataList () {
        return new Object [][] 
        {
            {"Sunday","Day selected :- Sunday"}
        };
    }

}
