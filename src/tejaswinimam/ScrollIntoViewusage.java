package tejaswinimam;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollIntoViewusage {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com/doodles");
		WebElement ele = driver.findElement(By.xpath("//a[text()=\"Sridevi's 60th Birthday\"]"));
		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].scrollIntoView(true)",ele);
		Thread.sleep(2000);
		js.executeScript("arguments[0].scrollIntoView(false)",ele);
		Thread.sleep(2000);
		js.executeScript("arguments[0].scrollIntoView(true)",ele);
		Thread.sleep(2000);
		driver.quit();
		
		
		
		
		
	}
}
