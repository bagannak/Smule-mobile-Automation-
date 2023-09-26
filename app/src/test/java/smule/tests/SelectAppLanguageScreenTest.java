package smule.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import smule.BaseTest;
import smule.pages.Login.LoginOptionsScreen;
import smule.pages.selectapplanguage.SelectAppLanguageScreen;

public class SelectAppLanguageScreenTest extends BaseTest {
    @Test
    public void shouldTestSelectLanguage(){
        //Arrange
        SelectAppLanguageScreen selectAppLanguageScreen = new SelectAppLanguageScreen();
        //Act
        LoginOptionsScreen loginOptionsScreen = selectAppLanguageScreen.selectLanguage();
        //Assert
        Assert.assertTrue(loginOptionsScreen.isHeaderDisplayed());
    }
}
