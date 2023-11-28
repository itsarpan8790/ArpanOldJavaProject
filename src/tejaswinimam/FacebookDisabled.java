package tejaswinimam;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookDisabled {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(
				"https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C550525805682%7Cb%7Cfb%20registration%7C&placement=&creative=550525805682&keyword=fb%20registration&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696221592%26matchtype%3Db%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-322833375554%26loc_physical_ms%3D1007768%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=CjwKCAjwivemBhBhEiwAJxNWN2AzoNctj8ao99TaGUNmbI_KTP2bKrq8ZV6ddDGi8Hs6pBLsehiS4hoCNnMQAvD_BwE");
		WebElement disabledEle = driver.findElement(By.xpath("//input[@name='custom_gender']"));

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].value='hii'", disabledEle);

	}

}
