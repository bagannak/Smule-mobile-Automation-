package smule.pages.selectapplanguage;

import io.qameta.allure.Step;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import smule.pages.Login.LoginOptionsScreen;
import smule.pages.ScreenActions;
import smule.pages.ScreenWaits;

public class SelectAppLanguageScreen extends SelectAppLanguageLocators {

    @Step("Select language")
    public LoginOptionsScreen selectLanguage(){
        new ScreenActions().scrollToView("Español");
        languageLocator.click();
        okBtnLocator.click();
        return new LoginOptionsScreen();
    }

}
