package utils;

import factory.DriverFactory;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;

public class ScreenshotUtil {

    public static String captureScreenshot(String testName) {

        String screenshotDir =
                System.getProperty("user.dir")
                        + "/screenshots/";

        File directory = new File(screenshotDir);

        if (!directory.exists()) {

            directory.mkdirs();
        }

        File src = ((TakesScreenshot)
                DriverFactory.getDriver())
                .getScreenshotAs(OutputType.FILE);

        String path = screenshotDir
                + testName + "_"
                + DateUtil.getTimeStamp()
                + ".png";

        try {

            FileUtils.copyFile(src, new File(path));

        } catch (Exception e) {

            e.printStackTrace();
        }

        return path;
    }
}