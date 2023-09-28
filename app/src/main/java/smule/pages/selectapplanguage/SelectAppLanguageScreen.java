package smule.pages.selectapplanguage;

import io.qameta.allure.Step;
import smule.pages.login.LoginOptionsScreen;
import smule.pages.ScreenActions;

public class SelectAppLanguageScreen extends SelectAppLanguageLocators {

    @Step("Select language")
    public LoginOptionsScreen selectLanguage(){
        new ScreenActions().scrollToView("Español");
        languageLocator.click();
        okBtnLocator.click();
        return new LoginOptionsScreen();
    }

}
