package tejaswinimam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/");//input[@name='username']
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("abcd");
		driver.findElement(By.name("password")).sendKeys("1234");
		driver.findElement(By.xpath("//div[text()='Log in']")).click();
		driver.quit();
	}

}
