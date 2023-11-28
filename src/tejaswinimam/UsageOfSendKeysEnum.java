package tejaswinimam;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfSendKeysEnum {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/reg/");
		WebElement fn = driver.findElement(By.xpath("//input[@name='firstname']"));
		WebElement ln = driver.findElement(By.xpath("//input[@name='lastname']"));
		fn.sendKeys("Arpan");
		Thread.sleep(2000);
		fn.sendKeys(Keys.CONTROL + "a");
		Thread.sleep(2000);
		fn.sendKeys( Keys.CONTROL + "c");
		ln.sendKeys(Keys.CONTROL + "v");
		
	}

}
