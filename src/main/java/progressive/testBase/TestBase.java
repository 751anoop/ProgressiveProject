package progressive.testBase;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import progressive.utilities.ReadConfig;

public class TestBase {

	//public static Properties pro;
	
	public static WebDriver driver;
	
	ReadConfig readconfig= new ReadConfig();
	public String baseURL=readconfig.getWebURL();
	public String zipcode=readconfig.getZipcode();
	public String firstname=readconfig.getFirstName();
	public String lastname=readconfig.getLastName();
	public String dateofbirth=readconfig.getDOB();
	public String streetaddress=readconfig.getStreet();
	public String city=readconfig.getCity();
	public String milesdriven=readconfig.getMiles();
	public String primaryemail=readconfig.getEmail();

	
	
	public ExtentHtmlReporter htmlReporter;
	public ExtentReports extent;
	public ExtentTest test;
	
@BeforeTest
public void setUp() {
	htmlReporter=new ExtentHtmlReporter(System.getProperty("user.dir")+ "/test-output/Progressive_ExtentReport.html");
	htmlReporter.config().setDocumentTitle("Automation Report");
	htmlReporter.config().setReportName("Progressive Report");
	htmlReporter.config().setTheme(Theme.STANDARD);
	
	extent=new ExtentReports();
	extent.attachReporter(htmlReporter);
	
	extent.setSystemInfo("Operating System", "MacOS");
	extent.setSystemInfo("Browser", "Chrome");
	extent.setSystemInfo("Host", "LocalHost");
	extent.setSystemInfo("Tester", "Sam Smith");
}

@AfterTest
public void endReport() {
	extent.flush();
}

@AfterMethod
public void getResult(ITestResult result) {
	
	if(result.getStatus()==ITestResult.FAILURE) {
		test.log(Status.FAIL, "Failed " + result.getName());
		test.fail(result.getThrowable());
	}
	else if(result.getStatus()==ITestResult.SUCCESS) {
		test.log(Status.PASS, "Passed "+ result.getName());
	}
	else {
		test.log(Status.SKIP, "Skipped " + result.getName());
		test.skip(result.getThrowable());
	}
}

}
