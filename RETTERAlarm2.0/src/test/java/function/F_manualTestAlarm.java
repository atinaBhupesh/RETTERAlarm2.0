package function;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.time.Duration;
import java.util.List;

import org.apache.poi.ss.usermodel.Row;
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
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public class F_manualTestAlarm extends b_baseClass {

	@FindBy(xpath = "//span[text()=\"Alarm\"]")
	private WebElement manualAlarmModule;

	@FindBy(xpath = "//a[@href=\"https://admin.retteralarm.de/verify-user?returnUrl=/admin/alarm/list\"]")
	private WebElement manageAlarmL;
	@FindBy(xpath = "//a[@href=\"http://admin.testing.retteralarm.de/verify-user?returnUrl=/admin/alarm/list\"]")
	private WebElement manageAlarmT;
	@FindBy(xpath = "//a[@href=\"https://admin.development.retteralarm.de/verify-user?returnUrl=/admin/alarm/list\"]")
	private WebElement manageAlarmD;

	@FindBy(xpath = "//i[@class=\"dx-icon ri ri-settings-3-line\"]")
	private WebElement setting;
	@FindBy(xpath = "//option[text()=\" andrew department \"]")
	private WebElement andrewDepartment;

	@FindBy(xpath = "//option[text()=\" D1 \"]")
	private WebElement D1;
	@FindBy(xpath = "//SELECT[@class=\"form-select ng-pristine ng-valid ng-touched\"]")
	private WebElement selectLanguage;
	@FindBy(xpath = "//i[@class=\"dx-icon dx-icon-refresh\"]")
	private WebElement refreshFilter;

	@FindBy(xpath = "//button[@class=\"btn-success btn-x30\"]")
	private WebElement createNewButton;
	@FindBy(xpath = "//div[@class=\"dx-texteditor-input-container dx-tag-container\"]")
	private WebElement fireStationField;
	@FindBy(xpath = "//input[contains(@id,\"keyword\")]")
	private WebElement alarmKeyword;
	@FindBy(xpath = "//input[@name=\"alarmImage\"]")
	private WebElement alarmImage;
	@FindBy(xpath = "//textarea[contains(@id,\"alarmDetails\")]")
	private WebElement descriptionField;
	@FindBy(xpath = "//div[text()=\"Melder\" or text()=\"Reporter\"]")
	private WebElement reporter;
	@FindBy(xpath = "//input[@name=\"reporter.name\"]")
	private WebElement reporterName;
	@FindBy(xpath = "//input[@name=\"reporter.street\"]")
	private WebElement reporterStreet;
	@FindBy(xpath = "//input[contains(@id, 'reporter.zipCode')]")
	private WebElement reporterZipCode;
	@FindBy(xpath = "//input[contains(@id, 'reporter.mobileNo')]")
	private WebElement reporterMobileNo;
	@FindBy(xpath = "//input[contains(@id,\"reporter.callback\")]")
	private WebElement reporterCallback;
	@FindBy(xpath = "//div[text()=\"Additional Fields\" or text()=\"Zusätzliche Felder\"]")
	private WebElement additionalField;
	@FindBy(xpath = "//input[@name=\"additionalFields[0]\"]")
	private WebElement additionalField1;
	@FindBy(xpath = "//i[@class=\"dx-icon dx-icon-add\"]")
	private WebElement addadditionalField;
	@FindBy(xpath = "//input[@name=\"additionalFields[1]\"]")
	private WebElement additionalField2;
	@FindBy(xpath = "//span[text()=\"Next\" or text()=\"nächste\" ]")
	private WebElement next;
	@FindBy(xpath = "//textarea[@name=\"address\"]")
	private WebElement alarmAddress;
	@FindBy(xpath = "//div[text()=\"Additional address information\" or text()=\"Zusätzliche Adressinformationen\"]")
	private WebElement additionalAddressInformation;
	@FindBy(xpath = "//input[@class='dx-texteditor-input' and @name='object']")
	private WebElement alarmObject;
	@FindBy(xpath = "//input[@name=\"floor\"]")
	private WebElement alarmFloor;
	@FindBy(xpath = "//input[@name=\"annotation\"]")
	private WebElement alarmAnnotation;
	@FindBy(xpath = "(//span[@class=\"dx-button-text\"])[2]")
	private WebElement next2;
	@FindBy(xpath = "(//div[@class=\"dx-scrollable-scrollbar dx-widget dx-scrollbar-vertical dx-scrollbar-hoverable\"])[3]")
	private WebElement scrollDown;

	@FindBy(xpath = "//div[text()=\"Attributes\" or text()=\"Qualifikationen\"]")
	private WebElement userTypeAttribute;
	@FindBy(xpath = "//input[contains(@id,'selectedVehicles')]")
	private WebElement vehicleField1;
	@FindBy(xpath = "//div[text()=\"Select All\" or text()=\"Alles auswählen\"]")
	private WebElement selectAllA;
	@FindBy(xpath = "(//span[@class=\"dx-icon dx-icon-clear\"])[3]")
	private WebElement deselectAll;
	@FindBy(xpath = "//input[contains(@id,'selectedVehicles')]")
	private WebElement deSelectVehicls;
	@FindBy(xpath = "//input[contains(@id,'selectedAttributes')]")
	private WebElement attributeField;

	@FindBy(xpath = "//div[text()=\"Resources\" or text()=\"Ressourcen\"]")
	private WebElement userTypeResource;
	@FindBy(xpath = "(//input[contains(@id,\"selectedResources\")])[1]")
	private WebElement resourceField1;
	@FindBy(xpath = "(//input[contains(@id,\"selectedResources\")])[2]")
	private WebElement resourceField2;

	@FindBy(xpath = "//span[text()=\"Save\"]")
	private WebElement saveTestAlarm;
	@FindBy(xpath = "//span[text()=\"Ja, erstellen\" or text()=\"Yes, Create\"]")
	private WebElement yesCreate;

	@FindBy(xpath = "(//div[@class=\"menubox dx-template-wrapper dx-item-content dx-treeview-item-content\"])[1]")
	private WebElement dashbordMenu2;
	@FindBy(xpath = "(//div[@class=\"menubox dx-template-wrapper dx-item-content dx-treeview-item-content\"])[2]")
	private WebElement dashboard2;

	@FindBy(xpath = "(//i[@class=\"dx-icon-filter filter-icon\"])[1]")
	private WebElement titleSearch;
	@FindBy(xpath = "//dx-text-box[@mode=\"search\"]")
	private WebElement titleSearchField;
	@FindBy(xpath = "//div[@aria-label=\"OK\"]")
	private WebElement titleSearchFieldOk;
	@FindBy(xpath = "(//span[@class=\"dx-checkbox-icon\"])[1]")
	private WebElement selectAll;
	@FindBy(xpath = "//i[@class=\"ri ri-delete-bin-6-line\"]")
	private WebElement delete;
	@FindBy(xpath = "//div[@aria-label=\"Yes, Delete\"]")
	private WebElement deleteYes;
	@FindBy(xpath = "//div[@aria-label=\"Items per page: 100\"]")
	private WebElement item100;

	@FindBy(xpath = "//div[text()=\"Users\"]")
	private WebElement userTypeFirefighter;
	@FindBy(xpath = "(//input[contains(@id,\"selectedUsers\")])[1]")
	private WebElement FirefighterField1;
	@FindBy(xpath = "(//input[contains(@id,\"selectedUsers\")])[2]")
	private WebElement FirefighterField2;

	@FindBy(xpath = "//span[text()=\"Priorität\" or text()=\"Priority\"]")
	private WebElement priority;
	@FindBy(xpath = "//td[contains(text(),\"Bg\")]")
	private WebElement BGAlams;

	@FindBy(xpath = "(//i[@class=\"dx-icon dx-icon-overflow\"])[2]")
	private WebElement action;

	@FindBy(xpath = "(//dx-button[@class=\"dx-widget dx-button dx-button-mode-text dx-button-normal more-action-button\"])[1]")
	private WebElement addExtension;
	@FindBy(xpath = "//input[@placeholder=\"Select Firestation\"]")
	private WebElement extendStationField;
	@FindBy(xpath = "//input[@id=\"inlineRadio2\"]")
	private WebElement extendUsereTypeResource;
	@FindBy(xpath = "//input[@value=\"476\"]")
	private WebElement D1ST04Esc;
	@FindBy(xpath = "//input[@id=\"information_1\"]")
	private WebElement additionalInformation1;
	@FindBy(xpath = "//button[@id=\"addSubmit\"]")
	private WebElement saveExtend;

	@FindBy(xpath = "//input[contains(@id,\"selectedTemplate\")]")
	private WebElement templateField;

	@FindBy(xpath = "(//span[@class=\"dx-tab-text-span\"])[3]")
	private WebElement user$resource;

	@FindBy(xpath = "//input[@value=\"4625\"]")
	private WebElement ADST06REsc;
	@FindBy(xpath = "//div[@aria-label=\"Next\"]")
	private WebElement next001;

	@FindBy(xpath = "//select[@class=\"form-select ng-pristine ng-valid ng-touched\"]")
	private WebElement selectDepartment;
	@FindBy(xpath = "(//dx-button[@stylingmode=\"text\"])[4]")
	private WebElement alarmChat;
	@FindBy(xpath = "//dx-button[@stylingmode=\"text\"]")
	private List<WebElement> buttonCount;
	@FindBy(xpath = "//input[@placeholder=\"Write your message...\"]")
	private WebElement writemessageField;
	@FindBy(xpath = "//button[@id=\"actionSendMessage\"]")
	private WebElement sendmessageButton;
	@FindBy(xpath = "//input[@class=\"upload\"]")
	private WebElement attachFile;

	@FindBy(xpath = "//path[@fill-rule='evenodd' and contains(@d, 'M1 8a.5.5 0 0 1')]")
	private WebElement back;

	@FindBy(xpath = "//span[contains(text(), 'Bg') or contains(text(), 'BG')]")
	private List<WebElement> BGAlarm;
	@FindBy(xpath = "//span[contains(text(), 'Bhupesh') or contains(text(), 'Bhupesh')]")
	private List<WebElement> bhupeshTestAlarm;
	@FindBy(xpath = "//dx-button[@class=\"dx-widget dx-button dx-button-mode-text dx-button-normal more-action-button delete-option\"]")
	private WebElement singleDelete;
	@FindBy(xpath = "(//div [@class=\"dx-item dx-toolbar-item dx-toolbar-button\"])[3]")
	private WebElement delateAll;
	@FindBy(xpath = "///span[text()=\"Ja, löschen\" or text()=\"Yes, Delete\"]")
	private WebElement deleteAllYes;

	@FindBy(xpath = "//div[@class=\"dx-texteditor-input-container dx-tag-container\"]")
	private WebElement extendStation;
	@FindBy(xpath = "//*[@id=\"dx_dx-82385685-de57-5d40-d943-94596672b55b_selectedResources[6a168ac95312fe3a25e4a6874100a50780715e]\"]")
	private WebElement extendResourceFiled;
	@FindBy(xpath = "//input[@name=\"additionalFields[0]\"]")
	private WebElement additionalFields;
	@FindBy(xpath = "//div[@aria-label=\"Save\"]")
	private WebElement saveExtendAlarm;
	@FindBy(xpath = "//div[@aria-label=\"Yes, Extend\"]")
	private WebElement yesExtendAlarm;
	@FindBy(xpath = "//div[@aria-label=\"Items per page: 100\"]")
	private WebElement itemPepage100;

	@FindBy(xpath = "(//li[@class='replies'])[last()]/p")
	private WebElement messageText;
	@FindBy(xpath = "(//span[@class=\"alarm-title-text\"])[1]")
	private WebElement firstItemTitle;

	@FindBy(xpath = "//h2[text()=\"Alarm List\"]")
	private WebElement alarmListTitle;
	@FindBy(xpath = "//h2[text()=\"Create Alarm\"]")
	private WebElement createAlarmTitle;
	@FindBy(xpath = "//span[text()=\"Next\"]")
	private WebElement nextButton;
	@FindBy(xpath = "//div[text()=\"Fire Station is required\"]")
	private WebElement fireStaionIsRequriedValidation;
	@FindBy(xpath = "//div[text()=\"Keyword is required\"]")
	private WebElement keywordIsRequriedValidation;
	@FindBy(xpath = "//div[text()=\"Alarm details are required\"]")
	private WebElement alarmDetailsAreRequired;
	@FindBy(xpath = "//div[text()=\"andrew station 01\"]")
	private WebElement andrewStation01Title;
	@FindBy(xpath = "//div[text()=\"andrew station 06\"]")
	private WebElement andrewStation06Title;
	@FindBy(xpath = "//div[text()=\"andrew station 07\"]")
	private WebElement andrewStation07Title;
	@FindBy(xpath = "//INPUT[@name=\"additionalFields[0]\"]")
	private WebElement addIconAdditionalInformation;
	@FindBy(xpath = "//INPUT[@name=\"additionalFields[1]\"]")
	private WebElement addIconAdditionalInformation1;
	@FindBy(xpath = "//span[text()=\"Address\"]")
	private WebElement addressTitle;
	@FindBy(xpath = "//span[text()=\"Latitude\"]")
	private WebElement latitudeTitle;
	@FindBy(xpath = "//span[text()=\"Drag marker on the map\"]")
	private WebElement dragMarkerOnTheMapTitle;
	@FindBy(xpath = "//input[@id=\"dx_dx-3d99c10e-ac65-385c-d512-2313332d2f5c_latitude\"]")
	private WebElement latitudeInputField;
	@FindBy(xpath = "//input[@id=\"dx_dx-3d99c10e-ac65-385c-d512-2313332d2f5c_longitude\"]")
	private WebElement longitudeInputField;

	@FindBy(xpath = "//span[text()=\"Longitude\"]")
	private WebElement longitudeTtile;
	@FindBy(xpath = "//div[text()=\"Please select at least one attribute.\"]")
	private WebElement pleaseSelectAtLeastOneAttributeValidation;
	@FindBy(xpath = "//div[text()=\"Please select at least one resource.\"]")
	private WebElement pleaseSelectAtLeastOneResource;
	@FindBy(xpath = "//div[text()=\"Please select at least one firefighter.\"]")
	private WebElement pleaseSelectAtLeastOneFirefighter;
	@FindBy(xpath = "//div[text()=\"ADST06V1\"]")
	private WebElement adst06v1Title;
	@FindBy(xpath = "//div[text()=\"ADST06A2\"]")
	private WebElement adst06a2Title;
	@FindBy(xpath = "//div[text()=\"ADST06R2\"]")
	private WebElement adst06r2Title;
	@FindBy(xpath = "//input[@id=\"dx_dx-cc86a369-4c64-ff4b-3ebb-4a9202321cb4_selectedUsers[786689f549defc0f094e283fcc6a8ba8f5c44494]\"]")
	private WebElement firefighterField;
	@FindBy(xpath = "//div[text()=\"Jonas2 Jonas02\"]")
	private WebElement jonas2Title;
	@FindBy(xpath = "//div[@aria-label=\"ben2 ben02\"]")
	private WebElement ben2Title;
	@FindBy(xpath = "//div[@aria-label=\"ADST07R2\"]")
	private WebElement adst07r2Title;

	@FindBy(xpath = "(//input[@role='combobox'])[3]")
	private WebElement stationNameList;
	@FindBy(xpath = "//input[@role='combobox' and @aria-haspopup='listbox']")
	private WebElement vehicleNameList;
	@FindBy(xpath = "//input[@role='combobox' and @placeholder='Select...']")
	private WebElement attributeNameList;
	@FindBy(xpath = "//div[contains(@class,'dx-tagbox-popup-wrapper')]")
	private WebElement station01ResourceNameList;
	@FindBy(xpath = "//input[@role='combobox' and @aria-haspopup='listbox']")
	private WebElement station02ResourceNameList;
	@FindBy(xpath = "//input[@role='combobox' and @aria-haspopup='listbox']")
	private WebElement station01FirefighterNameList;
	@FindBy(xpath = "//div[contains(@class,'dx-tagbox')]//input[@role='combobox']")
	private WebElement station02FirefighterNameList;

	@FindBy(xpath = "//textarea[@name=\"message\"]")
	private WebElement textarea;
	@FindBy(xpath = "//i[@class=\"dx-icon-sendfilled\"]")
	private WebElement sendButton;
	@FindBy(xpath = "(//div[text()=\"Text message sent to the new API alarm user.\"])[last()]")
	private WebElement textMessage;
	@FindBy(xpath = "(//div[text()=\"Text message sent to the manual alarm user.\"])[last()]")
	private WebElement textMessageMA;

	@FindBy(xpath = "(//span[contains(text(),\"BG\")])[1]")
	private WebElement bgAlarm;
	@FindBy(xpath = "(//span[@class=\"dx-tab-text-span\"])[2]")
	private WebElement secondStataionTab;
	@FindBy(xpath = "(//span[@class=\"dx-tab-text-span\"])[1]")
	private WebElement firstStataionTab;
	@FindBy(xpath = "//div[text()=\"Attributes\"]")
	private WebElement ffAtribute;

	// @FindBy(xpath="")private WebElement ;
	@FindBy(xpath = "//td[text()=\"Jonas2 Jonas02\"]")
	private WebElement jonas2;

	@FindBy(xpath = "//td[contains(text(),\"bhupesh\")]")
	private WebElement bhupeshTest;
	@FindBy(xpath = "//i[@class=\"dx-icon-attach\"]")
	private WebElement chatAttachment;

	// @FindBy(xpath="")private WebElement ;

	@FindBy(xpath = "(//div[@class=\"chat-image-filename\"])[last()]")
	private WebElement uploadedFile;
	@FindBy(xpath = "((//div[text()=\"Image file & text sent to the new API alarm user.\"])[last()]")
	private WebElement imageMessage;
	@FindBy(xpath = "(//div[@title=\"sample_pdf.pdf\"])[last()]")
	private WebElement uploadedPdf;
	@FindBy(xpath = "(//div[text()=\"Word file & text sent to the new API alarm user.\"])[last()]")
	private WebElement pdfMessage;

	@FindBy(xpath = "(//div[@title=\"sample_WordFile.docx\"])[last()]")
	private WebElement uploadedWordFile;
	@FindBy(xpath = "(//div[contains(text(),\"Word file & text sent to the new API alarm user.\")])[last()]")
	private WebElement wordFileMessage;
	@FindBy(xpath = "(//div[@title=\"sample_XLS.xls\"])[last()]")
	private WebElement uploadedXls;
	@FindBy(xpath = "//span[text()=\"Priority\"]")
	private WebElement setPriority;

	@FindBy(xpath = "//button[@class=\"btn-warning btn-x30 manage-test-alarm-btn\"]")
	private WebElement mangeTestAlarm;
	@FindBy(xpath = "//button[@class=\"btn-danger\"]")
	private WebElement deleteAll2;

	@FindBy(xpath = "//span[text()=\"Select schedule type\"]")
	private WebElement selectScheduleType;
	@FindBy(xpath = "//span[text()=\"Set Schedule\"]")
	private WebElement setSchedule;
	@FindBy(xpath = "//div[text()=\"One Time\"]")
	private WebElement scheduleOneTime;
	@FindBy(xpath = "(//div[@class=\"dx-dropdowneditor-icon\"])[4]")
	private WebElement dateAndTimeOnetime;
	@FindBy(xpath = "//input[@aria-label=\"hours\"]")
	private WebElement startDateHours;
	@FindBy(xpath = "//span[text()=\"OK\"]")
	private WebElement timeOk;
	@FindBy(xpath = "(//span[text()=\"Next\"])[2]")
	private WebElement testAlarmNext;
	@FindBy(xpath = "//span[text()=\"Alarmmonitor\"]")
	private WebElement Alarmmonitor;
	@FindBy(xpath = "//td[contains(text(),\"BG\") or contains(text(),\"bg\")]")
	private List<WebElement> BgTestAlarm;
	@FindBy(xpath = "//div[text()=\"Recursive\"]")
	private WebElement scheduleRecursive;
	@FindBy(xpath = "//div[text()=\"Daily\"]")
	private WebElement recursiveDaily;
	@FindBy(xpath = "(//DIV[@class=\"dx-dateview-item dx-dateview-item-selected\"])[1]")
	private WebElement currentHrs;
	@FindBy(xpath = "(//DIV[@class=\"dx-dateview-item dx-dateview-item-selected\"])[2]")
	private WebElement currentMin;

	@FindBy(xpath = "//div[text()=\"Weekly\"]")
	private WebElement recursiveWeekly;
	@FindBy(xpath = "//span[text()=\"Day\"]")
	private WebElement selectWeekDay;
	@FindBy(xpath = "(//div[@class=\"dx-dropdowneditor-icon\"])[5]")
	private WebElement timeWeekly;
	@FindBy(xpath = "//div[text()=\"Monthly\"]")
	private WebElement recursiveMonthly;
	@FindBy(xpath = "//div[text()=\"Day Wise\"]")
	private WebElement monthlyDayWise;

	@FindBy(xpath = "//span[text()=\"Week\"]")
	private WebElement weekForMonthlyDayWise;
	@FindBy(xpath = "//span[text()=\"Day of Week\"]")
	private WebElement dayOfWeek;
	@FindBy(xpath = "//span[text()=\"Time\"]")
	private WebElement timeForMonthlyDayWise;
	@FindBy(xpath = "//div[text()=\"Date Wise\"]")
	private WebElement dateForMontlyDateWise;
	@FindBy(xpath = "//span[text()=\"Date of Month\"]")
	private WebElement dateOfMonth;
	@FindBy(xpath = "//span[text()=\"Select Attributes\"]")
	private WebElement selectAttributes;
	@FindBy(xpath = "(//td[contains(text(),'BG-TA ')])[1]")
	private WebElement firtsTestAlarm;
	@FindBy(xpath = "//span[text()=\"Email\"]")
	private WebElement alertingOverEmail;
	@FindBy(xpath = "//span[text()=\"SMS\"]")
	private WebElement alertingOverSMS;
	@FindBy(xpath = "//span[text()=\"Call\"]")
	private WebElement alertingOverCall;
	@FindBy(xpath = "//i[@class=\"ri-close-circle-fill\"]")
	private WebElement crossButtonForFile;
	@FindBy(xpath = "//span[text()=\"Generate Alarm\"]")
	private WebElement generateAlarm;

	@FindBy(xpath = "//div[@_ngcontent-ng-c2814457879 and contains(text(),\"20\")]")
	private List<WebElement> getDate;
	@FindBy(xpath = "//div[@_ngcontent-ng-c2814457879 and contains(text(),\"20\")]")
	private WebElement getDate1;
	@FindBy(xpath = "(//td[contains(text(),'Bhupesh-TA')])[1]")
	private WebElement bhupeshFirstTestAlarm;

	@FindBy(xpath = "//span[text()=\"Alarm\"]")
	private WebElement alarmModule;
	@FindBy(xpath = "//a[text()=\"Manage Alarm\"]")
	private WebElement manageAlarm;
	@FindBy(xpath = "//span[@aria-label=\"Show filter options for column 'Status'\"]")
	private WebElement alarmStatus;
	@FindBy(xpath = "//div[text()=\"Active\"]")
	private WebElement alarmStatusActive;
	@FindBy(xpath = "//span[text()=\"OK\"]")
	private WebElement alarmStatusOk;
	@FindBy(xpath = "//span[text()=\"Active\"]")
	private List<WebElement> activeAlarmCount;
	@FindBy(xpath = "(//span[text()=\"Active\"])[1]")
	private WebElement firstActiveButton;
	@FindBy(xpath = "//span[text()=\"Yes, Close\"]")
	private WebElement yesClose;
	@FindBy(xpath = "//span[text()=\"Yes\"]")
	private WebElement yes;
	// @FindBy(xpath="")private WebElement ;
	// @FindBy(xpath="")private WebElement ;
	// @FindBy(xpath="")private WebElement ;
	// @FindBy(xpath="")private WebElement ;
	// @FindBy(xpath="")private WebElement ;
	// @FindBy(xpath="")private WebElement ;
	// @FindBy(xpath="")private WebElement ;

	// @FindBy(xpath="")private WebElement ;
	// @FindBy(xpath="")private WebElement ;
	// @FindBy(xpath="")private WebElement ;
	// @FindBy(xpath="")private WebElement ;
	// @FindBy(xpath="")private WebElement ;
	// @FindBy(xpath="")private WebElement ;

	public F_manualTestAlarm(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}

	public void verifyAllApiAlarmsCretaed(WebDriver driver, String gTodaysDate, String germanyTodaysDate1,
			String ApiAlarm01, String ApiAlarm02, String ApiAlarm03, String ApiAlarm04, String ApiAlarm05,
			String ApiAlarm06, String ApiAlarm07, String ApiAlarm08, String ApiAlarm09, String ApiAlarm10,
			String ApiAlarm11, String ApiAlarm12, String ApiAlarm13, String ApiAlarm14) throws Throwable {

		Actions act = new Actions(driver);

		String[] alarms = { ApiAlarm01, ApiAlarm02, ApiAlarm03, ApiAlarm04, ApiAlarm05, ApiAlarm06, ApiAlarm07,
				ApiAlarm08, ApiAlarm09, ApiAlarm10, ApiAlarm11, ApiAlarm12, ApiAlarm13, ApiAlarm14 };

		for (int a = 0; a < alarms.length; a++) {

			String title = alarms[a];

			System.out.println("Searching alarm: " + title);

			refreshFilter.click();

			titleSearch.click();
			Thread.sleep(1000);

			titleSearchField.click();
			Thread.sleep(500);

			act.sendKeys(title).perform();
//			System.out.println(title);

			Thread.sleep(2000);

			titleSearchFieldOk.click();
			Thread.sleep(2000);
			int count = getDate.size();
//	        System.out.println(count);

			Thread.sleep(2000);
//	        System.out.println(gTodaysDate);

			if (count == 0) {
				System.out.println(RED + "Alarm not available.");

			}

			else {

				String alarmDate1 = getDate1.getText();

//				System.out.println(germanyTodaysDate3);
//				System.out.println(alarmDate1);

				if (gTodaysDate.equals(alarmDate1) || germanyTodaysDate1.equals(alarmDate1)) {
					System.out.println(GREEN + "Alarm " + title + " created successfully.");

				}

				else {
					System.out.println(RED + "Alarm " + title + " not created successfully.");
				}

			}

		}
	}

	public void testAlarm_EscaltionCallSmsEmail(WebDriver driver, String st01N, String st02N, String gTodaysDate,
			String germanyTimeAfter7MinHH, String germanyTimeAfter7MinMM, String st01EscalarionResourceCallSmsEmail)
			throws Throwable {

		Actions act = new Actions(driver);
		Robot robot = new Robot();

		mangeTestAlarm.click();
		Thread.sleep(2000);
		refreshFilter.click();
		Thread.sleep(2000);

		// Create new alarm
		createNewButton.click();
		Thread.sleep(1000);

		fireStationField.click();
		Thread.sleep(1000);

		// Select Fire Stations
		act.sendKeys(st01N).perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(500);

		act.sendKeys(st02N).perform();
		Thread.sleep(500);
		act.sendKeys(Keys.ENTER).perform();

		// Alarm details
		alarmKeyword.click();
		String title = "BG-TA to check call and fallback with Escaltion alarm.-" + gTodaysDate + "_"
				+ germanyTimeAfter7MinHH + germanyTimeAfter7MinMM;
		act.sendKeys(title).perform();

		alarmImage.click();
		act.sendKeys("Image-TA to check call and fallback with Escaltion alarm.").perform();

		descriptionField.click();
		act.sendKeys("Verifying Test Alarm with call and fallback calls, SMS, and emails using a escaltion alarm.")
				.perform();

		Thread.sleep(1000);
		Alarmmonitor.click();
		Thread.sleep(1000);

		// Reporter details
		reporter.click();
		Thread.sleep(500);

		reporterName.click();
		act.sendKeys("Dr. Sumit Raghute").perform();

		reporterStreet.click();
		act.sendKeys("Kharbi Road, Nagpur").perform();

		reporterZipCode.click();
		act.sendKeys("440009").perform();

		act.moveToElement(reporterMobileNo).click().perform();
		Thread.sleep(500);

		reporterMobileNo.click();
		act.sendKeys("1122334455").perform();

		reporterCallback.click();
		act.sendKeys("10").perform();
		Thread.sleep(500);

		// Incident details
		act.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).sendKeys(Keys.TAB).perform();

		act.sendKeys("fire at hospital.").perform();

		act.sendKeys(Keys.TAB).sendKeys(Keys.TAB).perform();

		Thread.sleep(500);
		robot.mouseWheel(5);
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);

		// Planning
		setSchedule.click();
		Thread.sleep(500);

		selectScheduleType.click();
		Thread.sleep(500);

		scheduleRecursive.click();
		Thread.sleep(500);

		recursiveDaily.click();
		Thread.sleep(500);

		dateAndTimeOnetime.click();
		Thread.sleep(1000);

		act.sendKeys(Keys.TAB).perform();
		Thread.sleep(1000);

		String currentHrs1 = currentHrs.getText().trim();

//		System.out.println(currentHrs1);qq
//		System.out.println(germanyTimeAfter5MinHH);

		int current = Integer.parseInt(currentHrs1);
		int target = Integer.parseInt(germanyTimeAfter7MinHH);

		while (current != target) {

			if (current > target) {
				act.sendKeys(Keys.ARROW_UP).perform();
				current--;
			} else {
				act.sendKeys(Keys.ARROW_DOWN).perform();
				current++;
			}

			Thread.sleep(300);
		}

		act.sendKeys(Keys.TAB).perform();
		Thread.sleep(1000);

		String currentMin1 = currentMin.getText().trim();

//		System.out.println(currentMin1);
//		System.out.println(germanyTimeAfter5MinMM);

		int current1 = Integer.parseInt(currentMin1);
		int target1 = Integer.parseInt(germanyTimeAfter7MinMM);

		while (current1 != target1) {

			if (current1 > target1) {
				act.sendKeys(Keys.ARROW_UP).perform();
				current1--;
			} else {
				act.sendKeys(Keys.ARROW_DOWN).perform();
				current1++;
			}

			Thread.sleep(300);
		}

		timeOk.click();
		Thread.sleep(500);

		alertingOverEmail.click();
		Thread.sleep(500);

		alertingOverSMS.click();
		Thread.sleep(500);

		alertingOverCall.click();
		Thread.sleep(500);

		act.moveToElement(testAlarmNext).click().build().perform();

//		testAlarmNext.click();
		Thread.sleep(2000);

		// Alarm address
		alarmAddress.click();
		act.sendKeys("YES Hospital, Plot no. 1 & 1A, Dighori Flyover Square, Dighori, Nagpur, Maharashtra 440017")
				.perform();

		// Tab navigation
//		for (int i = 0; i <= 9; i++) {
//			act.sendKeys(Keys.TAB).perform();
//		}
//
//		// Additional address info
//		additionalAddressInformation.click();
		act.moveToElement(additionalAddressInformation).click().perform();
		Thread.sleep(500);

		alarmObject.click();
		act.sendKeys("hospital").perform();

		alarmFloor.click();
		act.sendKeys("ground floor").perform();

		alarmAnnotation.click();
		act.sendKeys("alarm annotation").perform();
		Thread.sleep(1000);

		act.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();

		Thread.sleep(2000);

		// Resource selection
		userTypeResource.click();
		Thread.sleep(500);

		resourceField1.click();
		act.sendKeys(st01EscalarionResourceCallSmsEmail).perform();
		Thread.sleep(500);
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(500);

//		resourceField2.click();
//		act.sendKeys(st01R2).perform();
//		Thread.sleep(500);
//		act.sendKeys(Keys.ENTER).perform();
//		Thread.sleep(1000);

		act.sendKeys(Keys.TAB).perform();
		Thread.sleep(500);
		// Generate alarm
		saveTestAlarm.click();
		Thread.sleep(500);
		yesCreate.click();
		Thread.sleep(500);

		String firtsTestAlarm1 = firtsTestAlarm.getText();

		firtsTestAlarm1 = firtsTestAlarm1.replace("...", "").trim();
		title = title.replace("...", "").trim();

		Assert.assertTrue(title.contains(firtsTestAlarm1), RED + "Alarm not added.");

		System.out.println(GREEN + title);
	}

	

	public void TestAlarm_Recursive_Monthly_DateyWise_Attribute(WebDriver driver, String st01N, String gTodaysDate,
			String germanyTimeAfter15MinHH, String germanyTimeAfter15MinMM, String st01V1, String st01V2,
			String germanyTodaysDate2, String dayName, String st01A1) throws Throwable {
		Actions act = new Actions(driver);
		Robot robot = new Robot();

		mangeTestAlarm.click();
		Thread.sleep(2000);
		refreshFilter.click();
		Thread.sleep(2000);

		createNewButton.click();
		Thread.sleep(1000);

		fireStationField.click();

		Thread.sleep(2000);
		act.sendKeys(st01N).perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).perform();

		// Alarm keyword
		alarmKeyword.click();
		String title = "BG-TA Montly-Date Wise Attribute-" + gTodaysDate + "_" + germanyTimeAfter15MinHH
				+ germanyTimeAfter15MinMM;
		act.sendKeys(title).perform();

		// Image & description
		alarmImage.click();
		act.sendKeys("Image-TA Montly-Date Wise Attribute.").perform();

		descriptionField.click();
		act.sendKeys("Checking Test alarm monthly-date wise and user type Attribute. ").perform();

		Thread.sleep(1000);
		Alarmmonitor.click();
		Thread.sleep(1000);

		// Reporter details
		Thread.sleep(2000);
		reporter.click();

		Thread.sleep(2000);
		reporterName.click();
		act.sendKeys("Dr. Sumit Raghute").perform();

		reporterStreet.click();
		act.sendKeys("Kharbi Road, Nagpur").perform();

		reporterZipCode.click();
		act.sendKeys("440009").perform();

		act.moveToElement(reporterMobileNo).click().perform();
		Thread.sleep(500);

		reporterMobileNo.click();
		act.sendKeys("1122334455").perform();

		reporterCallback.click();
		act.sendKeys("10").perform();

		// Incident text
		act.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).sendKeys(Keys.TAB).perform();

		act.sendKeys("fire at hospital.").perform();

		act.sendKeys(Keys.TAB).sendKeys(Keys.TAB).perform();

		Thread.sleep(500);
		robot.mouseWheel(5);
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);

		// Planning
		setSchedule.click();
		Thread.sleep(500);

		selectScheduleType.click();
		Thread.sleep(500);

		scheduleRecursive.click();
		Thread.sleep(500);

		recursiveMonthly.click();
		Thread.sleep(500);

		dateForMontlyDateWise.click();
		Thread.sleep(500);

		dateOfMonth.click();
		Thread.sleep(500);

		// hover + click

		int intgermanyTodaysDate2 = Integer.parseInt(germanyTodaysDate2);

		for (int i = 1; i <= intgermanyTodaysDate2; i++) {
			act.sendKeys(Keys.DOWN).perform();
			Thread.sleep(100);
		}
		Thread.sleep(500);

		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(500);

		act.sendKeys(Keys.TAB).perform();
		Thread.sleep(1000);

		timeWeekly.click();
		Thread.sleep(500);

		act.sendKeys(Keys.TAB).perform();
		Thread.sleep(1000);

		String currentHrs1 = currentHrs.getText().trim();

//				System.out.println(currentHrs1);
//				System.out.println(germanyTimeAfter5MinHH);

		int current = Integer.parseInt(currentHrs1);
		int target = Integer.parseInt(germanyTimeAfter15MinHH);

		while (current != target) {

			if (current > target) {
				act.sendKeys(Keys.ARROW_UP).perform();
				current--;
			} else {
				act.sendKeys(Keys.ARROW_DOWN).perform();
				current++;
			}

			Thread.sleep(300);
		}

		act.sendKeys(Keys.TAB).perform();
		Thread.sleep(1000);

		String currentMin1 = currentMin.getText().trim();

//				System.out.println(currentMin1);
//				System.out.println(germanyTimeAfter5MinMM);

		int current1 = Integer.parseInt(currentMin1);
		int target1 = Integer.parseInt(germanyTimeAfter15MinMM);

		while (current1 != target1) {

			if (current1 > target1) {
				act.sendKeys(Keys.ARROW_UP).perform();
				current1--;
			} else {
				act.sendKeys(Keys.ARROW_DOWN).perform();
				current1++;
			}

			Thread.sleep(300);
		}

		timeOk.click();
		Thread.sleep(500);

		act.moveToElement(testAlarmNext).click().build().perform();

//		testAlarmNext.click();
		Thread.sleep(2000);

		// Address
		alarmAddress.click();
		act.sendKeys("BAPS Swaminarayan mandir, Wathoda Layout, Nagpur, Maharashtra 440035").perform();

		// Tab navigation
//		for (int i = 0; i <= 9; i++) {
//			act.sendKeys(Keys.TAB).perform();
//		}
//
//		// Additional address info
//		additionalAddressInformation.click();
		act.moveToElement(additionalAddressInformation).click().perform();

		alarmObject.click();
		act.sendKeys("hospital").perform();

		alarmFloor.click();
		act.sendKeys("ground floor").perform();

		alarmAnnotation.click();
		act.sendKeys("alarm annotation").perform();

		act.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();

		// Attribute & vehicle selection
		Thread.sleep(2000);
		userTypeAttribute.click();

		Thread.sleep(2000);
		vehicleField1.click();

		// Vehicle 1
		act.sendKeys(st01V1).perform();
		Thread.sleep(1000);
		act.sendKeys(Keys.ENTER).perform();

		Thread.sleep(1000);
		act.sendKeys(Keys.HOME).perform();
		for (int d = 0; d <= 15; d++) {
			act.sendKeys(Keys.DELETE).perform();

		}

		// Vehicle 2
		Thread.sleep(1000);
		act.sendKeys(st01V2).perform();
		Thread.sleep(1000);
		act.sendKeys(Keys.ENTER).perform();

		Thread.sleep(1000);
//		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).perform();

		act.sendKeys(Keys.HOME).perform();
		for (int a = 0; a <= 30; a++) {

			act.sendKeys(Keys.DELETE).perform();
		}
		// Attribute
		attributeField.click();
		Thread.sleep(1000);
		act.sendKeys(st01A1).perform();
		Thread.sleep(1000);
		act.sendKeys(Keys.ENTER).perform();

		Thread.sleep(1000);
//		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).perform();

		act.sendKeys(Keys.HOME).perform();
		for (int a = 0; a <= 30; a++) {

			act.sendKeys(Keys.DELETE).perform();
		}

		Thread.sleep(1000);

		act.sendKeys(Keys.TAB).perform();
		Thread.sleep(500);

		// Generate alarm
		saveTestAlarm.click();
		Thread.sleep(1000);
		yesCreate.click();
		Thread.sleep(5000);

		String firtsTestAlarm1 = firtsTestAlarm.getText();

		firtsTestAlarm1 = firtsTestAlarm1.replace("...", "").trim();
		title = title.replace("...", "").trim();

		Assert.assertTrue(title.contains(firtsTestAlarm1), RED + "Alarm not added.");

		System.out.println(GREEN + title);

	}

	public void TestAlarm_Recursive_Monthly_DayWise_Attribute(WebDriver driver, String st01N, String gTodaysDate,
			String germanyTimeAfter11MinHH, String germanyTimeAfter11MinMM, String st01V1, String st01V2,
			String dayCount, String dayName, String st01A1) throws Throwable {
		Actions act = new Actions(driver);
		Robot robot = new Robot();
		mangeTestAlarm.click();
		Thread.sleep(2000);
		refreshFilter.click();
		Thread.sleep(2000);

		createNewButton.click();
		Thread.sleep(1000);

		fireStationField.click();

		Thread.sleep(2000);
		act.sendKeys(st01N).perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).perform();

		// Alarm keyword
		alarmKeyword.click();
		String title = "BG-TA Montly-Day Wise Attribute-" + gTodaysDate + "_" + germanyTimeAfter11MinHH
				+ germanyTimeAfter11MinMM;
		act.sendKeys(title).perform();

		// Image & description
		alarmImage.click();
		act.sendKeys("Image-TA Montly-Day Wise Attribute.").perform();

		descriptionField.click();
		act.sendKeys("Checking Test alarm monthly-day wise and user type Attribute.").perform();

		Thread.sleep(1000);
		Alarmmonitor.click();
		Thread.sleep(1000);

		// Reporter details
		Thread.sleep(2000);
		reporter.click();

		Thread.sleep(2000);
		reporterName.click();
		act.sendKeys("Dr. Sumit Raghute").perform();

		reporterStreet.click();
		act.sendKeys("Kharbi Road, Nagpur").perform();

		reporterZipCode.click();
		act.sendKeys("440009").perform();

		act.moveToElement(reporterMobileNo).click().perform();
		Thread.sleep(500);

		reporterMobileNo.click();
		act.sendKeys("1122334455").perform();

		reporterCallback.click();
		act.sendKeys("10").perform();

		// Incident text
		act.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).sendKeys(Keys.TAB).perform();

		act.sendKeys("fire at hospital.").perform();

		act.sendKeys(Keys.TAB).sendKeys(Keys.TAB).perform();

		Thread.sleep(500);
		robot.mouseWheel(5);
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);

		// Planning
		setSchedule.click();
		Thread.sleep(500);

		selectScheduleType.click();
		Thread.sleep(500);

		scheduleRecursive.click();
		Thread.sleep(500);

		recursiveMonthly.click();
		Thread.sleep(500);

		monthlyDayWise.click();
		Thread.sleep(500);

		weekForMonthlyDayWise.click();
		Thread.sleep(500);

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		WebElement selectDay = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//div[normalize-space(text())='" + dayCount + "']")));

		// hover + click
		act.moveToElement(selectDay).click().perform();
		Thread.sleep(500);

		dayOfWeek.click();
		Thread.sleep(500);

		WebElement dayOfWkke1 = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//div[normalize-space(text())='" + dayName + "']")));

		act.moveToElement(dayOfWkke1).click().perform();
		Thread.sleep(500);

		timeForMonthlyDayWise.click();
		Thread.sleep(500);

		act.sendKeys(Keys.TAB).perform();
		Thread.sleep(1000);

		String currentHrs1 = currentHrs.getText().trim();

//				System.out.println(currentHrs1);
//				System.out.println(germanyTimeAfter5MinHH);

		int current = Integer.parseInt(currentHrs1);
		int target = Integer.parseInt(germanyTimeAfter11MinHH);

		while (current != target) {

			if (current > target) {
				act.sendKeys(Keys.ARROW_UP).perform();
				current--;
			} else {
				act.sendKeys(Keys.ARROW_DOWN).perform();
				current++;
			}

			Thread.sleep(300);
		}

		act.sendKeys(Keys.TAB).perform();
		Thread.sleep(1000);

		String currentMin1 = currentMin.getText().trim();

//				System.out.println(currentMin1);
//				System.out.println(germanyTimeAfter5MinMM);

		int current1 = Integer.parseInt(currentMin1);
		int target1 = Integer.parseInt(germanyTimeAfter11MinMM);

		while (current1 != target1) {

			if (current1 > target1) {
				act.sendKeys(Keys.ARROW_UP).perform();
				current1--;
			} else {
				act.sendKeys(Keys.ARROW_DOWN).perform();
				current1++;
			}

			Thread.sleep(300);
		}

		timeOk.click();
		Thread.sleep(500);

		act.moveToElement(testAlarmNext).click().build().perform();

//		testAlarmNext.click();
		Thread.sleep(2000);

		// Address
		alarmAddress.click();
		act.sendKeys("BAPS Swaminarayan mandir, Wathoda Layout, Nagpur, Maharashtra 440035").perform();

		// Tab navigation
//		for (int i = 0; i <= 9; i++) {
//			act.sendKeys(Keys.TAB).perform();
//		}
//
//		// Additional address info
//		additionalAddressInformation.click();
		act.moveToElement(additionalAddressInformation).click().perform();
		alarmObject.click();
		act.sendKeys("hospital").perform();

		alarmFloor.click();
		act.sendKeys("ground floor").perform();

		alarmAnnotation.click();
		act.sendKeys("alarm annotation").perform();

		act.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();

		// Attribute & vehicle selection
		Thread.sleep(2000);
		userTypeAttribute.click();

		Thread.sleep(2000);
		vehicleField1.click();

		// Vehicle 1
		act.sendKeys(st01V1).perform();
		Thread.sleep(1000);
		act.sendKeys(Keys.ENTER).perform();

		Thread.sleep(1000);
//		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).perform();

		act.sendKeys(Keys.HOME).perform();
		for (int a = 0; a <= 30; a++) {

			act.sendKeys(Keys.DELETE).perform();
		}

		// Vehicle 2
		Thread.sleep(1000);
		act.sendKeys(st01V2).perform();
		Thread.sleep(1000);
		act.sendKeys(Keys.ENTER).perform();

		Thread.sleep(1000);
//		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).perform();

		act.sendKeys(Keys.HOME).perform();
		for (int a = 0; a <= 30; a++) {

			act.sendKeys(Keys.DELETE).perform();
		}
		// Attribute
		attributeField.click();
		Thread.sleep(1000);
		act.sendKeys(st01A1).perform();
		Thread.sleep(1000);
		act.sendKeys(Keys.ENTER).perform();

		Thread.sleep(1000);
//		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).perform();

		act.sendKeys(Keys.HOME).perform();
		for (int a = 0; a <= 30; a++) {

			act.sendKeys(Keys.DELETE).perform();
		}
		Thread.sleep(1000);

		act.sendKeys(Keys.TAB).perform();
		Thread.sleep(500);

		// Generate alarm
		saveTestAlarm.click();
		Thread.sleep(1000);
		yesCreate.click();
		Thread.sleep(5000);

		String firtsTestAlarm1 = firtsTestAlarm.getText();

		firtsTestAlarm1 = firtsTestAlarm1.replace("...", "").trim();
		title = title.replace("...", "").trim();

		Assert.assertTrue(title.contains(firtsTestAlarm1), RED + "Alarm not added.");

		System.out.println(GREEN + title);
	}

	public void testAlarm_recursiv_weekly_users(WebDriver driver, String st01N, String st02N, String gTodaysDate,
			String germanyTimeAfter9MinHH, String germanyTimeAfter9MinMM, String dayName, String st01V1, String st01V2,
			String st02V1, String st01FF1, String st01FF2, String st02FF1) throws Throwable {

		// -----------------------
		// CREATE MANUAL ALARM (FIREFIGHTER)
		// -----------------------
		Actions act = new Actions(driver);
		Robot robot = new Robot();

		mangeTestAlarm.click();
		Thread.sleep(2000);
		refreshFilter.click();

		Thread.sleep(2000);

		createNewButton.click();
		Thread.sleep(2000);

		fireStationField.click();
		Thread.sleep(1000);

		// Select Fire Stations
		act.sendKeys(st01N).perform();
		Thread.sleep(1000);
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);

		act.sendKeys(st02N).perform();
		Thread.sleep(500);
		act.sendKeys(Keys.ENTER).perform();

		// Alarm details
		alarmKeyword.click();
		String title = "BG-TA by weekly Users-" + gTodaysDate + "_" + germanyTimeAfter9MinHH + germanyTimeAfter9MinMM;
		act.sendKeys(title).perform();

		alarmImage.click();
		act.sendKeys("Image-TA by weekly Users").perform();

		descriptionField.click();
		act.sendKeys("Checking Test alarm weekly wise and user type users.").perform();

		Thread.sleep(1000);
		Alarmmonitor.click();
		Thread.sleep(1000);

		// Reporter details
		reporter.click();
		Thread.sleep(1000);

		reporterName.click();
		act.sendKeys("Dr. Sumit Raghute").perform();

		reporterStreet.click();
		act.sendKeys("Kharbi Road, Nagpur").perform();

		reporterZipCode.click();
		act.sendKeys("440009").perform();

		act.moveToElement(reporterMobileNo).click().perform();
		Thread.sleep(500);

		reporterMobileNo.click();
		act.sendKeys("1122334455").perform();

		reporterCallback.click();
		act.sendKeys("10").perform();
		Thread.sleep(500);

		// Incident details
		act.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).sendKeys(Keys.TAB).perform();

		act.sendKeys("fire at hospital.").perform();

		act.sendKeys(Keys.TAB).sendKeys(Keys.TAB).perform();

		Thread.sleep(500);
		robot.mouseWheel(5);
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);

		// Planning
		setSchedule.click();
		Thread.sleep(500);

		selectScheduleType.click();
		Thread.sleep(500);

		scheduleRecursive.click();
		Thread.sleep(500);

		recursiveWeekly.click();
		Thread.sleep(500);

		selectWeekDay.click();
		Thread.sleep(500);

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		WebElement pickUpDay = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//div[normalize-space(text())='" + dayName + "']")));

		// hover + click
		act.moveToElement(pickUpDay).click().perform();

		timeWeekly.click();
		Thread.sleep(500);

		act.sendKeys(Keys.TAB).perform();
		Thread.sleep(1000);

		String currentHrs1 = currentHrs.getText().trim();

//				System.out.println(currentHrs1);
//				System.out.println(germanyTimeAfter5MinHH);

		int current = Integer.parseInt(currentHrs1);
		int target = Integer.parseInt(germanyTimeAfter9MinHH);

		while (current != target) {

			if (current > target) {
				act.sendKeys(Keys.ARROW_UP).perform();
				current--;
			} else {
				act.sendKeys(Keys.ARROW_DOWN).perform();
				current++;
			}

			Thread.sleep(300);
		}

		act.sendKeys(Keys.TAB).perform();
		Thread.sleep(1000);

		String currentMin1 = currentMin.getText().trim();

//				System.out.println(currentMin1);
//				System.out.println(germanyTimeAfter5MinMM);

		int current1 = Integer.parseInt(currentMin1);
		int target1 = Integer.parseInt(germanyTimeAfter9MinMM);

		while (current1 != target1) {

			if (current1 > target1) {
				act.sendKeys(Keys.ARROW_UP).perform();
				current1--;
			} else {
				act.sendKeys(Keys.ARROW_DOWN).perform();
				current1++;
			}

			Thread.sleep(300);
		}

		timeOk.click();
		Thread.sleep(500);

		act.moveToElement(testAlarmNext).click().build().perform();

//		testAlarmNext.click();
		Thread.sleep(2000);

		// Alarm address
		alarmAddress.click();
		act.sendKeys("YES Hospital, Plot no. 1 & 1A, Dighori Flyover Square, Dighori, Nagpur, Maharashtra 440017")
				.perform();

		// Tab navigation
//		for (int i = 0; i <= 9; i++) {
//			act.sendKeys(Keys.TAB).perform();
//		}
//
//		// Additional address info
//		additionalAddressInformation.click();
		act.moveToElement(additionalAddressInformation).click().perform();
		Thread.sleep(500);

		alarmObject.click();
		act.sendKeys("hospital").perform();

		alarmFloor.click();
		act.sendKeys("ground floor").perform();

		alarmAnnotation.click();
		act.sendKeys("alarm annotation").perform();
		Thread.sleep(1000);

		act.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();

		Thread.sleep(2000);

		// Firefighter and vehicle selection
		userTypeFirefighter.click();
		Thread.sleep(1000);

		vehicleField1.click();
		Thread.sleep(1000);

		act.sendKeys(st01V1).perform();
		Thread.sleep(1000);
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(1000);

//		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).perform();

		act.sendKeys(Keys.HOME).perform();
		for (int a = 0; a <= 30; a++) {

			act.sendKeys(Keys.DELETE).perform();
		}

		Thread.sleep(500);

		act.sendKeys(st01V2).perform();
		Thread.sleep(1000);
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(1000);

//		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).perform();
		act.sendKeys(Keys.HOME).perform();
		for (int a = 0; a <= 30; a++) {

			act.sendKeys(Keys.DELETE).perform();
		}
		Thread.sleep(500);

		act.sendKeys(st02V1).perform();
		Thread.sleep(500);
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(1000);

		// Firefighter fields
		FirefighterField1.click();
		Thread.sleep(2000);
		act.sendKeys(st01FF1).perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.HOME).perform();
		for (int a = 0; a <= 30; a++) {

			act.sendKeys(Keys.DELETE).perform();
		}

		Thread.sleep(2000);
		act.sendKeys(st01FF2).perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.HOME).perform();
		for (int a = 0; a <= 30; a++) {

			act.sendKeys(Keys.DELETE).perform();
		}
		Thread.sleep(500);

//		act.sendKeys(st01FFEmailCallSms).perform();
//		Thread.sleep(2000);
//		act.sendKeys(Keys.ENTER).perform();
//		Thread.sleep(2000);
//		act.sendKeys(Keys.TAB).perform();
//		Thread.sleep(500);

		FirefighterField2.click();
		Thread.sleep(500);
		act.sendKeys(st02FF1).perform();
		Thread.sleep(500);
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(1000);

		// Generate alarm
		Thread.sleep(500);
		act.sendKeys(Keys.TAB).perform();
		Thread.sleep(500);
		saveTestAlarm.click();
		Thread.sleep(500);
		yesCreate.click();
		Thread.sleep(5000);

		String firtsTestAlarm1 = firtsTestAlarm.getText();

		firtsTestAlarm1 = firtsTestAlarm1.replace("...", "").trim();
		title = title.replace("...", "").trim();

		Assert.assertTrue(title.contains(firtsTestAlarm1), RED + "Alarm not added.");

		System.out.println(GREEN + title);

	}

	public void testAlarm_recursiv_daily_Resource(WebDriver driver, String st01N, String st02N, String gTodaysDate,
			String germanyTimeAfter7MinHH, String germanyTimeAfter7MinMM, String st01R1, String st01R2)
			throws Throwable {

		Actions act = new Actions(driver);
		Robot robot = new Robot();

		mangeTestAlarm.click();
		Thread.sleep(2000);
		refreshFilter.click();
		Thread.sleep(2000);

		// Create new alarm
		createNewButton.click();
		Thread.sleep(1000);

		fireStationField.click();
		Thread.sleep(1000);

		// Select Fire Stations
		act.sendKeys(st01N).perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(500);

		act.sendKeys(st02N).perform();
		Thread.sleep(500);
		act.sendKeys(Keys.ENTER).perform();

		// Alarm details
		alarmKeyword.click();
		String title = "BG-TA Recursive daily by resource-" + gTodaysDate + "_" + germanyTimeAfter7MinHH
				+ germanyTimeAfter7MinMM;
		act.sendKeys(title).perform();

		alarmImage.click();
		act.sendKeys("Image-TA Recursive daily by resource").perform();

		descriptionField.click();
		act.sendKeys("Checking TA Recursive daily by resource. ").perform();

		Thread.sleep(1000);
		Alarmmonitor.click();
		Thread.sleep(1000);

		// Reporter details
		reporter.click();
		Thread.sleep(500);

		reporterName.click();
		act.sendKeys("Dr. Sumit Raghute").perform();

		reporterStreet.click();
		act.sendKeys("Kharbi Road, Nagpur").perform();

		reporterZipCode.click();
		act.sendKeys("440009").perform();

		act.moveToElement(reporterMobileNo).click().perform();
		Thread.sleep(500);

		reporterMobileNo.click();
		act.sendKeys("1122334455").perform();

		reporterCallback.click();
		act.sendKeys("10").perform();
		Thread.sleep(500);

		// Incident details
		act.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).sendKeys(Keys.TAB).perform();

		act.sendKeys("fire at hospital.").perform();

		act.sendKeys(Keys.TAB).sendKeys(Keys.TAB).perform();

		Thread.sleep(500);
		robot.mouseWheel(5);
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);

		// Planning
		setSchedule.click();
		Thread.sleep(500);

		selectScheduleType.click();
		Thread.sleep(500);

		scheduleRecursive.click();
		Thread.sleep(500);

		recursiveDaily.click();
		Thread.sleep(500);

		dateAndTimeOnetime.click();
		Thread.sleep(1000);

		act.sendKeys(Keys.TAB).perform();
		Thread.sleep(1000);

		String currentHrs1 = currentHrs.getText().trim();

//		System.out.println(currentHrs1);
//		System.out.println(germanyTimeAfter5MinHH);

		int current = Integer.parseInt(currentHrs1);
		int target = Integer.parseInt(germanyTimeAfter7MinHH);

		while (current != target) {

			if (current > target) {
				act.sendKeys(Keys.ARROW_UP).perform();
				current--;
			} else {
				act.sendKeys(Keys.ARROW_DOWN).perform();
				current++;
			}

			Thread.sleep(300);
		}

		act.sendKeys(Keys.TAB).perform();
		Thread.sleep(1000);

		String currentMin1 = currentMin.getText().trim();

//		System.out.println(currentMin1);
//		System.out.println(germanyTimeAfter5MinMM);

		int current1 = Integer.parseInt(currentMin1);
		int target1 = Integer.parseInt(germanyTimeAfter7MinMM);

		while (current1 != target1) {

			if (current1 > target1) {
				act.sendKeys(Keys.ARROW_UP).perform();
				current1--;
			} else {
				act.sendKeys(Keys.ARROW_DOWN).perform();
				current1++;
			}

			Thread.sleep(300);
		}

		timeOk.click();
		Thread.sleep(500);

		act.moveToElement(testAlarmNext).click().build().perform();

//		testAlarmNext.click();
		Thread.sleep(2000);

		// Alarm address
		alarmAddress.click();
		act.sendKeys("YES Hospital, Plot no. 1 & 1A, Dighori Flyover Square, Dighori, Nagpur, Maharashtra 440017")
				.perform();

		// Tab navigation
//		for (int i = 0; i <= 9; i++) {
//			act.sendKeys(Keys.TAB).perform();
//		}

		// Additional address info

		act.moveToElement(additionalAddressInformation).click().perform();
//		additionalAddressInformation.click();
		Thread.sleep(500);

		alarmObject.click();
		act.sendKeys("hospital").perform();

		alarmFloor.click();
		act.sendKeys("ground floor").perform();

		alarmAnnotation.click();
		act.sendKeys("alarm annotation").perform();
		Thread.sleep(1000);

		act.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();

		Thread.sleep(2000);

		// Resource selection
		userTypeResource.click();
		Thread.sleep(500);

		resourceField1.click();
		act.sendKeys(st01R1).perform();
		Thread.sleep(500);
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(500);

		resourceField2.click();
		act.sendKeys(st01R2).perform();
		Thread.sleep(500);
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(1000);

		act.sendKeys(Keys.TAB).perform();
		Thread.sleep(500);
		// Generate alarm
		saveTestAlarm.click();
		Thread.sleep(500);
		yesCreate.click();
		Thread.sleep(500);

		String firtsTestAlarm1 = firtsTestAlarm.getText();

		firtsTestAlarm1 = firtsTestAlarm1.replace("...", "").trim();
		title = title.replace("...", "").trim();

		Assert.assertTrue(title.contains(firtsTestAlarm1), RED + "Alarm not added.");

		System.out.println(GREEN + title);

	}

	public void TestAlarm_OneTime_Resource_CallSmsEmail(WebDriver driver, String st01N, String st02N,
			String gTodaysDate, String germanyTimeAfter5MinHH, String germanyTimeAfter5MinMM, String st01RCallSms,
			String st02R1) throws Throwable {
		Actions act = new Actions(driver);
		Robot robot = new Robot();
		mangeTestAlarm.click();
		Thread.sleep(2000);
		refreshFilter.click();
		Thread.sleep(2000);

		createNewButton.click();
		Thread.sleep(1000);

		fireStationField.click();
		Thread.sleep(1000);

		// Select Fire Stations
		act.sendKeys(st01N).perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(500);

		act.sendKeys(st02N).perform();
		Thread.sleep(500);
		act.sendKeys(Keys.ENTER).perform();

		// Alarm keyword
		alarmKeyword.click();
		String title = "BG-TA One Time by Resource MS -" + gTodaysDate + "_" + germanyTimeAfter5MinHH
				+ germanyTimeAfter5MinMM;
		act.sendKeys(title).perform();

		// Image & description
		alarmImage.click();
		act.sendKeys("Image-TA One Time by attribute").perform();

		descriptionField.click();
		act.sendKeys("Checking Test alarm One Time by attribute").perform();

//		Thread.sleep(1000);
//		Alarmmonitor.click();
//		Thread.sleep(1000);
//		

		// Reporter details
		Thread.sleep(2000);
		reporter.click();

		Thread.sleep(2000);
		reporterName.click();
		act.sendKeys("Dr. Sumit Raghute").perform();

		reporterStreet.click();
		act.sendKeys("Kharbi Road, Nagpur").perform();

		reporterZipCode.click();
		act.sendKeys("440009").perform();

		act.moveToElement(reporterMobileNo).click().perform();
		Thread.sleep(500);

		reporterMobileNo.click();
		act.sendKeys("1122334455").perform();

		reporterCallback.click();
		act.sendKeys("10").perform();

		// Incident text
		act.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).sendKeys(Keys.TAB).perform();

		act.sendKeys("fire at hospital.").perform();

		act.sendKeys(Keys.TAB).sendKeys(Keys.TAB).perform();

		Thread.sleep(500);
		robot.mouseWheel(5);
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);

		// Planning
		setSchedule.click();
		Thread.sleep(500);

		selectScheduleType.click();
		Thread.sleep(500);

		scheduleOneTime.click();
		Thread.sleep(500);

		dateAndTimeOnetime.click();
		Thread.sleep(500);

		startDateHours.click();
		Thread.sleep(500);
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();

		act.sendKeys(Keys.HOME).perform();
		for (int a = 0; a <= 30; a++) {

			act.sendKeys(Keys.DELETE).perform();
		}

		Thread.sleep(1000);
		act.sendKeys(germanyTimeAfter5MinHH).perform();
		Thread.sleep(200);
		act.keyDown(Keys.TAB).perform();
		Thread.sleep(200);
		act.sendKeys(germanyTimeAfter5MinMM).perform();
		Thread.sleep(200);
		timeOk.click();
		Thread.sleep(1000);

		alertingOverEmail.click();
		Thread.sleep(500);

		alertingOverSMS.click();
		Thread.sleep(500);

		alertingOverCall.click();
		Thread.sleep(500);

		act.moveToElement(testAlarmNext).click().build().perform();

//		testAlarmNext.click();
		Thread.sleep(2000);

		// Address
		alarmAddress.click();
		act.sendKeys("BAPS Swaminarayan mandir, Wathoda Layout, Nagpur, Maharashtra 440035").perform();

		// Tab navigation
//		for (int i = 0; i <= 9; i++) {
//			act.sendKeys(Keys.TAB).perform();
//		}

		// Additional address info

		act.moveToElement(additionalAddressInformation).click().perform();
//		additionalAddressInformation.click();

		alarmObject.click();
		act.sendKeys("hospital").perform();

		alarmFloor.click();
		act.sendKeys("ground floor").perform();

		alarmAnnotation.click();
		act.sendKeys("alarm annotation").perform();

		act.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();

		// Attribute & vehicle selection
		Thread.sleep(2000);

		userTypeResource.click();
		Thread.sleep(500);
		resourceField1.click();
		act.sendKeys(st01RCallSms).perform();
		Thread.sleep(500);
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(500);

		act.sendKeys(Keys.TAB).perform();

		resourceField2.click();
		act.sendKeys(st02R1).perform();
		Thread.sleep(500);
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(1000);

		act.sendKeys(Keys.TAB).perform();

		// Generate alarm
		saveTestAlarm.click();
		Thread.sleep(1000);
		yesCreate.click();
		Thread.sleep(5000);

		String firtsTestAlarm1 = firtsTestAlarm.getText();

		firtsTestAlarm1 = firtsTestAlarm1.replace("...", "").trim();
		title = title.replace("...", "").trim();

		Assert.assertTrue(title.contains(firtsTestAlarm1), RED + "Alarm not added.");

		System.out.println(GREEN + title);

	}

	public void TestAlarm_OneTime_Attribute(WebDriver driver, String st01N, String gTodaysDate,
			String germanyTimeAfter5MinHH, String germanyTimeAfter5MinMM, String st01V1, String st01V2, String st01A1)
			throws Throwable {
		Actions act = new Actions(driver);
		Robot robot = new Robot();
		mangeTestAlarm.click();
		Thread.sleep(2000);
		refreshFilter.click();
		Thread.sleep(2000);

		createNewButton.click();
		Thread.sleep(1000);

		fireStationField.click();

		Thread.sleep(2000);
		act.sendKeys(st01N).perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).perform();

		// Alarm keyword
		alarmKeyword.click();
		String title = "BG-TA One Time by attribute-" + gTodaysDate + "_" + germanyTimeAfter5MinHH
				+ germanyTimeAfter5MinMM;
		act.sendKeys(title).perform();

		// Image & description
		alarmImage.click();
		act.sendKeys("Image-TA One Time by attribute").perform();

		descriptionField.click();
		act.sendKeys("Checking Test alarm One Time by attribute").perform();

//		Thread.sleep(1000);
//		Alarmmonitor.click();
//		Thread.sleep(1000);
//		

		// Reporter details
		Thread.sleep(2000);
		reporter.click();

		Thread.sleep(2000);
		reporterName.click();
		act.sendKeys("Dr. Sumit Raghute").perform();

		reporterStreet.click();
		act.sendKeys("Kharbi Road, Nagpur").perform();

		reporterZipCode.click();
		act.sendKeys("440009").perform();

		act.moveToElement(reporterMobileNo).click().perform();
		Thread.sleep(500);

		reporterMobileNo.click();
		act.sendKeys("1122334455").perform();

		reporterCallback.click();
		act.sendKeys("10").perform();

		// Incident text
		act.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).sendKeys(Keys.TAB).perform();

		act.sendKeys("fire at hospital.").perform();

		act.sendKeys(Keys.TAB).sendKeys(Keys.TAB).perform();

		Thread.sleep(500);
		robot.mouseWheel(5);
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);

		// Planning
		setSchedule.click();
		Thread.sleep(500);

		selectScheduleType.click();
		Thread.sleep(500);

		scheduleOneTime.click();
		Thread.sleep(500);

		dateAndTimeOnetime.click();
		Thread.sleep(500);

		startDateHours.click();
		Thread.sleep(500);
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();

		act.sendKeys(Keys.HOME).perform();
		for (int a = 0; a <= 30; a++) {

			act.sendKeys(Keys.DELETE).perform();
		}

		Thread.sleep(1000);
		act.sendKeys(germanyTimeAfter5MinHH).perform();
		Thread.sleep(200);
		act.keyDown(Keys.TAB).perform();
		Thread.sleep(200);
		act.sendKeys(germanyTimeAfter5MinMM).perform();
		Thread.sleep(200);
		timeOk.click();
		Thread.sleep(1000);

		act.moveToElement(testAlarmNext).click().build().perform();

//		testAlarmNext.click();
		Thread.sleep(2000);

		// Address
		alarmAddress.click();
		act.sendKeys("BAPS Swaminarayan mandir, Wathoda Layout, Nagpur, Maharashtra 440035").perform();

		// Tab navigation
//		for (int i = 0; i <= 9; i++) {
//			act.sendKeys(Keys.TAB).perform();
//		}

		// Additional address info

		act.moveToElement(additionalAddressInformation).click().perform();
//		additionalAddressInformation.click();

		alarmObject.click();
		act.sendKeys("hospital").perform();

		alarmFloor.click();
		act.sendKeys("ground floor").perform();

		alarmAnnotation.click();
		act.sendKeys("alarm annotation").perform();

		act.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();

		// Attribute & vehicle selection
		Thread.sleep(2000);
		userTypeAttribute.click();

		Thread.sleep(2000);
		vehicleField1.click();

		// Vehicle 1
		act.sendKeys(st01V1).perform();
		Thread.sleep(1000);
		act.sendKeys(Keys.ENTER).perform();

		Thread.sleep(1000);
		act.sendKeys(Keys.HOME).perform();
		for (int d = 0; d <= 15; d++) {
			act.sendKeys(Keys.DELETE).perform();

		}
		// Vehicle 2
		Thread.sleep(1000);
		act.sendKeys(st01V2).perform();
		Thread.sleep(1000);
		act.sendKeys(Keys.ENTER).perform();

		Thread.sleep(1000);
		act.sendKeys(Keys.HOME).perform();
		for (int d = 0; d <= 15; d++) {
			act.sendKeys(Keys.DELETE).perform();

		}

		// Attribute
		attributeField.click();
		Thread.sleep(1000);
		act.sendKeys(st01A1).perform();
		Thread.sleep(1000);
		act.sendKeys(Keys.ENTER).perform();

		Thread.sleep(1000);
//		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).perform();
		for (int d = 0; d <= 15; d++) {
			act.sendKeys(Keys.DELETE).perform();

		}

		Thread.sleep(1000);

		act.sendKeys(Keys.TAB).perform();
		Thread.sleep(500);

		// Generate alarm
		saveTestAlarm.click();
		Thread.sleep(1000);
		yesCreate.click();
		Thread.sleep(5000);

		String firtsTestAlarm1 = firtsTestAlarm.getText();

		firtsTestAlarm1 = firtsTestAlarm1.replace("...", "").trim();
		title = title.replace("...", "").trim();

		Assert.assertTrue(title.contains(firtsTestAlarm1), RED + "Alarm not added.");

		System.out.println(GREEN + title);

	}

	public void CheckManualAlarmEscalationFunctionalityForMultuStation(WebDriver driver,
			String manualAlarmNameForEsclationAlarm, String branchName) throws Throwable {
		Actions act = new Actions(driver);

		// Search alarm by title
		titleSearch.click();
		Thread.sleep(500);

		titleSearchField.click();
		Thread.sleep(500);

		act.sendKeys(manualAlarmNameForEsclationAlarm).perform();
		Thread.sleep(1000);

		titleSearchFieldOk.click();
		Thread.sleep(5000);

		bgAlarm.click();
		Thread.sleep(3000);

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].scrollIntoView(true);", firstStataionTab);
		Thread.sleep(3000);

		secondStataionTab.click();
		Thread.sleep(3000);

		js.executeScript("arguments[0].scrollIntoView(true);", ffAtribute);
		Thread.sleep(2000);

		switch (branchName) {
		case "1":
			try {
				if (jonas2.isDisplayed()) {
					System.out.println(GREEN + "Extended user visible,Alarm Extended successfully.");
				}
			} catch (Exception e) {
				System.out.println(RED + "User not found means alarm not extended.");
			}
			break;
		case "1.1":
			try {
				if (jonas2.isDisplayed()) {
					System.out.println(GREEN + "Extended user visible,Alarm Extended successfully.");
				}
			} catch (Exception e) {
				System.out.println(RED + "User not found means alarm not extended.");
			}
			break;

		case "2":
			try {
				if (bhupeshTest.isDisplayed()) {
					System.out.println(GREEN + "Extended user visible,Alarm Extended successfully.");
				}
			} catch (Exception e) {
				System.out.println(RED + "User not found means alarm not extended.");
			}
			break;

		default:
			System.out.println(RED + "Invalid branch");
		}

	}

	public void CheckApiAlarmEscalationFunctionality(WebDriver driver, String apiAlarmNameForEsclationAlarm,
			String branchName) throws Throwable {
		Actions act = new Actions(driver);

		// Search alarm by title
		titleSearch.click();
		Thread.sleep(500);

		titleSearchField.click();
		Thread.sleep(500);

		act.sendKeys(apiAlarmNameForEsclationAlarm).perform();
		Thread.sleep(1000);

		titleSearchFieldOk.click();
		Thread.sleep(5000);

		bgAlarm.click();
		Thread.sleep(3000);

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].scrollIntoView(true);", firstStataionTab);
		Thread.sleep(3000);

		js.executeScript("arguments[0].scrollIntoView(true);", ffAtribute);
		Thread.sleep(2000);

		switch (branchName) {
		case "1":
			try {
				if (jonas2.isDisplayed()) {
					System.out.println(GREEN + "Extended user visible,Alarm Extended successfully.");
				}
			} catch (Exception e) {
				System.out.println(RED + "User not found means alarm not extended.");
			}
			break;

		case "1.1":
			try {
				if (jonas2.isDisplayed()) {
					System.out.println(GREEN + "Extended user visible,Alarm Extended successfully.");
				}
			} catch (Exception e) {
				System.out.println(RED + "User not found means alarm not extended.");
			}
			break;

		case "2":
			try {
				if (bhupeshTest.isDisplayed()) {
					System.out.println(GREEN + "Extended user visible,Alarm Extended successfully.");
				}
			} catch (Exception e) {
				System.out.println(RED + "User not found means alarm not extended.");
			}
			break;

		default:
			System.out.println(RED + "Invalid branch");
		}

	}

	public void CheckAlarmExtendFunctionalityNewApi(WebDriver driver, String newApiAlarmForMessage, String branchName)
			throws Throwable {
		Actions act = new Actions(driver);

		// Search alarm by title
		titleSearch.click();
		Thread.sleep(500);

		titleSearchField.click();
		Thread.sleep(500);

		act.sendKeys(newApiAlarmForMessage).perform();
		Thread.sleep(1000);

		titleSearchFieldOk.click();
		Thread.sleep(5000);

		bgAlarm.click();
		Thread.sleep(3000);

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].scrollIntoView(true);", secondStataionTab);
		Thread.sleep(3000);

		secondStataionTab.click();
		Thread.sleep(3000);

		js.executeScript("arguments[0].scrollIntoView(true);", ffAtribute);
		Thread.sleep(2000);

		switch (branchName) {
		case "1":
			try {
				if (jonas2.isDisplayed()) {
					System.out.println(GREEN + "Extended user visible,Alarm Extended successfully.");
				}
			} catch (Exception e) {
				System.out.println(RED + "User not found means alarm not extended.");
			}
			break;

		case "1.1":
			try {
				if (jonas2.isDisplayed()) {
					System.out.println(GREEN + "Extended user visible,Alarm Extended successfully.");
				}
			} catch (Exception e) {
				System.out.println(RED + "User not found means alarm not extended.");
			}
			break;

		case "2":
			try {
				if (bhupeshTest.isDisplayed()) {
					System.out.println(GREEN + "Extended user visible,Alarm Extended successfully.");
				}
			} catch (Exception e) {
				System.out.println(RED + "User not found means alarm not extended.");
			}
			break;

		default:
			System.out.println(RED + "Invalid branch");
		}

	}

	public void TCManualAlarmMSCheckingValidation(WebDriver driver, String st01N, String st02N, String gTodaysDate,
			String gtimeHHMMSS, String st01R1, String st01R2) throws Throwable {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Actions act = new Actions(driver);
		Robot robot = new Robot();

		if (alarmListTitle.isDisplayed() && createNewButton.isDisplayed()) {
			System.out.println(GREEN + "TC_Alarm_001 — Verify Navigation to Amarm List Page.");
		}

		if (createNewButton.isDisplayed()) {
			System.out.println(GREEN + "TC_Alarm_002 — Verify Create Button Visibility.");
		}

		// Create new alarm
		createNewButton.click();
		Thread.sleep(1000);

		if (createAlarmTitle.isDisplayed()) {
			System.out.println(GREEN + "TC_Alarm_003 — Verify Navigation to basic information of Amarm Page.");
		}

		nextButton.click();
		Thread.sleep(1000);
		if (fireStaionIsRequriedValidation.isDisplayed() && keywordIsRequriedValidation.isDisplayed()
				&& alarmDetailsAreRequired.isDisplayed()) {
			System.out.println(GREEN + "TC_Alarm_004 — Verify Required Validation for Station, Keyword, Alarm Details");
		}

		fireStationField.click();
		Thread.sleep(1000);

		if (stationNameList.isDisplayed()) {
			System.out.println(GREEN + "TC_Alarm_005 — Verify that the station list is displayed");
		}

		// Select Fire Stations
		act.sendKeys(st01N).perform();
		Thread.sleep(2000);

		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(500);

		act.sendKeys(st02N).perform();
		Thread.sleep(500);
		act.sendKeys(Keys.ENTER).perform();

		// Alarm details
		alarmKeyword.click();
		String title = "BG-MA by resource-" + gTodaysDate + "_" + gtimeHHMMSS;
		act.sendKeys(title).perform();

		alarmImage.click();
		act.sendKeys("Image-manual alarm by resource checking.").perform();

		descriptionField.click();
		act.sendKeys("BG-manual alarm by resource checking.").perform();

		// Reporter details
		reporter.click();
		Thread.sleep(500);

		if (reporterName.isDisplayed() && reporterStreet.isDisplayed() && reporterZipCode.isDisplayed()
				&& reporterMobileNo.isDisplayed() && reporterCallback.isDisplayed()) {
			System.out.println(GREEN
					+ "TC_Alarm_006 — Verify the visibility of the Reporter Name, Street, Zip Code, Mobile Number, and Callback fields.");
		}

		reporterName.click();
		act.sendKeys("Dr. Sumit Raghute").perform();

		reporterStreet.click();
		act.sendKeys("Kharbi Road, Nagpur").perform();

		reporterZipCode.click();
		act.sendKeys("440009").perform();

		act.moveToElement(reporterMobileNo).click().perform();
		Thread.sleep(500);

		reporterMobileNo.click();
		act.sendKeys("1122334455").perform();

		reporterCallback.click();
		act.sendKeys("10").perform();
		Thread.sleep(500);

		// Incident details
		act.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).build().perform();
//			additionalFields.click();
		Thread.sleep(500);
//			addIconAdditionalInformation.click();

		if (addIconAdditionalInformation.isDisplayed()) {
			System.out.println(GREEN
					+ "TC_Alarm_007 — Verify the visibility of the ‘Enter Additional’ field after clicking on the Additional Field title");
		}

		js.executeScript("arguments[0].scrollIntoView(true);", nextButton);
		act.sendKeys(Keys.PAGE_DOWN).perform();
		Thread.sleep(1000);
		act.sendKeys(Keys.TAB).perform();
		act.sendKeys("fire at hospital.").perform();

		act.sendKeys(Keys.TAB, Keys.ENTER).perform();

		if (addIconAdditionalInformation1.isDisplayed()) {
			System.out.println(GREEN
					+ "TC_Alarm_008 — Verify the visibility of the ‘Enter Additional 2’ field after clicking on the add Additional Field button");
		}

		js.executeScript("arguments[0].scrollIntoView(true);", nextButton);
		act.sendKeys(Keys.PAGE_DOWN).perform();
		Thread.sleep(1000);
		nextButton.click();
		Thread.sleep(1000);

//			
//			Thread.sleep(500);
//			robot.mouseWheel(5);
//			act.sendKeys(Keys.ENTER).perform();

		if (addressTitle.isDisplayed() && latitudeTitle.isDisplayed() && dragMarkerOnTheMapTitle.isDisplayed()) {
			System.out.println(GREEN + "TC_Alarm_008 — Verify Navigation to address of Amarm Page.");
		}

		if (alarmAddress.isDisplayed() && latitudeTitle.isDisplayed() && longitudeTtile.isDisplayed()) {
			System.out
					.println(GREEN + "TC_Alarm_009 — Verify the visibility of Address, Latitude,logitude inpu fields");
		}

		// Alarm address
		alarmAddress.click();
		act.sendKeys("YES Hospital, Plot no. 1 & 1A, Dighori Flyover Square, Dighori, Nagpur, Maharashtra 440017")
				.perform();

		// Tab navigation
//			for (int i = 0; i <= 9; i++) {
//			    act.sendKeys(Keys.TAB).perform();
//			}

		js.executeScript("arguments[0].scrollIntoView(true);", additionalAddressInformation);
		act.sendKeys(Keys.PAGE_DOWN).perform();
		Thread.sleep(1000);

		if (additionalAddressInformation.isDisplayed()) {
			System.out.println(GREEN + "TC_Alarm_010 — Verify the visibility of additional address information");
		}

		// Additional address info

		additionalAddressInformation.click();
		Thread.sleep(500);

		if (alarmObject.isDisplayed() && alarmFloor.isDisplayed() && alarmAnnotation.isDisplayed()) {
			System.out.println(
					GREEN + "TC_Alarm_011 — Verify the visibility of Alarm object, Alarm floor, Alarm annotaion ");
		}

		alarmObject.click();
		act.sendKeys("hospital").perform();

		alarmFloor.click();
		act.sendKeys("ground floor").perform();

		alarmAnnotation.click();
		act.sendKeys("alarm annotation").perform();
		Thread.sleep(1000);

		act.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();

		Thread.sleep(2000);

		// Resource selection

		if (alarmObject.isDisplayed() && alarmFloor.isDisplayed() && alarmAnnotation.isDisplayed()) {
			System.out.println(
					GREEN + "TC_Alarm_012 — Verify the visibility of user type Attribute, Resource and Firefighter ");
		}

		userTypeAttribute.click();
		Thread.sleep(500);
		saveTestAlarm.click();
		Thread.sleep(500);
		if (pleaseSelectAtLeastOneAttributeValidation.isDisplayed()) {
			System.out.println(GREEN + "TC_Alarm_013 — Verify the visibility of Attribute validation");
		}

		vehicleField1.click();
		Thread.sleep(500);

		if (vehicleNameList.isDisplayed()) {
			System.out.println(GREEN + "TC_Alarm_014 — Verify the visibility of vehicle list");
		}

		attributeField.click();
		Thread.sleep(500);
		if (attributeNameList.isDisplayed()) {
			System.out.println(GREEN + "TC_Alarm_015 — Verify the visibility of Attribute list");
		}

		userTypeResource.click();
		Thread.sleep(500);

		saveTestAlarm.click();
		Thread.sleep(500);

		if (pleaseSelectAtLeastOneResource.isDisplayed()) {
			System.out.println(GREEN + "TC_Alarm_016 — Verify the visibility of Resource validation");
		}
		resourceField1.click();
		Thread.sleep(500);

		if (station01ResourceNameList.isDisplayed()) {
			System.out.println(GREEN + "TC_Alarm_017 — Verify the visibility of 1st Station Resource list");
		}

		act.sendKeys(Keys.TAB).perform();
		Thread.sleep(1000);
		act.sendKeys("0").perform();
		Thread.sleep(1000);
		Thread.sleep(500);

		if (station02ResourceNameList.isDisplayed()) {
			System.out.println(GREEN + "TC_Alarm_018 — Verify the visibility of 2nd Station Resource list");
		}

		userTypeFirefighter.click();
		Thread.sleep(2000);
		saveTestAlarm.click();
		Thread.sleep(1000);

		if (pleaseSelectAtLeastOneFirefighter.isDisplayed()) {
			System.out.println(GREEN + "TC_Alarm_019 — Verify the visibility of Firefighter validation");
		}

		vehicleField1.click();
		Thread.sleep(500);

		if (vehicleNameList.isDisplayed()) {
			System.out.println(GREEN + "TC_Alarm_020 — Verify the visibility of vehicle list");
		}
		act.sendKeys(Keys.TAB).perform();
		Thread.sleep(1000);
		act.sendKeys("0").perform();
		Thread.sleep(1000);

		if (station01FirefighterNameList.isDisplayed()) {
			System.out.println(GREEN + "TC_Alarm_021 — Verify the visibility of 1st Station firefighter list");
		}

		act.sendKeys(Keys.TAB).perform();
		Thread.sleep(1000);
		act.sendKeys("0").perform();
		Thread.sleep(1000);

		if (station02FirefighterNameList.isDisplayed()) {
			System.out.println(GREEN + "TC_Alarm_022 — Verify the visibility of 2nd Station firefighter list");
		}

		Thread.sleep(1000);

		userTypeResource.click();
		Thread.sleep(500);
		resourceField1.click();
		act.sendKeys(st01R1).perform();
		Thread.sleep(500);
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(500);

		resourceField2.click();
		act.sendKeys(st01R2).perform();
		Thread.sleep(500);
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(1000);

		act.sendKeys(Keys.TAB).perform();

//		 Generate alarm.
		generateAlarm.click();
		Thread.sleep(500);
		yesCreate.click();
		Thread.sleep(500);

		String expectedTitle = firstItemTitle.getText();
		expectedTitle = expectedTitle.replace("...", "").trim();
		title = title.replace("...", "").trim();

		Assert.assertTrue(title.contains(expectedTitle), RED + "Alarm not added.");

		System.out.println(GREEN + title);

	}

	public void smokeForManualAlarm() {
		if (createNewButton.isDisplayed()) {
			System.out.println(GREEN + "Create New button for manual alarm is visible");
		} else {
			Assert.fail(RED + "Create New button is NOT displayed");
		}

	}

	public void commonForManualAlarm(WebDriver driver, String deptN, String branchName) throws Throwable {

		Thread.sleep(2000);

//			

//		switch (branchName) {
//		case "1": {
//			driver.navigate().to("https://admin.retteralarm.de/admin/alarm/list");
//			break;
//		}
//		case "1.1": {
//			driver.navigate().to("https://admin.retteralarm.de/admin/alarm/list");
//			break;
//
//		}
//		case "2": {
//			driver.navigate().to("https://admin.testing.retteralarm.de/admin/alarm/list");
//
//			break;
//		}
//		case "3": {
//			driver.navigate().to("https://admin.development.retteralarm.de/admin/alarm/list");
//
//			break;
//
//		}
//
//		}

		alarmModule.click();
		Thread.sleep(2000);

		manageAlarm.click();
		Thread.sleep(2000);

		refreshFilter.click();
		Thread.sleep(4000);

	}

	public void manualAlarmByNewEscResource(WebDriver driver, String st01N, String gTodaysDate, String gtimeHHMMSS,
			String filePath) throws Throwable {

		File src = new File(filePath);
		FileInputStream ipt = new FileInputStream(src);
		XSSFWorkbook wb11 = new XSSFWorkbook(ipt);
		XSSFSheet sheet11 = wb11.getSheetAt(0);

		String NewResourceEsc2 = sheet11.getRow(24).getCell(1).getStringCellValue();

		Actions act = new Actions(driver);

		/* Create New Alarm */
		createNewButton.click();
		Thread.sleep(1000);

		/* Fire Station */
		fireStationField.click();
		Thread.sleep(500);
		act.sendKeys(st01N).perform();
		Thread.sleep(500);
		act.sendKeys(Keys.ENTER).perform();

		/* Alarm Keyword */
		alarmKeyword.click();
		String title = "BG-MA by new esc resource-" + gTodaysDate + "_" + gtimeHHMMSS;
		act.sendKeys(title).perform();

		/* Alarm Image */
		alarmImage.click();
		act.sendKeys("Image-manual alarm by new escalation resource").perform();

		/* Description */
		descriptionField.click();
		act.sendKeys("Checking manual alarm by new escalation resource").perform();

		/* Priority */
		priority.click();
		Thread.sleep(500);

		/* Reporter Details */
		reporter.click();
		Thread.sleep(1000);
		reporterName.click();
		act.sendKeys("Dr. Nikhil").perform();

		reporterStreet.click();
		act.sendKeys("Kharbi Road, Nagpur").perform();

		reporterZipCode.click();
		act.sendKeys("440009").perform();

		act.moveToElement(reporterMobileNo).click().perform();
		Thread.sleep(500);

		reporterMobileNo.click();
		act.sendKeys("1122334455").perform();

		reporterCallback.click();
		act.sendKeys("10").perform();

		/* Robot Actions */
		Robot robot = new Robot();
		act.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).sendKeys(Keys.TAB).perform();

		/* Alarm Message */
		act.sendKeys("fire at hospital.").perform();

		/* Scroll & Submit */
		act.sendKeys(Keys.TAB).sendKeys(Keys.TAB).perform();
		Thread.sleep(500);
		robot.mouseWheel(5);
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);

		/* Address */
		alarmAddress.click();
		act.sendKeys("Tapasya Vidya Mandir, 4446+52G, Vinkar Colony, Manewada, Nagpur, Maharashtra 440024").perform();

		/* Navigate Tabs */
//		for (int i = 0; i <= 9; i++) {
//			act.sendKeys(Keys.TAB).perform();
//		}

		/* Additional Information */

//		additionalAddressInformation.click();
		act.moveToElement(additionalAddressInformation).click().perform();

		alarmObject.click();
		act.sendKeys("hospital").perform();

		alarmFloor.click();
		act.sendKeys("ground floor").perform();

		alarmAnnotation.click();
		act.sendKeys("alarm annotation").perform();

		act.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);

		/* Resource Selection */
		userTypeResource.click();
		Thread.sleep(1000);

		resourceField1.click();
		Thread.sleep(500);

		/* Read Resource from Excel */

		act.sendKeys(NewResourceEsc2).perform();
		Thread.sleep(500);
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(500);
		act.sendKeys(Keys.TAB).perform();
		Thread.sleep(500);

		/* Generate Alarm */
		generateAlarm.click();
		Thread.sleep(1000);
		yesCreate.click();
		Thread.sleep(2000);

		String expectedTitle = firstItemTitle.getText();
		expectedTitle = expectedTitle.replace("...", "").trim();
		title = title.replace("...", "").trim();

		Assert.assertTrue(title.contains(expectedTitle), RED + "Alarm not added.");

		System.out.println(GREEN + title + GREEN);

	}

	public void manualAlarmByNewREsource(WebDriver driver, String st01N, String gTodaysDate, String gtimeHHMMSS,
			String filePath) throws Throwable {

		Actions act = new Actions(driver);

		// Create new alarm
		createNewButton.click();
		Thread.sleep(1000);

		// Fire station selection
		fireStationField.click();
		Thread.sleep(500);
		act.sendKeys(st01N).perform();
		Thread.sleep(500);
		act.sendKeys(Keys.ENTER).perform();

		// Alarm keyword
		alarmKeyword.click();
		String title = "BG-MA by new resource-" + gTodaysDate + "_" + gtimeHHMMSS;
		act.sendKeys(title).perform();

		// Alarm image
		alarmImage.click();
		act.sendKeys("Image-manual alarm by new resource").perform();

		// Description
		descriptionField.click();
		act.sendKeys("Checking manual alarm by new resource").perform();

		// Priority
		priority.click();
		Thread.sleep(500);

		// Reporter details
		reporter.click();
		Thread.sleep(1000);
		reporterName.click();
		act.sendKeys("Dr. Nikhil").perform();

		reporterStreet.click();
		act.sendKeys("Kharbi Road, Nagpur").perform();

		reporterZipCode.click();
		act.sendKeys("440009").perform();

		act.moveToElement(reporterMobileNo).click().perform();
		Thread.sleep(500);

		reporterMobileNo.click();
		act.sendKeys("1122334455").perform();

		reporterCallback.click();
		act.sendKeys("10").perform();

		// Keyboard navigation
		Robot robot = new Robot();
		act.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).sendKeys(Keys.TAB).perform();

		// Incident details
		act.sendKeys("fire at hospital.").perform();
		act.sendKeys(Keys.TAB).sendKeys(Keys.TAB).perform();

		Thread.sleep(500);
		robot.mouseWheel(5);
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);

		// Address
		alarmAddress.click();
		act.sendKeys("Mahal Nagpur.").perform();

		act.moveToElement(additionalAddressInformation).click().build().perform();
		Thread.sleep(500);

		alarmObject.click();
		act.sendKeys("hospital").perform();

		alarmFloor.click();
		act.sendKeys("ground floor").perform();

		alarmAnnotation.click();
		act.sendKeys("alarm annotation").perform();

		act.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);

		// Resource selection
		userTypeResource.click();
		Thread.sleep(1000);

		resourceField1.click();
		Thread.sleep(500);

		// Read resource from Excel
		File src = new File(filePath);
		FileInputStream ipt = new FileInputStream(src);
		XSSFWorkbook wb11 = new XSSFWorkbook(ipt);
		XSSFSheet sheet11 = wb11.getSheetAt(0);

		NewResource = sheet11.getRow(21).getCell(1).getStringCellValue();

		// Select resource
		act.sendKeys(NewResource).perform();
		Thread.sleep(500);
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(500);
		act.sendKeys(Keys.TAB).perform();

		Thread.sleep(500);
		act.sendKeys(Keys.TAB).perform();
		Thread.sleep(500);
		// Generate alarm
		generateAlarm.click();
		Thread.sleep(1000);
		yesCreate.click();
		Thread.sleep(5000);

		String expectedTitle = firstItemTitle.getText();
		expectedTitle = expectedTitle.replace("...", "").trim();
		title = title.replace("...", "").trim();

		Assert.assertTrue(title.contains(expectedTitle), RED + "Alarm not added.");

		System.out.println(GREEN + title);

	}

	public void sendMessageToManualAlarmUser(WebDriver driver, String ManualAlarmNameForChat, String gTodaysDate,
			String gtimeHHMMSS, String branchName) throws InterruptedException {
		Actions act = new Actions(driver);

		// Search alarm by title
		titleSearch.click();
		Thread.sleep(500);

		titleSearchField.click();
		Thread.sleep(500);

		act.sendKeys(ManualAlarmNameForChat).perform();
		Thread.sleep(1000);

		titleSearchFieldOk.click();
		Thread.sleep(5000);

		act.moveToElement(action).click().perform();

		// Open action menu
//		action.click();
		Thread.sleep(1000);

		int z = buttonCount.size();

		if (z == 6) {

			// Open chat
			alarmChat.click();
			Thread.sleep(1000);
			Thread.sleep(2000);
			textarea.click();
			Thread.sleep(1000);
			String messageText = "Text message sent to the manual alarm user.";
			act.sendKeys(messageText).perform();
			Thread.sleep(1000);
			sendButton.click();
			Thread.sleep(1000);
			String expTextmessage = textMessageMA.getText();

			Assert.assertTrue(messageText.contains(expTextmessage), RED + "Message not sent.");

			System.out.println(GREEN + messageText + " sent successfuly ");
			Thread.sleep(1000);

		}

		else {

			Thread.sleep(2000);
			driver.navigate().refresh();
			Thread.sleep(2000);
			Reporter.log(RED + "Chat option not found.", true);
		}

		switch (branchName) {
		case "1": {
			driver.navigate().to("https://admin.retteralarm.de/admin/alarm/list");
			break;
		}
		case "1.1": {
			driver.navigate().to("https://admin.retteralarm.de/admin/alarm/list");
			break;
		}
		case "2": {
			driver.navigate().to("https://admin.testing.retteralarm.de/admin/alarm/list");

			break;
		}
		case "3": {
			driver.navigate().to("https://admin.development.retteralarm.de/admin/alarm/list");

			break;

		}

		}
		refreshFilter.click();
		Thread.sleep(4000);

	}

	public void sendMessageToOldApiAlarmUser(WebDriver driver, String ManualAlarmNameForChatOldApi, String branchName)
			throws Throwable {
		Actions act = new Actions(driver);

		// Search alarm by title
		titleSearch.click();
		Thread.sleep(500);

		titleSearchField.click();
		Thread.sleep(500);

		act.sendKeys(ManualAlarmNameForChatOldApi).perform();
		Thread.sleep(1000);

		titleSearchFieldOk.click();
		Thread.sleep(5000);
		act.moveToElement(action).click().perform();

		// Open action menu
//		action.click();
		Thread.sleep(1000);

		int z = buttonCount.size();

		if (z == 6) {

			// Open chat
			alarmChat.click();
			Thread.sleep(1000);

//				writemessageField.click();
//				Thread.sleep(1000);
//				String message = "Text message sent to the new API alarm user.";
//				act.sendKeys(message).perform();
//
//				sendmessageButton.click();
//				Thread.sleep(1000);
//
//				String expectedTitle = messageText.getText().split("\\n")[0].trim();
//				Assert.assertTrue(message.contains(expectedTitle), RED + "Message not sent.");
//
//				System.out.println(GREEN + message + " sent successfuly ");

//			/* -------- IMAGE ATTACHMENT -------- */
//			act.moveToElement(attachFile).click().perform();
//			Thread.sleep(1000);
//
//			StringSelection ss = new StringSelection(
//					"C:\\Users\\BHUPESH\\Desktop\\SampleFiles\\sampleImage_2.21mb.jpg");
//			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
//
			Robot rc = new Robot();
//			Thread.sleep(2000);
//			rc.keyPress(KeyEvent.VK_CONTROL);
//			rc.keyPress(KeyEvent.VK_V);
//			Thread.sleep(2000);
//			rc.keyRelease(KeyEvent.VK_CONTROL);
//			rc.keyRelease(KeyEvent.VK_V);
//			Thread.sleep(2000);
//			rc.keyPress(KeyEvent.VK_ENTER);
//			rc.keyRelease(KeyEvent.VK_ENTER);
//			Thread.sleep(2000);
//
//			writemessageField.click();
//			Thread.sleep(1000);
//			String message1 = "Image file message sent to the new API alarm user.";
//			act.sendKeys(message1).perform();
//			Thread.sleep(2000);
//
//			sendmessageButton.click();
//			expectedTitle = messageText.getText().split("\\n")[0].trim();
//			Assert.assertTrue(message1.contains(expectedTitle), RED + "Message not sent.");
//
//			System.out.println(GREEN + message1 + " sent successfuly ");
//
//			/* -------- PDF ATTACHMENT -------- */
//			Thread.sleep(1000);
//			act.moveToElement(attachFile).click().perform();
//			Thread.sleep(1000);
//
//			StringSelection ss1 = new StringSelection("C:\\Users\\BHUPESH\\Desktop\\SampleFiles\\samplePdf_5.4mb.pdf");
//			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss1, null);
//
//			Thread.sleep(2000);
//			rc.keyPress(KeyEvent.VK_CONTROL);
//			rc.keyPress(KeyEvent.VK_V);
//			Thread.sleep(2000);
//			rc.keyRelease(KeyEvent.VK_CONTROL);
//			rc.keyRelease(KeyEvent.VK_V);
//			Thread.sleep(2000);
//			rc.keyPress(KeyEvent.VK_ENTER);
//			rc.keyRelease(KeyEvent.VK_ENTER);
//			Thread.sleep(2000);
//
//			writemessageField.click();
//			Thread.sleep(1000);
//			String message2 = "Pdf file message sent to the new API alarm user.";
//			act.sendKeys(message2).perform();
//			Thread.sleep(2000);
//			sendmessageButton.click();
//			Thread.sleep(2000);
//
//			sendmessageButton.click();
//			expectedTitle = messageText.getText().split("\\n")[0].trim();
//			Assert.assertTrue(message2.contains(expectedTitle), RED + "Message not sent.");
//
//			System.out.println(GREEN + message2 + " sent successfuly ");
//
//			/* -------- WORD FILE ATTACHMENT -------- */
//			Thread.sleep(1000);
//			act.moveToElement(attachFile).click().perform();
//			Thread.sleep(1000);
//
//			StringSelection ss2 = new StringSelection("C:\\Users\\BHUPESH\\Desktop\\SampleFiles\\sample_WordFile.docx");
//			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss2, null);
//
//			Thread.sleep(2000);
//			rc.keyPress(KeyEvent.VK_CONTROL);
//			rc.keyPress(KeyEvent.VK_V);
//			Thread.sleep(2000);
//			rc.keyRelease(KeyEvent.VK_CONTROL);
//			rc.keyRelease(KeyEvent.VK_V);
//			Thread.sleep(2000);
//			rc.keyPress(KeyEvent.VK_ENTER);
//			rc.keyRelease(KeyEvent.VK_ENTER);
//			Thread.sleep(2000);
//
//			writemessageField.click();
//			Thread.sleep(1000);
//			String message3 = "Word file message sent to the new API alarm user.";
//			act.sendKeys(message3).perform();
//			Thread.sleep(2000);
//			sendmessageButton.click();
//
//			expectedTitle = messageText.getText().split("\\n")[0].trim();
//			Assert.assertTrue(message3.contains(expectedTitle), RED + "Message not sent.");
//
//			System.out.println(GREEN + message3 + " sent successfuly ");

			Thread.sleep(2000);
			textarea.click();
			Thread.sleep(1000);
			String messageText = "Text message sent to the new API alarm user.";
			act.sendKeys(messageText).perform();
			Thread.sleep(1000);
			sendButton.click();
			Thread.sleep(1000);

			String expTextmessage = textMessage.getText();

			Assert.assertTrue(messageText.contains(expTextmessage), RED + "Message not sent.");

			System.out.println(GREEN + messageText + " sent successfuly ");
			Thread.sleep(1000);

			// image`

//			chatAttachment.click();
//			Thread.sleep(1000);
//
//			StringSelection ss = new StringSelection(
//					"C:\\Users\\BHUPESH\\Desktop\\SampleFiles\\Automation\\sample_image.png");
//			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
//
//			Robot rc = new Robot();
//			Thread.sleep(2000);
//			rc.keyPress(KeyEvent.VK_CONTROL);
//			rc.keyPress(KeyEvent.VK_V);
//			Thread.sleep(2000);
//			rc.keyRelease(KeyEvent.VK_CONTROL);
//			rc.keyRelease(KeyEvent.VK_V);
//			Thread.sleep(2000);
//			rc.keyPress(KeyEvent.VK_ENTER);
//			rc.keyRelease(KeyEvent.VK_ENTER);
//			Thread.sleep(2000);
//
//			textarea.click();
//			Thread.sleep(1000);
//			String imageText = "Image file & text sent to the new API alarm user.";
//			act.sendKeys(imageText).perform();
//			Thread.sleep(1000);
//			sendButton.click();
//			Thread.sleep(2000);
//
//			boolean isImageDisplay = uploadedImage.isDisplayed();
//
//			Assert.assertTrue(isImageDisplay, RED + "Image and text are not attached to the chat.");
//
//			System.out.println(GREEN + imageText);
//			Thread.sleep(1000);
//
//			// pdf
//
//			chatAttachment.click();
//			Thread.sleep(1000);
//
//			StringSelection ss1 = new StringSelection(
//					"C:\\Users\\BHUPESH\\Desktop\\SampleFiles\\Automation\\sample_pdf.pdf");
//			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss1, null);
//
//			Thread.sleep(2000);
//			rc.keyPress(KeyEvent.VK_CONTROL);
//			rc.keyPress(KeyEvent.VK_V);
//			Thread.sleep(2000);
//			rc.keyRelease(KeyEvent.VK_CONTROL);
//			rc.keyRelease(KeyEvent.VK_V);
//			Thread.sleep(2000);
//			rc.keyPress(KeyEvent.VK_ENTER);
//			rc.keyRelease(KeyEvent.VK_ENTER);
//			Thread.sleep(2000);
//
//			textarea.click();
//			Thread.sleep(1000);
//			String pdfText = "Pdf file & message sent to the new API alarm user.";
//			act.sendKeys(pdfText).perform();
//			Thread.sleep(1000);
//			sendButton.click();
//			Thread.sleep(2000);
//
//			boolean isPdfAvailable = uploadedPdf.isDisplayed();
//
//			Assert.assertTrue(isPdfAvailable, RED + "Pdf and text are not attached to the chat.");
//
//			System.out.println(GREEN + pdfText);
//			Thread.sleep(1000);
//
//			// WordFile
//			chatAttachment.click();
//			Thread.sleep(1000);
//
//			StringSelection ss2 = new StringSelection(
//					"C:\\Users\\BHUPESH\\Desktop\\SampleFiles\\Automation\\sample_WordFile.docx");
//			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss2, null);
//
//			Thread.sleep(2000);
//			rc.keyPress(KeyEvent.VK_CONTROL);
//			rc.keyPress(KeyEvent.VK_V);
//			Thread.sleep(2000);
//			rc.keyRelease(KeyEvent.VK_CONTROL);
//			rc.keyRelease(KeyEvent.VK_V);
//			Thread.sleep(2000);
//			rc.keyPress(KeyEvent.VK_ENTER);
//			rc.keyRelease(KeyEvent.VK_ENTER);
//			Thread.sleep(2000);
//
//			textarea.click();
//			Thread.sleep(1000);
//			String wordText1 = "Word file & text sent to the new API alarm user.";
//			act.sendKeys(wordText1).perform();
//			Thread.sleep(1000);
//			sendButton.click();
//			Thread.sleep(2000);
//
//			boolean isWorrdFileAvailable = uploadedWordFile.isDisplayed();
//
//			Assert.assertTrue(isWorrdFileAvailable, RED + "Pdf and text are not attached to the chat.");
//
//			System.out.println(GREEN + wordText1);
//			Thread.sleep(1000);
//
//			// XLc
//			chatAttachment.click();
//			Thread.sleep(1000);
//
//			StringSelection ss3 = new StringSelection(
//					"C:\\Users\\BHUPESH\\Desktop\\SampleFiles\\Automation\\sample_XLS.xls");
//			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss3, null);
//
//			Thread.sleep(2000);
//			rc.keyPress(KeyEvent.VK_CONTROL);
//			rc.keyPress(KeyEvent.VK_V);
//			Thread.sleep(2000);
//			rc.keyRelease(KeyEvent.VK_CONTROL);
//			rc.keyRelease(KeyEvent.VK_V);
//			Thread.sleep(2000);
//			rc.keyPress(KeyEvent.VK_ENTER);
//			rc.keyRelease(KeyEvent.VK_ENTER);
//			Thread.sleep(2000);
//
//			textarea.click();
//			Thread.sleep(1000);
//			String xlsText = "Xls file & text sent to the new API alarm user.";
//			act.sendKeys(wordText1).perform();
//			Thread.sleep(1000);
//			sendButton.click();
//			Thread.sleep(2000);
//
//			boolean isXlsFileAvailable = uploadedXls.isDisplayed();
//
//			Assert.assertTrue(isXlsFileAvailable, RED + "Pdf and text are not attached to the chat.");
//
//			System.out.println(GREEN + xlsText);
//			Thread.sleep(1000);

		}

		else {
			refreshFilter.click();
			System.out.println(RED + "chat option not found.");
		}

	}

	public void sendMessageToApiEsclationAlarm(WebDriver driver, String apiAlarmNameForEsclationAlarm,
			String chatJpgFile, String chatPngFile, String chatGifFile, String chatWordFile, String chatCsvFile,
			String chatPdfFile, String chatTextFile, String chatExcelFile, String chatPptFile, String chatMp4File,
			String branchName) throws Throwable {
		Actions act = new Actions(driver);

		// Search alarm by title
		titleSearch.click();
		Thread.sleep(500);

		titleSearchField.click();
		Thread.sleep(500);

		act.sendKeys(apiAlarmNameForEsclationAlarm).perform();
		Thread.sleep(1000);

		titleSearchFieldOk.click();
		Thread.sleep(5000);

		act.moveToElement(action).click().perform();

		// Open action menu
//		action.click();
		Thread.sleep(1000);

		int z = buttonCount.size();

		if (z == 6) {

			// Open chat
			alarmChat.click();
			Thread.sleep(2000);

			textarea.click();
			Thread.sleep(1000);
			String messageText = "Text message sent to the new API alarm user.";
			act.sendKeys(messageText).perform();
			Thread.sleep(1000);
			sendButton.click();
			Thread.sleep(1000);
			String expTextmessage = textMessage.getText();

			Assert.assertTrue(messageText.contains(expTextmessage), RED + "Message not sent.");

			System.out.println(GREEN + messageText + " sent successfuly ");
			Thread.sleep(1000);

			// jpg`

			chatAttachment.click();
			Thread.sleep(1000);

			StringSelection ss = new StringSelection(chatJpgFile);
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

			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

			if (wait.until(ExpectedConditions.or(ExpectedConditions.visibilityOf(crossButtonForFile),
					ExpectedConditions.invisibilityOf(crossButtonForFile))) != null
					&& crossButtonForFile.isDisplayed()) {
			}

			textarea.click();
			Thread.sleep(1000);
			String jpgText = "jpg file & text sent to the new API alarm user.";
			act.sendKeys(jpgText).perform();
			Thread.sleep(1000);
			sendButton.click();
			Thread.sleep(2000);

			String uploadedJpgFileName = uploadedFile.getText();
			String jpgTitle = "jpg_19mb.jpg";

			if (uploadedJpgFileName.contains(jpgTitle)) {
				System.out.println(GREEN + "JPG file added successfully");
			} else {
				System.out.println(RED + "JPG file not added.");
			}
			Thread.sleep(2000);

			// png

			chatAttachment.click();
			Thread.sleep(1000);

			StringSelection ss1 = new StringSelection(chatPngFile);
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss1, null);

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

			if (wait.until(ExpectedConditions.or(ExpectedConditions.visibilityOf(crossButtonForFile),
					ExpectedConditions.invisibilityOf(crossButtonForFile))) != null
					&& crossButtonForFile.isDisplayed()) {

			}

			textarea.click();
			Thread.sleep(1000);
			String pngText = "Png file & message sent to the new API alarm user.";
			act.sendKeys(pngText).perform();
			Thread.sleep(1000);
			sendButton.click();
			Thread.sleep(2000);

			uploadedJpgFileName = uploadedFile.getText();
			String pngTitle = "png_19mb.png";

			if (uploadedJpgFileName.contains(pngTitle)) {
				System.out.println(GREEN + "PNG file added successfully");
			} else {
				System.out.println(RED + "PNG file not added.");
			}
			Thread.sleep(2000);

			// Gif
			chatAttachment.click();
			Thread.sleep(1000);

			StringSelection ss2 = new StringSelection(chatGifFile);
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss2, null);

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

			if (wait.until(ExpectedConditions.or(ExpectedConditions.visibilityOf(crossButtonForFile),
					ExpectedConditions.invisibilityOf(crossButtonForFile))) != null
					&& crossButtonForFile.isDisplayed()) {

			}

			textarea.click();
			Thread.sleep(1000);
			String gifText1 = "Gif file & text sent to the new API alarm user.";
			act.sendKeys(gifText1).perform();
			Thread.sleep(1000);
			sendButton.click();
			Thread.sleep(2000);

			uploadedJpgFileName = uploadedFile.getText();
			String gifTitle = "gif_12mb.gif";

			if (uploadedJpgFileName.contains(gifTitle)) {
				System.out.println(GREEN + "GIF file added successfully");
			} else {
				System.out.println(RED + "GIF file not added.");

			}
			Thread.sleep(2000);

			// WordFile
			chatAttachment.click();
			Thread.sleep(1000);

			StringSelection ss3 = new StringSelection(chatWordFile);
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss3, null);

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

			if (wait.until(ExpectedConditions.or(ExpectedConditions.visibilityOf(crossButtonForFile),
					ExpectedConditions.invisibilityOf(crossButtonForFile))) != null
					&& crossButtonForFile.isDisplayed()) {

			}

			textarea.click();
			Thread.sleep(1000);
			String wordText = "Word file & text sent to the new API alarm user.";
			act.sendKeys(wordText).perform();
			Thread.sleep(1000);
			sendButton.click();
			Thread.sleep(2000);

			uploadedJpgFileName = uploadedFile.getText();
			String wordTitle = "Word_19mb.doc";

			if (uploadedJpgFileName.contains(wordTitle)) {
				System.out.println(GREEN + "WORD file added successfully");
			} else {
				System.out.println(RED + "WORD file not added.");

			}
			Thread.sleep(2000);

			// csvFile
			chatAttachment.click();
			Thread.sleep(1000);

			StringSelection ss4 = new StringSelection(chatCsvFile);
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss4, null);

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

			if (wait.until(ExpectedConditions.or(ExpectedConditions.visibilityOf(crossButtonForFile),
					ExpectedConditions.invisibilityOf(crossButtonForFile))) != null
					&& crossButtonForFile.isDisplayed()) {

			}

			textarea.click();
			Thread.sleep(1000);
			String csvText = "Csv file & text sent to the new API alarm user.";
			act.sendKeys(csvText).perform();
			Thread.sleep(1000);
			sendButton.click();
			Thread.sleep(2000);

			uploadedJpgFileName = uploadedFile.getText();
			String csvTitle = "csv_19mb.csv";

			if (uploadedJpgFileName.contains(csvTitle)) {
				System.out.println(GREEN + "CSV file added successfully");
			} else {
				System.out.println(RED + "CSV file not added.");
			}
			Thread.sleep(2000);
			// pdfFile
			chatAttachment.click();
			Thread.sleep(1000);

			StringSelection ss5 = new StringSelection(chatPdfFile);
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss5, null);

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

			if (wait.until(ExpectedConditions.or(ExpectedConditions.visibilityOf(crossButtonForFile),
					ExpectedConditions.invisibilityOf(crossButtonForFile))) != null
					&& crossButtonForFile.isDisplayed()) {

			}

			textarea.click();
			Thread.sleep(1000);
			String pdfText = "Pdf file & text sent to the new API alarm user.";
			act.sendKeys(pdfText).perform();
			Thread.sleep(1000);
			sendButton.click();
			Thread.sleep(2000);

			uploadedJpgFileName = uploadedFile.getText();
			String pdfTitle = "pdf_19mb.pdf";

			if (uploadedJpgFileName.contains(pdfTitle)) {
				System.out.println(GREEN + "PDF file added successfully");
			} else {
				System.out.println(RED + "PDF file not added.");
			}
			Thread.sleep(2000);

			// textFile
			chatAttachment.click();
			Thread.sleep(1000);

			StringSelection ss6 = new StringSelection(chatTextFile);
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss6, null);

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

			if (wait.until(ExpectedConditions.or(ExpectedConditions.visibilityOf(crossButtonForFile),
					ExpectedConditions.invisibilityOf(crossButtonForFile))) != null
					&& crossButtonForFile.isDisplayed()) {

			}

			textarea.click();
			Thread.sleep(1000);
			String textText = "Text file & text sent to the new API alarm user.";
			act.sendKeys(textText).perform();
			Thread.sleep(1000);
			sendButton.click();
			Thread.sleep(2000);

			uploadedJpgFileName = uploadedFile.getText();
			String txtTitle = "txt_19mb.txt";

			if (uploadedJpgFileName.contains(txtTitle)) {
				System.out.println(GREEN + "TXT file added successfully");
			} else {
				System.out.println(RED + "TXT file not added.");
			}
			Thread.sleep(2000);

			// excelFile
			chatAttachment.click();
			Thread.sleep(1000);

			StringSelection ss7 = new StringSelection(chatExcelFile);
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss7, null);

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

			if (wait.until(ExpectedConditions.or(ExpectedConditions.visibilityOf(crossButtonForFile),
					ExpectedConditions.invisibilityOf(crossButtonForFile))) != null
					&& crossButtonForFile.isDisplayed()) {

			}

			textarea.click();
			Thread.sleep(1000);
			String excelText = "Excel file & text sent to the new API alarm user.";
			act.sendKeys(excelText).perform();
			Thread.sleep(1000);
			sendButton.click();
			Thread.sleep(2000);

			uploadedJpgFileName = uploadedFile.getText();
//			System.out.println(uploadedJpgFileName);
			String xlsxTitle = "excel_19mb.xlsx";

			if (uploadedJpgFileName.contains(xlsxTitle)) {
				System.out.println(GREEN + "XLSX file added successfully");
			} else {
				System.out.println(RED + "XLSX file not added.");
			}
			Thread.sleep(2000);
			// pptFile
			chatAttachment.click();
			Thread.sleep(1000);

			StringSelection ss8 = new StringSelection(chatPptFile);
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss8, null);

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

			if (wait.until(ExpectedConditions.or(ExpectedConditions.visibilityOf(crossButtonForFile),
					ExpectedConditions.invisibilityOf(crossButtonForFile))) != null
					&& crossButtonForFile.isDisplayed()) {

			}

			textarea.click();
			Thread.sleep(1000);
			String pptText = "Ppt file & text sent to the new API alarm user.";
			act.sendKeys(pptText).perform();
			Thread.sleep(1000);
			sendButton.click();
			Thread.sleep(2000);

			uploadedJpgFileName = uploadedFile.getText();
			String pptTitle = "ppt_19mb.pptx";

			if (uploadedJpgFileName.contains(pptTitle)) {
				System.out.println(GREEN + "PPT file added successfully");
			} else {
				System.out.println(RED + "PPT file not added.");
			}
			Thread.sleep(2000);
			// mp4File
			chatAttachment.click();
			Thread.sleep(1000);

			StringSelection ss9 = new StringSelection(chatMp4File);
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss9, null);

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

			if (wait.until(ExpectedConditions.or(ExpectedConditions.visibilityOf(crossButtonForFile),
					ExpectedConditions.invisibilityOf(crossButtonForFile))) != null
					&& crossButtonForFile.isDisplayed()) {

			}

			textarea.click();
			Thread.sleep(1000);
			String mmp4Text = "Mp4 file & text sent to the new API alarm user.";
			act.sendKeys(mmp4Text).perform();
			Thread.sleep(1000);
			sendButton.click();
			Thread.sleep(2000);

			uploadedJpgFileName = uploadedFile.getText();
			String mp4Title = "mp4_19mb.mp4";

			if (uploadedJpgFileName.contains(mp4Title)) {
				System.out.println(GREEN + "MP4 file added successfully");
			} else {
				System.out.println(RED + "MP4 file not added.");
			}
			Thread.sleep(2000);

		}

		else {
			refreshFilter.click();
			System.out.println(RED + "chat option not found.");
		}

	}

	public void sendMessageToNewApiAlarmUser(WebDriver driver, String newApiAlarmForMessage, String branchName)
			throws Throwable {
		Actions act = new Actions(driver);

		// Search alarm
		titleSearch.click();
		Thread.sleep(500);

		titleSearchField.click();
		Thread.sleep(500);

		act.sendKeys(newApiAlarmForMessage).perform();

		Thread.sleep(1000);

		titleSearchFieldOk.click();
		Thread.sleep(5000);

		act.moveToElement(action).click().perform();

		// Open action menu
//		action.click();
		Thread.sleep(1000);

		int z = buttonCount.size();

		if (z == 6) {

			// Open chat
			alarmChat.click();
			Thread.sleep(1000);

//				writemessageField.click();
//				Thread.sleep(1000);
//				String message = "Text message sent to the new API alarm user.";
//				act.sendKeys(message).perform();
//
//				sendmessageButton.click();
//				Thread.sleep(1000);
//
//				String expectedTitle = messageText.getText().split("\\n")[0].trim();
//				Assert.assertTrue(message.contains(expectedTitle), RED + "Message not sent.");
//
//				System.out.println(GREEN + message + " sent successfuly ");
//
//				/* -------- IMAGE ATTACHMENT -------- */
//				act.moveToElement(attachFile).click().perform();
//				Thread.sleep(1000);
//
//				StringSelection ss = new StringSelection(
//						"C:\\Users\\BHUPESH\\Desktop\\SampleFiles\\Automation\\sample_image.png");
//				Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
//
//				Robot rc = new Robot();
//				Thread.sleep(2000);
//				rc.keyPress(KeyEvent.VK_CONTROL);
//				rc.keyPress(KeyEvent.VK_V);
//				Thread.sleep(2000);
//				rc.keyRelease(KeyEvent.VK_CONTROL);
//				rc.keyRelease(KeyEvent.VK_V);
//				Thread.sleep(2000);
//				rc.keyPress(KeyEvent.VK_ENTER);
//				rc.keyRelease(KeyEvent.VK_ENTER);
//				Thread.sleep(2000);
//
//				writemessageField.click();
//				Thread.sleep(1000);
//				String message1 = "Image file message sent to the new API alarm user.";
//				act.sendKeys(message1).perform();
//				Thread.sleep(2000);
//
//				sendmessageButton.click();
//				expectedTitle = messageText.getText().split("\\n")[0].trim();
//				Assert.assertTrue(message1.contains(expectedTitle), RED + "Message not sent.");
//
//				System.out.println(GREEN + message1 + " sent successfuly ");
//
//				/* -------- PDF ATTACHMENT -------- */
//				Thread.sleep(1000);
//				act.moveToElement(attachFile).click().perform();
//				Thread.sleep(1000);
//
//				StringSelection ss1 = new StringSelection(
//						"C:\\Users\\BHUPESH\\Desktop\\SampleFiles\\Automation\\sample_pdf.pdf");
//				Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss1, null);
//
//				Thread.sleep(2000);
//				rc.keyPress(KeyEvent.VK_CONTROL);
//				rc.keyPress(KeyEvent.VK_V);
//				Thread.sleep(2000);
//				rc.keyRelease(KeyEvent.VK_CONTROL);
//				rc.keyRelease(KeyEvent.VK_V);
//				Thread.sleep(2000);
//				rc.keyPress(KeyEvent.VK_ENTER);
//				rc.keyRelease(KeyEvent.VK_ENTER);
//				Thread.sleep(2000);
//
//				writemessageField.click();
//				Thread.sleep(1000);
//				String message2 = "Pdf file message sent to the new API alarm user.";
//				act.sendKeys(message2).perform();
//				Thread.sleep(2000);
//				sendmessageButton.click();
//				Thread.sleep(2000);
//
//				sendmessageButton.click();
//				expectedTitle = messageText.getText().split("\\n")[0].trim();
//				Assert.assertTrue(message2.contains(expectedTitle), RED + "Message not sent.");
//
//				System.out.println(GREEN + message2 + " sent successfuly ");
//
//				/* -------- WORD FILE ATTACHMENT -------- */
//				Thread.sleep(1000);
//				act.moveToElement(attachFile).click().perform();
//				Thread.sleep(1000);
//
//				StringSelection ss2 = new StringSelection(
//						"C:\\Users\\BHUPESH\\Desktop\\SampleFiles\\Automation\\sample_WordFile.docx");
//				Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss2, null);
//
//				Thread.sleep(2000);
//				rc.keyPress(KeyEvent.VK_CONTROL);
//				rc.keyPress(KeyEvent.VK_V);
//				Thread.sleep(2000);
//				rc.keyRelease(KeyEvent.VK_CONTROL);
//				rc.keyRelease(KeyEvent.VK_V);
//				Thread.sleep(2000);
//				rc.keyPress(KeyEvent.VK_ENTER);
//				rc.keyRelease(KeyEvent.VK_ENTER);
//				Thread.sleep(2000);
//
//				writemessageField.click();
//				Thread.sleep(1000);
//				String message3 = "Word file message sent to the new API alarm user.";
//				act.sendKeys(message3).perform();
//				Thread.sleep(2000);
//				sendmessageButton.click();
//
//				expectedTitle = messageText.getText().split("\\n")[0].trim();
//				Assert.assertTrue(message3.contains(expectedTitle), RED + "Message not sent.");
//
//				System.out.println(GREEN + message3 + " sent successfuly ");
//
//				break;
//
//			}

			Thread.sleep(2000);
			textarea.click();
			Thread.sleep(1000);
			String messageText = "Text message sent to the new API alarm user.";
			act.sendKeys(messageText).perform();
			Thread.sleep(1000);
			sendButton.click();
			Thread.sleep(1000);
			String expTextmessage = textMessage.getText();

			Assert.assertTrue(messageText.contains(expTextmessage), RED + "Message not sent.");

			System.out.println(GREEN + messageText + " sent successfuly ");
			Thread.sleep(1000);

			// image`

//			chatAttachment.click();
//			Thread.sleep(1000);
//
//			StringSelection ss = new StringSelection(
//					"C:\\Users\\BHUPESH\\Desktop\\SampleFiles\\Automation\\sample_image.png");
//			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
//
//			Robot rc = new Robot();
//			Thread.sleep(2000);
//			rc.keyPress(KeyEvent.VK_CONTROL);
//			rc.keyPress(KeyEvent.VK_V);
//			Thread.sleep(2000);
//			rc.keyRelease(KeyEvent.VK_CONTROL);
//			rc.keyRelease(KeyEvent.VK_V);
//			Thread.sleep(2000);
//			rc.keyPress(KeyEvent.VK_ENTER);
//			rc.keyRelease(KeyEvent.VK_ENTER);
//			Thread.sleep(2000);
//
//			textarea.click();
//			Thread.sleep(1000);
//			String imageText = "Image file & text sent to the new API alarm user.";
//			act.sendKeys(imageText).perform();
//			Thread.sleep(1000);
//			sendButton.click();
//			Thread.sleep(2000);
//
//			boolean isImageDisplay = uploadedImage.isDisplayed();
//
//			Assert.assertTrue(isImageDisplay, RED + "Image and text are not attached to the chat.");
//
//			System.out.println(GREEN + imageText);
//			Thread.sleep(1000);
//
//			// pdf
//
//			chatAttachment.click();
//			Thread.sleep(1000);
//
//			StringSelection ss1 = new StringSelection(
//					"C:\\Users\\BHUPESH\\Desktop\\SampleFiles\\Automation\\sample_pdf.pdf");
//			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss1, null);
//
//			Thread.sleep(2000);
//			rc.keyPress(KeyEvent.VK_CONTROL);
//			rc.keyPress(KeyEvent.VK_V);
//			Thread.sleep(2000);
//			rc.keyRelease(KeyEvent.VK_CONTROL);
//			rc.keyRelease(KeyEvent.VK_V);
//			Thread.sleep(2000);
//			rc.keyPress(KeyEvent.VK_ENTER);
//			rc.keyRelease(KeyEvent.VK_ENTER);
//			Thread.sleep(2000);
//
//			textarea.click();
//			Thread.sleep(1000);
//			String pdfText = "Pdf file & message sent to the new API alarm user.";
//			act.sendKeys(pdfText).perform();
//			Thread.sleep(1000);
//			sendButton.click();
//			Thread.sleep(2000);
//
//			boolean isPdfAvailable = uploadedPdf.isDisplayed();
//
//			Assert.assertTrue(isPdfAvailable, RED + "Pdf and text are not attached to the chat.");
//
//			System.out.println(GREEN + pdfText);
//			Thread.sleep(1000);
//
//			// WordFile
//			chatAttachment.click();
//			Thread.sleep(1000);
//
//			StringSelection ss2 = new StringSelection(
//					"C:\\Users\\BHUPESH\\Desktop\\SampleFiles\\Automation\\sample_WordFile.docx");
//			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss2, null);
//
//			Thread.sleep(2000);
//			rc.keyPress(KeyEvent.VK_CONTROL);
//			rc.keyPress(KeyEvent.VK_V);
//			Thread.sleep(2000);
//			rc.keyRelease(KeyEvent.VK_CONTROL);
//			rc.keyRelease(KeyEvent.VK_V);
//			Thread.sleep(2000);
//			rc.keyPress(KeyEvent.VK_ENTER);
//			rc.keyRelease(KeyEvent.VK_ENTER);
//			Thread.sleep(2000);
//
//			textarea.click();
//			Thread.sleep(1000);
//			String wordText1 = "Word file & text sent to the new API alarm user.";
//			act.sendKeys(wordText1).perform();
//			Thread.sleep(1000);
//			sendButton.click();
//			Thread.sleep(2000);
//
//			boolean isWorrdFileAvailable = uploadedWordFile.isDisplayed();
//
//			Assert.assertTrue(isWorrdFileAvailable, RED + "Pdf and text are not attached to the chat.");
//
//			System.out.println(GREEN + wordText1);
//			Thread.sleep(1000);
//
//			// XLc
//			chatAttachment.click();
//			Thread.sleep(1000);
//
//			StringSelection ss3 = new StringSelection(
//					"C:\\Users\\BHUPESH\\Desktop\\SampleFiles\\Automation\\sample_XLS.xls");
//			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss3, null);
//
//			Thread.sleep(2000);
//			rc.keyPress(KeyEvent.VK_CONTROL);
//			rc.keyPress(KeyEvent.VK_V);
//			Thread.sleep(2000);
//			rc.keyRelease(KeyEvent.VK_CONTROL);
//			rc.keyRelease(KeyEvent.VK_V);
//			Thread.sleep(2000);
//			rc.keyPress(KeyEvent.VK_ENTER);
//			rc.keyRelease(KeyEvent.VK_ENTER);
//			Thread.sleep(2000);
//
//			textarea.click();
//			Thread.sleep(1000);
//			String xlsText = "Xls file & text sent to the new API alarm user.";
//			act.sendKeys(wordText1).perform();
//			Thread.sleep(1000);
//			sendButton.click();
//			Thread.sleep(2000);
//
//			boolean isXlsFileAvailable = uploadedXls.isDisplayed();
//
//			Assert.assertTrue(isXlsFileAvailable, RED + "Pdf and text are not attached to the chat.");
//
//			System.out.println(GREEN + xlsText);
//			Thread.sleep(1000);

		}

		else {
			refreshFilter.click();
			System.out.println(RED + "chat option not found.");
		}

	}

	public void manualAlarmByOldEsclationTemplateFromSt02ToSt01(WebDriver driver, String st2Esc1t1,
			String TemplateAlarmTitle) throws Throwable {

		Actions act = new Actions(driver);

		Thread.sleep(2000);
		createNewButton.click();
		Thread.sleep(2000);

		templateField.click();
		Thread.sleep(2000);

		act.sendKeys(st2Esc1t1).perform();
		Thread.sleep(2000);

		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);

		user$resource.click();
		Thread.sleep(2000);

		generateAlarm.click();
		Thread.sleep(2000);

		yesCreate.click();
		Thread.sleep(5000);
		String title = TemplateAlarmTitle;
		String expectedTitle = firstItemTitle.getText();
//		

		expectedTitle = expectedTitle.replace("...", "").trim();
		title = title.replace("...", "").trim();
//		
//		System.out.println(title);
//		System.out.println(expectedTitle);

		Assert.assertTrue(title.contains(expectedTitle), RED + "Alarm not created.");

		System.out.println(GREEN + title);

	}

	public void manualaByAttributeExtend1To01StEscResourceFrom02(WebDriver driver, String st02N, String gTodaysDate,
			String gtimeHHMMSS, String st02V1, String st02A1, String st01N, String branchName, String st01R1,
			String filePath) throws Throwable {
		Actions act = new Actions(driver);

		// Create new alarm
		createNewButton.click();
		Thread.sleep(2000);

		fireStationField.click();
		Thread.sleep(500);
		act.sendKeys(st02N).perform();
		Thread.sleep(500);
		act.sendKeys(Keys.ENTER).perform();

		// Alarm details
		alarmKeyword.click();
		String title = "BG-C MA by attribute for extend-" + gTodaysDate + "_" + gtimeHHMMSS;
		act.sendKeys(title).perform();

		alarmImage.click();
		act.sendKeys("Image-manual alarm by attribute for extend.").perform();

		descriptionField.click();
		act.sendKeys("checking manual alarm created by attribute for extend.").perform();

		// Reporter details
		reporter.click();
		Thread.sleep(1000);

		reporterName.click();
		act.sendKeys("Dr. Sumit").perform();

		reporterStreet.click();
		act.sendKeys("Kharbi Road, Nagpur").perform();

		reporterZipCode.click();
		act.sendKeys("440009").perform();

		act.moveToElement(reporterMobileNo).click().perform();
		Thread.sleep(500);

		reporterMobileNo.click();
		act.sendKeys("1122334455").perform();

		reporterCallback.click();
		act.sendKeys("10").perform();

		// Incident details
		Robot robot = new Robot();

		act.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).sendKeys(Keys.TAB).perform();

		act.sendKeys("fire at hospital.").perform();

		act.sendKeys(Keys.TAB).sendKeys(Keys.TAB).perform();

		Thread.sleep(500);
		robot.mouseWheel(5);
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);

		// Address
		alarmAddress.click();
		act.sendKeys("BAPS Swaminarayan mandir, Wathoda Layout, Nagpur, Maharashtra 440035").perform();

		// Tab navigation
//		for (int i = 0; i <= 9; i++) {
//			act.sendKeys(Keys.TAB).perform();
//		}

		// Additional address information
//		additionalAddressInformation.click();
		act.moveToElement(additionalAddressInformation).click().perform();

		alarmObject.click();
		act.sendKeys("hospital").perform();

		alarmFloor.click();
		act.sendKeys("ground floor").perform();

		alarmAnnotation.click();
		act.sendKeys("alarm annotation").perform();

		act.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();

		Thread.sleep(2000);

		// Attribute selection
		userTypeAttribute.click();
		Thread.sleep(500);

		vehicleField1.click();
		Thread.sleep(500);
		act.sendKeys(st02V1).perform();
		Thread.sleep(500);
		act.sendKeys(Keys.ENTER).perform();

		attributeField.click();
		act.sendKeys(st02A1).perform();
		Thread.sleep(1000);
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(1000);

		Thread.sleep(500);
		act.sendKeys(Keys.TAB).perform();
		Thread.sleep(500);

		// Generate alarm
		generateAlarm.click();
		Thread.sleep(500);
		yesCreate.click();
		Thread.sleep(5000);

		String expectedTitle = firstItemTitle.getText();
		expectedTitle = expectedTitle.replace("...", "").trim();
		title = title.replace("...", "").trim();

		Assert.assertTrue(title.contains(expectedTitle), RED + "Alarm not added.");

		System.out.println(GREEN + "Alarm created.");

		// Search created alarm
		titleSearch.click();
		Thread.sleep(500);

		titleSearchField.click();
		Thread.sleep(500);
		act.sendKeys(title).perform();

		Thread.sleep(1000);
		titleSearchFieldOk.click();
		Thread.sleep(2000);

		// Extend alarm
		act.moveToElement(action).build().perform();
		Thread.sleep(1000);

		action.click();
		Thread.sleep(1000);
		addExtension.click();
		Thread.sleep(2000);

		extendStation.click();
		Thread.sleep(1000);
		act.sendKeys(st01N).perform();
		Thread.sleep(1000);
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(1000);

		userTypeResource.click();
		Thread.sleep(3000);

		act.sendKeys(Keys.TAB).perform();
		Thread.sleep(1000);
		act.sendKeys(st01R1).perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(1000);

		additionalFields.click();
		Thread.sleep(1000);
		act.sendKeys("alarm Additional Information 1").perform();

		Thread.sleep(2000);
		saveExtendAlarm.click();
		Thread.sleep(2000);
		yesExtendAlarm.click();
		Thread.sleep(2000);

		// Refresh
		refreshFilter.click();
		Thread.sleep(2000);

		FileInputStream in = new FileInputStream(filePath);
		XSSFWorkbook wb = new XSSFWorkbook(in);
		XSSFSheet sheet = wb.getSheetAt(0);

		Row row = sheet.createRow(29);
		row.createCell(1).setCellValue(title); // Cell B

		in.close();

		FileOutputStream out = new FileOutputStream(filePath);
		wb.write(out);
		out.close();
		wb.close();

		Thread.sleep(5000);

		titleSearch.click();
		Thread.sleep(500);

		titleSearchField.click();
		Thread.sleep(500);
		act.sendKeys(title).perform();

		Thread.sleep(1000);
		titleSearchFieldOk.click();
		Thread.sleep(2000);

		bgAlarm.click();
		Thread.sleep(3000);

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].scrollIntoView(true);", secondStataionTab);
		Thread.sleep(3000);

		secondStataionTab.click();
		Thread.sleep(3000);

		js.executeScript("arguments[0].scrollIntoView(true);", ffAtribute);
		Thread.sleep(2000);

		switch (branchName) {
		case "1":
			try {
				if (jonas2.isDisplayed()) {
					System.out.println(GREEN + "Extended user visible,Alarm Extended successfully.");
				}
			} catch (Exception e) {
				System.out.println(RED + "User not found means alarm not extended.");
			}
			break;

		case "1.1":
			try {
				if (jonas2.isDisplayed()) {
					System.out.println(GREEN + "Extended user visible,Alarm Extended successfully.");
				}
			} catch (Exception e) {
				System.out.println(RED + "User not found means alarm not extended.");
			}
			break;

		case "2":
			try {
				if (bhupeshTest.isDisplayed()) {
					System.out.println(GREEN + "Extended user visible,Alarm Extended successfully.");
				}
			} catch (Exception e) {
				System.out.println(RED + "User not found means alarm not extended.");
			}
			break;

		default:
			System.out.println(RED + "Invalid branch");
		}

	}

	public void ManualAlarForCheckExtendAlarmCall(WebDriver driver, String st02N, String gTodaysDate,
			String gtimeHHMMSS, String st02V1, String st02A1, String st01N, String branchName,
			String st01AttributeCallSmsEmail) throws Throwable {
		Actions act = new Actions(driver);

		// Create new alarm
		createNewButton.click();
		Thread.sleep(100);

		fireStationField.click();
		Thread.sleep(500);
		act.sendKeys(st02N).perform();
		Thread.sleep(500);
		act.sendKeys(Keys.ENTER).perform();

		// Alarm details
		alarmKeyword.click();
		String title = "BG-MA by Attribute to check direct and fallback calls, SMS, and emails for extend alarm.-"
				+ gTodaysDate + "_" + gtimeHHMMSS;
		act.sendKeys(title).perform();

		alarmImage.click();
		act.sendKeys("Image-manual alarm by attribute for extend.").perform();

		descriptionField.click();
		act.sendKeys("Verify direct and fallback calls, SMS, and emails for Extend Manual Alarms created from Web.")
				.perform();

		// Reporter details
		reporter.click();
		Thread.sleep(1000);

		reporterName.click();
		act.sendKeys("Dr. Sumit").perform();

		reporterStreet.click();
		act.sendKeys("Kharbi Road, Nagpur").perform();

		reporterZipCode.click();
		act.sendKeys("440009").perform();

		act.moveToElement(reporterMobileNo).click().perform();
		Thread.sleep(500);

		reporterMobileNo.click();
		act.sendKeys("1122334455").perform();

		reporterCallback.click();
		act.sendKeys("10").perform();

		// Incident details
		Robot robot = new Robot();

		act.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).sendKeys(Keys.TAB).perform();

		act.sendKeys("fire at hospital.").perform();

		act.sendKeys(Keys.TAB).sendKeys(Keys.TAB).perform();

		Thread.sleep(500);
		robot.mouseWheel(5);
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);

		// Address
		alarmAddress.click();
		act.sendKeys("BAPS Swaminarayan mandir, Wathoda Layout, Nagpur, Maharashtra 440035").perform();

		// Tab navigation
//		for (int i = 0; i <= 9; i++) {
//			act.sendKeys(Keys.TAB).perform();
//		}

		// Additional address information
//		additionalAddressInformation.click();
		act.moveToElement(additionalAddressInformation).click().perform();

		alarmObject.click();
		act.sendKeys("hospital").perform();

		alarmFloor.click();
		act.sendKeys("ground floor").perform();

		alarmAnnotation.click();
		act.sendKeys("alarm annotation").perform();

		act.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();

		Thread.sleep(2000);

		// Attribute selection
		userTypeAttribute.click();
		Thread.sleep(500);

		vehicleField1.click();
		Thread.sleep(500);
		act.sendKeys(st02V1).perform();
		Thread.sleep(500);
		act.sendKeys(Keys.ENTER).perform();

		attributeField.click();
		act.sendKeys(st02A1).perform();
		Thread.sleep(1000);
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(1000);

		Thread.sleep(500);
		act.sendKeys(Keys.TAB).perform();
		Thread.sleep(500);

		// Generate alarm
		generateAlarm.click();
		Thread.sleep(500);
		yesCreate.click();
		Thread.sleep(5000);

		String expectedTitle = firstItemTitle.getText();
//		System.out.println(title);
//		System.out.println(expectedTitle);

		Assert.assertTrue(title.contains(expectedTitle.replace("...", "")), "Alarm not added.");

		System.out.println(GREEN + "Alarm created.");

		// Search created alarm
		titleSearch.click();
		Thread.sleep(500);

		titleSearchField.click();
		Thread.sleep(500);
		act.sendKeys(title).perform();

		Thread.sleep(1000);
		titleSearchFieldOk.click();
		Thread.sleep(2000);

		// Extend alarm
		act.moveToElement(action).click().build().perform();
		Thread.sleep(1000);

//		action.click();

		act.moveToElement(addExtension).click().build().perform();
		Thread.sleep(1000);
//		addExtension.click();
//		Thread.sleep(2000);

		extendStation.click();
		Thread.sleep(1000);
		act.sendKeys(st01N).perform();
		Thread.sleep(1000);
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(1000);

		userTypeAttribute.click();
		Thread.sleep(2000);

		selectAttributes.click();
		Thread.sleep(1000);

		act.sendKeys(st01AttributeCallSmsEmail).perform();
		Thread.sleep(1000);
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(1000);

		additionalFields.click();
		Thread.sleep(1000);
		act.sendKeys("Attribute added to check call sms and email for extend alarm.").perform();

		Thread.sleep(2000);
		saveExtendAlarm.click();
		Thread.sleep(2000);
		yesExtendAlarm.click();
		Thread.sleep(2000);

		// Refresh
		refreshFilter.click();
		Thread.sleep(2000);

	}

	public void manualAlarmByEscResourceMS(WebDriver driver, String st02N, String gTodaysDate, String gtimeHHMMSS,
			String st02REsc) throws Throwable {

		Actions act = new Actions(driver);

		// Create new alarm
		createNewButton.click();
		Thread.sleep(1000);

		// Fire station selection
		fireStationField.click();
		Thread.sleep(500);
		act.sendKeys(st02N).perform();
		Thread.sleep(500);
		act.sendKeys(Keys.ENTER).perform();

		// Alarm details
		alarmKeyword.click();
		String title = "BG-C MA by Esc resource MS-" + gTodaysDate + "_" + gtimeHHMMSS;
		act.sendKeys(title).perform();

		alarmImage.click();
		act.sendKeys("Image-manual alarm by escalation resource MS").perform();

		descriptionField.click();
		act.sendKeys("Checking manual alarm by escalation resource MS").perform();

		// Priority
		priority.click();
		Thread.sleep(500);

		// Reporter details
		reporter.click();
		Thread.sleep(1000);

		reporterName.click();
		act.sendKeys("Dr. Nikhil").perform();

		reporterStreet.click();
		act.sendKeys("Kharbi Road, Nagpur").perform();

		reporterZipCode.click();
		act.sendKeys("440009").perform();

		act.moveToElement(reporterMobileNo).click().perform();
		Thread.sleep(500);

		reporterMobileNo.click();
		act.sendKeys("1122334455").perform();

		reporterCallback.click();
		act.sendKeys("10").perform();

		// Incident details
		Robot robot = new Robot();

		act.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).sendKeys(Keys.TAB).perform();

		act.sendKeys("fire at hospital.").perform();

		act.sendKeys(Keys.TAB).sendKeys(Keys.TAB).perform();

		Thread.sleep(500);
		robot.mouseWheel(5);
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);

		// Address
		alarmAddress.click();
		act.sendKeys("Tapasya Vidya Mandir, 4446+52G, Vinkar Colony, Manewada, Nagpur, Maharashtra 440024").perform();

		// Tab navigation
//		for (int i = 0; i <= 9; i++) {
//			act.sendKeys(Keys.TAB).perform();
//		}

		// Additional address info
//		additionalAddressInformation.click();
		act.moveToElement(additionalAddressInformation).click().perform();

		alarmObject.click();
		act.sendKeys("hospital").perform();

		alarmFloor.click();
		act.sendKeys("ground floor").perform();

		alarmAnnotation.click();
		act.sendKeys("alarm annotation").perform();

		act.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();

		Thread.sleep(1000);

		// Resource selection (Escalation)
		userTypeResource.click();
		Thread.sleep(1000);

		resourceField1.click();
		Thread.sleep(500);

		act.sendKeys(st02REsc).perform();
		Thread.sleep(500);
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(500);
		act.sendKeys(Keys.TAB).perform();
		Thread.sleep(500);

		// Generate alarm
		generateAlarm.click();
		Thread.sleep(1000);
		yesCreate.click();
		Thread.sleep(2000);

		String expectedTitle = firstItemTitle.getText();
		expectedTitle = expectedTitle.replace("...", "").trim();
		title = title.replace("...", "").trim();

		Assert.assertTrue(title.contains(expectedTitle), RED + "Alarm not added.");

		System.out.println(GREEN + title);

	}

	public void manualAlarmByEscResourceSingleStation(WebDriver driver, String st01N, String gTodaysDate,
			String gtimeHHMMSS, String st01REsc) throws Throwable {

		Actions act = new Actions(driver);

		// Create new alarm
		createNewButton.click();
		Thread.sleep(500);

		// Fire station selection
		fireStationField.click();
		Thread.sleep(100);

		act.sendKeys(st01N).perform();
		Thread.sleep(500);
		act.sendKeys(Keys.ENTER).perform();

		// Alarm details
		alarmKeyword.click();
		String title = "BG-MA by Esc resource SS-" + gTodaysDate + "_" + gtimeHHMMSS;

		act.sendKeys(title).perform();

		alarmImage.click();
		act.sendKeys("Image-manual alarm by escalation resource SS").perform();

		descriptionField.click();
		act.sendKeys("Checking manual alarm by escalation resource SS").perform();

		Thread.sleep(2000);

		// Reporter details
		reporter.click();
		Thread.sleep(1000);

		reporterName.click();
		act.sendKeys("Dr. Nikhil").perform();

		reporterStreet.click();
		act.sendKeys("Kharbi Road, Nagpur").perform();

		reporterZipCode.click();
		act.sendKeys("440009").perform();

		act.moveToElement(reporterMobileNo).click().perform();
		Thread.sleep(500);

		reporterMobileNo.click();
		act.sendKeys("1122334455").perform();

		reporterCallback.click();
		act.sendKeys("10").perform();

		// Incident details
		Robot robot = new Robot();

		act.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).sendKeys(Keys.TAB).perform();

		act.sendKeys("fire at hospital.").perform();

		act.sendKeys(Keys.TAB).sendKeys(Keys.TAB).perform();

		Thread.sleep(500);
		robot.mouseWheel(5);
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);

		// Address
		alarmAddress.click();
		act.sendKeys("Tapasya Vidya Mandir, 4446+52G, Vinkar Colony, Manewada, Nagpur, Maharashtra 440024").perform();

		// Tab navigation
//		for (int i = 0; i <= 9; i++) {
//			act.sendKeys(Keys.TAB).perform();
//		}

		// Additional address info
//		additionalAddressInformation.click();
		act.moveToElement(additionalAddressInformation).click().perform();

		alarmObject.click();
		act.sendKeys("hospital").perform();

		alarmFloor.click();
		act.sendKeys("ground floor").perform();

		alarmAnnotation.click();
		act.sendKeys("alarm annotation").perform();

		act.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();

		Thread.sleep(2000);

		// Resource selection (Escalation)
		userTypeResource.click();
		Thread.sleep(1000);

		resourceField1.click();
		Thread.sleep(500);

		act.sendKeys(st01REsc).perform();
		Thread.sleep(500);
		act.sendKeys(Keys.ENTER).perform();

		Thread.sleep(500);
		act.sendKeys(Keys.TAB).perform();
		Thread.sleep(500);

		// Generate alarm
		generateAlarm.click();
		Thread.sleep(1000);
		yesCreate.click();
		Thread.sleep(2000);

//			
		String expectedTitle = firstItemTitle.getText();
		expectedTitle = expectedTitle.replace("...", "").trim();
		title = title.replace("...", "").trim();

		Assert.assertTrue(title.contains(expectedTitle), RED + "Alarm not added.");

		System.out.println(GREEN + title);

	}

	public void ManualAlarForCheckEscalationAlarmCall(WebDriver driver, String st01N, String gTodaysDate,
			String gtimeHHMMSS, String st01EscalarionResourceCallSmsEmail) throws Throwable {

		Actions act = new Actions(driver);

		// Create new alarm
		createNewButton.click();
		Thread.sleep(500);

		// Fire station selection
		fireStationField.click();
		Thread.sleep(100);

		act.sendKeys(st01N).perform();
		Thread.sleep(500);
		act.sendKeys(Keys.ENTER).perform();

		// Alarm details
		alarmKeyword.click();
		String title = "BG-MA by Esclation resource to check direct and fallback calls, SMS, and emails.-" + gTodaysDate
				+ "_" + gtimeHHMMSS;

		act.sendKeys(title).perform();

		alarmImage.click();
		act.sendKeys("Image-MA by Esclation resource to check direct and fallback calls, SMS, and emails").perform();

		descriptionField.click();
		act.sendKeys(
				"Verifying Manual Alarm with escalation resource to check direct and fallback calls, SMS, and emails.")
				.perform();

		Thread.sleep(2000);

		// Reporter details
		reporter.click();
		Thread.sleep(1000);

		reporterName.click();
		act.sendKeys("Dr. Nikhil").perform();

		reporterStreet.click();
		act.sendKeys("Kharbi Road, Nagpur").perform();

		reporterZipCode.click();
		act.sendKeys("440009").perform();

		act.moveToElement(reporterMobileNo).click().perform();
		Thread.sleep(500);

		reporterMobileNo.click();
		act.sendKeys("1122334455").perform();

		reporterCallback.click();
		act.sendKeys("10").perform();

		// Incident details
		Robot robot = new Robot();

		act.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).sendKeys(Keys.TAB).perform();

		act.sendKeys("fire at hospital.").perform();

		act.sendKeys(Keys.TAB).sendKeys(Keys.TAB).perform();

		Thread.sleep(500);
		robot.mouseWheel(5);
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);

		// Address
		alarmAddress.click();
		act.sendKeys("Tapasya Vidya Mandir, 4446+52G, Vinkar Colony, Manewada, Nagpur, Maharashtra 440024").perform();

		// Tab navigation
//		for (int i = 0; i <= 9; i++) {
//			act.sendKeys(Keys.TAB).perform();
//		}
//
//		// Additional address info
//		additionalAddressInformation.click();
		act.moveToElement(additionalAddressInformation).click().perform();

		alarmObject.click();
		act.sendKeys("hospital").perform();

		alarmFloor.click();
		act.sendKeys("ground floor").perform();

		alarmAnnotation.click();
		act.sendKeys("alarm annotation").perform();

		act.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();

		Thread.sleep(2000);

		// Resource selection (Escalation)
		userTypeResource.click();
		Thread.sleep(1000);

		resourceField1.click();
		Thread.sleep(500);

		act.sendKeys(st01EscalarionResourceCallSmsEmail).perform();
		Thread.sleep(1000);
		act.sendKeys(Keys.ENTER).perform();

		Thread.sleep(500);
		act.sendKeys(Keys.TAB).perform();
		Thread.sleep(500);

		// Generate alarm
		generateAlarm.click();
		Thread.sleep(1000);
		yesCreate.click();
		Thread.sleep(2000);

		String expectedTitle = firstItemTitle.getText();
//		System.out.println(expectedTitle);
//		System.out.println(title);
		expectedTitle = expectedTitle.replace("...", "").trim();
		title = title.replace("...", "").trim();

		Assert.assertTrue(title.contains(expectedTitle), RED + "Alarm not added.");

		System.out.println(GREEN + title);

	}

	public void manualaByAttributeMSLP(WebDriver driver, String st01N, String st02N, String gTodaysDate,
			String gtimeHHMMSS, String st01V1, String st01V2, String st02V1, String st01A1, String st02A1)
			throws Throwable {

		Actions act = new Actions(driver);

		// Create new alarm
		createNewButton.click();
		Thread.sleep(2000);

		// Fire station selection (multiple)
		fireStationField.click();
		Thread.sleep(500);

		act.sendKeys(st01N).perform();
		Thread.sleep(1000);
		act.sendKeys(Keys.ENTER).perform();

		Thread.sleep(1000);
		act.sendKeys(st02N).perform();
		Thread.sleep(1000);
		act.sendKeys(Keys.ENTER).perform();

		// Alarm details
		alarmKeyword.click();
		String title = "BG-MA by attribute-" + gTodaysDate + "_" + gtimeHHMMSS;
		act.sendKeys(title).perform();

		alarmImage.click();
		act.sendKeys("Image-manual alarm by checking.").perform();

		descriptionField.click();
		act.sendKeys("BG-manual alarm by attribute checking.").perform();

		// Priority
		priority.click();
		Thread.sleep(500);

		// Reporter details
		reporter.click();
		Thread.sleep(500);

		reporterName.click();
		act.sendKeys("Dr. Sumit Raghute").perform();

		reporterStreet.click();
		act.sendKeys("Kharbi Road, Nagpur").perform();

		reporterZipCode.click();
		act.sendKeys("440009").perform();

		act.moveToElement(reporterMobileNo).click().perform();
		Thread.sleep(500);

		reporterMobileNo.click();
		act.sendKeys("1122334455").perform();

		reporterCallback.click();
		act.sendKeys("10").perform();

		// Incident details
		Robot robot = new Robot();

		act.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).sendKeys(Keys.TAB).perform();

		act.sendKeys("fire at hospital.").perform();

		act.sendKeys(Keys.TAB).sendKeys(Keys.TAB).perform();

		Thread.sleep(500);
		robot.mouseWheel(5);
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);

		// Address
		alarmAddress.click();
		act.sendKeys("BAPS Swaminarayan mandir, Wathoda Layout, Nagpur, Maharashtra 440035").perform();

		// Tab navigation
//		for (int i = 0; i <= 9; i++) {
//			act.sendKeys(Keys.TAB).perform();
//		}
//
//		// Additional address info
//		additionalAddressInformation.click();
		act.moveToElement(additionalAddressInformation).click().perform();

		alarmObject.click();
		act.sendKeys("hospital").perform();

		alarmFloor.click();
		act.sendKeys("ground floor").perform();

		alarmAnnotation.click();
		act.sendKeys("alarm annotation").perform();

		act.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();

		Thread.sleep(2000);

		// Attribute selection
		userTypeAttribute.click();
		Thread.sleep(2000);

		vehicleField1.click();
		Thread.sleep(500);

		// Vehicle 1
		act.sendKeys(st01V1).perform();
		Thread.sleep(500);
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(1000);
//		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).perform();

		act.sendKeys(Keys.HOME).perform();

		for (int d = 0; d <= 15; d++) {
			act.sendKeys(Keys.DELETE).perform();

		}

		// Vehicle 2
		act.sendKeys(st01V2).perform();
		Thread.sleep(500);
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(1000);
//		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).perform();

		act.sendKeys(Keys.HOME).perform();
		for (int d = 0; d <= 15; d++) {
			act.sendKeys(Keys.DELETE).perform();

		}

		// Vehicle 3
		act.sendKeys(st02V1).perform();
		Thread.sleep(500);
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(1000);

		// Attribute selection
		attributeField.click();

		act.sendKeys(st01A1).perform();
		Thread.sleep(500);
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(1000);
//		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).perform();

		act.sendKeys(Keys.HOME).perform();
		for (int d = 0; d <= 15; d++) {
			act.sendKeys(Keys.DELETE).perform();

		}

		act.sendKeys(st02A1).perform();
		Thread.sleep(500);
		act.sendKeys(Keys.ENTER).perform();

		Thread.sleep(500);
		act.sendKeys(Keys.TAB).perform();
		Thread.sleep(500);

		// Generate alarm
//		saveTestAlarm.click();

		generateAlarm.click();
		Thread.sleep(500);
		yesCreate.click();
		Thread.sleep(2000);

		String expectedTitle = firstItemTitle.getText();

		expectedTitle = expectedTitle.replace("...", "").trim();
		title = title.replace("...", "").trim();

		Assert.assertTrue(title.contains(expectedTitle), RED + "Alarm not added.");

		System.out.println(GREEN + title);

	}

	public void manualaByAttributeSingleStation(WebDriver driver, String st01N, String gTodaysDate, String gtimeHHMMSS,
			String st01V1, String st01V2, String st01A1) throws Throwable {

		Actions act = new Actions(driver);
		Robot robot = new Robot();

		// Create new alarm
		Thread.sleep(2000);
		createNewButton.click();

		Thread.sleep(2000);
		fireStationField.click();

		Thread.sleep(2000);
		act.sendKeys(st01N).perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).perform();

		// Alarm keyword
		alarmKeyword.click();
		String title = "BG-MA by attribute-" + gTodaysDate + "_" + gtimeHHMMSS;
		act.sendKeys(title).perform();

		// Image & description
		alarmImage.click();
		act.sendKeys("Image-manual alarm by attribute checking.").perform();

		descriptionField.click();
		act.sendKeys("BG-manual alarm by attribute checking.").perform();

		// Reporter details
		Thread.sleep(2000);
		reporter.click();

		Thread.sleep(2000);
		reporterName.click();
		act.sendKeys("Dr. Sumit Raghute").perform();

		reporterStreet.click();
		act.sendKeys("Kharbi Road, Nagpur").perform();

		reporterZipCode.click();
		act.sendKeys("440009").perform();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		act.moveToElement(reporterMobileNo).click().perform();
		Thread.sleep(500);

		reporterMobileNo.click();
		act.sendKeys("1122334455").perform();

		reporterCallback.click();
		act.sendKeys("10").perform();

		// Incident text
		act.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).sendKeys(Keys.TAB).perform();

		act.sendKeys("fire at hospital.").perform();

		act.sendKeys(Keys.TAB).sendKeys(Keys.TAB).perform();

		Thread.sleep(500);
		robot.mouseWheel(5);
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);

		// Address
		alarmAddress.click();
		act.sendKeys("BAPS Swaminarayan mandir, Wathoda Layout, Nagpur, Maharashtra 440035").perform();

		act.moveToElement(additionalAddressInformation).click().perform();

		alarmObject.click();
		act.sendKeys("hospital").perform();

		alarmFloor.click();
		act.sendKeys("ground floor").perform();

		alarmAnnotation.click();
		act.sendKeys("alarm annotation").perform();

		act.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();

		// Attribute & vehicle selection
		Thread.sleep(2000);
		userTypeAttribute.click();

		Thread.sleep(2000);
		vehicleField1.click();

		// Vehicle 1
		act.sendKeys(st01V1).perform();
		Thread.sleep(1000);
		act.sendKeys(Keys.ENTER).perform();

		Thread.sleep(1000);
		act.sendKeys(Keys.HOME).perform();

		for (int d = 0; d <= 20; d++) {
			act.sendKeys(Keys.DELETE).perform();

		}

		// Vehicle 2
		Thread.sleep(1000);
		act.sendKeys(st01V2).perform();
		Thread.sleep(1000);
		act.sendKeys(Keys.ENTER).perform();

		Thread.sleep(1000);
		act.sendKeys(Keys.HOME).perform();

		for (int d = 0; d <= 20; d++) {
			act.sendKeys(Keys.DELETE).perform();

		}

		// Attribute
		attributeField.click();
		Thread.sleep(1000);
		act.sendKeys(st01A1).perform();
		Thread.sleep(1000);
		act.sendKeys(Keys.ENTER).perform();

		Thread.sleep(1000);
		act.sendKeys(Keys.HOME).perform();

		for (int d = 0; d <= 15; d++) {
			act.sendKeys(Keys.DELETE).perform();

		}

		Thread.sleep(1000);

		act.sendKeys(Keys.TAB).perform();
		Thread.sleep(500);

		// Generate alarm
		generateAlarm.click();
		Thread.sleep(1000);
		yesCreate.click();
		Thread.sleep(5000);

		String expectedTitle = firstItemTitle.getText();

		expectedTitle = expectedTitle.replace("...", "").trim();
		title = title.replace("...", "").trim();

		Assert.assertTrue(title.contains(expectedTitle), RED + "Alarm not added.");

		System.out.println(GREEN + title);

	}

	public void manualAlarmByResourceMsHP(WebDriver driver, String st01N, String st02N, String gTodaysDate,
			String gtimeHHMMSS, String st01R1, String st01R2) throws Throwable {

		Actions act = new Actions(driver);
		Robot robot = new Robot();

		// Create new alarm
		createNewButton.click();
		Thread.sleep(1000);

		fireStationField.click();
		Thread.sleep(1000);

		// Select Fire Stations
		act.sendKeys(st01N).perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(500);

		act.sendKeys(st02N).perform();
		Thread.sleep(500);
		act.sendKeys(Keys.ENTER).perform();

		// Alarm details
		alarmKeyword.click();
		String title = "BG-MA by resource-" + gTodaysDate + "_" + gtimeHHMMSS;
		act.sendKeys(title).perform();

		alarmImage.click();
		act.sendKeys("Image-manual alarm by resource checking.").perform();

		descriptionField.click();
		act.sendKeys("BG-manual alarm by resource checking.").perform();

		// Reporter details
		reporter.click();
		Thread.sleep(500);

		reporterName.click();
		act.sendKeys("Dr. Sumit Raghute").perform();

		reporterStreet.click();
		act.sendKeys("Kharbi Road, Nagpur").perform();

		reporterZipCode.click();
		act.sendKeys("440009").perform();

		act.moveToElement(reporterMobileNo).click().perform();
		Thread.sleep(500);

		reporterMobileNo.click();
		act.sendKeys("1122334455").perform();

		reporterCallback.click();
		act.sendKeys("10").perform();
		Thread.sleep(500);

		// Incident details
		act.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).sendKeys(Keys.TAB).perform();

		act.sendKeys("fire at hospital.").perform();

		act.sendKeys(Keys.TAB).sendKeys(Keys.TAB).perform();

		Thread.sleep(500);
		robot.mouseWheel(5);
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);

		// Alarm address
		alarmAddress.click();
		act.sendKeys("YES Hospital, Plot no. 1 & 1A, Dighori Flyover Square, Dighori, Nagpur, Maharashtra 440017")
				.perform();

		Thread.sleep(200);

		act.moveToElement(additionalAddressInformation).perform();
		additionalAddressInformation.click();
		Thread.sleep(500);

		alarmObject.click();
		act.sendKeys("hospital").perform();

		alarmFloor.click();
		act.sendKeys("ground floor").perform();

		alarmAnnotation.click();
		act.sendKeys("alarm annotation").perform();
		Thread.sleep(1000);

		act.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();

		Thread.sleep(2000);

		// Resource selection
		userTypeResource.click();
		Thread.sleep(500);

		resourceField1.click();
		act.sendKeys(st01R1).perform();
		Thread.sleep(500);
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(500);

		resourceField2.click();
		act.sendKeys(st01R2).perform();
		Thread.sleep(500);
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(1000);

		act.sendKeys(Keys.TAB).perform();
		Thread.sleep(500);
		// Generate alarm
		generateAlarm.click();
		Thread.sleep(500);
		yesCreate.click();
		Thread.sleep(500);

		String expectedTitle = firstItemTitle.getText();
		expectedTitle = expectedTitle.replace("...", "").trim();
		title = title.replace("...", "").trim();

		Assert.assertTrue(title.contains(expectedTitle), RED + "Alarm not added.");

		System.out.println(GREEN + title);

	}

	public void manualAlarmByResourceMsLP(WebDriver driver, String st01N, String st02N, String gTodaysDate,
			String gtimeHHMMSS, String st01R1, String st01R2) throws Throwable {

		Actions act = new Actions(driver);
		Robot robot = new Robot();

		// Create new alarm
		createNewButton.click();
		Thread.sleep(1000);

		fireStationField.click();
		Thread.sleep(1000);

		// Select Fire Stations
		act.sendKeys(st01N).perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(500);

		act.sendKeys(st02N).perform();
		Thread.sleep(500);
		act.sendKeys(Keys.ENTER).perform();

		// Alarm details
		alarmKeyword.click();
		String title = "BG-MA by resource-" + gTodaysDate + "_" + gtimeHHMMSS;
		act.sendKeys(title).perform();

		alarmImage.click();
		act.sendKeys("Image-manual alarm by resource checking.").perform();

		descriptionField.click();
		act.sendKeys("BG-manual alarm by resource checking.").perform();

		setPriority.click();
		Thread.sleep(500);

		// Reporter details
		reporter.click();
		Thread.sleep(500);

		reporterName.click();
		act.sendKeys("Dr. Sumit Raghute").perform();

		reporterStreet.click();
		act.sendKeys("Kharbi Road, Nagpur").perform();

		reporterZipCode.click();
		act.sendKeys("440009").perform();

		act.moveToElement(reporterMobileNo).click().perform();
		Thread.sleep(500);

		reporterMobileNo.click();
		act.sendKeys("1122334455").perform();

		reporterCallback.click();
		act.sendKeys("10").perform();
		Thread.sleep(500);

		// Incident details
		act.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).sendKeys(Keys.TAB).perform();

		act.sendKeys("fire at hospital.").perform();

		act.sendKeys(Keys.TAB).sendKeys(Keys.TAB).perform();

		Thread.sleep(500);
		robot.mouseWheel(5);
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);

		// Alarm address
		alarmAddress.click();
		act.sendKeys("YES Hospital, Plot no. 1 & 1A, Dighori Flyover Square, Dighori, Nagpur, Maharashtra 440017")
				.perform();

		// Tab navigation
//		for (int i = 0; i <= 9; i++) {
//			act.sendKeys(Keys.TAB).perform();
//		}
//
//		// Additional address info
//		additionalAddressInformation.click();
		act.moveToElement(additionalAddressInformation).click().perform();
		Thread.sleep(500);

		alarmObject.click();
		act.sendKeys("hospital").perform();

		alarmFloor.click();
		act.sendKeys("ground floor").perform();

		alarmAnnotation.click();
		act.sendKeys("alarm annotation").perform();
		Thread.sleep(1000);

		act.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();

		Thread.sleep(2000);

		// Resource selection
		userTypeResource.click();
		Thread.sleep(500);

		resourceField1.click();
		act.sendKeys(st01R1).perform();
		Thread.sleep(500);
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(500);

		resourceField2.click();
		act.sendKeys(st01R2).perform();
		Thread.sleep(500);
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(1000);

		act.sendKeys(Keys.TAB).perform();
		Thread.sleep(500);
		// Generate alarm
		generateAlarm.click();
		Thread.sleep(500);
		yesCreate.click();
		Thread.sleep(500);

		String expectedTitle = firstItemTitle.getText();
		expectedTitle = expectedTitle.replace("...", "").trim();
		title = title.replace("...", "").trim();

		Assert.assertTrue(title.contains(expectedTitle), RED + "Alarm not added.");

		System.out.println(GREEN + title);

	}

	public void manualAlarmByUersMs(WebDriver driver, String st01N, String st02N, String gTodaysDate,
			String gtimeHHMMSS, String st01V1, String st01V2, String st02V1, String st01FF1, String st01FF2,
			String st02FF1) throws Throwable {

		// -----------------------
		// CREATE MANUAL ALARM (FIREFIGHTER)
		// -----------------------
		Actions act = new Actions(driver);
		Robot robot = new Robot();

		createNewButton.click();
		Thread.sleep(2000);

		fireStationField.click();
		Thread.sleep(1000);

		// Select Fire Stations
		act.sendKeys(st01N).perform();
		Thread.sleep(1000);
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);

		act.sendKeys(st02N).perform();
		Thread.sleep(500);
		act.sendKeys(Keys.ENTER).perform();

		// Alarm details
		alarmKeyword.click();
		String title = "BG-MA by firefighter-" + gTodaysDate + "_" + gtimeHHMMSS;
		act.sendKeys(title).perform();

		alarmImage.click();
		act.sendKeys("Checking email, call and sms for alarm. ").perform();

		descriptionField.click();
		act.sendKeys("BG-manual alarm by firefighter checking.").perform();

		// Reporter details
		reporter.click();
		Thread.sleep(1000);

		reporterName.click();
		act.sendKeys("Dr. Sumit Raghute").perform();

		reporterStreet.click();
		act.sendKeys("Kharbi Road, Nagpur").perform();

		reporterZipCode.click();
		act.sendKeys("440009").perform();

		act.moveToElement(reporterMobileNo).click().perform();
		Thread.sleep(500);

		reporterMobileNo.click();
		act.sendKeys("1122334455").perform();

		reporterCallback.click();
		act.sendKeys("10").perform();
		Thread.sleep(500);

		// Incident details
		act.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).sendKeys(Keys.TAB).perform();

		act.sendKeys("fire at hospital.").perform();

		act.sendKeys(Keys.TAB).sendKeys(Keys.TAB).perform();

		Thread.sleep(500);
		robot.mouseWheel(5);
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);

		// Alarm address
		alarmAddress.click();
		act.sendKeys("YES Hospital, Plot no. 1 & 1A, Dighori Flyover Square, Dighori, Nagpur, Maharashtra 440017")
				.perform();

		// Tab navigation
//		for (int i = 0; i <= 9; i++) {
//			act.sendKeys(Keys.TAB).perform();
//		}
//
//		// Additional address info
//		additionalAddressInformation.click();
		act.moveToElement(additionalAddressInformation).click().perform();

		Thread.sleep(500);

		alarmObject.click();
		act.sendKeys("hospital").perform();

		alarmFloor.click();
		act.sendKeys("ground floor").perform();

		alarmAnnotation.click();
		act.sendKeys("alarm annotation").perform();
		Thread.sleep(1000);

		act.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();

		Thread.sleep(2000);

		// Firefighter and vehicle selection
		userTypeFirefighter.click();
		Thread.sleep(1000);

		vehicleField1.click();
		Thread.sleep(1000);

		act.sendKeys(st01V1).perform();
		Thread.sleep(1000);
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(1000);

//		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).perform();
//		Thread.sleep(500);

		act.sendKeys(Keys.HOME).perform();
		Thread.sleep(500);

		for (int d = 0; d <= 15; d++) {
			act.sendKeys(Keys.DELETE).perform();
			Thread.sleep(100);
		}

		act.sendKeys(st01V2).perform();
		Thread.sleep(1000);
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(1000);

//		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).perform();
//		Thread.sleep(500);

		act.sendKeys(Keys.HOME).perform();
		Thread.sleep(500);

		for (int d = 0; d <= 15; d++) {
			act.sendKeys(Keys.DELETE).perform();
		}

		act.sendKeys(st02V1).perform();
		Thread.sleep(500);
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(1000);

		// Firefighter fields
		FirefighterField1.click();
		Thread.sleep(2000);
		act.sendKeys(st01FF1).perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.HOME).perform();

		for (int d = 0; d <= 30; d++) {
			act.sendKeys(Keys.DELETE).perform();
		}

		Thread.sleep(2000);
		act.sendKeys(st01FF2).perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.HOME).perform();

		for (int d = 0; d <= 30; d++) {
			act.sendKeys(Keys.DELETE).perform();
		}
		Thread.sleep(500);

		FirefighterField2.click();
		Thread.sleep(500);
		act.sendKeys(st02FF1).perform();
		Thread.sleep(500);
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(1000);

		act.sendKeys(Keys.HOME).perform();

		for (int d = 0; d <= 30; d++) {
			act.sendKeys(Keys.DELETE).perform();
		}

		// Generate alarm
		Thread.sleep(500);
		act.sendKeys(Keys.ESCAPE).perform();
		Thread.sleep(500);
		generateAlarm.click();
		Thread.sleep(500);
		yesCreate.click();
		Thread.sleep(5000);

		String expectedTitle = firstItemTitle.getText();

		expectedTitle = expectedTitle.replace("...", "").trim();
		title = title.replace("...", "").trim();

		Assert.assertTrue(title.contains(expectedTitle), RED + "Alarm not added.");

		System.out.println(GREEN + title);

	}

	public void ManualAlarmForDircetCall(WebDriver driver, String st01N, String st02N, String gTodaysDate,
			String gtimeHHMMSS, String st01V1, String st01V2, String st02V1, String st01FF1, String st01FF2,
			String st01FFEmailCallSms, String st01FFEmailCallSms_FallBack, String st02FF1) throws Throwable {

		// -----------------------
		// CREATE MANUAL ALARM (FIREFIGHTER)
		// -----------------------
		Actions act = new Actions(driver);
		Robot robot = new Robot();

		createNewButton.click();
		Thread.sleep(2000);

		fireStationField.click();
		Thread.sleep(1000);

		// Select Fire Stations
		act.sendKeys(st01N).perform();
		Thread.sleep(1000);
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);

		act.sendKeys(st02N).perform();
		Thread.sleep(500);
		act.sendKeys(Keys.ENTER).perform();

		// Alarm details
		alarmKeyword.click();
		String title = "BG-MA by Users - direct and fallback calls, SMS, and emails. -" + gTodaysDate + "_"
				+ gtimeHHMMSS;
		act.sendKeys(title).perform();

		alarmImage.click();
		act.sendKeys("Image-MA by Users - direct and fallback calls, SMS, and emails. ").perform();

		descriptionField.click();
		act.sendKeys("Verifying direct and fallback calls, SMS, and emails for Manual Alarms from Web.").perform();

		// Reporter details
		reporter.click();
		Thread.sleep(1000);

		reporterName.click();
		act.sendKeys("Dr. Sumit Raghute").perform();

		reporterStreet.click();
		act.sendKeys("Kharbi Road, Nagpur").perform();

		reporterZipCode.click();
		act.sendKeys("440009").perform();

		act.moveToElement(reporterMobileNo).click().perform();
		Thread.sleep(500);

		reporterMobileNo.click();
		act.sendKeys("1122334455").perform();

		reporterCallback.click();
		act.sendKeys("10").perform();
		Thread.sleep(500);

		// Incident details
		act.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).sendKeys(Keys.TAB).perform();

		act.sendKeys("fire at hospital.").perform();

		act.sendKeys(Keys.TAB).sendKeys(Keys.TAB).perform();

		Thread.sleep(500);
		robot.mouseWheel(5);
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);

		// Alarm address
		alarmAddress.click();
		act.sendKeys("YES Hospital, Plot no. 1 & 1A, Dighori Flyover Square, Dighori, Nagpur, Maharashtra 440017")
				.perform();

		// Tab navigation
//		for (int i = 0; i <= 9; i++) {
//			act.sendKeys(Keys.TAB).perform();
//		}
//
//		// Additional address info
//		additionalAddressInformation.click();
		act.moveToElement(additionalAddressInformation).click().perform();
		Thread.sleep(500);

		alarmObject.click();
		act.sendKeys("hospital").perform();

		alarmFloor.click();
		act.sendKeys("ground floor").perform();

		alarmAnnotation.click();
		act.sendKeys("alarm annotation").perform();
		Thread.sleep(1000);

		act.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();

		Thread.sleep(2000);

		// Firefighter and vehicle selection
		userTypeFirefighter.click();
		Thread.sleep(1000);

		vehicleField1.click();
		Thread.sleep(1000);

		act.sendKeys(st01V1).perform();
		Thread.sleep(1000);
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(1000);

//		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).perform();
//		Thread.sleep(500);

		act.sendKeys(Keys.HOME).perform();
		Thread.sleep(500);

		for (int d = 0; d <= 15; d++) {
			act.sendKeys(Keys.DELETE).perform();
		}

		act.sendKeys(st01V2).perform();
		Thread.sleep(1000);
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(1000);

//		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).perform();
//		Thread.sleep(500);

		act.sendKeys(Keys.HOME).perform();
		Thread.sleep(500);

		for (int d = 0; d <= 15; d++) {
			act.sendKeys(Keys.DELETE).perform();
		}

		act.sendKeys(st02V1).perform();
		Thread.sleep(500);
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(1000);

		// Firefighter fields
		FirefighterField1.click();
		Thread.sleep(2000);
		act.sendKeys(st01FF1).perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);
		act.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).build().perform();

		Thread.sleep(2000);
		act.sendKeys(st01FF2).perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);
		act.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).build().perform();
		Thread.sleep(500);

		Thread.sleep(2000);
		act.sendKeys(st01FFEmailCallSms).perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);
		act.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).build().perform();
		Thread.sleep(500);

		Thread.sleep(2000);
		act.sendKeys(st01FFEmailCallSms_FallBack).perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);
		act.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).build().perform();
		Thread.sleep(500);

		FirefighterField2.click();
		Thread.sleep(500);
		act.sendKeys(st02FF1).perform();
		Thread.sleep(500);
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(1000);

		// Generate alarm
		Thread.sleep(500);
		act.sendKeys(Keys.TAB).perform();
		Thread.sleep(500);

		generateAlarm.click();
		Thread.sleep(500);
		yesCreate.click();
		Thread.sleep(5000);

		String expectedTitle = firstItemTitle.getText();
		expectedTitle = expectedTitle.replace("...", "").trim();
		title = title.replace("...", "").trim();

		Assert.assertTrue(title.contains(expectedTitle), RED + "Alarm not added.");

		System.out.println(GREEN + title);

	}

	public void deleteManualAlarm(WebDriver driver, String SearWordForDelete) throws Throwable {
		Actions act = new Actions(driver);
		refreshFilter.click();
		Thread.sleep(2000);

		Thread.sleep(2000);
		itemPepage100.click();
		Thread.sleep(5000);

		titleSearch.click();
		Thread.sleep(2000);

		titleSearchField.click();
		Thread.sleep(2000);

		act.sendKeys(SearWordForDelete).perform();
		Thread.sleep(2000);

		titleSearchFieldOk.click();
		Thread.sleep(10000);

		int totalAlarms = 0;

		for (int batch = 1; batch <= 15; batch++) {
			int count = BGAlarm.size();

			if (count == 0) {
				break;
			}

			System.out.println("The iteration-" + batch + " still ongoing, please wait.");

			selectAll.click();
			Thread.sleep(2000);

			delateAll.click();
			Thread.sleep(2000);

			deleteYes.click();
			Thread.sleep(5000);

			driver.navigate().refresh();
			Thread.sleep(3000);

			totalAlarms += count;
		}

		System.out.println("The iteration has been completed.");
		System.out.println(GREEN + "Total >>>>>" + totalAlarms + "<<<<< alarms deleted successfully.");

		refreshFilter.click();
		Thread.sleep(2000);
	}

	public void deleteBhupeshTestAlarmFromAlarmList(WebDriver driver) throws Throwable {
		Actions act = new Actions(driver);
		refreshFilter.click();
		Thread.sleep(2000);

		Thread.sleep(2000);
		itemPepage100.click();
		Thread.sleep(5000);

		titleSearch.click();
		Thread.sleep(2000);

		titleSearchField.click();
		Thread.sleep(2000);

		act.sendKeys("Bhupesh").perform();
		Thread.sleep(2000);

		titleSearchFieldOk.click();
		Thread.sleep(10000);

		int totalAlarms = 0;

		for (int batch = 1; batch <= 15; batch++) {
			int count = bhupeshTestAlarm.size();

			if (count == 0) {
				break;
			}

			System.out.println("The iteration-" + batch + " still ongoing, please wait.");

			selectAll.click();
			Thread.sleep(2000);

			delateAll.click();
			Thread.sleep(2000);

			deleteYes.click();
			Thread.sleep(5000);

			driver.navigate().refresh();
			Thread.sleep(3000);

			totalAlarms += count;
		}

		System.out.println("The iteration has been completed.");
		System.out.println(GREEN + "Total >>>>>" + totalAlarms + "<<<<< Monthly test alarms deleted successfully.");

		refreshFilter.click();
		Thread.sleep(2000);
	}

	public void deleteTestAlarmFromPlaningList(WebDriver driver) throws Throwable {
		Actions act = new Actions(driver);

		refreshFilter.click();
		Thread.sleep(2000);

		mangeTestAlarm.click();
		Thread.sleep(2000);

		itemPepage100.click();
		Thread.sleep(5000);

		titleSearch.click();
		Thread.sleep(2000);

		titleSearchField.click();
		Thread.sleep(2000);

		act.sendKeys("BG").perform();
		Thread.sleep(2000);

		titleSearchFieldOk.click();
		Thread.sleep(10000);

		int totalAlarms = 0;

		for (int batch = 1; batch <= 15; batch++) {
			int count = BgTestAlarm.size();

			if (count == 0) {
				break;
			}

			System.out.println("The iteration-" + batch + " still ongoing, please wait.");

			selectAll.click();
			Thread.sleep(2000);

			deleteAll2.click();
			Thread.sleep(2000);

			deleteYes.click();
			Thread.sleep(5000);

			driver.navigate().refresh();
			Thread.sleep(3000);

			totalAlarms += count;
		}

		System.out.println("The iteration has been completed.");
		System.out.println(GREEN + "Total >>>>>" + totalAlarms + "<<<<< alarms deleted successfully.");

		refreshFilter.click();
		Thread.sleep(2000);
	}

	public void backToOld() throws Throwable {
		refreshFilter.click();
		Thread.sleep(2000);

		dashbordMenu2.click();
		Thread.sleep(1000);

		dashboard2.click();
		Thread.sleep(2000);
	}

	// Bhupesh

	public void Bhupesh_testAlarm_recursiv_daily_userType_time(WebDriver driver, String st01N, String st02N,
			String userType, String hh, String mm, String st01V1, String st01V2, String st02V1, String st01A1,
			String st02A1, String st01R1, String st02R1, String st01FF1, String st01FF2, String st02FF1)
			throws Throwable {

		Actions act = new Actions(driver);
		Robot robot = new Robot();

		mangeTestAlarm.click();
		Thread.sleep(2000);
		refreshFilter.click();
		Thread.sleep(2000);

		// Create new alarm
		createNewButton.click();
		Thread.sleep(1000);

		fireStationField.click();
		Thread.sleep(1000);

		// Select Fire Stations
		act.sendKeys(st01N).perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(500);

		act.sendKeys(st02N).perform();
		Thread.sleep(500);
		act.sendKeys(Keys.ENTER).perform();

		String title1 = "TA Recursive Daily by " + userType + " at_" + hh + ":" + mm;
		String title = "Bhupesh-" + title1;
		// Alarm details
		alarmKeyword.click();
		act.sendKeys(title).perform();

		alarmImage.click();
		act.sendKeys("Image-" + title).perform();
		;

		descriptionField.click();
		act.sendKeys("Checking " + title).perform();

		Thread.sleep(1000);
		Alarmmonitor.click();
		Thread.sleep(1000);

		// Reporter details
		reporter.click();
		Thread.sleep(500);

		reporterName.click();
		act.sendKeys("Dr. Sumit Raghute").perform();

		reporterStreet.click();
		act.sendKeys("Kharbi Road, Nagpur").perform();

		reporterZipCode.click();
		act.sendKeys("440009").perform();

		act.moveToElement(reporterMobileNo).click().perform();
		Thread.sleep(500);

		reporterMobileNo.click();
		act.sendKeys("1122334455").perform();

		reporterCallback.click();
		act.sendKeys("10").perform();
		Thread.sleep(500);

		// Incident details
		act.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).sendKeys(Keys.TAB).perform();

		act.sendKeys("fire at hospital.").perform();

		act.sendKeys(Keys.TAB).sendKeys(Keys.TAB).perform();

		Thread.sleep(500);
		robot.mouseWheel(5);
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);

		// Planning
		setSchedule.click();
		Thread.sleep(500);

		selectScheduleType.click();
		Thread.sleep(500);

		scheduleRecursive.click();
		Thread.sleep(500);

		recursiveDaily.click();
		Thread.sleep(500);

		dateAndTimeOnetime.click();
		Thread.sleep(1000);

		act.sendKeys(Keys.TAB).perform();
		Thread.sleep(1000);

		String currentHrs1 = currentHrs.getText().trim();

//		System.out.println(currentHrs1);
//		System.out.println(germanyTimeAfter5MinHH);

		int current = Integer.parseInt(currentHrs1);
		int target = Integer.parseInt(hh);

		while (current != target) {

			if (current > target) {
				act.sendKeys(Keys.ARROW_UP).perform();
				current--;
			} else {
				act.sendKeys(Keys.ARROW_DOWN).perform();
				current++;
			}

			Thread.sleep(300);
		}

		act.sendKeys(Keys.TAB).perform();
		Thread.sleep(1000);

		String currentMin1 = currentMin.getText().trim();

//		System.out.println(currentMin1);
//		System.out.println(germanyTimeAfter5MinMM);

		int current1 = Integer.parseInt(currentMin1);
		int target1 = Integer.parseInt(mm);

		while (current1 != target1) {

			if (current1 > target1) {
				act.sendKeys(Keys.ARROW_UP).perform();
				current1--;
			} else {
				act.sendKeys(Keys.ARROW_DOWN).perform();
				current1++;
			}

			Thread.sleep(300);
		}

		timeOk.click();
		Thread.sleep(500);

		act.moveToElement(testAlarmNext).click().build().perform();

//		testAlarmNext.click();
		Thread.sleep(2000);

		// Alarm address
		alarmAddress.click();
		act.sendKeys("YES Hospital, Plot no. 1 & 1A, Dighori Flyover Square, Dighori, Nagpur, Maharashtra 440017")
				.perform();

		// Tab navigation
//		for (int i = 0; i <= 9; i++) {
//			act.sendKeys(Keys.TAB).perform();
//		}

		// Additional address info

		act.moveToElement(additionalAddressInformation).click().perform();
//		additionalAddressInformation.click();
		Thread.sleep(500);

		alarmObject.click();
		act.sendKeys("hospital").perform();

		alarmFloor.click();
		act.sendKeys("ground floor").perform();

		alarmAnnotation.click();
		act.sendKeys("alarm annotation").perform();
		Thread.sleep(1000);

		act.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();

		Thread.sleep(2000);

		switch (userType) {

		case "Attribute":

		{

			userTypeAttribute.click();

			Thread.sleep(2000);
			vehicleField1.click();

			// Vehicle 1
			act.sendKeys(st01V1).perform();
			Thread.sleep(1000);
			act.sendKeys(Keys.ENTER).perform();
			Thread.sleep(1000);

			act.sendKeys(Keys.HOME).perform();
			for (int a = 0; a <= 30; a++) {

				act.sendKeys(Keys.DELETE).perform();
			}

			// Vehicle 2
			Thread.sleep(1000);
			act.sendKeys(st01V2).perform();
			Thread.sleep(1000);
			act.sendKeys(Keys.ENTER).perform();
			Thread.sleep(1000);

			act.sendKeys(Keys.HOME).perform();
			for (int a = 0; a <= 30; a++) {

				act.sendKeys(Keys.DELETE).perform();
			}
			// Vehicle 3

			act.sendKeys(st02V1).perform();
			Thread.sleep(1000);
			act.sendKeys(Keys.ENTER).perform();
			Thread.sleep(1000);

			act.sendKeys(Keys.HOME).perform();
			for (int a = 0; a <= 30; a++) {

				act.sendKeys(Keys.DELETE).perform();
			}
			// Attribute
			attributeField.click();
			Thread.sleep(1000);
			act.sendKeys(st01A1).perform();
			Thread.sleep(1000);
			act.sendKeys(Keys.ENTER).perform();
			Thread.sleep(1000);

			act.sendKeys(Keys.HOME).perform();
			for (int a = 0; a <= 30; a++) {

				act.sendKeys(Keys.DELETE).perform();
			}
			Thread.sleep(1000);

			act.sendKeys(st02A1).perform();
			Thread.sleep(1000);
			act.sendKeys(Keys.ENTER).perform();
			Thread.sleep(1000);

			act.sendKeys(Keys.HOME).perform();
			for (int a = 0; a <= 30; a++) {

				act.sendKeys(Keys.DELETE).perform();
			}
			Thread.sleep(1000);

			act.sendKeys(Keys.TAB).perform();
			Thread.sleep(500);
			break;

		}
		case "Resource": {
			userTypeResource.click();
			Thread.sleep(500);

			resourceField1.click();
			act.sendKeys(st01R1).perform();
			Thread.sleep(500);
			act.sendKeys(Keys.ENTER).perform();
			Thread.sleep(500);
			act.sendKeys(Keys.TAB).build().perform();
			Thread.sleep(500);
			resourceField2.click();
			act.sendKeys(st02R1).perform();
			Thread.sleep(500);
			act.sendKeys(Keys.ENTER).perform();
			Thread.sleep(1000);

			act.sendKeys(Keys.TAB).perform();
			Thread.sleep(500);

			break;

		}

		case "Users": {

			userTypeFirefighter.click();
			Thread.sleep(1000);

			vehicleField1.click();
			Thread.sleep(1000);

			// Vehicle 1
			act.sendKeys(st01V1).perform();
			Thread.sleep(1000);
			act.sendKeys(Keys.ENTER).perform();
			Thread.sleep(1000);

			act.sendKeys(Keys.HOME).perform();
			for (int a = 0; a <= 30; a++) {

				act.sendKeys(Keys.DELETE).perform();
			}

			// Vehicle 2
			Thread.sleep(1000);
			act.sendKeys(st01V2).perform();
			Thread.sleep(1000);
			act.sendKeys(Keys.ENTER).perform();
			Thread.sleep(1000);

			act.sendKeys(Keys.HOME).perform();
			for (int a = 0; a <= 30; a++) {

				act.sendKeys(Keys.DELETE).perform();
			}
			// Vehicle 3

			act.sendKeys(st02V1).perform();
			Thread.sleep(1000);
			act.sendKeys(Keys.ENTER).perform();
			Thread.sleep(1000);

			act.sendKeys(Keys.HOME).perform();
			for (int a = 0; a <= 30; a++) {

				act.sendKeys(Keys.DELETE).perform();
			}

			// Firefighter fields
			FirefighterField1.click();
			Thread.sleep(2000);
			act.sendKeys(st01FF1).perform();
			Thread.sleep(2000);
			act.sendKeys(Keys.ENTER).perform();
			Thread.sleep(2000);
			act.sendKeys(Keys.HOME).perform();
			for (int a = 0; a <= 30; a++) {

				act.sendKeys(Keys.DELETE).perform();
			}

			Thread.sleep(2000);
			act.sendKeys(st01FF2).perform();
			Thread.sleep(2000);
			act.sendKeys(Keys.ENTER).perform();
			Thread.sleep(2000);
			act.sendKeys(Keys.HOME).perform();
			for (int a = 0; a <= 30; a++) {

				act.sendKeys(Keys.DELETE).perform();
			}
			Thread.sleep(500);

//				
			act.sendKeys(Keys.TAB).perform();
			Thread.sleep(500);
			FirefighterField2.click();
			Thread.sleep(500);
			act.sendKeys(st02FF1).perform();
			Thread.sleep(500);
			act.sendKeys(Keys.ENTER).perform();
			Thread.sleep(1000);
			act.sendKeys(Keys.TAB).perform();
			Thread.sleep(500);
			break;
		}

		default:
			System.out.println(RED + "UserType ");

		}

		saveTestAlarm.click();
		Thread.sleep(500);
		yesCreate.click();
		Thread.sleep(500);

		String firtsTestAlarm1 = bhupeshFirstTestAlarm.getText();

		firtsTestAlarm1 = firtsTestAlarm1.replace("...", "").trim();
		title = title.replace("...", "").trim();

//		System.out.println(title);
//		System.out.println(firtsTestAlarm1);

		Assert.assertTrue(title.contains(firtsTestAlarm1), RED + "Alarm not added.");

		System.out.println(GREEN + title);

	}

	public void Bhupesh_testAlarm_recursiv_weekly_weekDay_userType(WebDriver driver, String st01N, String st02N,
			String weekDay, String userType, String hh, String mm, String st01V1, String st01V2, String st02V1,
			String st01A1, String st02A1, String st01R1, String st02R1, String st01FF1, String st01FF2, String st02FF1)
			throws Throwable {

		// -----------------------
		// CREATE MANUAL ALARM (FIREFIGHTER)
		// -----------------------
		Actions act = new Actions(driver);
		Robot robot = new Robot();

		mangeTestAlarm.click();
		Thread.sleep(2000);
		refreshFilter.click();

		Thread.sleep(2000);

		createNewButton.click();
		Thread.sleep(2000);

		fireStationField.click();
		Thread.sleep(1000);

		// Select Fire Stations
		act.sendKeys(st01N).perform();
		Thread.sleep(1000);
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);

		act.sendKeys(st02N).perform();
		Thread.sleep(500);
		act.sendKeys(Keys.ENTER).perform();

		// Alarm details
		alarmKeyword.click();

		String title1 = "TA Recursive Weekly by " + userType + " for " + weekDay + " at_" + hh + ":" + mm;
		String title = "Bhupesh - " + title1;
		act.sendKeys(title).perform();

		alarmImage.click();
		act.sendKeys("Image-" + title).perform();

		descriptionField.click();
		act.sendKeys("Checking " + title).perform();

		Thread.sleep(1000);
		Alarmmonitor.click();
		Thread.sleep(1000);

		// Reporter details
		reporter.click();
		Thread.sleep(1000);

		reporterName.click();
		act.sendKeys("Dr. Sumit Raghute").perform();

		reporterStreet.click();
		act.sendKeys("Kharbi Road, Nagpur").perform();

		reporterZipCode.click();
		act.sendKeys("440009").perform();

		act.moveToElement(reporterMobileNo).click().perform();
		Thread.sleep(500);

		reporterMobileNo.click();
		act.sendKeys("1122334455").perform();

		reporterCallback.click();
		act.sendKeys("10").perform();
		Thread.sleep(500);

		// Incident details
		act.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).sendKeys(Keys.TAB).perform();

		act.sendKeys("fire at hospital.").perform();

		act.sendKeys(Keys.TAB).sendKeys(Keys.TAB).perform();

		Thread.sleep(500);
		robot.mouseWheel(5);
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);

		// Planning
		setSchedule.click();
		Thread.sleep(500);

		selectScheduleType.click();
		Thread.sleep(500);

		scheduleRecursive.click();
		Thread.sleep(500);

		recursiveWeekly.click();
		Thread.sleep(500);

		selectWeekDay.click();
		Thread.sleep(500);

		// hover + click

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement pickUpDay = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//div[normalize-space(text())='" + weekDay + "']")));

		act.moveToElement(pickUpDay).click().perform();

		timeWeekly.click();
		Thread.sleep(500);

		act.sendKeys(Keys.TAB).perform();
		Thread.sleep(1000);

		String currentHrs1 = currentHrs.getText().trim();

//				System.out.println(currentHrs1);
//				System.out.println(germanyTimeAfter5MinHH);

		int current = Integer.parseInt(currentHrs1);
//		int target = Integer.parseInt(germanyTimeAfter9MinHH);
		int target = Integer.parseInt(hh);

		while (current != target) {

			if (current > target) {
				act.sendKeys(Keys.ARROW_UP).perform();
				current--;
			} else {
				act.sendKeys(Keys.ARROW_DOWN).perform();
				current++;
			}

			Thread.sleep(300);
		}

		act.sendKeys(Keys.TAB).perform();
		Thread.sleep(1000);

		String currentMin1 = currentMin.getText().trim();

//				System.out.println(currentMin1);
//				System.out.println(germanyTimeAfter5MinMM);

		int current1 = Integer.parseInt(currentMin1);
//		int target1 = Integer.parseInt(germanyTimeAfter9MinMM);
		int target1 = Integer.parseInt(mm);

		while (current1 != target1) {

			if (current1 > target1) {
				act.sendKeys(Keys.ARROW_UP).perform();
				current1--;
			} else {
				act.sendKeys(Keys.ARROW_DOWN).perform();
				current1++;
			}

			Thread.sleep(300);
		}

		timeOk.click();
		Thread.sleep(500);

		act.moveToElement(testAlarmNext).click().build().perform();

//		testAlarmNext.click();
		Thread.sleep(2000);

		// Alarm address
		alarmAddress.click();
		act.sendKeys("YES Hospital, Plot no. 1 & 1A, Dighori Flyover Square, Dighori, Nagpur, Maharashtra 440017")
				.perform();

		// Tab navigation
//		for (int i = 0; i <= 9; i++) {
//			act.sendKeys(Keys.TAB).perform();
//		}
//
//		// Additional address info
//		additionalAddressInformation.click();
		act.moveToElement(additionalAddressInformation).click().perform();
		Thread.sleep(500);

		alarmObject.click();
		act.sendKeys("hospital").perform();

		alarmFloor.click();
		act.sendKeys("ground floor").perform();

		alarmAnnotation.click();
		act.sendKeys("alarm annotation").perform();
		Thread.sleep(1000);

		act.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();

		Thread.sleep(2000);

		// Firefighter and vehicle selection

		switch (weekDay) {

		case "Monday": {
			userTypeAttribute.click();

			Thread.sleep(2000);
			vehicleField1.click();

			// Vehicle 1
			act.sendKeys(st01V1).perform();
			Thread.sleep(1000);
			act.sendKeys(Keys.ENTER).perform();
			Thread.sleep(1000);

			act.sendKeys(Keys.HOME).perform();
			for (int a = 0; a <= 30; a++) {

				act.sendKeys(Keys.DELETE).perform();
			}

			// Vehicle 2
			Thread.sleep(1000);
			act.sendKeys(st01V2).perform();
			Thread.sleep(1000);
			act.sendKeys(Keys.ENTER).perform();
			Thread.sleep(1000);

			act.sendKeys(Keys.HOME).perform();
			for (int a = 0; a <= 30; a++) {

				act.sendKeys(Keys.DELETE).perform();
			}
			// Vehicle 3

			act.sendKeys(st02V1).perform();
			Thread.sleep(1000);
			act.sendKeys(Keys.ENTER).perform();
			Thread.sleep(1000);

			act.sendKeys(Keys.HOME).perform();
			for (int a = 0; a <= 30; a++) {

				act.sendKeys(Keys.DELETE).perform();
			}
			// Attribute
			attributeField.click();
			Thread.sleep(1000);
			act.sendKeys(st01A1).perform();
			Thread.sleep(1000);
			act.sendKeys(Keys.ENTER).perform();
			Thread.sleep(1000);

			act.sendKeys(Keys.HOME).perform();
			for (int a = 0; a <= 30; a++) {

				act.sendKeys(Keys.DELETE).perform();
			}
			Thread.sleep(1000);

			act.sendKeys(st02A1).perform();
			Thread.sleep(1000);
			act.sendKeys(Keys.ENTER).perform();
			Thread.sleep(1000);

			act.sendKeys(Keys.HOME).perform();
			for (int a = 0; a <= 30; a++) {

				act.sendKeys(Keys.DELETE).perform();
			}
			Thread.sleep(1000);

			act.sendKeys(Keys.TAB).perform();
			Thread.sleep(500);
			break;

		}
		case "Wednesday": {
			userTypeResource.click();
			Thread.sleep(500);

			resourceField1.click();
			act.sendKeys(st01R1).perform();
			Thread.sleep(500);
			act.sendKeys(Keys.ENTER).perform();
			Thread.sleep(500);
			act.sendKeys(Keys.TAB).build().perform();
			Thread.sleep(500);
			resourceField2.click();
			act.sendKeys(st02R1).perform();
			Thread.sleep(500);
			act.sendKeys(Keys.ENTER).perform();
			Thread.sleep(1000);

			act.sendKeys(Keys.TAB).perform();
			Thread.sleep(500);

			break;

		}

		case "Friday": {

			userTypeFirefighter.click();
			Thread.sleep(1000);

			vehicleField1.click();
			Thread.sleep(1000);

			// Vehicle 1
			act.sendKeys(st01V1).perform();
			Thread.sleep(1000);
			act.sendKeys(Keys.ENTER).perform();
			Thread.sleep(1000);

			act.sendKeys(Keys.HOME).perform();
			for (int a = 0; a <= 30; a++) {

				act.sendKeys(Keys.DELETE).perform();
			}

			// Vehicle 2
			Thread.sleep(1000);
			act.sendKeys(st01V2).perform();
			Thread.sleep(1000);
			act.sendKeys(Keys.ENTER).perform();
			Thread.sleep(1000);

			act.sendKeys(Keys.HOME).perform();
			for (int a = 0; a <= 30; a++) {

				act.sendKeys(Keys.DELETE).perform();
			}
			// Vehicle 3

			act.sendKeys(st02V1).perform();
			Thread.sleep(1000);
			act.sendKeys(Keys.ENTER).perform();
			Thread.sleep(1000);

			act.sendKeys(Keys.HOME).perform();
			for (int a = 0; a <= 30; a++) {

				act.sendKeys(Keys.DELETE).perform();
			}

			// Firefighter fields
			FirefighterField1.click();
			Thread.sleep(2000);
			act.sendKeys(st01FF1).perform();
			Thread.sleep(2000);
			act.sendKeys(Keys.ENTER).perform();
			Thread.sleep(2000);
			act.sendKeys(Keys.HOME).perform();
			for (int a = 0; a <= 30; a++) {

				act.sendKeys(Keys.DELETE).perform();
			}

			Thread.sleep(2000);
			act.sendKeys(st01FF2).perform();
			Thread.sleep(2000);
			act.sendKeys(Keys.ENTER).perform();
			Thread.sleep(2000);
			act.sendKeys(Keys.HOME).perform();
			for (int a = 0; a <= 30; a++) {

				act.sendKeys(Keys.DELETE).perform();
			}
			Thread.sleep(500);

//			
			act.sendKeys(Keys.TAB).perform();
			Thread.sleep(500);
			FirefighterField2.click();
			Thread.sleep(500);
			act.sendKeys(st02FF1).perform();
			Thread.sleep(500);
			act.sendKeys(Keys.ENTER).perform();
			Thread.sleep(1000);
			act.sendKeys(Keys.TAB).perform();
			Thread.sleep(500);

			break;
		}

		default:
			System.out.println(RED + "Week Day");

		}

		// Generate alarm
		Thread.sleep(500);
		act.sendKeys(Keys.TAB).perform();
		Thread.sleep(500);
		saveTestAlarm.click();
		Thread.sleep(500);
		yesCreate.click();
		Thread.sleep(5000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		String firtsTestAlarm1 = bhupeshFirstTestAlarm.getText();

		firtsTestAlarm1 = firtsTestAlarm1.replace("...", "").trim();
		title = title.replace("...", "").trim();

//		System.out.println(title);
//		System.out.println(firtsTestAlarm1);

		Assert.assertTrue(title.contains(firtsTestAlarm1), RED + "Alarm not added.");

		System.out.println(GREEN + title);

	}

	public void Bhupesh_testAlarm_recursiv_monthly_dayCount_dayName_userType(WebDriver driver, String st01N,
			String st02N, String userType, String dayName, String dayCount, String hh, String mm, String st01V1,
			String st01V2, String st02V1, String st01A1, String st02A1, String st01R1, String st02R1, String st01FF1,
			String st01FF2, String st02FF1) throws Throwable {
		Actions act = new Actions(driver);
		Robot robot = new Robot();
		mangeTestAlarm.click();
		Thread.sleep(2000);
		refreshFilter.click();

		Thread.sleep(2000);

		createNewButton.click();
		Thread.sleep(2000);

		fireStationField.click();
		Thread.sleep(1000);

		// Select Fire Stations
		act.sendKeys(st01N).perform();
		Thread.sleep(1000);
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);

		act.sendKeys(st02N).perform();
		Thread.sleep(500);
		act.sendKeys(Keys.ENTER).perform();

		alarmKeyword.click();
		String title1 = "TA Recursive Monthly by " + userType + " for the 1st " + dayName + " of every month at _" + hh
				+ ":" + mm;
		String title = "Bhupesh-" + title1;
		act.sendKeys(title).perform();

		// Image & description
		alarmImage.click();
		act.sendKeys("Image-" + title).perform();

		descriptionField.click();
		act.sendKeys("Checking " + title).perform();

		Thread.sleep(1000);
//		Alarmmonitor.click();
//		Thread.sleep(1000);

		// Reporter details
		Thread.sleep(2000);
		reporter.click();

		Thread.sleep(2000);
		reporterName.click();
		act.sendKeys("Dr. Sumit Raghute").perform();

		reporterStreet.click();
		act.sendKeys("Kharbi Road, Nagpur").perform();

		reporterZipCode.click();
		act.sendKeys("440009").perform();

		act.moveToElement(reporterMobileNo).click().perform();
		Thread.sleep(500);

		reporterMobileNo.click();
		act.sendKeys("1122334455").perform();

		reporterCallback.click();
		act.sendKeys("10").perform();

		// Incident text
		act.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).sendKeys(Keys.TAB).perform();

		act.sendKeys("fire at hospital.").perform();

		act.sendKeys(Keys.TAB).sendKeys(Keys.TAB).perform();

		Thread.sleep(500);
		robot.mouseWheel(5);
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);

		// Planning
		setSchedule.click();
		Thread.sleep(500);

		selectScheduleType.click();
		Thread.sleep(500);

		scheduleRecursive.click();
		Thread.sleep(500);

		recursiveMonthly.click();
		Thread.sleep(500);

		monthlyDayWise.click();
		Thread.sleep(500);

		weekForMonthlyDayWise.click();
		Thread.sleep(500);

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		WebElement selectDay = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//div[normalize-space(text())='" + dayCount + "']")));

		// hover + click
		act.moveToElement(selectDay).click().perform();
		Thread.sleep(500);

		dayOfWeek.click();
		Thread.sleep(500);

		WebElement dayOfWkke1 = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//div[normalize-space(text())='" + dayName + "']")));

		act.moveToElement(dayOfWkke1).click().perform();
		Thread.sleep(500);

		timeForMonthlyDayWise.click();
		Thread.sleep(500);

		act.sendKeys(Keys.TAB).perform();
		Thread.sleep(1000);

		String currentHrs1 = currentHrs.getText().trim();

//				System.out.println(currentHrs1);
//				System.out.println(germanyTimeAfter5MinHH);

		int current = Integer.parseInt(currentHrs1);
		int target = Integer.parseInt(hh);

		while (current != target) {

			if (current > target) {
				act.sendKeys(Keys.ARROW_UP).perform();
				current--;
			} else {
				act.sendKeys(Keys.ARROW_DOWN).perform();
				current++;
			}

			Thread.sleep(300);
		}

		act.sendKeys(Keys.TAB).perform();
		Thread.sleep(1000);

		String currentMin1 = currentMin.getText().trim();

//				System.out.println(currentMin1);
//				System.out.println(germanyTimeAfter5MinMM);

		int current1 = Integer.parseInt(currentMin1);
		int target1 = Integer.parseInt(mm);

		while (current1 != target1) {

			if (current1 > target1) {
				act.sendKeys(Keys.ARROW_UP).perform();
				current1--;
			} else {
				act.sendKeys(Keys.ARROW_DOWN).perform();
				current1++;
			}

			Thread.sleep(300);
		}

		timeOk.click();
		Thread.sleep(500);

		act.moveToElement(testAlarmNext).click().build().perform();

//		testAlarmNext.click();
		Thread.sleep(2000);

		// Address
		alarmAddress.click();
		act.sendKeys("BAPS Swaminarayan mandir, Wathoda Layout, Nagpur, Maharashtra 440035").perform();

		// Tab navigation
//		for (int i = 0; i <= 9; i++) {
//			act.sendKeys(Keys.TAB).perform();
//		}
//
//		// Additional address info
//		additionalAddressInformation.click();
		act.moveToElement(additionalAddressInformation).click().perform();
		alarmObject.click();
		act.sendKeys("hospital").perform();

		alarmFloor.click();
		act.sendKeys("ground floor").perform();

		alarmAnnotation.click();
		act.sendKeys("alarm annotation").perform();

		act.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);
		// Attribute & vehicle selection

		switch (userType) {

		case "Attribute":

		{

			userTypeAttribute.click();

			Thread.sleep(2000);
			vehicleField1.click();

			// Vehicle 1
			act.sendKeys(st01V1).perform();
			Thread.sleep(1000);
			act.sendKeys(Keys.ENTER).perform();
			Thread.sleep(1000);

			act.sendKeys(Keys.HOME).perform();
			for (int a = 0; a <= 30; a++) {

				act.sendKeys(Keys.DELETE).perform();
			}

			// Vehicle 2
			Thread.sleep(1000);
			act.sendKeys(st01V2).perform();
			Thread.sleep(1000);
			act.sendKeys(Keys.ENTER).perform();
			Thread.sleep(1000);

			act.sendKeys(Keys.HOME).perform();
			for (int a = 0; a <= 30; a++) {

				act.sendKeys(Keys.DELETE).perform();
			}
			// Vehicle 3

			act.sendKeys(st02V1).perform();
			Thread.sleep(1000);
			act.sendKeys(Keys.ENTER).perform();
			Thread.sleep(1000);

			act.sendKeys(Keys.HOME).perform();
			for (int a = 0; a <= 30; a++) {

				act.sendKeys(Keys.DELETE).perform();
			}
			// Attribute
			attributeField.click();
			Thread.sleep(1000);
			act.sendKeys(st01A1).perform();
			Thread.sleep(1000);
			act.sendKeys(Keys.ENTER).perform();
			Thread.sleep(1000);

			act.sendKeys(Keys.HOME).perform();
			for (int a = 0; a <= 30; a++) {

				act.sendKeys(Keys.DELETE).perform();
			}
			Thread.sleep(1000);

			act.sendKeys(st02A1).perform();
			Thread.sleep(1000);
			act.sendKeys(Keys.ENTER).perform();
			Thread.sleep(1000);

			act.sendKeys(Keys.HOME).perform();
			for (int a = 0; a <= 30; a++) {

				act.sendKeys(Keys.DELETE).perform();
			}
			Thread.sleep(1000);

			act.sendKeys(Keys.TAB).perform();
			Thread.sleep(500);
			break;

		}
		case "Resource": {
			userTypeResource.click();
			Thread.sleep(500);

			resourceField1.click();
			act.sendKeys(st01R1).perform();
			Thread.sleep(500);
			act.sendKeys(Keys.ENTER).perform();
			Thread.sleep(500);
			act.sendKeys(Keys.TAB).build().perform();
			Thread.sleep(500);
			resourceField2.click();
			act.sendKeys(st02R1).perform();
			Thread.sleep(500);
			act.sendKeys(Keys.ENTER).perform();
			Thread.sleep(1000);

			act.sendKeys(Keys.TAB).perform();
			Thread.sleep(500);

			break;

		}

		case "Users": {

			userTypeFirefighter.click();
			Thread.sleep(1000);

			vehicleField1.click();
			Thread.sleep(1000);

			// Vehicle 1
			act.sendKeys(st01V1).perform();
			Thread.sleep(1000);
			act.sendKeys(Keys.ENTER).perform();
			Thread.sleep(1000);

			act.sendKeys(Keys.HOME).perform();
			for (int a = 0; a <= 30; a++) {

				act.sendKeys(Keys.DELETE).perform();
			}

			// Vehicle 2
			Thread.sleep(1000);
			act.sendKeys(st01V2).perform();
			Thread.sleep(1000);
			act.sendKeys(Keys.ENTER).perform();
			Thread.sleep(1000);

			act.sendKeys(Keys.HOME).perform();
			for (int a = 0; a <= 30; a++) {

				act.sendKeys(Keys.DELETE).perform();
			}
			// Vehicle 3

			act.sendKeys(st02V1).perform();
			Thread.sleep(1000);
			act.sendKeys(Keys.ENTER).perform();
			Thread.sleep(1000);

			act.sendKeys(Keys.HOME).perform();
			for (int a = 0; a <= 30; a++) {

				act.sendKeys(Keys.DELETE).perform();
			}

			// Firefighter fields
			FirefighterField1.click();
			Thread.sleep(2000);
			act.sendKeys(st01FF1).perform();
			Thread.sleep(2000);
			act.sendKeys(Keys.ENTER).perform();
			Thread.sleep(2000);
			act.sendKeys(Keys.HOME).perform();
			for (int a = 0; a <= 30; a++) {

				act.sendKeys(Keys.DELETE).perform();
			}

			Thread.sleep(2000);
			act.sendKeys(st01FF2).perform();
			Thread.sleep(2000);
			act.sendKeys(Keys.ENTER).perform();
			Thread.sleep(2000);
			act.sendKeys(Keys.HOME).perform();
			for (int a = 0; a <= 30; a++) {

				act.sendKeys(Keys.DELETE).perform();
			}
			Thread.sleep(500);

//			
			act.sendKeys(Keys.TAB).perform();
			Thread.sleep(500);
			FirefighterField2.click();
			Thread.sleep(500);
			act.sendKeys(st02FF1).perform();
			Thread.sleep(500);
			act.sendKeys(Keys.ENTER).perform();
			Thread.sleep(1000);
			act.sendKeys(Keys.TAB).perform();
			Thread.sleep(500);

			break;
		}

		default:
			System.out.println(RED + "UserType ");

		}

		// Generate alarm
		saveTestAlarm.click();
		Thread.sleep(1000);
		yesCreate.click();
		Thread.sleep(5000);

		String firtsTestAlarm1 = bhupeshFirstTestAlarm.getText();

		firtsTestAlarm1 = firtsTestAlarm1.replace("...", "").trim();
		title = title.replace("...", "").trim();

		Assert.assertTrue(title.contains(firtsTestAlarm1), RED + "Alarm not added.");

		System.out.println(GREEN + title);
	}

	public void Bhupesh_testAlarm_recursiv_monthly_date_userType(WebDriver driver, String st01N, String st02N,
			String userType, String date, String hh, String mm, String st01V1, String st01V2, String st02V1,
			String st01A1, String st02A1, String st01R1, String st02R1, String st01FF1, String st01FF2, String st02FF1)
			throws Throwable {
		Actions act = new Actions(driver);
		Robot robot = new Robot();

		mangeTestAlarm.click();
		Thread.sleep(2000);
		refreshFilter.click();
		Thread.sleep(2000);

		createNewButton.click();
		Thread.sleep(1000);

		fireStationField.click();
		Thread.sleep(1000);

		// Select Fire Stations
		act.sendKeys(st01N).perform();
		Thread.sleep(1000);
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);

		act.sendKeys(st02N).perform();
		Thread.sleep(500);
		act.sendKeys(Keys.ENTER).perform();

		// Alarm keyword
		alarmKeyword.click();
		String title1 = "TA Recursive Monthly by " + userType + " on the- " + date + " of every month at_" + hh + ":"
				+ mm;

		String title = "Bhupesh-" + title1;

		act.sendKeys(title).perform();

		// Image & description
		alarmImage.click();
		act.sendKeys("Image-" + title).perform();

		descriptionField.click();
		act.sendKeys("Checking " + title).perform();

		Thread.sleep(1000);
		Alarmmonitor.click();
		Thread.sleep(1000);

		// Reporter details
		Thread.sleep(2000);
		reporter.click();

		Thread.sleep(2000);
		reporterName.click();
		act.sendKeys("Dr. Sumit Raghute").perform();

		reporterStreet.click();
		act.sendKeys("Kharbi Road, Nagpur").perform();

		reporterZipCode.click();
		act.sendKeys("440009").perform();

		act.moveToElement(reporterMobileNo).click().perform();
		Thread.sleep(500);

		reporterMobileNo.click();
		act.sendKeys("1122334455").perform();

		reporterCallback.click();
		act.sendKeys("10").perform();

		// Incident text
		act.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).sendKeys(Keys.TAB).perform();

		act.sendKeys("fire at hospital.").perform();

		act.sendKeys(Keys.TAB).sendKeys(Keys.TAB).perform();

		Thread.sleep(500);
		robot.mouseWheel(5);
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);

		// Planning
		setSchedule.click();
		Thread.sleep(500);

		selectScheduleType.click();
		Thread.sleep(500);

		scheduleRecursive.click();
		Thread.sleep(500);

		recursiveMonthly.click();
		Thread.sleep(500);

		dateForMontlyDateWise.click();
		Thread.sleep(500);

		dateOfMonth.click();
		Thread.sleep(500);

		// hover + click

		int intgermanyTodaysDate2 = Integer.parseInt(date);

		for (int i = 1; i <= intgermanyTodaysDate2; i++) {
			act.sendKeys(Keys.DOWN).perform();
			Thread.sleep(100);
		}
		Thread.sleep(500);

		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(500);

		act.sendKeys(Keys.TAB).perform();
		Thread.sleep(1000);

		timeWeekly.click();
		Thread.sleep(500);

		act.sendKeys(Keys.TAB).perform();
		Thread.sleep(1000);

		String currentHrs1 = currentHrs.getText().trim();

//				System.out.println(currentHrs1);
//				System.out.println(germanyTimeAfter5MinHH);

		int current = Integer.parseInt(currentHrs1);
		int target = Integer.parseInt(hh);

		while (current != target) {

			if (current > target) {
				act.sendKeys(Keys.ARROW_UP).perform();
				current--;
			} else {
				act.sendKeys(Keys.ARROW_DOWN).perform();
				current++;
			}

			Thread.sleep(300);
		}

		act.sendKeys(Keys.TAB).perform();
		Thread.sleep(1000);

		String currentMin1 = currentMin.getText().trim();

//				System.out.println(currentMin1);
//				System.out.println(germanyTimeAfter5MinMM);

		int current1 = Integer.parseInt(currentMin1);
		int target1 = Integer.parseInt(mm);

		while (current1 != target1) {

			if (current1 > target1) {
				act.sendKeys(Keys.ARROW_UP).perform();
				current1--;
			} else {
				act.sendKeys(Keys.ARROW_DOWN).perform();
				current1++;
			}

			Thread.sleep(300);
		}

		timeOk.click();
		Thread.sleep(500);

		act.moveToElement(testAlarmNext).click().build().perform();

//		testAlarmNext.click();
		Thread.sleep(2000);

		// Address
		alarmAddress.click();
		act.sendKeys("BAPS Swaminarayan mandir, Wathoda Layout, Nagpur, Maharashtra 440035").perform();

		// Tab navigation
//		for (int i = 0; i <= 9; i++) {
//			act.sendKeys(Keys.TAB).perform();
//		}
//
//		// Additional address info
//		additionalAddressInformation.click();
		act.moveToElement(additionalAddressInformation).click().perform();

		alarmObject.click();
		act.sendKeys("hospital").perform();

		alarmFloor.click();
		act.sendKeys("ground floor").perform();

		alarmAnnotation.click();
		act.sendKeys("alarm annotation").perform();

		act.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);
		// Attribute & vehicle selection

		switch (userType) {

		case "Attribute":

		{

			userTypeAttribute.click();

			Thread.sleep(2000);
			vehicleField1.click();

			// Vehicle 1
			act.sendKeys(st01V1).perform();
			Thread.sleep(1000);
			act.sendKeys(Keys.ENTER).perform();
			Thread.sleep(1000);

			act.sendKeys(Keys.HOME).perform();
			for (int a = 0; a <= 30; a++) {

				act.sendKeys(Keys.DELETE).perform();
			}

			// Vehicle 2
			Thread.sleep(1000);
			act.sendKeys(st01V2).perform();
			Thread.sleep(1000);
			act.sendKeys(Keys.ENTER).perform();
			Thread.sleep(1000);

			act.sendKeys(Keys.HOME).perform();
			for (int a = 0; a <= 30; a++) {

				act.sendKeys(Keys.DELETE).perform();
			}
			// Vehicle 3
			act.sendKeys(st02V1).perform();
			Thread.sleep(1000);
			act.sendKeys(Keys.ENTER).perform();
			Thread.sleep(1000);

			act.sendKeys(Keys.HOME).perform();
			for (int a = 0; a <= 30; a++) {

				act.sendKeys(Keys.DELETE).perform();
			}
			// Attribute
			attributeField.click();
			Thread.sleep(1000);
			act.sendKeys(st01A1).perform();
			Thread.sleep(1000);
			act.sendKeys(Keys.ENTER).perform();
			Thread.sleep(1000);

			act.sendKeys(Keys.HOME).perform();
			for (int a = 0; a <= 30; a++) {

				act.sendKeys(Keys.DELETE).perform();
			}
			Thread.sleep(1000);

			act.sendKeys(st02A1).perform();
			Thread.sleep(1000);
			act.sendKeys(Keys.ENTER).perform();
			Thread.sleep(1000);

			act.sendKeys(Keys.HOME).perform();
			for (int a = 0; a <= 30; a++) {

				act.sendKeys(Keys.DELETE).perform();
			}
			Thread.sleep(1000);

			act.sendKeys(Keys.TAB).perform();
			Thread.sleep(500);
			break;

		}
		case "Resource": {
			userTypeResource.click();
			Thread.sleep(500);

			resourceField1.click();
			act.sendKeys(st01R1).perform();
			Thread.sleep(500);
			act.sendKeys(Keys.ENTER).perform();
			Thread.sleep(500);
			act.sendKeys(Keys.TAB).build().perform();
			Thread.sleep(500);
			resourceField2.click();
			act.sendKeys(st02R1).perform();
			Thread.sleep(500);
			act.sendKeys(Keys.ENTER).perform();
			Thread.sleep(1000);

			act.sendKeys(Keys.TAB).perform();
			Thread.sleep(500);

			break;

		}

		case "Users": {

			userTypeFirefighter.click();
			Thread.sleep(1000);

			vehicleField1.click();
			Thread.sleep(1000);

			// Vehicle 1
			act.sendKeys(st01V1).perform();
			Thread.sleep(1000);
			act.sendKeys(Keys.ENTER).perform();
			Thread.sleep(1000);

			act.sendKeys(Keys.HOME).perform();
			for (int a = 0; a <= 30; a++) {

				act.sendKeys(Keys.DELETE).perform();
			}

			// Vehicle 2
			Thread.sleep(1000);
			act.sendKeys(st01V2).perform();
			Thread.sleep(1000);
			act.sendKeys(Keys.ENTER).perform();
			Thread.sleep(1000);

			act.sendKeys(Keys.HOME).perform();
			for (int a = 0; a <= 30; a++) {

				act.sendKeys(Keys.DELETE).perform();
			}
			// Vehicle 3

			act.sendKeys(st02V1).perform();
			Thread.sleep(1000);
			act.sendKeys(Keys.ENTER).perform();
			Thread.sleep(1000);

			act.sendKeys(Keys.HOME).perform();
			for (int a = 0; a <= 30; a++) {

				act.sendKeys(Keys.DELETE).perform();
			}

			// Firefighter fields
			FirefighterField1.click();
			Thread.sleep(2000);
			act.sendKeys(st01FF1).perform();
			Thread.sleep(2000);
			act.sendKeys(Keys.ENTER).perform();
			Thread.sleep(2000);
			act.sendKeys(Keys.HOME).perform();
			for (int a = 0; a <= 30; a++) {

				act.sendKeys(Keys.DELETE).perform();
			}

			Thread.sleep(2000);
			act.sendKeys(st01FF2).perform();
			Thread.sleep(2000);
			act.sendKeys(Keys.ENTER).perform();
			Thread.sleep(2000);
			act.sendKeys(Keys.HOME).perform();
			for (int a = 0; a <= 30; a++) {

				act.sendKeys(Keys.DELETE).perform();
			}
			Thread.sleep(500);

//			
			act.sendKeys(Keys.TAB).perform();
			Thread.sleep(500);
			FirefighterField2.click();
			Thread.sleep(500);
			act.sendKeys(st02FF1).perform();
			Thread.sleep(500);
			act.sendKeys(Keys.ENTER).perform();
			Thread.sleep(1000);
			act.sendKeys(Keys.TAB).perform();
			Thread.sleep(500);

			break;
		}

		default:
			System.out.println(RED + "UserType ");

		}

		// Generate alarm
		saveTestAlarm.click();
		Thread.sleep(1000);
		yesCreate.click();
		Thread.sleep(5000);

		String firtsTestAlarm1 = bhupeshFirstTestAlarm.getText();

		firtsTestAlarm1 = firtsTestAlarm1.replace("...", "").trim();
		title = title.replace("...", "").trim();

		Assert.assertTrue(title.contains(firtsTestAlarm1), RED + "Alarm not added.");

		System.out.println(GREEN + title);

	}

	public void deactiveAllActiveAlarms(WebDriver driver) throws Throwable {

		alarmStatus.click();
		Thread.sleep(1000);
		alarmStatusActive.click();
		Thread.sleep(1000);
		alarmStatusOk.click();
		Thread.sleep(2000);
		itemPepage100.click();
		Thread.sleep(5000);

		int totalAlarms = 0;

		for (int batch = 1; batch <= 1000; batch++) {
			int count = activeAlarmCount.size();

			if (count == 0) {
				break;
			}

			System.out.println("Alarm Number " + batch + " deactivation is in progress. Please wait.");

			firstActiveButton.click();
			Thread.sleep(2000);

			yesClose.click();
			Thread.sleep(2000);

//			driver.navigate().refresh();
//			Thread.sleep(3000);

			totalAlarms++;
		}

		System.out.println("The deactivation has been completed.");
		System.out.println(GREEN + "Total >>>>>" + totalAlarms + "<<<<< alarms deactive successfully.");

		refreshFilter.click();
		Thread.sleep(2000);

	}

	public void deactiveBgTestActiveAlarmsFromPlaningList(WebDriver driver) throws Throwable {
		Actions act = new Actions(driver);

		mangeTestAlarm.click();
		Thread.sleep(2000);

		refreshFilter.click();
		Thread.sleep(1000);

		Thread.sleep(2000);
		itemPepage100.click();
		Thread.sleep(5000);

		titleSearch.click();
		Thread.sleep(500);

		titleSearchField.click();
		Thread.sleep(500);

		act.sendKeys("bg").perform();

		titleSearchFieldOk.click();
		Thread.sleep(3000);

		alarmStatus.click();
		Thread.sleep(1000);
		alarmStatusActive.click();
		Thread.sleep(1000);
		alarmStatusOk.click();
		Thread.sleep(2000);
		itemPepage100.click();
		Thread.sleep(5000);

		int totalAlarms = 0;

		for (int batch = 1; batch <= 15; batch++) {
			int count = activeAlarmCount.size();

			if (count == 0) {
				break;
			}

			System.out.println("Alarm Number " + batch + " deactivation is in progress. Please wait.");

			firstActiveButton.click();
			Thread.sleep(2000);

			yes.click();
			Thread.sleep(2000);

//			driver.navigate().refresh();
//			Thread.sleep(3000);

			totalAlarms++;
		}

		System.out.println("The deactivation has been completed.");
		System.out.println(GREEN + "Total >>>>>" + totalAlarms
				+ "<<<<< BG alarms were successfully deactivated from the Planning List.");

		refreshFilter.click();
		Thread.sleep(2000);

	}

}
