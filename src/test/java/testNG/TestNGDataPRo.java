package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNGDataPRo {
	
//	@Test(dataProvider = "data")
//	public void login(String user, String pwd)
//	{
//		System.out.println("User: "+user+"-"+pwd);
//	}
	
	@Test(dataProvider = "data1")
	public void m1(String user, String pwd) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./driverFiles/chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationbykrishna.com/");
		Thread.sleep(2000);		
		WebElement element = driver.findElement(By.id("registration2"));
		element.click();
		Thread.sleep(2000);
		WebElement userName = driver.findElement(By.id("unameSignin"));
		userName.clear();
		userName.sendKeys(user);
		WebElement password = driver.findElement(By.id("pwdSignin"));
		password.clear();
		password.sendKeys(pwd);
		Thread.sleep(2000);
		driver.close();
	}
	
	
	@DataProvider(name="data")
	public Object[][] getData()
	{
		return new Object[][] {{"David","12234"},{"Robin","333e13"},{"Zen","12343242"},{"John","32r24r34"}};
	}
	
	@DataProvider(name="data1")
	public Object[][] getData1()
	{
		return new Object[][] {{"sdfdsf","12234"},{"sdfdf","333e13"},{"sgg","12343242"},{"sdgg","32r24r34"}};
	}

}
