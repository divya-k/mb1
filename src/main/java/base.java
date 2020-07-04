import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class base {
    static IOSDriver<IOSElement> driver;

    public static IOSDriver<IOSElement> setup() throws MalformedURLException {

        DesiredCapabilities cap = new DesiredCapabilities();

        cap.setCapability("deviceName", "iPhone 6s");
        cap.setCapability("platformName", "iOS");
        cap.setCapability("platformVersion", "13.0");
        cap.setCapability("automationName", "XCUITest");
        cap.setCapability("app", "/Users/shridharvenkatesh/Library/Developer/Xcode/DerivedData/UIKitCatalog-bpthhnkdgnnsarctpycxyzerqjpc/Build/Products/Debug-iphonesimulator/UIKitCatalog.app");

        driver = new IOSDriver<>(new URL("http://0.0.0.0:4723/wd/hub"), cap);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return driver;
    }
}
