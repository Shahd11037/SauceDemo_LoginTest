package com.saucedemo.tests;

import com.saucedemo.pages.BasePage;
import com.saucedemo.pages.LoginPage;
import com.saucedemo.pages.ProductsPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    protected WebDriver driver;
    protected LoginPage loginPage;
    private String url ="https://www.saucedemo.com/";

    @BeforeMethod
    public void setUp(){
        driver= new EdgeDriver();
        driver.manage().window().maximize();
        driver.get(url);
        loginPage = new LoginPage(driver);
    }

    @AfterMethod
    public void closeAll(){
        driver.quit();
    }

}
