package Bookswagon_Pages;

//import com.qa.base.TestBase;
import Bookswagon_Base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage extends TestBase
{
    @FindBy(id="//*[@id=\"ctl00_phBody_SignUp_txtName\"]")
    WebElement fullname;

    @FindBy(name="//*[@id=\"ctl00_phBody_SignUp_txtEmail\"]")
    WebElement mobile;

    @FindBy(xpath="//*[@id=\"ctl00_phBody_SignUp_btnContinue\"]")
    WebElement continueButton;

    public SignUpPage()
    {
        PageFactory.initElements(driver, this);
    }
//    public void updatePersonalSettings()
//    {
//        WebElement name=driver.findElement((By)fullname);
//        name.sendKeys("RIHAL FARUKH SHAIKH");
//    }
}
