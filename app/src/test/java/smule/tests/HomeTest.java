package smule.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import smule.BaseTest;
import smule.pages.home.HomeScreen;
import smule.pages.login.LoginScreen;
import smule.pages.message.MessageScreen;

public class HomeTest extends BaseTest {
    @Test
    public void shouldTestNavigateToMessageScreen(){
        //Arrange
        LoginScreen loginScreen = new LoginScreen();
        //Act
        HomeScreen homeScreen = loginScreen.navigateToHomeScreen();
        homeScreen.clickOnNoThanksBtn();
        MessageScreen messageScreen = homeScreen.navigateToMessageScreen();

        //Assert
        Assert.assertTrue(messageScreen.isHeaderDisplayed());
    }
}
