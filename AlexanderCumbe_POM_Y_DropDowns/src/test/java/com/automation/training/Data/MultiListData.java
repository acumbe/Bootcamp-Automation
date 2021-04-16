package com.automation.training.Data;

import org.testng.annotations.DataProvider;


/**
 * Class MultiListData
 * 
 *  This class provides the data for the multiple list tests 
 */
public class MultiListData {
    
    @DataProvider(name="multiSeletList")

    public static Object [][] inputDataList () {
        return new Object [][] 
        {
            {"New York","First selected option is : New York"}
        };
    }

}
