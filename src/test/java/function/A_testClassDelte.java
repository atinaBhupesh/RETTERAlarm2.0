package function;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class A_testClassDelte extends b_baseClass {

	
	C_logIn_logOut lp;
	D_homePage hp;
	F_manualAlarm ma;
	E_timeClass tc;
	G_resource mr;
	

	
	String gTodaysDate;
	String gtimeHHMMSS;
	
	@BeforeSuite	
	public void BeforeSuite () throws Throwable
	{
		getDetailsFromUser();
		lonchBrowser();
		
		
	
	}

	@BeforeTest
	public void BeforeTest () throws Throwable
	{

		lp= new C_logIn_logOut (driver);
		tc = new E_timeClass ();

		Reporter.log("Logged in user-"+userName,true);
		lp.logInUser(userName, password, driver);
		
		hp= new D_homePage(driver) ;
		hp.langChange(driver);
		mr = new G_resource(driver) ;
		
		
		
	
		
		
		
	}
	
	@BeforeClass
	public void createObject() throws Throwable 
	{
	
	
		tc.catchDateTime(driver);
		
	
		gTodaysDate=tc.germanyTodaysDate;
		gtimeHHMMSS=tc.germanyCurrentTimeHHMMSS;
	
		
		ma = new F_manualAlarm (driver);
		
		
	}
		
		
	
	
	@BeforeMethod
	public void backToHomePage () throws Throwable
	{
		
	
		Thread.sleep(2000);
		
		driver.navigate().refresh();
		
		Thread.sleep(2000);		
	}
	
	

	@Test 
	public void deleteResource () throws Throwable
		
	{
		Reporter.log(" ", true);
		Reporter.log("The process of delete resource is started.", true);
		mr.commonResource(driver, branchName);
		mr.deleteResource(driver);
		

		ma.backToOld();
		
		Reporter.log(" ", true);
		Thread.sleep(3000);
		
	}
	
	

	@Test 
	public void deleteManualAlarm () throws Throwable
		
	{
		Reporter.log(" ", true);
		Reporter.log("The process of delete manual alarm is started.", true);
		ma.manualAlarmCommon( driver,  deptN, branchName );
		ma.deleteManualAlarm( driver);

		ma.backToOld();
		
		Reporter.log("The process of delete manual alarm is complete.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);
		
	}
	
	@AfterMethod
	public void backToHomePage2 () throws Throwable
	{

		
		hp.backToHomePage(driver, branchName);
	}
	
	@AfterClass
	public void logOut() throws Throwable {

		lp.logOut(driver);
		Reporter.log("Logout sucessfully.", true);
		Reporter.log(" ", true);
		

	}
	
	@AfterTest 
	public void AfterTest ()
	{
		driver.navigate().refresh();
		Reporter.log("Refresh the URL before successfully closing the browser.", true);
	}
	
	@AfterSuite 
	public void AfterSute ()
	{
		driver.quit();
		Reporter.log("Browser close sucessfully.", true);
		Reporter.log(" ", true);
		Reporter.log("Good to see you again.", true);
	}
	
	







}
