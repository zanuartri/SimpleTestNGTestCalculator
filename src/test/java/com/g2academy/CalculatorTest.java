package com.g2academy;

import org.testng.Assert;
import org.testng.annotations.*;

public class CalculatorTest {
    private Calculator calculator;
    private int total;

    @BeforeSuite
    public void suiteInit() {
        System.out.println("Suite Started");
        // do some code
    }

    @BeforeClass
    public void classInit() {
        System.out.println("Class Started");
        calculator = new Calculator();
        total = 0;
    }

    @BeforeMethod
    public void testInit() {
        total = 0;
    }

    @Test(priority = 0)
    public void testAdd() {
        System.out.println("testing add function");
        total = calculator.add(300, 500);
        Assert.assertEquals(total, 800);
    }

    @Test(priority = 1)
    public void testSubtract() {
        System.out.println("testing subtract function");
        total = calculator.subtract(5000, 2000);
        Assert.assertEquals(total, 3000);
    }

    @Test(priority = 2)
    public void testMultiply() {
        System.out.println("testing multiply function");
        total = calculator.multiply(15, 5);
        Assert.assertEquals(total, 75);
    }

    @Test(priority = 3)
    public void testDivide() {
        System.out.println("testing divide function");
        total = calculator.divide(60, 12);
        Assert.assertEquals(total, 5);
    }

    @AfterMethod
    public void testTeardown() {
        // do some code
    }

    @AfterClass
    public void classTeardown() {
        System.out.println("Class Finished");
        // do some code
    }

    @AfterSuite
    public void suiteTeardown() {
        System.out.println("Suite Finished");
        // do some code
    }
}
