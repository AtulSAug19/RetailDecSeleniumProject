package testNG;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import junit.framework.Assert;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGEx8 {
	
	
	@BeforeMethod
	public void setDriverPath()
	{
		System.out.println("Before Method invoked");
		System.setProperty("webdriver.chrome.driver","./driverFiles/chromedriver.exe");	
	}
	
	@Test
	public void script1() throws InterruptedException
	{
		SoftAssert soft = new SoftAssert();
//		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
//		Assert.assertEquals("Facebook – log in or sign up1", driver.getTitle());
		soft.assertEquals("Facebook – log in or sign up1", driver.getTitle());
		soft.assertEquals("https://www.facebook.comdffdfdff/", driver.getCurrentUrl());
		System.out.println("After assertion");
		driver.close();
		soft.assertAll();
		
	}
	
//	@Test
	public void script2() throws InterruptedException
	{
		
//		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		driver.close();
	}
	
	
	

}
