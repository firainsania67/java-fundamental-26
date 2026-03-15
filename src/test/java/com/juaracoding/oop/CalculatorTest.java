package com.juaracoding.oop;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CalculatorTest {

    Calculator calculator;

    @BeforeClass
    public void setup() {
        calculator = new Calculator();
        System.out.println("Setup before running tests");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("Running before each test method");
    }
    
    @Test(priority = 1)
    public void testAdd() {
        int result = calculator.add(5, 3);
        Assert.assertEquals(result, 8);
        System.out.println("Test add method passed");
    }

    @Test(priority = 2)
    public void testSubtract() {
        int result = calculator.subtract(5, 3);
        Assert.assertEquals(result, 2);
        System.out.println("Test subtract method passed");
    }

    @Test(priority = 3)
    public void testMultiply() {
        int result = calculator.multiply(5, 3);
        Assert.assertEquals(result, 15);
        System.out.println("Test multiply method passed");
    }

    @Test(priority = 4)
    public void testDivide() {
        double result = calculator.divide(5, 2);
        Assert.assertEquals(result, 2.5);
        System.out.println("Test divide method passed");
    }

    @Test(priority = 5, dependsOnMethods = "testDivide", expectedExceptions = IllegalArgumentException.class)
    public void testDivideByZero() {
        calculator.divide(5, 0);
        System.out.println("Test divide by zero passed");
    }

}
