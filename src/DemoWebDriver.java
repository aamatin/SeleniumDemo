import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class DemoWebDriver {

	/**
	 * @param args
	 */

	FirefoxDriver driver = new FirefoxDriver();
	GetXpathByName byName = new GetXpathByName();
	public static void main(String[] args) {

		DemoWebDriver webDriver = new DemoWebDriver();
		webDriver.openBrowser();
		webDriver.logIn();
	}

	@Test(priority = 0)
	public void openBrowser() {

		driver.navigate().to("http://www.badhan.org/");
		driver.manage().window().maximize();

	}

	@Test(priority = 1)
	public void logIn() {
		driver.findElement(By.xpath(byName.loginUrl)).click();
		driver.findElement(By.xpath(byName.username)).sendKeys(byName.userNameValue);
		driver.findElement(By.xpath(byName.password)).sendKeys(byName.passwordValue);
		driver.findElement(By.xpath(byName.submitButton)).click();

	}
}
