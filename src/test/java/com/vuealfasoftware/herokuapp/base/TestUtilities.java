package com.vuealfasoftware.herokuapp.base;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.DataProvider;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.commons.io.FileUtils;

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
                /*{"checkBox-2", "Not all checkboxes are checked-1"}
                {},
                {}*/
        };
    }

    protected void takeScreenShots(String fileName){

        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

        String path = System.getProperty("user.dir")
                + File.separator + "test-output"
                + File.separator + "screenshots"
                + File.separator + getTodaysDate()
                + File.separator + testSuiteName
                + File.separator + testName
                + File.separator + testMethodName
                + File.separator + getSystemTime()
                + " " + fileName + ".png";
        try {
            FileUtils.copyFile(scrFile, new File(path));
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    private static String getTodaysDate(){
        return (new SimpleDateFormat("yyyyMMdd").format(new Date()));
    }

    private String getSystemTime(){
        return (new SimpleDateFormat("HHmmssSSS").format(new Date()));
    }

}
