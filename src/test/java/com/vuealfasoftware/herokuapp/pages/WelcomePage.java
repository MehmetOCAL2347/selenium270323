package com.vuealfasoftware.herokuapp.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WelcomePage extends BasePageObject{

    private String pageUrl = "https://the-internet.herokuapp.com/";
    private By loginPageLocator = By.xpath("//a[@href='/login']");
    private By checkBoxLocator = By.xpath("//a[@href='/checkboxes']");

    public WelcomePage(WebDriver driver) {
        super(driver);
    }

    /** Bu method ile istenen sayfanın açılması sağlanır */
    public void openPage(){
        openPage(pageUrl);
    }

    /** Login sayfasına gitmek için kullanılır*/
    public LoginPage getLoginPage(){
        click(loginPageLocator);
        return new LoginPage(driver);
    }

    public CheckBoxPage getCheckBoxPage(){
        click(checkBoxLocator);
        return new CheckBoxPage(driver);
    }

}
