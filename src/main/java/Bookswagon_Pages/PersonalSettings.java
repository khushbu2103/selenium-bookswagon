package Bookswagon_Pages;


import Bookswagon_Base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PersonalSettings extends TestBase
{
    @FindBy(xpath="//*[@id=\"ctl00_phBody_AccountSetting_fvCustomer_plnPersonalSetting\"]/div[2]/h1")
    WebElement personalSettingLable;
    @FindBy(xpath="//*[@id=\"ctl00_phBody_AccountSetting_fvCustomer_txtfname\"]")
    WebElement firstnamePlaceholder;
    @FindBy(xpath="//*[@id=\"ctl00_phBody_AccountSetting_fvCustomer_txtLName\"]")
    WebElement lastnamePlaceholder;
    @FindBy(xpath="//*[@id=\"ctl00_phBody_AccountSetting_fvCustomer_txtemail\"]")
    WebElement emailPlaceholder;
    @FindBy(xpath="//*[@id=\"ctl00_phBody_AccountSetting_fvCustomer_txtFax\"]")
    WebElement faxPlaceholder;
    @FindBy(xpath="//*[@id=\"ctl00_phBody_AccountSetting_fvCustomer_txtProfileName\"]")
    WebElement profileNamePlaceholder;
    @FindBy(xpath="//*[@id=\"ctl00_phBody_AccountSetting_fvCustomer_imgUpdate\"]\n")
    WebElement updateButton;

    public PersonalSettings()
    {
        PageFactory.initElements(driver, this);
    }
    public boolean verifyPersonalSettingLable()
    {
        return personalSettingLable.isDisplayed();
    }
    public boolean enterFirstName() {
        firstnamePlaceholder.sendKeys("RIHAL");
        return false;
    }
    public void enterLastName() {
        lastnamePlaceholder.sendKeys("SHAIKH");
    }
    public void enterEmail() {
        emailPlaceholder.sendKeys("RIHALSHAIKH999@GMAIL.COM");
    }
    public void enterFax() {
        faxPlaceholder.sendKeys("0233266704");
    }
    public void enterProfileName() {
        profileNamePlaceholder.sendKeys("rihalshaikh999");
    }
    public void clickUpdateButton() {
        updateButton.click();
    }
}
