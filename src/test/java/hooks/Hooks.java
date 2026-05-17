package hooks;

import factory.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utils.ScreenshotUtil;

public class Hooks {

    @Before
    public void setup() {

        DriverFactory.initDriver();
    }

    @AfterStep
    public void captureStepScreenshot(Scenario scenario) {

        ScreenshotUtil.captureScreenshot(
                scenario.getName().replace(" ", "_"));
    }

    @After
    public void tearDown() {

        DriverFactory.quitDriver();
    }
}