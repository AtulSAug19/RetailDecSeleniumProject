package testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNGEx3 {
	
	
//	@Test(invocationCount = 5)
//	public void m1()
//	{
//		System.out.println("M1 method");
//	}
	
	
	@Test(timeOut = 8000)
	public void m2() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./driverFiles/chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.id("er"));
		driver.close();
	}

}
