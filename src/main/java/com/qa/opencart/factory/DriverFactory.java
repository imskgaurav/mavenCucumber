package com.qa.opencart.factory;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import io.qameta.allure.internal.shadowed.jackson.databind.annotation.JsonAppend;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;

import com.qa.opencart.constants.AppConstants;
import com.qa.opencart.errors.AppError;
import com.qa.opencart.exceptions.BrowserException;
import com.qa.opencart.exceptions.FrameworkException;

public class DriverFactory {

    WebDriver driver;
    public static String highlight;
    public  WebDriver initDriver(Properties prop){

        String browserName = prop.getProperty("browser");
          String url= prop.getProperty("url");

          switch (browserName.toLowerCase().trim()){
              case "chrome" :
                    driver = new ChromeDriver();
               break;

              case "firefox" :
                  driver = new FirefoxDriver();
                  break;
              case "edge" :
                  driver= new EdgeDriver();
                  break;

              default:
               System.out.println("Pls Pass Correct BrowserName :"+browserName);
               throw new BrowserException(AppError.BROWSER_NOT_FOUND);

          }
          driver.manage().window().maximize();
          driver.manage().deleteAllCookies();
          driver.get(url);

          return driver;

    }


    public Properties initProp(Properties prop){
        prop = new Properties();
        String path = "./src/test/resources/config/config.properties";
        try {
            FileInputStream ip = new FileInputStream(path);

           prop.load(ip);
        } catch (FileNotFoundException e) {
            //throw new RuntimeException(e);
            e.printStackTrace();
        }
        catch(IOException ie){

            ie.printStackTrace();
        }

        return prop;
    }


}