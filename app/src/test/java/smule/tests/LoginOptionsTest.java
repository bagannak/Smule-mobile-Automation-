package smule.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import smule.BaseTest;
import smule.pages.login.LoginOptionsScreen;
import smule.pages.login.LoginScreen;
import smule.pages.selectapplanguage.SelectAppLanguageScreen;

public class LoginOptionsTest extends BaseTest {
    @Test(groups = {"run-all","sanity"})
    public void shouldTestSelectLoginOption(){
        //Arrange
        SelectAppLanguageScreen selectAppLanguageScreen = new SelectAppLanguageScreen();
        //Act
        LoginOptionsScreen loginOptionsScreen = selectAppLanguageScreen.selectLanguage();
        LoginScreen loginScreen = loginOptionsScreen.selectLoginOption("email");
        //Assert
        Assert.assertTrue(loginScreen.isTxtUserNameDisplayed());
    }
}
