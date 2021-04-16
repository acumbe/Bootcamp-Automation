package com.automation.training.Listener;

import com.automation.training.tests.TestDropDowns;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

/**
 * Class MyListener
 * 
 * It allows custimizing TestGN reports.
 */
public class MyListener implements ITestListener {

    @Override
    public void onTestStart(ITestResult result) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        Logger logger = LoggerFactory.getLogger(TestDropDowns.class);
        logger.info("<<<<<<<< - Test Succesful - >>>>>>>");
        
    }

    @Override
    public void onTestFailure(ITestResult result) {
        Logger logger = LoggerFactory.getLogger(TestDropDowns.class);
        logger.info("<<<<<<<< - Test Fail - >>>>>>>");
        
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void onStart(ITestContext context) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void onFinish(ITestContext context) {
        // TODO Auto-generated method stub
        
    }
    
}
