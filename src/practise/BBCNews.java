package practise;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BBCNews {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.bbc.com/");

		// Locating LatestBuisnessNews by xpath
		
	    // h2[text()='Latest Business News']/..//descendant::a-->Headers with SlNo.
		//h2[text()='Latest Business News']/..//descendant::a/span/following-sibling::h3
		//h2[text()='Latest Business News']/..//descendant::h3  
		List<WebElement> newses = driver
				.findElements(By.xpath("//h2[text()='Latest Business News']/..//descendant::a"));

		for (WebElement news : newses) {
			System.out.println(news.getText());
		}
		Thread.sleep(3000);
		driver.quit();

	}

}
