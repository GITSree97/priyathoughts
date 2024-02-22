package test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class day4 {

	@AfterSuite
	public void afsuite()
	{
		System.out.println("This will execute at the end of the suite after all test folders are executed");
	}
	
	@Test	
	@Parameters({"URL","APIkey/usrname"})
		public void webLoginCHomeLoan(String url, String key)
		{
			System.out.println("Weblogin home");
			System.out.println(url);
			System.out.println(key);
		}
		@Test(groups="Smoke")
		public void mobileLoginHomeLoan()
		{
			System.out.println("Mobilelogin home");
		}
		/*If there is one test case which is taking more time to execute and other test cases are failing 
		 * due to that, and if you are aware that which test case is taking more time, you can use this helper attribute*/

		@Test(timeOut=4000)
		public void APILoginHomeLoan()
		{
			System.out.println("APIlogin home");
		}
		
		@BeforeSuite
		public void bfsuite()
		{
			System.out.println("This will execute at the first before running any test folders");
		}
		
		

	}


