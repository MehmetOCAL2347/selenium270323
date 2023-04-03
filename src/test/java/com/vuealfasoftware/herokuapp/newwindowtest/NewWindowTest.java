package com.vuealfasoftware.herokuapp.newwindowtest;

import com.vuealfasoftware.herokuapp.base.TestUtilities;
import com.vuealfasoftware.herokuapp.pages.WelcomePage;
import com.vuealfasoftware.herokuapp.pages.WindowPages;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class NewWindowTest extends TestUtilities {

    @Test
    @Parameters({"expectedTitle"})
    public void newWindowTest(@Optional("New Window") String expectedTitle){

        WelcomePage welcomePage = new WelcomePage(driver);
        welcomePage.openPage();

        WindowPages windowPages = welcomePage.getWindowPages();
        windowPages.openNewPage();

        windowPages.findByTitle(expectedTitle);
    }

}
