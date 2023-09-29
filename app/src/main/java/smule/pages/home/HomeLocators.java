package smule.pages.home;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import smule.pages.BasePage;

@Getter
public class HomeLocators extends BasePage {

    public HomeLocators() {
        PageFactory.initElements(new AppiumFieldDecorator(androidDriver), this);
    }


    @AndroidFindBy(id = "com.smule.singandroid:id/toolbar")
    private WebElement toolBarLocator;
    @AndroidFindBy(id = "com.smule.singandroid:id/noButton")
    private WebElement noThanksBtnLocator;
    @AndroidFindBy(id = "com.smule.singandroid:id/action_message_center")
    private WebElement messageIconLocator;
    @AndroidFindBy(id = "com.smule.singandroid:id/pre_search_left_button")
    private WebElement searchBtnLocator;
    @AndroidFindBy(xpath = "//android.widget.FrameLayout[@index = '0']/android.widget.FrameLayout[@index='1']")
    private WebElement feedBtnLocator;
    @AndroidFindBy(xpath = "//android.widget.FrameLayout[@content-desc=\"Activity\"]/android.widget.FrameLayout")
    private WebElement activityBtnLocator;

}
