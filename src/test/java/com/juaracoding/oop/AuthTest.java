package com.juaracoding.oop;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class AuthTest {

    Auth auth;

    @BeforeClass
    public void setup() {
        auth = new Auth();
        System.out.println("Setup before running Auth tests");
    }

    // --- DATA PROVIDERS ---

    @DataProvider(name = "loginData")
    public Object[][] loginData() {
        return new Object[][]{
                {"admin", "Indonesia", true},
                {"admin", "WrongPassword", false},
                {"user", "Indonesia", false},
                {"user", "WrongPassword", false}
        };
    }

    @DataProvider(name = "registerData")
    public Object[][] registerData() {
        return new Object[][]{
                {"1234567890123451", "newuser1", "password123"},
                {"1234567890123452", "newuser2", "password123"}
        };
    }

    @DataProvider(name = "registerInvalidData")
    public Object[][] registerDataInvalid() {
        return new Object[][]{
                {null, "user", "password123"},
                {"1234567890123456", null, "password123"},
                {"1234567890123456", "user", null},
                {"1234567890123456", "user", "short"},
                {"invalidNik", "user", "password123"}
        };
    }

    // --- TEST CASES ---

    @Test(dataProvider = "loginData")
    public void testLogin(String username, String password, boolean expected) {
        boolean result = auth.login(username, password);
        Assert.assertEquals(result, expected);
        System.out.println("Test login success passed");
    }

    @Test(dataProvider = "registerData")
    public void testRegister(String nik, String username, String password) {
        boolean result = auth.register(nik, username, password);
        Assert.assertTrue(result);
        System.out.println("Test register success passed");
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testRegisterWithInvalidNik() {  
        auth.register("invalidNik", "user", "password123");
        // Baris ini mungkin tidak tercetak karena exception muncul duluan
    }

    @Test(dataProvider = "registerInvalidData", expectedExceptions = IllegalArgumentException.class)
    public void testRegisterInvalid(String nik, String username, String password) {
        // Jika register melempar exception, test ini akan PASS.
        // Assert tidak diperlukan jika kita mengharapkan Exception.
        auth.register(nik, username, password);
    }
}