package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ID {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driverFiles/chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationbykrishna.com/#");
		Thread.sleep(2000);
		WebElement element = driver.findElement(By.id("registration21"));
		element.click();
		Thread.sleep(2000);
		WebElement userName = driver.findElement(By.id("unameSignin"));
		if(userName.isDisplayed())
		{
			System.out.println("I am on login page");
		}

	}

}
