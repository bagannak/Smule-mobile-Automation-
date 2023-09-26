package smule.pages.Login;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import lombok.Getter;
import smule.pages.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
@Getter
public class LoginLocators extends BasePage {
    public LoginLocators() {
        PageFactory.initElements(new AppiumFieldDecorator(androidDriver), this);
    }
    @AndroidFindBy(xpath = "//*[@text='Email Address']")
    public WebElement txtUserName;
    @AndroidFindBy(xpath = "//*[@text='your password']")
    public WebElement txtPassword;
    @AndroidFindBy(id= "com.smule.singandroid:id/btn_next")
    public WebElement btnLogin;
}
