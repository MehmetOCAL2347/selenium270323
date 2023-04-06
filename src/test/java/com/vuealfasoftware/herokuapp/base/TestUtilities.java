package com.vuealfasoftware.herokuapp.base;

import org.testng.annotations.DataProvider;

public class TestUtilities extends BaseTest{

    protected void sleep(int duration){
        try {
            Thread.sleep(duration);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @DataProvider(name = "files")
    protected static Object[][] files(){
        return new Object[][]{
                {"checkBox-1", "Not all checkboxes are checked"},
                {"checkBox-2", "Not all checkboxes are checked-1"}
                /*{},
                {}*/
        };
    }

}
