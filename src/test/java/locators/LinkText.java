package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkText {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driverFiles/chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationbykrishna.com/");
//		Thread.sleep(2000);
//		WebElement element = driver.findElement(By.partialLinkText("Regist"));
//		element.click();
//		Thread.sleep(2000);
		WebElement element2 = driver.findElement(By.className("horizontal-menu-page"));
		System.out.println(element2.getTagName());
	}

}
