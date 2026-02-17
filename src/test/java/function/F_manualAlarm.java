package function;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.List;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

public class F_manualAlarm extends b_baseClass {

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

	@FindBy(xpath = "//span[text()=\"Generate Alarm\" or text()=\"Alarmieren\"]")
	private WebElement generateAlarm;
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

	@FindBy(xpath = "//div[text()=\"Fire Fighters\" or text()=\"Benutzer\"]")
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

	@FindBy(xpath = "//td[contains(text(), 'Bg') or contains(text(), 'BG')]")
	private List<WebElement> BGAlarm;
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
	@FindBy(xpath = "(//td[@role=\"gridcell\"])[4]")
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
	@FindBy(xpath="//div[text()=\"ADST06V1\"]")private WebElement adst06v1Title ;
	 @FindBy(xpath="//div[text()=\"ADST06A2\"]")private WebElement adst06a2Title;
	 @FindBy(xpath="//div[text()=\"ADST06R2\"]")private WebElement adst06r2Title;
	 @FindBy(xpath="//input[@id=\"dx_dx-cc86a369-4c64-ff4b-3ebb-4a9202321cb4_selectedUsers[786689f549defc0f094e283fcc6a8ba8f5c44494]\"]")private WebElement firefighterField;
	 @FindBy(xpath="//div[text()=\"Jonas2 Jonas02\"]")private WebElement jonas2Title;
	@FindBy(xpath="//div[@aria-label=\"ben2 ben02\"]")private WebElement ben2Title;
	 @FindBy(xpath="//div[@aria-label=\"ADST07R2\"]")private WebElement adst07r2Title;
	 
	 @FindBy(xpath="(//input[@role='combobox'])[3]")private WebElement stationNameList;
	@FindBy(xpath="//input[@role='combobox' and @aria-haspopup='listbox']")private WebElement vehicleNameList;
	 @FindBy(xpath="//input[@role='combobox' and @placeholder='Select...']")private WebElement attributeNameList;
	@FindBy(xpath="//div[contains(@class,'dx-tagbox-popup-wrapper')]")private WebElement station01ResourceNameList;
	 @FindBy(xpath="//input[@role='combobox' and @aria-haspopup='listbox']")private WebElement station02ResourceNameList;
	@FindBy(xpath="//input[@role='combobox' and @aria-haspopup='listbox']")private WebElement station01FirefighterNameList;
		@FindBy(xpath="//div[contains(@class,'dx-tagbox')]//input[@role='combobox']")private WebElement station02FirefighterNameList;
		// @FindBy(xpath="")private WebElement ;
		// @FindBy(xpath="")private WebElement ;
		// @FindBy(xpath="")private WebElement ;
		// @FindBy(xpath="")private WebElement ;
		// @FindBy(xpath="")private WebElement ;
		// @FindBy(xpath="")private WebElement ;
		// @FindBy(xpath="")private WebElement ;

	public F_manualAlarm(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void TCManualAlarmMSCheckingValidation(WebDriver driver, String St1N, String St2N, String gTodaysDate,
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

		if (stationNameList.isDisplayed() ) {
			System.out.println(GREEN + "TC_Alarm_005 — Verify that the station list is displayed");
		}

		// Select Fire Stations
		act.sendKeys(St1N).perform();
		Thread.sleep(2000);

		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(500);

		act.sendKeys(St2N).perform();
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
		generateAlarm.click();
		Thread.sleep(500);
		if (pleaseSelectAtLeastOneAttributeValidation.isDisplayed()) {
			System.out.println(GREEN + "TC_Alarm_013 — Verify the visibility of Attribute validation");
		}
		
		vehicleField1.click();
		Thread.sleep(500);
		
		
		if (vehicleNameList.isDisplayed() ) {
			System.out.println(
					GREEN + "TC_Alarm_014 — Verify the visibility of vehicle list");
		}
		
		attributeField.click();
		Thread.sleep(500);
		if (attributeNameList.isDisplayed() ) {
			System.out.println(
					GREEN + "TC_Alarm_015 — Verify the visibility of Attribute list");
		}
		

		
		userTypeResource.click();
		Thread.sleep(500);
		generateAlarm.click();
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
		generateAlarm.click();
		Thread.sleep(1000);

		if (pleaseSelectAtLeastOneFirefighter.isDisplayed()) {
			System.out.println(GREEN + "TC_Alarm_019 — Verify the visibility of Firefighter validation");
		}
		
		vehicleField1.click();
		Thread.sleep(500);
		
		if (vehicleNameList.isDisplayed() ) {
			System.out.println(
					GREEN + "TC_Alarm_020 — Verify the visibility of vehicle list");
		}
		act.sendKeys(Keys.TAB).perform();
		Thread.sleep(1000);
		act.sendKeys("0").perform();
		Thread.sleep(1000);
		
		if (station01FirefighterNameList.isDisplayed() ) {
			System.out.println(
					GREEN + "TC_Alarm_021 — Verify the visibility of 1st Station firefighter list");
		}
		
		act.sendKeys(Keys.TAB).perform();
		Thread.sleep(1000);
		act.sendKeys("0").perform();
		Thread.sleep(1000);
		
		if (station02FirefighterNameList.isDisplayed() ) {
			System.out.println(
					GREEN + "TC_Alarm_022 — Verify the visibility of 2nd Station firefighter list");
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

	public void manualAlarmCommon(WebDriver driver, String deptN, String branchName) throws Throwable {

		Thread.sleep(2000);

//			

		switch (branchName) {
		case "1": {
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

	public void manualAlarmByNewEscResource(WebDriver driver, String st01N, String gTodaysDate, String gtimeHHMMSS)
			throws Throwable {

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

		/* Address */
		alarmAddress.click();
		act.sendKeys("Tapasya Vidya Mandir, 4446+52G, Vinkar Colony, Manewada, Nagpur, Maharashtra 440024").perform();

		/* Navigate Tabs */
		for (int i = 0; i <= 9; i++) {
			act.sendKeys(Keys.TAB).perform();
		}

		/* Additional Information */
		additionalAddressInformation.click();

		alarmObject.click();
		act.sendKeys("hospital").perform();

		alarmFloor.click();
		act.sendKeys("ground floor").perform();

		alarmAnnotation.click();
		act.sendKeys("alarm annotation").perform();

		act.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();

		/* Resource Selection */
		userTypeResource.click();
		Thread.sleep(1000);

		resourceField1.click();
		Thread.sleep(500);

		/* Read Resource from Excel */
		File src = new File(".\\DataFiles\\DetailsFile.xlsx");
		FileInputStream ipt = new FileInputStream(src);
		XSSFWorkbook wb11 = new XSSFWorkbook(ipt);
		XSSFSheet sheet11 = wb11.getSheetAt(0);

		NewResourceEsc = sheet11.getRow(24).getCell(1).getStringCellValue();

		act.sendKeys(NewResourceEsc).perform();
		Thread.sleep(500);
		act.sendKeys(Keys.ENTER).perform();

		/* Generate Alarm */
		generateAlarm.click();
		Thread.sleep(1000);
		yesCreate.click();
		Thread.sleep(2000);

		String expectedTitle = firstItemTitle.getText();

		Assert.assertTrue(title.contains(expectedTitle), RED + "Alarm not added.");

		System.out.println(GREEN + title+GREEN);

	}

	public void manualAlarmByNewREsource(WebDriver driver, String st01N, String gTodaysDate, String gtimeHHMMSS)
			throws Throwable {

		Actions actions = new Actions(driver);

		// Create new alarm
		createNewButton.click();
		Thread.sleep(1000);

		// Fire station selection
		fireStationField.click();
		Thread.sleep(500);
		actions.sendKeys(st01N).perform();
		Thread.sleep(500);
		actions.sendKeys(Keys.ENTER).perform();

		// Alarm keyword
		alarmKeyword.click();
		String title = "BG-MA by new resource-" + gTodaysDate + "_" + gtimeHHMMSS;
		actions.sendKeys(title).perform();

		// Alarm image
		alarmImage.click();
		actions.sendKeys("Image-manual alarm by new resource").perform();

		// Description
		descriptionField.click();
		actions.sendKeys("Checking manual alarm by new resource").perform();

		// Priority
		priority.click();
		Thread.sleep(500);

		// Reporter details
		reporter.click();
		Thread.sleep(1000);
		reporterName.click();
		actions.sendKeys("Dr. Nikhil").perform();

		reporterStreet.click();
		actions.sendKeys("Kharbi Road, Nagpur").perform();

		reporterZipCode.click();
		actions.sendKeys("440009").perform();

		reporterMobileNo.click();
		actions.sendKeys("1122334455").perform();

		reporterCallback.click();
		actions.sendKeys("10").perform();

		// Keyboard navigation
		Robot robot = new Robot();
		actions.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).sendKeys(Keys.TAB).perform();

		// Incident details
		actions.sendKeys("fire at hospital.").perform();
		actions.sendKeys(Keys.TAB).sendKeys(Keys.TAB).perform();

		Thread.sleep(500);
		robot.mouseWheel(5);
		actions.sendKeys(Keys.ENTER).perform();

		// Address
		alarmAddress.click();
		actions.sendKeys("Tapasya Vidya Mandir, 4446+52G, Vinkar Colony, Manewada, Nagpur, Maharashtra 440024")
				.perform();

		// Tab navigation
		for (int i = 0; i <= 9; i++) {
			actions.sendKeys(Keys.TAB).perform();
		}

		// Additional information
		additionalAddressInformation.click();

		alarmObject.click();
		actions.sendKeys("hospital").perform();

		alarmFloor.click();
		actions.sendKeys("ground floor").perform();

		alarmAnnotation.click();
		actions.sendKeys("alarm annotation").perform();

		actions.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();

		// Resource selection
		userTypeResource.click();
		Thread.sleep(1000);

		resourceField1.click();
		Thread.sleep(500);

		// Read resource from Excel
		File src = new File(".\\DataFiles\\DetailsFile.xlsx");
		FileInputStream ipt = new FileInputStream(src);
		XSSFWorkbook wb11 = new XSSFWorkbook(ipt);
		XSSFSheet sheet11 = wb11.getSheetAt(0);

		NewResource = sheet11.getRow(21).getCell(1).getStringCellValue();

		// Select resource
		actions.sendKeys(NewResource).perform();
		Thread.sleep(500);
		actions.sendKeys(Keys.ENTER).perform();

		// Generate alarm
		generateAlarm.click();
		Thread.sleep(1000);
		yesCreate.click();
		Thread.sleep(5000);

		String expectedTitle = firstItemTitle.getText();

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

		// Open action menu
		action.click();
		Thread.sleep(1000);

		int z = buttonCount.size();

		if (z == 6) {

			// Open chat
			alarmChat.click();
			Thread.sleep(1000);

			writemessageField.click();
			Thread.sleep(1000);
			String message = "Message for manual User_" + gTodaysDate + "_" + gtimeHHMMSS;

			act.sendKeys(message).perform();
			sendmessageButton.click();
			Thread.sleep(2000);

			String expectedTitle = messageText.getText().split("\\n")[0].trim();
//			    System.out.println(expectedTitle);

			Assert.assertTrue(message.contains(expectedTitle), RED + "Message not sent.");

			System.out.println(GREEN + message + " sent successfuly ");

			// Navigate back to alarm list
			manualAlarmModule.click();

			if (branchName.equals("1") || branchName.equals("1.5")) {

				manageAlarmL.click();
				Thread.sleep(2000);

			} else if (branchName.equals("2") || branchName.equals("2.5")) {

				manageAlarmT.click();
				Thread.sleep(2000);

			} else if (branchName.equals("3") || branchName.equals("3.5")) {

				manageAlarmD.click();
				Thread.sleep(2000);
			}

			refreshFilter.click();
			Thread.sleep(2000);

		} else {

			Thread.sleep(2000);
			driver.navigate().refresh();
			Thread.sleep(2000);
			Reporter.log(RED + "Chat option not found.", true);
		}

	}

	public void sendMessageToOldApiAlarmUser(WebDriver driver,String ManualAlarmNameForChatOldApi, String branchName) throws Throwable {
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

		// Open action menu
		action.click();
		Thread.sleep(1000);

		int z = buttonCount.size();

		if (z == 6) {

			// Open chat
			alarmChat.click();
			Thread.sleep(1000);

			writemessageField.click();
			String message = "message-New old alarm users";
			act.sendKeys(message).perform();
			Thread.sleep(500);
			sendmessageButton.click();
			Thread.sleep(1500);

			String expectedTitle = messageText.getText().split("\\n")[0].trim();
			Assert.assertTrue(message.contains(expectedTitle), RED + "Message not sent.");

			System.out.println(GREEN + message + " sent successfuly ");

			sendmessageButton.click();
			Thread.sleep(2000);

			// Navigate back to alarm list
			manualAlarmModule.click();

			if (branchName.equals("1") || branchName.equals("1.5")) {

				manageAlarmL.click();
				Thread.sleep(2000);

			} else if (branchName.equals("2") || branchName.equals("2.5")) {

				manageAlarmT.click();
				Thread.sleep(2000);

			} else if (branchName.equals("3") || branchName.equals("3.5")) {

				manageAlarmD.click();
				Thread.sleep(2000);
			}

			refreshFilter.click();
			Thread.sleep(2000);

		} else {

			Thread.sleep(2000);
			Reporter.log(RED + "Chat option not found.", true);
		}

	}

	public void sendMessageToNewApiAlarmUser(WebDriver driver, String branchName) throws Throwable {
		Actions act = new Actions(driver);

		// Search alarm
		titleSearch.click();
		Thread.sleep(500);

		titleSearchField.click();
		Thread.sleep(500);

		act.sendKeys("BG- New APi ex st 06 from 07 LP").perform();
		Thread.sleep(1000);

		titleSearchFieldOk.click();
		Thread.sleep(5000);

		// Open action menu
		action.click();
		Thread.sleep(1000);

		int z = buttonCount.size();

		if (z == 6) {

			// Open chat
			alarmChat.click();
			Thread.sleep(1000);

			writemessageField.click();
			Thread.sleep(1000);
			String message = "Text message sent to the new API alarm user.";
			act.sendKeys(message).perform();

			sendmessageButton.click();
			Thread.sleep(1000);

			String expectedTitle = messageText.getText().split("\\n")[0].trim();
			Assert.assertTrue(message.contains(expectedTitle), RED + "Message not sent.");

			System.out.println(GREEN + message + " sent successfuly ");

			/* -------- IMAGE ATTACHMENT -------- */
			act.moveToElement(attachFile).click().perform();
			Thread.sleep(1000);

			StringSelection ss = new StringSelection(
					"C:\\Users\\BHUPESH\\Desktop\\SampleFiles\\sampleImage_2.21mb.jpg");
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

			writemessageField.click();
			Thread.sleep(1000);
			String message1 = "Image file message sent to the new API alarm user.";
			act.sendKeys(message1).perform();
			Thread.sleep(2000);

			sendmessageButton.click();
			expectedTitle = messageText.getText().split("\\n")[0].trim();
			Assert.assertTrue(message1.contains(expectedTitle), RED + "Message not sent.");

			System.out.println(GREEN + message1 + " sent successfuly ");

			/* -------- PDF ATTACHMENT -------- */
			Thread.sleep(1000);
			act.moveToElement(attachFile).click().perform();
			Thread.sleep(1000);

			StringSelection ss1 = new StringSelection("C:\\Users\\BHUPESH\\Desktop\\SampleFiles\\samplePdf_5.4mb.pdf");
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

			writemessageField.click();
			Thread.sleep(1000);
			String message2 = "Pdf file message sent to the new API alarm user.";
			act.sendKeys(message2).perform();
			Thread.sleep(2000);
			sendmessageButton.click();
			Thread.sleep(2000);

			sendmessageButton.click();
			expectedTitle = messageText.getText().split("\\n")[0].trim();
			Assert.assertTrue(message2.contains(expectedTitle), RED + "Message not sent.");

			System.out.println(GREEN + message2 + " sent successfuly ");

			/* -------- WORD FILE ATTACHMENT -------- */
			Thread.sleep(1000);
			act.moveToElement(attachFile).click().perform();
			Thread.sleep(1000);

			StringSelection ss2 = new StringSelection("C:\\Users\\BHUPESH\\Desktop\\SampleFiles\\sample_WordFile.docx");
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

			writemessageField.click();
			Thread.sleep(1000);
			String message3 = "Word file message sent to the new API alarm user.";
			act.sendKeys(message3).perform();
			Thread.sleep(2000);
			sendmessageButton.click();

			expectedTitle = messageText.getText().split("\\n")[0].trim();
			Assert.assertTrue(message3.contains(expectedTitle), RED + "Message not sent.");

			System.out.println(GREEN + message3 + " sent successfuly ");

			/* -------- NAVIGATION BACK -------- */
			Thread.sleep(2000);
			manualAlarmModule.click();

			if (branchName.equals("1") || branchName.equals("1.5")) {
				manageAlarmL.click();
				Thread.sleep(2000);

			} else if (branchName.equals("2") || branchName.equals("2.5")) {
				manageAlarmT.click();
				Thread.sleep(2000);

			} else if (branchName.equals("3") || branchName.equals("3.5")) {
				manageAlarmD.click();
				Thread.sleep(2000);
			}

			refreshFilter.click();
			Thread.sleep(2000);

		} else {

			Thread.sleep(2000);
			Reporter.log(RED + "Chat option not found.", true);
		}

	}

	public void manualAlarmByOldEsclationTemplateFromSt02ToSt01(WebDriver driver, String oldEscTemplateSt02ToSt01)
			throws Throwable {

		Actions act = new Actions(driver);

		Thread.sleep(2000);
		createNewButton.click();
		Thread.sleep(2000);

		templateField.click();
		Thread.sleep(2000);

		act.sendKeys(oldEscTemplateSt02ToSt01).perform();
		Thread.sleep(2000);

		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);

		user$resource.click();
		Thread.sleep(2000);

		generateAlarm.click();
		Thread.sleep(2000);

		yesCreate.click();
		Thread.sleep(5000);
		String title = "BG_Template alarm Escalate from st 07 to st 06";
		String expectedTitle = firstItemTitle.getText();

		Assert.assertTrue(title.contains(expectedTitle), RED + "Alarm not created.");

		System.out.println(GREEN + title);

	}

	public void manualaByAttributeExtend1StStResource(WebDriver driver, String St2N, String gTodaysDate,
			String gtimeHHMMSS, String St2V1, String st02A1, String St1N, String branchName, String st01REsc)
			throws Throwable {
		Actions act = new Actions(driver);
		String filePath = ".\\DataFiles\\DetailsFile.xlsx";

		// Create new alarm
		createNewButton.click();
		Thread.sleep(100);

		fireStationField.click();
		Thread.sleep(500);
		act.sendKeys(St2N).perform();
		Thread.sleep(500);
		act.sendKeys(Keys.ENTER).perform();

		// Alarm details
		alarmKeyword.click();
		String title = "BG-MA by attribute for extend-" + gTodaysDate + "_" + gtimeHHMMSS;
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

		// Address
		alarmAddress.click();
		act.sendKeys("BAPS Swaminarayan mandir, Wathoda Layout, Nagpur, Maharashtra 440035").perform();

		// Tab navigation
		for (int i = 0; i <= 9; i++) {
			act.sendKeys(Keys.TAB).perform();
		}

		// Additional address information
		additionalAddressInformation.click();

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
		act.sendKeys(St2V1).perform();
		Thread.sleep(500);
		act.sendKeys(Keys.ENTER).perform();

		attributeField.click();
		act.sendKeys(st02A1).perform();
		Thread.sleep(1000);
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(1000);

		act.sendKeys(Keys.TAB).perform();

		// Generate alarm
		generateAlarm.click();
		Thread.sleep(500);
		yesCreate.click();
		Thread.sleep(5000);

		String expectedTitle = firstItemTitle.getText();

		Assert.assertTrue(title.contains(expectedTitle), RED + "Alarm not added.");

		System.out.println(GREEN + "Alarm created.");

		// Search created alarm
		titleSearch.click();
		Thread.sleep(500);

		titleSearchField.click();
		Thread.sleep(500);
		act.sendKeys("BG-MA by attribute for extend-" + gTodaysDate + "_" + gtimeHHMMSS).perform();

		Thread.sleep(1000);
		titleSearchFieldOk.click();
		Thread.sleep(2000);

		// Extend alarm
		action.click();
		Thread.sleep(1000);
		addExtension.click();
		Thread.sleep(2000);

		extendStation.click();
		Thread.sleep(1000);
		act.sendKeys(St1N).perform();
		Thread.sleep(1000);
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(1000);

		userTypeResource.click();
		Thread.sleep(3000);

		act.sendKeys(Keys.TAB).perform();
		Thread.sleep(1000);
		act.sendKeys(st01REsc).perform();
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
		String expectedTitle1 = firstItemTitle.getText();

		Assert.assertTrue(title.contains(expectedTitle1), RED + "Alarm not added.");

		System.out.println(GREEN + "Alarm extended.");

	}

	public void manualAlarmByEscResourceMS(WebDriver driver, String St2N, String gTodaysDate, String gtimeHHMMSS,
			String st02REsc) throws Throwable {

		Actions act = new Actions(driver);

		// Create new alarm
		createNewButton.click();
		Thread.sleep(1000);

		// Fire station selection
		fireStationField.click();
		Thread.sleep(500);
		act.sendKeys(St2N).perform();
		Thread.sleep(500);
		act.sendKeys(Keys.ENTER).perform();

		// Alarm details
		alarmKeyword.click();
		String title = "BG-MA by Esc resource MS-" + gTodaysDate + "_" + gtimeHHMMSS;
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

		// Address
		alarmAddress.click();
		act.sendKeys("Tapasya Vidya Mandir, 4446+52G, Vinkar Colony, Manewada, Nagpur, Maharashtra 440024").perform();

		// Tab navigation
		for (int i = 0; i <= 9; i++) {
			act.sendKeys(Keys.TAB).perform();
		}

		// Additional address info
		additionalAddressInformation.click();

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

		// Generate alarm
		generateAlarm.click();
		Thread.sleep(1000);
		yesCreate.click();
		Thread.sleep(2000);

		String expectedTitle = firstItemTitle.getText();

		Assert.assertTrue(title.contains(expectedTitle), RED + "Alarm not added.");

		System.out.println(GREEN + title);

	}

	public void manualAlarmByEscResourceSingleStation(WebDriver driver, String St1N, String gTodaysDate,
			String gtimeHHMMSS, String st01REsc) throws Throwable {

		Actions act = new Actions(driver);

		// Create new alarm
		createNewButton.click();
		Thread.sleep(500);

		// Fire station selection
		fireStationField.click();
		Thread.sleep(100);

		act.sendKeys(St1N).perform();
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

		// Address
		alarmAddress.click();
		act.sendKeys("Tapasya Vidya Mandir, 4446+52G, Vinkar Colony, Manewada, Nagpur, Maharashtra 440024").perform();

		// Tab navigation
		for (int i = 0; i <= 9; i++) {
			act.sendKeys(Keys.TAB).perform();
		}

		// Additional address info
		additionalAddressInformation.click();

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

		act.sendKeys(Keys.TAB).perform();

		// Generate alarm
		generateAlarm.click();
		Thread.sleep(1000);
		yesCreate.click();
		Thread.sleep(2000);

//			
		String expectedTitle = firstItemTitle.getText();

		Assert.assertTrue(title.contains(expectedTitle), RED + "Alarm not added.");

		System.out.println(GREEN + title);

	}

	public void manualaByAttributeMSLP(WebDriver driver, String St1N, String St2N, String gTodaysDate,
			String gtimeHHMMSS, String St1V1, String St1V2, String St2V1, String st01A1, String st02A1)
			throws Throwable {

		Actions act = new Actions(driver);

		// Create new alarm
		createNewButton.click();
		Thread.sleep(1000);

		// Fire station selection (multiple)
		fireStationField.click();
		Thread.sleep(500);

		act.sendKeys(St1N).perform();
		Thread.sleep(1000);
		act.sendKeys(Keys.ENTER).perform();

		Thread.sleep(1000);
		act.sendKeys(St2N).perform();
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

		// Address
		alarmAddress.click();
		act.sendKeys("BAPS Swaminarayan mandir, Wathoda Layout, Nagpur, Maharashtra 440035").perform();

		// Tab navigation
		for (int i = 0; i <= 9; i++) {
			act.sendKeys(Keys.TAB).perform();
		}

		// Additional address info
		additionalAddressInformation.click();

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
		act.sendKeys(St1V1).perform();
		Thread.sleep(500);
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(1000);
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).perform();

		// Vehicle 2
		act.sendKeys(St1V2).perform();
		Thread.sleep(500);
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(1000);
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).perform();

		// Vehicle 3
		act.sendKeys(St2V1).perform();
		Thread.sleep(500);
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(1000);

		// Attribute selection
		attributeField.click();

		act.sendKeys(st01A1).perform();
		Thread.sleep(500);
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(1000);
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).perform();

		act.sendKeys(st02A1).perform();
		Thread.sleep(500);
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(1000);

		act.sendKeys(Keys.TAB).perform();

		// Generate alarm
		generateAlarm.click();
		Thread.sleep(500);
		yesCreate.click();
		Thread.sleep(2000);

		String expectedTitle = firstItemTitle.getText();

		Assert.assertTrue(title.contains(expectedTitle), RED + "Alarm not added.");

		System.out.println(GREEN + title);

	}

	public void manualaByAttributeSingleStation(WebDriver driver, String St1N, String gTodaysDate, String gtimeHHMMSS,
			String St1V1, String St1V2, String st01A1) throws Throwable {

		Actions act = new Actions(driver);
		Robot robot = new Robot();

		// Create new alarm
		Thread.sleep(2000);
		createNewButton.click();

		Thread.sleep(2000);
		fireStationField.click();

		Thread.sleep(2000);
		act.sendKeys(St1N).perform();
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

		// Address
		alarmAddress.click();
		act.sendKeys("BAPS Swaminarayan mandir, Wathoda Layout, Nagpur, Maharashtra 440035").perform();

		// Tab navigation
		for (int i = 0; i <= 9; i++) {
			act.sendKeys(Keys.TAB).perform();
		}

		// Additional address info
		additionalAddressInformation.click();

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
		act.sendKeys(St1V1).perform();
		Thread.sleep(1000);
		act.sendKeys(Keys.ENTER).perform();

		Thread.sleep(1000);
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).perform();

		// Vehicle 2
		Thread.sleep(1000);
		act.sendKeys(St1V2).perform();
		Thread.sleep(1000);
		act.sendKeys(Keys.ENTER).perform();

		Thread.sleep(1000);
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).perform();

		// Attribute
		attributeField.click();

		act.sendKeys(st01A1).perform();
		Thread.sleep(1000);
		act.sendKeys(Keys.ENTER).perform();

		Thread.sleep(1000);
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).perform();

		Thread.sleep(1000);
		act.sendKeys(Keys.TAB).perform();

		// Generate alarm
		generateAlarm.click();
		Thread.sleep(1000);
		yesCreate.click();
		Thread.sleep(5000);

		String expectedTitle = firstItemTitle.getText();

		Assert.assertTrue(title.contains(expectedTitle), RED + "Alarm not added.");

		System.out.println(GREEN + title);

	}

	public void manualAlarmByResourceMs(WebDriver driver, String St1N, String St2N, String gTodaysDate,
			String gtimeHHMMSS, String st01R1, String st01R2) throws Throwable {

		Actions act = new Actions(driver);
		Robot robot = new Robot();

		// Create new alarm
		createNewButton.click();
		Thread.sleep(1000);

		fireStationField.click();
		Thread.sleep(1000);

		// Select Fire Stations
		act.sendKeys(St1N).perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(500);

		act.sendKeys(St2N).perform();
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

		// Alarm address
		alarmAddress.click();
		act.sendKeys("YES Hospital, Plot no. 1 & 1A, Dighori Flyover Square, Dighori, Nagpur, Maharashtra 440017")
				.perform();

		// Tab navigation
		for (int i = 0; i <= 9; i++) {
			act.sendKeys(Keys.TAB).perform();
		}

		// Additional address info
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

		// Generate alarm
		generateAlarm.click();
		Thread.sleep(500);
		yesCreate.click();
		Thread.sleep(500);

		String expectedTitle = firstItemTitle.getText();

		Assert.assertTrue(title.contains(expectedTitle), RED + "Alarm not added.");

		System.out.println(GREEN + title);

	}

	public void manualAlarmByFirefighterMs(WebDriver driver, String St1N, String St2N, String gTodaysDate,
			String gtimeHHMMSS, String St1V1, String St1V2, String St2V1, String st01FF1, String st02FF1)
			throws Throwable {

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
		act.sendKeys(St1N).perform();
		Thread.sleep(1000);
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);

		act.sendKeys(St2N).perform();
		Thread.sleep(500);
		act.sendKeys(Keys.ENTER).perform();

		// Alarm details
		alarmKeyword.click();
		String title = "BG-MA by firefighter-" + gTodaysDate + "_" + gtimeHHMMSS;
		act.sendKeys(title).perform();

		alarmImage.click();
		act.sendKeys("Image-manual alarm by firefighter checking.").perform();

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

		// Alarm address
		alarmAddress.click();
		act.sendKeys("YES Hospital, Plot no. 1 & 1A, Dighori Flyover Square, Dighori, Nagpur, Maharashtra 440017")
				.perform();

		// Tab navigation
		for (int i = 0; i <= 9; i++) {
			act.sendKeys(Keys.TAB).perform();
		}

		// Additional address info
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

		// Firefighter and vehicle selection
		userTypeFirefighter.click();
		Thread.sleep(1000);

		vehicleField1.click();
		Thread.sleep(1000);

		act.sendKeys(St1V1).perform();
		Thread.sleep(1000);
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(1000);

		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).perform();
		Thread.sleep(500);

		act.sendKeys(St1V2).perform();
		Thread.sleep(1000);
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(1000);

		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).perform();
		Thread.sleep(500);

		act.sendKeys(St2V1).perform();
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

		FirefighterField2.click();
		Thread.sleep(500);
		act.sendKeys(st02FF1).perform();
		Thread.sleep(500);
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(1000);

		// Generate alarm
		act.sendKeys(Keys.TAB).perform();
		generateAlarm.click();
		Thread.sleep(500);
		yesCreate.click();
		Thread.sleep(5000);

		String expectedTitle = firstItemTitle.getText();

		Assert.assertTrue(title.contains(expectedTitle), RED + "Alarm not added.");

		System.out.println(GREEN + title);

	}

	public void deleteManualAlarm(WebDriver driver) throws Throwable {
		Actions act = new Actions(driver);

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
			Thread.sleep(30000);

			totalAlarms += count;
		}

		System.out.println("The iteration has been completed.");
		System.out.println(GREEN + "Total >>>>>" + totalAlarms + "<<<<< alarms deleted successfully.");

		refreshFilter.click();
		Thread.sleep(2000);
	}

	// -----------------------
	// NAVIGATE BACK TO DASHBOARD
	// -----------------------
	public void backToOld() throws Throwable {
		refreshFilter.click();
		Thread.sleep(2000);

		dashbordMenu2.click();
		Thread.sleep(1000);

		dashboard2.click();
		Thread.sleep(2000);
	}

}
