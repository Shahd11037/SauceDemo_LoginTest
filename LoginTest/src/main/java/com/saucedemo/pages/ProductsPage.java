package com.saucedemo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductsPage extends BasePage{

    private By productsHeadlineLocator= By.cssSelector("span[data-test=\"title\"]");

    public ProductsPage(WebDriver driver) {
        super(driver);
    }
    public  boolean isProductHeaderDisplayed(){
        return find(productsHeadlineLocator).isDisplayed();
    }

}
