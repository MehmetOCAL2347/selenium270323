package com.vuealfasoftware.herokuapp.alerttest;

import com.vuealfasoftware.herokuapp.base.TestUtilities;
import com.vuealfasoftware.herokuapp.pages.AlertsPage;
import com.vuealfasoftware.herokuapp.pages.WelcomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AlertTest extends TestUtilities {

    private String expectedAlertText = "I am a JS Alert";
    private String expectedResultText = "You successfully clicked an alert";

    @Test
    public void alertTest(){

        WelcomePage welcomePage = new WelcomePage(driver);
        welcomePage.openPage();

        AlertsPage alertsPage = welcomePage.getAlertPage();
        alertsPage.openJSAlert();

        String alertText = alertsPage.getAlertText();

        Assert.assertEquals(alertText, expectedAlertText);

        alertsPage.acceptAlert();
        String resultText = alertsPage.getResultText();

        Assert.assertEquals(resultText, expectedResultText);

    }

}
