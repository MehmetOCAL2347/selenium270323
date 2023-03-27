package com.vuealfasoftware.herokuapp.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SignUpTest {

    private WebDriver driver;

    @BeforeMethod
    public void baslangic(){
        System.setProperty("webdriver.http.factory", "jdk-http-client");
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        driver= new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void test(){
        driver.get("https://vue-alfabank-demo.web.app/sign-up");
    }

    @AfterMethod
    public void bitis(){
        driver.quit();
    }
}
