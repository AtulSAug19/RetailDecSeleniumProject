package frames;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameClassEx2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./driverFiles/chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Frames.html");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.switchTo().frame(1);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Selenium");
		driver.switchTo().defaultContent();

	}

}
