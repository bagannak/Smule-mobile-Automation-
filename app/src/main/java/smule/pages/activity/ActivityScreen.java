package smule.pages.activity;

import io.qameta.allure.Step;

public class ActivityScreen extends ActivityLocators{
    @Step("navigate to notifications")
    public ActivityScreen navigateToNotifications(){
        getNotificationBtnLocator().click();
        return this;
    }@Step("navigate to invites")
    public ActivityScreen navigateToInvites(){
        getInvitesBtnLocator().click();
        return this;
    }

    @Step("navigate to notifications")
    public ActivityScreen navigateToNew() {
        getNewsBtnLocator().click();
        return this;
    }
    @Step("checking notification list displayed")
    public boolean isNotificationListDisplayed(){
        return getNotificationListLocator().isDisplayed();
    }
    @Step("checking invite item displayed")
    public boolean isInviteItemDisplayed(){
        return getInviteItemLocator().isDisplayed();
    }

    @Step("get text")
    public String getText(){
        return getTextInNewsSectionLocator().getText();
    }


}
