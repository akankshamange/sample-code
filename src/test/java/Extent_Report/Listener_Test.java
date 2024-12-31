package Extent_Report;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.observer.ExtentObserver;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Listener_Test implements ITestListener{

	ExtentReports reports;
	@Override
	public void onStart(ITestContext context) {
		ExtentSparkReporter sparkReporter = new ExtentSparkReporter(".//ExtentReports//Test_report.html");
		reports.setSystemInfo("Environment", "QA");
		reports.setSystemInfo("Tester name", "Akanksha");
		reports.setSystemInfo("Browser", "Chrome");
		reports.attachReporter(sparkReporter);
		
		
	}
	@Override
	public void onTestSuccess(ITestResult result) {
		reports.createTest(result.getName()).log(Status.PASS,"This Test case is Passed ");
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		reports.createTest(result.getName()).log(Status.FAIL,"This Test case is Failed ");
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		reports.createTest(result.getName()).log(Status.SKIP,"This Test case is skipped");
		
	}


	@Override
	public void onFinish(ITestContext context) {
		reports.flush();
	}

}
	





