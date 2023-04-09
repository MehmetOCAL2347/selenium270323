package com.vuealfasoftware.herokuapp.alerttest;

import com.vuealfasoftware.herokuapp.base.CsvDataProviders;
import com.vuealfasoftware.herokuapp.base.TestUtilities;
import com.vuealfasoftware.herokuapp.pages.AlertsPage;
import com.vuealfasoftware.herokuapp.pages.WelcomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Map;

public class AlertTest extends TestUtilities {

    private String expectedAlertText = "I am a JS Alert";
    private String expectedResultText = "You successfully clicked an alert";

    @Test(dataProvider = "csvReader", dataProviderClass = CsvDataProviders.class)
    public void alertTest(Map<String, String> testData){

        String no = testData.get("no");
        String alertMessage = testData.get("alertMessage");

        System.out.println(no + " " + alertMessage);

        WelcomePage welcomePage = new WelcomePage(driver);
        welcomePage.openPage();

        takeScreenShots("OpenJSAlert");


        AlertsPage alertsPage = welcomePage.getAlertPage();
        alertsPage.openJSAlert();



        String alertText = alertsPage.getAlertText();

        Assert.assertEquals(alertText, expectedAlertText);

        alertsPage.acceptAlert();
        String resultText = alertsPage.getResultText();

        Assert.assertEquals(resultText, expectedResultText);

    }

}
