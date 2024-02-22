package test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day2 {
	@AfterTest
	public void lastExecution()
	{
		System.out.println("This will execute at the end of the test");
	}
	
	
	@Test(groups="Smoke")
	public void PersonalLoan()
	{
		System.out.println("personal loan method");
		System.out.println("personal loan method2");
	
	}
	
	@Test
	public void PersonalLoan2()
	{
		
		System.out.println("personal loan method2");
	
	}
		
	@BeforeTest
	public void prerequisite()
	{
		System.out.println("This will execute at the beginning of the test");
	}
	
	

}
