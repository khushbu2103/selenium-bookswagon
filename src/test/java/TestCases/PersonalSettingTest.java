package TestCases;

import Bookswagon_Base.TestBase;
import Bookswagon_Pages.HomePage;
import Bookswagon_Pages.LoginPage;
import Bookswagon_Pages.PersonalSettings;
import Bookswagon_Util.TestUtil;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PersonalSettingTest extends TestBase
{
    LoginPage loginPage;
    HomePage homePage;
    TestUtil testUtil;
    PersonalSettings personalSettings;
    public PersonalSettingTest()
    {
        super();
    }
    @BeforeMethod
    public void setUp()
    {
        initialization();
        testUtil=new TestUtil();
        personalSettings=new PersonalSettings();
        loginPage=new LoginPage();
        loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
    }
    @Test(priority = 1)
    public void verifyPersonalSettingLableTest()
    {
        Assert.assertEquals(personalSettings.verifyPersonalSettingLable(), "Personal Settings");
    }
    @Test(priority = 2)
    public void verifyFirstNamePlaceholderTest()
    {
        Assert.assertTrue(personalSettings.enterFirstName());
    }
    @AfterTest
    public void tearDown()
    {
        driver.quit();
    }
}
