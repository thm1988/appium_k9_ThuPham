package lession_10_2;

public class TestAppiumDriver {
    public static void main(String[] args) {
        AppiumDriver appiumDriver = new DriverFactory().getAppiumDriver();
        appiumDriver.initDriver();
    }
}
