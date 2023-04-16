package com.vuealfasoftware.herokuapp.logintest;

import com.vuealfasoftware.herokuapp.base.TestUtilities;
import com.vuealfasoftware.herokuapp.pages.LoginPage;
import com.vuealfasoftware.herokuapp.pages.WelcomePage;
import org.openqa.selenium.Cookie;
import org.testng.annotations.Test;

public class LoginTest extends TestUtilities {

    private String userName = "tomsmith"; // Parametre olarak gönder
    private String password = "SuperSecretPassword!"; // Parametre olarak gönder

    @Test
    public void test(){
        WelcomePage welcomePage = new WelcomePage(driver);
        welcomePage.openPage();

        LoginPage loginPage = welcomePage.getLoginPage();
        loginPage.logIn(userName, password);

        Cookie cookie = new Cookie("userName", "tomsmith");
        loginPage.setCookie(cookie);

        String rackSession = loginPage.getCookie("rack.session");
        String cookieUserName = loginPage.getCookie("userName");

        System.out.println(rackSession);
        System.out.println(cookieUserName);

    }

}
