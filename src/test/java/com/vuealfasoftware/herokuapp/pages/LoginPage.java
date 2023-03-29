package com.vuealfasoftware.herokuapp.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePageObject{

    private By locatorOfUserEmail = By.id("userId");
    private By locatorOfPassword = By.id("password");
    private By locatorOfLoginButton = By.id("loginButton");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public WelcomePage logIn(String userName, String password){
        type(userName, locatorOfUserEmail);
        type(password, locatorOfPassword);
        click(locatorOfLoginButton);
        return new WelcomePage(driver);
    }

}
