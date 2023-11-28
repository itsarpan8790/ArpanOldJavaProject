package tejaswinimam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbhiBus {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.abhibus.com/?utm_source=google&utm_medium=cpc&utm_campaign=Abhibus_Brand&utm_term=abhibus&utm_content=Brand&gclid=CjwKCAjwivemBhBhEiwAJxNWN9SffRplkaakDat9xYu3NEPUealQYoxoGa7TuY1mQKNODYfrJkycOhoCN7QQAvD_BwE");
	driver.findElement(By.xpath("//input[@id='datepicker1']")).click();
	driver.findElement(By.xpath("//span[text()='August']/../../..//a[text()='26']")).click();
	Thread.sleep(3000);
	driver.quit();
	
	}
}
