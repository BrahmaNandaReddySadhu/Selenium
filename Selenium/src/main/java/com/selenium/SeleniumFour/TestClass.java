package com.selenium.SeleniumFour;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestClass {

    @Test(retryAnalyzer = TestNgRetry.class)
    public void testing(){
        Assert.assertTrue(false);
    }
}
