package my.test.frw.suites;


import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertNotNull;

import org.openqa.selenium.lift.TestContext;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class SampleSuiteITest {
    @Test
    public void testCase1(ITestContext tCon) {

        System.out.println("Executing TC1");
        Assert.assertTrue(true, tCon.getCurrentXmlTest().getName() + " : is failed");
    }

    @Test
    public void testCase2(ITestContext tCon) {

        System.out.println("Executing TC1");
        Assert.assertTrue(true, tCon.getCurrentXmlTest().getName() + " : is failed");
    }



    @AfterMethod(alwaysRun = true)

    public void afterMethod(Method method) {

        System.out.println("Currently run method was " + method.getName());

    }


}