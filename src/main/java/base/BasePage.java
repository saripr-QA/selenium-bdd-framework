package base;

import org.openqa.selenium.WebDriver;
import utils.ElementUtil;
import utils.JavaScriptUtil;
import utils.WaitUtil;

public class BasePage {

    protected WebDriver driver;
    protected ElementUtil elementUtil;
    protected WaitUtil waitUtil;
    protected JavaScriptUtil jsUtil;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        elementUtil = new ElementUtil(driver);
        waitUtil = new WaitUtil(driver);
        jsUtil = new JavaScriptUtil(driver);
    }
}
