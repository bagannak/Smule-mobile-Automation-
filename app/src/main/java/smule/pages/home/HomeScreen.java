package smule.pages.home;

import io.qameta.allure.Step;
import smule.pages.activity.ActivityScreen;
import smule.pages.feed.FeedScreen;
import smule.pages.message.MessageScreen;
import smule.pages.ScreenActions;
import smule.pages.search.SearchScreen;

public class HomeScreen extends HomeLocators {
    ScreenActions screenActions = new ScreenActions();

    @Step("click on no thanks Button")
    public void clickOnNoThanksBtn() {
        getNoThanksBtnLocator().click();
        screenActions.tap();
    }

    @Step("Navigate to Message Screen")
    public MessageScreen navigateToMessageScreen() {
        getMessageIconLocator().click();
        return new MessageScreen();
    }

    @Step("clicking on search button")
    public SearchScreen clickOnSearchButton() {
        getSearchBtnLocator().click();
        return new SearchScreen();
    }

    @Step("Navigate to Feed screen")
    public FeedScreen navigateToFeedScreen() {
        getFeedBtnLocator().click();
        return new FeedScreen();
    }

    @Step("Navigate to Explore screen")
    public ActivityScreen navigateToActivityScreen() {
        getActivityBtnLocator().click();
        new ScreenActions().tap();
        return new ActivityScreen();
    }

    public boolean isToolBarDisplayed() {
        return getToolBarLocator().isDisplayed();
    }
}
