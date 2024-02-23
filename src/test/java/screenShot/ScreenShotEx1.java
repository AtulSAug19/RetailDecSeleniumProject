package screenShot;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShotEx1 {

	public static void main(String[] args) throws IOException {
		String name = "a";
		System.setProperty("webdriver.chrome.driver","./driverFiles/chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationbykrishna.com/");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		WebElement element = driver.findElement(By.xpath("//a[@id='demotable']"));
		element.click();
		TakesScreenshot screenshot = (TakesScreenshot)driver;
		File srcFile = screenshot.getScreenshotAs(OutputType.FILE);
		File destFile = new File("./ScreenShots/"+name+".png");
		FileUtils.copyFile(srcFile, destFile);
		driver.close();

	}

}
