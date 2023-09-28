package smule.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import smule.BaseTest;
import smule.pages.home.HomeScreen;
import smule.pages.login.LoginScreen;
import smule.pages.message.MessageScreen;

public class MessageScreenTest extends BaseTest {
    @Test
    public void shouldTestSendMessage() throws InterruptedException {
        //Arrange
        HomeScreen homeScreen = new LoginScreen().navigateToHomeScreen();
        homeScreen.clickOnNoThanksBtn();
        MessageScreen messageScreen = homeScreen.navigateToMessageScreen();
        //Act
        messageScreen.clickNewChatIcon()
                .enterUserNameForSearch("alfareedTV")
                .selectUser().
                clickOnNextButton().sendMessage("down for the day");
        //Assert
        Assert.assertTrue(messageScreen.isSendMessageBtnClickAble());
    }
}
