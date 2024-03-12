package Bookswagon_Pages;

//import com.qa.base.TestBase;
import Bookswagon_Base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends TestBase
{
    //page factory - Object Repo
    @FindBy(id="ctl00_phBody_SignIn_txtEmail")
    WebElement usernameEmail;

    @FindBy(name="ctl00$phBody$SignIn$txtPassword")
    WebElement password;

    @FindBy(xpath="//*[@id=\"ctl00_phBody_SignIn_btnLogin\"]")
    WebElement loginButton;

    @FindBy(xpath="//*[@id=\"ctl00_phBody_SignIn_plnLoginPassword\"]/div[4]/div/a")
    WebElement signUpButton;

    @FindBy(xpath="//*[@id=\"aspnetForm\"]/header/div[2]/div/div[1]/a/img")
    WebElement logo;

    public LoginPage()
    {
        PageFactory.initElements(driver, this);
    }
    public String validateLoginPageTitle()
    {
        return driver.getTitle();
    }
    public boolean validateImage()
    {
        return logo.isDisplayed();
    }
    public void login(String un, String pwd)
    {
        usernameEmail.sendKeys(un);
        password.sendKeys(pwd);
        loginButton.click();
//        return new HomePage();
    }public void multipleLogin(String un, String pwd)
    {
        usernameEmail.sendKeys(un);
        password.sendKeys(pwd);
        loginButton.click();
//        return new HomePage();
    }
}