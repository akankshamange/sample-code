package Extent_Report;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Generate_Report {

	public static void main(String[] args) {
		ExtentSparkReporter SparkReporter=new ExtentSparkReporter("//.ExtentReports//LoginPage_report.html");
		SparkReporter.config().setDocumentTitle("Automation Test Report");
		SparkReporter.config().setTheme(Theme.DARK);
		
		ExtentReports reports=new ExtentReports();
		reports.setSystemInfo("Environment","QA");
		reports.setSystemInfo("Tester name","Akanksha");
		reports.setSystemInfo("Browser","Chrome");
		reports.attachReporter(SparkReporter);
		ExtentTest test=reports.createTest("Test case");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://javabykiran.com/selenium/login.html");
		
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.id("password")).sendKeys("password");
		driver.findElement(By.className("btn-primary")).click();
		
		if(driver.getTitle().equals("Admin Panel-Manage Categories"))
		{
			test.pass("Test case passed");
			
		}
		else
		{
			test.fail("Test case Failed");
		}
		reports.flush();
		driver.quit();
	}

}
