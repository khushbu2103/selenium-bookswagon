package TestCases;

import Bookswagon_Base.TestBase;
import Bookswagon_Pages.HomePage;
import Bookswagon_Pages.LoginPage;
import Bookswagon_Util.TestUtil;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import org.apache.poi.ss.usermodel.Sheet;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.logging.Logger;
@Listeners(ListenerPackage.Listener.class)
public class LoginPageTest extends TestBase
{
    LoginPage loginPage;
    HomePage homePage;
    TestUtil testUtil;
    public LoginPageTest() throws ClassNotFoundException {
        super();
    }
    static String sheetName = "sheet1";
    Logger log = Logger.getLogger(String.valueOf(Class.forName(LoginPageTest.class.getName())));
    @BeforeMethod
    public void setUp1()
    {
        initialization();
        loginPage=new LoginPage();
        testUtil = new TestUtil();
    }

    @Test(priority = 1)
    @Severity(SeverityLevel.BLOCKER)
    @Story("User enter valid username & password")
    public void loginTest()
    {
        loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
    }

    @Test(priority = 2)
    @Severity(SeverityLevel.BLOCKER)
    public void loginPageTitleTest()
    {
        String title=loginPage.validateLoginPageTitle();
        Assert.assertEquals(title, "Online BookStore India, Buy Books Online, Buy Book Online India - Bookswagon.com");
    }
//    @AfterMethod
//    public void tearDown2()
//    {
//        driver.quit();
//    }
    @DataProvider
    public static Object[][] getLoginTestData() throws IOException {
        Object data[][] = TestUtil.workBook(sheetName);
        return data;
    }
@Test(dataProvider = "getLoginTestData", priority = 3)
@Severity(SeverityLevel.CRITICAL)
    public void multiUserLoginTest(String userName, String password)
    {
        log.info("Multiple user login method");
        loginPage.multipleLogin(userName, password);
    }
}
