package function;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class H_alarmLoop extends b_baseClass {

	@FindBy(xpath = "//span[text()=\"Alarm\"]")
	private WebElement manualAlarmModule;

	@FindBy(xpath = "//a[@href=\"https://admin.retteralarm.de/verify-user?returnUrl=/admin/alarm-loop/list\"]")
	private WebElement manageAlarmLoopL;
	@FindBy(xpath = "//a[@href=\"http://admin.testing.retteralarm.de/verify-user?returnUrl=/admin/alarm-loop/list\"]")
	private WebElement manageAlarmLoopT;
	@FindBy(xpath = "//a[@href=\"https://admin.development.retteralarm.de/verify-user?returnUrl=/admin/alarm-loop/list\"]")
	private WebElement manageAlarmLoopD;

	@FindBy(xpath = "//i[@class=\"dx-icon dx-icon-refresh\"]")
	private WebElement refreshFilter;
	@FindBy(xpath = "//button[@class=\"btn-success btn-x30\"]")
	private WebElement createNewButton;
	@FindBy(xpath = "//span[text()=\"Stations\"   or text()=\"Wache/Stationen\" ]")
	private WebElement alarmLoopStation;
	@FindBy(xpath = "//input[@name=\"nickname\"]")
	private WebElement alarmLoopNickName;
	@FindBy(xpath = "//input[@name=\"alarmcode\"]")
	private WebElement alarmLoopCode;
	@FindBy(xpath = "//input[@placeholder=\"Select Resources\"]")
	private WebElement alarmLoopResource;
	@FindBy(xpath = "//span[text()=\"Save\"]")
	private WebElement saveAlarmLoop;

	@FindBy(xpath = "//div[@aria-label=\"Items per page: 100\"]")
	private WebElement itemPepage100;
	@FindBy(xpath = "(//i[@class=\"dx-icon-filter filter-icon\"])[1]")
	private WebElement titleSearch;
	@FindBy(xpath = "//dx-text-box[@mode=\"search\"]")
	private WebElement titleSearchField;
	@FindBy(xpath = "//div[@aria-label=\"OK\"]")
	private WebElement titleSearchFieldOk;
	@FindBy(xpath = "(//i[@class=\"dx-icon dx-icon-overflow\"])[2]")
	private WebElement actionButton;
	@FindBy(xpath = "(//span[@class=\"dx-checkbox-icon\"])[1]")
	private WebElement selectAll;
	@FindBy(xpath = "//i[@class=\"ri ri-delete-bin-6-line\"]")
	private WebElement deleteAll;
	@FindBy(xpath = "//span[text()=\"Yes, Delete\" or text()=\"Ja, löschen\" ]")
	private WebElement yesDelete;
	@FindBy(xpath = "//td[contains (text(),'BG')]")
	private List<WebElement> BGAlarmLoop;
	@FindBy(xpath = "(//td[@role=\"gridcell\"])[4]")
	private WebElement firstItemTitle;

	@FindBy(xpath = "//h2[text()=\"Alarm loop\"]")
	private WebElement alarmLoopTitle;
	@FindBy(xpath = "//h2[text()=\"Create Loop\"]")
	private WebElement createLoopTitle;
	@FindBy(xpath = "//div[text()=\"Fire Station is required.\"]")
	private WebElement fireStationIsRequriedValidation;
	@FindBy(xpath = "//div[text()=\"Nickname is required.\"]")
	private WebElement nicnmaeIsRequriedValidation;
	@FindBy(xpath = "//div[text()=\"Alarm Code is required.\"]")
	private WebElement alarmCodeIsRequriedValidation;
	@FindBy(xpath = "//div[text()=\"Alarm resource is required.\"]")
	private WebElement alarmResourceIsRequriedValidation;
	@FindBy(xpath = "//div[contains(@class,'dx-selectbox-popup')]")
	private WebElement stationNameList;
	@FindBy(xpath = "//input[@role='combobox' and @placeholder='Select Resources']")
	private WebElement resoursceNameList;
	@FindBy(xpath = "//button[@class=\"btn-success mtop28\"]")
	private WebElement createNewAlarmLoopButton;
	@FindBy(xpath = "//div[text()=\"Create Resource\"]")
	private WebElement createResourceTitle;
	@FindBy(xpath = "//input[@name=\"name\"]")
	private WebElement ResourceNameInputField;
	@FindBy(xpath = "//span[text()=\"Save & Assign\"]")
	private WebElement saveAndAssignButton;
	@FindBy(xpath = "//div[text()=\"Name is required.\"]")
	private WebElement nameIsRequriedValidation;
	@FindBy(xpath = "//div[text()=\"Please select at least one Firefighters/Vehicles.\"]")
	private WebElement pleaseSelectAtLeastOneFirefighterVehicleValidation;
	@FindBy(xpath = "//input[@role='combobox' and @placeholder='Select Vehicles/Cars']")
	private WebElement vehicleList;
	@FindBy(xpath = "//input[@id=\"dx_dx-40d9f0e8-82af-3b0e-a763-d1334d387e59_selectedUsers[786689f549defc0f094e283fcc6a8ba8f5c44494]\"]")
	private WebElement firefighterInputFieldsForStation01;
	@FindBy(xpath = "//input[@role='combobox' and @placeholder='Select...']")
	private WebElement firefighterListForSt01;
	@FindBy(xpath = "//input[@id=\"dx_dx-40d9f0e8-82af-3b0e-a763-d1334d387e59_selectedUsers[786689f4a73da2eb7d606c9a4ea37c8970b06f0a]\"]")
	private WebElement firefighterInputFieldsForStation02;

	@FindBy(xpath = "//input[@role='combobox' and @placeholder='Select...']")
	private WebElement firefighterListForSt02;
	@FindBy(xpath = "//span[contains(text(),\"BG_ALResource\")]")
	private WebElement resourceName;
	@FindBy(xpath = "//input[@id=\"dx_dx-820e36e4-ebd9-f82c-9b47-6ff93fa7c995_name\"]")
	private WebElement ResourceTitle;
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

	public H_alarmLoop(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}

	public void TCcreateNewAlarmLoop(WebDriver driver, String St2N, String St1N, String gTodaysDate, String gtimeHHMMSS,
			String st01R1, String St2R1, String st02V1, String st01V1, String st01FF1, String st02FF1)
			throws Throwable {
		Actions act = new Actions(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;

		if (alarmLoopTitle.isDisplayed() && createNewButton.isDisplayed()) {
			System.out.println(GREEN + "TC_AlarmLoop_001 - Verify Navigation to Alarm Loop Page");
		}

		if (createNewButton.isDisplayed()) {
			System.out.println(GREEN + "TC_AlarmLoop_002 - Verify Visibility of Create Button ");
		}

		createNewButton.click();
		Thread.sleep(2000);

		if (createLoopTitle.isDisplayed()) {
			System.out.println(GREEN + "TC_AlarmLoop_003 - Verify Navigation to create Alarm Loop Page");
		}

		saveAlarmLoop.click();
		Thread.sleep(1000);

		if (fireStationIsRequriedValidation.isDisplayed() && nicnmaeIsRequriedValidation.isDisplayed()
				&& alarmCodeIsRequriedValidation.isDisplayed() && alarmResourceIsRequriedValidation.isDisplayed()) {
			System.out.println(GREEN
					+ "TC_AlarmLoop_004 - Verify Required Validation for Station, Nic Name, Alarm Loop Code, Resource");
		}

		alarmLoopStation.click();
		Thread.sleep(500);

		if (stationNameList.isDisplayed()) {
			System.out.println(GREEN + "TC_AlarmLoop_005 - Verify that the station list is displayed");
		}

		act.sendKeys(St2N).perform();
		Thread.sleep(1000);
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(1000);
		act.sendKeys(St1N).perform();
		Thread.sleep(1000);
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(1000);

		alarmLoopNickName.click();
		String title = "BG_AL_" + gTodaysDate + "_" + gtimeHHMMSS;
		act.sendKeys(title).perform();
		Thread.sleep(500);
		alarmLoopCode.click();
		act.sendKeys("AL_" + gTodaysDate + "_" + gtimeHHMMSS).perform();

		createNewAlarmLoopButton.click();
		Thread.sleep(500);

		if (createResourceTitle.isDisplayed()) {
			System.out.println(GREEN + "TC_AlarmLoop_006 - Verify Navigation to create Resource Page");
		}

		js.executeScript("arguments[0].scrollIntoView(true);", saveAndAssignButton);
		Thread.sleep(1000);

		saveAndAssignButton.click();
		Thread.sleep(500);

		js.executeScript("arguments[0].scrollIntoView(true);", createResourceTitle);
		Thread.sleep(1000);

		if (nameIsRequriedValidation.isDisplayed()
				&& pleaseSelectAtLeastOneFirefighterVehicleValidation.isDisplayed()) {
			System.out.println(
					GREEN + "TC_AlarmLoop_007 - Verify Required Validation for Resource Name, Vehicl, firefighter");
		}

//				ResourceTitle.click();
		act.sendKeys(Keys.TAB, Keys.TAB, Keys.TAB).perform();

		Thread.sleep(500);
		String resourceTitle = ("BG_ALResource_" + gTodaysDate + "_" + gtimeHHMMSS);
		act.sendKeys(resourceTitle).perform();
		Thread.sleep(500);

		vehicleList.click();
		Thread.sleep(500);
		if (vehicleList.isDisplayed()) {
			System.out.println(GREEN + "TC_AlarmLoop_008 - Verify that the Vehicle list is displayed for resource");
		}

		act.sendKeys(st01V1).perform();
		Thread.sleep(500);
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(500);

		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).build().perform();
		Thread.sleep(500);
		act.sendKeys(st02V1).perform();
		Thread.sleep(500);
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(500);
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).build().perform();
		Thread.sleep(500);

		act.sendKeys(Keys.TAB).perform();
		Thread.sleep(500);
		act.sendKeys(st01FF1).perform();

		if (firefighterListForSt01.isDisplayed()) {
			System.out.println(GREEN + "TC_AlarmLoop_009 - Verify that 1st Station the Firefighter list is displayed ");
		}

		Thread.sleep(500);
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(500);
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).build().perform();
		Thread.sleep(500);

		Thread.sleep(500);

		if (firefighterListForSt01.isDisplayed()) {
			System.out.println(GREEN + "TC_AlarmLoop_010 - Verify that 1st Station the Firefighter list is displayed ");
		}

		act.sendKeys(Keys.TAB).perform();
		Thread.sleep(500);
		act.sendKeys(st02FF1).perform();

		if (firefighterListForSt02.isDisplayed()) {
			System.out.println(GREEN + "TC_AlarmLoop_011 - Verify that 2nd Station the Firefighter list is displayed ");
		}

		Thread.sleep(500);
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(500);
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).build().perform();
		Thread.sleep(500);
		act.sendKeys(Keys.TAB).perform();
		Thread.sleep(500);

		saveAndAssignButton.click();
		Thread.sleep(500);
		String actualResourceName = resourceName.getText();

		if (actualResourceName == resourceTitle) {
			System.out.println(GREEN + "TC_AlarmLoop_012 - Verify that the newly added resource added in alarm loop");
		}

		alarmLoopResource.click();
		Thread.sleep(500);

		if (resoursceNameList.isDisplayed()) {
			System.out.println(GREEN + "TC_AlarmLoop_013 - Verify that the Resource list is displayed");
		}

		act.sendKeys(st01R1).perform();
		Thread.sleep(500);
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(500);
		act.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).build().perform();
		act.sendKeys(St2R1).perform();
		Thread.sleep(500);
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(500);

		saveAlarmLoop.click();
		Thread.sleep(5000);

		String expectedTitle = firstItemTitle.getText();

		Assert.assertTrue(title.contains(expectedTitle), RED + "Alarm loop not added.");

		System.out.println(GREEN + title + GREEN);

	}

	public void smokeForAlrmLoop() {
		if (createNewButton.isDisplayed()) {
			System.out.println(GREEN + "Create New button for alarm loop is visible");
		} else {
			Assert.fail(RED + "Create New button is NOT displayed");
		}

	}

	public void createNewAlarmLoop(WebDriver driver, String St2N, String St1N, String gTodaysDate, String gtimeHHMMSS,
			String st01R1, String St2R1) throws Throwable {
		Actions act = new Actions(driver);

		createNewButton.click();
		Thread.sleep(2000);
		alarmLoopStation.click();
		act.sendKeys(St2N).perform();
		Thread.sleep(1000);
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(1000);
		act.sendKeys(St1N).perform();
		Thread.sleep(1000);
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(1000);

		alarmLoopNickName.click();
		String title = "BG_AL_" + gTodaysDate + "_" + gtimeHHMMSS;
		act.sendKeys(title).perform();
		Thread.sleep(500);
		alarmLoopCode.click();
		act.sendKeys("AL_" + gTodaysDate + "_" + gtimeHHMMSS).perform();

		alarmLoopResource.click();
		act.sendKeys(st01R1).perform();
		Thread.sleep(500);
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(500);
		act.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).build().perform();
		act.sendKeys(St2R1).perform();
		Thread.sleep(500);
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(500);

		saveAlarmLoop.click();
		Thread.sleep(5000);

		String expectedTitle = firstItemTitle.getText();

		Assert.assertTrue(title.contains(expectedTitle), RED + "Alarm loop not added.");

		System.out.println(GREEN + title);

	}

	public void deleteAlarmLoop(WebDriver driver) throws Throwable {

		itemPepage100.click();
		Thread.sleep(5000);
		Actions act = new Actions(driver);
		titleSearch.click();
		Thread.sleep(500);

		titleSearchField.click();
		Thread.sleep(500);

		act.sendKeys("BG").perform();

		Thread.sleep(500);
		titleSearchFieldOk.click();
		Thread.sleep(10000);

		int totalAlarmLoopCount = 0;

		for (int batch = 1; batch <= 15; batch++) {
			int count = BGAlarmLoop.size();

			if (count == 0) {
				break;
			}

			System.out.print("The iteration-" + batch + " still ongoing, please wait.");
			System.out.println();

			selectAll.click();
			Thread.sleep(2000);

			deleteAll.click();
			Thread.sleep(3000);
			yesDelete.click();
			Thread.sleep(3000);
			refreshFilter.click();
			Thread.sleep(2000);

			driver.navigate().refresh();
			Thread.sleep(3000);

			totalAlarmLoopCount += count;
		}

		System.out.println("The iteration has been completed.");
		System.out.println(GREEN + "Total >>>>>" + totalAlarmLoopCount + "<<<<< alarm loops deleted successfully.");

		refreshFilter.click();
		Thread.sleep(2000);

	}

	public void commonAlarmLoop(WebDriver driver, String branchName) throws Throwable {

//				
//				manualAlarmModule.click();
		Thread.sleep(2000);

		if (branchName.equals("1")) {

//					manageAlarmLoopL.click();
			driver.navigate().to("https://admin.retteralarm.de/admin/alarm-loop/list");

		}

		else if (branchName.equals("2")) {
//					manageAlarmLoopT.click();
			driver.navigate().to("https://admin.testing.retteralarm.de/admin/alarm-loop/list");

		}

		else if (branchName.equals("3")) {
//					manageAlarmLoopD.click();
			driver.navigate().to("https://admin.development.retteralarm.de/admin/alarm-loop/list");

		}
		Thread.sleep(2000);

		refreshFilter.click();
		Thread.sleep(2000);

	}

}
