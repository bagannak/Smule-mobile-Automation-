package smule.pages.login;

import common_utils.ConfigLoader;
import common_utils.FilePaths;
import io.qameta.allure.Step;
import smule.pages.home.HomeScreen;
import smule.pages.selectapplanguage.SelectAppLanguageScreen;

import java.util.Map;

public class LoginScreen extends LoginLocators {
    Map credentials = new ConfigLoader().getJSON(FilePaths.CREDENTIALS);
    @Step("Entering username")
    public LoginScreen enterUserName(String name) {
        txtUserName.sendKeys(name);
        return this;
    }
    @Step("click on next button")
    public LoginScreen clickNextButton() {
        btnLogin.click();
        return this;
    }
    @Step("Entering password")
    public LoginScreen enterPassword(String password) {
        txtPassword.sendKeys(password);
        return this;
    }
    @Step("click on login button")
    public HomeScreen clickLoginButton() {
        btnLogin.click();
        return new HomeScreen();
    }
public HomeScreen navigateToHomeScreen(){
        new SelectAppLanguageScreen().selectLanguage();
        new LoginOptionsScreen().selectLoginOption("email");
        enterUserName((String) credentials.get("username"));
        clickNextButton();
        enterPassword((String) credentials.get("password"));
        clickLoginButton();
        return new HomeScreen();

}
    public boolean isTxtUserNameDisplayed(){
        return getTxtUserName().isDisplayed();
    }
}
