package smule.pages.Login;


public class LoginOptionsScreen extends LoginOptionLocators {
    public LoginScreen selectLoginOption(String option) {
        switch (option) {
            case "google" -> googleLocator.click();
            case "faceBook" -> faceBookLocator.click();
            case "phoneNumber" -> phoneNumberLocator.click();
            default -> emailLocator.click();
        }
        return new LoginScreen();
    }
    public boolean isHeaderDisplayed(){
        return getHeaderLocator().isDisplayed();
    }
}
