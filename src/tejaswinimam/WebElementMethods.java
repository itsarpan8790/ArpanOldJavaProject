package tejaswinimam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementMethods {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
		WebElement pwd = driver.findElement(By.id("pass"));
		
		int emailX = email.getRect().getX();
		int emailY = email.getRect().getY();
		
		int pwdX = pwd.getRect().getX();
		int pwdY = pwd.getRect().getY();

		System.out.println("mail dim " + email.getSize());
		System.out.println("pwd dim " + pwd.getSize());
		if (emailX == pwdX) {
			System.out.println("X allignment same");
		} else {
			System.out.println("X allignment  not same");
		}
		 System.out.println("xDiff= "+(emailX-pwdX));

	}

}
