package frames;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameClassEx1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./driverFiles/chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationbykrishna.com/");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@id='iframes']")).click();
		WebElement frame = driver.findElement(By.xpath("//iframe[@title='site3']"));
		driver.switchTo().frame(frame);
		driver.findElement(By.xpath("//font[text()='Projects']")).click();

	}

}
