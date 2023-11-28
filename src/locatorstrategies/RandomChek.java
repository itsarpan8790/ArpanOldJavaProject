package locatorstrategies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RandomChek {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
		driver.manage().window().maximize();
		// driver.findElement(By.id("profession-1")).click();
		// name not successfull
		// driver.findElement(By.name("profession")).click();
//		driver.findElement(By.tagName("input")).click(); returned 1st avlbl input tag
		Thread.sleep(2000);
		driver.quit();

	}

}
