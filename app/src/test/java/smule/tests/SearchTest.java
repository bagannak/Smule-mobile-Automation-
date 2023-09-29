package smule.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import smule.BaseTest;
import smule.pages.home.HomeScreen;
import smule.pages.login.LoginScreen;
import smule.pages.search.SearchScreen;

public class SearchTest extends BaseTest {
    @Test(groups = {"run-all","sanity"})
    public void shouldTestSearch() {
        //Arrange
        HomeScreen homeScreen = new LoginScreen().navigateToHomeScreen();
        homeScreen.clickOnNoThanksBtn();
        SearchScreen searchScreen = homeScreen.clickOnSearchButton();
        String text = "Heeriye";
        //Act
        searchScreen.enterText(text).clickOnSearchResult();
        //Assert
        Assert.assertTrue(searchScreen.isListOfSearchResultDisplayed());
    }
}
