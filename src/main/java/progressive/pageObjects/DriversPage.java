package progressive.pageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import progressive.testBase.TestBase;

public class DriversPage extends TestBase {
	
	WebDriver driver;
	
	public DriversPage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@id='DriversAddPniDetails_embedded_questions_list_Gender_M']") WebElement gender;
	public void chooseGender() {
		gender.click();
	}
	
	@FindBy(xpath="//select[@id='DriversAddPniDetails_embedded_questions_list_MaritalStatus']") WebElement maritalStatus;
	public void chooseMaritalStatus() {
	Select marital=new Select(maritalStatus);
	marital.selectByVisibleText("Single");
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	
	@FindBy(xpath="//select[@id='DriversAddPniDetails_embedded_questions_list_HighestLevelOfEducation']") WebElement educationstatus;
	public void chooseEducationLevel() {
	Select Education=new Select(educationstatus);
	Education.selectByVisibleText("College degree");
	driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	}
	
	@FindBy(xpath="//select[@id='DriversAddPniDetails_embedded_questions_list_EmploymentStatus']") WebElement employmentstatus;
	public void chooseEmploymentStatus() {
	Select employment=new Select(employmentstatus);
	employment.selectByVisibleText("Student (full time)");
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	
	@FindBy(xpath="//select[@id='DriversAddPniDetails_embedded_questions_list_PrimaryResidence']") WebElement residencystatus;
	public void chooseResidencyStatus() {
	Select residency=new Select(residencystatus);
	residency.selectByVisibleText("Own home");
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	
	@FindBy(xpath="//select[@id='DriversAddPniDetails_embedded_questions_list_LicenseStatus']") WebElement licensestatus;
	public void chooseLicenseStatus() {
	Select license=new Select(licensestatus);
	license.selectByVisibleText("Permit");
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	
	public void accidentsViolations() throws InterruptedException {
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='DriversAddPniDetails_embedded_questions_list_DriverLicenseNonUS_N']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='DriversAddPniDetails_embedded_questions_list_HasAccidentsOrClaims_N']")).click();
	driver.findElement(By.xpath("//input[@id='DriversAddPniDetails_embedded_questions_list_HasDwiViolations_N']")).click();
	driver.findElement(By.xpath("//input[@id='DriversAddPniDetails_embedded_questions_list_HasTicketsOrViolations_N']")).click();
	driver.findElement(By.xpath("(//button[@tabindex='-2'])[1]")).click();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	
	
	
	
	

	
}
