package smule.pages.Login;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import smule.pages.BasePage;
@Getter
public class LoginOptionLocators  extends BasePage {
    public LoginOptionLocators(){
        PageFactory.initElements(new AppiumFieldDecorator(androidDriver), this);
    }
    @AndroidFindBy(id = "com.smule.singandroid:id/facebook_button_view")
    WebElement faceBookLocator;
    @AndroidFindBy(id = "com.smule.singandroid:id/google_button_view")
    WebElement googleLocator;
    @AndroidFindBy(id = "com.smule.singandroid:id/email_button_view")
    WebElement emailLocator;
    @AndroidFindBy(id = "com.smule.singandroid:id/connect_with_phone")
    WebElement phoneNumberLocator;
    @AndroidFindBy(id = "com.smule.singandroid:id/register_text")
    WebElement headerLocator;
}
