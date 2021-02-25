package progressive.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

import progressive.testBase.TestBase;

public class VehiclePage extends TestBase {

	WebDriver driver;

	public VehiclePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void aboutVehicle() throws InterruptedException {
		Thread.sleep(2000);
		List<WebElement> vehicleyear = driver
				.findElements(By.xpath("//list-input[@id='VehiclesNew_embedded_questions_list_Year']//ul//li"));
		String year = "2014";
		for (int i = 0; i < vehicleyear.size(); i++) {
			if (vehicleyear.get(i).getText().equals(year)) {
				vehicleyear.get(i).click();
				break;
			}
		}
		Thread.sleep(2000);
		List<WebElement> vehiclemodel = driver
				.findElements(By.xpath("//question[@class='ymm-dropdown make']//label//list-input//ul//li"));
		String model = "Honda";
		for (int i = 0; i < vehiclemodel.size(); i++) {
			if (vehiclemodel.get(i).getText().equals(model)) {
				vehiclemodel.get(i).click();
				break;
			}
		}
		Thread.sleep(2000);
		List<WebElement> vehiclemake = driver.findElements(
				By.xpath("//label[@id='VehiclesNew_embedded_questions_list_Model_Label']//list-input//ul//li"));
		String make = "Civic Hybrid";
		for (int i = 0; i < vehiclemake.size(); i++) {
			if (vehiclemake.get(i).getText().equals(make)) {
				vehiclemake.get(i).click();
				break;
			}
		}
	}

	@FindBy(xpath = "//select[@id='VehiclesNew_embedded_questions_list_VehicleUse']")
	WebElement primaryuse;

	public void chooseVehicleUse() throws InterruptedException {
		Thread.sleep(2000);
		Select myuse = new Select(primaryuse);
		myuse.selectByVisibleText("Personal (to/from work or school, errands, pleasure)");
		Thread.sleep(2000);
	}

	@FindBy(xpath = "//input[@id='VehiclesNew_embedded_questions_list_OneWayMiles']")
	WebElement mileage;

	public void chooseMileage() throws InterruptedException {
		mileage.sendKeys(milesdriven);
		Thread.sleep(2000);
	}

	@FindBy(xpath = "//select[@id=\"VehiclesNew_embedded_questions_list_OwnOrLease\"]")
	WebElement ownlease;

	public void chooseOwnership() throws InterruptedException {
		Select ownership = new Select(ownlease);
		String own = "Own";
		ownership.selectByVisibleText(own);
		Thread.sleep(2000);
	}

	@FindBy(xpath = "(//button[@tabindex=\"-2\"])[3]")
	WebElement donebtn;

	public void donebutton() {
		donebtn.click();
	}

	@FindBy(xpath = "(//button[@tabindex=\"-2\"])[3]")
	WebElement continuebtn;

	public void continuebutton() {
		continuebtn.click();
	}

}
