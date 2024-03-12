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

public class HomePageTest extends TestBase
{
    LoginPage loginPage;
    HomePage homePage;
    TestUtil testUtil;
    PersonalSettings personalSetting;
    public HomePageTest()
    {
        super();
    }
    @BeforeMethod
    public void setUp()
    {
        initialization();
        loginPage=new LoginPage();
        testUtil=new TestUtil();
        personalSetting=new PersonalSettings();
        loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
    }
    @Test
    public void verifyHomePageTitleTest()
    {
        String homePageTitle=homePage.verifyHomepageTitle();
        Assert.assertEquals(homePageTitle, "Online BookStore India, Buy Books Online, Buy Book Online India - Bookswagon.com");
    }
    @Test
    public void verifyUserNameTest()
    {
        Assert.assertTrue(homePage.verifyCorrectUserName());
    }
    //    @Test
//    public void verifyOnPersonalSettingTest()
//    {
//        testUtil.switchToFrame();
//        personalSetting=homePage.clickPersonalSettings();
//    }
    @AfterTest
    public void tearDown()
    {
        driver.quit();
    }
}