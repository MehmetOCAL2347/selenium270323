package com.vuealfasoftware.herokuapp.base;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import java.lang.reflect.Method;

public class BaseTest {

    protected WebDriver driver;
    private BrowserFactory browserFactory;

    protected String testSuiteName;
    protected String testName;
    protected String testMethodName;

    @Parameters({ "browser" })
    @BeforeMethod(alwaysRun = true)
    public void startUp(Method method, @Optional("chrome") String browser, ITestContext ctx){
        //System.setProperty("webdriver.http.factory", "jdk-http-client");
        //System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        browserFactory = new BrowserFactory(browser);
        driver= this.browserFactory.createDriver();
        driver.manage().window().maximize();

        this.testSuiteName = ctx.getSuite().getName();
        this.testName = ctx.getName();
        this.testMethodName = method.getName();

    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

}
