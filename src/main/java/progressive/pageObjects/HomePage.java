package progressive.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import progressive.testBase.TestBase;

public class HomePage extends TestBase {

	public WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//a[@data-tracking-label='auto_section']")
	WebElement autolink;

	public void clickAutolink() {
		autolink.click();
		
	}

	
}
