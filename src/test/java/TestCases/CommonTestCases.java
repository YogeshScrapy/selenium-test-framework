package TestCases;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;

import POM.*;
import commonMethods.CommMeths;
import commonMethods.Logs;

public class CommonTestCases {
	
	WebDriver driver;
	CommMeths commeths;
	String info="INFO";
	String pass="PASS";
	String fail="FAIL";
	SoftAssert assertion = new SoftAssert();
	
	DriverInitalization driverini;
	OpenUrl openurl;
	AddHeadphoneToCart ahtc;
	LoginPage lp;
	AddMacbbokProToCart ambtc;
	RemoveHeadphonefromCart rhfc;
	String filepath = "./Reports/Screenshots/";
	
	/*public CommonTestCases(String browser)
	{
		initalizeDriver(browser);
	}*/
	
	public void initalizeDriver(String browser)
	{
		driverini = new DriverInitalization();
		driver = driverini.initalizeDriver(driver, browser);
	}

	public void openUrl()
	{
		openurl = new OpenUrl(driver);
	}

	public void login()
	{
		lp = new LoginPage(driver);
		lp.Login();
	}
	public void AddHeadphonesToCart() throws InterruptedException
	{
		ahtc = new AddHeadphoneToCart(driver);
		ahtc.Clickdepartment();
		ahtc.ClickHeadphones();
		ahtc.SelectFirstheadphones();
		ahtc.AddHeadphonesToCArt();
	}

	public void AddTwoLaptops() throws InterruptedException {
		ambtc = new AddMacbbokProToCart(driver);
		ambtc.SearchBoxClick();
		ambtc.HitSearchButton();
		ambtc.Selectlaptop();
		ambtc.AddtwolaptopToCart();
	}

	public void removeHeadphoneFromCart()
	{
		rhfc= new RemoveHeadphonefromCart(driver);
		rhfc.navigateToCart();
		rhfc.DeleteItemFromCart();
	}

	public void poceedToCheckout()
	{
		rhfc= new RemoveHeadphonefromCart(driver);
		rhfc.proceedToCheckOut();
	}
	
	public void takeScreenShotOnFailure(String screenshotfilename)
	{
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); 
		try 
		{
			FileUtils.copyFile(scrFile, new File(filepath+screenshotfilename+".png"));
			Logs.addScreenshot(filepath, " Screen shot captured for failed Test case ", "FAIL");
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
	
	public void flushLogs()
	{
		Logs.flushLog();
	}
	
	public void closeDriver()
	{
		driver.get("./Reports/Report.html");
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.close();
		driver.quit();
		
	}
}
