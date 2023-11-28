package tejaswinimam;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleDoodle {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com/doodles");
		JavascriptExecutor js = (JavascriptExecutor) driver;

		for (;;) {

			try {
			 driver.findElement(By.xpath("//a[text()='Celebrating Filipino Adobo']")).click();

				break;

			} catch (Exception e) {

				js.executeScript("window.scrollBy(0, 500)");
			}
		}
		Thread.sleep(3000);
		driver.quit();
	}
}

//scrollIntoView(window.scrollTo(0,500),true)
