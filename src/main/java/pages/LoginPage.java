package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    private By username = By.name("username");
    private By password = By.name("password");
    private By loginBtn = By.xpath("//button[@type='submit']");

    public void enterUsername(String user) {
        elementUtil.SendValues(username, user);
    }

    public void enterPassword(String pass) {
        elementUtil.SendValues(password, pass);
    }

    public void clickLogin() {
        elementUtil.ClickOnElement(loginBtn);
    }
}