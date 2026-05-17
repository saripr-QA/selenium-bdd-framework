package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementUtil {

    WebDriver driver;

    public ElementUtil(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getElement(By locator) {
        return driver.findElement(locator);
    }

    public void ClickOnElement(By locator) {
        getElement(locator).click();
    }

    public void SendValues(By locator, String value) {
        getElement(locator).sendKeys(value);
    }

    public String getText(By locator) {
        return getElement(locator).getText();
    }
}