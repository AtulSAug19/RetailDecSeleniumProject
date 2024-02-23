package webTable;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableEx2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./driverFiles/chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationbykrishna.com/");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		WebElement element = driver.findElement(By.xpath("//a[@id='demotable']"));
		element.click();
		WebElement table = driver.findElement(By.id("table1"));
		List<WebElement> allTableRows = driver.findElements(By.xpath("//table[@id='table1']/tbody/tr"));
		System.out.println("Total rows:"+allTableRows.size());
		for(int i=1;i<=allTableRows.size();i++) {
			List<WebElement> allColumns = driver.findElements(By.xpath("//table[@id='table1']/tbody/tr["+i+"]/td"));
			for(int j=1;j<=allColumns.size();j++)
			{
				WebElement data = driver.findElement(By.xpath("//table[@id='table1']/tbody/tr["+i+"]/td["+j+"]"));
				System.out.println(data.getText());
			}
		}
		driver.close();
	}

}

////table[@id='table1']/tbody/tr["+(i+1)+"]/td["+(j+1)+"]
