package progressive.pageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import progressive.testBase.TestBase;

public class StartFormPage extends TestBase {

	public WebDriver driver;

	public StartFormPage(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@id='NameAndAddressEdit_embedded_questions_list_FirstName']")WebElement fname;
	@FindBy(xpath="//input[@analytics-id='NameAndAddressEdit_LastName']")WebElement lname;
	@FindBy(xpath="//input[@analytics-id='NameAndAddressEdit_DateOfBirth']")WebElement date;
	@FindBy(xpath="//input[@analytics-id='NameAndAddressEdit_MailingAddress']")WebElement street;
	@FindBy(xpath="//input[@analytics-id='NameAndAddressEdit_City']")WebElement ct;
	@FindBy(xpath="(//button[@tabindex='-2'])[1]")WebElement startquote;
	
	public void formStart() throws InterruptedException {
		fname.sendKeys(firstname);
		lname.sendKeys(lastname);
		date.sendKeys(dateofbirth);
		street.click();
		Thread.sleep(2000);
		street.sendKeys(streetaddress);
		ct.sendKeys(Keys.RETURN);
		ct.sendKeys(city);
		startquote.click();
	}

	
	}


