package myworkonwebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageofGetSize {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		System.out.println(driver.findElement(By.id("username")).getSize());
		/*getSize() will
        will return Dimension
        so Dimension class methods can be called after getSize()*/
		System.out.println(driver.findElement(By.id("username")).getSize().getHeight());
		System.out.println(driver.findElement(By.id("username")).getSize().getWidth());
		
		
		/*Storing And Pring For Password TextField*/
		
		System.out.println(driver.findElement(By.name("//input[@name='pwd']")).getSize());
		driver.findElement(By.name("//input[@name='pwd']")).getSize().getHeight();
		driver.findElement(By.name("//input[@name='pwd']")).getSize().getWidth();
		
		driver.quit();
		
		
	}

}
