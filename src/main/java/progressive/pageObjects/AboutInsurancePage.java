package progressive.pageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import progressive.testBase.TestBase;

public class AboutInsurancePage extends TestBase{
	
	WebDriver driver;
	
	public AboutInsurancePage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@id='FinalDetailsEdit_embedded_questions_list_OtherPolicies_N']") WebElement otherpolicy;
	public void chooseProgressiveHistory() throws InterruptedException {
	Thread.sleep(2000);
	otherpolicy.click();
	}
	
	@FindBy(xpath="//input[@id='FinalDetailsEdit_embedded_questions_list_ContinuousInsuranceThreeYears_Y']")WebElement continuouspolicy;
	public void chooseContinuousPolicy() throws InterruptedException {
	Thread.sleep(2000);
	continuouspolicy.click();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	
	@FindBy(xpath="//select[@id='FinalDetailsEdit_embedded_questions_list_BodilyInjuryLimits']") WebElement recentinsurance;
	public void enterLastInsuranceLimit() {
	Select insurance=new Select(recentinsurance);
	insurance.selectByVisibleText("$15,000/$30,000 (State Min) or less");
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	
	@FindBy(xpath="//input[@id='FinalDetailsEdit_embedded_questions_list_PrimaryEmailAddress']") WebElement email;
	public void enterEmail() {
	email.sendKeys(primaryemail);
	}
	
	@FindBy(xpath="(//button[@tabindex='-2'])[1]") WebElement continuepage;
	public void clickContinue() {
	continuepage.click();
	}
	
	
	

}
