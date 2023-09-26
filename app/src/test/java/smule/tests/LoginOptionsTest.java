package smule.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import smule.BaseTest;
import smule.pages.Login.LoginOptionsScreen;
import smule.pages.Login.LoginScreen;
import smule.pages.selectapplanguage.SelectAppLanguageScreen;

public class LoginOptionsTest extends BaseTest {
    @Test
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
