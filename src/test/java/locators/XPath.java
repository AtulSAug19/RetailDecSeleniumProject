package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPath {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driverFiles/chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationbykrishna.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@id='registration2']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[id='unameSignin']")).sendKeys("Selenium");
		driver.findElement(By.xpath("//input[@id='pwdSignin']")).sendKeys("1233456532");
		driver.findElement(By.xpath("//button[@id='btnsubmitdetails']")).click();

	}

}



// //input[@placeholder='Password' and @id='pwdSignin']
// following, following-sibling, parent, parent-sibling, child, text, contains, starts-with, ancestors, descendants, self
