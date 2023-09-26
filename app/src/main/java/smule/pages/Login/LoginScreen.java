package smule.pages.Login;

import io.qameta.allure.Step;
import smule.pages.Home.HomeScreen;

public class LoginScreen extends LoginLocators {
    @Step("Entering username")
    public LoginScreen enterOrgName(String name) {
        txtUserName.sendKeys(name);
        return this;
    }
    @Step("click on next button")
    public LoginScreen clickNextButton1() {
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
    public boolean isTxtUserNameDisplayed(){
        return getTxtUserName().isDisplayed();
    }
}
