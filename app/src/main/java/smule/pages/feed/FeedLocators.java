package smule.pages.feed;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import smule.pages.BasePage;
@Getter
public class FeedLocators extends BasePage {
    public FeedLocators() {
        PageFactory.initElements(new AppiumFieldDecorator(androidDriver), this);
    }
    @AndroidFindBy(xpath = "//android.widget.FrameLayout[@resource-id = 'com.smule.singandroid:id/card_view' and @index='0']/android.widget.RelativeLayout[@index='0']")
    private WebElement feedCard;
    @AndroidFindBy(xpath = "(//android.widget.ImageView[@resource-id='com.smule.singandroid:id/album_art_play_button_overlay'])[1]")
    private WebElement playBtnLocator;


}
