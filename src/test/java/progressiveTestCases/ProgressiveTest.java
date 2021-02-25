package progressiveTestCases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import progressive.pageObjects.AboutInsurancePage;
import progressive.pageObjects.AddDriverPage;
import progressive.pageObjects.BundleInsurancePage;
import progressive.pageObjects.DriversPage;
import progressive.pageObjects.HomePage;
import progressive.pageObjects.StartFormPage;
import progressive.pageObjects.VehiclePage;
import progressive.pageObjects.ZipcodePage;
import progressive.testBase.TestBase;
import progressive.utilities.ScreenShotUtility;

public class ProgressiveTest extends TestBase {
	WebDriver driver;

	@BeforeTest
	public void setup() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				".//Drivers//chromedriver");
		driver = new ChromeDriver();
		driver.get(baseURL);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}

	@Test
	public void testCase1(){
	test=extent.createTest("testCase1");	
		HomePage hp = new HomePage(driver);
		hp.clickAutolink();
	}
	@Test
	public void testCase2() throws InterruptedException {
		test=extent.createTest("testCase2");	

		ZipcodePage zp = new ZipcodePage(driver);
		zp.enterZipcode();
		Thread.sleep(3000);
	}
	@Test
	public void testCase3() throws InterruptedException {
		test=extent.createTest("testCase3");	

		StartFormPage sp = new StartFormPage(driver);
		sp.formStart();
		Thread.sleep(3000);
	}
	@Test
	public void testCase4() throws InterruptedException {	
		test=extent.createTest("testCase4");	

		VehiclePage vp=new VehiclePage(driver);
		vp.aboutVehicle();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		vp.chooseVehicleUse();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		vp.chooseMileage();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		vp.chooseOwnership();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		vp.donebutton();
		Thread.sleep(3000);
		vp.continuebutton();
		Thread.sleep(3000);
	}

	@Test
	public void testCase5() throws InterruptedException {
		test=extent.createTest("testCase5");	

	DriversPage dp=new DriversPage(driver);
	dp.chooseGender();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	dp.chooseMaritalStatus();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	dp.chooseEducationLevel();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	dp.chooseEmploymentStatus();
	Thread.sleep(3000);
	dp.chooseResidencyStatus();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	dp.chooseLicenseStatus();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	dp.accidentsViolations();
	Thread.sleep(3000);
	}
	
	@Test
	public void testCase6() throws InterruptedException {
		test=extent.createTest("testCase6");	

	AddDriverPage ad=new AddDriverPage(driver);
	ad.addAnotherDriver();
	Thread.sleep(3000);
	}
	
	@Test
	public void testCase7() throws InterruptedException {
		test=extent.createTest("testCase7");	

	AboutInsurancePage ai=new AboutInsurancePage(driver);
	ai.chooseProgressiveHistory();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	ai.chooseContinuousPolicy();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	ai.enterLastInsuranceLimit();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	ai.enterEmail();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	ai.clickContinue();
	Thread.sleep(4000);
	}
	
	@Test
	public void testCase8() throws InterruptedException {
		test=extent.createTest("testCase8");	

	BundleInsurancePage bp=new BundleInsurancePage(driver);
	bp.continuebutton();
	Thread.sleep(4000);
	}
	
	@AfterTest	
	public void terminate() throws InterruptedException, WebDriverException, IOException {
		ScreenShotUtility screenshot=new ScreenShotUtility();
		screenshot.takeSnapShot(driver, "ProgressiveQuoteFound");
		Thread.sleep(3000);
		driver.quit();
	}

}