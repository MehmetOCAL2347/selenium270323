package com.vuealfasoftware.herokuapp.base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    protected WebDriver driver;
    private BrowserFactory browserFactory;

    @BeforeMethod
    public void startUp(){
        //System.setProperty("webdriver.http.factory", "jdk-http-client");
        //System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        browserFactory = new BrowserFactory("chrome");
        driver= this.browserFactory.createDriver();
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

}
