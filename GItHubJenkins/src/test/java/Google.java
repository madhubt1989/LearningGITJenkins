import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Google {

	@Test
	public void testMethod(){
		WebDriver driver = new FirefoxDriver();

		driver.get("https://www.avis.com");
		System.out.println(driver.getTitle());
		driver.quit();

	}
}
