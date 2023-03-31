package com.vuealfasoftware.herokuapp.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropdownPage extends BasePageObject{

    private By locatorOfDropdown = By.id("dropdown");

    public DropdownPage(WebDriver driver) {
        super(driver);
    }

    public void selectOption(int selectOptionIndex){

        WebElement dropDown = find(locatorOfDropdown);
        Select dropDownSelect = new Select(dropDown);

        // There are three ways to use Select class
        // #1
        dropDownSelect.selectByIndex(selectOptionIndex);

        // #2
        //dropDownSelect.selectByValue("" + selectOptionIndex);

        // #3
        // dropDownSelect.selectByVisibleText("Option " + selectOptionIndex);

    }

    public String getSelectedOption(){
        WebElement dropdownElement = find(locatorOfDropdown);
        Select dropdown = new Select(dropdownElement);
        String selectedOption = dropdown.getFirstSelectedOption().getText();
        return selectedOption;
    }

}
