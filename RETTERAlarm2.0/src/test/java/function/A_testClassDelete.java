package function;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
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

public class A_testClassDelete extends b_baseClass {

	C_logIn_logOut lp;
	D_homePage hp;
	F_manualTestAlarm ma;
	E_timeClass tc;
	G_resource ar;
	K_calendar ce;

	H_alarmLoop al;
	I_AlarmTemplate at;
	J_alarmEscalation ae;
	L_Information info;
	M_conversations chatGroups;
	N_users users;
	O_stationModule stn;
	P_monitors mo;
	
	U_MonitorLogIn mlogin;
	
	S_AvailabilityRequest arequest;
	
	T_checkList checkL;

	String gTodaysDate;
	String gtimeHHMMSS;

	long startTime;

	@BeforeSuite
	public void BeforeSuite() throws Throwable {
		startTime = System.currentTimeMillis();

		getDetailsFromUser();
		lonchBrowser();
		getDetailsFromFiles();

	}

	@BeforeTest
	public void BeforeTest() throws Throwable {

		lp = new C_logIn_logOut(driver);
		tc = new E_timeClass();
		hp = new D_homePage(driver);

		Reporter.log("Logged in user-" + userName, true);
		lp.logInUser(userName, password, driver);

		hp.langChange(driver);
		ar = new G_resource(driver);
		al = new H_alarmLoop(driver);
		at = new I_AlarmTemplate(driver);

		ae = new J_alarmEscalation(driver);
		ce = new K_calendar(driver);
		info = new L_Information(driver);
		chatGroups = new M_conversations(driver);
		users = new N_users(driver);
		stn= new O_stationModule (driver);
		mo = new P_monitors(driver);
		arequest = new S_AvailabilityRequest(driver);
		
		checkL = new T_checkList (driver);
		mlogin = new U_MonitorLogIn(driver);
		
	}

	@BeforeClass
	public void createObject() throws Throwable {

		
		ma = new F_manualTestAlarm(driver);

	}

	@BeforeMethod
	public void backToHomePage() throws Throwable {

		hp.backToHomePage(driver, branchName);
	}
	
	
	@Test
	public void cloesedAlarmFromMonitor() throws Throwable

	{
		Reporter.log(" ", true);
		Reporter.log("The process of closing the alarm has started.", true);
		mlogin.cloesedAlarmFromMonitor (  driver,  branchName,  St01M1);

		Reporter.log(GREEN + GREEN + "The process of closing the alarm is complete.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);

	}
	
	
	@Test
	public void deleteCheckList() throws Throwable

	{
		Reporter.log(" ", true);
		Reporter.log("The process of deleting the Check list has started.", true);
		checkL.deleteCheckList( driver);

		Reporter.log(GREEN + GREEN + "The process of deleting the Check list is complete.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);

	}
	

	@Test
	public void deleteAvailabilityRequestFromHistory() throws Throwable

	{
		Reporter.log(" ", true);
		Reporter.log("The process of deleting the Availability Request from History has started.", true);
		arequest.deleteAvailabilityRequestFromHistory( driver);

		Reporter.log(GREEN + GREEN + "The process of deleting the Availability Request from History is complete.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);

	}
	
	
	@Test
	public void deleteAvailabilityRequestFromList() throws Throwable

	{
		Reporter.log(" ", true);
		Reporter.log("The process of deleting the Availability Request from List has started.", true);
		arequest.deleteAvailabilityRequestFromList( driver);

		Reporter.log(GREEN + GREEN + "The process of deleting the Availability Request from List is complete.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);

	}
	
	
	@Test
	public void deleteMonitorUsers() throws Throwable

	{
		Reporter.log(" ", true);
		Reporter.log("The process of deleting monitors has started.", true);
		mo.deleteMonitorUsers( driver,  branchName);

		Reporter.log(GREEN + GREEN + "The process of deleting monitors is complete.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);

	}
	
	@Test
	public void deactiveAllActiveAlarms() throws Throwable

	{
		Reporter.log(" ", true);
		Reporter.log("The process of deactivating all active alarms has started.", true);
		ma.commonForManualAlarm(driver,  deptN,  branchName);
		ma.deactiveAllActiveAlarms(driver);
		Reporter.log("The process of deactivating all active alarms is complete.", true);

		Reporter.log(" ", true);
		Thread.sleep(3000);

	}
	
	
	
	
	
	
	@Test
	public void deleteStaions() throws Throwable

	{
		Reporter.log(" ", true);
		Reporter.log("The process of deleting stations has started.", true);
		stn.commonForStation(driver, branchName);
		stn.deleteStaions(driver);

		Reporter.log(GREEN + GREEN + "The process of deleting stations is complete.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);

	}

	
	
	
	
	
	
	
	@Test
	public void deleteVehicleUsers() throws Throwable

	{
		Reporter.log(" ", true);
		Reporter.log("The process of deleting vehicle users has started.", true);
		users.commonForVehicleUser(driver, branchName);
		users.deleteVehicleUsers(driver);

		Reporter.log(GREEN + GREEN + "The process of deleting vehicle users is complete.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);

	}

	@Test
	public void deleteUsers() throws Throwable

	{
		Reporter.log(" ", true);
		Reporter.log("The process of deleting users has started.", true);
		users.commonForUser(driver, branchName);
		users.deleteUsers(driver);

		Reporter.log(GREEN + GREEN + "The process of deleting users is complete.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);

	}

	@Test
	public void deleteChatGroups() throws Throwable

	{
		Reporter.log(" ", true);
		Reporter.log("The process of deleting chat groups has started.", true);
		chatGroups.commonForChatGroup(driver, branchName);
		chatGroups.deleteChatGroups(driver);

		Reporter.log(GREEN + GREEN + "The process of deleting chat groups is complete.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);

	}

	@Test
	public void deletedeleteEventCatogery() throws Throwable

	{
		Reporter.log(" ", true);
		Reporter.log("The process of deleting the event category has started.", true);
		ce.common_calendar(driver, branchName);
		ce.deleteEventCatogery(driver, SearhWordForDelete);

//		ma.backToOld();
		Reporter.log(GREEN + GREEN + "The process of deleting the event category is complete.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);

	}

	@Test
	public void delete_infoEvent() throws Throwable

	{
		Reporter.log(" ", true);
		Reporter.log("The process of deleting information or events has started.", true);

		info.common_information(driver, branchName);
		info.delete_infoEvent(driver, SearhWordForDelete);

//		ma.backToOld();
		Reporter.log(GREEN + GREEN + "The process of deleting information or events is complete.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);

	}

	@Test
	public void deleteAlarmEscalation() throws Throwable

	{
		Reporter.log(" ", true);
		Reporter.log("The process of deleting Alarm Escalation has started.", true);
		ae.alarmEscaltionComman(driver, branchName);
		ae.deleteAlarmEscalation(driver, SearhWordForDelete);

//		ma.backToOld();
		Reporter.log(GREEN + GREEN + "The process of deleting Alarm Escalation is complete.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);

	}

	@Test
	public void deleteAlarmTemplate() throws Throwable

	{
		Reporter.log(" ", true);
		Reporter.log("The process of deleting the alarm template has started.", true);
		at.commonAlarmTemplate(driver, branchName);
		at.deleteAlarmTemplate(driver, SearhWordForDeleteTemplate);

//		ma.backToOld();
		Reporter.log(GREEN + GREEN + "The process of deleting the alarm template is complete.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);

	}

	@Test
	public void deleteCalendarEventAll() throws Throwable

	{
		Reporter.log(" ", true);
		Reporter.log("The process of deleting all calendar events has started.", true);
		ce.common_calendar(driver, branchName);
		ce.deleteCalendarEventAll(driver);

		Reporter.log(GREEN + GREEN + "The process of deleting all calendar events is complete.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);

	}

	@Test
	public void deleteCalendarEvent() throws Throwable

	{
		Reporter.log(" ", true);
		Reporter.log("The process of deleting the calendar event has started.", true);
		ce.common_calendar(driver, branchName);
		ce.deleteCalendarEvent(driver);

		Reporter.log(GREEN + GREEN + "The process of deleting the calendar event is complete.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);

	}

	@Test
	public void deleteAlarmLoop() throws Throwable

	{
		Reporter.log(" ", true);
		Reporter.log("The process of deleting the alarm loop has started.", true);
		al.commonAlarmLoop(driver, branchName);
		al.deleteAlarmLoop(driver, SearhWordForDelete);

//		ma.backToOld();
		Reporter.log(GREEN + GREEN + "The process of deleting the alarm loop is complete.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);

	}

	@Test
	public void deleteResource() throws Throwable

	{
		Reporter.log(" ", true);
		Reporter.log("The process of deleting the alarm resource has started.", true);
		ar.commonResource(driver, branchName);
		ar.deleteResource(driver, SearhWordForDelete);

//		ma.backToOld();
		Reporter.log(GREEN + GREEN + "The process of deleting the alarm resource is complete.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);

	}
	
	
	
	@Test
	public void deactiveBgTestActiveAlarmsFromPlaningList() throws Throwable

	{
		Reporter.log(" ", true);
		Reporter.log("The process of deactivating Test alarms has started.", true);
		ma.commonForManualAlarm(driver, deptN, branchName);
		ma.deactiveBgTestActiveAlarmsFromPlaningList ( driver);

//		ma.backToOld();

		Reporter.log(GREEN + GREEN + "The process of deactivating Test alarms is complete.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);

	}

	@Test
	public void deleteTestAlarmFromPlaningList() throws Throwable

	{
		Reporter.log(" ", true);
		Reporter.log("The process of deleting Test alarms has started.", true);
		ma.commonForManualAlarm(driver, deptN, branchName);
		ma.deleteTestAlarmFromPlaningList(driver);

//		ma.backToOld();

		Reporter.log(GREEN + GREEN + "The process of deleting Test alarms is complete.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);

	}

	@Test
	public void deleteBhupeshTestAlarmFromAlarmList() throws Throwable

	{
		Reporter.log(" ", true);
		Reporter.log("The process of deleting monthly test alarms has started.", true);
		ma.commonForManualAlarm(driver, deptN, branchName);
			ma.deleteBhupeshTestAlarmFromAlarmList(driver);

		Reporter.log(GREEN + GREEN + "The process of deleting monthly test alarms is complete.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);

	}
	
	
	@Test
	public void deleteManualAlarm() throws Throwable

	{
		Reporter.log(" ", true);
		Reporter.log("The process of deleting alarms has started.", true);
		ma.commonForManualAlarm(driver, deptN, branchName);
		ma.deleteManualAlarm(driver, SearhWordForDelete);

//		ma.backToOld();

		Reporter.log(GREEN + GREEN + "The process of deleting alarms is complete.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);

	}

	@AfterMethod
	public void backToHomePage2(ITestResult result) throws Throwable {
		
		if (result.getStatus() == ITestResult.FAILURE) {
			takeScreenshot(driver, gTodaysDate + "_" + gtimeHHMMSS + "_" + result.getName());
			System.out.println(RED + RED + "Test Failed");

		}

		System.out.println(">>>" + result.getName());
		System.out.println();
		
		
		Thread.sleep(4000);

		hp.backToHomePage(driver, branchName);
	}

	@AfterClass
	public void logOut() throws Throwable {

		lp.logOut(driver);
		Reporter.log("Logout sucessfully.", true);
		Reporter.log(" ", true);

	}

	@AfterTest
	public void AfterTest() {
		driver.navigate().refresh();
		Reporter.log("Refresh the URL before successfully closing the browser.", true);
	}

	@AfterSuite
	public void AfterSute() {
		driver.quit();
		Reporter.log("Browser close sucessfully.", true);
		Reporter.log(" ", true);
		Reporter.log("Good to see you again.", true);

		long endTime = System.currentTimeMillis();
		long totalTime = endTime - startTime;

		long seconds = (totalTime / 1000) % 60;
		long minutes = (totalTime / (1000 * 60)) % 60;
		long hours = (totalTime / (1000 * 60 * 60));

		System.out.println(String.format("Total Execution Time: %02d:%02d:%02d", hours, minutes, seconds));
	}

}
