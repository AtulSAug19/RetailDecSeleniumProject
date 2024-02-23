package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsEx {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driverFiles/chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationbykrishna.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@id='registration2']")).click();
		Thread.sleep(2000);
		List<WebElement> list = driver.findElements(By.xpath("//input"));
		System.out.println(list.size());
		for(int i=0;i<list.size();i++)
		{
			WebElement element = list.get(i);
			System.out.println(element.getAttribute("type"));
		}
		driver.close();
		
	}

}
