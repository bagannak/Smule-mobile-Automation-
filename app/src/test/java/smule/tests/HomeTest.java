package smule.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import smule.BaseTest;
import smule.pages.Home.HomeScreen;
import smule.pages.Login.LoginScreen;
import smule.pages.Message.MessageScreen;

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
