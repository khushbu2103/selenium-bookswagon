package Bookswagon_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static Bookswagon_Base.TestBase.driver;

//import static com.qa.base.TestBase.driver;

public class HomePage
{
    @FindBy(xpath="//*[@id=\"ctl00_lblUser\"]")
    WebElement userNameLable;
    @FindBy(xpath="//*[@id=\"site-wrapper\"]/div/div/div/div/div/div[1]/div/a/img")
    WebElement personalSetting;
    @FindBy(xpath="//*[@id=\"site-wrapper\"]/div/div/div/div/div/div[2]/div/a/img")
    WebElement myOrders;
    @FindBy(xpath="//*[@id=\"site-wrapper\"]/div/div/div/div/div/div[3]/div/a/img")
    WebElement myWishlist;
    public HomePage()
    {
        PageFactory.initElements(driver, this);
    }
    public String verifyHomepageTitle()
    {
        return driver.getTitle();
    }
    public boolean verifyCorrectUserName()
    {
        return userNameLable.isDisplayed();
    }
    public PersonalSettings clickPersonalSettings()
    {
        myOrders.click();
        return new PersonalSettings();
    }
//    public MyOrders clickOnmyOrders()
//    {
//        myOrders.click();
//        return new MyOrders();
//    }
//    public MyWishlist clickOnMyWishlist()
//    {
//        myOrders.click();
//        return new MyWishlist();
//    }
}
