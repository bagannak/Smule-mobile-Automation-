package smule.pages.activity;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import smule.pages.BasePage;

@Getter
public class ActivityLocators extends BasePage {
    public ActivityLocators() {
        PageFactory.initElements(new AppiumFieldDecorator(androidDriver), this);
    }

    @AndroidFindBy(xpath = "//android.widget.LinearLayout[@content-desc=\"Notifications\"]/android.widget.LinearLayout")
    private WebElement notificationBtnLocator;
    @AndroidFindBy(xpath = "//android.widget.LinearLayout[@content-desc=\"Invites\"]/android.widget.LinearLayout")
    private WebElement invitesBtnLocator;
    @AndroidFindBy(xpath = "//android.widget.LinearLayout[@content-desc=\"News\"]/android.widget.LinearLayout")
    private WebElement newsBtnLocator;
    @AndroidFindBy(id = "com.smule.singandroid:id/notifications_listview")
    private WebElement notificationListLocator;
    @AndroidFindBy(xpath = "(//*[@resource-id='com.smule.singandroid:id/mOpenCallListItem'])[1]")
    private WebElement inviteItemLocator;
    @AndroidFindBy(xpath = "//*[@text='No news from Smule yet']")
    private WebElement textInNewsSectionLocator;

}
