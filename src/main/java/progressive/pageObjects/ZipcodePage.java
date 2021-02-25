package progressive.pageObjects;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import progressive.testBase.TestBase;

public class ZipcodePage extends TestBase {

	public Properties pro;
	public WebDriver driver;

	public ZipcodePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@id='zipCode_overlay']")WebElement zcode;
	@FindBy(xpath = "//input[@id='qsButton_overlay']")WebElement getquote;

	public void enterZipcode() throws InterruptedException {
		zcode.sendKeys(zipcode);
		getquote.click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

	}

	