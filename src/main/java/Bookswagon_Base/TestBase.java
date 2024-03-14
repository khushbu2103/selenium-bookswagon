package Bookswagon_Base;

//import com.qa.util.TestUtil;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
public class TestBase
{
    public static WebDriver driver;
    public static Properties prop;
    public ExtentReports extent = new ExtentReports();
    public ExtentSparkReporter spark = new ExtentSparkReporter("C:\\Users\\LENOVO\\IdeaProjects\\PageObjectModel\\ExternalReport\\ExternalReport.html");
    public TestBase()
    {
        try {
            prop=new Properties();
            FileInputStream ip=new FileInputStream("/Users/LENOVO/IdeaProjects/PageObjectModel/src/main/java/Bookswagon_Config/Config.properties");
            prop.load(ip);
        }
        catch(FileNotFoundException e)
        {
            e.printStackTrace();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
    public static void initialization()
    {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.bookswagon.com/");
        WebElement myAccountButton= driver.findElement(By.id("ctl00_lblUser"));
        myAccountButton.click();
    }
}
