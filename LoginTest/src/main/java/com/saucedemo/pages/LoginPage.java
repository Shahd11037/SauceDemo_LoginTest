package com.saucedemo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage{

    //locators
    private By userNameLocator = By.cssSelector("input[data-test=\"username\"]");
    private By passwordLocator = By.cssSelector("input[data-test=\"password\"]");
    private By loginButtonLocator =By.cssSelector("input[data-test=\"login-button\"]");
    private By errorMsgLocator = By.cssSelector("h3[data-test=\"error\"]");

    public LoginPage(WebDriver driver) {
        super(driver);
    }
    public void inputUserName(String userName){
        type(userNameLocator, userName);
    }
    public void inputPassword(String password){
        type(passwordLocator, password);
    }
    public void clickLoginButton(){
        click(loginButtonLocator);
    }
    public ProductsPage login(String userName, String password){
        inputUserName(userName);
        inputPassword(password);
        click(loginButtonLocator);
        return new ProductsPage(driver);
    }
    public String getErrorMsg(){
        return getText(errorMsgLocator);
    }
}
