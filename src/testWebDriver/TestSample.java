package testWebDriver;

import com.openqa.selenium.FirefoxDriver;
import com.openqa.selenium.WebDriver;

public class TestSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//FirefoxDriver driver = new FirefoxDriver();

		//driver.click();
		WebDriver driver = new FirefoxDriver();
		driver.click();
		driver.sendkeys("Text Box", "sohan.l");
	}

}
