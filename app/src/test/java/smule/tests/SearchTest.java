package smule.tests;

import common_utils.ConfigLoader;
import common_utils.FilePaths;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import smule.BaseTest;
import smule.pages.ScreenActions;
import smule.pages.home.HomeScreen;
import smule.pages.login.LoginOptionsScreen;
import smule.pages.login.LoginScreen;
import smule.pages.message.MessageScreen;
import smule.pages.search.SearchScreen;
import smule.pages.selectapplanguage.SelectAppLanguageScreen;

import java.util.Map;

public class SearchTest extends BaseTest {
    @Test
    public void shouldTestSearch() {
        //Arrange
        HomeScreen homeScreen = new LoginScreen().navigateToHomeScreen();
        homeScreen.clickOnNoThanksBtn();

        SearchScreen searchScreen = homeScreen.clickOnSearchButton();
        String text = "Kannada";
        //Act
        searchScreen.enterText(text).clickOnSearchResult();
        //Assert
        Assert.assertTrue(searchScreen.isListOfSearchResultDisplayed());
    }
}
