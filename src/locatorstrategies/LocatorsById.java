package locatorstrategies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsById {
	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		WebElement email1=driver.findElement(By.id("email"));
		email1.sendKeys("arpanm6@gmail.com");
		Thread.sleep(2000);
		WebElement pwd=driver.findElement(By.id("pass"));
		pwd.sendKeys("kjskjtbejkkjkjghkek");
		Thread.sleep(2000);
		WebElement loginAdrs=driver.findElement(By.name("login"));
		loginAdrs.click();
		//driver.quit();
	}

}
