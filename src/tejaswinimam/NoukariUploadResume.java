package tejaswinimam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NoukariUploadResume {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/nlogin/login");
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("resumeUpload")).sendKeys("C:\\Users\\arpan\\Desktop\\sbiCompl.txt");
		Thread.sleep(3000);
		driver.quit();
				
		
		
	}
}
