package smule.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import smule.BaseTest;
import smule.pages.Home.HomeScreen;
import smule.pages.Login.LoginScreen;
import smule.pages.Message.MessageScreen;

public class MessageScreenTest extends BaseTest {
    @Test
    public void shouldTestSendMessage() throws InterruptedException {
        //Arrange
        HomeScreen homeScreen = new LoginScreen().navigateToHomeScreen();
        homeScreen.clickOnNoThanksBtn();
        MessageScreen messageScreen = homeScreen.navigateToMessageScreen();
        //Act
        messageScreen.clickNewChatIcon()
                .enterUserName("vineettv")
                .selectUserProfile().
                clickOnNextButton().sendMessage("down for the day");
        //Assert
        Assert.assertTrue(messageScreen.isSendMessageBtnClickAble());
    }
}
