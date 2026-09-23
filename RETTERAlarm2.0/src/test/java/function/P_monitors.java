package function;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.List;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class P_monitors extends b_baseClass {

	 @FindBy(xpath="//li[normalize-space()='Manage Monitor']")private WebElement manageMonitors;
	 @FindBy(xpath="//button[@class=\"btn-success btn-x30\"]")private WebElement createNew;
	 @FindBy(xpath="(//dx-select-box[@_ngcontent-ng-c2138637191])[1]")private WebElement selectType;
	 @FindBy(xpath="//div[text()=\" Station \"]")private WebElement stationMonitor;
	 @FindBy(xpath="(//dx-select-box[@displayexpr=\"firestation_name\"])[2]")private WebElement stationName;
	 @FindBy(xpath="(//input[@class=\"dx-texteditor-input\" and @maxlength=\"150\"])[1]")private WebElement monitorName ;
	 @FindBy(xpath="(//input[@class=\"dx-texteditor-input\" and @maxlength=\"150\"])[2]")private WebElement monitorUserName ;
	 @FindBy(xpath="//span[text()=\"Address\"]")private WebElement monitorAddress;
	 @FindBy(xpath="//input[@type=\"password\"]")private WebElement passwordField;
	@FindBy(xpath="//span[text()=\"Save\"]")private WebElement save;
	@FindBy(xpath="(//td[@aria-colindex=\"3\" and @role=\"gridcell\"])[1]")private WebElement firstTitle;
	 @FindBy(xpath="//input[@placeholder=\"Search\"]")private WebElement searchField;
	 @FindBy(xpath="(//i[@class=\"dx-icon dx-icon-overflow\"])[2]")private WebElement actionButton;
	@FindBy(xpath="(//div[@class=\"dx-button-content\"])[11]")private WebElement editMonitor;
	 @FindBy(xpath="//i[@class=\"dx-icon dx-icon-refresh\"]")private WebElement refreshFilter;
	 @FindBy(xpath="//div[@aria-label=\"Items per page: 100\"]")private WebElement itemPerPage100;
	 @FindBy(xpath="//span[contains(text(), 'Bg') or contains(text(), 'BG')]")private List<WebElement> bgMonitor ;
	 @FindBy(xpath = "(//span[@class=\"dx-checkbox-icon\"])[1]")
		private WebElement selectAll;
		@FindBy(xpath = "//i[@class=\"ri ri-delete-bin-6-line\"]")
		private WebElement delete;
		@FindBy(xpath = "//div[@aria-label=\"Yes, Delete\"]")
		private WebElement deleteYes;
		@FindBy(xpath = "(//div [@class=\"dx-item dx-toolbar-item dx-toolbar-button\"])[3]")
		private WebElement delateAll;
		@FindBy(xpath = "///span[text()=\"Ja, löschen\" or text()=\"Yes, Delete\"]")
		private WebElement deleteAllYes;
		 @FindBy(xpath="//div[text()=\" Overview \"]")private WebElement  overviewMonitor;
	 @FindBy(xpath="(//input[@type='text' and @autocomplete='off' and @maxlength='150'])[1]")private WebElement overviewMonitorName;
	 @FindBy(xpath="//input[@aria-controls=\"dx-129ffd01-064e-8bb0-5a2b-fca026c8c99c\"]")private WebElement showDashboardAlarmOverview ;
//	 @FindBy(xpath="(//div[@class=\"dx-item-content dx-list-item-content\"])[1]")private WebElement alarmCount2;
	 @FindBy(xpath="(//input[@placeholder=\"Select...\"])[5]")private WebElement alarmCount2;
	 @FindBy(xpath="(//div[@class=\"dx-item-content dx-list-item-content\"])[3]")private WebElement alarmCount10;
	// @FindBy(xpath="")private WebElement ;
	// @FindBy(xpath="")private WebElement ;
	// @FindBy(xpath="")private WebElement ;
	// @FindBy(xpath="")private WebElement ;
	// @FindBy(xpath="")private WebElement ;
	// @FindBy(xpath="")private WebElement ;
	// @FindBy(xpath="")private WebElement ;

	public P_monitors(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}

	
	public void editOverviewMonitor (WebDriver driver,String branchName, String newOverviewMonitorName, String gtimeHHMMSS) throws Throwable
	{
		
//		System.out.println(newOverviewMonitorName);
		
//		refreshFilter.click();
		Thread.sleep(2000);
		Actions act = new Actions (driver);
		manageMonitors.click();
		Thread.sleep(2000);
		searchField.click();
		act.sendKeys(newOverviewMonitorName).perform();		
		Thread.sleep(2000);
		actionButton.click();
		Thread.sleep(2000);
		editMonitor.click();
		Thread.sleep(2000);
		String title =newOverviewMonitorName+"_"+gtimeHHMMSS+"_updated";
		
		
		overviewMonitorName.click();
		act.sendKeys(Keys.HOME).perform();
		for (int i=0;i<=200;i++)
		{
			
			act.sendKeys(Keys.DELETE).perform();
			
		}
		Thread.sleep(1000);
		act.sendKeys(title).perform();
		Thread.sleep(2000);
		monitorUserName.click();
		act.sendKeys(Keys.HOME).perform();
		for (int i=0;i<=200;i++)
		{
			
			act.sendKeys(Keys.DELETE).perform();
			
		}
		Thread.sleep(1000);
		Thread.sleep(2000);
		act.sendKeys(title).perform();
		Thread.sleep(2000);
		
//		showDashboardAlarmOverview.click();
//		Thread.sleep(1000);
//		alarmCount2.click();
//		Thread.sleep(1000);
		
		
		
		act.moveToElement(save).click().build().perform();
		Thread.sleep(2000);
		
		
		
		

		String actualTite = firstTitle.getText();

		Assert.assertTrue(actualTite.contains(title), RED + "Station not found.");

		System.out.println(GREEN + "New overview monitor edited successfully.");
		
		
		refreshFilter.click();
		
	}
	
	public void addOverviewMonitor (WebDriver driver,String branchName, String deptN, String gtimeHHMMSS, String filePath) throws Throwable
	{
		Actions act = new Actions (driver);
		manageMonitors.click();
		Thread.sleep(2000);
		createNew.click();
		Thread.sleep(2000);
		selectType.click();
		Thread.sleep(2000);
		overviewMonitor.click();
		Thread.sleep(2000);
		String title ="BG_"+ deptN+"_"+gtimeHHMMSS+"_OVM01";
		overviewMonitorName.click();
		act.sendKeys(title).perform();
		Thread.sleep(2000);
		monitorUserName.click();
		Thread.sleep(2000);
		act.sendKeys(title).perform();
		Thread.sleep(2000);
		
		
		alarmCount2.click();
		Thread.sleep(2000);
		alarmCount10.click();
		
		
		act.moveToElement(passwordField).click().build().perform();
		Thread.sleep(2000);

		act.sendKeys("Atina@123").perform();
		
		

		FileInputStream in = new FileInputStream(filePath);
		XSSFWorkbook wb = new XSSFWorkbook(in);
		XSSFSheet sheet = wb.getSheetAt(0);

		Row row = sheet.createRow(71); 
		row.createCell(1).setCellValue(title);
		in.close();

		FileOutputStream out = new FileOutputStream(filePath);
		wb.write(out);
		out.close();
		wb.close();

		
		act.moveToElement(save).click().build().perform();
		Thread.sleep(2000);
		
		
		searchField.click();
		act.sendKeys("BG_Bhupesh Fire & Emergency Services Department").perform();		
		Thread.sleep(2000);
		
		
		

		String actualTite = firstTitle.getText();
		
//		System.out.println(title);
//		System.out.println(actualTite);

		Assert.assertTrue(actualTite.contains(title), RED + "Station not found.");

		System.out.println(GREEN + "New overview monitor added successfully.");
		
		refreshFilter.click();
		
	}
	
	
	

	public void editStationMonitor (WebDriver driver, String branchName, String newStationMonitorName, String newStationName, String gtimeHHMMSS) throws Throwable
	{
		Actions act = new Actions (driver);
		manageMonitors.click();
		Thread.sleep(2000);
		searchField.click();
		act.sendKeys(newStationMonitorName).perform();		
		Thread.sleep(2000);
		actionButton.click();
		Thread.sleep(2000);
		editMonitor.click();
		Thread.sleep(2000);
		monitorName.click();
		act.sendKeys(Keys.HOME).perform();
		for (int i=0;i<=200;i++)
		{
			
			act.sendKeys(Keys.DELETE).perform();
			
		}
		Thread.sleep(1000);
		String newName =newStationMonitorName+"_"+gtimeHHMMSS+"_up";
		act.sendKeys(newName).perform();
		monitorUserName.click();
		act.sendKeys(Keys.HOME).perform();
		for (int i=0;i<=200;i++)
		{
			

			act.sendKeys(Keys.DELETE).perform();
			
		}
		Thread.sleep(1000);
		act.sendKeys(newName).perform();
		monitorAddress.click();
		act.sendKeys(Keys.HOME).perform();
		
		for (int i=0;i<=200;i++)
		{
			

			act.sendKeys(Keys.DELETE).perform();
			
		}
		
		act.sendKeys("Burdi Nagpur").sendKeys(Keys.TAB).build().perform();
		
		Thread.sleep(2000);
		act.moveToElement(save).click().build().perform();
		Thread.sleep(3000);
		
		refreshFilter.click();
		searchField.click();
		act.sendKeys(newName).perform();
		Thread.sleep(2000);
		String actualTite = firstTitle.getText();

		Assert.assertTrue(actualTite.contains(newName), RED + "Station not found.");

		System.out.println(GREEN + "New station monitor edited successfully.");
		
		Thread.sleep(2000);
		refreshFilter.click();
	}
	
	
	
	public void addStationMonitor (WebDriver driver, String branchName, String newStationName, String gtimeHHMMSS, String filePath) throws Throwable
	{
		Actions act = new Actions (driver);
		manageMonitors.click();
		Thread.sleep(2000);
		createNew.click();
		Thread.sleep(2000);
		selectType.click();
		Thread.sleep(2000);
		stationMonitor.click();
		Thread.sleep(2000);
		stationName.click();
		Thread.sleep(2000);
		act.sendKeys(newStationName).perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(1000);
		monitorName.click();
		Thread.sleep(2000);
		String title = newStationName+"_"+gtimeHHMMSS+"_M01";
		act.sendKeys(title).perform();
		Thread.sleep(2000);
		monitorUserName.click();
		Thread.sleep(2000);
		act.sendKeys(title).perform();
		Thread.sleep(2000);
		monitorAddress.click();
		act.sendKeys("Mahal Nagpur").sendKeys(Keys.TAB).build().perform();
		Thread.sleep(2000);
		
		act.moveToElement(passwordField).click().build().perform();
		Thread.sleep(2000);

		act.sendKeys("Atina@123").perform();
		
		

		FileInputStream in = new FileInputStream(filePath);
		XSSFWorkbook wb = new XSSFWorkbook(in);
		XSSFSheet sheet = wb.getSheetAt(0);

		Row row = sheet.createRow(56); // 56
		row.createCell(1).setCellValue(title);
		in.close();

		FileOutputStream out = new FileOutputStream(filePath);
		wb.write(out);
		out.close();
		wb.close();

		
		act.moveToElement(save).click().build().perform();
		Thread.sleep(2000);
		
		
		
		

		String actualTite = firstTitle.getText();

		Assert.assertTrue(actualTite.contains(title), RED + "Station not found.");

		System.out.println(GREEN + "New station monitor added successfully.");
		
		
		
		
		
	}
	
	
	public void deleteMonitorUsers (WebDriver driver, String branchName) throws Throwable
	
	{
		Actions act = new Actions (driver);
		manageMonitors.click();
		Thread.sleep(2000);
		searchField.click();
		act.sendKeys("BG").perform();		
		Thread.sleep(2000);
		itemPerPage100.click();	
		Thread.sleep(2000);
		
		int totalAlarms = 0;

		for (int batch = 1; batch <= 15; batch++) {
			int count = bgMonitor.size();

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
	
	
	
	
}
