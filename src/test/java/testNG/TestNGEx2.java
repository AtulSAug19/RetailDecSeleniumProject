package testNG;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class TestNGEx2 {
	
	@Test()
	public void name()
	{
		System.out.println("Name");
//		Assert.assertTrue(false);
	}
	
	@Test(dependsOnMethods = {"registration"})
	public void login()
	{
		System.out.println("Login");
	}
	
	@Test()
	public void registration()
	{
		System.out.println("Registration");
//		Assert.assertTrue(false);
	}
	

	
	@Test()
	public void checkout()
	{
		System.out.println("Checkout");
	}

}
