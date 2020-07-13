import org.junit.experimental.categories.Category;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

//@Category(IntegrationTest.class)
public class ITCase {
	@Test
	public void f() throws InterruptedException {
		Thread.sleep(5000);
		WebDriverManager.chromedriver().setup();
		System.out.println("testCallled");
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:7776/helloworld");
		System.out.println("testCallled");

		Assert.assertTrue(driver.findElement(By.tagName("h2")).getText().equals(""));
		driver.quit();

	}
}
