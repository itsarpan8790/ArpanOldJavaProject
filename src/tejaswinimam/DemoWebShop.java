package tejaswinimam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWebShop {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		// clicking on register link
		driver.findElement(By.linkText("Register")).click();
		// male radio button
		driver.findElement(By.id("gender-male")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("FirstName")).sendKeys("Arpan");
		Thread.sleep(2000);
		driver.findElement(By.id("LastName")).sendKeys("Kumar");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='Email' and @name='Email']")).sendKeys("arpank6@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("Password")).sendKeys("Arpan@1234");
		Thread.sleep(2000);
		driver.findElement(By.id("ConfirmPassword")).sendKeys("Arpan@1234");
		Thread.sleep(2000);
		driver.findElement(By.id("register-button")).submit();
		Thread.sleep(3000);
		driver.quit();

	}

}
