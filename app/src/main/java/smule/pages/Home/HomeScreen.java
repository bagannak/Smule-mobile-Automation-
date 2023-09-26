package smule.pages.Home;

public class HomeScreen extends HomeLocators {
public boolean isToolBarDisplayed(){
    return getToolBarLocator().isDisplayed();
}
}
