package tejaswinimam;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScalerVectorGraphics {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	
		driver.get("https://petdiseasealerts.org/forecast-map/");
		WebElement mapFrame = driver.findElement(By.xpath("//iframe[@id='map-instance-5426']"));
		driver.switchTo().frame(mapFrame);
		//driver.switchTo().frame(0);
		driver.findElement(By.xpath("//*[name()='svg' and @id='map-svg']//*[name()='g' and @id='alabama']")).click();
		Thread.sleep(3000);
		driver.quit();
	}
}
