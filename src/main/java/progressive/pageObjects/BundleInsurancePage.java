package progressive.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import progressive.testBase.TestBase;

public class BundleInsurancePage extends TestBase {

	WebDriver driver;

	public BundleInsurancePage (WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//button[@tabindex='-2'])[4]")
	WebElement continuebtn;

	public void continuebutton() {
		continuebtn.click();
	}

}
