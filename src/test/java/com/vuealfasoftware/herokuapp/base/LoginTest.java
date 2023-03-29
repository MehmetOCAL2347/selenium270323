package com.vuealfasoftware.herokuapp.base;

import com.vuealfasoftware.herokuapp.pages.LoginPage;
import com.vuealfasoftware.herokuapp.pages.WelcomePage;
import org.testng.annotations.Test;

public class LoginTest extends TestUtilities{

    private String userName = "udemySelenium@gmail.com"; // Parametre olarak gönder
    private String password = "udemySelenium!"; // Parametre olarak gönder

    @Test
    public void test(){
        WelcomePage welcomePage = new WelcomePage(driver);
        welcomePage.openPage();

        LoginPage loginPage = welcomePage.getLoginPage();
        loginPage.logIn(userName, password);
    }

}
