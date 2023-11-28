import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MyntraDemo {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.myntra.com/");
		WebElement men = driver.findElement(By.xpath("(//a[text()='Men'])[1]"));
		
		Actions a=new Actions(driver);
		a.moveToElement(men).perform();
		
		
		
	}
}
