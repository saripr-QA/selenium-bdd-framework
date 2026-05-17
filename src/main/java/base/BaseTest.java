package base;

import factory.DriverFactory;
import org.openqa.selenium.WebDriver;

public class BaseTest {

    protected WebDriver driver;

    public void setup() {
        driver = DriverFactory.initDriver();
    }

    public void tearDown() {
        DriverFactory.quitDriver();
    }
}