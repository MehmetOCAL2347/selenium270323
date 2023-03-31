package com.vuealfasoftware.herokuapp.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {

    private WebDriver driver;
    private String browser;

    public BrowserFactory(String browser) {
        System.setProperty("webdriver.http.factory", "jdk-http-client");
        this.browser = browser.toLowerCase();
    }

    /* Refactor edilmeli interface ile çözülebilmeli burası*/
    public WebDriver createDriver(){
        if (browser.equals("firefox")) {
            System.setProperty("webdriver.gecko.driver", "src/main/resources/geckodriver.exe");
            System.out.println("Firefoxx");
            this.driver = new FirefoxDriver();
        }else {
            System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
            System.out.println("Chrome");
            this.driver = new ChromeDriver();
        }
        return this.driver;
    }

}
