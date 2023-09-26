package smule.pages.selectapplanguage;

import io.appium.java_client.MobileBy;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import smule.pages.BasePage;

import java.time.Duration;

@Getter
public class SelectAppLanguageLocators extends BasePage {
    public SelectAppLanguageLocators(){
        PageFactory.initElements(new AppiumFieldDecorator(androidDriver), this);
    }
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='English' and @index='0']")
    WebElement languageLocator;

    @AndroidFindBy(id="com.smule.singandroid:id/yesButton")
    WebElement okBtnLocator;
}
