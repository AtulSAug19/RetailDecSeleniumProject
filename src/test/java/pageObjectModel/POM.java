package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM {
	
	WebDriver driver;
	
	@FindBy(xpath = "")
	private WebElement user;
	
	@FindBy(xpath = "")
	private WebElement pwd;
	
	
	public void login(String user, String pwd)
	{
		this.user.sendKeys(user);
		this.pwd.sendKeys(pwd);
	}
	
	public POM()
	{
		PageFactory.initElements(driver,POM.class);
	}
	
	

}
