package com.vuealfasoftware.herokuapp.dropdowntest;

import com.vuealfasoftware.herokuapp.base.TestUtilities;
import com.vuealfasoftware.herokuapp.pages.DropdownPage;
import com.vuealfasoftware.herokuapp.pages.WelcomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DropdownTest extends TestUtilities {

    @Test
    public void dropdownTest(){

        WelcomePage welcomePage = new WelcomePage(driver);
        welcomePage.openPage();

        DropdownPage dropdownPage = welcomePage.getDropdownPage();
        dropdownPage.selectOption(2);

        Assert.assertEquals(dropdownPage.getSelectedOption(), "Option 2", "Not equals selected values");

    }

}
