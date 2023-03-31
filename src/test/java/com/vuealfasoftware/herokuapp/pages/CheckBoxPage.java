package com.vuealfasoftware.herokuapp.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CheckBoxPage extends BasePageObject{

    private By locatorOfCheckBox = By.xpath("//input[@type='checkbox']");

    public CheckBoxPage(WebDriver driver) {
        super(driver);
    }

    public void selectAllCheckboxes(){
        List<WebElement> checkBoxes = findAll(locatorOfCheckBox);
        for(WebElement checkBox: checkBoxes){
            if(!checkBox.isSelected()){
                checkBox.click();
            }
        }
    }

    public boolean areAllCheckBoxesChecked(){
        List<WebElement> checkBoxes = findAll(locatorOfCheckBox);
        for(WebElement checkBox: checkBoxes){
            if(!checkBox.isSelected()){
                return false;
            }
        }
        return true;
    }

}
