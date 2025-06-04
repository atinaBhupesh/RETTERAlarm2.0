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

public class A_testClassCreate extends b_baseClass {

	
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
		
		Thread.sleep(2000);
		
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
	public void createNewResource() throws Throwable
		
	{
		Reporter.log(" ", true);
		Reporter.log("The process of creating new resource is started.", true);
		mr.commonResource( driver,  branchName);
		mr.createNewResource( driver, St2N, St1N, gTodaysDate,  gtimeHHMMSS, St2V1, St1V1, st01FF1,st02FF1);
		Reporter.log("The process of creating new resource is complete.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);
		
	}
	
	
	
	
	
	
	
	
	
	
	@Test 
	public void sendMessageToManualAlarmUser() throws Throwable
		
	{
		Reporter.log(" ", true);
		Reporter.log("The process of send message to manual alarm user is started.", true);
		ma.manualAlarmCommon( driver,  deptN, branchName );
		ma.sendMessageToManualAlarmUser(driver, branchName);
		Reporter.log("The process of send message to manual alarm user is complete.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);
		
	}
	
	
	
	
	
	@Test 
	public void sendMessageToOldApiAlarmUser() throws Throwable
		
	{
		Reporter.log(" ", true);
		Reporter.log("The process of send message to old api alarm user is started.", true);
		ma.manualAlarmCommon( driver,  deptN, branchName );
		ma.sendMessageToOldApiAlarmUser(driver, branchName);
		Reporter.log("The process of send message to old api alarm user is complete.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);
		
	}
	
	@Test 
	public void sendMessageToNewApiAlarmUser() throws Throwable
		
	{
		Reporter.log(" ", true);
		Reporter.log("The process of send message to new api alarm user is started.", true);
		ma.manualAlarmCommon( driver,  deptN, branchName );
		ma.sendMessageToNewApiAlarmUser(driver, branchName);
		Reporter.log("The process of send message to new api alarm user is complete.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);
		
	}
	
	@Test 
	public void manualaByAttributeMSLP() throws Throwable
		
	{
		Reporter.log(" ", true);
		Reporter.log("The process of creating a low priority multi station manual alarm by attribute  is started.", true);
		ma.manualAlarmCommon( driver,  deptN, branchName );
		ma.manualaByAttributeMSLP( driver, St1N, St2N,  gTodaysDate,  gtimeHHMMSS, St1V1,  St1V2, St2V1,  st01A1, st02A1 );
		Reporter.log("The process of creating a low priority multi station manual alarm by attribute is complete.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);
		
	}

	@Test 
	public void manualaByAttributeSingleStation() throws Throwable
		
	{
		Reporter.log(" ", true);
		Reporter.log("The process of creating a manual alarm by attribute  is started.", true);
		ma.manualAlarmCommon( driver,  deptN, branchName );
		ma.manualaByAttributeSingleStation( driver, St1N,  gTodaysDate ,gtimeHHMMSS, St1V1,  St1V2,  st01A1);
		
		
		Reporter.log("The process of creating a manual alarm by attribute is complete.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);
		
	}
	
	
	@Test 
	public void manualaByAttributeExtend1StStResource() throws Throwable
		
	{
		Reporter.log(" ", true);
		Reporter.log("The process of creating a manual alarm by attribute st2 and extend to st1 by resource is started.", true);
		ma.manualAlarmCommon( driver,  deptN, branchName );
		ma.manualaByAttributeExtend1StStResource (  driver, St2N,  gTodaysDate,  gtimeHHMMSS, St2V1,   st02A1,  St1N,  branchName, st01REsc  );
		
		
		Reporter.log("The process of creating a manual alarm by attribute st2 and extend to st1 by resource is complete.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);
		
	}
	
	
	@Test 
	public void manualAlarmByResourceMs() throws Throwable
		
	{
		Reporter.log(" ", true);
		Reporter.log("The process of creating a manual alarm by resource is started.", true);
		ma.manualAlarmCommon( driver,  deptN, branchName );
		ma.manualAlarmByResourceMs( driver, St1N, St2N,  gTodaysDate,  gtimeHHMMSS, st01R1,  st01R2 );
		
		
		Reporter.log("The process of creating a manual alarm by resource is complete.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);
		
	}
	
	
	@Test 
	public void manualAlarmByTemplate () throws Throwable
		
	{
		Reporter.log(" ", true);
		Reporter.log("The process of creating a manual alarm by template is started.", true);
		ma.manualAlarmCommon( driver,  deptN, branchName );
		ma.manualAlarmByTemplate (driver, st2t1);
		
		
		
		Reporter.log("The process of creating a manual alarm by template is complete.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);
		
	}
	
	@Test 
	public void manualAlarmByEscResourceMs () throws Throwable
		
	{
		Reporter.log(" ", true);
		Reporter.log("The process of creating a manual alarm by escaltion resource-multi station is started.", true);
		ma.manualAlarmCommon( driver,  deptN, branchName );
		ma.manualAlarmByEscResourceMS ( driver, St2N,  gTodaysDate,  gtimeHHMMSS, st02REsc) ;
		
		
		
		Reporter.log("The process of creating a manual alarm by escaltion resource-multi station is complete.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);
		
	}
	
	
	@Test 
	public void manualAlarmByEscResourceSingleStation () throws Throwable
		
	{
		Reporter.log(" ", true);
		Reporter.log("The process of creating a manual alarm by escaltion resource-single station is started.", true);
		ma.manualAlarmCommon( driver,  deptN, branchName );
		ma.manualAlarmByEscResourceSingleStation(driver,St1N ,gTodaysDate,gtimeHHMMSS,st01REsc);
		
		
		Reporter.log("The process of creating a manual alarm by escaltion resource-single station is complete.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);
		
	}
	
	
	@Test 
	public void manualAlarmByFirefighterMs() throws Throwable
		
	{
		Reporter.log(" ", true);
		Reporter.log("The process of creating a manual alarm by firefighter is started.", true);
		ma.manualAlarmCommon( driver,  deptN, branchName );
		ma.manualAlarmByFirefighterMs(driver, St1N, St2N,  gTodaysDate,  gtimeHHMMSS, St1V1,  St1V2,St2V1, st01FF1, st02FF1);
		
		
		Reporter.log("The process of creating a manual alarm by firefighter is complete.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@AfterMethod
	public void backToHomePage2 () throws Throwable
	{
		ma.backToOld();
		
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
