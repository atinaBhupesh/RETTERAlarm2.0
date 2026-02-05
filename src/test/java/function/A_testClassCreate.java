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

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;

public class A_testClassCreate extends b_baseClass {

	
	C_logIn_logOut lp;
	D_homePage hp;
	F_manualAlarm ma;
	E_timeClass tc;
	G_resource ar;
	H_alarmLoop al;
	I_AlarmTemplate at;
	J_alarmEscalation ae;
	K_calendar cl;
	L_Information info;

	
	String gTodaysDate;
	String gTomorrowDate;
	String gtimeHHMMSS;
	String germanyTimeAfter5MinHH;
	String germanyTimeAfter5MinMM;
	String germanyTimeAfter20MinHH;
	String germanyTimeAfter20MinMM;
	
	String germanyTimeAfter1Hrs5MinHH;
	String germanyTimeAfter1Hrs5MinMM;
	String germanyTimeAfter1Hrs20MinHH;
	String germanyTimeAfter1Hrs20MinMM;
	
	
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
		
		Thread.sleep(2000);
		
		
		hp.langChange(driver);
		ar = new G_resource(driver) ;
		al  =new H_alarmLoop (driver) ;
		at= new I_AlarmTemplate (driver) ;
		ae=new J_alarmEscalation (driver);
		cl = new K_calendar (driver);
		info= new L_Information (driver) ;
	
		
		
		
	}
	
	@BeforeClass
	public void createObject() throws Throwable 
	{
	
	
		tc.catchDateTime(driver);
		
	
		gTodaysDate=tc.germanyTodaysDate;
		gtimeHHMMSS=tc.germanyCurrentTimeHHMMSS;
		gTomorrowDate=tc.germanyTomorrowDate;
		
		 germanyTimeAfter5MinHH = tc.germanyTimeAfter5MinHH;
		 germanyTimeAfter5MinMM=tc.germanyTimeAfter5MinMM;
		 germanyTimeAfter20MinHH=tc.germanyTimeAfter20MinHH;
		 germanyTimeAfter20MinMM=tc.germanyTimeAfter20MinMM;
		 
		 germanyTimeAfter1Hrs5MinHH =tc.germanyTimeAfter1Hrs5MinHH;
		 germanyTimeAfter1Hrs5MinMM = tc.germanyTimeAfter1Hrs5MinMM;
		 
		 germanyTimeAfter1Hrs20MinHH= tc. germanyTimeAfter1Hrs20MinHH;
		 germanyTimeAfter1Hrs20MinMM= tc.germanyTimeAfter1Hrs20MinMM;
		
		
	
		
		ma = new F_manualAlarm (driver);
		
		
	}
		
		
	
	
	@BeforeMethod
	public void backToHomePage () throws Throwable
	{
		hp.backToHomePage(driver,   branchName);
	 
		getDetailsFromFiles();
		
	}
	
	@Test 
	public void createEventCategory() throws Throwable
		
	{
		
		
		Reporter.log(" ", true);
		Reporter.log("The process for creating event category  has been initiated..", true);
		cl.common_calendar(driver, branchName);
		cl.createEventCategory(driver, gTodaysDate, gtimeHHMMSS);
		Reporter.log("The process for ccreating event category has been completed successfully.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);
		
	}
	
	
	@Test 
	public void createCalendarEventByStationsMS() throws Throwable
		
	{
		
		
		Reporter.log(" ", true);
		Reporter.log("The process for creating calendar event by stations has been initiated..", true);
		cl.common_calendar(driver, branchName);
		cl.createCalendarEventByStationsMS(driver,  st01N, st02N,   gTodaysDate, gtimeHHMMSS);
		Reporter.log("The process for creating calendar event by stations has been completed successfully.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);
		
	}
	
	
	@Test 
	public void createCalendarEventByFireFughterMS() throws Throwable
		
	{
		tc.catchDateTime(driver);
		germanyTimeAfter5MinHH = tc.germanyTimeAfter5MinHH;
		 germanyTimeAfter5MinMM=tc.germanyTimeAfter5MinMM;
		 germanyTimeAfter20MinHH=tc.germanyTimeAfter20MinHH;
		 germanyTimeAfter20MinMM=tc.germanyTimeAfter20MinMM;
		
		
		Reporter.log(" ", true);
		Reporter.log("The process for creating calendar event by fire fighters has been initiated..", true);
		cl.common_calendar(driver, branchName);
		cl.createCalendarEventByFireFughterMS(driver,  st01N, st02N,   gTodaysDate, gtimeHHMMSS, 
				 germanyTimeAfter5MinHH,  germanyTimeAfter5MinMM, germanyTimeAfter20MinHH, germanyTimeAfter20MinMM
				, st01FF1, st02FF1);
		Reporter.log("The process for creating calendar event by fire fighters has been completed successfully.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);
		
	}
	
	
	@Test 
	public void createCalendarEventByResource() throws Throwable
		
	{
		tc.catchDateTime(driver);
		 germanyTimeAfter1Hrs5MinHH =tc.germanyTimeAfter1Hrs5MinHH;
		 germanyTimeAfter1Hrs5MinMM = tc.germanyTimeAfter1Hrs5MinMM;
		 
		 germanyTimeAfter1Hrs20MinHH= tc. germanyTimeAfter1Hrs20MinHH;
		 germanyTimeAfter1Hrs20MinMM= tc.germanyTimeAfter1Hrs20MinMM;
		
		
		Reporter.log(" ", true);
		Reporter.log("The process for creating calendar event by Resource has been initiated..", true);
		cl.common_calendar(driver, branchName);
		cl.createCalendarEventByResource ( driver,  st01N, gTodaysDate, gtimeHHMMSS, 
				 germanyTimeAfter1Hrs5MinHH,  germanyTimeAfter1Hrs5MinMM, germanyTimeAfter1Hrs20MinHH, germanyTimeAfter1Hrs20MinMM
				, st01R1);
		Reporter.log("The process for creating calendar event by Resource has been completed successfully.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);
		
	}
	
	@Test 
	public void createCalendarEventByAttribute() throws Throwable
		
	{
		tc.catchDateTime(driver);
		germanyTimeAfter5MinHH = tc.germanyTimeAfter5MinHH;
		 germanyTimeAfter5MinMM=tc.germanyTimeAfter5MinMM;
		 germanyTimeAfter20MinHH=tc.germanyTimeAfter20MinHH;
		 germanyTimeAfter20MinMM=tc.germanyTimeAfter20MinMM;
		
		
		Reporter.log(" ", true);
		Reporter.log("The process for creating calendar event by attribute has been initiated..", true);
		cl.common_calendar(driver, branchName);
		cl.createCalendarEventByAttribute(driver,  st01N, gTodaysDate, gtimeHHMMSS, 
				 germanyTimeAfter5MinHH,  germanyTimeAfter5MinMM, germanyTimeAfter20MinHH, germanyTimeAfter20MinMM
				, st01A1);
		Reporter.log("The process for creating calendar event by attribute has been completed successfully.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);
		
	}
	
	@Test 
	public void SendMessageTo1DayInformationEventByFireFighter() throws Throwable
		
	{
		
		
		Reporter.log(" ", true);
		Reporter.log("The process for sending messages for full-day Information Events using stations has been initiated..", true);
		info.common_information( driver,  branchName);
		
		info.SendMessageTo1DayInformationEventByFireFighter(driver, InfoEventNameForChat,gTodaysDate,  gtimeHHMMSS,  branchName);
		Reporter.log("The process for sending messages for full-day Information Events using stations  has been completed successfully.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);
		
	}
	
	@Test 
	public void createAlarmByNewlyAddedTemplateFromTemplateModule() throws Throwable
		
	{
		 
		
		Reporter.log(" ", true);
		Reporter.log("The process for creating Alarm By Newly Added Template From Template Module has been initiated.", true);
		at.commonAlarmTemplate(driver, branchName);
		at.createAlarmByNewlyAddedTemplateFromTemplateModule(driver, NewTemplate, gTodaysDate, gtimeHHMMSS, branchName);
		Reporter.log("The process for creating Alarm By Newly Added Template From Template Module has been completed successfully.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);
		
	}
	
	@Test 
	public void createFullDayInformationEventByStation() throws Throwable
		
	{
		tc.catchDateTime(driver);
		germanyTimeAfter5MinHH = tc.germanyTimeAfter5MinHH;
		 germanyTimeAfter5MinMM=tc.germanyTimeAfter5MinMM;
		 germanyTimeAfter20MinHH=tc.germanyTimeAfter20MinHH;
		 germanyTimeAfter20MinMM=tc.germanyTimeAfter20MinMM;
		 
		
		Reporter.log(" ", true);
		Reporter.log("The process for creating a new Information-Event full day using stations has been initiated.", true);
		info.common_information( driver,  branchName);
		
		info.createFullDayInformationEventByStation( driver, st01N ,   st02N,  gTodaysDate, gtimeHHMMSS, gTomorrowDate,  branchName );
		Reporter.log("The process for creating a new  Information-Event full day using stations has been completed successfully.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);
		
	}
	
	
	
	@Test 
	public void create1DayInformationEventByFireFighter() throws Throwable
		
	{
		tc.catchDateTime(driver);
		germanyTimeAfter5MinHH = tc.germanyTimeAfter5MinHH;
		 germanyTimeAfter5MinMM=tc.germanyTimeAfter5MinMM;
		 germanyTimeAfter20MinHH=tc.germanyTimeAfter20MinHH;
		 germanyTimeAfter20MinMM=tc.germanyTimeAfter20MinMM;
		 
		
		Reporter.log(" ", true);
		Reporter.log("The process for creating a new Information-Event using fire fighter  has been initiated.", true);
		info.common_information( driver,  branchName);
		
		info.create1DayInformationEventByFireFighter( driver,st01N ,   st02N,  gTomorrowDate, gtimeHHMMSS, st01R1,
				 St01M1, St01M2,  germanyTimeAfter5MinHH,  germanyTimeAfter5MinMM, 
				  germanyTimeAfter20MinHH,   germanyTimeAfter20MinMM , st01FF1, st02FF1 , branchName );
		Reporter.log("The process for creating a new Information-Event using fire fighter has been completed successfully.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);
		
	}
	
	
	@Test 
	public void create1HrInformationEventByResource() throws Throwable
		
	{
		tc.catchDateTime(driver);
		 germanyTimeAfter1Hrs5MinHH =tc.germanyTimeAfter1Hrs5MinHH;
		 germanyTimeAfter1Hrs5MinMM = tc.germanyTimeAfter1Hrs5MinMM;
		 
		 germanyTimeAfter1Hrs20MinHH= tc. germanyTimeAfter1Hrs20MinHH;
		 germanyTimeAfter1Hrs20MinMM= tc.germanyTimeAfter1Hrs20MinMM;
		
		 
		
		Reporter.log(" ", true);
		Reporter.log("The process for creating a new Information-Event using resource has been initiated.", true);
		info.common_information( driver,  branchName);
		
		info.create1HrInformationEventByResource( driver, st01N ,   gTodaysDate, gtimeHHMMSS, st01R1,
				 St01M1, St01M2,  germanyTimeAfter1Hrs5MinHH, germanyTimeAfter1Hrs5MinMM, 
				 germanyTimeAfter1Hrs20MinHH,  germanyTimeAfter1Hrs20MinMM , branchName );
		Reporter.log("The process for creating a new Information-Event using resource has been completed successfully.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);
		
	}
	
	
	@Test 
	public void create1MinInformationEventByAttribute() throws Throwable
		
	{
		tc.catchDateTime(driver);
		germanyTimeAfter5MinHH = tc.germanyTimeAfter5MinHH;
		 germanyTimeAfter5MinMM=tc.germanyTimeAfter5MinMM;
		 germanyTimeAfter20MinHH=tc.germanyTimeAfter20MinHH;
		 germanyTimeAfter20MinMM=tc.germanyTimeAfter20MinMM;
		
		Reporter.log(" ", true);
		Reporter.log("The process for creating a new Information-Event using attribute has been initiated.", true);
		info.common_information( driver,  branchName);
		
		info.create1MinInformationEventByAttribute( driver, st01N ,   gTodaysDate, gtimeHHMMSS, st01A1,
				 St01M1, St01M2,  germanyTimeAfter5MinHH, germanyTimeAfter5MinMM, 
				 germanyTimeAfter20MinHH,  germanyTimeAfter20MinMM , branchName );
		Reporter.log("The process for creating a new Information-Event using attribute has been completed successfully.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);
		
	}
	
	
	@Test 
	public void createMonitorInformationByFireFighterForTwoStation() throws Throwable
		
	{
		tc.catchDateTime(driver);
		germanyTimeAfter5MinHH = tc.germanyTimeAfter5MinHH;
		 germanyTimeAfter5MinMM=tc.germanyTimeAfter5MinMM;
		 germanyTimeAfter20MinHH=tc.germanyTimeAfter20MinHH;
		 germanyTimeAfter20MinMM=tc.germanyTimeAfter20MinMM;
		
		Reporter.log(" ", true);
		Reporter.log("The process for creating a new monitor information using Fire Stations has been initiated.", true);
		info.common_information( driver,  branchName);
		
		info.createMonitorInformationByFireFighterForTwoStation( driver, st01N , st02N,   gTodaysDate, gtimeHHMMSS, st01FF1,
				 St01M1, St01M2, St02M1,  germanyTimeAfter5MinHH, germanyTimeAfter5MinMM, 
				 st02FF1, germanyTimeAfter20MinHH,  germanyTimeAfter20MinMM , branchName);
		Reporter.log("The process for creating a new monitor information using Stations has been completed successfully.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);
		
	}
	
	@Test 
	public void createMonitorInformationByStations() throws Throwable
		
	{
		tc.catchDateTime(driver);
		germanyTimeAfter5MinHH = tc.germanyTimeAfter5MinHH;
		 germanyTimeAfter5MinMM=tc.germanyTimeAfter5MinMM;
		 germanyTimeAfter20MinHH=tc.germanyTimeAfter20MinHH;
		 germanyTimeAfter20MinMM=tc.germanyTimeAfter20MinMM;
		
		Reporter.log(" ", true);
		Reporter.log("The process for creating a new monitor information using Fire Stations has been initiated.", true);
		info.common_information( driver,  branchName);
		
		info.createMonitorInformationByStations( driver, st01N ,   gTodaysDate, gtimeHHMMSS,
				 St01M1, St01M2,  germanyTimeAfter5MinHH, germanyTimeAfter5MinMM, 
				 germanyTimeAfter20MinHH,  germanyTimeAfter20MinMM , branchName);
		Reporter.log("The process for creating a new monitor information using Stations has been completed successfully.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);
		
	}
	
	@Test 
	public void createMonitorInformationByFireFighter() throws Throwable
		
	{
		tc.catchDateTime(driver);
		germanyTimeAfter5MinHH = tc.germanyTimeAfter5MinHH;
		 germanyTimeAfter5MinMM=tc.germanyTimeAfter5MinMM;
		 germanyTimeAfter20MinHH=tc.germanyTimeAfter20MinHH;
		 germanyTimeAfter20MinMM=tc.germanyTimeAfter20MinMM;
		
		Reporter.log(" ", true);
		Reporter.log("The process for creating a new monitor information using Fire Fighters has been initiated.", true);
		info.common_information( driver,  branchName);
		
		info.createMonitorInformationByFireFighter(driver, st01N ,gTodaysDate, gtimeHHMMSS, st01FF1, St01M1, St01M2,  germanyTimeAfter5MinHH, 
				germanyTimeAfter5MinMM, germanyTimeAfter20MinHH, germanyTimeAfter20MinMM,  branchName);
		Reporter.log("The process for creating a new monitor information using Fire Fighters has been completed successfully.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);
		
	}
	
	@Test 
	public void createMonitorInformationByResource() throws Throwable
		
	{
		tc.catchDateTime(driver);
		germanyTimeAfter5MinHH = tc.germanyTimeAfter5MinHH;
		 germanyTimeAfter5MinMM=tc.germanyTimeAfter5MinMM;
		 germanyTimeAfter20MinHH=tc.germanyTimeAfter20MinHH;
		 germanyTimeAfter20MinMM=tc.germanyTimeAfter20MinMM;
		
		Reporter.log(" ", true);
		Reporter.log("The process for creating a new monitor information using Resource has been initiated.", true);
		info.common_information( driver,  branchName);
		
		info.createMonitorInformationByResource(driver, st01N ,gTodaysDate, gtimeHHMMSS, st01R1, St01M1, St01M2,  germanyTimeAfter5MinHH, 
				germanyTimeAfter5MinMM, germanyTimeAfter20MinHH, germanyTimeAfter20MinMM,  branchName);
		Reporter.log("The process for creating a new monitor information using Resource has been completed successfully.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);
		
	}
	
	
	@Test 
	public void createMonitorInformationByAttribute() throws Throwable
		
	{
		tc.catchDateTime(driver);
		germanyTimeAfter5MinHH = tc.germanyTimeAfter5MinHH;
		 germanyTimeAfter5MinMM=tc.germanyTimeAfter5MinMM;
		 germanyTimeAfter20MinHH=tc.germanyTimeAfter20MinHH;
		 germanyTimeAfter20MinMM=tc.germanyTimeAfter20MinMM;
		
		Reporter.log(" ", true);
		Reporter.log("The process for creating a new monitor information using attributes has been initiated.", true);
		info.common_information( driver,  branchName);
		
		info.createMonitorInformationByAttribute(driver, st01N ,gTodaysDate, gtimeHHMMSS, st01A1, St01M1, St01M2,  germanyTimeAfter5MinHH, 
				germanyTimeAfter5MinMM, germanyTimeAfter20MinHH, germanyTimeAfter20MinMM,  branchName);
		Reporter.log("The process for creating a new monitor information using attributes has been completed successfully.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

	@Test 
	public void manualAlarmByNewEscResource() throws Throwable
		
	{
		Reporter.log(" ", true);
		Reporter.log("The process of creating manual alarm by new escalation resource is started.", true);
		ma.manualAlarmCommon(driver,deptN, branchName );
		
		ma.manualAlarmByNewEscResource( driver, st01N,  gTodaysDate,  gtimeHHMMSS);
		Reporter.log("The process of creating nmanual alarm by new escalation resource is complete.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);
		
	}
	
	
	@Test 
	public void createNewEscalationResource() throws Throwable
		
	{
		Reporter.log(" ", true);
		Reporter.log("The process of creating new escaltion resource is started.", true);
		ar.commonResource(  driver,  branchName);
		ar.createNewEscalationResource( driver, st01N, gTodaysDate,  gtimeHHMMSS, St1V3, st01FF2);
		Reporter.log("The process of creating new escaltion resource is complete.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);
		
	}
	
	
	
	
	
	
	
	
	@Test 
	public void createNewAlarmEscalation() throws Throwable
		
	{
		Reporter.log(" ", true);
		Reporter.log("The process of creating new alarm escaltion is started.", true);
		ae.alarmEscaltionComman( driver,   branchName);
		ae.createNewAlarmEscalation( driver, st01N,  NewResourceEsc, branchName);
		Reporter.log("The process of creating new aalarm escaltion is complete.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);
		
	}
	
	@Test 
	public void createNewAlarmTemplateByFirefighter() throws Throwable
		
	{
		Reporter.log(" ", true);
		Reporter.log("The process of creating new alarm template by fire fighter is started.", true);
		at.commonAlarmTemplate(driver, branchName);
		at.createNewAlarmTemplateByFireFighter(driver, gTodaysDate, gtimeHHMMSS,  st02N,  st01N,  st01V1,  st02V1, st01FF1,  st02FF1);
		Reporter.log("The process of creating new alarm template by fire fighter is complete.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);
		
	}
	
	

	@Test 
	public void createNewAlarmTemplateByResource() throws Throwable
		
	{
		Reporter.log(" ", true);
		Reporter.log("The process of creating new alarm template by resource is started.", true);
		at.commonAlarmTemplate(driver, branchName);
		at.createNewAlarmTemplateByResource(driver, gTodaysDate, gtimeHHMMSS,  st02N,  st01N,  st01R1, st02R1);
		Reporter.log("The process of creating new alarm template by resource is complete.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);
		
	}
	
	

	@Test 
	public void createNewAlarmTemplateByAttribute() throws Throwable
		
	{
		Reporter.log(" ", true);
		Reporter.log("The process of creating new alarm template by attribute is started.", true);
		at.commonAlarmTemplate(driver, branchName);
		at.createNewAlarmTemplateByAttribute (driver,  gTodaysDate, gtimeHHMMSS,  st02N,  st01N , st01V1,  st02V1, st01A1,  st02A1);
		Reporter.log("The process of creating new alarm template by attribute is complete.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);
		
	}
	
	
	

	@Test 
	public void createNewAlarmLoop() throws Throwable
		
	{
		Reporter.log(" ", true);
		Reporter.log("The process of creating new alarm loop is started.", true);
		al.commonAlarmLoop(driver,  branchName);
		al.createNewAlarmLoop(driver, st02N,st01N,gTodaysDate,gtimeHHMMSS,st01R1,st02R1 );
		Reporter.log("The process of creating new alarm loop is is complete.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);
		
	}
	
	@Test 
	public void createNewResource() throws Throwable
		
	{
		Reporter.log(" ", true);
		Reporter.log("The process of creating new alarm resource is started.", true);
		ar.commonResource( driver,  branchName);
		ar.createNewResource( driver, st02N, st01N, gTodaysDate,  gtimeHHMMSS, st02V1, st01V1, st01FF1,st02FF1);
		Reporter.log("The process of creating new alarm resource is complete.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);
		
	}
	
	
	
	
	
	
	
	
	
	
	@Test 
	public void sendMessageToManualAlarmUser() throws Throwable
		
	{
		Reporter.log(" ", true);
		Reporter.log("The process of send message to manual alarm user is started.", true);
		ma.manualAlarmCommon( driver,  deptN, branchName );
		ma.sendMessageToManualAlarmUser(driver,ManualAlarmNameForChat, gTodaysDate,  gtimeHHMMSS, branchName);
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
		Reporter.log( "The process of send message to new api alarm user is complete.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);
		
	}
	
	@Test 
	public void manualaByAttributeMSLP() throws Throwable
		
	{
		Reporter.log(" ", true);
		Reporter.log("The process of creating a low priority multi station manual alarm by attribute  is started.", true);
		ma.manualAlarmCommon( driver,  deptN, branchName );
		ma.manualaByAttributeMSLP( driver, st01N, st02N,  gTodaysDate,  gtimeHHMMSS, st01V1,  st01V2, st02V1,  st01A1, st02A1 );
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
		ma.manualaByAttributeSingleStation( driver, st01N,  gTodaysDate ,gtimeHHMMSS, st01V1,  st01V2,  st01A1);
		
		
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
		ma.manualaByAttributeExtend1StStResource (  driver, st02N,  gTodaysDate,  gtimeHHMMSS, st02V1,   st02A1,  st01N,  branchName, st01REsc  );
		
		
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
		ma.manualAlarmByResourceMs( driver, st01N, st02N,  gTodaysDate,  gtimeHHMMSS, st01R1,  st01R2 );
		
		
		Reporter.log("The process of creating a manual alarm by resource is complete.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);
		
	}
	
	
	@Test 
	public void manualAlarmByOldEsclationTemplateFromSt02ToSt01 () throws Throwable
		
	{
		Reporter.log(" ", true);
		Reporter.log("The process of creating a manual alarm by template is started.", true);
		ma.manualAlarmCommon( driver,  deptN, branchName );
		ma.manualAlarmByOldEsclationTemplateFromSt02ToSt01 (driver, oldEscTemplateSt02ToSt01);
		
		
		
		Reporter.log("The process of creating a manual alarm by template is complete.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);
		
	}
	
	@Test 
	public void manualAlarmByNewREsource () throws Throwable
		
	{
		Reporter.log(" ", true);
		Reporter.log("The process of creating a manual alarm by new resource  is started.", true);
		ma.manualAlarmCommon( driver,  deptN, branchName );
		ma.manualAlarmByNewREsource( driver, st01N,  gTodaysDate,  gtimeHHMMSS);
		Reporter.log("The process of creating a manual alarm by new resource is complete.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);
		
	}
	
	
	@Test 
	public void manualAlarmByNewTemplate () throws Throwable
		
	{
		Reporter.log(" ", true);
		Reporter.log("The process of creating a manual alarm by new template is started.", true);
		ma.manualAlarmCommon( driver,  deptN, branchName );
//		ma.manualAlarmByNewTemplate (driver, st02t1);
		
		
		
		Reporter.log("The process of creating a manual alarm by new template is complete.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);
		
	}
	
	
	@Test 
	public void manualAlarmByEscResourceMs () throws Throwable
		
	{
		Reporter.log(" ", true);
		Reporter.log("The process of creating a manual alarm by escaltion resource-multi station is started.", true);
		ma.manualAlarmCommon( driver,  deptN, branchName );
		ma.manualAlarmByEscResourceMS ( driver, st02N,  gTodaysDate,  gtimeHHMMSS, st02REsc) ;
		
		
		
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
		ma.manualAlarmByEscResourceSingleStation(driver,st01N ,gTodaysDate,gtimeHHMMSS,st01REsc);
		
		
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
		ma.manualAlarmByFirefighterMs(driver, st01N, st02N,  gTodaysDate,  gtimeHHMMSS, st01V1,  st01V2,st02V1, st01FF1, st02FF1);
		
		
		Reporter.log("The process of creating a manual alarm by firefighter is complete.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);
		
	}
	
	
	// Smoke 
	
	@Test 
	public void smokeForManualAlarm() throws Throwable
	{
		ma.manualAlarmCommon(driver, deptN, branchName);
		ma.smokeForManualAlarm();
		
	}
	@Test 
	public void smokeForResource() throws Throwable
	{
		ar.commonResource(driver, branchName);
		ar.smokeForResource();
		
	}
	
	@Test
	public void smokeForAlrmLoop() throws Throwable 
	{
		
		al.commonAlarmLoop(driver, branchName);
		al.smokeForAlrmLoop();
	
	}
	@Test
	public void smokeAlarmTemplate() throws Throwable
	{
		at.commonAlarmTemplate(driver, branchName);
		at.smokeAlarmTemplate();
		
	}
	@Test
		public void smokeForEscalation() throws Throwable
		{
		
		ae.alarmEscaltionComman(driver, branchName);
		ae.smokeForEscalation();
		}
		
	@Test
		public void smokeForCalendar() throws Throwable
		{
		
		
		cl.common_calendar(driver, branchName);
		cl.smokeForCalendar();
		}
	@Test
		public void smokeForEventCategory() throws Throwable
		{
		
		cl.common_calendar(driver, branchName);
		cl.smokeForEventCategory();
		}
		
	@Test
		public void smokeForinformation() throws Throwable
		{
		
		info.common_information(driver, branchName);
		info.smokeForinformation();
		
		}
	
	@Test 
	public void smokeForCreateManualAlarm() throws Throwable
	{
		ma.manualAlarmCommon(driver, deptN, branchName);
	ma.manualAlarmByEscResourceSingleStation(driver,st01N ,gTodaysDate,gtimeHHMMSS,st01REsc);
	}
	
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	@AfterMethod
	public void backToHomePage2 (ITestResult result) throws Throwable
	{
		
		

	    if (result.getStatus() == ITestResult.FAILURE) {
	        System.out.println("Test Failed: " + result.getName());
	     takeScreenshot(driver,  gTodaysDate+"_"+gtimeHHMMSS +"_"+result.getName());
		 
		
	    }
	    
	    hp.backToHomePage(driver,   branchName);
		
		
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
