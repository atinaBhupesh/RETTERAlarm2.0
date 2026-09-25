package function;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class S_AvailabilityRequest extends b_baseClass {

	@FindBy(xpath = "//span[text()=\"Availability Request\"]")
	private WebElement availabilityRequest;
	@FindBy(xpath = "//a[text()=\"Availability Request\"]")
	private WebElement availabilityRequestList;
	@FindBy(xpath = "//a[text()=\"Availability Request History\"]")
	private WebElement availabilityRequestHistory;

	@FindBy(xpath = "//button[@class=\"btn btn-success\"]")
	private WebElement createNewButton;
	@FindBy(xpath = "//input[@id=\"title\"]")
	private WebElement ARTitle;
	@FindBy(xpath = "//select[@id=\"PlanningResourcesIsRecursive\"]")
	private WebElement ARType;

	@FindBy(xpath = "//input[@id=\"actionImmediateRequest1\"]")
	private WebElement sendImmediateChekBox;

	@FindBy(xpath = "//input[@id=\"requested_datetime\"]")
	private WebElement ARSendTime;

	@FindBy(xpath = "//span[@id=\"select2-sectionDepartment-container\"]")
	private WebElement departmentField;

	@FindBy(xpath = "//input[@id=\"from_date\"]")
	private WebElement ARFromDate;
	@FindBy(xpath = "//input[@id=\"from_time\"]")
	private WebElement ARFromTime;
	@FindBy(xpath = "//input[@id=\"to_date\"]")
	private WebElement ARToDate;

	@FindBy(xpath = "//input[@id=\"to_time\"]")
	private WebElement ARToTime;
	@FindBy(xpath = "(//span[@class=\"slider round\"])[2]")
	private WebElement ARSlipInDays;
	@FindBy(xpath = "(//span[@class=\"slider round\"])[3]")
	private WebElement ARSHift;
	@FindBy(xpath = "//input[@id=\"inputShift\"]")
	private WebElement addShift;
	@FindBy(xpath = "//button[@id=\"actionAddShift\"]")
	private WebElement adShiftButton;
	@FindBy(xpath = "//button[@id=\"addSubmit\"]")
	private WebElement ARSaveButton;

	@FindBy(xpath = "//select[@id=\"requested_day_id\"]")
	private WebElement ARday;

	@FindBy(xpath = "//select[@name=\"data[PlanningResources][from_day]\"]")
	private WebElement ArRequestFrom;
	@FindBy(xpath = "//select[@name=\"data[PlanningResources][to_day]\"]")
	private WebElement ArRequestTo;

	@FindBy(xpath = "//input[@id=\"timePicker1\"]")
	private WebElement ARSendTime1;

	@FindBy(xpath = "//input[@aria-controls=\"example1\"]")
	private WebElement searchField;
	@FindBy(xpath = "(//i[@class=\"fa fa-trash-o\"])[1]")
	private WebElement deleteAvailbilityRequest;
	@FindBy(xpath = "//button[@id=\"delYes1\"]")
	private WebElement deleteAvailbiliYes;

	@FindBy(xpath = "//input[@aria-controls=\"weekendHistoryTable\"]")
	private WebElement searFieldHistory;

	@FindBy(xpath = "//button[@id=\"dt_actionSearch\"]")
	private WebElement searchButton;
	@FindBy(xpath = "(//button[@type=\"submit\"])[1]")
	private WebElement deleteAvailbiliHistoryYes;

	@FindBy(xpath = "//input[@value=\"6286\"]")
	private WebElement Station06;

	@FindBy(xpath = "//input[@id=\"ff_6286_23001\"]")
	private WebElement jonas3;
	@FindBy(xpath = "// input[@value=\"22999\"]")
	private WebElement jonas2;

//	Testing
	@FindBy(xpath = "//input[@value=\"980\"]")
	private WebElement station04;
	@FindBy(xpath = "//input[@id=\"ff_980_18952\"]")
	private WebElement bhupeshTest;

	@FindBy(xpath = "//input[@value=\"1197\"]")
	private WebElement Bh1St1;
	@FindBy(xpath = "//input[@id=\"ff_1197_22759\"]")
	private WebElement bhupeshDev;

	@FindBy(xpath = "//input[@value=\"24855\"]")
	private WebElement BH_ST01;
	@FindBy(xpath = "//input[@value=\"35651\"]")
	private WebElement rick102;
	@FindBy(xpath = "(//td)[2]")
	private WebElement firstTitle;
	@FindBy(xpath = "//span[@role=\"presentation\"]")
	private WebElement deptDownArrow;
	
	
	@FindBy(xpath = "//input[@id=\"requested_datetime_multi1\"]")
	private WebElement ARMultiTime1;
	@FindBy(xpath = "//button[@class=\"add_field_button btn btn-primary float-right\"]")
	private WebElement addMoreTime;

	@FindBy(xpath = "//input[@id=\"requested_datetime_multi2\"]")
	private WebElement ARMultiTime2;
	@FindBy(xpath = "//input[@id=\"requested_datetime_multi3\"]")
	private WebElement ARMultiTime3;

	@FindBy(xpath = "//select[@id=\"multiple_from_day\"]")
	private WebElement ARMultiFromDay;
	@FindBy(xpath = "//input[@id=\"multiple_from_time\"]")
	private WebElement ARMultiFromTime;
	@FindBy(xpath = "//select[@id=\"multiple_to_day\"]")
	private WebElement ARMultiToDay;
	@FindBy(xpath = "//input[@id=\"multiple_to_time\"]")
	private WebElement ARMultiToTime;

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

	public S_AvailabilityRequest(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}

	public void createAvailabilityRequest(WebDriver driver, String branchName, String requestType, String todaysDateG,
			String timeHHMMSSG, String deptN, String tomorrowDateG, String timeAfter5MinHHG,
			String timeAfter5MinMMG, String timeAfter7MinHHG, String timeAfter7MinMMG,
			String timeAfter9MinHHG, String timeAfter9MinMMG, String todaysDayG, String tomorrowDayG,
			String dayAfterFourDaysG,String timeAfter11MinHHG, String timeAfter11MinMMG) throws Throwable {
		Actions act = new Actions(driver);

		availabilityRequest.click();
		Thread.sleep(2000);
		availabilityRequestList.click();
		Thread.sleep(2000);

		createNewButton.click();

		ARTitle.click();

		String title = "BG-AR >" + requestType + "-" + timeHHMMSSG;

		act.sendKeys(title).build().perform();

		Select se = new Select(ARType);

		switch (requestType) {

		case "OneTime>Immediate":
			se.selectByVisibleText("One time");
			sendImmediateChekBox.click();
			break;

		case "OneTime>Schedule":

			Select se1 = new Select(ARType);
			se1.selectByVisibleText("One time");

			ARSendTime.click();

			act.keyDown(Keys.HOME).perform();
			for (int i = 0; i <= 20; i++) {
				act.sendKeys(Keys.DELETE).perform();

			}

			act.sendKeys(todaysDateG + " " + timeAfter5MinHHG + ":" + timeAfter5MinMMG).build().perform();
			Thread.sleep(2000);

			break;

		case "Recursive":

			Select se2 = new Select(ARType);
			se2.selectByVisibleText("Recursive");

			Select se21 = new Select(ARday);
			se21.selectByVisibleText(todaysDayG);

			ARSendTime1.click();
			act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();

			act.sendKeys(timeAfter9MinHHG + ":" + timeAfter9MinMMG).build().perform();

			break;

		case "MultipleDays":
			Select se31 = new Select(ARType);
			se31.selectByVisibleText("Multiple days");

			ARMultiTime1.click();

			act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
			act.sendKeys(todaysDateG + " " + timeAfter7MinHHG+":"+timeAfter7MinMMG).build().perform();

			addMoreTime.click();

			ARMultiTime2.click();

			act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
			act.sendKeys(todaysDateG + " " + timeAfter9MinHHG+":"+timeAfter9MinMMG).build().perform();

			addMoreTime.click();

			ARMultiTime3.click();

			act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();

			act.sendKeys(todaysDateG + " " + timeAfter11MinHHG+":"+timeAfter11MinMMG).build().perform();

			break;

		}
		Thread.sleep(2000);

		deptDownArrow.click();
		Thread.sleep(2000);

		act.sendKeys(deptN).build().perform();
		Thread.sleep(2000);

		act.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);

		switch (branchName) {

		case "1":

			BH_ST01.click();
			act.sendKeys(Keys.PAGE_DOWN).build().perform();
			Thread.sleep(2000);
			BH_ST01.click();
			Thread.sleep(2000);
			act.sendKeys(Keys.PAGE_DOWN).build().perform();
			Thread.sleep(2000);
			jonas2.click();
			Thread.sleep(1000);
			rick102.click();
			Thread.sleep(1000);

			break;

		case "1.1":

			Station06.click();
			act.sendKeys(Keys.PAGE_DOWN).build().perform();
			Thread.sleep(2000);
			Station06.click();
			Thread.sleep(2000);

			jonas3.click();
			Thread.sleep(1000);
			jonas2.click();
			Thread.sleep(1000);

			break;

		case "2":
			station04.click();
			act.sendKeys(Keys.PAGE_DOWN).build().perform();
			Thread.sleep(2000);
			station04.click();
			Thread.sleep(2000);

			bhupeshTest.click();
			Thread.sleep(1000);

			break;

		case "3":
			Bh1St1.click();
			act.sendKeys(Keys.PAGE_DOWN).build().perform();
			Thread.sleep(2000);
			Bh1St1.click();
			Thread.sleep(2000);

			bhupeshDev.click();
			Thread.sleep(1000);

			break;

		}

		switch (requestType) {

		case "OneTime>Immediate":

			ARFromDate.click();

			act.keyDown(Keys.HOME).perform();

			for (int i = 0; i <= 7; i++) {
				act.sendKeys(Keys.DELETE).perform();
			}

			act.sendKeys(tomorrowDateG).build().perform();

			ARFromTime.click();

			act.keyDown(Keys.HOME).perform();

			for (int i = 0; i <= 7; i++) {
				act.sendKeys(Keys.DELETE).perform();
			}

			act.sendKeys(timeAfter5MinHHG + ":" + timeAfter5MinMMG).build().perform();

			ARToDate.click();

			act.keyDown(Keys.HOME).perform();

			for (int i = 0; i <= 7; i++) {
				act.sendKeys(Keys.DELETE).perform();
			}

			act.sendKeys(tomorrowDateG).build().perform();

			ARToTime.click();

			act.keyDown(Keys.HOME).perform();

			for (int i = 0; i <= 7; i++) {
				act.sendKeys(Keys.DELETE).perform();
			}

			act.sendKeys(timeAfter7MinHHG + ":" + timeAfter7MinMMG).build().perform();

			break;

		case "OneTime>Schedule":

			ARFromDate.click();
			act.keyDown(Keys.HOME).perform();
			for (int i = 0; i <= 7; i++) {
				act.sendKeys(Keys.DELETE).perform();
			}

			act.sendKeys(tomorrowDateG).build().perform();

			ARFromTime.click();

			act.keyDown(Keys.HOME).perform();
			for (int i = 0; i <= 7; i++) {
				act.sendKeys(Keys.DELETE).perform();
			}
			act.sendKeys(timeAfter7MinHHG + ":" + timeAfter7MinMMG).build().perform();

			ARToDate.click();
			act.keyDown(Keys.HOME).perform();
			for (int i = 0; i <= 7; i++) {
				act.sendKeys(Keys.DELETE).perform();
			}
			act.sendKeys(tomorrowDateG).build().perform();

			ARToTime.click();
			act.keyDown(Keys.HOME).perform();
			for (int i = 0; i <= 7; i++) {
				act.sendKeys(Keys.DELETE).perform();
			}
			act.sendKeys(timeAfter9MinHHG + ":" + timeAfter9MinMMG).build().perform();

			break;

		case "Recursive":

			Select se22 = new Select(ArRequestFrom);
			se22.selectByVisibleText(tomorrowDayG);

			Select se23 = new Select(ArRequestTo);
			se23.selectByVisibleText(dayAfterFourDaysG);
			break;
			
		case "MultipleDays":
			
			Select se1 = new Select(ARMultiFromDay);
			se1.selectByVisibleText(tomorrowDayG);

			ARMultiFromTime.click();
			act.keyDown(Keys.HOME).perform();
			for (int i = 0; i <= 7; i++) {
				act.sendKeys(Keys.DELETE).perform();
			}
			act.sendKeys(timeAfter7MinHHG+":"+timeAfter7MinMMG).build().perform();

			Select se2 = new Select(ARMultiToDay);
			se2.selectByVisibleText(dayAfterFourDaysG);

			ARMultiToTime.click();
			act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
			act.sendKeys(timeAfter11MinHHG+":"+timeAfter11MinMMG).build().perform();
			
			break;
			

		}

		act.sendKeys(Keys.PAGE_DOWN).build().perform();

		ARSHift.click();
		Thread.sleep(1000);
		addShift.click();
		act.sendKeys("1st").build().perform();
		Thread.sleep(1000);
		adShiftButton.click();
		Thread.sleep(1000);
		act.sendKeys("2nd").build().perform();
		Thread.sleep(1000);

		adShiftButton.click();
		Thread.sleep(1000);
		ARSaveButton.click();
		Thread.sleep(5000);
		driver.navigate().refresh();

		String actualTite = firstTitle.getText();

		Assert.assertTrue(actualTite.contains(title), RED + "Station not found.");

		System.out.println(GREEN + requestType + " added successfully.");
	}

	public void deleteAvailabilityRequestFromList(WebDriver driver) throws Throwable {

//		int z = availableDataCount.size();
//		Reporter.log("The total available availability request count is-"+z+" in the list for delete.",true);

		availabilityRequest.click();
		Thread.sleep(2000);
		availabilityRequestList.click();
		Thread.sleep(2000);
		Actions act = new Actions(driver);

		for (int i = 1; i <= 100; i++)

		{
			searchField.click();
			Thread.sleep(2000);

			act.sendKeys("BG").perform();
			Thread.sleep(2000);

			deleteAvailbilityRequest.click();
			Thread.sleep(5000);
			deleteAvailbiliYes.click();

			Thread.sleep(2000);
			System.out.println("Availability request number-" + i + " deleted sucessfully from list-testing branch.");
			driver.navigate().refresh();
			Thread.sleep(2000);

		}
	}

	public void deleteAvailabilityRequestFromHistory(WebDriver driver) throws Throwable {

		Actions act = new Actions(driver);

		availabilityRequest.click();
		Thread.sleep(2000);
		availabilityRequestHistory.click();
		Thread.sleep(2000);

//	int z = availableDataCount.size();
//	Reporter.log("The total available availability request count is-"+z+" in the history for delete.",true);

		for (int i = 1; i <= 100; i++) {
			searFieldHistory.click();
			Thread.sleep(2000);
			act.sendKeys("BG").perform();
			Thread.sleep(4000);
			searchButton.click();
			Thread.sleep(5000);

			deleteAvailbilityRequest.click();
			Thread.sleep(5000);
			deleteAvailbiliHistoryYes.click();
			Thread.sleep(2000);
			System.out.println("Availability request number-" + i + " deleted sucessfully from histry-testing branch.");
			driver.navigate().refresh();
			Thread.sleep(2000);

		}

	}

}
