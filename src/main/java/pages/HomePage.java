package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    private By dashboardText = By.xpath("//h6[text()='Dashboard']");

    public boolean isDashboardDisplayed() {
        return elementUtil.getElement(dashboardText).isDisplayed();
    }
}