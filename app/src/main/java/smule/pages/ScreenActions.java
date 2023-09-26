package smule.pages;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.WebElement;

public class ScreenActions extends BasePage{
    public void scrollToView(String text){
        WebElement element = (WebElement) androidDriver.findElement(MobileBy.AndroidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true))"
                        + ".scrollIntoView(new UiSelector().textContains(\""+text+"\"))"));
    }
}
