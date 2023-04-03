package com.vuealfasoftware.herokuapp.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AlertsPage extends BasePageObject{

    private By locatorOfAlert = By.xpath("//button[@onclick='jsAlert()']");
    private By locatorOfConfirm = By.xpath("//button[@onclick='jsConfirm()']");
    private By locatorOfPrompt = By.xpath("//button[@onclick='jsPrompt()']");
    private By locatorOfResultText = By.id("result");

    public AlertsPage(WebDriver driver) {
        super(driver);
    }

    public void openJSAlert(){
        click(locatorOfAlert);
    }

    public void openJSConfirm(){
        click(locatorOfConfirm);
    }

    public void openJSPrompt() {
        click(locatorOfPrompt);
    }

    public String getAlertText(){
        Alert alert = switchToAlert();
        String alertText = alert.getText();
        return alertText;
    }

    public void acceptAlert(){
        Alert alert = switchToAlert();
        alert.accept();
    }

    public void dismissAlert(){
        Alert alert = switchToAlert();
        alert.dismiss();
    }

    public void typeTextIntoAlert(String text){
        Alert alert = switchToAlert();
        alert.sendKeys(text);
    }

    public String getResultText(){
        WebElement resultText = find(locatorOfResultText);
        String textValue = resultText.getText();
        return textValue;
    }

}
