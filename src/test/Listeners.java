package test;

import org.testng.ITestListener;
import org.testng.ITestResult;

//Listeners-@Listeners annotation which listens to every event that occurs in a selenium code
//To implement listeners, there is one interface: ITestListeners which has all methods for testNG listenres
//ITestListener interface has multiple methods:onTestStart(),onTestSuccess(),onTestFailure,onTestSkipped(),onStart(
public class Listeners implements ITestListener {
	
	public void onTestSuccess(ITestResult result)
	{
		System.out.println("I listened to all the Test cases which are successfully executed ");
	}
	
	public void onTestFailure(ITestResult result)
	{
		//take a screenshot if the test is failed
		//we can get which method is failed using ITestResult class object
		System.out.println("I listened to the failed test case" + result.getName());
	}

}
