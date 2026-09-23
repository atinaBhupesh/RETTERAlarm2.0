package function;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.RenderingHints.Key;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.Reporter;

public class K_calendar extends b_baseClass {

	@FindBy(xpath = "//span[text()=\"Create New\"]")
	private WebElement createNewButton;
	@FindBy(xpath = "(//input[@class=\"dx-texteditor-input\"])[9]")
	private WebElement eventLocation;
	@FindBy(xpath = "(//div[@class=\"dx-dropdowneditor-icon\"])[7]")
	private WebElement startDate;
	@FindBy(xpath = "(//input[@class=\"dx-texteditor-input\"])[13]")
	private WebElement endDate;

	@FindBy(xpath = "(//DIV[@class=\"dx-texteditor-buttons-container\"])[11]")
	private WebElement startDateSt;
	@FindBy(xpath = "(//DIV[@class=\"dx-texteditor-buttons-container\"])[14]")
	private WebElement endDateSt;
	@FindBy(xpath = "(//span[text()=\"Today\"])[2]")
	private WebElement today1;
	@FindBy(xpath = "//input[@aria-label=\"hours\"]")
	private WebElement startDateHours;
	@FindBy(xpath = "(//div[@aria-label=\"OK\"])[2]")
	private WebElement startTimeOk;
	@FindBy(xpath = "(//span[text()=\"Today\"])[3]")
	private WebElement today2;
	@FindBy(xpath = "(//input[@aria-label=\"hours\"])[2]")
	private WebElement endDateHours;
	@FindBy(xpath = "(//div[@aria-label=\"OK\"])[3]")
	private WebElement endDateTimeOk;

	@FindBy(xpath = "//div[text()=\"Attributes\"]")
	private WebElement userTypeAttribute;

	@FindBy(xpath = "//div[text()=\"Resources\"]")
	private WebElement userTypeResource;
	@FindBy(xpath = "//div[text()=\"Fire Fighters\"]")
	private WebElement userTypeFireFighters;
	@FindBy(xpath = "//div[text()=\"Stations\"]")
	private WebElement userTypeStations;
	@FindBy(xpath = "(//input[@class=\"dx-texteditor-input\"])[5]")
	private WebElement endDate1;
	@FindBy(xpath = "//span[@class=\"dx-badge retter-defualt-badge\"]")
	private WebElement manageEventCategory;

	@FindBy(xpath = "//div[@aria-label=\"Refresh\"]")
	private WebElement refreshFilter;
	@FindBy(xpath = "//input[@placeholder=\"Information Search...\"]")
	private WebElement searchInfoEventField;
	@FindBy(xpath = "//div[@aria-label=\"Items per page: 100\"]")
	private WebElement itemsPerPage100;
	@FindBy(xpath = "//input[@placeholder=\"Search\"]")
	private WebElement searchField1;
	@FindBy(xpath = "//div[@aria-label=\"Select all\"]")
	private WebElement selectAll;
	@FindBy(xpath = "//i[@class=\"ri ri-delete-bin-6-line\"]")
	private WebElement delete;
	@FindBy(xpath = "//div[@aria-label=\"Yes, Delete\"]")
	private WebElement deleteYes;
	@FindBy(xpath = "//i[@class=\"ri ri-delete-bin-6-line\"]")
	private WebElement delateAll;
	@FindBy(xpath = "//span[contains(text(), 'Bg') or contains(text(), 'BG') or contains(text(), 'bg')]")
	private List<WebElement> availableBGInfoEvent;
	@FindBy(xpath = "//button[@class=\"btn-success btn-x30\"]")
	private WebElement createNew1;
	@FindBy(xpath = "(//div[contains(text(),'BG_EventCatogery')])[1]")
	private WebElement firstItemTitle;
	@FindBy(xpath = "(//i[@class=\"dx-icon dx-icon-overflow\"])[2]")
	private WebElement actionButton;
	@FindBy(xpath = "//dx-button[contains(@class,'delete-option')]")
	private WebElement deleteButton;
	@FindBy(xpath = "//span[text()=\"Yes, Delete\"]")
	private WebElement yesDelete;
	@FindBy(xpath = "(//span[contains(text(), 'Bg') or contains(text(), 'BG') or contains(text(), 'bg')])[1]")
	private WebElement firstEventCategory;
	// @FindBy(xpath="")private WebElement ;
	@FindBy(xpath = "//span[text()=\"Save\"]")
	private WebElement saveButton;

	@FindBy(xpath = "//div[text()=\"Fire Station is required\"]")
	private WebElement fireStationIsRequriedValidation;
	@FindBy(xpath = "//div[text()=\"Title is required\"]")
	private WebElement titleIsRequriedValidation;
	@FindBy(xpath = "//div[text()=\"Category is required\"]")
	private WebElement categoryIsRequriedValidation;
	@FindBy(xpath = "//span[text()=\"Send Push\"]")
	private WebElement sendPushToggle;
	@FindBy(xpath = "//div[text()=\"Startdate is required\"]")
	private WebElement startDateIsRequriedValidation;
	@FindBy(xpath = "//div[text()=\"Enddate is required\"]")
	private WebElement endDateIsRequriedValidation;
	@FindBy(xpath = "//div[text()=\"User type is required\"]")
	private WebElement userTypeIsRequriedValidation;
	@FindBy(xpath = "//div[text()=\"Create new event\"]")
	private WebElement createNewEventTitle;
	@FindBy(xpath = "//div[@class=\"dx-texteditor-input-container dx-tag-container\"]")
	private WebElement stationWarning;
	@FindBy(xpath = "//label[text()=\" Start Date & Time \"]")
	private WebElement startDateAndTimeLabel;
	@FindBy(xpath = "//label[text()=\" End Date & Time \"]")
	private WebElement endDateAndTimeLabel;
	@FindBy(xpath = "//label[text()=\" Start Date \"]")
	private WebElement startDateLabel;
	@FindBy(xpath = "//label[text()=\" End Date \"]")
	private WebElement endDateLabel;
	@FindBy(xpath = "//label[text()=\"Select reminder type\"]")
	private WebElement selectRemindarLabel;
	@FindBy(xpath = "//div[text()=\"Reminder type is required\"]")
	private WebElement remindarTypeIsRequriedValidation;
	@FindBy(xpath = "//span[text()=\"Set Reminder\"]")
	private WebElement setRemindarLabel;
	@FindBy(xpath = "(//div[text()=\"Select day, hour, or minute\"])[1]")
	private WebElement remindarSelectDayValidation;
	@FindBy(xpath = "(//div[text()=\"Select day, hour, or minute\"])[2]")
	private WebElement remindarSelectHrsValidation;
	@FindBy(xpath = "(//div[text()=\"Select day, hour, or minute\"])[3]")
	private WebElement remindarSelectMinValidation;
	@FindBy(xpath = "//div[text()=\"Daily\"]")
	private WebElement remindarRecursivDailyLabel;
	@FindBy(xpath = "//div[text()=\"Weekly\"]")
	private WebElement remindarRecursivWeeklyLabel;
	@FindBy(xpath = "//div[text()=\"Monthly\"]")
	private WebElement remindarRecursivMonthlyLabel; // @FindBy(xpath="")private WebElement ;

	@FindBy(xpath = "//div[text()=\"Time is required\"]")
	private WebElement timeIsREquriedValidation;
	@FindBy(xpath = "//div[text()=\"Reminder end date is required\"]")
	private WebElement remnderEndDateIsRequriedValidation;
	@FindBy(xpath = "//div[text()=\"Day is required\"]")
	private WebElement dayIsRequiredValidation;
	@FindBy(xpath = "//div[text()=\"Day Wise\"]")
	private WebElement dayWiserLabel;
	@FindBy(xpath = "//div[text()=\"Date Wise\"]")
	private WebElement dateWiserLabel;
	@FindBy(xpath = "//div[text()=\"Week is required\"]")
	private WebElement weekIsRequriedValidation;
	@FindBy(xpath = "//div[text()=\"Day of week is required\"]")
	private WebElement dayOfWeekIsRequriedValidation;
	@FindBy(xpath = "//div[text()=\"Date of month is required\"]")
	private WebElement dateOfMonthIsRequriedValidation;
	@FindBy(xpath = "//div[text()=\"Attributes are required\"]")
	private WebElement atrributeAreRequriedValidation;

	@FindBy(xpath = "//div[text()=\"Resources are required\"]")
	private WebElement resourceAreRequiredValidation;
	@FindBy(xpath = "//div[text()=\"Firefighters are required\"]")
	private WebElement firefighterAreRequiredValidation;
	@FindBy(xpath = "//h2[text()=\"Events\"]")
	private WebElement eventLebel;
	@FindBy(xpath = "//div[text()=\" Select Category \"]")
	private WebElement selectCategoryLebel;
	@FindBy(xpath = "//span[text()=\"Import/Export Events\"]")
	private WebElement importExportEventLebel;

	// Delete
	@FindBy(xpath = "//div[@aria-label='Previous page']")
	private WebElement backMonth;

	@FindBy(xpath = "(//span[@class=\"dx-button-text\"])[5]")
	private WebElement getMonthName;

	@FindBy(xpath = "//div[@class='title' and contains(translate(text(),'BG','bg'),'bg')]")
	private List<WebElement> getEventCount;

	@FindBy(xpath = "//div[@_ngcontent-ng-c2081891678 and @class=\"month-template\"]")
	private List<WebElement> getEventCountAll;

	@FindBy(xpath = "//div[@aria-label='Next page']")
	private WebElement nextMonth;

	@FindBy(xpath = "(//div[@class='title' and contains(translate(text(),'BG','bg'),'bg')])[1]")
	private WebElement firstEvent;

	@FindBy(xpath = "//i[contains(@class,'dx-icon-trash')]")
	private WebElement deleteEvent;

	@FindBy(xpath = "//span[text()='Yes, Delete']")
	private WebElement deleteEventYes;

	@FindBy(xpath = "//span[text()='Today']")
	private WebElement todayButton;

	@FindBy(xpath = "(//DIV[@class=\"dx-dropdowneditor-icon\"])[8]")
	private WebElement endDtae001;

	@FindBy(xpath = "(//div[@_ngcontent-ng-c2081891678 and @class=\"month-template\"])[1]")
	private WebElement firstEventInAll;

	@FindBy(xpath = "//span[text()=\"Import/Export Events\"]")
	private WebElement importExport;
	String filePAthImortUser;
	@FindBy(xpath = "//input[@aria-controls=\"dx-7677da2b-bc55-d8bd-401a-d13b5e54db53\"]")
	private WebElement selectStationForImportEvent;
	@FindBy(xpath = "//span[text()=\"Upload File\"]")
	private WebElement uploadFile;
	 @FindBy(xpath="//span[text()=\"Import\"]")private WebElement importEvent;
	 @FindBy(xpath="(//span[@class=\"text-success\"])[1]")private WebElement isValid;
	 @FindBy(xpath="(//span[@class=\"text-success\"])[2]")private WebElement errorMessage;
	 @FindBy(xpath="//span[text()=\"Continue Import\"]")private WebElement continueImport;
	@FindBy(xpath="//span[text()=\"Close\"]")private WebElement close;
	// @FindBy(xpath="")private WebElement ;
	// @FindBy(xpath="")private WebElement ;
	// @FindBy(xpath="")private WebElement ;
	// @FindBy(xpath="")private WebElement ;
	// @FindBy(xpath="")private WebElement ;
	// @FindBy(xpath="")private WebElement ;
	// @FindBy(xpath="")private WebElement ;
	// @FindBy(xpath="")private WebElement ;
	// @FindBy(xpath="")private WebElement ;
	// @FindBy(xpath="") private WebElement ;
	// @FindBy(xpath="") private WebElement ;
	// @FindBy(xpath="") private WebElement ;

	public K_calendar(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void importEventWith1minReminder(WebDriver driver, String importEventFile, String gTodaysDate,
			String gtimeHHMMSS, String germanyTimeAfter5MinHH, String germanyTimeAfter5MinMM, String st01R1,
			String st01N) throws Throwable {
		
		filePAthImortUser = importEventFile;
		
		FileInputStream in = new FileInputStream(filePAthImortUser);
		XSSFWorkbook wb = new XSSFWorkbook(in);
		XSSFSheet sheet = wb.getSheetAt(0);
		Actions act = new Actions(driver);

		String eventTitle = "BG_ImportEvent" + gTodaysDate + "_" + gtimeHHMMSS;
		String eventDiscriptions = "Checking import event via excel file_" + gTodaysDate + "_" + gtimeHHMMSS;

		String[] cities = { "Mumbai", "Delhi", "Pune", "Nagpur", "Hyderabad" };

		String eventCity = cities[new java.util.Random().nextInt(cities.length)];

		String eventStartTime = germanyTimeAfter5MinHH + ":" + germanyTimeAfter5MinMM;

		String eventStartDate = gTodaysDate;
		
	

		sheet.getRow(1).createCell(1).setCellValue(eventTitle);
		sheet.getRow(1).createCell(2).setCellValue(eventDiscriptions);
		sheet.getRow(1).createCell(3).setCellValue(eventCity);
		sheet.getRow(1).createCell(4).setCellValue(eventStartTime);
		sheet.getRow(1).createCell(5).setCellValue(eventStartDate);
		sheet.getRow(1).createCell(7).setCellValue(eventStartDate);
		sheet.getRow(1).createCell(8).setCellValue("0");// reminderDays
		sheet.getRow(1).createCell(9).setCellValue("0");// reminderHrs
		sheet.getRow(1).createCell(10).setCellValue("1");// ReminderMin
		sheet.getRow(1).createCell(11).setCellValue(st01R1);// ReminderMin
		
		
		
		
		
		in.close();
		

		// Write all values at once
		FileOutputStream out = new FileOutputStream(filePAthImortUser);
		wb.write(out);
		out.close();
		wb.close();
		
	

//		System.out.println("Event Title        : " + eventTitle);
//		System.out.println("Event Description  : " + eventDiscriptions);
//		System.out.println("Event City         : " + eventCity);
//		System.out.println("Event Start Time   : " + eventStartTime);
//		System.out.println("Event Start Date   : " + eventStartDate);
//		System.out.println("Event End Date     : " + eventStartDate);
//		System.out.println("Reminder Days      : 0");
//		System.out.println("Reminder Hours     : 0");
//		System.out.println("Reminder Minutes   : 1");
//		System.out.println("Station            : " + st01R1);

		importExport.click();
		Thread.sleep(2000);

//		act.sendKeys(Keys.TAB).perform();
//		Thread.sleep(2000);

//		act.moveToElement(selectStationForImportEvent).click().build().perform();
//		Thread.sleep(2000);

		act.sendKeys(Keys.TAB,Keys.TAB,Keys.TAB).build().perform();
		Thread.sleep(2000);
		
		act.sendKeys(st01N).perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);
		uploadFile.click();

		Thread.sleep(2000);
		
		
		
		StringSelection ss = new StringSelection(importEventFile);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);

		Robot rc = new Robot();
		Thread.sleep(2000);
		rc.keyPress(KeyEvent.VK_CONTROL);
		rc.keyPress(KeyEvent.VK_V);
		Thread.sleep(2000);
		rc.keyRelease(KeyEvent.VK_CONTROL);
		rc.keyRelease(KeyEvent.VK_V);
		Thread.sleep(2000);
		rc.keyPress(KeyEvent.VK_ENTER);
		rc.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		
		
		importEvent.click();
		Thread.sleep(2000);
		String actualValidText= "Yes";
		String actualErrorMessage ="Ok";
		
		String isValidTex= isValid.getText();
		String errorMessages= errorMessage.getText();
		Thread.sleep(2000);
		
		Assert.assertTrue(actualValidText.contains(isValidTex), RED + "valid message not proper.");
		Assert.assertTrue(actualErrorMessage.contains(errorMessages), RED + "error message not proper.");
		
		
		continueImport.click();
		Thread.sleep(2000);
		String importedMessage = " Imported successfully ";
		
		errorMessages= errorMessage.getText();
		
		Assert.assertTrue(importedMessage.contains(errorMessages), RED + "error message not proper.");
		
		close.click();
		Thread.sleep(2000);
		
		System.out.println(GREEN+"Event impored successfully.");
		

	}

	public void TCCalenderEventValidationChecking(WebDriver driver, String st01N, String st02N, String gTodaysDate,
			String gtimeHHMMSS) throws Throwable {
		Actions act = new Actions(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;

		if (importExportEventLebel.isDisplayed() && selectCategoryLebel.isDisplayed() && eventLebel.isDisplayed()) {
			System.out.println(GREEN + "TC_InfoEvent_001 — Verify Navigation to Calendeer Event Page.");
		}

		if (createNewButton.isDisplayed()) {
			System.out.println(GREEN + "TC_CalEvent_002 — Verify Create Button Visibility");
		}

		createNewButton.click();
		Thread.sleep(1000);

		if (createNewEventTitle.isDisplayed()) {
			System.out.println(GREEN + "TC_CalEvent_003 — Verify Create new event page Visibility");
		}

		saveButton.click();
		Thread.sleep(1000);

		if (fireStationIsRequriedValidation.isDisplayed() && titleIsRequriedValidation.isDisplayed()
				&& categoryIsRequriedValidation.isDisplayed()) {
			System.out.println(GREEN + "TC_CalEvent_002 — Verify Required Validation for Station, Title, Category");
		}

		js.executeScript("arguments[0].scrollIntoView(true);", sendPushToggle);
		Thread.sleep(1000);
		act.sendKeys(Keys.PAGE_DOWN).perform();

		if (startDateIsRequriedValidation.isDisplayed() && endDateIsRequriedValidation.isDisplayed()
				&& userTypeIsRequriedValidation.isDisplayed()) {
			System.out.println(GREEN + "TC_CalEvent_004 — Verify Required Validation for Dates and User Type");
		}

		js.executeScript("arguments[0].scrollIntoView(true);", createNewEventTitle);
		Thread.sleep(1000);
		stationWarning.click();

		Thread.sleep(1000);
		act.sendKeys(st01N).perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(1000);
		act.sendKeys(st02N).perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER, Keys.TAB).perform();
		Thread.sleep(1000);

		String title = "BG-Calendar event by Stations " + gTodaysDate + "_" + gtimeHHMMSS;
		act.sendKeys(title).perform();
		Thread.sleep(1000);
		act.sendKeys(Keys.TAB, Keys.UP).perform();
		Thread.sleep(1000);

		for (int i = 0; i <= 18; i++) {
			act.sendKeys(Keys.TAB).build().perform();
		}
		Thread.sleep(1000);

		act.sendKeys("Calendar event by Stations " + gTodaysDate + "_" + gtimeHHMMSS).perform();
		Thread.sleep(1000);

		act.sendKeys(Keys.PAGE_DOWN).perform();
		Thread.sleep(1000);

		eventLocation.click();
		act.sendKeys("KP ground Nagpur").perform();
		Thread.sleep(1000);

		if (startDateAndTimeLabel.isDisplayed() && endDateAndTimeLabel.isDisplayed()) {
			System.out.println(GREEN + "TC_CalEvent_005 — Verify Date-Time Labels When All Day is OFF");
		}

		act.sendKeys(Keys.TAB, Keys.SPACE).perform();
		Thread.sleep(1000);

		if (endDateLabel.isDisplayed() && startDateLabel.isDisplayed()) {
			System.out.println(GREEN + "TC_CalEvent_006 — Verify Date Labels When All Day is ON");
		}

		startDate.click();
		Thread.sleep(1000);
		today1.click();
		Thread.sleep(500);
		act.sendKeys(Keys.RIGHT, Keys.ENTER).perform();
		Thread.sleep(1000);

		endDate.click();
		Thread.sleep(500);
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(1000);

		act.sendKeys(Keys.TAB, Keys.SPACE).perform();
		Thread.sleep(500);

		if (selectRemindarLabel.isDisplayed()) {
			System.out.println(GREEN + "TC_CalEvent_007 — Verify Reminder Type Options Display");
		}

		js.executeScript("arguments[0].scrollIntoView(true);", sendPushToggle);
		Thread.sleep(1000);
		act.sendKeys(Keys.PAGE_DOWN).perform();
		saveButton.click();
		Thread.sleep(1000);

		if (remindarTypeIsRequriedValidation.isDisplayed()) {
			System.out.println(GREEN + "TC_CalEvent_008 — Verify Reminder Type Required Validation");
		}

		setRemindarLabel.click();
		Thread.sleep(500);
		setRemindarLabel.click();
		Thread.sleep(500);
		act.sendKeys(Keys.TAB, Keys.DOWN).perform();
		Thread.sleep(500);

		js.executeScript("arguments[0].scrollIntoView(true);", sendPushToggle);
		Thread.sleep(1000);
		act.sendKeys(Keys.PAGE_DOWN).perform();
		saveButton.click();
		Thread.sleep(1000);

		if (remindarSelectDayValidation.isDisplayed() && remindarSelectHrsValidation.isDisplayed()
				&& remindarSelectMinValidation.isDisplayed()) {
			System.out.println(GREEN + "TC_CalEvent_009 — Verify Reminder Day/Hour/Minute Validation");
		}

		setRemindarLabel.click();
		Thread.sleep(500);
		setRemindarLabel.click();
		Thread.sleep(500);
		act.sendKeys(Keys.TAB, Keys.DOWN).perform();
		Thread.sleep(500);

		js.executeScript("arguments[0].scrollIntoView(true);", sendPushToggle);
		Thread.sleep(1000);
		act.sendKeys(Keys.PAGE_DOWN).perform();
		saveButton.click();
		Thread.sleep(1000);

		if (remindarRecursivDailyLabel.isDisplayed() && remindarRecursivWeeklyLabel.isDisplayed()
				&& remindarRecursivMonthlyLabel.isDisplayed()) {
			System.out.println(GREEN + "TC_CalEvent_010— Verify Reminder Recurrence Options Display");
		}

		remindarRecursivDailyLabel.click();
		Thread.sleep(1000);

		js.executeScript("arguments[0].scrollIntoView(true);", sendPushToggle);
		Thread.sleep(1000);
		act.sendKeys(Keys.PAGE_DOWN).perform();
		saveButton.click();
		Thread.sleep(1000);

		if (timeIsREquriedValidation.isDisplayed() && remnderEndDateIsRequriedValidation.isDisplayed()) {
			System.out.println(GREEN + "TC_CalEvent_011 — Verify Daily Reminder Required Fields Validation");
		}

		remindarRecursivWeeklyLabel.click();
		Thread.sleep(1000);

		js.executeScript("arguments[0].scrollIntoView(true);", sendPushToggle);
		Thread.sleep(1000);
		act.sendKeys(Keys.PAGE_DOWN).perform();
		saveButton.click();
		Thread.sleep(1000);

		if (timeIsREquriedValidation.isDisplayed() && dayIsRequiredValidation.isDisplayed()
				&& remnderEndDateIsRequriedValidation.isDisplayed()) {
			System.out.println(GREEN + "TC_CalEvent_012 — Verify Weekly Reminder Required Fields Validation");
		}

		remindarRecursivMonthlyLabel.click();
		Thread.sleep(1000);

		js.executeScript("arguments[0].scrollIntoView(true);", sendPushToggle);
		Thread.sleep(1000);
		act.sendKeys(Keys.PAGE_DOWN).perform();
		saveButton.click();
		Thread.sleep(1000);

		if (dayWiserLabel.isDisplayed() && dateWiserLabel.isDisplayed()) {
			System.out.println(GREEN + "TC_CalEvent_013 — Verify Monthly Reminder Mode Options Display");
		}

		dayWiserLabel.click();
		Thread.sleep(1000);

		js.executeScript("arguments[0].scrollIntoView(true);", sendPushToggle);
		Thread.sleep(1000);
		act.sendKeys(Keys.PAGE_DOWN).perform();
		saveButton.click();
		Thread.sleep(1000);

		if (weekIsRequriedValidation.isDisplayed() && dayOfWeekIsRequriedValidation.isDisplayed()
				&& timeIsREquriedValidation.isDisplayed()) {
			System.out.println(GREEN + "TC_CalEvent_014 — Verify Monthly Day-wise Validation");
		}

		dateWiserLabel.click();
		Thread.sleep(1000);

		js.executeScript("arguments[0].scrollIntoView(true);", sendPushToggle);
		Thread.sleep(1000);
		act.sendKeys(Keys.PAGE_DOWN).perform();
		saveButton.click();
		Thread.sleep(1000);

		if (dateOfMonthIsRequriedValidation.isDisplayed() && timeIsREquriedValidation.isDisplayed()
				&& remnderEndDateIsRequriedValidation.isDisplayed()) {
			System.out.println(GREEN + "TC_CalEvent_015 — Verify Monthly Date-wise Validation");
		}

		setRemindarLabel.click();
		Thread.sleep(500);
		userTypeAttribute.click();
		Thread.sleep(1000);

		js.executeScript("arguments[0].scrollIntoView(true);", sendPushToggle);
		Thread.sleep(1000);
		act.sendKeys(Keys.PAGE_DOWN).perform();
		saveButton.click();
		Thread.sleep(1000);

		if (atrributeAreRequriedValidation.isDisplayed()) {
			System.out.println(GREEN + "TC_CalEvent_016 — Verify Attribute Required Validation");
		}

		userTypeResource.click();
		Thread.sleep(1000);

		js.executeScript("arguments[0].scrollIntoView(true);", sendPushToggle);
		Thread.sleep(1000);
		act.sendKeys(Keys.PAGE_DOWN).perform();
		saveButton.click();
		Thread.sleep(1000);

		if (resourceAreRequiredValidation.isDisplayed()) {
			System.out.println(GREEN + "TC_CalEvent_017 — Verify Resource Required Validation");
		}

		userTypeFireFighters.click();
		Thread.sleep(1000);

		js.executeScript("arguments[0].scrollIntoView(true);", sendPushToggle);
		Thread.sleep(1000);
		act.sendKeys(Keys.PAGE_DOWN).perform();
		saveButton.click();
		Thread.sleep(1000);

		if (firefighterAreRequiredValidation.isDisplayed()) {
			System.out.println(GREEN + "TC_CalEvent_018 — Verify Firefighter Required Validation");
		}

		userTypeStations.click();
		Thread.sleep(1000);

		saveButton.click();
		Thread.sleep(1000);

	}

	public void smokeForCalendar() {
		if (createNewButton.isDisplayed()) {
			System.out.println(GREEN + "Create New button for calendar is visible");
		} else {
			Assert.fail(RED + "Create New button is NOT displayed");
		}

	}

	public void smokeForEventCategory() {
		manageEventCategory.click();

		if (createNew1.isDisplayed()) {
			System.out.println(GREEN + "Create New button for event category is visible");
		} else {
			Assert.fail(RED + "Create New button is NOT displayed");
		}

	}

	public void createEventCategory(WebDriver driver, String gTodaysDate, String gtimeHHMMSS) throws Throwable {
		Actions act = new Actions(driver);
		manageEventCategory.click();
		Thread.sleep(2000);
		createNew1.click();
		Thread.sleep(1000);

		String title = "BG_EventCatogery_" + gTodaysDate + "_" + gtimeHHMMSS;
		String title1 = title + " GLOBAL ";
		act.sendKeys(title).perform();
		Thread.sleep(1000);
		act.sendKeys(Keys.TAB, Keys.DOWN, Keys.DOWN, Keys.DOWN, Keys.TAB, Keys.TAB, Keys.ENTER).perform();
		Thread.sleep(4000);

		String expectedTitle = firstItemTitle.getText();
//		System.out.println(expectedTitle);
//		System.out.println(title1);

		Assert.assertTrue(title1.contains(expectedTitle), RED + "Alarm not added.");

		System.out.println(GREEN + title1);

	}

	public void deleteEventCatogery(WebDriver driver, String SearWordForDelete) throws Throwable {
		Actions act = new Actions(driver);
		manageEventCategory.click();
		Thread.sleep(2000);
		refreshFilter.click();
		Thread.sleep(2000);
		searchField1.click();
		Thread.sleep(500);
		act.sendKeys(SearWordForDelete).perform();
		Thread.sleep(2000);
		itemsPerPage100.click();
		Thread.sleep(5000);

		int totalInfoEvents = 0;

		for (int batch = 1; batch <= 15; batch++) {
			int count = availableBGInfoEvent.size();

			if (count == 0) {
				break;
			}

			else

				System.out.println("The iteration-" + batch + " still ongoing, please wait.");
			actionButton.click();
			Thread.sleep(3000);
			deleteButton.click();
			Thread.sleep(2000);
			yesDelete.click();
			Thread.sleep(4000);

			totalInfoEvents++;
		}

		System.out.println("The iteration has been completed.");
		System.out.println(GREEN + "Total >>>>>" + totalInfoEvents + "<<<<< event category deleted successfully.");

		refreshFilter.click();
		Thread.sleep(2000);

	}

	public void createCalendarEventByStationsMS(WebDriver driver, String st01N, String st02N, String gTodaysDate,
			String gtimeHHMMSS) throws Throwable {
		Actions act = new Actions(driver);
		createNewButton.click();
		Thread.sleep(1000);
		act.sendKeys(Keys.TAB, Keys.TAB).perform();
		Thread.sleep(1000);
		act.sendKeys(st01N).perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(1000);
		act.sendKeys(st02N).perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER, Keys.TAB).perform();
		Thread.sleep(1000);

		String title = "BG-Calendar event by Stations " + gTodaysDate + "_" + gtimeHHMMSS;
		act.sendKeys(title).perform();
		Thread.sleep(1000);
		act.sendKeys(Keys.TAB, Keys.UP).perform();
		Thread.sleep(1000);

		for (int i = 0; i <= 18; i++) {
			act.sendKeys(Keys.TAB).build().perform();
		}
		Thread.sleep(1000);

		act.sendKeys("Calendar event by Stations " + gTodaysDate + "_" + gtimeHHMMSS).perform();
		Thread.sleep(1000);

		act.sendKeys(Keys.PAGE_DOWN).perform();
		Thread.sleep(1000);

		eventLocation.click();
		act.sendKeys("KP ground Nagpur").perform();
		;
		Thread.sleep(1000);

		act.sendKeys(Keys.TAB, Keys.SPACE).perform();
		Thread.sleep(1000);

		startDate.click();
		Thread.sleep(1000);
		today1.click();

		Thread.sleep(1000);
		act.sendKeys(Keys.RIGHT).perform();
		Thread.sleep(500);

		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(1000);

//		act.moveToElement(endDate).click().perform();
		endDtae001.click();
		Thread.sleep(1000);

		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(1000);

		act.sendKeys(Keys.TAB, Keys.SPACE).perform();
		Thread.sleep(1000);
		act.sendKeys(Keys.TAB, Keys.DOWN).perform();
		Thread.sleep(1000);
		act.sendKeys(Keys.TAB, Keys.TAB, Keys.TAB, Keys.DOWN).perform();

//		act.sendKeys(Keys.TAB).perform();
//		Thread.sleep(500);
//		act.sendKeys(Keys.TAB, Keys.DOWN).perform();
//		Thread.sleep(500);
//		act.sendKeys(Keys.TAB, Keys.DOWN).perform();
//		Thread.sleep(1000);

//		suserTypeAttribute.click();
//		userTypeResource.click();
//		userTypeFireFighters.click();
		userTypeStations.click();

//		Thread.sleep(4000);
//		act.sendKeys(Keys.TAB,st01FF1).perform();
//		Thread.sleep(1000);
//		act.sendKeys(Keys.ENTER).perform();
//		Thread.sleep(500);
//		act.sendKeys(Keys.TAB,st02FF1).perform();
//		Thread.sleep(1000);
//		act.sendKeys(Keys.ENTER).perform();
//		Thread.sleep(500);

		act.sendKeys(Keys.TAB).perform();
		Thread.sleep(1000);
		act.sendKeys(Keys.TAB, Keys.TAB, Keys.ENTER).perform();
		Thread.sleep(5000);
		System.out.println(GREEN + title + " added successfuly.");

//	

	}

	public void createCalendarEventByFireFughterMS(WebDriver driver, String st01N, String st02N, String gTodaysDate,
			String gtimeHHMMSS, String germanyTimeAfter5MinHH, String germanyTimeAfter5MinMM,
			String germanyTimeAfter20MinHH, String germanyTimeAfter20MinMM, String st01FF1, String st02FF1)
			throws Throwable {
		Actions act = new Actions(driver);
		createNewButton.click();
		Thread.sleep(1000);
		act.sendKeys(Keys.TAB, Keys.TAB).perform();
		Thread.sleep(1000);
		act.sendKeys(st01N).perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(1000);
		act.sendKeys(st02N).perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER, Keys.TAB).perform();
		Thread.sleep(1000);

		String title = "BG-Calendar event by firefighter " + gTodaysDate + "_" + gtimeHHMMSS;
		act.sendKeys(title).perform();
		Thread.sleep(1000);
		act.sendKeys(Keys.TAB, Keys.UP).perform();
		Thread.sleep(1000);

		for (int i = 0; i <= 18; i++) {
			act.sendKeys(Keys.TAB).build().perform();
		}
		Thread.sleep(1000);

		act.sendKeys("Calendar event by firefighter " + gTodaysDate + "_" + gtimeHHMMSS).perform();
		Thread.sleep(1000);

		act.sendKeys(Keys.PAGE_DOWN).perform();
		Thread.sleep(1000);

		eventLocation.click();
		act.sendKeys("KP ground Nagpur").perform();
		;
		Thread.sleep(1000);

		startDate.click();
		Thread.sleep(1000);
		today1.click();
		Thread.sleep(500);
		act.sendKeys(Keys.RIGHT).perform();
		Thread.sleep(500);
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(500);
		startDateHours.click();
		Thread.sleep(500);
		act.sendKeys(Keys.HOME).perform();

		for (int d = 0; d <= 30; d++) {
			act.sendKeys(Keys.DELETE).perform();

		}
		

		Thread.sleep(500);
		act.sendKeys(germanyTimeAfter5MinHH).perform();
		Thread.sleep(1000);
		act.keyDown(Keys.TAB).perform();
		Thread.sleep(500);
		act.sendKeys(germanyTimeAfter5MinMM).perform();
		Thread.sleep(1000);
		startTimeOk.click();
		Thread.sleep(1000);

		endDate.click();
		Thread.sleep(1000);
		today2.click();
		Thread.sleep(500);
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(500);
		endDateHours.click();
		Thread.sleep(500);
		act.sendKeys(Keys.HOME).perform();

		for (int d = 0; d <= 30; d++) {
			act.sendKeys(Keys.DELETE).perform();

		}
		Thread.sleep(500);
		act.sendKeys(germanyTimeAfter20MinHH).perform();
		Thread.sleep(500);
		act.keyDown(Keys.TAB).perform();
		Thread.sleep(500);
		act.sendKeys(germanyTimeAfter20MinMM).perform();
		Thread.sleep(500);
		endDateTimeOk.click();
		Thread.sleep(1000);

		act.sendKeys(Keys.TAB, Keys.SPACE).perform();
		Thread.sleep(500);
		act.sendKeys(Keys.TAB, Keys.DOWN).perform();
		Thread.sleep(500);
		act.sendKeys(Keys.TAB, Keys.DOWN).perform();
		Thread.sleep(1000);

//		suserTypeAttribute.click();
//		userTypeResource.click();
		userTypeFireFighters.click();

		Thread.sleep(4000);
		act.sendKeys(Keys.TAB, st01FF1).perform();
		Thread.sleep(1000);
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(500);
		act.sendKeys(Keys.TAB, st02FF1).perform();
		Thread.sleep(1000);
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(500);

		act.sendKeys(Keys.TAB, Keys.SPACE).perform();
		Thread.sleep(1000);
		act.sendKeys(Keys.TAB, Keys.TAB, Keys.ENTER).perform();
		Thread.sleep(5000);
		System.out.println(GREEN + title + " added successfuly.");

//	

	}

	public void createCalendarEventByResource(WebDriver driver, String st01N, String gTodaysDate, String gtimeHHMMSS,
			String germanyTimeAfter1Hrs5MinHH, String germanyTimeAfter1Hrs5MinMM, String germanyTimeAfter1Hrs20MinHH,
			String germanyTimeAfter1Hrs20MinMM, String st01R1) throws Throwable {
		Actions act = new Actions(driver);
		createNewButton.click();
		Thread.sleep(1000);
		act.sendKeys(Keys.TAB, Keys.TAB).perform();
		Thread.sleep(1000);
		act.sendKeys(st01N).perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER, Keys.TAB).perform();
		Thread.sleep(1000);
		String title = "BG-Calendar event by resource__" + gTodaysDate + "_" + gtimeHHMMSS;
		act.sendKeys(title).perform();
		Thread.sleep(1000);
		act.sendKeys(Keys.TAB, Keys.UP).perform();
		Thread.sleep(1000);

		for (int i = 0; i <= 18; i++) {
			act.sendKeys(Keys.TAB).build().perform();
		}
		Thread.sleep(1000);

		act.sendKeys("Calendar event by resource " + gTodaysDate + "_" + gtimeHHMMSS).perform();
		Thread.sleep(1000);

		act.sendKeys(Keys.PAGE_DOWN).perform();
		Thread.sleep(1000);

		eventLocation.click();
		act.sendKeys("KP ground Nagpur").perform();
		;
		Thread.sleep(1000);

		startDate.click();
		Thread.sleep(1000);
		today1.click();
		Thread.sleep(500);
		startDateHours.click();
		Thread.sleep(500);
		act.sendKeys(Keys.HOME).perform();

		for (int d = 0; d <= 30; d++) {
			act.sendKeys(Keys.DELETE).perform();

		}
		Thread.sleep(1000);
		act.sendKeys(germanyTimeAfter1Hrs5MinHH).perform();
		Thread.sleep(200);
		act.keyDown(Keys.TAB).perform();
		Thread.sleep(200);
		act.sendKeys(germanyTimeAfter1Hrs5MinMM).perform();
		Thread.sleep(200);
		startTimeOk.click();
		Thread.sleep(1000);

		endDate.click();
		Thread.sleep(500);
		today2.click();
		Thread.sleep(500);
		endDateHours.click();
		Thread.sleep(500);
		act.sendKeys(Keys.HOME).perform();

		for (int d = 0; d <= 30; d++) {
			act.sendKeys(Keys.DELETE).perform();

		}
		Thread.sleep(500);
		act.sendKeys(germanyTimeAfter1Hrs20MinHH).perform();
		Thread.sleep(500);
		act.keyDown(Keys.TAB).perform();
		Thread.sleep(500);
		act.sendKeys(germanyTimeAfter1Hrs20MinMM).perform();
		Thread.sleep(500);
		endDateTimeOk.click();
		Thread.sleep(1000);

		act.sendKeys(Keys.TAB, Keys.SPACE).perform();
		Thread.sleep(500);
		act.sendKeys(Keys.TAB, Keys.DOWN).perform();
		Thread.sleep(500);
		act.sendKeys(Keys.TAB, Keys.TAB, Keys.DOWN).perform();
		Thread.sleep(1000);

//		suserTypeAttribute.click();
		userTypeResource.click();
		Thread.sleep(2000);
		act.sendKeys(Keys.TAB, st01R1).perform();
		Thread.sleep(1000);
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(500);
		act.sendKeys(Keys.TAB, Keys.SPACE).perform();
		Thread.sleep(1000);
		act.sendKeys(Keys.TAB, Keys.TAB, Keys.ENTER).perform();
		Thread.sleep(5000);
		System.out.println(GREEN + title + " added successfuly.");

//	

	}

	public void createCalendarEventByAttribute(WebDriver driver, String st01N, String gTodaysDate, String gtimeHHMMSS,
			String germanyTimeAfter5MinHH, String germanyTimeAfter5MinMM, String germanyTimeAfter20MinHH,
			String germanyTimeAfter20MinMM, String st01A1) throws Throwable {
		Actions act = new Actions(driver);
		createNewButton.click();
		Thread.sleep(1000);
		act.sendKeys(Keys.TAB, Keys.TAB).perform();
		Thread.sleep(1000);
		act.sendKeys(st01N).perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER, Keys.TAB).perform();
		Thread.sleep(1000);
		String title = "BG-Calendar event by attribute_" + gTodaysDate + "_" + gtimeHHMMSS;
		act.sendKeys(title).perform();
		Thread.sleep(1000);
		act.sendKeys(Keys.TAB, Keys.UP).perform();
		Thread.sleep(1000);

		for (int i = 0; i <= 18; i++) {
			act.sendKeys(Keys.TAB).build().perform();
		}
		Thread.sleep(1000);

		act.sendKeys("Calendar event by attribute_" + gTodaysDate + "_" + gtimeHHMMSS).perform();
		Thread.sleep(1000);

		act.sendKeys(Keys.PAGE_DOWN).perform();
		Thread.sleep(1000);

		eventLocation.click();
		act.sendKeys("KP ground Nagpur").perform();
		;
		Thread.sleep(1000);

		startDate.click();
		Thread.sleep(1000);
		today1.click();
		Thread.sleep(500);
		startDateHours.click();
		Thread.sleep(500);
		act.sendKeys(Keys.HOME).perform();

		for (int d = 0; d <= 30; d++) {
			act.sendKeys(Keys.DELETE).perform();

		}
		

		Thread.sleep(1000);
		act.sendKeys(germanyTimeAfter5MinHH).perform();
		Thread.sleep(200);
		act.keyDown(Keys.TAB).perform();
		Thread.sleep(200);
		act.sendKeys(germanyTimeAfter5MinMM).perform();
		Thread.sleep(200);
		startTimeOk.click();
		Thread.sleep(1000);

		endDate.click();
		Thread.sleep(500);
		today2.click();
		Thread.sleep(500);
		endDateHours.click();
		Thread.sleep(500);
		act.sendKeys(Keys.HOME).perform();

		for (int d = 0; d <= 30; d++) {
			act.sendKeys(Keys.DELETE).perform();

		}
		Thread.sleep(500);

		act.sendKeys(germanyTimeAfter20MinHH).perform();
		Thread.sleep(500);
		act.keyDown(Keys.TAB).perform();
		Thread.sleep(500);
		act.sendKeys(germanyTimeAfter20MinMM).perform();
		Thread.sleep(500);
		endDateTimeOk.click();
		Thread.sleep(1000);

		act.sendKeys(Keys.TAB, Keys.SPACE).perform();
		Thread.sleep(500);
		act.sendKeys(Keys.TAB, Keys.DOWN).perform();
		Thread.sleep(500);
		act.sendKeys(Keys.TAB, Keys.TAB, Keys.TAB, Keys.DOWN).perform();
		Thread.sleep(1000);

		userTypeAttribute.click();
		Thread.sleep(2000);
		act.sendKeys(Keys.TAB, st01A1).perform();
		Thread.sleep(1000);
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(500);
		act.sendKeys(Keys.TAB, Keys.SPACE).perform();
		Thread.sleep(1000);
		act.sendKeys(Keys.TAB, Keys.TAB, Keys.ENTER).perform();
		Thread.sleep(5000);
		System.out.println(GREEN + title + " added successfuly.");

//	

	}

	public void common_calendar(WebDriver driver, String branchName) throws Throwable {

		switch (branchName) {

		case "1":
		 	driver.navigate().to("https://admin.retteralarm.de/admin/event/calendar");

			break;
		case "1.1":
		 	driver.navigate().to("https://admin.retteralarm.de/admin/event/calendar");

			break;

		case "2":

			driver.navigate().to("https://admin.testing.retteralarm.de/admin/event/calendar");
			break;

		case "3":
			driver.navigate().to("https://admin.development.retteralarm.de/admin/event/calendar");

			break;

		default:
			System.out.println("Invalid branch name: " + branchName);
			break;

		}
		Thread.sleep(5000);
	}

	public void deleteCalendarEvent(WebDriver driver) throws Throwable {
		Actions act = new Actions(driver);
		int totalCount = 0;

		todayButton.click();
		Thread.sleep(3000);

		// Go back 2 months
		for (int i = 0; i < 2; i++) {
			backMonth.click();
			Thread.sleep(1500);
		}

		// Loop for 3 months
		for (int m = 1; m <= 4; m++) {

			String monthName = getMonthName.getText();
			Thread.sleep(1000);

			int monthCount = 0;
			System.out.println(monthName);
			// Delete all events in current month
			while (getEventCount.size() > 0) {

				act.moveToElement(firstEvent).click().build().perform();
				Thread.sleep(1000);

				deleteEvent.click();
				Thread.sleep(1000);

				deleteEventYes.click();
				Thread.sleep(4000);

				monthCount++;
				System.out.println("Event no-" + monthCount + " Deleted successfully.");
				totalCount++;

			}

			if (monthCount == 0) {
				System.out.println("**No events available in " + monthName + "**");

			} else {
				System.out.println(monthCount + " events deleted from " + monthName);

			}

			// Move to next month
			Thread.sleep(1000);
			nextMonth.click();
			Thread.sleep(2000);
		}

		System.out.println(GREEN + ">>>>TOTAL EVENTS DELETED: " + totalCount + " <<<<<");

	}

	public void deleteCalendarEventAll(WebDriver driver) throws Throwable {
		Actions act = new Actions(driver);

		int totalCount = 0;

		todayButton.click();
		Thread.sleep(3000);

		// Go back 2 months
		for (int i = 0; i < 2; i++) {
			backMonth.click();
			Thread.sleep(1500);
		}

		// Loop for 3 months
		for (int m = 1; m <= 4; m++) {

			String monthName = getMonthName.getText();
			Thread.sleep(1000);

			int monthCount = 0;
			System.out.println(monthName);
			// Delete all events in current month
			while (getEventCountAll.size() > 0) {
//				System.out.println("Available event for delete "+getEventCountAll.size());

				act.moveToElement(firstEventInAll).click().build().perform();
				Thread.sleep(1000);

				deleteEvent.click();
				Thread.sleep(1000);

				deleteEventYes.click();
				Thread.sleep(4000);

				monthCount++;
				System.out.println("Event no-" + monthCount + " Deleted successfully.");
				totalCount++;

			}

			if (monthCount == 0) {
				System.out.println("**No events available in " + monthName + "**");

			} else {
				System.out.println(monthCount + " events deleted from " + monthName);

			}

			// Move to next month
			Thread.sleep(1000);
			nextMonth.click();
			Thread.sleep(2000);
		}

		System.out.println(GREEN + ">>>>TOTAL EVENTS DELETED: " + totalCount + " <<<<<");

	}

}
