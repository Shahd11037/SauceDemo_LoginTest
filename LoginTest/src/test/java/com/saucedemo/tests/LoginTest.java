package com.saucedemo.tests;

import com.saucedemo.pages.ProductsPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest{

    @Test
    public void loginWithValidCredentials(){
        String validUserName = "standard_user";
        String validPassword ="secret_sauce";
        ProductsPage productsPage = loginPage.login(validUserName, validPassword);
        Assert.assertTrue(productsPage.isProductHeaderDisplayed(),
                "\n Product header is not displayed \n");
    }
    @Test
    public void loginWithInvalidCredentials(){
        String invalidUserName = "shahd";
        String invalidPassword ="pass1234";
        loginPage.inputUserName(invalidUserName);
        loginPage.inputPassword(invalidPassword);
        loginPage.clickLoginButton();
        Assert.assertEquals(loginPage.getErrorMsg(),
                "Epic sadface: Username and password do not match any user in this service",
                "\n Wrong Error Message \n");
    }
}
