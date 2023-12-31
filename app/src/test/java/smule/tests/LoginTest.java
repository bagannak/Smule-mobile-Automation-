package smule.tests;

import common_utils.ConfigLoader;
import common_utils.FilePaths;
import smule.pages.home.HomeScreen;
import smule.pages.login.LoginOptionsScreen;
import smule.pages.login.LoginScreen;
import smule.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import smule.pages.selectapplanguage.SelectAppLanguageScreen;

import java.util.Map;

public class LoginTest extends BaseTest {

    Map credentials = new ConfigLoader().getJSON(FilePaths.CREDENTIALS);

    @Test(description = "Test login in App",groups ={"run-all","sanity"})
    public void testLoginInApp() {
        //Arrange
        SelectAppLanguageScreen selectAppLanguageScreen = new SelectAppLanguageScreen();
        LoginOptionsScreen loginOptionsScreen = selectAppLanguageScreen.selectLanguage();
        LoginScreen loginScreen = loginOptionsScreen.selectLoginOption("email");
        //ACT
        HomeScreen homeScreen = loginScreen.enterUserName((String) credentials.get("username"))
                .clickNextButton()
                .enterPassword((String) credentials.get("password"))
                .clickLoginButton();
        homeScreen.clickOnNoThanksBtn();

        //Assert
        Assert.assertTrue(homeScreen.isToolBarDisplayed());
    }
}
