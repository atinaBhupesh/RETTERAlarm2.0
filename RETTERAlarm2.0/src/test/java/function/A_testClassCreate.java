package function;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;

public class A_testClassCreate extends b_baseClass {

	C_logIn_logOut lp;
	D_homePage hp;
	F_manualTestAlarm ma;
	E_timeClass tc;
	G_resource ar;
	H_alarmLoop al;
	I_AlarmTemplate at;
	J_alarmEscalation ae;
	K_calendar cl;
	L_Information info;
	M_conversations chatGroups;
	N_users users;
	O_stationModule stn;


	P_monitors mo;
	
	Q_Attribute att;
	
	R_FileSections fs;

	String gTodaysDate;
	String germanyTodaysDate1;
	String germanyTodaysDate2;
	String germanyTodaysDate3;
	String germanyTodaysDate4;
	String gTomorrowDate;
	String gtimeHHMMSS;
	String dayName;
	String dayCount;
	int monthCount;

	String germanyTimeAfter5MinHH;
	String germanyTimeAfter5MinMM;

	String germanyTimeAfter7MinHH;
	String germanyTimeAfter7MinMM;

	String germanyTimeAfter9MinHH;
	String germanyTimeAfter9MinMM;

	String germanyTimeAfter11MinHH;
	String germanyTimeAfter11MinMM;

	String germanyTimeAfter15MinHH;
	String germanyTimeAfter15MinMM;

	String germanyTimeAfter20MinHH;
	String germanyTimeAfter20MinMM;

	String germanyTimeAfter1Hrs5MinHH;
	String germanyTimeAfter1Hrs5MinMM;

	String germanyTimeAfter1Hrs20MinHH;
	String germanyTimeAfter1Hrs20MinMM;
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
//		hp.langChange(driver);

		Thread.sleep(2000);

		hp.langChange(driver);
		ar = new G_resource(driver);
		al = new H_alarmLoop(driver);
		at = new I_AlarmTemplate(driver);
		ae = new J_alarmEscalation(driver);
		cl = new K_calendar(driver);
		info = new L_Information(driver);
		chatGroups = new M_conversations(driver);
		users = new N_users(driver);
		stn = new O_stationModule(driver);
		ma = new F_manualTestAlarm(driver);
		mo = new P_monitors(driver);
		
		att =new Q_Attribute (driver) ;
		fs= new R_FileSections  (driver) ;

	}

	@BeforeClass
	public void createObject() throws Throwable {

		attachedField();

		tc.catchDateTime(driver);

		gTodaysDate = tc.germanyTodaysDate;
		germanyTodaysDate1 = tc.germanyTodaysDate1;
		germanyTodaysDate2 = tc.germanyTodaysDate2;
		germanyTodaysDate3 = tc.germanyTodaysDate3;
		germanyTodaysDate4 = tc.germanyTodaysDate4;
		gtimeHHMMSS = tc.germanyCurrentTimeHHMMSS;
		gTomorrowDate = tc.germanyTomorrowDate;
		dayName = tc.dayName;
		dayCount = tc.dayCount;
		monthCount = tc.monthCount;

		germanyTimeAfter5MinHH = tc.germanyTimeAfter5MinHH;
		germanyTimeAfter5MinMM = tc.germanyTimeAfter5MinMM;
		germanyTimeAfter20MinHH = tc.germanyTimeAfter20MinHH;//
		germanyTimeAfter20MinMM = tc.germanyTimeAfter20MinMM;

		germanyTimeAfter1Hrs5MinHH = tc.germanyTimeAfter1Hrs5MinHH;
		germanyTimeAfter1Hrs5MinMM = tc.germanyTimeAfter1Hrs5MinMM;

		germanyTimeAfter7MinHH = tc.germanyTimeAfter7MinHH;
		germanyTimeAfter7MinMM = tc.germanyTimeAfter7MinMM;

		germanyTimeAfter9MinHH = tc.germanyTimeAfter9MinHH;
		germanyTimeAfter9MinMM = tc.germanyTimeAfter9MinMM;

		germanyTimeAfter11MinHH = tc.germanyTimeAfter11MinHH;
		germanyTimeAfter11MinMM = tc.germanyTimeAfter11MinMM;

		germanyTimeAfter15MinHH = tc.germanyTimeAfter15MinHH;
		germanyTimeAfter15MinMM = tc.germanyTimeAfter15MinMM;

		germanyTimeAfter1Hrs20MinHH = tc.germanyTimeAfter1Hrs20MinHH;
		germanyTimeAfter1Hrs20MinMM = tc.germanyTimeAfter1Hrs20MinMM;

	}

	@BeforeMethod
	public void backToHomePage() throws Throwable {
//		hp.backToHomePage(driver, branchName);

		getDetailsFromFiles();

	}

	@Test
	public void Bhupes_addAttribute() throws Throwable {
		Reporter.log(" ", true);

		att.commanAttribute(driver);

		Reporter.log(" ", true);
	}
	
	@Test
	public void addNewFile() throws Throwable {
		
		
		
		Reporter.log(" ", true);
		Reporter.log("The process of add new file is started.", true);

		fs.commanForDocumentation(driver);
		fs.addNewFile(driver,branchName,deptN ,st01N,gtimeHHMMSS );

		Reporter.log(GREEN + GREEN + "The process of add new file is started.r is complete.", true);
		Reporter.log(" ", true);
	}

	
	
	
	
	
	@Test
	public void editOverviewMonitor() throws Throwable {
		
		
		
		Reporter.log(" ", true);
		Reporter.log("The process of edit new overview monitor is started.", true);

		mo.editOverviewMonitor(driver, branchName, newOverviewMonitorName, gtimeHHMMSS);

		Reporter.log(GREEN + GREEN + "The process of edit new overview monitor is complete.", true);
		Reporter.log(" ", true);
	}

	@Test
	public void addOverviewMonitor() throws Throwable {
		Reporter.log(" ", true);
		Reporter.log("The process of add new overview monitor is started.", true);

		mo.addOverviewMonitor(driver, branchName, deptN, gtimeHHMMSS, filePath);

		Reporter.log(GREEN + GREEN + "The process of add new overview monitor is complete.", true);
		Reporter.log(" ", true);
	}

	@Test
	public void editStationMonitor() throws Throwable {
		Reporter.log(" ", true);
		Reporter.log("The process of edit new station monitor is started.", true);

		mo.editStationMonitor(driver, branchName, newStationMonitorName, newStationName, gtimeHHMMSS);

		Reporter.log(GREEN + GREEN + "The process of edit new station monitor is complete.", true);
		Reporter.log(" ", true);
	}

	@Test
	public void verifyAllApiAlarmsCretaed() throws Throwable {
		Reporter.log(" ", true);
		Reporter.log("The process of verify All Api Alarms Cretaed  is started.", true);
		ma.commonForManualAlarm(driver, deptN, branchName);
		ma.verifyAllApiAlarmsCretaed(driver, germanyTodaysDate3, germanyTodaysDate4, ApiAlarm01, ApiAlarm02, ApiAlarm03,
				ApiAlarm04, ApiAlarm05, ApiAlarm06, ApiAlarm07, ApiAlarm08, ApiAlarm09, ApiAlarm10, ApiAlarm11,
				ApiAlarm12, ApiAlarm13, ApiAlarm14);

		Reporter.log(GREEN + GREEN + "The process of verify All Api Alarms Cretaed is complete.", true);
		Reporter.log(" ", true);
	}

	@Test
	public void addStationMonitor() throws Throwable {
		Reporter.log(" ", true);
		Reporter.log("The process of add new station monitor is started.", true);

		mo.addStationMonitor(driver, branchName, newStationName, gtimeHHMMSS, filePath);

		Reporter.log(GREEN + GREEN + "The process of add new station monitor is complete.", true);
		Reporter.log(" ", true);
	}

	@Test
	public void editStation() throws Throwable {
		Reporter.log(" ", true);
		Reporter.log("The process of edit new station is started.", true);
		stn.commonForStation(driver, branchName);
		stn.editStation(driver, newStationName);

		Reporter.log(GREEN + GREEN + "The process of edit new station is complete.", true);
		Reporter.log(" ", true);
	}

	@Test
	public void addNewStation() throws Throwable {
		Reporter.log(" ", true);
		Reporter.log("The process of add new station is started.", true);
		stn.commonForStation(driver, branchName);
		stn.addNewStation(driver, gTodaysDate, gtimeHHMMSS, filePath);

		Reporter.log(GREEN + GREEN + "The process of add new station is complete.", true);
		Reporter.log(" ", true);
	}

	@Test
	public void updateUser() throws Throwable {
		Reporter.log(" ", true);
		Reporter.log("The process of update users is started.", true);
		users.commonForUser(driver, branchName);
		users.updateUser(driver, branchName, updateUserFilr, gTodaysDate, gtimeHHMMSS, st01N, st01R1);

		Reporter.log(GREEN + GREEN + "The process of update users is complete.", true);
		Reporter.log(" ", true);
	}

	@Test
	public void importEventWith1minReminder() throws Throwable

	{
		tc.catchDateTime(driver);

		germanyTimeAfter5MinHH = tc.germanyTimeAfter5MinHH;
		germanyTimeAfter5MinMM = tc.germanyTimeAfter5MinMM;

		Reporter.log(" ", true);
		Reporter.log("The process of importing event with 1 min reminder has started.", true);

		cl.common_calendar(driver, branchName);
		cl.importEventWith1minReminder(driver, importEventFile, gTodaysDate, gtimeHHMMSS, germanyTimeAfter5MinHH,
				germanyTimeAfter5MinMM, st01R1, st01N);

		Reporter.log(GREEN + GREEN + "The process of importing event with 1 min reminder is complete.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);

	}

	@Test
	public void ManualAlarForCheckEscalationAlarmCall() throws Throwable

	{

		Reporter.log(" ", true);
		Reporter.log(
				"The verification process for direct and fallback calls, SMS, and emails for esclated alarm has started.",
				true);
		ma.commonForManualAlarm(driver, deptN, branchName);
		ma.ManualAlarForCheckEscalationAlarmCall(driver, st01N, gTodaysDate, gtimeHHMMSS,
				st01EscalarionResourceCallSmsEmail);

		Reporter.log(GREEN + GREEN
				+ "The verification process for direct and fallback calls, SMS, and emails for esclated alarm is complete.",
				true);
		Reporter.log(" ", true);
		Thread.sleep(3000);

	}

	@Test
	public void ManualAlarForCheckExtendAlarmCall() throws Throwable

	{

		Reporter.log(" ", true);
		Reporter.log(
				"The verification process for direct and fallback calls, SMS, and emails for extend alarm has started.",
				true);
		ma.commonForManualAlarm(driver, deptN, branchName);
		ma.ManualAlarForCheckExtendAlarmCall(driver, st02N, gTodaysDate, gtimeHHMMSS, st02V1, st02A1, st01N, branchName,
				st01AttributeCallSmsEmail);

		Reporter.log(GREEN + GREEN
				+ "The verification process for direct and fallback calls, SMS, and emails for extend alarm is complete.",
				true);
		Reporter.log(" ", true);
		Thread.sleep(3000);

	}

	@Test
	public void ManualAlarmForDircetCall() throws Throwable

	{

		Reporter.log(" ", true);
		Reporter.log("The verification process for direct and fallback calls, SMS, and emails has started.", true);
		ma.commonForManualAlarm(driver, deptN, branchName);
		ma.ManualAlarmForDircetCall(driver, st01N, st02N, gTodaysDate, gtimeHHMMSS, st01V1, st01V2, st02V1, st01FF1,
				st01FF2, st01FFEmailCallSms, st01FFEmailCallSms_FallBack, st02FF1);

		Reporter.log(
				GREEN + GREEN + "The verification process for direct and fallback calls, SMS, and emails is complete.",
				true);
		Reporter.log(" ", true);
		Thread.sleep(3000);

	}

	@Test
	public void TestAlarm_Recursive_Monthly_DateyWise_Attribute() throws Throwable

	{

		tc.catchDateTime(driver);
		germanyTimeAfter15MinHH = tc.germanyTimeAfter15MinHH;
		germanyTimeAfter15MinMM = tc.germanyTimeAfter15MinMM;

		Reporter.log(" ", true);
		Reporter.log(
				"The process of creating Test alarm-recursive-montly_date wise by Attribute for multi station is started.",
				true);
		ma.commonForManualAlarm(driver, deptN, branchName);
		ma.TestAlarm_Recursive_Monthly_DateyWise_Attribute(driver, st01N, gTodaysDate, germanyTimeAfter15MinHH,
				germanyTimeAfter15MinMM, st01V1, st01V2, germanyTodaysDate2, dayName, st01A1);

		Reporter.log(GREEN + GREEN
				+ "The process of creating  Test alarm-recursive-montly_date wise by Attribute for multi station is complete.",
				true);
		Reporter.log(" ", true);
		Thread.sleep(3000);

	}

	@Test
	public void TestAlarm_Recursive_Monthly_DayWise_Attribute() throws Throwable

	{
		tc.catchDateTime(driver);
		germanyTimeAfter11MinHH = tc.germanyTimeAfter11MinHH;
		germanyTimeAfter11MinMM = tc.germanyTimeAfter11MinMM;

		Reporter.log(" ", true);
		Reporter.log(
				"The process of creating Test alarm-recursive-montly_day wise by Attribute for multi station is started.",
				true);
		ma.commonForManualAlarm(driver, deptN, branchName);
		ma.TestAlarm_Recursive_Monthly_DayWise_Attribute(driver, st01N, gTodaysDate, germanyTimeAfter11MinHH,
				germanyTimeAfter11MinMM, st01V1, st01V2, dayCount, dayName, st01A1);

		Reporter.log(GREEN + GREEN
				+ "The process of creating  Test alarm-recursive-montly_day wise by Attribute for multi station is complete.",
				true);
		Reporter.log(" ", true);
		Thread.sleep(3000);

	}

	@Test
	public void testAlarm_EscaltionCallSmsEmail() throws Throwable

	{
		tc.catchDateTime(driver);
		germanyTimeAfter7MinHH = tc.germanyTimeAfter7MinHH;
		germanyTimeAfter7MinMM = tc.germanyTimeAfter7MinMM;

		Reporter.log(" ", true);
		Reporter.log("The process of creating Test alarm to check call and fall back with escalation alarm is started.",
				true);
		ma.commonForManualAlarm(driver, deptN, branchName);
		ma.testAlarm_EscaltionCallSmsEmail(driver, st01N, st02N, gTodaysDate, germanyTimeAfter7MinHH,
				germanyTimeAfter7MinMM, st01EscalarionResourceCallSmsEmail);

		Reporter.log(GREEN + GREEN
				+ "The process of creating Test alarm to check call and fall back with escalation alarm is complete.",
				true);
		Reporter.log(" ", true);
		Thread.sleep(3000);
	}

	@Test
	public void testAlarm_Direct_CallSmsEmail() throws Throwable

	{
		tc.catchDateTime(driver);
		germanyTimeAfter9MinHH = tc.germanyTimeAfter9MinHH;
		germanyTimeAfter9MinMM = tc.germanyTimeAfter9MinMM;

		Reporter.log(" ", true);
		Reporter.log("The process of creating Test alarm to check call and fall back with direct alarm is started.",
				true);
		ma.commonForManualAlarm(driver, deptN, branchName);
		ma.testAlarm_Direct_CallSmsEmail(driver, st01N, st02N, gTodaysDate, germanyTimeAfter9MinHH,
				germanyTimeAfter9MinMM, dayName, st01V1, st01V2, st02V1, st01FF1, st01FFEmailCallSms,
				st01FFEmailCallSms_FallBack, st02FF1);

		Reporter.log(GREEN + GREEN
				+ "The process of creating Test alarm to check call and fall back with escalation alarm is complete.",
				true);
		Reporter.log(" ", true);
		Thread.sleep(3000);
	}

	@Test
	public void testAlarm_recursiv_weekly_users() throws Throwable

	{
		tc.catchDateTime(driver);
		germanyTimeAfter9MinHH = tc.germanyTimeAfter9MinHH;
		germanyTimeAfter9MinMM = tc.germanyTimeAfter9MinMM;

		Reporter.log(" ", true);
		Reporter.log("The process of creating Test alarm-recursive-weekly  by resource for multi station is started.",
				true);
		ma.commonForManualAlarm(driver, deptN, branchName);
		ma.testAlarm_recursiv_weekly_users(driver, st01N, st02N, gTodaysDate, germanyTimeAfter9MinHH,
				germanyTimeAfter9MinMM, dayName, st01V1, st01V2, st02V1, st01FF1, st01FF2, st02FF1);

		Reporter.log(GREEN + GREEN
				+ "The process of creating  Test alarm-recursive-weekly by resource for multi station is complete.",
				true);
		Reporter.log(" ", true);
		Thread.sleep(3000);

	}

	@Test
	public void testAlarm_recursiv_daily_Resource() throws Throwable

	{
		tc.catchDateTime(driver);
		germanyTimeAfter7MinHH = tc.germanyTimeAfter7MinHH;
		germanyTimeAfter7MinMM = tc.germanyTimeAfter7MinMM;

		Reporter.log(" ", true);
		Reporter.log(
				"The process of creating Test alarm-recursive-daily Time by resource for multi station is started.",
				true);
		ma.commonForManualAlarm(driver, deptN, branchName);
		ma.testAlarm_recursiv_daily_Resource(driver, st01N, st02N, gTodaysDate, germanyTimeAfter7MinHH,
				germanyTimeAfter7MinMM, st01R1, st02R1);

		Reporter.log(GREEN + GREEN
				+ "The process of creating  Test alarm-recursive-daily Time by resource for multi station is complete.",
				true);
		Reporter.log(" ", true);
		Thread.sleep(3000);

	}

	@Test
	public void TestAlarm_OneTime_Attribute() throws Throwable

	{
		tc.catchDateTime(driver);

		germanyTimeAfter5MinHH = tc.germanyTimeAfter5MinHH;
		germanyTimeAfter5MinMM = tc.germanyTimeAfter5MinMM;
//		System.out.println(germanyTimeAfter5MinHH);
//		System.out.println(germanyTimeAfter5MinMM);

		Reporter.log(" ", true);
		Reporter.log("The process of creating Test alarm-One Time by attribute for multi station is started.", true);
		ma.commonForManualAlarm(driver, deptN, branchName);
		ma.TestAlarm_OneTime_Attribute(driver, st01N, gTodaysDate, germanyTimeAfter5MinHH, germanyTimeAfter5MinMM,
				st01V1, st01V2, st01A1);

		Reporter.log(
				GREEN + GREEN
						+ "The process of creating  Test alarm-One Time by attribute for multi station is complete.",
				true);
		Reporter.log(" ", true);
		Thread.sleep(3000);

	}

	@Test
	public void addVehicleUser() throws Throwable {
		Reporter.log(" ", true);
		Reporter.log("The process of add vehicle user is started.", true);
		users.commonForVehicleUser(driver, branchName);
		users.addVehicleUser(driver, branchName, st01N, gTodaysDate, gtimeHHMMSS, resourceNewUser, filePath);
		Reporter.log(GREEN + GREEN + "The process of add vehicle user is complete.", true);
		Reporter.log(" ", true);
	}

	@Test
	public void importUser() throws Throwable {
		Reporter.log(" ", true);
		Reporter.log("The process of import users is started.", true);
		users.commonForUser(driver, branchName);
		users.importUser(driver, branchName, gTodaysDate, gtimeHHMMSS, st01N, st02N, germanyTodaysDate1,
				resourceNewUser, importUserFile);

		Reporter.log(GREEN + GREEN + "The process of import users is is complete.", true);
		Reporter.log(" ", true);
	}

	@Test
	public void addMultiRoleUser() throws Throwable {
		Reporter.log(" ", true);
		Reporter.log("The process of add station user is started.", true);
		users.commonForUser(driver, branchName);
		users.AddUersBasicDetail(driver, branchName, gTodaysDate, gtimeHHMMSS, filePath, "MR");
		users.addMultiRoleUser(driver, branchName, st01N, germanyTodaysDate1, gtimeHHMMSS, filePath, attributeNewUser,
				resourceNewUser);

		Reporter.log(GREEN + GREEN + "The process of add multi role user is complete.", true);
		Reporter.log(" ", true);
	}

	@Test
	public void addStataionUser() throws Throwable {
		Reporter.log(" ", true);
		Reporter.log("The process of add station user is started.", true);
		users.commonForUser(driver, branchName);
		users.AddUersBasicDetail(driver, branchName, gTodaysDate, gtimeHHMMSS, filePath, "SR");
		users.addStataionUser(driver, branchName, st01N, filePath);

		Reporter.log(GREEN + GREEN + "The process of add Station user is complete.", true);
		Reporter.log(" ", true);
	}

	@Test
	public void addAppUser() throws Throwable {
		Reporter.log(" ", true);
		Reporter.log("The process of add firefighter is started.", true);
		users.commonForUser(driver, branchName);
		users.AddUersBasicDetail(driver, branchName, gTodaysDate, gtimeHHMMSS, filePath, "AR");
		users.addAppUser(driver, branchName, st01N, germanyTodaysDate1, gtimeHHMMSS, filePath, attributeNewUser,
				resourceNewUser);

		Reporter.log(GREEN + GREEN + "The process of add App user is complete.", true);
		Reporter.log(" ", true);
	}

	@Test
	public void sendMessageToChatGroupCreatedByFireFighter() throws Throwable

	{
		Reporter.log(" ", true);
		Reporter.log("The process of send message to chat group by fire fighter is started.", true);
		chatGroups.commonForChatGroup(driver, branchName);
		chatGroups.sendMessageToChatGroupCreatedByFireFighter(driver, ChatGroupByFireFighterMS);
		Reporter.log(GREEN + GREEN + "The process of send message to chat group by fire fighter is complete.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);

	}

	@Test
	public void sendMessageToChatGroupCreatedByAlarmLoop() throws Throwable

	{
		Reporter.log(" ", true);
		Reporter.log("The process of send message to chat group by alarm loop is started.", true);
		chatGroups.commonForChatGroup(driver, branchName);
		chatGroups.sendMessageToChatGroupCreatedByAlarmLoop(driver, ChatGroupByAlarmLoopMS);
		Reporter.log(GREEN + GREEN + "The process of send message to chat group by alarm loop is complete.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);

	}

	@Test
	public void sendMessageToChatGroupCreatedByResource() throws Throwable

	{
		Reporter.log(" ", true);
		Reporter.log("The process of send message to chat group by resource is started.", true);
		chatGroups.commonForChatGroup(driver, branchName);
		chatGroups.sendMessageToChatGroupCreatedByResource(driver, ChatGroupByResourceMS);
		Reporter.log(GREEN + GREEN + "The process of send message to chat group by resource is complete.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);

	}

	@Test
	public void sendMessageToChatGroupCreatedByAttribute() throws Throwable

	{
		Reporter.log(" ", true);
		Reporter.log("The process of send message to chat group by attribute is started.", true);
		chatGroups.commonForChatGroup(driver, branchName);
		chatGroups.sendMessageToChatGroupCreatedByAttribute(driver, ChatGroupByAttributeMS);
		Reporter.log(GREEN + GREEN + "The process of send message to chat group by attribute is complete.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);

	}

	@Test
	public void createChatFroupByFireFighterMS() throws Throwable

	{
		Reporter.log(" ", true);
		Reporter.log("The process of create chat group by fire fighter is started.", true);
		chatGroups.commonForChatGroup(driver, branchName);
		chatGroups.createChatFroupByFireFighterMS(driver, st01N, st02N, gTodaysDate, gtimeHHMMSS, st01FF1, st02FF1,
				filePath);
		Reporter.log(GREEN + GREEN + "The process of create chat group by fire fighter is complete.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);

	}

	@Test
	public void createChatFroupByAlarmLoopsMS() throws Throwable

	{
		Reporter.log(" ", true);
		Reporter.log("The process of create chat group by alarm loop is started.", true);
		chatGroups.commonForChatGroup(driver, branchName);
		chatGroups.createChatFroupByAlarmLoopsMS(driver, st01N, st02N, gTodaysDate, gtimeHHMMSS, st01Al1, st02Al1,
				filePath);
		Reporter.log(GREEN + GREEN + "The process of create chat group by alarm loop is complete.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);

	}

	@Test
	public void createChatFroupByResourceMS() throws Throwable

	{
		Reporter.log(" ", true);
		Reporter.log("The process of create chat group by resource is started.", true);
		chatGroups.commonForChatGroup(driver, branchName);
		chatGroups.createChatFroupByResourceMS(driver, st01N, st02N, gTodaysDate, gtimeHHMMSS, st01R1, st02R1,
				filePath);
		Reporter.log(GREEN + GREEN + "The process of create chat group by resource is complete.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);

	}

	@Test
	public void createChatFroupByAttributeMS() throws Throwable

	{
		Reporter.log(" ", true);
		Reporter.log("The process of create chat group by attribute is started.", true);
		chatGroups.commonForChatGroup(driver, branchName);
		chatGroups.createChatFroupByAttributeMS(driver, st01N, st02N, gTodaysDate, gtimeHHMMSS, st01A1, st02A1,
				filePath);

		Reporter.log(GREEN + GREEN + "The process of create chat group by attribute is complete.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);

	}

	@Test
	public void TCAlarmTemplateCheckingValidation() throws Throwable

	{
		Reporter.log(" ", true);
		Reporter.log("The process of Checking Alarm template validation is started.", true);
		at.commonAlarmTemplate(driver, branchName);
		at.TCAlarmTemplateCheckingValidation(driver, gTodaysDate, gtimeHHMMSS, st02N, st01N, st01V1, st02V1, st01A1,
				st02A1, filePath);
		getDetailsFromFiles();

		at.commonAlarmTemplate(driver, branchName);
		at.TCAlarmTemplateCheckingValidation(driver, gTodaysDate, gtimeHHMMSS, st02N, st01N, st01V1, st02V1, st01A1,
				st02A1, filePath);
		Reporter.log(GREEN + GREEN + "The process of Checking Alarm template validation is complete.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);

	}

	@Test
	public void TCNewAlarmLoopCheckingValidation() throws Throwable

	{
		Reporter.log(" ", true);
		Reporter.log("The process of checking validation for alarm loop is started.", true);
		al.commonAlarmLoop(driver, branchName);
		al.TCcreateNewAlarmLoop(driver, st02N, st01N, gTodaysDate, gtimeHHMMSS, st01R1, st02R1, st02V1, st01V1, st01FF1,
				st02FF1);
		Reporter.log(GREEN + GREEN + "The process of checking validation for alarm loop is complete.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);

	}

	@Test
	public void TCResourceValidationChecking() throws Throwable

	{
		Reporter.log(" ", true);
		Reporter.log("The process of checking validation for alarm resource is started.", true);
		ar.commonResource(driver, branchName);
		ar.TCResourceValidationChecking(driver, st02N, st01N, gTodaysDate, gtimeHHMMSS, st02V1, st01V1, st01FF1,
				st02FF1, filePath);
		Reporter.log(GREEN + GREEN + "The process of checking validation for alarm resource is complete.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);

	}

	@Test
	public void TCCalenderEventValidationChecking() throws Throwable

	{

		Reporter.log(" ", true);
		Reporter.log("The process for checking validation for calendar event has been initiated.", true);
		cl.common_calendar(driver, branchName);
		cl.TCCalenderEventValidationChecking(driver, st01N, st02N, gTodaysDate, gtimeHHMMSS);
		Reporter.log(
				GREEN + GREEN
						+ "The process for checking validation for calendar event has been completed successfully.",
				true);
		Reporter.log(" ", true);
		Thread.sleep(3000);

	}

	@Test
	public void TCManualAlarmMSCheckingValidation() throws Throwable

	{
		Reporter.log(" ", true);
		Reporter.log("The process of checking validation for the Alarm has been initiated.", true);
		ma.commonForManualAlarm(driver, deptN, branchName);
		ma.TCManualAlarmMSCheckingValidation(driver, st01N, st02N, gTodaysDate, gtimeHHMMSS, st01R1, st02R1);

		Reporter.log(GREEN + GREEN + "The process of checking validation for the Alarm has been completed.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);

	}

	@Test
	public void TCMonitorInformationValidationChecking() throws Throwable

	{
		tc.catchDateTime(driver);
		germanyTimeAfter5MinHH = tc.germanyTimeAfter5MinHH;
		germanyTimeAfter5MinMM = tc.germanyTimeAfter5MinMM;
		germanyTimeAfter20MinHH = tc.germanyTimeAfter20MinHH;
		germanyTimeAfter20MinMM = tc.germanyTimeAfter20MinMM;

		Reporter.log(" ", true);
		Reporter.log("The process for checking validation for information has been initiated.", true);
		info.common_information(driver, branchName);

		info.TCMonitorInformationValidationChecking(driver, st01N, gTodaysDate, gtimeHHMMSS, St01M1, St01M2,
				germanyTimeAfter5MinHH, germanyTimeAfter5MinMM, germanyTimeAfter20MinHH, germanyTimeAfter20MinMM,
				branchName);
		Reporter.log(
				GREEN + GREEN
						+ "The process for checking validation for information event has been completed successfully.",
				true);
		Reporter.log(" ", true);
		Thread.sleep(3000);

	}

	@Test
	public void TCInfoeventValidationChecking() throws Throwable

	{
		tc.catchDateTime(driver);
		germanyTimeAfter5MinHH = tc.germanyTimeAfter5MinHH;
		germanyTimeAfter5MinMM = tc.germanyTimeAfter5MinMM;
		germanyTimeAfter20MinHH = tc.germanyTimeAfter20MinHH;
		germanyTimeAfter20MinMM = tc.germanyTimeAfter20MinMM;

		Reporter.log(" ", true);
		Reporter.log("The process for checking validation for information event has been initiated.", true);
		info.common_information(driver, branchName);

		info.TCInfoeventValidationChecking(driver, st01N, st02N, gTodaysDate, gtimeHHMMSS, gTomorrowDate, branchName);
		Reporter.log(
				GREEN + GREEN
						+ "The process for checking validation for information event has been completed successfully.",
				true);
		Reporter.log(" ", true);
		Thread.sleep(3000);

	}

	@Test
	public void createEventCategory() throws Throwable

	{

		Reporter.log(" ", true);
		Reporter.log("The process for creating event category  has been initiated..", true);
		cl.common_calendar(driver, branchName);
		cl.createEventCategory(driver, gTodaysDate, gtimeHHMMSS);
		Reporter.log(GREEN + GREEN + "The process for ccreating event category has been completed successfully.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);

	}

	@Test
	public void createCalendarEventByStationsMS() throws Throwable

	{

		Reporter.log(" ", true);

		Reporter.log("The process for creating calendar event by stations has been initiated..", true);
		cl.common_calendar(driver, branchName);
		cl.createCalendarEventByStationsMS(driver, st01N, st02N, gTodaysDate, gtimeHHMMSS);
		Reporter.log(
				GREEN + GREEN + "The process for creating calendar event by stations has been completed successfully.",
				true);
		Reporter.log(" ", true);
		Thread.sleep(3000);

	}

	@Test
	public void createCalendarEventByFireFughterMS() throws Throwable

	{
		tc.catchDateTime(driver);
		germanyTimeAfter5MinHH = tc.germanyTimeAfter5MinHH;
		germanyTimeAfter5MinMM = tc.germanyTimeAfter5MinMM;
		germanyTimeAfter20MinHH = tc.germanyTimeAfter20MinHH;
		germanyTimeAfter20MinMM = tc.germanyTimeAfter20MinMM;

		Reporter.log(" ", true);
		Reporter.log("The process for creating calendar event by fire fighters has been initiated..", true);
		cl.common_calendar(driver, branchName);
		cl.createCalendarEventByFireFughterMS(driver, st01N, st02N, gTodaysDate, gtimeHHMMSS, germanyTimeAfter5MinHH,
				germanyTimeAfter5MinMM, germanyTimeAfter20MinHH, germanyTimeAfter20MinMM, st01FF1, st02FF1);
		Reporter.log(
				GREEN + GREEN
						+ "The process for creating calendar event by fire fighters has been completed successfully.",
				true);
		Reporter.log(" ", true);
		Thread.sleep(3000);

	}

	@Test
	public void createCalendarEventByResource() throws Throwable

	{
		tc.catchDateTime(driver);
		germanyTimeAfter1Hrs5MinHH = tc.germanyTimeAfter1Hrs5MinHH;
		germanyTimeAfter1Hrs5MinMM = tc.germanyTimeAfter1Hrs5MinMM;

		germanyTimeAfter1Hrs20MinHH = tc.germanyTimeAfter1Hrs20MinHH;
		germanyTimeAfter1Hrs20MinMM = tc.germanyTimeAfter1Hrs20MinMM;

		Reporter.log(" ", true);
		Reporter.log("The process for creating calendar event by Resource has been initiated..", true);
		cl.common_calendar(driver, branchName);
		cl.createCalendarEventByResource(driver, st01N, gTodaysDate, gtimeHHMMSS, germanyTimeAfter1Hrs5MinHH,
				germanyTimeAfter1Hrs5MinMM, germanyTimeAfter1Hrs20MinHH, germanyTimeAfter1Hrs20MinMM, st01R1);
		Reporter.log(
				GREEN + GREEN + "The process for creating calendar event by Resource has been completed successfully.",
				true);
		Reporter.log(" ", true);
		Thread.sleep(3000);

	}

	@Test
	public void createCalendarEventByAttribute() throws Throwable

	{
		tc.catchDateTime(driver);
		germanyTimeAfter5MinHH = tc.germanyTimeAfter5MinHH;
		germanyTimeAfter5MinMM = tc.germanyTimeAfter5MinMM;
		germanyTimeAfter20MinHH = tc.germanyTimeAfter20MinHH;
		germanyTimeAfter20MinMM = tc.germanyTimeAfter20MinMM;

		Reporter.log(" ", true);
		Reporter.log("The process for creating calendar event by attribute has been initiated..", true);
		cl.common_calendar(driver, branchName);
		cl.createCalendarEventByAttribute(driver, st01N, gTodaysDate, gtimeHHMMSS, germanyTimeAfter5MinHH,
				germanyTimeAfter5MinMM, germanyTimeAfter20MinHH, germanyTimeAfter20MinMM, st01A1);
		Reporter.log(
				GREEN + GREEN + "The process for creating calendar event by attribute has been completed successfully.",
				true);
		Reporter.log(" ", true);
		Thread.sleep(3000);

	}

	@Test
	public void SendMessageTo1DayInformationEventByFireFighter() throws Throwable

	{

		Reporter.log(" ", true);
		Reporter.log(
				"The process for sending messages for full-day Information Events using stations has been initiated..",
				true);
		info.common_information(driver, branchName);

		info.SendMessageTo1DayInformationEventByFireFighter(driver, InfoEventNameForChat, gTodaysDate, gtimeHHMMSS,
				branchName);
		Reporter.log(GREEN + GREEN
				+ "The process for sending messages for full-day Information Events using stations  has been completed successfully.",
				true);
		Reporter.log(" ", true);
		Thread.sleep(3000);

	}

	@Test
	public void createAlarmByNewlyAddedTemplateFromTemplateModule() throws Throwable

	{

		Reporter.log(" ", true);
		Reporter.log("The process for creating Alarm By Newly Added Template From Template Module has been initiated.",
				true);
		at.commonAlarmTemplate(driver, branchName);
		at.createAlarmByNewlyAddedTemplateFromTemplateModule(driver, NewTemplate, gTodaysDate, gtimeHHMMSS, branchName);
		Reporter.log(GREEN + GREEN
				+ "The process for creating Alarm By Newly Added Template From Template Module has been completed successfully.",
				true);
		Reporter.log(" ", true);
		Thread.sleep(3000);

	}

	@Test
	public void createFullDayInformationEventByStation() throws Throwable

	{
		tc.catchDateTime(driver);
		germanyTimeAfter5MinHH = tc.germanyTimeAfter5MinHH;
		germanyTimeAfter5MinMM = tc.germanyTimeAfter5MinMM;
		germanyTimeAfter20MinHH = tc.germanyTimeAfter20MinHH;
		germanyTimeAfter20MinMM = tc.germanyTimeAfter20MinMM;

		Reporter.log(" ", true);
		Reporter.log("The process for creating a new Information-Event full day using stations has been initiated.",
				true);
		info.common_information(driver, branchName);

		info.createFullDayInformationEventByStation(driver, st01N, st02N, gTodaysDate, gtimeHHMMSS, gTomorrowDate,
				branchName);
		Reporter.log(GREEN + GREEN
				+ "The process for creating a new  Information-Event full day using stations has been completed successfully.",
				true);
		Reporter.log(" ", true);
		Thread.sleep(3000);

	}

	@Test
	public void create1DayInformationEventByFireFighter() throws Throwable

	{
		tc.catchDateTime(driver);
		germanyTimeAfter5MinHH = tc.germanyTimeAfter5MinHH;
		germanyTimeAfter5MinMM = tc.germanyTimeAfter5MinMM;
		germanyTimeAfter20MinHH = tc.germanyTimeAfter20MinHH;
		germanyTimeAfter20MinMM = tc.germanyTimeAfter20MinMM;

		Reporter.log(" ", true);
		Reporter.log("The process for creating a new Information-Event using fire fighter  has been initiated.", true);
		info.common_information(driver, branchName);

		info.create1DayInformationEventByFireFighter(driver, st01N, st02N, gTomorrowDate, gtimeHHMMSS, st01R1, St01M1,
				St01M2, germanyTimeAfter5MinHH, germanyTimeAfter5MinMM, germanyTimeAfter20MinHH,
				germanyTimeAfter20MinMM, st01FF1, st02FF1, branchName, filePath);
		Reporter.log(GREEN + GREEN
				+ "The process for creating a new Information-Event using fire fighter has been completed successfully.",
				true);
		Reporter.log(" ", true);
		Thread.sleep(3000);

	}

	@Test
	public void create1HrInformationEventByResource() throws Throwable

	{
		tc.catchDateTime(driver);
		germanyTimeAfter1Hrs5MinHH = tc.germanyTimeAfter1Hrs5MinHH;
		germanyTimeAfter1Hrs5MinMM = tc.germanyTimeAfter1Hrs5MinMM;

		germanyTimeAfter1Hrs20MinHH = tc.germanyTimeAfter1Hrs20MinHH;
		germanyTimeAfter1Hrs20MinMM = tc.germanyTimeAfter1Hrs20MinMM;

		Reporter.log(" ", true);
		Reporter.log("The process for creating a new Information-Event using resource has been initiated.", true);
		info.common_information(driver, branchName);

		info.create1HrInformationEventByResource(driver, st01N, gTodaysDate, gtimeHHMMSS, st01R1, St01M1, St01M2,
				germanyTimeAfter1Hrs5MinHH, germanyTimeAfter1Hrs5MinMM, germanyTimeAfter1Hrs20MinHH,
				germanyTimeAfter1Hrs20MinMM, branchName);
		Reporter.log(GREEN + GREEN
				+ "The process for creating a new Information-Event using resource has been completed successfully.",
				true);
		Reporter.log(" ", true);
		Thread.sleep(3000);

	}

	@Test
	public void create1MinInformationEventByAttribute() throws Throwable

	{
		tc.catchDateTime(driver);
		germanyTimeAfter5MinHH = tc.germanyTimeAfter5MinHH;
		germanyTimeAfter5MinMM = tc.germanyTimeAfter5MinMM;
		germanyTimeAfter20MinHH = tc.germanyTimeAfter20MinHH;
		germanyTimeAfter20MinMM = tc.germanyTimeAfter20MinMM;

		Reporter.log(" ", true);
		Reporter.log("The process for creating a new Information-Event using attribute has been initiated.", true);
		info.common_information(driver, branchName);

		info.create1MinInformationEventByAttribute(driver, st01N, gTodaysDate, gtimeHHMMSS, st01A1, St01M1, St01M2,
				germanyTimeAfter5MinHH, germanyTimeAfter5MinMM, germanyTimeAfter20MinHH, germanyTimeAfter20MinMM,
				branchName);
		Reporter.log(GREEN + GREEN
				+ "The process for creating a new Information-Event using attribute has been completed successfully.",
				true);
		Reporter.log(" ", true);
		Thread.sleep(3000);

	}

	@Test
	public void createMonitorInformationByFireFighterForTwoStation() throws Throwable

	{
		tc.catchDateTime(driver);

		Reporter.log(" ", true);
		Reporter.log("The process for creating a new monitor information using Fire Stations (MS) has been initiated.",
				true);
		info.common_information(driver, branchName);

		info.createMonitorInformationByFireFighterForTwoStation(driver, st01N, st02N, gTodaysDate, gtimeHHMMSS, st01FF1,
				St01M1, St01M2, St02M1, germanyTimeAfter5MinHH, germanyTimeAfter5MinMM, st02FF1,
				germanyTimeAfter20MinHH, germanyTimeAfter20MinMM, branchName);
		Reporter.log(GREEN + GREEN
				+ "The process for creating a new monitor information using Stations (MS) has been completed successfully.",
				true);
		Reporter.log(" ", true);
		Thread.sleep(3000);

	}

	@Test
	public void createMonitorInformationByStations() throws Throwable

	{
		tc.catchDateTime(driver);
		germanyTimeAfter5MinHH = tc.germanyTimeAfter5MinHH;
		germanyTimeAfter5MinMM = tc.germanyTimeAfter5MinMM;
		germanyTimeAfter20MinHH = tc.germanyTimeAfter20MinHH;
		germanyTimeAfter20MinMM = tc.germanyTimeAfter20MinMM;

		Reporter.log(" ", true);
		Reporter.log("The process for creating a new monitor information using Fire Stations has been initiated.",
				true);
		info.common_information(driver, branchName);

		info.createMonitorInformationByStations(driver, st01N, gTodaysDate, gtimeHHMMSS, St01M1, St01M2,
				germanyTimeAfter5MinHH, germanyTimeAfter5MinMM, germanyTimeAfter20MinHH, germanyTimeAfter20MinMM,
				branchName);
		Reporter.log(GREEN + GREEN
				+ "The process for creating a new monitor information using Stations has been completed successfully.",
				true);
		Reporter.log(" ", true);
		Thread.sleep(3000);

	}

	@Test
	public void createMonitorInformationByFireFighter() throws Throwable

	{
		tc.catchDateTime(driver);
		germanyTimeAfter5MinHH = tc.germanyTimeAfter5MinHH;
		germanyTimeAfter5MinMM = tc.germanyTimeAfter5MinMM;
		germanyTimeAfter20MinHH = tc.germanyTimeAfter20MinHH;
		germanyTimeAfter20MinMM = tc.germanyTimeAfter20MinMM;

		Reporter.log(" ", true);
		Reporter.log("The process for creating a new monitor information using Fire Fighters has been initiated.",
				true);
		info.common_information(driver, branchName);

		info.createMonitorInformationByFireFighter(driver, st01N, gTodaysDate, gtimeHHMMSS, st01FF1, St01M1, St01M2,
				germanyTimeAfter5MinHH, germanyTimeAfter5MinMM, germanyTimeAfter20MinHH, germanyTimeAfter20MinMM,
				branchName);
		Reporter.log(GREEN + GREEN
				+ "The process for creating a new monitor information using Fire Fighters has been completed successfully.",
				true);
		Reporter.log(" ", true);
		Thread.sleep(3000);

	}

	@Test
	public void createMonitorInformationByResource() throws Throwable

	{
		tc.catchDateTime(driver);
		germanyTimeAfter5MinHH = tc.germanyTimeAfter5MinHH;
		germanyTimeAfter5MinMM = tc.germanyTimeAfter5MinMM;
		germanyTimeAfter20MinHH = tc.germanyTimeAfter20MinHH;
		germanyTimeAfter20MinMM = tc.germanyTimeAfter20MinMM;

		Reporter.log(" ", true);
		Reporter.log("The process for creating a new monitor information using Resource has been initiated.", true);
		info.common_information(driver, branchName);

		info.createMonitorInformationByResource(driver, st01N, gTodaysDate, gtimeHHMMSS, st01R1, St01M1, St01M2,
				germanyTimeAfter5MinHH, germanyTimeAfter5MinMM, germanyTimeAfter20MinHH, germanyTimeAfter20MinMM,
				branchName);
		Reporter.log(GREEN + GREEN
				+ "The process for creating a new monitor information using Resource has been completed successfully.",
				true);
		Reporter.log(" ", true);
		Thread.sleep(3000);

	}

	@Test
	public void createMonitorInformationByAttributeWithAttachments() throws Throwable

	{
		tc.catchDateTime(driver);
		germanyTimeAfter5MinHH = tc.germanyTimeAfter5MinHH;
		germanyTimeAfter5MinMM = tc.germanyTimeAfter5MinMM;
		germanyTimeAfter20MinHH = tc.germanyTimeAfter20MinHH;
		germanyTimeAfter20MinMM = tc.germanyTimeAfter20MinMM;

		Reporter.log(" ", true);
//		Reporter.log("The process for creating a new monitor information using attributes has been initiated.", true);
		info.common_information(driver, branchName);

		info.createMonitorInformationByAttributeWithAttachments(driver, st01N, gTodaysDate, gtimeHHMMSS, st01A1, St01M1, St01M2,
				germanyTimeAfter5MinHH, germanyTimeAfter5MinMM, germanyTimeAfter20MinHH, germanyTimeAfter20MinMM,
				infoDocxFile, infoPdfFile, infoPdf9MbFile, infoPdf9Mb2File, infoWord10MbFile, branchName);
//		Reporter.log(GREEN + GREEN+ "The process for creating a new monitor information using attributes has been completed successfully.",true);
		Reporter.log(" ", true);
		Thread.sleep(3000);

	}

	@Test
	public void manualAlarmByNewEscResource() throws Throwable

	{
		Reporter.log(" ", true);
		Reporter.log("The process of creating manual alarm by new escalation resource is started.", true);
		ma.commonForManualAlarm(driver, deptN, branchName);

		ma.manualAlarmByNewEscResource(driver, st01N, gTodaysDate, gtimeHHMMSS, filePath);
		Reporter.log(GREEN + GREEN + "The process of creating nmanual alarm by new escalation resource is complete.",
				true);
		Reporter.log(" ", true);
		Thread.sleep(3000);

	}

	@Test
	public void createNewEscalationResource() throws Throwable

	{
		Reporter.log(" ", true);
		Reporter.log("The process of creating new escaltion resource is started.", true);
		ar.commonResource(driver, branchName);
		ar.createNewEscalationResource(driver, st01N, gTodaysDate, gtimeHHMMSS, St1V3, st01FF2, filePath);
		Reporter.log(GREEN + GREEN + "The process of creating new escaltion resource is complete.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);

	}

	@Test
	public void createNewAlarmEscalation() throws Throwable

	{
		Reporter.log(" ", true);
		Reporter.log("The process of creating new alarm escaltion is started.", true);
		ae.alarmEscaltionComman(driver, branchName);
		ae.createNewAlarmEscalation(driver, st01N, NewResourceEsc, branchName);
		Reporter.log(GREEN + GREEN + "The process of creating new aalarm escaltion is complete.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);

	}

	@Test
	public void createNewAlarmTemplateByFirefighter() throws Throwable

	{
		Reporter.log(" ", true);
		Reporter.log("The process of creating new alarm template by fire fighter is started.", true);
		at.commonAlarmTemplate(driver, branchName);
		at.createNewAlarmTemplateByFireFighter(driver, gTodaysDate, gtimeHHMMSS, st02N, st01N, st01V1, st02V1, st01FF1,
				st02FF1);
		Reporter.log(GREEN + GREEN + "The process of creating new alarm template by fire fighter is complete.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);

	}

	@Test
	public void createNewAlarmTemplateByResource() throws Throwable

	{
		Reporter.log(" ", true);
		Reporter.log("The process of creating new alarm template by resource is started.", true);
		at.commonAlarmTemplate(driver, branchName);
		at.createNewAlarmTemplateByResource(driver, gTodaysDate, gtimeHHMMSS, st02N, st01N, st01R1, st02R1);
		Reporter.log(GREEN + GREEN + "The process of creating new alarm template by resource is complete.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);

	}

	@Test
	public void createNewAlarmTemplateByAttribute() throws Throwable

	{
		Reporter.log(" ", true);
		Reporter.log("The process of creating new alarm template by attribute is started.", true);
		at.commonAlarmTemplate(driver, branchName);
		at.createNewAlarmTemplateByAttribute(driver, gTodaysDate, gtimeHHMMSS, st02N, st01N, st01V1, st02V1, st01A1,
				st02A1, filePath);
		Reporter.log(GREEN + GREEN + "The process of creating new alarm template by attribute is complete.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);

	}

	@Test
	public void createNewAlarmLoop() throws Throwable

	{
		Reporter.log(" ", true);
		Reporter.log("The process of creating new alarm loop is started.", true);
		al.commonAlarmLoop(driver, branchName);
		al.createNewAlarmLoop(driver, st02N, st01N, gTodaysDate, gtimeHHMMSS, st01R1, st02R1);
		Reporter.log(GREEN + GREEN + "The process of creating new alarm loop is is complete.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);

	}

	@Test
	public void createNewResource() throws Throwable

	{
		Reporter.log(" ", true);
		Reporter.log("The process of creating new alarm resource is started.", true);
		ar.commonResource(driver, branchName);
		ar.createNewResource(driver, st02N, st01N, gTodaysDate, gtimeHHMMSS, st02V1, st01V1, st01FF1, st02FF1,
				filePath);
		Reporter.log(GREEN + GREEN + "The process of creating new alarm resource is complete.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);

	}

	@Test
	public void sendMessageToManualAlarmUser() throws Throwable

	{
		Reporter.log(" ", true);
		Reporter.log("The process of send message to manual alarm user is started.", true);
		ma.commonForManualAlarm(driver, deptN, branchName);
		ma.sendMessageToManualAlarmUser(driver, ManualAlarmNameForChat, gTodaysDate, gtimeHHMMSS, branchName);
		Reporter.log(GREEN + GREEN + "The process of send message to manual alarm user is complete.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);

	}

	@Test
	public void sendMessageToOldApiAlarmUser() throws Throwable

	{
		Reporter.log(" ", true);
		Reporter.log("The process of send message to old api alarm user is started.", true);
		ma.commonForManualAlarm(driver, deptN, branchName);
		ma.sendMessageToOldApiAlarmUser(driver, AlarmNameForChatOlddApi, branchName);
		Reporter.log(GREEN + GREEN + "The process of send message to old api alarm user is complete.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);

	}

	@Test
	public void sendMessageToNewApiAlarmUser() throws Throwable

	{
		Reporter.log(" ", true);
		Reporter.log("The process of send message to new api alarm user is started.", true);
		ma.commonForManualAlarm(driver, deptN, branchName);
		ma.sendMessageToNewApiAlarmUser(driver, AlarmNameForChatNewdApi, branchName);
		Reporter.log(GREEN + GREEN + "The process of send message to new api alarm user is complete.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);

	}

	@Test
	public void CheckAlarmExtendFunctionalityNewApi() throws Throwable

	{
		Reporter.log(" ", true);
		Reporter.log("The process of checking extend alarm functionality  is started.", true);
		ma.commonForManualAlarm(driver, deptN, branchName);
		ma.CheckAlarmExtendFunctionalityNewApi(driver, AlarmNameForChatNewdApi, branchName);
		Reporter.log(GREEN + GREEN + "The process ofchecking extend alarm functionality is complete.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);

	}

	@Test
	public void CheckManualAlarmEscalationFunctionality() throws Throwable

	{
		Reporter.log(" ", true);
		Reporter.log("The process of checking escaltion for manual alarm is started.", true);
		ma.commonForManualAlarm(driver, deptN, branchName);
		ma.CheckManualAlarmEscalationFunctionalityForMultuStation(driver, manualAlarmNameForEsclationAlarm, branchName);
		Reporter.log(GREEN + GREEN + "The process of checking escaltion for manual alarm is complete.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);

	}

	@Test
	public void CheckApiAlarmEscalationFunctionality() throws Throwable

	{
		Reporter.log(" ", true);
		Reporter.log("The process of checking escaltion for api alarm is started.", true);
		ma.commonForManualAlarm(driver, deptN, branchName);
		ma.CheckApiAlarmEscalationFunctionality(driver, apiAlarmNameForEsclationAlarm, branchName);
		Reporter.log(GREEN + GREEN + "The process of checking escaltion for api alarm is complete.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);

	}

	@Test
	public void sendMessageToApiEsclationAlarm() throws Throwable

	{
		Reporter.log(" ", true);
		Reporter.log("The process of send message to escalation alarm user is started.", true);
		ma.commonForManualAlarm(driver, deptN, branchName);
		ma.sendMessageToApiEsclationAlarm(driver, apiAlarmNameForEsclationAlarm, chatJpgFile, chatPngFile, chatGifFile,
				chatWordFile, chatCsvFile, chatPdfFile, chatTextFile, chatExcelFile, chatPptFile, chatMp4File,
				branchName);
		Reporter.log(GREEN + GREEN + "The process of send message to escalation alarm user is complete.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);

	}

	@Test
	public void manualaByAttributeMSLP() throws Throwable

	{
		Reporter.log(" ", true);
		Reporter.log("The process of creating a low priority multi station manual alarm by attribute  is started.",
				true);
		ma.commonForManualAlarm(driver, deptN, branchName);
		ma.manualaByAttributeMSLP(driver, st01N, st02N, gTodaysDate, gtimeHHMMSS, st01V1, st01V2, st02V1, st01A1,
				st02A1);
		Reporter.log(
				GREEN + GREEN
						+ "The process of creating a low priority multi station manual alarm by attribute is complete.",
				true);
		Reporter.log(" ", true);
		Thread.sleep(3000);

	}

	@Test
	public void manualaByAttributeSingleStation() throws Throwable

	{
		Reporter.log(" ", true);
		Reporter.log("The process of creating a manual alarm by attribute  is started.", true);
		ma.commonForManualAlarm(driver, deptN, branchName);
		ma.manualaByAttributeSingleStation(driver, st01N, gTodaysDate, gtimeHHMMSS, st01V1, st01V2, st01A1);

		Reporter.log(GREEN + GREEN + "The process of creating a manual alarm by attribute is complete.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);

	}

	@Test
	public void manualaByAttributeExtend1To01StEscResourceFrom02() throws Throwable

	{
		Reporter.log(" ", true);
		Reporter.log(
				"The process of creating a manual alarm by attribute st2 and extend to st1 by resource is started.",
				true);
		ma.commonForManualAlarm(driver, deptN, branchName);
		ma.manualaByAttributeExtend1To01StEscResourceFrom02(driver, st02N, gTodaysDate, gtimeHHMMSS, st02V1, st02A1,
				st01N, branchName, st01R1, filePath);

		Reporter.log(GREEN + GREEN
				+ "The process of creating a manual alarm by attribute st2 and extend to st1 by resource is complete.",
				true);
		Reporter.log(" ", true);
		Thread.sleep(3000);

	}

	@Test
	public void manualAlarmByResourceMsHP() throws Throwable

	{
		Reporter.log(" ", true);
		Reporter.log("The process of creating a manual alarm by resource-HP is started.", true);
		ma.commonForManualAlarm(driver, deptN, branchName);
		ma.manualAlarmByResourceMsHP(driver, st01N, st02N, gTodaysDate, gtimeHHMMSS, st01R1, st02R1);

		Reporter.log(GREEN + GREEN + "The process of creating a manual alarm by resource-HP is complete.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);

	}

	@Test
	public void manualAlarmByResourceMsLP() throws Throwable

	{
		Reporter.log(" ", true);
		Reporter.log("The process of creating a manual alarm by resource-LP is started.", true);
		ma.commonForManualAlarm(driver, deptN, branchName);
		ma.manualAlarmByResourceMsLP(driver, st01N, st02N, gTodaysDate, gtimeHHMMSS, st01R1, st02R1);

		Reporter.log(GREEN + GREEN + "The process of creating a manual alarm by esource-LP is complete.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);

	}

	@Test
	public void manualAlarmByOldEsclationTemplateFromSt02ToSt01() throws Throwable

	{
		Reporter.log(" ", true);
		Reporter.log("The process of creating a manual alarm by template is started.", true);
		ma.commonForManualAlarm(driver, deptN, branchName);
		ma.manualAlarmByOldEsclationTemplateFromSt02ToSt01(driver, st02EscSt01t1, TemplateAlarmTitle);

		Reporter.log(GREEN + GREEN + "The process of creating a manual alarm by template is complete.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);

	}

	@Test
	public void manualAlarmByNewREsource() throws Throwable

	{
		Reporter.log(" ", true);
		Reporter.log("The process of creating a manual alarm by new resource  is started.", true);
		ma.commonForManualAlarm(driver, deptN, branchName);
		ma.manualAlarmByNewREsource(driver, st01N, gTodaysDate, gtimeHHMMSS, filePath);
		Reporter.log(GREEN + GREEN + "The process of creating a manual alarm by new resource is complete.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);

	}

	@Test
	public void manualAlarmByNewTemplate() throws Throwable

	{
		Reporter.log(" ", true);
		Reporter.log("The process of creating a manual alarm by new template is started.", true);
		ma.commonForManualAlarm(driver, deptN, branchName);
//		ma.manualAlarmByNewTemplate (driver, st02t1);

		Reporter.log(GREEN + GREEN + "The process of creating a manual alarm by new template is complete.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);

	}

	@Test
	public void manualAlarmByEscResourceMs() throws Throwable

	{
		Reporter.log(" ", true);
		Reporter.log("The process of creating a manual alarm by escaltion resource-multi station is started.", true);
		ma.commonForManualAlarm(driver, deptN, branchName);
		ma.manualAlarmByEscResourceMS(driver, st02N, gTodaysDate, gtimeHHMMSS, st02REsc);

		Reporter.log(
				GREEN + GREEN
						+ "The process of creating a manual alarm by escaltion resource-multi station is complete.",
				true);
		Reporter.log(" ", true);
		Thread.sleep(3000);

	}

	@Test
	public void manualAlarmByEscResourceSingleStation() throws Throwable

	{
		Reporter.log(" ", true);
		Reporter.log("The process of creating a manual alarm by escaltion resource-single station is started.", true);
		ma.commonForManualAlarm(driver, deptN, branchName);
		ma.manualAlarmByEscResourceSingleStation(driver, st01N, gTodaysDate, gtimeHHMMSS, st01REsc);

		Reporter.log(
				GREEN + GREEN
						+ "The process of creating a manual alarm by escaltion resource-single station is complete.",
				true);
		Reporter.log(" ", true);
		Thread.sleep(3000);

	}

	@Test
	public void manualAlarmByUersMs() throws Throwable

	{
		Reporter.log(" ", true);
		Reporter.log("The process of creating a manual alarm by firefighter is started.", true);
		ma.commonForManualAlarm(driver, deptN, branchName);
		ma.manualAlarmByUersMs(driver, st01N, st02N, gTodaysDate, gtimeHHMMSS, st01V1, st01V2, st02V1, st01FF1, st01FF2,
				st02FF1);

		Reporter.log(GREEN + GREEN + "The process of creating a manual alarm by firefighter is complete.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);

	}

	// Bhupesh

	@Test
	public void Bhupesh_testAlarm_recursiv_daily_Attribute_0900() throws Throwable

	{

		Reporter.log(" ", true);
		Reporter.log(
				"The process of creating Monthly Test alarm-recursive-daily-Attribute-09:00 Time by resource for multi station is started.",
				true);
		ma.commonForManualAlarm(driver, deptN, branchName);
		ma.Bhupesh_testAlarm_recursiv_daily_userType_time( driver,  st01N,  st02N,    "Attribute",  "09", "00",  st01V1,  st01V2,
				 st02V1,  st01A1, st02A1,  st01R1,  st02R1,  st01FF1,  st01FF2,  st02FF1 );

		Reporter.log(GREEN + GREEN
				+ "The process of creating Monthly Test alarm-recursive-daily-Attribute-09:00 Time by resource for multi station is complete.",
				true);
		Reporter.log(" ", true);
		Thread.sleep(3000);

	}
	
	
	
	
	@Test
	public void Bhupesh_testAlarm_recursiv_daily_Resource_0905() throws Throwable

	{

		Reporter.log(" ", true);
		Reporter.log(
				"The process of creating Monthly Test alarm-recursive-daily-Resource-09:05 Time by resource for multi station is started.",
				true);
		ma.commonForManualAlarm(driver, deptN, branchName);
		ma.Bhupesh_testAlarm_recursiv_daily_userType_time( driver,  st01N,  st02N,    "Resource",  "09", "05",  st01V1,  st01V2,
				 st02V1,  st01A1, st02A1,  st01R1,  st02R1,  st01FF1,  st01FF2,  st02FF1 );

		Reporter.log(GREEN + GREEN
				+ "The process of creating Monthly Test alarm-recursive-daily-Resource-09:05 Time by resource for multi station is complete.",
				true);
		Reporter.log(" ", true);
		Thread.sleep(3000);

	}
	
	@Test
	public void Bhupesh_testAlarm_recursiv_daily_Users_0910() throws Throwable

	{

		Reporter.log(" ", true);
		Reporter.log(
				"The process of creating Monthly Test alarm-recursive-daily-Users-09:10 Time by resource for multi station is started.",
				true);
		ma.commonForManualAlarm(driver, deptN, branchName);
		ma.Bhupesh_testAlarm_recursiv_daily_userType_time( driver,  st01N,  st02N,    "Users",  "09", "10",  st01V1,  st01V2,
				 st02V1,  st01A1, st02A1,  st01R1,  st02R1,  st01FF1,  st01FF2,  st02FF1 );

		Reporter.log(GREEN + GREEN
				+ "The process of creating Monthly Test alarm-recursive-daily-Users-09:10 Time by resource for multi station is complete.",
				true);
		Reporter.log(" ", true);
		Thread.sleep(3000);

	}
	
	
	
	@Test
	public void Bhupesh_testAlarm_recursiv_daily_Resource_1855() throws Throwable

	{

		Reporter.log(" ", true);
		Reporter.log(
				"The process of creating Monthly Test alarm-recursive-daily-Resource-18:55 Time by resource for multi station is started.",
				true);
		ma.commonForManualAlarm(driver, deptN, branchName);
		ma.Bhupesh_testAlarm_recursiv_daily_userType_time( driver,  st01N,  st02N,    "Resource",  "18", "55",  st01V1,  st01V2,
				 st02V1,  st01A1, st02A1,  st01R1,  st02R1,  st01FF1,  st01FF2,  st02FF1 );
		Reporter.log(GREEN + GREEN
				+ "The process of creating Monthly Test alarm-recursive-daily-Resource-18:55 Time by resource for multi station is complete.",
				true);
		Reporter.log(" ", true);
		Thread.sleep(3000);

	}

	
	
	
	
	
	
	
	
	@Test
	public void Bhupesh_testAlarm_recursiv_weekly_monday_attribute_0915 () throws Throwable

	{

		Reporter.log(" ", true);
		Reporter.log("The process of creating Test alarm-recursive-weekly-Monday-Attribute-09:15 by resource for multi station is started.",
				true);
		ma.commonForManualAlarm(driver, deptN, branchName);
		ma.Bhupesh_testAlarm_recursiv_weekly_weekDay_userType( driver,  st01N,  st02N, 
				    "Monday",   "Attribute",  "09",  "15" ,  st01V1,  st01V2,
					 st02V1,  st01A1, st02A1,  st01R1,  st02R1,  st01FF1,  st01FF2,  st02FF1 );

		Reporter.log(GREEN + GREEN
				+ "The process of creating  Test alarm-recursive-weekly-Monday-Attribute by resource-09:15 for multi station is complete.",
				true);
		Reporter.log(" ", true);
		Thread.sleep(3000);

	}

	@Test
	public void Bhupesh_testAlarm_recursiv_weekly_Wednesday_Resource_0915 () throws Throwable

	{

		Reporter.log(" ", true);
		Reporter.log("The process of creating Test alarm-recursive-weekly-Wednesday-Resource-09:15 for multi station is started.",
				true);
		ma.commonForManualAlarm(driver, deptN, branchName);
		ma.Bhupesh_testAlarm_recursiv_weekly_weekDay_userType( driver,  st01N,  st02N, 
			    "Wednesday",   "Resource",  "09",  "15" ,  st01V1,  st01V2,
				 st02V1,  st01A1, st02A1,  st01R1,  st02R1,  st01FF1,  st01FF2,  st02FF1 );

		Reporter.log(GREEN + GREEN
				+ "The process of creating  Test alarm-recursive-weekly-Wednesday-Resource-09:15 for multi station is complete.",
				true);
		Reporter.log(" ", true);
		Thread.sleep(3000);

	}

	@Test
	public void Bhupesh_testAlarm_recursiv_weekly_friday_users_0915() throws Throwable

	{

		Reporter.log(" ", true);
		Reporter.log("The process of creating Test alarm-recursive-weekly-Friday-Users-09:15 for multi station is started.",
				true);
		ma.commonForManualAlarm(driver, deptN, branchName);
		ma.Bhupesh_testAlarm_recursiv_weekly_weekDay_userType( driver,  st01N,  st02N, 
			    "Friday",   "Users",  "09",  "15" ,  st01V1,  st01V2,
				 st02V1,  st01A1, st02A1,  st01R1,  st02R1,  st01FF1,  st01FF2,  st02FF1 );
		Reporter.log(GREEN + GREEN
				+ "The process of creating  Test alarm-recursive-weekly-Friday-Users-09:15 for multi station is complete.",
				true);
		Reporter.log(" ", true);
		Thread.sleep(3000);

	}
	
	
	@Test
	public void Bhupesh_testAlarm_recursiv_monthly_frist_friday_Attribute_0920() throws Throwable

	{

		Reporter.log(" ", true);
		Reporter.log("The process of creating Test alarm-recursive-First friday-Attribute-09:20 for multi station is started.",
				true);
		ma.commonForManualAlarm(driver, deptN, branchName);
	ma.Bhupesh_testAlarm_recursiv_monthly_dayCount_dayName_userType( driver,  st01N,  st02N,  "Attribute",
			 "Friday", "First" ,  "09",  "20",   st01V1,  st01V2,
			 st02V1,  st01A1, st02A1,  st01R1,  st02R1,  st01FF1,  st01FF2,  st02FF1 ) ;

		Reporter.log(GREEN + GREEN
				+ "The process of creating Test alarm-recursive-First friday-Attribute-09:20 for multi station is complete.",
				true);
		Reporter.log(" ", true);
		Thread.sleep(3000);

	}
	
	
	
	@Test
	public void Bhupesh_testAlarm_recursiv_monthly_frist_friday_Resource_0925() throws Throwable

	{

		Reporter.log(" ", true);
		Reporter.log("The process of creating Test alarm-recursive-First friday-Resource-09:25 for multi station is started.",
				true);
		ma.commonForManualAlarm(driver, deptN, branchName);
	ma.Bhupesh_testAlarm_recursiv_monthly_dayCount_dayName_userType( driver,  st01N,  st02N,  "Resource",
			 "Friday", "First" ,  "09",  "25",   st01V1,  st01V2,
			 st02V1,  st01A1, st02A1,  st01R1,  st02R1,  st01FF1,  st01FF2,  st02FF1 ) ;

		Reporter.log(GREEN + GREEN
				+ "The process of creating Test alarm-recursive-First friday-Resource-09:25 for multi station is complete.",
				true);
		Reporter.log(" ", true);
		Thread.sleep(3000);

	}
	
	
	@Test
	public void Bhupesh_testAlarm_recursiv_monthly_frist_friday_Users_0930() throws Throwable

	{

		Reporter.log(" ", true);
		Reporter.log("The process of creating Test alarm-recursive-First friday-Resource-09:30 for multi station is started.",
				true);
		ma.commonForManualAlarm(driver, deptN, branchName);
	ma.Bhupesh_testAlarm_recursiv_monthly_dayCount_dayName_userType( driver,  st01N,  st02N,  "Users",
			 "Friday", "First" ,  "09",  "30",   st01V1,  st01V2,
			 st02V1,  st01A1, st02A1,  st01R1,  st02R1,  st01FF1,  st01FF2,  st02FF1 ) ;

		Reporter.log(GREEN + GREEN
				+ "The process of creating Test alarm-recursive-First friday-Resource for multi station is complete.",
				true);
		Reporter.log(" ", true);
		Thread.sleep(3000);

	}
	

	
//	Saturday
	
	@Test
	public void Bhupesh_testAlarm_recursiv_monthly_frist_Saturday_Attribute_0920() throws Throwable

	{

		Reporter.log(" ", true);
		Reporter.log("The process of creating Test alarm-recursive-First friday-Attribute-09:20 for multi station is started.",
				true);
		ma.commonForManualAlarm(driver, deptN, branchName);
	ma.Bhupesh_testAlarm_recursiv_monthly_dayCount_dayName_userType( driver,  st01N,  st02N,  "Attribute",
			 "Saturday", "First" ,  "09",  "20",   st01V1,  st01V2,
			 st02V1,  st01A1, st02A1,  st01R1,  st02R1,  st01FF1,  st01FF2,  st02FF1 ) ;

		Reporter.log(GREEN + GREEN
				+ "The process of creating Test alarm-recursive-First friday-Attribute-09:20 for multi station is complete.",
				true);
		Reporter.log(" ", true);
		Thread.sleep(3000);

	}
	
	
	
	@Test
	public void Bhupesh_testAlarm_recursiv_monthly_frist_Saturday_Resource_0925() throws Throwable

	{

		Reporter.log(" ", true);
		Reporter.log("The process of creating Test alarm-recursive-First friday-Resource-09:25 for multi station is started.",
				true);
		ma.commonForManualAlarm(driver, deptN, branchName);
	ma.Bhupesh_testAlarm_recursiv_monthly_dayCount_dayName_userType( driver,  st01N,  st02N,  "Resource",
			 "Saturday", "First" ,  "09",  "25",   st01V1,  st01V2,
			 st02V1,  st01A1, st02A1,  st01R1,  st02R1,  st01FF1,  st01FF2,  st02FF1 ) ;

		Reporter.log(GREEN + GREEN
				+ "The process of creating Test alarm-recursive-First friday-Resource-09:25 for multi station is complete.",
				true);
		Reporter.log(" ", true);
		Thread.sleep(3000);

	}
	
	
	@Test
	public void Bhupesh_testAlarm_recursiv_monthly_frist_Saturday_Users_0930() throws Throwable

	{

		Reporter.log(" ", true);
		Reporter.log("The process of creating Test alarm-recursive-First friday-Resource-09:30 for multi station is started.",
				true);
		ma.commonForManualAlarm(driver, deptN, branchName);
	ma.Bhupesh_testAlarm_recursiv_monthly_dayCount_dayName_userType( driver,  st01N,  st02N,  "Users",
			 "Saturday", "First" ,  "09",  "30",   st01V1,  st01V2,
			 st02V1,  st01A1, st02A1,  st01R1,  st02R1,  st01FF1,  st01FF2,  st02FF1 ) ;

		Reporter.log(GREEN + GREEN
				+ "The process of creating Test alarm-recursive-First friday-Resource-09:30 for multi station is complete.",
				true);
		Reporter.log(" ", true);
		Thread.sleep(3000);

	}
	@Test
	public void Bhupesh_testAlarm_recursiv_monthly_date01_Attribute_0935() throws Throwable

	{

		Reporter.log(" ", true);
		Reporter.log("The process of creating Test alarm-recursive-montly for 1st date-Attribute-09:35 for multi station is started.",
				true);
		ma.commonForManualAlarm(driver, deptN, branchName);
	ma.Bhupesh_testAlarm_recursiv_monthly_date_userType( driver,  st01N,st02N,  "Attribute",  "01",
			  "09" , "35" ,   st01V1,  st01V2,
			 st02V1,  st01A1, st02A1,  st01R1,  st02R1,  st01FF1,  st01FF2,  st02FF1 );

		Reporter.log(GREEN + GREEN
				+ "The process of creating Test alarm-recursive-montly for 1st date-Attribute-09:35 for multi station is complete.",
				true);
		Reporter.log(" ", true);
		Thread.sleep(3000);

	}
	
	
	
	@Test
	public void Bhupesh_testAlarm_recursiv_monthly_date01_Resource_0940() throws Throwable

	{

		Reporter.log(" ", true);
		Reporter.log("The process of creating Test alarm-recursive-montly for 1st date-Resource-09:40 for multi station is started.",
				true);
		ma.commonForManualAlarm(driver, deptN, branchName);
	ma.Bhupesh_testAlarm_recursiv_monthly_date_userType( driver,  st01N, st02N,  "Resource",  "01",
			 "09" , "40" ,   st01V1,  st01V2,
			 st02V1,  st01A1, st02A1,  st01R1,  st02R1,  st01FF1,  st01FF2,  st02FF1 );

		Reporter.log(GREEN + GREEN
				+ "The process of creating Test alarm-recursive-montly for 1st date-Resource-09:40 for multi station is complete.",
				true);
		Reporter.log(" ", true);
		Thread.sleep(3000);

	}
	
	
	@Test
	public void Bhupesh_testAlarm_recursiv_monthly_date01_Users_0945() throws Throwable

	{

		Reporter.log(" ", true);
		Reporter.log("The process of creating Test alarm-recursive-montly for 1st date-Users-09:45 for multi station is started.",
				true);
		ma.commonForManualAlarm(driver, deptN, branchName);
	ma.Bhupesh_testAlarm_recursiv_monthly_date_userType( driver,  st01N,st02N,  "Users",  "01",
			 "09" , "45" ,   st01V1,  st01V2,
			 st02V1,  st01A1, st02A1,  st01R1,  st02R1,  st01FF1,  st01FF2,  st02FF1 );

		Reporter.log(GREEN + GREEN
				+ "The process of creating Test alarm-recursive-montly for 1st date-Users-09:45 for multi station is complete.",
				true);
		Reporter.log(" ", true);
		Thread.sleep(3000);

	}
	

	// Smoke

	@Test
	public void smokeForManualAlarm() throws Throwable {
		ma.commonForManualAlarm(driver, deptN, branchName);
		ma.smokeForManualAlarm();

	}

	@Test
	public void smokeForResource() throws Throwable {
		ar.commonResource(driver, branchName);
		ar.smokeForResource();

	}

	@Test
	public void smokeForAlrmLoop() throws Throwable {

		al.commonAlarmLoop(driver, branchName);
		al.smokeForAlrmLoop();

	}

	@Test
	public void smokeAlarmTemplate() throws Throwable {
		at.commonAlarmTemplate(driver, branchName);
		at.smokeAlarmTemplate();

	}

	@Test
	public void smokeForEscalation() throws Throwable {

		ae.alarmEscaltionComman(driver, branchName);
		ae.smokeForEscalation();
	}

	@Test
	public void smokeForCalendar() throws Throwable {

		cl.common_calendar(driver, branchName);
		cl.smokeForCalendar();
	}

	@Test
	public void smokeForEventCategory() throws Throwable {

		cl.common_calendar(driver, branchName);
		cl.smokeForEventCategory();
	}

	@Test
	public void smokeForinformation() throws Throwable {

		info.common_information(driver, branchName);
		info.smokeForinformation();

	}

	@Test
	public void smokeForCreateManualAlarm() throws Throwable {
		ma.commonForManualAlarm(driver, deptN, branchName);
		ma.manualAlarmByEscResourceSingleStation(driver, st01N, gTodaysDate, gtimeHHMMSS, st01REsc);
	}

	@Test
	public void nextStage()

	{
		System.out.println(GREEN + GREEN + ">>>>>The next stage has started.<<<<<" + GREEN + GREEN);

	}

	@AfterMethod
	public void backToHomePage2(ITestResult result) throws Throwable {

		Thread.sleep(2000);

//		System.out.println("method end");

//		if (result.getStatus() == ITestResult.FAILURE) {
//			takeScreenshot(driver, gTodaysDate + "_" + gtimeHHMMSS + "_" + result.getName());
//			System.out.println(RED + RED + "Test Failed");
//
//		}

		System.out.println(">>> " + result.getName());

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
