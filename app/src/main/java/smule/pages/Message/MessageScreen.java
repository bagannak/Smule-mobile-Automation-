package smule.pages.Message;


import org.openqa.selenium.Keys;

public class MessageScreen extends MessageLocators {

    public MessageScreen clickNewChatIcon() throws InterruptedException {
        Thread.sleep(8000);
        new MessageLocators();
        newChatIconLocator.click();
        return this;
    }

    public MessageScreen enterUserName(String name){
        searchUserLocator.sendKeys(name);
        searchUserLocator.sendKeys(Keys.ENTER);
        return this;
    }

    public MessageScreen selectUserProfile(){
        profileImageLocator.click();
        return this;
    }
 public MessageScreen clickOnNextButton(){
        nextBtnLocator.click();
        return this;
    }
    public void sendMessage(String message){
       messageInputLocator.sendKeys(message);
       sendMessageBtnLocator.click();
    }

public boolean isSendMessageBtnClickAble(){
        return sendMessageBtnLocator.isEnabled();
}

    public boolean isHeaderDisplayed() {
        return getHeaderLocator().isDisplayed();
    }
}
