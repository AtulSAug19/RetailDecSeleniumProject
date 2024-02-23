package multiWindow;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultiWindowEx1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./driverFiles/chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Windows.html");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[text()='    click   ']")).click();
		System.out.println("Title of main window: "+driver.getTitle());
		String mainWindow = driver.getWindowHandle();
		System.out.println(" Main Window id: "+mainWindow);
		Set<String> allWindows = driver.getWindowHandles();
		for(String childWindow:allWindows)
		{
			if (!(mainWindow.equals(childWindow)))
			{
				driver.switchTo().window(childWindow);
				System.out.println("Title of Child Window:"+ driver.getTitle());
//				if(driver.getTitle().equals(""))
//				{
//					break;
//				}
//				else
//					continue;
				driver.close();
			}
		}
		driver.switchTo().window(mainWindow);
		System.out.println("Main Window Title:"+driver.getTitle());

	}

}
