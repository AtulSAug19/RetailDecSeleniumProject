package extentReport;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ExtentReportEx1 {
	
	@Test
	public void m1() throws InterruptedException
	{
		ExtentReports report = new ExtentReports("./Reports/TestCase1.html");
		ExtentTest test = report.startTest("Login");
		System.setProperty("webdriver.chrome.driver","./driverFiles/chromedriver.exe");	
//		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		test.log(LogStatus.PASS,"Launch the application");
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		if(driver.getCurrentUrl().equals("https://www.facebook.codadm/")) {
			System.out.println("Facebook launched");
			test.log(LogStatus.PASS,"Launch the facebook application");
		}
		else
			test.log(LogStatus.FAIL,"Aplication URL is not matching");
		report.endTest(test);
		report.flush();
		driver.close();
	}

}
