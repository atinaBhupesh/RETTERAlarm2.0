package function;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Scanner;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Reporter;
import org.testng.asserts.SoftAssert;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class b_baseClass {

	String branchName;
	String browserName;
	String scriptPsaaword;

	WebDriver driver;
	public static final String GREEN_COLOR = "\u001B[32m";
	public static final String RED_COLOR = "\u001B[31m";
	public static final String RESET_COLOR = "\u001B[0m";
	String GREEN = GREEN_COLOR + "\u2714 " + RESET_COLOR;
	String RED = RED_COLOR + "\u2716 " + RESET_COLOR;

	String filePath;

	String url;
	String userName;
	String password;
	String deptN;
	String st01N;
	String st02N;
	String st01V1;
	String st01V2;
	String st02V1;
	String st01A1;
	String st01R1;
	String st02R;
	String st01FF1;
	String st02FF1;
	String st02A1;
	String st01REsc;
	String st02REsc;
	String st02EscSt01t1;
	String st02R1;

	String NewTemplate;
	String NewResource;

	String st01FF2;
	String St1V3;
	String NewResourceEsc;
	String St01M1;
	String St01M2;
	String St02M1;
	String InfoEventNameForChat;
	String ManualAlarmNameForChat;
	String AlarmNameForChatOlddApi;
	String TemplateAlarmTitle;
	String SearhWordForDelete;
	String SearhWordForDeleteTemplate;
	String AlarmNameForChatNewdApi;
	String apiAlarmNameForEsclationAlarm;
	String manualAlarmNameForEsclationAlarm;
	String st01FFEmailCallSms;
	String ChatGroupByAttributeMS;
	String ChatGroupByResourceMS;
	String ChatGroupByAlarmLoopMS;
	String ChatGroupByFireFighterMS;
	String st01Al1;
	String st02Al1;
	String st01RCallSms;
	String email_FF;
	String firstName_FF;
	String lastName_FF;
	long contactNo_FF;
	String newVehicleName;
	String st01FFEmailCallSms_FallBack;
	String st01AttributeCallSmsEmail;
	String st01EscalarionResourceCallSmsEmail;

	String resourceNewUser;
	String attributeNewUser;
	
	String newStationName;
	String newStationMonitorName;

	String ApiAlarm01;
	String ApiAlarm02;
	String ApiAlarm03;
	String ApiAlarm04;
	String ApiAlarm05;
	String ApiAlarm06;
	String ApiAlarm07;
	String ApiAlarm08;
	String ApiAlarm09;
	String ApiAlarm10;
	String ApiAlarm11;
	String ApiAlarm12;
	String ApiAlarm13;
	String ApiAlarm14;

	String newOverviewMonitorName;

	String testAlarm_OneTime_Attribute;
	String testAlarm_recursiv_daily_Resource;
	String testAlarm_recursiv_weekly_users;
	String testAlarm_Recursive_Monthly_DayWise_Attribute;
	String testAlarm_Recursive_Monthly_DateyWise_Attribute;

	String createAvailabilityRequestOneTimeImmediate;
	String createAvailabilityRequestOneTimeSchedule;
	String createAvailabilityRequestRecursive;
	String createAvailabilityRequestMultipleDays;

//	String BGAPIAv1St01HP;
	String BGCAv1MS;
	String BGNEWApiMSHP;
//	String BGNEWAPIMS_LP;
	String BGNewAPiAlarmUpdated;
	String BGNEWApiEmailtoSt01fromSt02;
	String BGNEWAPIVehicleuser;
	String BGCNewAPist01esc;
	String BGNewApiEsc02to01LP;
	String BGNewAPiexst01from02HP;
	String BGCNewAPiexst01from02LP;
	String NewDMEAlarmNewAPIHP;
//	String BGDMEAlarmOldAPIHP;
	String BGDMEAlarmNewAPILP;

	String manualaByAttributeMSLP;
	String manualaByAttributeSingleStation;
	String manualAlarmByResourceMsHP;
	String manualAlarmByResourceMsLP;
	String manualAlarmByUersMs;
	String manualAlarmByEscResourceSingleStation;
	String manualAlarmByEscResourceMs;

	String infoDocxFile;
	String infoPdfFile;
	String infoPdf9MbFile;
	String infoPdf9Mb2File;
	String infoWord10MbFile;

	String chatJpgFile;
	String chatPngFile;
	String chatGifFile;
	String chatWordFile;
	String chatCsvFile;
	String chatPdfFile;
	String chatTextFile;
	String chatExcelFile;
	String chatPptFile;
	String chatMp4File;

	String importUserFile;
	String importEventFile;
	String updateUserFilr;

	String proEnd = "|*******************************************************|";

	public void getDetailsFromUser() throws Throwable {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the branch name > for live-1, for Testing-2, for development-3 : ");
		System.out.println();
		SoftAssert softAssert = new SoftAssert();
		branchName = scanner.nextLine();
//		branchName = "1";

		switch (branchName) {
		case "1": {

			System.out.println("*****you have selected Live branch *****");
			break;
		}
		case "1.1": {

			System.out.println("*****you have selected Live-2 branch *****");
			break;
		}

		case "2": {
			System.out.println("*****you have selected Testing branch *****");
			break;
		}

		case "3": {
			System.out.println("*****you have selected Development branch *****");
			break;
		}
		default:
			System.out.println("*****you have not selected proper branch*****");

			System.out.println("The Selenium script cannot continue because the branch name was not found.");

			System.exit(0);

			break;

		}

		System.out.print("please select browser- 1 for chrome,1.5 for chrome headless, 2 for edge,3 for firefox : ");
//		browserName = scanner.nextLine();
		browserName = "1";

		switch (browserName) {
		case "1": {
			System.out.println("*****you have selected chrome browser*****");
			break;
		}
		case "1.5": {
			System.out.println("*****you have selected chrome browser-HeadLess*****");
			break;
		}

		case "2": {
			System.out.println("*****you have selected edge browser*****");
			break;
		}

		case "3": {
			System.out.println("*****you have selected firfox browser*****");
			break;
		}

		default:
			System.out.println("*****you have not selected proper browser*****");

			System.out.println("The Selenium script cannot continue because the browser name was not found.");

			System.exit(0);

			break;

		}

		System.out.print("Enter password: ");
		String password;
//		password = scanner.nextLine();
		password = "123456";

		if (branchName != null && !branchName.isEmpty() && password != null) {

			if (password.equals("123456")) {
				System.out.println("***** Entered password is correct *****");
			} else {
				// Give second chance
				System.out.print("Wrong password. Please try again: ");
				password = scanner.nextLine();

				if (password.equals("123456")) {
					System.out.println("***** Entered password is correct *****");
				} else {
					System.out.println("The Selenium script cannot continue because your password is incorrect.");
					System.exit(0);
				}
			}

		} else {
			System.out.println("You did not enter any branch name.");
			Thread.sleep(2000);
			System.out.println();
			System.out.println("The Selenium script cannot continue because the branch name was not found.");
			System.exit(0);
		}

	}

	public void lonchBrowser() throws Throwable {

		switch (browserName) {
		case "1": {
			// Normal browser
			driver = new ChromeDriver();

//			For Headless browser 
//			WebDriverManager.chromedriver().setup();
//			ChromeOptions chromeOptions = new ChromeOptions();
//			chromeOptions.addArguments("--headless=new");
//			chromeOptions.addArguments("--window-size=1920,1080");
//			driver = new ChromeDriver(chromeOptions);
//			

			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			break;
		}
		case "1.5": {
			WebDriverManager.chromedriver().setup();
			ChromeOptions chromeOptions = new ChromeOptions();
			chromeOptions.addArguments("--headless=new");
			chromeOptions.addArguments("--window-size=1920,1080");
			driver = new ChromeDriver(chromeOptions);
			break;
		}
		case "2": {
			driver = new EdgeDriver();
			break;
		}
		case "3": {
			driver = new FirefoxDriver();
			break;
		}
		default:
			System.out.println("Browser not matched.");
			break;

		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.manage().window().maximize();

		switch (branchName) {
		case "1":
			Reporter.log("Well come to RETTERAlarm Live branch-Andrew Department", true);
			System.out.println("|*******************************************************|");

			break;
		case "1.1":
			Reporter.log("Well come to RETTERAlarm Live branch-Bhupesh Department", true);
			System.out.println("|*******************************************************|");

			break;

		case "2":
			Reporter.log("Well come to RETTERAlarm Testing branch", true);
			System.out.println("|*******************************************************|");
			break;

		case "3":
			Reporter.log("Well come to RETTERAlarm Development branch", true);
			System.out.println("|*******************************************************|");
			break;

		default:
			System.out.println("Invalid branch name: " + branchName);
			System.out.println("|*******************************************************|");
			break;
		}

	}

	public void fileLocations() {

	}

	public void getDetailsFromFiles() throws Throwable {

		switch (branchName) {

		case "1":
			filePath = "D:\\Automation_2307\\SampleFilesNew\\Details Files\\DetailsFileLiveBhupesh1.xlsx";
//			filePath = "D:\\Automation_2307\\SampleFilesNew\\Details Files\\DetailsFileLiveBhupesh - Copy.xlsx";
			password = "Atina@123";

			break;

		case "1.1":
			filePath = "D:\\Automation_2307\\SampleFilesNew\\Details Files\\DetailsFileLive.xlsx";
			password = "123456";

			break;

		case "2":
			filePath = "D:\\Automation_2307\\SampleFilesNew\\Details Files\\DetailsFileTesting.xlsx";

			password = "Qwerty@123";
			break;

		case "3":

			break;

		default:
			System.out.println("\u001B[31m✖ Invalid branch selected\u001B[0m");
		}

		// Information

		File src = new File(filePath);

		FileInputStream ipt = new FileInputStream(src);

		XSSFWorkbook wb = new XSSFWorkbook(ipt);

		XSSFSheet sheet = wb.getSheetAt(0);

		url = sheet.getRow(1).getCell(1).getStringCellValue();
		driver.get(url);

		userName = sheet.getRow(2).getCell(1).getStringCellValue();

		deptN = sheet.getRow(4).getCell(1).getStringCellValue();
		st01N = sheet.getRow(5).getCell(1).getStringCellValue();
		st02N = sheet.getRow(6).getCell(1).getStringCellValue();
		st01V1 = sheet.getRow(7).getCell(1).getStringCellValue();
		st01V2 = sheet.getRow(8).getCell(1).getStringCellValue();
		st01A1 = sheet.getRow(9).getCell(1).getStringCellValue();
		st01R1 = sheet.getRow(10).getCell(1).getStringCellValue();
		st02R1 = sheet.getRow(11).getCell(1).getStringCellValue();
		st01FF1 = sheet.getRow(12).getCell(1).getStringCellValue();
		st02FF1 = sheet.getRow(13).getCell(1).getStringCellValue();
		st02V1 = sheet.getRow(14).getCell(1).getStringCellValue();
		st02A1 = sheet.getRow(15).getCell(1).getStringCellValue();
		st01REsc = sheet.getRow(16).getCell(1).getStringCellValue();
		st02REsc = sheet.getRow(17).getCell(1).getStringCellValue();
		st02EscSt01t1 = sheet.getRow(18).getCell(1).getStringCellValue();
//		st02R1 = sheet.getRow(19).getCell(1).getStringCellValue();
		NewTemplate = sheet.getRow(20).getCell(1).getStringCellValue();
		NewResource = sheet.getRow(21).getCell(1).getStringCellValue();
		st01FF2 = sheet.getRow(22).getCell(1).getStringCellValue();
		St1V3 = sheet.getRow(23).getCell(1).getStringCellValue();
		NewResourceEsc = sheet.getRow(24).getCell(1).getStringCellValue();
		St01M1 = sheet.getRow(25).getCell(1).getStringCellValue();
		St01M2 = sheet.getRow(26).getCell(1).getStringCellValue();
		St02M1 = sheet.getRow(27).getCell(1).getStringCellValue();
		InfoEventNameForChat = sheet.getRow(28).getCell(1).getStringCellValue();
		ManualAlarmNameForChat = sheet.getRow(29).getCell(1).getStringCellValue();
		AlarmNameForChatOlddApi = sheet.getRow(30).getCell(1).getStringCellValue();
		TemplateAlarmTitle = sheet.getRow(31).getCell(1).getStringCellValue();
		SearhWordForDelete = sheet.getRow(32).getCell(1).getStringCellValue();
		SearhWordForDeleteTemplate = sheet.getRow(33).getCell(1).getStringCellValue();
		AlarmNameForChatNewdApi = sheet.getRow(34).getCell(1).getStringCellValue();
		apiAlarmNameForEsclationAlarm = sheet.getRow(35).getCell(1).getStringCellValue();
		manualAlarmNameForEsclationAlarm = sheet.getRow(36).getCell(1).getStringCellValue();
		st01FFEmailCallSms = sheet.getRow(37).getCell(1).getStringCellValue();
		ChatGroupByAttributeMS = sheet.getRow(38).getCell(1).getStringCellValue();
		ChatGroupByResourceMS = sheet.getRow(39).getCell(1).getStringCellValue();
		ChatGroupByAlarmLoopMS = sheet.getRow(40).getCell(1).getStringCellValue();
		ChatGroupByFireFighterMS = sheet.getRow(41).getCell(1).getStringCellValue();
		st01Al1 = sheet.getRow(42).getCell(1).getStringCellValue();
		st02Al1 = sheet.getRow(43).getCell(1).getStringCellValue();

		st01RCallSms = sheet.getRow(44).getCell(1).getStringCellValue();
		email_FF = sheet.getRow(45).getCell(1).getStringCellValue();
		firstName_FF = sheet.getRow(46).getCell(1).getStringCellValue();
		lastName_FF = sheet.getRow(47).getCell(1).getStringCellValue();
		contactNo_FF = (long) sheet.getRow(48).getCell(1).getNumericCellValue();
		newVehicleName = sheet.getRow(49).getCell(1).getStringCellValue();
		st01FFEmailCallSms_FallBack = sheet.getRow(50).getCell(1).getStringCellValue();
		st01AttributeCallSmsEmail = sheet.getRow(51).getCell(1).getStringCellValue();
		st01EscalarionResourceCallSmsEmail = sheet.getRow(52).getCell(1).getStringCellValue();

		resourceNewUser = sheet.getRow(53).getCell(1).getStringCellValue();
		attributeNewUser = sheet.getRow(54).getCell(1).getStringCellValue();
		newStationName = sheet.getRow(55).getCell(1).getStringCellValue();
		newStationMonitorName = sheet.getRow(56).getCell(1).getStringCellValue();

		ApiAlarm01 = sheet.getRow(57).getCell(1).getStringCellValue();
		ApiAlarm02 = sheet.getRow(58).getCell(1).getStringCellValue();
		ApiAlarm03 = sheet.getRow(59).getCell(1).getStringCellValue();
		ApiAlarm04 = sheet.getRow(60).getCell(1).getStringCellValue();
		ApiAlarm05 = sheet.getRow(61).getCell(1).getStringCellValue();
		ApiAlarm06 = sheet.getRow(62).getCell(1).getStringCellValue();
		ApiAlarm07 = sheet.getRow(63).getCell(1).getStringCellValue();
		ApiAlarm08 = sheet.getRow(64).getCell(1).getStringCellValue();
		ApiAlarm09 = sheet.getRow(65).getCell(1).getStringCellValue();
		ApiAlarm10 = sheet.getRow(66).getCell(1).getStringCellValue();
		ApiAlarm11 = sheet.getRow(67).getCell(1).getStringCellValue();
		ApiAlarm12 = sheet.getRow(68).getCell(1).getStringCellValue();
		ApiAlarm13 = sheet.getRow(69).getCell(1).getStringCellValue();
		ApiAlarm14 = sheet.getRow(70).getCell(1).getStringCellValue();
		newOverviewMonitorName = sheet.getRow(71).getCell(1).getStringCellValue();

		testAlarm_OneTime_Attribute = sheet.getRow(72).getCell(1).getStringCellValue();
		testAlarm_recursiv_daily_Resource = sheet.getRow(73).getCell(1).getStringCellValue();
		testAlarm_recursiv_weekly_users = sheet.getRow(74).getCell(1).getStringCellValue();
		testAlarm_Recursive_Monthly_DayWise_Attribute = sheet.getRow(75).getCell(1).getStringCellValue();
		testAlarm_Recursive_Monthly_DateyWise_Attribute = sheet.getRow(76).getCell(1).getStringCellValue();

		createAvailabilityRequestOneTimeImmediate = sheet.getRow(77).getCell(1).getStringCellValue();
		createAvailabilityRequestOneTimeSchedule = sheet.getRow(78).getCell(1).getStringCellValue();
		createAvailabilityRequestRecursive = sheet.getRow(79).getCell(1).getStringCellValue();
		createAvailabilityRequestMultipleDays = sheet.getRow(80).getCell(1).getStringCellValue();

//		 BGAPIAv1St01HP = sheet.getRow(81).getCell(1).getStringCellValue();
		BGCAv1MS = sheet.getRow(81).getCell(1).getStringCellValue();
		BGNEWApiMSHP = sheet.getRow(82).getCell(1).getStringCellValue();
//		 BGNEWAPIMS_LP= sheet.getRow(84).getCell(1).getStringCellValue();
		BGNewAPiAlarmUpdated = sheet.getRow(83).getCell(1).getStringCellValue();
		BGNEWApiEmailtoSt01fromSt02 = sheet.getRow(84).getCell(1).getStringCellValue();
		BGNEWAPIVehicleuser = sheet.getRow(85).getCell(1).getStringCellValue();
		BGCNewAPist01esc = sheet.getRow(86).getCell(1).getStringCellValue();
		BGNewApiEsc02to01LP = sheet.getRow(87).getCell(1).getStringCellValue();
		BGNewAPiexst01from02HP = sheet.getRow(88).getCell(1).getStringCellValue();
		BGCNewAPiexst01from02LP = sheet.getRow(89).getCell(1).getStringCellValue();
		NewDMEAlarmNewAPIHP = sheet.getRow(90).getCell(1).getStringCellValue();
		BGDMEAlarmNewAPILP=sheet.getRow(91).getCell(1).getStringCellValue();
		 
		manualaByAttributeMSLP = sheet.getRow(92).getCell(1).getStringCellValue();
		manualaByAttributeSingleStation = sheet.getRow(93).getCell(1).getStringCellValue();
		manualAlarmByResourceMsHP = sheet.getRow(94).getCell(1).getStringCellValue();
		manualAlarmByResourceMsLP = sheet.getRow(95).getCell(1).getStringCellValue();
		manualAlarmByUersMs = sheet.getRow(96).getCell(1).getStringCellValue();
		manualAlarmByEscResourceSingleStation = sheet.getRow(97).getCell(1).getStringCellValue();
		manualAlarmByEscResourceMs = sheet.getRow(98).getCell(1).getStringCellValue();

	}

	public void attachedField() {

		importUserFile = "D:\\Automation_2307\\SampleFilesNew\\Details Files\\User_Import.xlsx";
		importEventFile = "D:\\Automation_2307\\SampleFilesNew\\Details Files\\event_import.xlsx";
		updateUserFilr = "D:\\Automation_2307\\SampleFilesNew\\Details Files\\user_update.xlsx";

		infoDocxFile = "D:\\Automation_2307\\SampleFilesNew\\docx_5mb.docx";
		infoPdfFile = "D:\\Automation_2307\\SampleFilesNew\\pdf_5mb.pdf";
		infoPdf9MbFile = "D:\\Automation_2307\\SampleFilesNew\\pdf_9mb.pdf";
		infoPdf9Mb2File = "D:\\Automation_2307\\SampleFilesNew\\pdf_9mb2.pdf";
		infoWord10MbFile = "D:\\Automation_2307\\SampleFilesNew\\word_10mb.docx";

		chatJpgFile = "D:\\Automation_2307\\SampleFilesNew\\jpg_19mb.jpg";
		chatPngFile = "D:\\Automation_2307\\SampleFilesNew\\png_19mb.png";
		chatGifFile = "D:\\Automation_2307\\SampleFilesNew\\gif_12mb.gif";
		chatWordFile = "D:\\Automation_2307\\SampleFilesNew\\Word_19mb.doc";
		chatCsvFile = "D:\\Automation_2307\\SampleFilesNew\\csv_19mb.csv";
		chatPdfFile = "D:\\Automation_2307\\SampleFilesNew\\pdf_19mb.pdf";
		chatTextFile = "D:\\Automation_2307\\SampleFilesNew\\txt_19mb.txt";
		chatExcelFile = "D:\\Automation_2307\\SampleFilesNew\\excel_19mb.xlsx";
		chatPptFile = "D:\\Automation_2307\\SampleFilesNew\\ppt_19mb.pptx";
		chatMp4File = "D:\\Automation_2307\\SampleFilesNew\\mp4_19mb.mp4";

	}

	public static void takeScreenshot(WebDriver driver, String name) throws Throwable {

		TakesScreenshot screen = (TakesScreenshot) driver;
		File src = screen.getScreenshotAs(OutputType.FILE);
		File dest = new File("E:\\Automation _lapy\\MasterAutomationWorkSpcae\\screenshots\\" + name + ".jpg");
		FileHandler.copy(src, dest);

//	        		System.out.println("Screenshot saved for: " + name);

	}

	public void toZoomBrowser() throws Throwable {
		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("document.body.style.transform='scale(0.8)';" + "document.body.style.transformOrigin='0 0';");
	}

}
