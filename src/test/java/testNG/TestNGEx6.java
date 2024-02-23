package testNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGEx6 {
	
	
	@Test
	@Parameters({"User","Password"})
	public void login(String userName, String pwd)
	{
		System.out.println("Username is: "+userName + " and Password is: "+pwd);
	}
	
	@Test
	@Parameters({"User"})
	public void registration(String userName)
	{
		System.out.println("Username is: "+userName);
	}

}
