package alert;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertClassEx1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driverFiles/chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		WebDriverManager.chromedriver().setup();
		driver.manage().window().maximize();
		driver.get("http://automationbykrishna.com/");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@id='registration2']")).click();
		driver.findElement(By.cssSelector("input[id='unameSignin']")).sendKeys("Selenium");
		WebDriverWait wait = new WebDriverWait(driver,40);
		WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='pwdSignin']")));
		element.sendKeys("121313131313131");
		driver.findElement(By.id("btnsubmitdetails")).click();
//		Thread.sleep(2000);
		Alert alert = driver.switchTo().alert();
		alert.accept();

	}

}
