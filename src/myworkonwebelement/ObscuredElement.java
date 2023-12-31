package myworkonwebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ObscuredElement {
	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		//WebElement customerService=driver.findElement(By.xpath(".//a[text()=\"Today's Deals\"]/following-sibling::a[text()='Customer Service']"));
		//WebElement customerService=driver.findElement(By.xpath("//a[text()=\"Today's Deals\"]/../child::a[text()='Customer Service']"));
		/*customerService.click(); /* 1.ElementClickInterceptedException
		                            2.Handle it by Removing Obscured Element*/
		WebElement obscuredElement=driver.findElement(By.xpath("//span[contains(.,\"Don't Change\")]/preceding-sibling::input"));
		Thread.sleep(3000);
		obscuredElement.click();
		
		WebElement customerService=driver.findElement(By.xpath("//a[text()=\"Today's Deals\"]/../child::a[text()='Customer Service']"));
		Thread.sleep(3000);
		customerService.click(); 
		Thread.sleep(1000);
		driver.manage().window().minimize();
		Thread.sleep(1000);
		driver.quit();
		
		
	}

}
