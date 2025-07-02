package com.qa.opencart.pages;

import com.qa.opencart.utils.ElementUtil;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

public class AccountsPage {

    private final WebDriver driver;
    private final ElementUtil eleUtil;

    public AccountsPage(WebDriver driver) {
        this.driver= driver;
        eleUtil = new ElementUtil(driver);
    }

    //Locator //
    private final By logoutLink=By.linkText("Logout");
    private final By search = By.name("search");
    private final By searchIcon = By.cssSelector("div#search");

    //private By xx= By.xpath()
     //By.ByXPath bb=By.ByXPath("");

    public boolean isLogOutLinkExist(){

       return eleUtil.isElementDisplayed(logoutLink);
    }





}
