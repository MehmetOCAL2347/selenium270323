package com.vuealfasoftware.herokuapp.checkboxpagetests;

import com.vuealfasoftware.herokuapp.base.TestUtilities;
import com.vuealfasoftware.herokuapp.pages.CheckBoxPage;
import com.vuealfasoftware.herokuapp.pages.WelcomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckBoxTest extends TestUtilities {

    @Test(dataProvider = "files")
    public void checkBoxTest(String key, String expectedMessage){

        WelcomePage welcomePage = new WelcomePage(driver);
        welcomePage.openPage();

        CheckBoxPage checkBoxPage = welcomePage.getCheckBoxPage();
        checkBoxPage.selectAllCheckboxes();

        Assert.assertTrue(checkBoxPage.areAllCheckBoxesChecked(), expectedMessage);

    }

}
