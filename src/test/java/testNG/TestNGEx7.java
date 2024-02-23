package testNG;

import org.testng.annotations.Test;

public class TestNGEx7 {

	@Test
	public void m1()
	{
		for(int i=0;i<=501;i++)
			System.out.println(i);
	}
	
	@Test
	public void m2()
	{
		for(int i=501;i<=600;i++)
			System.out.println(i);
	}
	
	@Test
	public void m3()
	{
		for(int i=601;i<=700;i++)
			System.out.println(i);
	}
	
	@Test
	public void m4()
	{
		for(int i=701;i<=800;i++)
			System.out.println(i);
	}

}
