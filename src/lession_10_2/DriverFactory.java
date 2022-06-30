package lession_10_2;

public class DriverFactory {
    public AppiumDriver getAppiumDriver() {
        AppiumDriver appiumDriver;
        String platform = System.getenv("platform");
        if (platform.equals("iOS")) {
            appiumDriver = new IOSDriver();
        } else if (platform.equals("Android")) {
            appiumDriver = new AndroidDriver();
        } else {
            throw new IllegalArgumentException("[ERR] Please select proper driver");
        }
        return appiumDriver;
    }
}
