package browserCommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserCommands {
	

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driverFiles/chromedriver.exe");	
//		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		if(driver.getCurrentUrl().equals("https://www.facebook.com/"))
			System.out.println("Facebook launched");
		driver.get("https://www.google.com/?gws_rd=ssl");
		Thread.sleep(2000);
		System.out.println(driver.getCurrentUrl());
		driver.navigate().back();
		Thread.sleep(2000);
		System.out.println(driver.getCurrentUrl());
		driver.navigate().forward();
		System.out.println(driver.getCurrentUrl());
		driver.close();
	
	}

}
