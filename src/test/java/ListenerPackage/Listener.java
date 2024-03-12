package ListenerPackage;

import Bookswagon_Base.TestBase;
import com.aventstack.extentreports.ExtentTest;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Listeners;
import org.testng.internal.annotations.IListeners;

public class Listener extends TestBase implements ITestListener {
    public void onTestStart(ITestResult result) {
        System.out.println(".....onTestStart...... "+ result.getName());
        extent.attachReporter(spark);

    }
    public void onTestSuccess(ITestResult result) {
        System.out.println(".....onTestSuccess...... "+ result.getName());
        ExtentTest extentTest = extent.createTest(result.getName());
        extentTest.pass("text successfully pass");
        extent.flush();
    }


    public void onTestFailure(ITestResult result) {
        System.out.println(".....onTestFailure...... "+ result.getName());
        ExtentTest extentTest = extent.createTest(result.getName());
        extentTest.fail("text failed");
        extent.flush();
    }



    public void onTestSkipped(ITestResult result) {
        System.out.println(".....onTestSkipped...... "+ result.getName());
        ExtentTest extentTest = extent.createTest(result.getName());
        extentTest.pass("text skipped");
        extent.flush();
    }
}
