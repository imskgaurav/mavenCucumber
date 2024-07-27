package com.qa.opencart.base;

import com.qa.opencart.factory.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Properties;

public class BaseTest {


    DriverFactory df;

    WebDriver driver;
    protected Properties prop;
    private final String propertyFilePath="/src/test/resources/config/config.properties";

    public void setUp(String browserName){

       df = new DriverFactory();
      // prop=//


        if(browserName!=null){

            driver = new ChromeDriver();
        }

    }



}
