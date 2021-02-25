package progressive.utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;

public class ScreenShotUtility {

	public void takeSnapShot(WebDriver driver, String screenShotName) throws WebDriverException, IOException {
		try {
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("./Screenshots/"+ screenShotName+ ".jpeg"));
		Thread.sleep(2000);
		System.out.println("Screenshot taken");
		}catch(Exception e) {
			System.out.println("Exception while taking Screenshot"+ e.getMessage());
			e.printStackTrace();
		}
	
	}
}
