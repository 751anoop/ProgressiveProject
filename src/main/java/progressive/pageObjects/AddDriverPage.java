package progressive.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import progressive.testBase.TestBase;

public class AddDriverPage extends TestBase{
		
		WebDriver driver;
		
		public AddDriverPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		}
		
		@FindBy(xpath="(//button[@tabindex='-2'])[3]") WebElement adddriver;
		public void addAnotherDriver() {
			adddriver.click();
		}

}
