package smule.pages.message;


import io.qameta.allure.Step;

public class MessageScreen extends MessageLocators {
@Step("click on new chat icon")
    public MessageScreen clickNewChatIcon() throws InterruptedException {
        Thread.sleep(8000);
        new MessageLocators();
        newChatIconLocator.click();
        return this;
    }
@Step("Searching user to send message")
    public MessageScreen enterUserNameForSearch(String name){
        searchUserLocator.sendKeys(name);
        searchUserLocator.click();
        return this;
    }

    public MessageScreen selectUser(){
        userNameLocator.click();
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
