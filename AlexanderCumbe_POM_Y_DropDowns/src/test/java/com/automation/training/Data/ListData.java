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
            {"Sunday","Day selected :- Sunday"},
            {"Tuesday","Day selected :- Tuesday"},
            {"Friday","Day selected :- Friday"}
        };
    }

    @DataProvider(name="multiSeletList")
    public static Object [][] inputDataMultiList () {
        return new Object [][] 
        {
            {"Florida","First selected option is : Florida"},
            {"Texas","First selected option is : Texas"},
            {"New York","First selected option is : New York"}
        };
    }

}
