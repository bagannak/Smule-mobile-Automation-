package smule.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import smule.BaseTest;
import smule.pages.activity.ActivityScreen;
import smule.pages.home.HomeScreen;
import smule.pages.login.LoginScreen;

public class ActivityScreenTest extends BaseTest {
    ActivityScreen activityScreen;
    @BeforeClass
    public void setUpActivityScreen(){
        //Arrange
        HomeScreen homeScreen = new LoginScreen().navigateToHomeScreen();
        homeScreen.clickOnNoThanksBtn();
        //Act
        activityScreen = homeScreen.navigateToActivityScreen();
    }
    @Test(groups = "run-all")
    public void shouldTestNotifications(){
        //Act
        boolean notificationListDisplayed = activityScreen.navigateToNotifications().isNotificationListDisplayed();
        //Assert
        Assert.assertTrue(notificationListDisplayed);
    }

    @Test(groups = "run-all")
    public void shouldTestInvites(){
        //Act
        boolean inviteItemDisplayed = activityScreen.navigateToInvites().isInviteItemDisplayed();
        //Assert
        Assert.assertTrue(inviteItemDisplayed);
    }
    @Test(groups = "run-all")
    public void shouldTestNews(){
        //Act
        String text = activityScreen.navigateToNew().getText();
        //Assert
        Assert.assertEquals(text,"No news from Smule yet");
    }
}
