package testNG;

import org.testng.annotations.Test;

public class TestNGEx5 {
	
	@Test
	public void BankLoginForRetailCustomer()
	{
		System.out.println("Retail");
	}
	
	@Test
	public void BankLoginForCorporateCustomer()
	{
		System.out.println("Corporate");
	}
	
	@Test
	public void BankLoginForWealthCustomer()
	{
		System.out.println("Wealth");
	}

}
