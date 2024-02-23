package dropDown;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectEx2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driverFiles/chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationbykrishna.com/");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		WebElement element = driver.findElement(By.xpath("//a[@id='basicelements']"));
		if(element.isEnabled())
		{
			element.click();
		}
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scroll(0,1250)");
		Select sel = new Select(driver.findElement(By.xpath("(//select)[2]")));
		if(sel.isMultiple())
		{
			sel.selectByIndex(2);
			sel.selectByIndex(3);
			sel.selectByIndex(4);
		}
		Thread.sleep(2000);
		sel.deselectByIndex(2);

	}

}

//  pageobjectmodel, testng, cucumber, extentreport
