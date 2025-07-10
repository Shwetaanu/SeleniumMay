package TestScripts;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ScreenshotListener implements ITestListener{
	private static ExtentReports extent;
    private static ExtentTest test;
    
    @Override
    public void onStart(ITestContext context) {
        String reportPath = "extent-report/ExtentReport_" + getTimeStamp() + ".html";
        ExtentSparkReporter spark = new ExtentSparkReporter(reportPath);
        extent = new ExtentReports();
        extent.attachReporter(spark);
        extent.setSystemInfo("Project", "Selenium TestNG Framework");
        extent.setSystemInfo("Tester", "Your Name");
    }
    @Override
    public void onTestStart(ITestResult result) {
        test = extent.createTest(result.getMethod().getMethodName());
    }
    @Override
    public void onTestSuccess(ITestResult result) {
        test.pass("Test Passed");
    }
    @Override
    public void onTestSkipped(ITestResult result) {
        test.skip("Test Skipped");
    }

    @Override
    public void onFinish(ITestContext context) {
        extent.flush();
    }
    
    private String getTimeStamp() {
        return new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
    }
    
	@Override
public void onTestFailure(ITestResult result)
{
		test.fail("Test Failed: " + result.getThrowable());
		Object testClass = result.getInstance();
		 WebDriver driver = ((baseTestclass)testClass).driver;

        // Get WebDriver from test class
        //WebDriver driver = DriverManager.getDriver();
        String testname= result.getMethod().getMethodName();
        ScreenshotUtil.takeScreenshot(driver, testname);
}
}
