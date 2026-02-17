package function;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.List;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class G_resource extends b_baseClass {

	@FindBy(xpath = "//span[text()=\"Alarm\"]")
	private WebElement manualAlarmModule;

	@FindBy(xpath = "//a[@href=\"https://admin.retteralarm.de/verify-user?returnUrl=/admin/alarm-resource/list\"]")
	private WebElement manageResourceL;
	@FindBy(xpath = "//a[@href=\"http://admin.testing.retteralarm.de/verify-user?returnUrl=/admin/alarm-resource/list\"]")
	private WebElement manageResourceT;
	@FindBy(xpath = "//a[@href=\"https://admin.development.retteralarm.de/verify-user?returnUrl=/admin/alarm-resource/list\"]")
	private WebElement manageResourceD;

	@FindBy(xpath = "//div[@aria-label=\"Refresh\"]")
	private WebElement refreshFilter;
	@FindBy(xpath = "//button[@class=\"btn-success btn-x30\"]")
	private WebElement createNewButton;
	@FindBy(xpath = "//input[@placeholder=\"Stations\"]")
	private WebElement resourceStation;
	@FindBy(xpath = "//input[@name=\"name\"]")
	private WebElement resourceNameField;
	@FindBy(xpath = "//input[@placeholder=\"Select Vehicles/Cars\"]")
	private WebElement vehicleField;
	@FindBy(xpath = "(//input[@placeholder=\"Select...\"])[1]")
	private WebElement station1FirefighterField;
	@FindBy(xpath = "(//input[@placeholder=\"Select...\"])[2]")
	private WebElement station2FirefighterField;
	@FindBy(xpath = "//div[@aria-label=\"Save\"]")
	private WebElement saveResource;

	@FindBy(xpath = "//div[@aria-label=\"Items per page: 100\"]")
	private WebElement itemPepage100;
	@FindBy(xpath = "//input[@placeholder=\"Search\"]")
	private WebElement searchField;
	@FindBy(xpath = "(//i[@class=\"dx-icon dx-icon-overflow\"])[2]")
	private WebElement actionButton;
	@FindBy(xpath = "//div[@aria-label=\"Select all\"]")
	private WebElement selectAll;
	@FindBy(xpath = "//i[@class=\"ri ri-delete-bin-6-line\"]")
	private WebElement deleteAll;
	@FindBy(xpath = "//div[@aria-label=\"Yes, Delete\"]")
	private WebElement yesDelete;
	@FindBy(xpath = "//span[contains(text(), 'Bg') or contains(text(), 'BG')]")
	private List<WebElement> BGResource;
	@FindBy(xpath = "(//td[@role=\"gridcell\"])[4]")
	private WebElement firstItemTitle;
	 @FindBy(xpath="//h2[text()=\"Alarm Resource\"]")private WebElement alarmResourceTitle;
	 @FindBy(xpath="//div[text()=\"Fire Station is required.\"]")private WebElement fireStationIsRequriedValidation;
	 @FindBy(xpath="//div[text()=\"Name is required.\"]")private WebElement nmaeIsRequiredValidation;
	 @FindBy(xpath="//div[contains(@class,'dx-tagbox-popup-wrapper')]")private WebElement stationNameList;
	@FindBy(xpath="//div[text()=\" Connected Firefighters/Vehicles\"]")private WebElement connectedFirefightersVehicleTitle;
	 @FindBy(xpath="//span[text()=\"Vehicles/Cars\"]")private WebElement vehicleCarTitle;
	@FindBy(xpath="//div[text()=\"Firefighters\"]")private WebElement firefighterTitle;
	 @FindBy(xpath="//input[@role='combobox' and @placeholder='Select Vehicles/Cars']")private WebElement vehicleNameList ;
	@FindBy(xpath="//input[@role='combobox' and @aria-haspopup='listbox']")private WebElement station01FirefighterNameList;
	 @FindBy(xpath="//input[@role='combobox' and @aria-haspopup='listbox']")private WebElement station02FirefighterNameList ;
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

	public G_resource(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}

	public void smokeForResource() {
		if (createNewButton.isDisplayed()) {
			System.out.println(GREEN + "Create New button for resource is visible");
		} else {
			Assert.fail(RED + "Create New button is NOT displayed");
		}

	}
	
	
	public void TCResourceValidationChecking(WebDriver driver, String St2N, String St1N, String gTodaysDate, String gtimeHHMMSS,
			String St2V1, String St1V1, String st01FF1, String st02FF1) throws Throwable {
		Actions act = new Actions(driver);
		String filePath = ".\\DataFiles\\DetailsFile.xlsx";
		
		if( alarmResourceTitle.isDisplayed())
		{
			System.out.println(GREEN+"TC_Resource_001 - Verify Navigation to Alarm Resource Page");
		}
		if( createNewButton.isDisplayed())
		{
			System.out.println(GREEN+"TC_Resource_002 - Verify Create Button Visibility");
		}
		

		createNewButton.click();
		Thread.sleep(3000);
		saveResource.click();
		
		if( fireStationIsRequriedValidation.isDisplayed()&&nmaeIsRequiredValidation.isDisplayed())
		{
			System.out.println(GREEN+"TC_Resource_003 - Verify Required Validation for Station, Resource Name");
		}
		
		resourceStation.click();
		Thread.sleep(2000);
		
		if( stationNameList.isDisplayed())
		{
			System.out.println(GREEN+"TC_Resource_004 - Verify that the station list is displayed");
		}
		
		act.sendKeys(St2N).perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(1000);
		
		
		if( connectedFirefightersVehicleTitle.isDisplayed()&&vehicleCarTitle.isDisplayed()&&firefighterTitle.isDisplayed())
		{
			System.out.println(GREEN+"TC_Resource_005 - Verify that the vehicle and firefighter input fields are displayed after select station");
		}
		
		act.sendKeys(Keys.TAB).perform();

		act.sendKeys(St1N).perform();
		Thread.sleep(2000);
		
		
		act.sendKeys(Keys.ENTER).perform();
		resourceNameField.click();
		String title = "BG_Resource_" + gTodaysDate + "_" + gtimeHHMMSS;
		act.sendKeys(title).perform();

		vehicleField.click();
		if( vehicleNameList.isDisplayed())
		{
			System.out.println(GREEN+"TC_Resource_006 - Verify that the Vehicle list is displayed");
		}
		
		
		

		act.sendKeys(St2V1).perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).perform();
		act.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).build().perform();

		act.sendKeys(St1V1).perform();
		Thread.sleep(1000);
		act.sendKeys(Keys.ENTER).perform();

		act.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).build().perform();

//		station1FirefighterField.click();
		act.sendKeys(Keys.TAB).perform();
		Thread.sleep(1000);
		act.sendKeys(st01FF1).perform();
		Thread.sleep(2000);
		
		if( station01FirefighterNameList.isDisplayed())
		{
			System.out.println(GREEN+"TC_Resource_007 - Verify that the 1st station firefighter list is displayed");
		}
		act.sendKeys(Keys.ENTER).perform();

		act.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).build().perform();

//		station2FirefighterField.click();

		act.sendKeys(Keys.TAB).perform();
		act.sendKeys(st02FF1).perform();

		Thread.sleep(1000);
		
		if( station02FirefighterNameList.isDisplayed())
		{
			System.out.println(GREEN+"TC_Resource_007 - Verify that the 2nd station firefighter list is displayed");
		}

		act.sendKeys(Keys.ENTER).perform();

		act.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).build().perform();

		Thread.sleep(3000);
		saveResource.click();

		Thread.sleep(5000);

		

		String expectedTitle = firstItemTitle.getText();

		Assert.assertTrue(title.contains(expectedTitle), RED + " Ne Resource not added.");

		System.out.println(GREEN + title+GREEN);

	}

	
	
	
	

	public void commonResource(WebDriver driver, String branchName) throws Throwable {

//	manualAlarmModule.click();
		Thread.sleep(2000);

		switch (branchName) {
		case "1": {
			driver.navigate().to("https://admin.retteralarm.de/admin/alarm-resource/list");
			break;
		}
		case "2": {
			driver.navigate().to("https://admin.testing.retteralarm.de/admin/alarm-resource/list");
			break;
		}
		case "3": {
			driver.navigate().to("https://admin.development.retteralarm.de/admin/alarm-resource/list");
			break;
		}

		}

		Thread.sleep(2000);
		refreshFilter.click();
		Thread.sleep(4000);

	}

	public void createNewEscalationResource(WebDriver driver, String St01N, String gTodaysDate, String gtimeHHMMSS,
			String St1V3, String st01FF2) throws Throwable {

		Actions act = new Actions(driver);
		String filePath = ".\\DataFiles\\DetailsFile.xlsx";

		createNewButton.click();
		Thread.sleep(3000);
		resourceStation.click();

		act.sendKeys(St01N).perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).perform();
		resourceNameField.click();
		String title = "BG_Escaltion Resource_" + gTodaysDate + "_" + gtimeHHMMSS;
		act.sendKeys(title).perform();

		vehicleField.click();

		act.sendKeys(St1V3).perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).perform();
		act.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).build().perform();

		Thread.sleep(1000);

		act.sendKeys(Keys.TAB).perform();
		Thread.sleep(1000);
		act.sendKeys(st01FF2).perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).perform();

		Thread.sleep(3000);
		saveResource.click();

		Thread.sleep(5000);

		FileInputStream in = new FileInputStream(filePath);
		XSSFWorkbook wb = new XSSFWorkbook(in);
		XSSFSheet sheet = wb.getSheetAt(0);

		Row row = sheet.createRow(24); // Row 23
		row.createCell(1).setCellValue(title); // Cell B

		in.close();

		FileOutputStream out = new FileOutputStream(filePath);
		wb.write(out);
		out.close();
		wb.close();

		String expectedTitle = firstItemTitle.getText();

		Assert.assertTrue(title.contains(expectedTitle), RED + " New Escalation Resource not added.");

		System.out.println(GREEN + title);

	}

	public void createNewResource(WebDriver driver, String St2N, String St1N, String gTodaysDate, String gtimeHHMMSS,
			String St2V1, String St1V1, String st01FF1, String st02FF1) throws Throwable {
		Actions act = new Actions(driver);
		String filePath = ".\\DataFiles\\DetailsFile.xlsx";

		createNewButton.click();
		Thread.sleep(3000);
		resourceStation.click();

		act.sendKeys(St2N).perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(1000);
		act.sendKeys(Keys.TAB).perform();

		act.sendKeys(St1N).perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).perform();
		resourceNameField.click();
		String title = "BG_Resource_" + gTodaysDate + "_" + gtimeHHMMSS;
		act.sendKeys(title).perform();

		vehicleField.click();

		act.sendKeys(St2V1).perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).perform();
		act.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).build().perform();

		act.sendKeys(St1V1).perform();
		Thread.sleep(1000);
		act.sendKeys(Keys.ENTER).perform();

		act.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).build().perform();

//		station1FirefighterField.click();
		act.sendKeys(Keys.TAB).perform();
		Thread.sleep(1000);
		act.sendKeys(st01FF1).perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).perform();

		act.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).build().perform();

//		station2FirefighterField.click();

		act.sendKeys(Keys.TAB).perform();
		act.sendKeys(st02FF1).perform();

		Thread.sleep(1000);

		act.sendKeys(Keys.ENTER).perform();

		act.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).build().perform();

		Thread.sleep(3000);
		saveResource.click();

		Thread.sleep(5000);

		FileInputStream in = new FileInputStream(filePath);
		XSSFWorkbook wb = new XSSFWorkbook(in);
		XSSFSheet sheet = wb.getSheetAt(0);

		Row row = sheet.createRow(21); // Row 22
		row.createCell(1).setCellValue(title); // Cell B

		in.close();

		FileOutputStream out = new FileOutputStream(filePath);
		wb.write(out);
		out.close();
		wb.close();

		String expectedTitle = firstItemTitle.getText();

		Assert.assertTrue(title.contains(expectedTitle), RED + " Ne Resource not added.");

		System.out.println(GREEN + title);

	}

	public void deleteResource(WebDriver driver) throws Throwable {

		itemPepage100.click();
		Thread.sleep(5000);
		Actions act = new Actions(driver);
		searchField.click();
		act.sendKeys("BG").perform();
		Thread.sleep(5000);

		int totalResourceCount = 0;

		for (int batch = 1; batch <= 15; batch++) {
			int count = BGResource.size();

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

			totalResourceCount += count;
		}

		System.out.println("The iteration has been completed.");
		System.out.println(GREEN + "Total >>>>>" + totalResourceCount + "<<<<< resource deleted successfully.");

		refreshFilter.click();
		Thread.sleep(2000);

	}

}