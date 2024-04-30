package pageObjects;

import commons.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pageUIs.HomePageUI;
public class HomePageObject extends BasePage{

    private WebDriver driver;

    public HomePageObject (WebDriver driver){
        this.driver = driver;
    }

    public void clickRegisterLink() {
        waitForElementClickable(driver,HomePageUI.RESGITER_LINK);
        clickToElement(driver, HomePageUI.RESGITER_LINK);

    }

    public boolean isMyAccountLinkDisplayed() {
        waitForElementClickable(driver,HomePageUI.MY_ACCOUNT_LINK);
        return isElementDisplayed(driver,HomePageUI.MY_ACCOUNT_LINK);
    }

    public void clickToMyAccountLink() {
        waitForElementClickable(driver, HomePageUI.MY_ACCOUNT_LINK);
        clickToElement(driver, HomePageUI.MY_ACCOUNT_LINK);
    }
}
