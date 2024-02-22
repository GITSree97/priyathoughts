package test;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

//suite(<suite></suite>) will be having multiple modules(<test></test>). 
//Each module can have multiple classes(<class/>)
//Each class will have test cases(methods)
//We can run all test cases at a time using XML file-
//we can skip specific methods using <method><exclude name=/></method>
/*we can run the specific test cases using <include name=/>. It will run only the methods
 which are specified and will ignore the remaining methods*/
/*naming convention is very imp in framework. If there are multiple test cases or methods
which belongs to same category then all those methods should start with same keyword*/
/*for eg: If there are 30 methods which are related to Mobile in a module, then all of the 
 * method should start with a common keyword such as mobile. so that if we have to exclude 
 * those test cases, we can use regular expression <exclude name="mobile*"> */

//We can run all the test cases in package using below code,
/*   <test name="Personal Loan">  
   <packages>
     <package name = "test"/>
   </packages> 
  </test>*/

//Test Annotations- @BeforeTest, @AfterTest, @BeforeSuite, @AfterSuite, @BeforeMethod,@BeforeClass,@AfterClass
//Using groups helper attribute, we can run specific test cases from different classes
/*<groups>
  <run>
  <include name="Smoke"/>
</run>
</groups> 
*/
/*If there is a dependency on methods,i.e. one method should be executed before another method
we can use helper attribute dependsOnMethods={""}).*/
/* @Test(enabled=flase)- If we have few errors in app which were already reported, but that should
 * not stop the execution, then we can use enabled=false annotation to skip that testcase*/

/*timeOut=4000- If there is one test case which is taking more time to execute and other test cases are failing 
 * due to that, and if you are aware that which test case is taking more time, you can use this helper attribute*/

public class day1 {
	
	//Using groups helper attribute, we can run specific test cases from different classes
	@Test(groups="Smoke")
	public void Demo()
	{
		System.out.println("Hello");
		System.out.println("Hello2");
		System.out.println("Hello3");	
		Assert.assertTrue(false);
	}
	
	@Test
	public void SecondTest()
	{
		System.out.println("Bye");
		System.out.println("Hello");
		System.out.println("Hello1");
	}

}
