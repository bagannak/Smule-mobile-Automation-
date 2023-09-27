package smule.pages;

import io.appium.java_client.MobileBy;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class ScreenActions extends BasePage{
    public void scrollToView(String language){
        WebElement element = (WebElement) androidDriver.findElement(MobileBy.AndroidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true))"
                        + ".scrollIntoView(new UiSelector().textContains(\""+language+"\"))"));
    }

    public void navigateBack(){
        androidDriver.navigate().back();
    }
    public void tap(){
        new TouchAction((PerformsTouchActions) androidDriver).press(PointOption.point(1002,375))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .release()
                .perform();
    }
}
