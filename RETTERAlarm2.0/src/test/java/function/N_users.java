package function;

import static org.testng.Assert.assertTrue;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
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
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class N_users extends b_baseClass {

	@FindBy(xpath = "//span[text()=\"Administration\"]")
	private WebElement Administration;

	@FindBy(xpath = "//a[@href=\"https://admin.retteralarm.de/verify-user?returnUrl=/admin/users/list\"]")
	private WebElement manageUsersL;
	@FindBy(xpath = "//a[@href=\"http://admin.testing.retteralarm.de/verify-user?returnUrl=/admin/users/list\"]")
	private WebElement manageUsersT;

	@FindBy(xpath = "//i[@class=\"dx-icon dx-icon-refresh\"]")
	private WebElement refreshFilter;
	@FindBy(xpath = "//input[@placeholder=\"Search\"]")
	private WebElement searchField;
	@FindBy(xpath = "//div[@aria-label=\"Items per page: 100\"]")
	private WebElement itemPerPage100;
	@FindBy(xpath = "//span[@class=\"dx-checkbox-icon\"]")
	private WebElement selectAll;
	@FindBy(xpath = "(//div[@class=\"dx-button-content\"])[11]")
	private WebElement actionButton;
	@FindBy(xpath = "//dx-button[@class=\"dx-widget dx-button dx-button-mode-text dx-button-normal more-action-button delete-option\"]")
	private WebElement deleteUser;

	@FindBy(xpath = "(//span[@class=\"dx-button-text\" and text()=\"Remove\" or text()=\"Entfernen\"])[1]")
	private WebElement removeUser1;
	@FindBy(xpath = "//span[@class=\"dx-button-text\" and text()=\"Remove\" or text()=\"Entfernen\"]")
	private List<WebElement> removeUser;
	@FindBy(xpath = "//span[@class=\"dx-button-text\" and text()=\"Yes, Delete\" or text()=\"Ja, löschen\"]")
	private WebElement yesRemoveUser;
	@FindBy(xpath = "//span[@class=\"dx-datagrid-search-text\" and text()=\"@atplindia.in\"]")
	private List<WebElement> availableUserForDelete;
	@FindBy(xpath = "//span[@class=\"dx-datagrid-search-text\" and text()=\"@gtpl.in\"]")
	private List<WebElement> availableUserForDelete1;
	@FindBy(xpath = "//span[@class=\"dx-button-text\" and text()=\"Cancel\"]")
	private WebElement closePopUp;
	@FindBy(xpath = "//button[@class=\"btn-success btn-x30\"]")
	private WebElement createNew;
	@FindBy(xpath = "(//input[ @class='dx-texteditor-input' ])[3]")
	private WebElement emailField;
	@FindBy(xpath = "(//input[ @class='dx-texteditor-input' ])[4]")
	private WebElement firstNameField;
	@FindBy(xpath = "(//input[ @class='dx-texteditor-input' ])[5]")
	private WebElement lastNameField;
	@FindBy(xpath = "(//input[ @class='dx-texteditor-input' ])[6]")
	private WebElement dateOfBirth;
	@FindBy(xpath = "(//input[ @class='dx-texteditor-input' ])[7]")
	private WebElement countryField;
	@FindBy(xpath = "(//input[ @class='dx-texteditor-input' ])[10]")
	private WebElement idField;
	@FindBy(xpath = "(//input[ @class='dx-texteditor-input' ])[11]")
	private WebElement qrField;
	@FindBy(xpath = "(//input[ @class='dx-texteditor-input' ])[12]")
	private WebElement dobField;
	@FindBy(xpath = "//div[text()=\" Choose this option to set password here \"]")
	private WebElement setPassword;
	@FindBy(xpath = "(//input[ @class='dx-texteditor-input' ])[13]")
	private WebElement passwordField;
	@FindBy(xpath = "//span[text()=\"Save & Continue\"]")
	private WebElement saveAndContinue;
	@FindBy(xpath = "//span[text()=\"Fire Fighter\"]")
	private WebElement firfighterRole;
	@FindBy(xpath = "//span[text()=\"New\"]")
	private WebElement newButton;
	@FindBy(xpath = "//div[@class=\"dx-radiobutton-icon\"]")
	private WebElement mainStation;
	@FindBy(xpath = "//a[@title=\"Save\"]")
	private WebElement saveChange;

	@FindBy(xpath = "//span[text()=\"Save\"]")
	private WebElement saveRole;

	@FindBy(xpath = "//span[text()=\"Next\"]")
	private WebElement next;
	@FindBy(xpath = "//span[text()=\"Weblogin\"]")
	private WebElement per_weblogin;
	@FindBy(xpath = "//span[text()=\"Show all alarms\"]")
	private WebElement per_showAllAlarms;
	@FindBy(xpath = "//span[text()=\"Availability overview\"]")
	private WebElement PER_AvailabilityOverview;
	@FindBy(xpath = "//span[text()=\"Feedback on events\"]")
	private WebElement feedbackOnEvents;
	// @FindBy(xpath="") private WebElement ;

	@FindBy(xpath = "(//span[@class=\"dx-button-text\" and text()=\"New\"])[1]")
	private WebElement addEmail;
	@FindBy(xpath = "(//div[@class=\"dx-switch-handle\"])[1]")
	private WebElement emailForAlarm;
	@FindBy(xpath = "(//div[@class=\"dx-switch-handle\"])[2]")
	private WebElement emailForInfo;
	@FindBy(xpath = "(//div[@class=\"dx-switch-handle\"])[3]")
	private WebElement emailForAvailabilityRequest;

	@FindBy(xpath = "(//span[@class=\"dx-button-text\" and text()=\"New\"])[2]")
	private WebElement addNumber;
	@FindBy(xpath = "(//div[@class=\"dx-switch-handle\"])[1]")
	private WebElement smsForAlarm;
	@FindBy(xpath = "(//div[@class=\"dx-switch-handle\"])[4]")
	private WebElement callForAlarm;
	@FindBy(xpath = "//dx-tag-box[@displayexpr=\"title\"]")
	private WebElement attributeField;
	@FindBy(xpath = "//dx-tag-box[@displayexpr=\"name\"]")
	private WebElement resourceField;
	@FindBy(xpath = "//span[@class=\"dx-button-text\" and text()=\"Finish\"]")
	private WebElement finish;
	@FindBy(xpath = "(//div[@class=\"dx-dropdowneditor-icon\"])[3]")
	private WebElement resourceAccordian;
	@FindBy(xpath = "//h4[text()=\"Attributes\"]")
	private WebElement attributeTem;

	// vehicle
	@FindBy(xpath = "//a[@href=\"https://admin.retteralarm.de/verify-user?returnUrl=/admin/manage-vehicle/list\"]")
	private WebElement manageVehicleL;
	@FindBy(xpath = "//a[@href=\"http://admin.testing.retteralarm.de/verify-user?returnUrl=/admin/manage-vehicle/list\"]")
	private WebElement manageVehicleT;

	@FindBy(xpath = "(//input[@aria-haspopup=\"listbox\"])[3]")
	private WebElement vehicleStationField;
	@FindBy(xpath = "(//dx-text-box[@validationmessagemode=\"always\"])[1]")
	private WebElement vehicleNameField;
	@FindBy(xpath = "(//dx-text-box[@validationmessagemode=\"always\"])[2]")
	private WebElement vehicleRadioCallNameField;
	@FindBy(xpath = "(//dx-text-box[@validationmessagemode=\"always\"])[3]")
	private WebElement vehicleIssiField;
	@FindBy(xpath = "(//dx-text-box[@validationmessagemode=\"always\"])[4]")
	private WebElement vehicleIdField;

	@FindBy(xpath = "//span[text()=\"Right to view checklist\"]")
	private WebElement rightToViewChecklistPermission;
	@FindBy(xpath = "//span[text()=\"Right to see File Section\"]")
	private WebElement righttoSeeFileSectionPermission;
	@FindBy(xpath = "//span[text()=\"Midtarget\"]")
	private WebElement MidtargetPermission;
	@FindBy(xpath = "//span[text()=\"Right to see alarm overview in app\"]")
	private WebElement rightToSeeAlarmOverviewInAppPermission;
	@FindBy(xpath = "//span[text()=\"Alarm Additional Information\"]")
	private WebElement alarmAdditionalInformationPermission;
	@FindBy(xpath = "//dx-tag-box[@valueexpr=\"id\"]")
	private WebElement resourceFieldForVehicle;
	@FindBy(xpath = "(//div[@class=\"dx-dropdowneditor-icon\"])[3]")
	private WebElement resourceAccordianForVehicle;
	@FindBy(xpath = "//span[@class=\"dx-datagrid-search-text\" and text()=\"BG\" or  text()=\"Bg\" or  text()=\"bg\" or  text()=\"bG\" ]")
	private List<WebElement> availableVehicleUserForDelete;
	@FindBy(xpath = "(//div [@class=\"dx-item dx-toolbar-item dx-toolbar-button\"])[3]")
	private WebElement delateAll;
	@FindBy(xpath = "///span[text()=\"Ja, löschen\" or text()=\"Yes, Delete\"]")
	private WebElement deleteAllYes;
	@FindBy(xpath = "//div[@aria-label=\"Yes, Delete\"]")
	private WebElement deleteYes;

	@FindBy(xpath = "(//tr[@class=\"dx-row dx-data-row dx-row-lines\"])")
	private WebElement getStationName;
	@FindBy(xpath = "(//td[@role='gridcell' and @aria-colindex='1'])[1]")
	private WebElement getEmail;
	@FindBy(xpath = "(//td[@role='gridcell' and @aria-colindex='1'])[2]")
	private WebElement getCountryCode;
	@FindBy(xpath = "(//td[@role='gridcell' and @aria-colindex='2'])[2]")
	private WebElement getContactNumber;
	@FindBy(xpath = "(//div[contains(@class,'dx-tag-content')]//span)[1]")
	private WebElement getAttributeName;
	@FindBy(xpath = "(//div[contains(@class,'dx-tag-content')]//span)[2]")
	private WebElement getResourceName;
	@FindBy(xpath = "(//td[@role=\"gridcell\" and @aria-colindex=\"5\"])[1]")
	private WebElement getAddedUserEmail;
	@FindBy(xpath = "(//td[@aria-colindex=\"3\"])[2]")
	private WebElement getFirstLatName;

	@FindBy(xpath = "//span[text()=\"Station\"]")
	private WebElement stationUserRole;
	@FindBy(xpath = "//input[@placeholder=\"Select Station\"]")
	private WebElement selecctStaion;
	@FindBy(xpath = "//span[text()=\"Generate\"]")
	private WebElement GeneratePassword;
	@FindBy(xpath = "//i[@class=\"dx-icon dx-icon-import\"]")
	private WebElement importIcon;
	@FindBy(xpath = "//span[text()=\"Select File\"]")
	private WebElement selectFile;

	@FindBy(xpath = "//span[text()=\"Import\"]")
	private WebElement Import;
	@FindBy(xpath = "(//td[@aria-colindex='7'])[last()-1]")
	private WebElement user1Status;
	@FindBy(xpath = "(//td[@aria-colindex=\"7\"])[last()]")
	private WebElement user2Status;
	@FindBy(xpath = "(//td[@aria-colindex=\"8\"])[last()-1]")
	private WebElement resultUser1;
	@FindBy(xpath = "(//td[@aria-colindex=\"8\"])[last()]")
	private WebElement resultUser2;
	// @FindBy(xpath="") private WebElement ;

	String filePAthImortUser;

	@FindBy(xpath = "//span[text()=\"Close\"]")
	private WebElement closePopUpImportUser;
	 @FindBy(xpath="//span[text()=\" Success \"]") private WebElement successMessage ;
	// @FindBy(xpath="") private WebElement ;
	// @FindBy(xpath="") private WebElement ;
	// @FindBy(xpath="") private WebElement ;
	// @FindBy(xpath="") private WebElement ;
	// @FindBy(xpath="") private WebElement ;
	// @FindBy(xpath="") private WebElement ;
	// @FindBy(xpath="") private WebElement ;
	// @FindBy(xpath="") private WebElement ;
	// @FindBy(xpath="") private WebElement ;
	// @FindBy(xpath="") private WebElement ;
	// @FindBy(xpath="") private WebElement ;
	// @FindBy(xpath="") private WebElement ;

	// @FindBy(xpath="") private WebElement ;
	// @FindBy(xpath="") private WebElement ;
	// @FindBy(xpath="") private WebElement ;
	// @FindBy(xpath="") private WebElement ;
	// @FindBy(xpath="") private WebElement ;
	// @FindBy(xpath="") private WebElement ;
	// @FindBy(xpath="") private WebElement ;
	// @FindBy(xpath="") private WebElement ;

	public N_users(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	public void updateUser (WebDriver driver, String branchName,String updateUserFilr, String gTodaysDate, String gtimeHHMMSS, String st01N, String st01R1) throws Throwable
	{
		
		Actions act = new Actions(driver);

		filePAthImortUser = updateUserFilr;
		
		FileInputStream in = new FileInputStream(filePAthImortUser);
		XSSFWorkbook wb = new XSSFWorkbook(in);
		XSSFSheet sheet = wb.getSheetAt(0);
		
		String firstName = "Bhupesh_"+ gTodaysDate +"_" + gtimeHHMMSS;
		String lastName  = "User_"+ gTodaysDate +"_" + gtimeHHMMSS;
		
		sheet.getRow(3).createCell(0).setCellValue(firstName);
		sheet.getRow(3).createCell(1).setCellValue(lastName);
		sheet.getRow(3).createCell(8).setCellValue(st01N);
		sheet.getRow(3).createCell(9).setCellValue(st01R1);
		
		in.close();

		// Write all values at once
		FileOutputStream out = new FileOutputStream(filePAthImortUser);
		wb.write(out);
		out.close();
		wb.close();
		
		importIcon.click();
		Thread.sleep(2000);
		
		selectFile.click();
		Thread.sleep(2000);
		
		
		StringSelection ss = new StringSelection(updateUserFilr);
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

		Import.click();
		Thread.sleep(4000);
		
		
		String expectedFirstName = driver.findElement(By.xpath("//td[starts-with(text(),'" + firstName + "')]")).getText();
		
		String expectedLasttName = driver.findElement(By.xpath("//td[starts-with(text(),'" + lastName + "')]")).getText();
		
		
//		System.out.println(expectedFirstName);
//		System.out.println(expectedLasttName);
		
		Assert.assertTrue(expectedFirstName.contains(firstName), RED + "Station not found.");
		Assert.assertTrue(expectedLasttName.contains(lastName), RED + "Station not found.");
		
		if (successMessage.isDisplayed())
		{
			System.out.println(GREEN+"user updated successfully. ");
		}
		else 
		{
			System.out.println(RED+"user not updated successfully. ");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		Thread.sleep(2000);
		act.moveToElement(closePopUpImportUser).click().build().perform();
		Thread.sleep(1000);

		
	}

	public void importUser(WebDriver driver, String branchName, String gTodaysDate, String gtimeHHMMSS, String st01N,
			String st02N, String germanyTodaysDate1, String resourceNewUser, String importUserFile) throws Throwable {

		Actions act = new Actions(driver);

		filePAthImortUser = importUserFile;

		FileInputStream in = new FileInputStream(filePAthImortUser);
		XSSFWorkbook wb = new XSSFWorkbook(in);
		XSSFSheet sheet = wb.getSheetAt(0);

		String lastNameAU = "ISS_" + gTodaysDate + "." + gtimeHHMMSS;
		String lastNameSU = "IMS_" + gTodaysDate + "." + gtimeHHMMSS;
//		String lastNameMR="SU_" + gTodaysDate + "." + gtimeHHMMSS";
//		
		String emailAU = "bhupesh" + ".iSS_" + gTodaysDate + "." + gtimeHHMMSS + "@atplindia.in";
		String emailSU = "bhupesh" + ".ims_" + gTodaysDate + "." + gtimeHHMMSS + "@atplindia.in";
//		String emailMU="bhupesh"+".mr_"+ gTodaysDate + "." + gtimeHHMMSS+"@atplindia.in";

		String contactNumber1 = germanyTodaysDate1 + gtimeHHMMSS + "01";
		String contactNumber2 = germanyTodaysDate1 + gtimeHHMMSS + "02";

		// System.out.println(emailAU);
		// System.out.println(emailSU);
		// System.out.println(emailMU);

		// User 01
		sheet.getRow(1).createCell(1).setCellValue(lastNameAU);
		sheet.getRow(1).createCell(2).setCellValue(emailAU);
		sheet.getRow(1).createCell(3).setCellValue(contactNumber1);
		sheet.getRow(1).createCell(8).setCellValue(st01N);
		sheet.getRow(1).createCell(9).setCellValue(resourceNewUser);

		// User 02
		sheet.getRow(2).createCell(1).setCellValue(lastNameSU);
		sheet.getRow(2).createCell(2).setCellValue(emailSU);
		sheet.getRow(2).createCell(3).setCellValue(contactNumber2);
		sheet.getRow(2).createCell(8).setCellValue(st01N + "," + st02N);
		sheet.getRow(2).createCell(9).setCellValue(resourceNewUser);

		in.close();

		// Write all values at once
		FileOutputStream out = new FileOutputStream(filePAthImortUser);
		wb.write(out);
		out.close();
		wb.close();

		importIcon.click();
		Thread.sleep(2000);
		selectFile.click();
		Thread.sleep(2000);

		StringSelection ss = new StringSelection(importUserFile);
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

		Import.click();
		Thread.sleep(4000);

		String Auser1Status = user1Status.getText();
		String Auser2Status = user2Status.getText();
//		System.out.println(Auser1Status);
//		System.out.println(Auser2Status);

		switch (Auser1Status) {

		case "Success": {
			System.out.println(GREEN + "Single station user imported successfully.");
			break;
		}

		case "Failed": {
			System.out.println(RED + "Failed to import single station user.");
			System.out.println(">>" + resultUser1.getText());
			break;
		}

		}

		switch (Auser2Status) {

		case "Success": {
			System.out.println(GREEN + "Multi station user imported successfully.");
			break;
		}

		case "Failed": {
			System.out.println(RED + "Failed to import Multi station user.");
			System.out.println(">>" + resultUser2.getText());
			break;
		}

		}

		Thread.sleep(1000);

		act.moveToElement(closePopUpImportUser).click().build().perform();
		Thread.sleep(1000);

	}

	public void addMultiRoleUser(WebDriver driver, String branchName, String st01N, String germanyTodaysDate1,
			String gtimeHHMMSS, String filePath, String attributeNewUser, String resourceNewUser) throws Throwable {
		Actions act = new Actions(driver);

		File src = new File(filePath);
		FileInputStream ipt = new FileInputStream(src);
		XSSFWorkbook wb11 = new XSSFWorkbook(ipt);
		XSSFSheet sheet11 = wb11.getSheetAt(0);

		email_FF = sheet11.getRow(45).getCell(1).getStringCellValue();
		lastName_FF = sheet11.getRow(47).getCell(1).getStringCellValue();

		stationUserRole.click();
		Thread.sleep(500);

		selecctStaion.click();
		Thread.sleep(500);

		act.sendKeys(st01N).perform();
		Thread.sleep(1000);
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(500);

		firfighterRole.click();
		Thread.sleep(500);
		newButton.click();
		Thread.sleep(500);
		act.sendKeys(st01N).perform();
		Thread.sleep(1000);
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(500);
		mainStation.click();
		Thread.sleep(1000);
		saveChange.click();
		Thread.sleep(500);

		act.moveToElement(saveRole).click().build().perform();
//		saveRole.click();
		Thread.sleep(2000);

		String actStationName = getStationName.getText();
//		System.out.println(st01N);
//		System.out.println(actStationName);
		Thread.sleep(2000);
		Assert.assertTrue(st01N.contains(actStationName), RED + "Station not found.");
		System.out.println(GREEN + "Firefighter role save successfully.");
		act.moveToElement(next).click().build().perform();
//		next.click();
		Thread.sleep(500);

//		per_weblogin.click();
		Thread.sleep(500);
		act.moveToElement(per_weblogin).click().build().perform();
		act.moveToElement(per_showAllAlarms).click().build().perform();
//		per_showAllAlarms.click();
		Thread.sleep(500);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView({block:'center'});", feedbackOnEvents);
		PER_AvailabilityOverview.click();
		Thread.sleep(500);
		act.moveToElement(saveRole).click().build().perform();

//		saveRole.click();
		Thread.sleep(2000);

		act.moveToElement(next).click().build().perform();
//		next.click();
		Thread.sleep(500);
//		act.sendKeys(Keys.ENTER).perform();
//		Thread.sleep(2000);
		System.out.println(GREEN + "permission save successfully.");

		addEmail.click();
		Thread.sleep(1000);

		act.sendKeys(email_FF).perform();
		Thread.sleep(500);
		emailForAlarm.click();
		Thread.sleep(500);
		emailForInfo.click();
		Thread.sleep(500);
		emailForAvailabilityRequest.click();
		Thread.sleep(500);

		act.moveToElement(saveChange).click().build().perform();
//		saveChange.click();
		Thread.sleep(500);

		addNumber.click();
		Thread.sleep(500);

//		act.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).build().perform();

		act.sendKeys(Keys.HOME).perform();
		Thread.sleep(200);

		for (int d = 0; d <= 15; d++) {
			act.sendKeys(Keys.DELETE).perform();

		}
		Thread.sleep(500);
		String CountryCode = "+91";
		act.sendKeys(CountryCode).perform();
		Thread.sleep(1000);
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(500);
		act.sendKeys(Keys.TAB).perform();
		Thread.sleep(500);

		String contactNoFFString = germanyTodaysDate1 + gtimeHHMMSS;

		long contactNoFF = Long.parseLong(contactNoFFString);

		act.sendKeys(String.valueOf(contactNoFF)).perform();

		FileInputStream in = new FileInputStream(filePath);
		XSSFWorkbook wb = new XSSFWorkbook(in);
		XSSFSheet sheet = wb.getSheetAt(0);

		Row row = sheet.createRow(48);//
		row.createCell(1).setCellValue(contactNoFF); // Cell B

		in.close();

		FileOutputStream out = new FileOutputStream(filePath);
		wb.write(out);
		out.close();
		wb.close();

		smsForAlarm.click();
		Thread.sleep(1000);
		callForAlarm.click();
		Thread.sleep(1000);

		act.moveToElement(saveChange).click().build().perform();
//		saveChange.click();
		Thread.sleep(500);

		act.moveToElement(saveRole).click().build().perform();
//		saveRole.click();
		Thread.sleep(2000);

		String actualCountryCode = getCountryCode.getText();
//		System.out.println(actualCountryCode);
//		System.out.println(CountryCode);
		Assert.assertTrue(CountryCode.contains(actualCountryCode), RED + "CountryCode not found");
		System.out.println(GREEN + "country  Code added successfully.");

		String actualgetContactNumber = getContactNumber.getText();
//		System.out.println(actualgetContactNumber);
//		System.out.println(contactNoFFString);
		Assert.assertTrue(contactNoFFString.contains(actualgetContactNumber), RED + "CountryCode not found");
		System.out.println(GREEN + "contact number added successfully.");

		next.click();
		Thread.sleep(2000);
//		System.out.println(GREEN + "Contact details save successfully.");

		attributeField.click();
		Thread.sleep(1000);
		act.sendKeys(attributeNewUser).perform();
		Thread.sleep(1000);
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(500);
		attributeTem.click();
		Thread.sleep(500);

		resourceField.click();
		Thread.sleep(1000);
		act.sendKeys(resourceNewUser).perform();
		Thread.sleep(1000);
		act.sendKeys(Keys.TAB, Keys.SPACE).perform();
		Thread.sleep(1000);

		resourceAccordian.click();
		Thread.sleep(1000);

		act.moveToElement(saveRole).click().build().perform();
//		saveRole.click();
		Thread.sleep(2000);

		String AtualgetAttributeName = getAttributeName.getText();
//		System.out.println(AtualgetAttributeName);
//		System.out.println(attributeNewUser);
		Assert.assertTrue(attributeNewUser.contains(AtualgetAttributeName), RED + "Attribute  not found");
		System.out.println(GREEN + "Attribute added successfully.");

		String atualgetResourceName = getResourceName.getText();
//		System.out.println(atualgetResourceName);
//		System.out.println(resourceNewUser);
		Assert.assertTrue(resourceNewUser.contains(atualgetResourceName), RED + "Attribute  not found");
		System.out.println(GREEN + "Resource added successfully.");

		act.moveToElement(next).click().build().perform();
//		next.click();
		Thread.sleep(1000);
//		System.out.println(GREEN + "Attribute and Resource save successfully.");

		act.moveToElement(finish).click().build().perform();
//		finish.click();
		Thread.sleep(2000);
		System.out.println(GREEN + "Multi role user added successfully.");

		refreshFilter.click();
		Thread.sleep(2000);

		String actualGetAddedUserEmail = getAddedUserEmail.getText();
//		System.out.println(actualGetAddedUserEmail);
//		System.out.println(email_FF);
//		Assert.assertTrue(email_FF.contains(actualGetAddedUserEmail), RED + "Attribute  not found");
		System.out.println(GREEN + "User added in list successfully.");

		System.out.println(">> now Checking added details.<<");

		String actualFirstName_FF = getFirstLatName.getText();
//		System.out.println(actualFirstName_FF);
//		System.out.println(lastName_FF);
		Assert.assertTrue(actualFirstName_FF.contains(lastName_FF), RED + " Last Name not found ");
		System.out.println(GREEN + " First and Last Name added correctly.");

		String actualEmail = getAddedUserEmail.getText();
//		System.out.println(actualEmail);
//		System.out.println(email_FF);
		Assert.assertTrue(email_FF.contains(actualEmail), RED + "Email not found.");
		System.out.println(GREEN + "email Added correctly.");

		Thread.sleep(2000);

	}

	public void addStataionUser(WebDriver driver, String branchName, String st01N, String filePath) throws Throwable {
		Actions act = new Actions(driver);

		File src = new File(filePath);
		FileInputStream ipt = new FileInputStream(src);
		XSSFWorkbook wb11 = new XSSFWorkbook(ipt);
		XSSFSheet sheet11 = wb11.getSheetAt(0);

		email_FF = sheet11.getRow(45).getCell(1).getStringCellValue();
		lastName_FF = sheet11.getRow(47).getCell(1).getStringCellValue();

		stationUserRole.click();
		Thread.sleep(500);

		selecctStaion.click();
		Thread.sleep(500);

		act.sendKeys(st01N).perform();
		Thread.sleep(1000);
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(500);

		act.moveToElement(saveRole).click().build().perform();

//		saveRole.click();
		Thread.sleep(2000);
		act.moveToElement(next).click().build().perform();
//		saveRole.click();
		Thread.sleep(2000);

		act.moveToElement(finish).click().build().perform();
//		finish.click();
		Thread.sleep(2000);
		System.out.println(GREEN + "The station user addition process has been completed.");

		refreshFilter.click();
		Thread.sleep(2000);

		String actualGetAddedUserEmail = getAddedUserEmail.getText();
//		System.out.println(actualGetAddedUserEmail);
//		System.out.println(email_FF);
//		Assert.assertTrue(email_FF.contains(actualGetAddedUserEmail), RED + "Attribute  not found");
		System.out.println(GREEN + "User added in list successfully.");

		System.out.println(">> now Checking added details.<<");

		String actualFirstName_FF = getFirstLatName.getText();
//		System.out.println(actualFirstName_FF);
//		System.out.println(lastName_FF);
		Assert.assertTrue(actualFirstName_FF.contains(lastName_FF), RED + " Last Name not found ");
		System.out.println(GREEN + " First and Last Name added correctly.");

		String actualEmail = getAddedUserEmail.getText();
//		System.out.println(actualEmail);
//		System.out.println(email_FF);
		Assert.assertTrue(email_FF.contains(actualEmail), RED + "Email not found.");
		System.out.println(GREEN + "email Added correctly.");

		Thread.sleep(2000);

	}

	public void addAppUser(WebDriver driver, String branchName, String st01N, String germanyTodaysDate1,
			String gtimeHHMMSS, String filePath, String attributeNewUser, String resourceNewUser) throws Throwable {
		Actions act = new Actions(driver);

		File src = new File(filePath);
		FileInputStream ipt = new FileInputStream(src);
		XSSFWorkbook wb11 = new XSSFWorkbook(ipt);
		XSSFSheet sheet11 = wb11.getSheetAt(0);

		email_FF = sheet11.getRow(45).getCell(1).getStringCellValue();
		lastName_FF = sheet11.getRow(47).getCell(1).getStringCellValue();

		firfighterRole.click();
		Thread.sleep(500);
		newButton.click();
		Thread.sleep(500);
		act.sendKeys(st01N).perform();
		Thread.sleep(1000);
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(500);
		mainStation.click();
		Thread.sleep(1000);
		saveChange.click();
		Thread.sleep(500);

		act.moveToElement(saveRole).click().build().perform();
//		saveRole.click();
		Thread.sleep(2000);

		String actStationName = getStationName.getText();
//		System.out.println(st01N);
//		System.out.println(actStationName);
		Thread.sleep(2000);
		Assert.assertTrue(st01N.contains(actStationName), RED + "Station not found.");
		System.out.println(GREEN + "Firefighter role save successfully.");
		act.moveToElement(next).click().build().perform();
//		next.click();
		Thread.sleep(500);

		per_weblogin.click();
		Thread.sleep(500);
		per_showAllAlarms.click();
		Thread.sleep(500);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView({block:'center'});", feedbackOnEvents);
		PER_AvailabilityOverview.click();
		Thread.sleep(500);
		act.moveToElement(saveRole).click().build().perform();

//		saveRole.click();
		Thread.sleep(2000);

		act.moveToElement(next).click().build().perform();
//		next.click();
		Thread.sleep(500);
//		act.sendKeys(Keys.ENTER).perform();
//		Thread.sleep(2000);
		System.out.println(GREEN + "permission save successfully.");

		addEmail.click();
		Thread.sleep(1000);

		act.sendKeys(email_FF).perform();
		Thread.sleep(500);
		emailForAlarm.click();
		Thread.sleep(500);
		emailForInfo.click();
		Thread.sleep(500);
		emailForAvailabilityRequest.click();
		Thread.sleep(500);

		act.moveToElement(saveChange).click().build().perform();
//		saveChange.click();
		Thread.sleep(500);

		addNumber.click();
		Thread.sleep(500);

//		act.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).build().perform();

		act.sendKeys(Keys.HOME).perform();
		Thread.sleep(200);
		for (int d = 0; d <= 15; d++) {
			act.sendKeys(Keys.DELETE).perform();

		}

		Thread.sleep(500);
		String CountryCode = "+91";
		act.sendKeys(CountryCode).perform();
		Thread.sleep(1000);
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(500);
		act.sendKeys(Keys.TAB).perform();
		Thread.sleep(500);

		String contactNoFFString = germanyTodaysDate1 + gtimeHHMMSS;

		long contactNoFF = Long.parseLong(contactNoFFString);

		act.sendKeys(String.valueOf(contactNoFF)).perform();

		FileInputStream in = new FileInputStream(filePath);
		XSSFWorkbook wb = new XSSFWorkbook(in);
		XSSFSheet sheet = wb.getSheetAt(0);

		Row row = sheet.createRow(48);//
		row.createCell(1).setCellValue(contactNoFF); // Cell B

		in.close();

		FileOutputStream out = new FileOutputStream(filePath);
		wb.write(out);
		out.close();
		wb.close();

		smsForAlarm.click();
		Thread.sleep(1000);
		callForAlarm.click();
		Thread.sleep(1000);

		act.moveToElement(saveChange).click().build().perform();
//		saveChange.click();
		Thread.sleep(500);

		act.moveToElement(saveRole).click().build().perform();
//		saveRole.click();
		Thread.sleep(2000);

		String actualCountryCode = getCountryCode.getText();
//		System.out.println(actualCountryCode);
//		System.out.println(CountryCode);
		Assert.assertTrue(CountryCode.contains(actualCountryCode), RED + "CountryCode not found");
		System.out.println(GREEN + "country  Code added successfully.");

		String actualgetContactNumber = getContactNumber.getText();
//		System.out.println(actualgetContactNumber);
//		System.out.println(contactNoFFString);
		Assert.assertTrue(contactNoFFString.contains(actualgetContactNumber), RED + "CountryCode not found");
		System.out.println(GREEN + "contact number added successfully.");

		next.click();
		Thread.sleep(2000);
//		System.out.println(GREEN + "Contact details save successfully.");

		attributeField.click();
		Thread.sleep(1000);

		act.sendKeys(attributeNewUser).perform();
		Thread.sleep(1000);
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(500);
		attributeTem.click();
		Thread.sleep(500);

		resourceField.click();
		Thread.sleep(1000);
		act.sendKeys(resourceNewUser).perform();
		Thread.sleep(1000);
		act.sendKeys(Keys.TAB, Keys.SPACE).perform();
		Thread.sleep(1000);

		resourceAccordian.click();
		Thread.sleep(1000);

		act.moveToElement(saveRole).click().build().perform();
//		saveRole.click();
		Thread.sleep(2000);

		String AtualgetAttributeName = getAttributeName.getText();
//		System.out.println(AtualgetAttributeName);
//		System.out.println(attributeNewUser);
		Assert.assertTrue(attributeNewUser.contains(AtualgetAttributeName), RED + "Attribute  not found");
		System.out.println(GREEN + "Attribute added successfully.");

		String atualgetResourceName = getResourceName.getText();
//		System.out.println(atualgetResourceName);
//		System.out.println(st01R1);
		Assert.assertTrue(resourceNewUser.contains(atualgetResourceName), RED + "Attribute  not found");
		System.out.println(GREEN + "Resource added successfully.");

		act.moveToElement(next).click().build().perform();
//		next.click();
		Thread.sleep(1000);
//		System.out.println(GREEN + "Attribute and Resource save successfully.");

		act.moveToElement(finish).click().build().perform();
//		finish.click();
		Thread.sleep(2000);
		System.out.println(GREEN + "Firefighter added successfully.");

		refreshFilter.click();
		Thread.sleep(2000);

		String actualGetAddedUserEmail = getAddedUserEmail.getText();
//		System.out.println(actualGetAddedUserEmail);
//		System.out.println(email_FF);
//		Assert.assertTrue(email_FF.contains(actualGetAddedUserEmail), RED + "Attribute  not found");
		System.out.println(GREEN + "User added in list successfully.");

		System.out.println(">> now Checking added details.<<");

		String actualFirstName_FF = getFirstLatName.getText();
//		System.out.println(actualFirstName_FF);
//		System.out.println(lastName_FF);
		Assert.assertTrue(actualFirstName_FF.contains(lastName_FF), RED + " Last Name not found ");
		System.out.println(GREEN + " First and Last Name added correctly.");

		String actualEmail = getAddedUserEmail.getText();
//		System.out.println(actualEmail);
//		System.out.println(email_FF);
		Assert.assertTrue(email_FF.contains(actualEmail), RED + "Email not found.");
		System.out.println(GREEN + "email Added correctly.");

		Thread.sleep(2000);

	}

	public void AddUersBasicDetail(WebDriver driver, String branchName, String gTodaysDate, String gtimeHHMMSS,
			String filePath, String role) throws Throwable {
		Actions act = new Actions(driver);
		refreshFilter.click();
		Thread.sleep(1000);
		createNew.click();
		Thread.sleep(1000);
		emailField.click();

//		act.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).build().perform();
		for (int d = 0; d <= 15; d++) {
			act.sendKeys(Keys.DELETE).perform();

		}

		Thread.sleep(2000);

		String email = "";
		String firstName = "";
		String lastName = "";
		String id = "";
		String qr = "";

		switch (role) {

		case "AR":
			email = "bhupesh.ar_" + gTodaysDate + "." + gtimeHHMMSS + "@atplindia.in";
			lastName = "AR_" + gTodaysDate + "." + gtimeHHMMSS;
			id = "ID_AR_" + gtimeHHMMSS;
			qr = "QR_AR" + gtimeHHMMSS;

			break;

		case "SR":
			email = "bhupesh.sr_" + gTodaysDate + "." + gtimeHHMMSS + "@atplindia.in";
			lastName = "SR_" + gTodaysDate + "." + gtimeHHMMSS;
			id = "ID_SR_" + gtimeHHMMSS;
			qr = "QR_SR" + gtimeHHMMSS;
			break;

		case "MR":
			email = "bhupesh.mr_" + gTodaysDate + "." + gtimeHHMMSS + "@atplindia.in";
			lastName = "MR_" + gTodaysDate + "." + gtimeHHMMSS;
			id = "ID_MR_" + gtimeHHMMSS;
			qr = "QR_MR" + gtimeHHMMSS;
			break;

		default:
			throw new IllegalArgumentException("Invalid role: " + role);
		}

		act.sendKeys(email).perform();

//		firstNameField.click();
		act.sendKeys(Keys.TAB).perform();
		Thread.sleep(2000);
		firstName = "Bhupesh";
		act.sendKeys(firstName).perform();
		Thread.sleep(1000);
//		lastNameField.click();
		act.sendKeys(Keys.TAB).perform();
		Thread.sleep(1000);
		act.sendKeys(lastName).perform();
		Thread.sleep(1000);

		dateOfBirth.click();
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).perform();
		countryField.click();
//		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).build().perform();
		
		act.sendKeys(Keys.HOME).perform();
		for (int d = 0; d <= 15; d++) {
			act.sendKeys(Keys.DELETE).perform();

		}
		act.sendKeys("india").perform();
		Thread.sleep(1000);
		act.sendKeys(Keys.DOWN).sendKeys(Keys.ENTER).build().perform();

		act.moveToElement(idField).click().build().perform();
		act.sendKeys(id).perform();

		act.moveToElement(qrField).click().build().perform();
		act.sendKeys(qr).perform();

		act.moveToElement(dobField).click().build().perform();
		Thread.sleep(500);
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(500);

		act.moveToElement(setPassword).click().build().perform();
		Thread.sleep(500);

//		

		switch (role) {
		case "AR":
			act.moveToElement(passwordField).click().build().perform();
			act.sendKeys("Atina@123").perform();
			Thread.sleep(1000);
			break;

		case "SR":
			act.moveToElement(GeneratePassword).click().build().perform();
			Thread.sleep(500);
			break;

		case "MR":
			act.moveToElement(GeneratePassword).click().build().perform();
			Thread.sleep(500);
			break;

		}

		act.moveToElement(saveAndContinue).click().build().perform();
		Thread.sleep(1000);

		FileInputStream in = new FileInputStream(filePath);
		XSSFWorkbook wb = new XSSFWorkbook(in);
		XSSFSheet sheet = wb.getSheetAt(0);

		// Email in B46
		sheet.getRow(45).createCell(1).setCellValue(email);

		// First Name in B47
		sheet.getRow(46).createCell(1).setCellValue(firstName);

		// Last Name in B48
		sheet.getRow(47).createCell(1).setCellValue(lastName);

		in.close();

		// Write all values at once
		FileOutputStream out = new FileOutputStream(filePath);
		wb.write(out);
		out.close();
		wb.close();

		if (firfighterRole.isDisplayed()) {

			switch (role) {

			case "AR":

				System.out.println(GREEN + "Basic details of the firefighters have been saved.");
				break;

			case "SR":

				System.out.println(GREEN + "Basic details of the Station user have been saved.");
				break;

			case "MR":

				System.out.println(GREEN + "Basic details of the mutli role user have been saved.");
				break;

			default:
				throw new IllegalArgumentException("Invalid role: " + role);
			}

		}

		else {
			System.out.println("BAsic role not save.");
		}
		Thread.sleep(2000);
	}

	public void commonForUser(WebDriver driver, String branchName) throws Throwable

	{
		Administration.click();
		Thread.sleep(500);

		switch (branchName) {
		case "1": {

			manageUsersL.click();
			break;
		}
		case "1.1": {

			manageUsersL.click();
			break;
		}
		case "2": {
			manageUsersT.click();
			break;
		}
		case "3": {
			break;
		}

		}

		Thread.sleep(3000);

	}

	public void deleteUsers(WebDriver driver) throws Throwable {

		Actions act = new Actions(driver);

		refreshFilter.click();
		Thread.sleep(2000);

		itemPerPage100.click();
		Thread.sleep(2000);

		searchField.click();
		act.sendKeys("@atplindia.in").perform();
//		act.sendKeys("@gtpl.in").perform();

		Thread.sleep(1000);

		int deletedUsersCount = 0;
		int deletedRoleCount = 0;

		int availableUserForDeleteCount = availableUserForDelete.size();
//		int availableUserForDeleteCount = availableUserForDelete1.size();

		System.out.println(">> Total " + availableUserForDeleteCount + " users available for delete.");

		if (availableUserForDeleteCount == 0) {
			System.out.println(">> No users for delete. <<");
//			return;
		}

		while (availableUserForDelete.size() > 0)
//		while (availableUserForDelete1.size() > 0) 

		{

			actionButton.click();
			Thread.sleep(1000);

			deleteUser.click();
			Thread.sleep(3000);

			// Delete all assigned roles/users
			while (removeUser.size() > 0) {
				removeUser1.click();
				Thread.sleep(2000);

				yesRemoveUser.click();
				Thread.sleep(3000);

				deletedRoleCount++;
			}

			// Final delete confirmation if required

			deletedUsersCount++;

			System.out.println("User number " + deletedUsersCount + " deleted sucessfully");

			Thread.sleep(1000);
		}

		refreshFilter.click();

		System.out.println(GREEN + "Total-" + deletedUsersCount + " users deleted successfully.");
		System.out.println(GREEN + "Total-" + deletedRoleCount + " user roles deleted successfully.");

	}

	public void commonForVehicleUser(WebDriver driver, String branchName) throws Throwable {
		Administration.click();
		Thread.sleep(500);

		switch (branchName) {
		case "1": {

			manageVehicleL.click();
			break;
		}
		case "1.1": {

			manageVehicleL.click();
			break;
		}
		case "2": {
			manageVehicleT.click();
			break;
		}
		case "3": {
			break;
		}

		}

		Thread.sleep(3000);

	}

	public void addVehicleUser(WebDriver driver, String branchName, String st01N, String gTodaysDate,
			String gtimeHHMMSS, String resourceNewUser, String filePath) throws Throwable {
		Actions act = new Actions(driver);
		createNew.click();
		Thread.sleep(2000);
		vehicleStationField.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[contains(text(),'" + st01N + "')]")).click();
		Thread.sleep(500);
		vehicleNameField.click();
		Thread.sleep(500);
		String newVehicleName = "BG_" + gTodaysDate + "." + gtimeHHMMSS;

		act.sendKeys(newVehicleName).perform();
		Thread.sleep(500);
		act.moveToElement(vehicleRadioCallNameField).click().sendKeys("BG_Cn_" + gTodaysDate + "." + gtimeHHMMSS)
				.build().perform();
		Thread.sleep(500);

		act.moveToElement(vehicleIssiField).click().sendKeys("BG_ISsi_" + gTodaysDate + "." + gtimeHHMMSS).build()
				.perform();
		Thread.sleep(500);

		act.moveToElement(vehicleIdField).click().sendKeys("BG_Id_" + gTodaysDate + "." + gtimeHHMMSS).build()
				.perform();
		Thread.sleep(500);

		act.moveToElement(saveAndContinue).click().build().perform();
		Thread.sleep(1000);

		System.out.println(GREEN + "Basic details of vehicle user added.");

		rightToViewChecklistPermission.click();
		Thread.sleep(500);
		righttoSeeFileSectionPermission.click();
		Thread.sleep(500);
		MidtargetPermission.click();
		Thread.sleep(500);
		rightToSeeAlarmOverviewInAppPermission.click();
		Thread.sleep(500);
		alarmAdditionalInformationPermission.click();
		Thread.sleep(500);

		saveRole.click();
		Thread.sleep(2000);
		next.click();
		Thread.sleep(500);

		System.out.println(GREEN + "Permission for vehicle user added.");

		resourceFieldForVehicle.click();
		Thread.sleep(500);
		act.sendKeys(resourceNewUser).perform();
		Thread.sleep(1000);
		act.sendKeys(Keys.TAB, Keys.SPACE).perform();
		Thread.sleep(1000);

		resourceAccordianForVehicle.click();
		Thread.sleep(500);

		System.out.println(GREEN + "Resource for vehicle user added.");

		saveRole.click();
		Thread.sleep(2000);
		next.click();
		Thread.sleep(500);

		finish.click();
		Thread.sleep(2000);
		System.out.println(GREEN + "Vehicle user added successfully.");

		act.sendKeys(String.valueOf(contactNoFF)).perform();

		FileInputStream in = new FileInputStream(filePath);
		XSSFWorkbook wb = new XSSFWorkbook(in);
		XSSFSheet sheet = wb.getSheetAt(0);

		Row row = sheet.createRow(47);//
		row.createCell(1).setCellValue(newVehicleName); // Cell B

		in.close();

		FileOutputStream out = new FileOutputStream(filePath);
		wb.write(out);
		out.close();
		wb.close();

	}

	public void deleteVehicleUsers(WebDriver driver) throws Throwable {
		Actions act = new Actions(driver);
		refreshFilter.click();
		Thread.sleep(1000);

		refreshFilter.click();
		Thread.sleep(2000);

		itemPerPage100.click();
		Thread.sleep(2000);

		searchField.click();
		act.sendKeys("BG").perform();
//		act.sendKeys("@gtpl.in").perform();

		Thread.sleep(1000);

		int availableVehicleUserForDelete1 = 0;

		for (int batch = 1; batch <= 15; batch++) {
			int count = availableVehicleUserForDelete.size();

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

			availableVehicleUserForDelete1 += count;
		}

		System.out.println("The iteration has been completed.");
		System.out.println(
				GREEN + "Total >>>>>" + availableVehicleUserForDelete1 + "<<<<< vehicle users deleted successfully.");

		refreshFilter.click();
		Thread.sleep(2000);

	}

}
