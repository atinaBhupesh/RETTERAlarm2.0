package function;

import static org.testng.Assert.assertTrue;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.time.Duration;
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
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class O_stationModule extends b_baseClass {

	@FindBy(xpath = "//span[text()=\"Administration\"]")
	private WebElement Administration;

	@FindBy(xpath = "//a[@href=\"https://admin.retteralarm.de/verify-user?returnUrl=/admin/station/list\"]")
	private WebElement manageStataaionL;

	@FindBy(xpath = "//a[@href=\"http://admin.testing.retteralarm.de/verify-user?returnUrl=/admin/station/list\"]")
	private WebElement manageStataaionT;

	@FindBy(xpath = "//i[@class=\"dx-icon dx-icon-refresh\"]")
	private WebElement refreshFilter;
	@FindBy(xpath = "//button[@class=\"btn-success btn-x30\"]")
	private WebElement createNew;

	@FindBy(xpath = "(//div[@class=\"dx-texteditor-input-container\"])[3]")
	private WebElement stationName;
	@FindBy(xpath = "//span[text()=\"Address\"]")
	private WebElement stationAdress;
	@FindBy(xpath = "//span[text()=\"Save & Continue\"]")
	private WebElement saveAndContinue;
	@FindBy(xpath = "(//td[@aria-colindex=\"3\"])[2]")
	private WebElement firstTitle;
	@FindBy(xpath = "//i[@class=\"dx-icon dx-icon dx-icon-arrowleft\"]")
	private WebElement backButton;
	@FindBy(xpath = "//input[@aria-label=\"Search in the data grid\"]")
	private WebElement searchField;
	@FindBy(xpath = "(//i[@class=\"dx-icon dx-icon-overflow\"])[2]")
	private WebElement actions;
	@FindBy(xpath = "//i[@class=\"ri ri-pencil-line\"]")
	private WebElement edit;
	@FindBy(xpath = "//span[@class=\"dx-datagrid-search-text\"]")
	private WebElement moveToStation;
	 @FindBy(xpath="//span[text()=\"Update & Continue\"]")private WebElement updateContinue ;
	@FindBy(xpath="(//span[@class=\"dx-checkbox-icon\"])[1]")private WebElement selectAll ;
	@FindBy(xpath="//i[@class=\"ri ri-delete-bin-6-line\"]")private WebElement deleteAll;
	@FindBy(xpath="//span[text()=\"Yes, Delete\"]")private WebElement yesDelete;
	 @FindBy(xpath="//span[starts-with(text(),\"BG_St-\")]")private List<WebElement>  availableStationForDelete;
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

	public O_stationModule(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void addNewStation(WebDriver driver, String gTodaysDate, String gtimeHHMMSS, String filePath)
			throws Throwable {
		Actions act = new Actions(driver);

		createNew.click();
		Thread.sleep(2000);
		stationName.click();
		Thread.sleep(1000);

		String title = "BG_St-" + gTodaysDate + "_" + gtimeHHMMSS;
		act.sendKeys(title).build().perform();
		stationAdress.click();
		String[] cities = { "Mumbai", "Delhi", "Pune", "Nagpur", "Hyderabad" };

		String eventCity = cities[new java.util.Random().nextInt(cities.length)];

		Thread.sleep(1000);
		act.sendKeys(eventCity).build().perform();
		act.sendKeys(Keys.TAB).perform();
		Thread.sleep(3000);
		act.moveToElement(saveAndContinue).click().build().perform();
		Thread.sleep(3000);
		

		FileInputStream in = new FileInputStream(filePath);
		XSSFWorkbook wb = new XSSFWorkbook(in);
		XSSFSheet sheet = wb.getSheetAt(0);

		Row row = sheet.createRow(55); // 56
		row.createCell(1).setCellValue(title);
		in.close();

		FileOutputStream out = new FileOutputStream(filePath);
		wb.write(out);
		out.close();
		wb.close();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

		
		if (wait.until(ExpectedConditions.or(ExpectedConditions.visibilityOf(backButton),
				ExpectedConditions.invisibilityOf(backButton))) != null
				&& backButton.isDisplayed()) { }

		backButton.click();
		Thread.sleep(2000);

		String actualTite = firstTitle.getText();

		Assert.assertTrue(actualTite.contains(title), RED + "Station not found.");
 
		System.out.println(GREEN + "New station added successfully.");
		
		
		

	}

	public void editStation(WebDriver driver, String newStationName) throws Throwable {
		Actions act = new Actions(driver);
		refreshFilter.click();
		Thread.sleep(2000);
		searchField.click();
		act.sendKeys(newStationName).perform();
		Thread.sleep(3000);
		act.moveToElement(moveToStation).click().build().perform();
		Thread.sleep(2000);

		stationName.click();
		Thread.sleep(2000);
		act.sendKeys(Keys.HOME).perform();
		for (int i = 0; i <= 30; i++) {
			act.sendKeys(Keys.DELETE).perform();
		}
		Thread.sleep(1000);
		String title = newStationName + "_updated";
		act.sendKeys(title).perform();
		Thread.sleep(1000);

		stationAdress.click();

		act.sendKeys(Keys.HOME).perform();
		for (int i = 0; i <= 30; i++) {
			act.sendKeys(Keys.DELETE).perform();
		}

		String[] cities = { "Mumbai", "Delhi", "Pune", "Nagpur", "Hyderabad" };

		String eventCity = cities[new java.util.Random().nextInt(cities.length)];

		Thread.sleep(1000);
		act.sendKeys(eventCity).build().perform();
		act.sendKeys(Keys.TAB).perform();
		Thread.sleep(3000);
		
		act.moveToElement(updateContinue).click().build().perform();
		Thread.sleep(3000);
		

		backButton.click();
		Thread.sleep(2000);

		String actualTite = firstTitle.getText();

		Assert.assertTrue(actualTite.contains(title), RED + "Station not found.");

		System.out.println(GREEN + "station updated successfully.");
		
		Thread.sleep(1000);
		refreshFilter.click();

	}

	public void commonForStation(WebDriver driver, String branchName) throws Throwable {

		Administration.click();
		Thread.sleep(1000);

		switch (branchName) {
		case "1": {

			manageStataaionL.click();
			break;

		}
		case "1.1": {

			manageStataaionL.click();
			break;

		}
		case "2": {
			manageStataaionT.click();
			break;
		}

		case "3": {
			manageStataaionT.click();
			break;
		}

		default:
			System.out.println("branch not found");

		}

		Thread.sleep(2000);
		refreshFilter.click();
		Thread.sleep(2000);

	}
	
	
	public void deleteStaions(WebDriver driver) throws Throwable
	{
		Actions act = new Actions(driver);
		refreshFilter.click();
		Thread.sleep(2000);
		searchField.click();
		act.sendKeys("BG_St-").perform();
		Thread.sleep(3000);
		
		
		
		int totalAlarms = 0;

		for (int batch = 1; batch <= 15; batch++) {
			int count = availableStationForDelete.size();

			if (count == 0) {
				break;
			}

			System.out.println("The iteration-" + batch + " still ongoing, please wait.");

			selectAll.click();
			Thread.sleep(2000);
			deleteAll.click();
			Thread.sleep(1000);
			yesDelete.click();
			Thread.sleep(1000);

			driver.navigate().refresh();
			Thread.sleep(3000);

			totalAlarms += count;
		}

		System.out.println("The iteration has been completed.");
		System.out.println(GREEN + "Total >>>>>" + totalAlarms + "<<<<< stationsss deleted successfully.");

		refreshFilter.click();
		Thread.sleep(2000);
		
		
		
		
		
		
	}

	
}
