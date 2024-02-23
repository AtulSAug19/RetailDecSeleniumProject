package testNG;

import org.testng.annotations.Test;

public class TestNGEx4 {
	
	@Test(groups= {"Smoke","Regression"})
	public void login()
	{
		System.out.println("Login");
	}
	
	@Test(groups = {"Regression"})
	public void registration()
	{
		System.out.println("registration");
	}
	
	@Test(groups = {"Sanity"})
	public void checkout()
	{
		System.out.println("checkout");
	}

}
