package actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionEx2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driverFiles/chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationbykrishna.com/");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		WebElement element = driver.findElement(By.id("registration2"));
		element.click();
		WebElement userName = driver.findElement(By.id("unameSignin"));
		Actions action = new Actions(driver);
		Thread.sleep(5000);
		action.keyDown(userName, Keys.SHIFT).sendKeys("selenium").doubleClick(userName).build().perform();

	}

}
