package com.vuealfasoftware.herokuapp.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WindowPages extends BasePageObject{

    private By locatorOfClickHere = By.xpath("//a[@href='/windows/new']");

    public WindowPages(WebDriver driver) {
        super(driver);
    }

    public void openNewPage(){
        click(locatorOfClickHere);
    }

    public NewWindowPage findNewWindow(String expectedTitle){
        findByTitle(expectedTitle);
        return new NewWindowPage(driver);
    }

}
