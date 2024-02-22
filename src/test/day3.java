package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day3 {
	@BeforeClass
	public void bfclass()
	{
		System.out.println("It will run before all methods in this class");
	}
	
	@AfterClass
	public void afclass()
	{
		System.out.println("It will run after all methods in this class");
	}
	
	
	@BeforeMethod
	public void bfmethod()
	{
		System.out.println("It will run before every test method in day3 class");
	}
	
	/* @Test(enabled=flase)- If we have few errors in app which were already reported, but that should
	 * not stop the execution, then we can use enabled=false annotation to skip that testcase*/

	//@Test(enabled=false)
	
	//parameterisation-It can be done in two ways
	//we can drive the data which is defined in xml file
	//parameterize the data using DataProvide annotation and call that annotated method
	
	@Parameters({"URL"})
	@Test
	public void webLoginCarLoan(String urlname)
	{	
		System.out.println("Weblogin car");
		
		System.out.println(urlname);
	}
	
	@AfterMethod
	public void afmethod()
	{
		System.out.println("It will run after every test method in day3 class");
	}
	@Test(dataProvider="getData")//it will go to getData method 
	public void mobileLoginCarLoan(String username, String password)
	{
		System.out.println("Mobilelogin car");
		System.out.println(username);
		System.out.println(password);
	}
	
	/*If there is a dependency on methods,i.e. one method should be executed before another method
	we can use helper attribute dependsOnMethods={""}).*/
	@Test(dependsOnMethods={"webLoginCarLoan"})
	public void APILoginCarLoan()
	{
		System.out.println("APIlogin car");
	}
	
	//If we want to use the parameters only to a specific method we will use data provider annotation
	
	@DataProvider
	public Object[][] getData()
	{
		//1st set of data- username and password for good credit history
		//2nd set of data- username and password for no credit history
		//3rd set of data- fraudalent credit history
		
		//we will declare the multi dimensional array 
		
		Object[][] data= new Object[3][2];//an array with 3rows and 2 columns
		
		//1st row data
		data[0][0]="firstusername";//first row first column
		data[0][1]="firstpassword";//first row 2nd col
		
		//2nd set data
		data[1][0]="secondusername";//2nd row 1st column
	   data[1][1]="secondpassword";//2nd row 2nd col
	   
	   //3rd set of data
	   data[2][0]="thirdusername";//3rd row 1st column
	   data[2][1]="thirdpassword";//3rd row 2nd column
	   
		return data;
	}

}
