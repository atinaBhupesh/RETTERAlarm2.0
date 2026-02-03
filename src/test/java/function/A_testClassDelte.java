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
	K_calendar ce;

	H_alarmLoop al;
	I_AlarmTemplate at;
	J_alarmEscalation ae;
	L_Information info;

	
	String gTodaysDate;
	String gtimeHHMMSS;
	
	@BeforeSuite	
	public void BeforeSuite () throws Throwable
	{
		getDetailsFromUser();
		lonchBrowser();
		getDetailsFromFiles();
		
	
	}

	@BeforeTest
	public void BeforeTest () throws Throwable
	{

		lp= new C_logIn_logOut (driver);
		tc = new E_timeClass ();
		hp= new D_homePage(driver) ;
		
		Reporter.log("Logged in user-"+userName,true);
		lp.logInUser(userName, password, driver);
		hp.langChange(driver);
		
		hp.langChange(driver);
		mr = new G_resource(driver) ;
		al  =new H_alarmLoop (driver) ;
		at=new I_AlarmTemplate (driver);
		
		ae=new J_alarmEscalation (driver);
		ce=new K_calendar(driver);
		 info= new L_Information(driver);
		
		
		
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
		
	
		switch (branchName)
		{
		case "1":
		{
		driver.navigate().to("https://live.retteralarm.de/");
		 break;
		}
		
		case "2":
		{
		driver.navigate().to("https://testing.retteralarm.de/");
		 break;
		}
		
		case "3":
		{
		driver.navigate().to("https://development.retteralarm.de/");
		 break;
		}
		default:
	         System.out.println("Branch not matched. Staying on current page.");
	         break;
		
		}
	 
		
		
		
		Thread.sleep(2000);		
	}
	
	@Test 
	public void deletedeleteEventCatogery () throws Throwable
		
	{
		Reporter.log(" ", true);
		Reporter.log("The process of delete event catogery is started.", true);
		ce.common_calendar(driver, branchName);
		ce.deleteEventCatogery(driver);
		

		ma.backToOld();
		Reporter.log("The process of delete event catogery is complete.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);
		
	}
	
	
	@Test 
	public void delete_infoEvent () throws Throwable
		
	{
		Reporter.log(" ", true);
		Reporter.log("The process of delete information or event is started.", true);
		
		info.common_information(driver, branchName);
		info.delete_infoEvent(driver);

		ma.backToOld();
		Reporter.log("The process of delete information or event is complete.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);
		
	}
	
	@Test 
	public void deleteAlarmEscalation () throws Throwable
		
	{
		Reporter.log(" ", true);
		Reporter.log("The process of delete AlarmEscalation is started.", true);
		ae.alarmEscaltionComman( driver,  deptN, branchName);
		ae.deleteAlarmEscalation(driver);
		

		ma.backToOld();
		Reporter.log("The process of delete AlarmEscalation is complete.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);
		
	}
	
	

	@Test 
	public void deleteAlarmTemplate () throws Throwable
		
	{
		Reporter.log(" ", true);
		Reporter.log("The process of delete alarm template is started.", true);
		at.commonAlarmTemplate(driver, branchName);
		at.deleteAlarmTemplate(driver);
		

		ma.backToOld();
		Reporter.log("The process of delete alarm template is complete.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);
		
	}

	
	
	
	@Test 
	public void deleteCalendarEvent () throws Throwable
		
	{
		Reporter.log(" ", true);
		Reporter.log("The process of delete calendar event is started.", true);
		ce.common_calendar(driver, branchName);
		ce.deleteCalendarEvent(driver);
		

		ma.backToOld();
		Reporter.log("The process of delete calendar event is complete.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);
		
	}
	
	@Test 
	public void deleteAlarmLoop () throws Throwable
		
	{
		Reporter.log(" ", true);
		Reporter.log("The process of delete alarm loop is started.", true);
		al.commonAlarmLoop(driver, branchName);
		al.deleteAlarmLoop(driver);
		

		ma.backToOld();
		Reporter.log("The process of delete alarm loop is complete.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);
		
	}
	
	

	@Test 
	public void deleteResource () throws Throwable
		
	{
		Reporter.log(" ", true);
		Reporter.log("The process of delete alarm resource is started.", true);
		mr.commonResource(driver, branchName);
		mr.deleteResource(driver);
		

		ma.backToOld();
		Reporter.log("The process of delete alarm resource is complete.", true);
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

		switch (branchName)
		{
		case "1":
		{
		driver.navigate().to("https://live.retteralarm.de/");
		 break;
		}
		
		case "2":
		{
		driver.navigate().to("https://testing.retteralarm.de/");
		 break;
		}
		
		case "3":
		{
		driver.navigate().to("https://development.retteralarm.de/");
		 break;
		}
		default:
	         System.out.println("Branch not matched. Staying on current page.");
	         break;
		
		}
	 
		
		
		
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
