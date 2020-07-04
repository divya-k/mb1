import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import org.junit.Test;
import java.net.MalformedURLException;

public class UiCatalogTest extends base{
    @Test
    public void clickAlerts() throws MalformedURLException {
        IOSDriver<IOSElement> driver =setup();
        driver.findElementByAccessibilityId("Alert Views").click();
        driver.findElementByXPath("//*[@value='Text Entry']").click();
        driver.findElementByClassName("XCUIElementTypeTextField").sendKeys("hello");
        driver.findElementByName("OK").click();
    }
}
