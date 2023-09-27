package smule.pages.Home;

import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import io.qameta.allure.Step;
import smule.pages.Message.MessageScreen;
import smule.pages.ScreenActions;

import java.time.Duration;

public class HomeScreen extends HomeLocators {
    ScreenActions screenActions = new ScreenActions();
    @Step("click on no thanks Button")
    public void clickOnNoThanksBtn(){
       getNoThanksBtnLocator().click();
       screenActions.tap();
    }
    @Step("Navigate to Message Screen")
    public MessageScreen navigateToMessageScreen(){
        getMessageIconLocator().click();
        return new MessageScreen();
    }
public boolean isToolBarDisplayed(){
    return getToolBarLocator().isDisplayed();
}
}
