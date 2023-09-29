package smule.pages.feed;

import io.qameta.allure.Step;

public class FeedScreen extends FeedLocators {
    @Step("checking weather the play button is clickable")
    public boolean isPlayButtonClickable(){
        return getPlayBtnLocator().isEnabled();
    }

    @Step("Is feed Cards are visible")
    public boolean isFeedCardDisplayed(){
        return getFeedCard().isDisplayed();
    }
}
