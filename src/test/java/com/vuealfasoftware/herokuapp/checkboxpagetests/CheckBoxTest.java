package com.vuealfasoftware.herokuapp.checkboxpagetests;

import com.vuealfasoftware.herokuapp.base.TestUtilities;
import com.vuealfasoftware.herokuapp.pages.CheckBoxPage;
import com.vuealfasoftware.herokuapp.pages.WelcomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckBoxTest extends TestUtilities {

    @Test
    public void checkBoxTest(){

        WelcomePage welcomePage = new WelcomePage(driver);
        welcomePage.openPage();

        CheckBoxPage checkBoxPage = welcomePage.getCheckBoxPage();
        checkBoxPage.selectAllCheckboxes();

        Assert.assertTrue(checkBoxPage.areAllCheckBoxesChecked(), "Not all checkboxes are checked");

    }

}
