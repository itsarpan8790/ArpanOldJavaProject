package tejaswinimam;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class YoutubeEx {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.youtube.com/");
		driver.findElement(By.xpath("//input[@id='search']")).sendKeys("minimum minimum stress",Keys.ENTER);
		
		
		
		
	}

}
