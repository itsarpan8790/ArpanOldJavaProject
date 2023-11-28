package com.project.generic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class BaseClass {

	public WebDriver driver;

	@Parameters("browser")
	@BeforeTest
	public void openBrowser(String browser) {
		Reporter.log("open browser", true);

		if (browser.equalsIgnoreCase("chrome"))
			driver = new ChromeDriver();
		else if(browser.equalsIgnoreCase("firefox"))
			driver = new FirefoxDriver();
		else
			driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.actitime.com/login.do");

	}

	@BeforeMethod
	public void login() {
		Reporter.log("Logingin", true);
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();

	}

	@AfterMethod
	public void logout() {
		Reporter.log("Logout", true);
		driver.findElement(By.xpath("//a[text()='Logout']")).click();

	}

	@AfterTest
	public void closeBrowser() {
		Reporter.log("closingBrowser", true);
		driver.quit();
	}

}
