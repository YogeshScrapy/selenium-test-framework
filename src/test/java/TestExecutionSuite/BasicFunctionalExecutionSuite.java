/*
 * Author: Vegil
 * Purpose: This java file contains the basic functional test cases for clearmy trip website automation
 * 
 */

package TestExecutionSuite;

import java.io.IOException;

import org.testng.ITestResult;
import org.testng.annotations.*;

import TestCases.CommonTestCases;


public class BasicFunctionalExecutionSuite {

	CommonTestCases ctcs;
		
	@BeforeSuite
	public void beforesuite()
	{
		System.out.println("Go-Jek Assigment Execution Suite starts");
	}

	@BeforeTest
	public void setup() throws IOException
	{
		System.out.println("Go-Jek Assigment Execution Suite Test starts");
	}

	@Test (priority = 0)
	@Parameters("browser")
	public void driverInitalization(String browser) 
	{
		ctcs = new CommonTestCases();
		ctcs.initalizeDriver(browser);
	}


	@Test (priority = 1)
	public void openUrl() 
	{
		ctcs.openUrl();
	}

	@Test (priority = 2)
	public void loginPage()
	{

		ctcs.login();
	}

	@Test (priority = 3)
	public void addHeadphoneToCart() throws InterruptedException {

		ctcs.AddHeadphonesToCart();

	}


	@Test (priority = 4)
	public void AddTwoLaptops() throws InterruptedException {

		ctcs.AddTwoLaptops();
	}

	@Test (priority = 5)
	public void removeheadphonefromcart()
	{
		ctcs.removeHeadphoneFromCart();

	}

	@Test (priority = 6)
	public void proceedToCheckout ()
	{
		ctcs.poceedToCheckout();
	}


	@AfterMethod
	public void afterEveryMethod(ITestResult result)
	{
		if(ITestResult.FAILURE==result.getStatus())
		{
			ctcs.takeScreenShotOnFailure(result.getTestName());
		}
	}
	
	@AfterTest
	public void teardown()
	{
		ctcs.flushLogs();
	}

	@AfterSuite
	public void aftersuite()
	{
		ctcs.closeDriver();
	}

}
