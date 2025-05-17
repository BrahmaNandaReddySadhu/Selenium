package com.selenium.SeleniumFour;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class TestNgRetry implements IRetryAnalyzer {

    private int retryCount = 0;
    public static  final int maxRetryCount = 5;
    @Override
    public boolean retry(ITestResult iTestResult) {
        if(retryCount <maxRetryCount){
            retryCount = retryCount+1;
            return true;
        }
        return false;
    }
}

