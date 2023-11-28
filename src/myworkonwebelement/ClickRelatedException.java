package myworkonwebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickRelatedException {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		driver.findElement(By.xpath("//a[text()='Topwear']/../../descendant::a[text()='T-Shirts']")).click();
	    /*ElementNotIntractableException
	     Element is their in the DOM but 
	     it is not  visible and hence 
	     it is non-intractable*/
		driver.manage().window().minimize();
		driver.quit();
		
	}
	}
		
	
	
	
	
