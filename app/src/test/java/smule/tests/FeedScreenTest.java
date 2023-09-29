package smule.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import smule.BaseTest;
import smule.pages.feed.FeedScreen;
import smule.pages.home.HomeScreen;
import smule.pages.login.LoginScreen;

public class FeedScreenTest extends BaseTest {
    @Test(groups = {"run-all","sanity"})
    public void shouldTestIsFeedCardDisplayed() {
        //Arrange
        HomeScreen homeScreen = new LoginScreen().navigateToHomeScreen();
        homeScreen.clickOnNoThanksBtn();
        //Act
        FeedScreen feedScreen = homeScreen.navigateToFeedScreen();
        //Assert
        Assert.assertTrue(feedScreen.isFeedCardDisplayed());
        Assert.assertTrue(feedScreen.isPlayButtonClickable());
    }
}
