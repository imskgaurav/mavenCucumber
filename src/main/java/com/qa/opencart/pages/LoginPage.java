package com.qa.opencart.pages;

import com.qa.opencart.constants.AppConstants;
import com.qa.opencart.utils.ElementUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.qa.opencart.constants.AppConstants;
import com.qa.opencart.utils.TimeUtil;

import  io.qameta.allure.Step;


public class LoginPage {

    private final WebDriver driver;
    private final ElementUtil eleUtil;

    //Page Object By Locator //
    private final By emaiId = By.id("input-email");
    private final By password = By.id("input-password");
    private final By loginBtn = By.xpath("//input[@value= 'login']");
    private final By forgotPwdLink = By.linkText("Forgotten Password");
    private final By registerLink = By.linkText("Register");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        eleUtil = new ElementUtil(driver);
    }

   public String getLoginPageTitle(){
       String loginPageTitle= eleUtil.waitForTitleToBe(AppConstants.LOGIN_PAGE_TITLE, TimeUtil.DEFAULT_TIME);
       return loginPageTitle;
      }




}
