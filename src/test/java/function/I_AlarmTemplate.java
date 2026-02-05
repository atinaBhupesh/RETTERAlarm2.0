package function;

import java.awt.Robot;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.List;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class I_AlarmTemplate extends b_baseClass {
	
	
	@FindBy(xpath = "//span[text()=\"Alarm\"]")private WebElement manualAlarmModule;
	
	 @FindBy(xpath="//a[@href=\"https://admin.retteralarm.de/verify-user?returnUrl=/admin/alarm-template/list\"]")private WebElement alarmTemplateL;
	@FindBy(xpath="//a[@href=\"http://admin.testing.retteralarm.de/verify-user?returnUrl=/admin/alarm-template/list\"]")private WebElement alarmTemplateT ;
	@FindBy(xpath="//a[@href=\"https://admin.development.retteralarm.de/verify-user?returnUrl=/admin/alarm-template/list\"]")private WebElement  alarmTemplateD;
	
	@FindBy(xpath="//div[@aria-label=\"Refresh\"]")private WebElement refreshFilter;
	@FindBy(xpath="//button[@class=\"btn-success btn-x30\"]")private WebElement createNewButton;
	
	@FindBy(xpath="//input[@name=\"title\"]")private WebElement alarmTemplateTitleField ;
	@FindBy(xpath="//input[@id=\"dx_dx-a5838d56-d52e-6b5c-9fac-18217d499561_selectedTemplateStation\"]")private WebElement selectTemplateStationFiled ;
	@FindBy(xpath="//input[@id=\"dx_dx-d167d5a1-43eb-94d0-6763-ee486df55d41_selectedStations\"]")private WebElement selectAlarmStationsField ;
	
	
	@FindBy(xpath = "//input[contains(@id,\"keyword\")]")private WebElement alarmKeyword;
	
	@FindBy(xpath="//input[@name=\"alarmImage\"]")private WebElement alarmImage ;
	@FindBy(xpath = "//textarea[contains(@id,\"alarmDetails\")]")private WebElement descriptionField;
	@FindBy(xpath="//div[text()=\"Reporter\" or text()=\"Melder\"]")private WebElement reporter ;
	@FindBy(xpath="//input[@name=\"reporter.name\"]")private WebElement reporterName ;
	@FindBy(xpath="//input[@name=\"reporter.street\"]")private WebElement reporterStreet;
	@FindBy(xpath="//input[contains(@id, 'reporter.zipCode')]")private WebElement reporterZipCode;
	@FindBy(xpath="//input[contains(@id, 'reporter.mobileNo')]")private WebElement reporterMobileNo;
	@FindBy(xpath="//input[contains(@id,\"reporter.callback\")]")private WebElement reporterCallback;
	@FindBy(xpath="//div[text()=\"Additional Fields\" or text()=\"Zusätzliche Felder\" ]")private WebElement additionalField;
	@FindBy(xpath="//input[@name=\"additionalFields[0]\"]")private WebElement additionalField1;
	@FindBy(xpath="//i[@class=\"dx-icon dx-icon-add\"]")private WebElement addadditionalField;
	@FindBy(xpath="//input[@name=\"additionalFields[1]\"]")private WebElement additionalField2;
	@FindBy(xpath="//span[text()=\"Next\" or text()=\"nächste\" ]")private WebElement next;
	@FindBy(xpath="//textarea[@name=\"address\"]")private WebElement alarmAddress;
	@FindBy(xpath="//div[text()=\"Additional address information\" or text()=\"Zusätzliche Adressinformationen\"]")private WebElement additionalAddressInformation;
	@FindBy(xpath="//input[@class='dx-texteditor-input' and @name='object']")private WebElement alarmObject;
	@FindBy(xpath="//input[@name=\"floor\"]")private WebElement alarmFloor;
	@FindBy(xpath="//input[@name=\"annotation\"]")private WebElement alarmAnnotation;
	@FindBy(xpath="(//span[@class=\"dx-button-text\"])[2]")private WebElement next2;
	@FindBy(xpath="(//div[@class=\"dx-scrollable-scrollbar dx-widget dx-scrollbar-vertical dx-scrollbar-hoverable\"])[3]")private WebElement scrollDown;
	
	
	@FindBy(xpath="//div[text()=\"Attributes\"]")private WebElement userTypeAttribute;
	@FindBy(xpath="//input[contains(@id,'selectedVehicles')]")private WebElement vehicleField1;
	@FindBy(xpath="//input[contains(@id,'selectedAttributes')]")private WebElement attributeField;
	
	@FindBy(xpath="//div[text()=\"Resources\"]")private WebElement userTypeResource;
	 @FindBy(xpath="(//input[contains(@id,\"selectedResources\")])[1]")private WebElement resourceField1;
	 @FindBy(xpath="(//input[contains(@id,\"selectedResources\")])[2]")private WebElement resourceField2;
	
	
	 @FindBy(xpath="//div[text()=\"Fire Fighters\"]")private WebElement userTypeFirefighter;
	 @FindBy(xpath="(//input[contains(@id,\"selectedUsers\")])[1]")private WebElement FirefighterField1;
	 @FindBy(xpath="(//input[contains(@id,\"selectedUsers\")])[2]")private WebElement FirefighterField2;
	
	 
	 @FindBy(xpath="//div[@class=\"buttons-group-container dx-first-col dx-last-col dx-last-row dx-field-item dx-col-0 dx-field-item-optional dx-field-item-has-group\"]")private WebElement blankSpace;
	 @FindBy(xpath="//span[text()=\"Save\"]")private WebElement saveTemplate;
	 @FindBy(xpath="//span[text()=\"Yes, Create\"]")private WebElement yesCreateTemplate;
		@FindBy(xpath="//div[@aria-label=\"Items per page: 100\"]")private WebElement itemPepage100;
		@FindBy(xpath="(//i[@class=\"dx-icon-filter filter-icon\"])[1]")private WebElement titleSearch;
		@FindBy(xpath="//dx-text-box[@mode=\"search\"]")private WebElement titleSearchField;
		@FindBy(xpath="//div[@aria-label=\"OK\"]")private WebElement titleSearchFieldOk;
	
		@FindBy(xpath="(//span[@class=\"dx-checkbox-icon\"])[1]")private WebElement selectAll;
		@FindBy(xpath="//i[@class=\"ri ri-delete-bin-6-line\"]")private WebElement deleteAll;
		@FindBy(xpath="//span[text()=\"Yes, Delete\"]")private WebElement yesDelete;
	@FindBy(xpath="//td[contains(text(),\"BG_AT by\")]")private List< WebElement> BGTemplateCount;
	 @FindBy(xpath="(//td[@role=\"gridcell\"])[4]")private WebElement firstItemTitle;
	@FindBy(xpath="(//i[@class=\"dx-icon dx-icon-overflow\"])[2]")private WebElement actionButton;		
	 @FindBy(xpath="(//div[@class=\"dx-button-content\"])[11]")private WebElement createAlarmButton;
		 @FindBy(xpath="(//span[@class=\"dx-tab-text-span\"])[3]")private WebElement usersAndResources;
			 @FindBy(xpath="(//span[@class=\"dx-button-text\"])[2]")private WebElement generateAlarm ;
			@FindBy(xpath="(//span[@class=\"dx-button-text\"])[4]")private WebElement yesCreate ;
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
	
	
	
	public I_AlarmTemplate (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	
	
	public void smokeAlarmTemplate()
	{
		if(createNewButton.isDisplayed()) {
		    System.out.println(GREEN+"Create New button for alarm template is visible");
		} else {
		    Assert.fail(RED+"Create New button is NOT displayed");
		}
		
	}
	
	public void createAlarmByNewlyAddedTemplateFromTemplateModule(WebDriver driver,String NewTemplate,String gTodaysDate,String gtimeHHMMSS, String branchName) throws Throwable
	{
		Actions act= new Actions (driver);
		refreshFilter.click();
		Thread.sleep(2000);
		 titleSearch.click();
		    Thread.sleep(500);
		
		    titleSearchField.click();
		    Thread.sleep(500);
		
		    act.sendKeys(NewTemplate).perform();
	
			Thread.sleep(500);
			titleSearchFieldOk.click();
			Thread.sleep(2000);
			
			actionButton.click();
			Thread.sleep(2000);
			createAlarmButton.click();
			Thread.sleep(2000);
			usersAndResources.click();
			Thread.sleep(1000);
			generateAlarm.click();
			Thread.sleep(1000);
			yesCreate.click();
			Thread.sleep(10000);
			
			String title = "BG-MA by newly added tem -" + gTodaysDate+"_"+gtimeHHMMSS;
			
			
			String expectedTitle = firstItemTitle.getText();
			
			 
			
			Assert.assertTrue(
					title.contains(expectedTitle),
			        RED+"Alarm not added."
			);
	
			
			System.out.println(GREEN+title);
		
		
		
		
		
		
		
		
	}
	
	
	
	
	public void createNewAlarmTemplateByAttribute (WebDriver driver, String gTodaysDate,String gtimeHHMMSS, String St2N, String St1N, String St1V1, String St2V1,String st01A1, String st02A1 ) throws Throwable
	{	
		Actions act= new Actions (driver);
		String filePath = ".\\DataFiles\\DetailsFile.xlsx";
		
		createNewButton.click();
		Thread.sleep(2000);
		alarmTemplateTitleField.click();
		String title = "BG_AT by Atrribute_"+gTodaysDate+"_"+gtimeHHMMSS;
		act.sendKeys(title).perform();
		Thread.sleep(2000);
	
		
//		selectTemplateStationFiled.click();
		act.sendKeys(Keys.TAB).perform();
		Thread.sleep(1000);
		act.sendKeys(St1N).perform();
		Thread.sleep(1500);
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(1000);
		
//		selectAlarmStationsField.click();
		act.sendKeys(Keys.TAB).perform();
		Thread.sleep(1000);
		act.sendKeys(St2N).perform();
		Thread.sleep(1000);
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(1000);
		act.sendKeys(St1N).perform();
		Thread.sleep(1000);
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(1000);
		
		
		
		
		alarmKeyword.click();
		
		 
		
	act.sendKeys("BG-MA by newly added tem -" + gTodaysDate+"_"+gtimeHHMMSS).build().perform();
	
	alarmImage.click();
	
	
	act.sendKeys("Image-Alarm template by attribute.").build().perform();
	
	
	descriptionField.click();
	act.sendKeys("checking Alarm template by attribute.").build().perform();
	
	
	
	
	reporter.click();
	Thread.sleep(1000);
	reporterName.click();
	
	act.sendKeys("Dr. Sumit ").build().perform();
	
	reporterStreet.click();
	act.sendKeys("Kharbi Road, Nagpur").build().perform();
	reporterZipCode.click();
	act.sendKeys("440009").build().perform();
	
	reporterMobileNo.click();
	act.sendKeys("1122334455").build().perform();
	reporterCallback.click();
	act.sendKeys("10").build().perform();
	
	Robot robot = new Robot();
	
	
	act.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).sendKeys(Keys.TAB).build().perform();
	
	
	
	
	
	
	
	act.sendKeys("fire at hospital.").build().perform();
	
	
	
	
	act.sendKeys(Keys.TAB).sendKeys(Keys.TAB).build().perform();
	Thread.sleep(500);
	robot.mouseWheel(5);
	
	act.sendKeys(Keys.ENTER).build().perform();
	
	
	
	alarmAddress.click();
	act.sendKeys("BAPS Swaminarayan mandir, Wathoda Layout, Nagpur, Maharashtra 440035").build().perform();
		
	
	for (int i=0;i<=9;i++)
	{
		act.sendKeys(Keys.TAB).perform();
		
	}
		
		
		
		additionalAddressInformation.click();
		
		
		
		alarmObject.click();
		act.sendKeys("hospital").perform();
	
	
	alarmFloor.click();
	act.sendKeys("ground floor").perform();
	
	
	
	alarmAnnotation.click();
	act.sendKeys("alarm annotation").perform();
	
	act.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).build().perform();
	
	Thread.sleep(2000);
	
	
	
	userTypeAttribute.click();
	Thread.sleep(2000);
	
	vehicleField1.click();
	
	act.sendKeys(St1V1).perform();
	Thread.sleep(1000);
	act.sendKeys(Keys.ENTER).perform();
	Thread.sleep(1000);
	act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).build().perform();
	Thread.sleep(1000);
	act.sendKeys(St2V1).perform();
	Thread.sleep(1000);
	act.sendKeys(Keys.ENTER).perform();
	Thread.sleep(1000);
	act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).build().perform();
	
	attributeField.click();
	
	act.sendKeys(st01A1).perform();
	Thread.sleep(1000);
	act.sendKeys(Keys.ENTER).perform();

	act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).build().perform();
		Thread.sleep(1000);
		act.sendKeys(st02A1).perform();
		Thread.sleep(1000);
		act.sendKeys(Keys.ENTER).perform();

		blankSpace.click();
		Thread.sleep(500);
		
		saveTemplate.click();
		Thread.sleep(500);
		
		yesCreateTemplate.click();
		Thread.sleep(5000);
		
		FileInputStream in = new FileInputStream(filePath);
		XSSFWorkbook wb = new XSSFWorkbook(in);
		XSSFSheet sheet = wb.getSheetAt(0);

		Row row = sheet.createRow(20); // Row 21
		row.createCell(1).setCellValue(title); // Cell B

		in.close();

		FileOutputStream out = new FileOutputStream(filePath);
		wb.write(out);
		out.close();
		wb.close();

		
		String expectedTitle = firstItemTitle.getText();
		Assert.assertTrue(
				title.contains(expectedTitle),
		        RED+"Template not added."
		);

		
		System.out.println(GREEN+title);
		
		
		
		
	}
	
	public void createNewAlarmTemplateByResource (WebDriver driver, String gTodaysDate,String gtimeHHMMSS, String St2N, String St1N, String st01R1, String st02R1 ) throws Throwable
	{	
		
		Actions act= new Actions (driver);
		
		createNewButton.click();
		Thread.sleep(2000);
		alarmTemplateTitleField.click();
		String title = "BG_AT by Resource_"+gTodaysDate+"_"+gtimeHHMMSS;
		act.sendKeys(title).perform();
//		selectTemplateStationFiled.click();
		act.sendKeys(Keys.TAB).perform();
		Thread.sleep(1000);
		act.sendKeys(St1N).perform();
		Thread.sleep(1000);
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(1000);
		
//		selectAlarmStationsField.click();
		act.sendKeys(Keys.TAB).perform();
		Thread.sleep(1000);
		act.sendKeys(St2N).perform();
		Thread.sleep(1000);
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(1000);
		act.sendKeys(St1N).perform();
		Thread.sleep(1000);
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(1000);
		
		
		
		
		alarmKeyword.click();
		
		 
		
		act.sendKeys("BG - Alarm template by resource -" + gTodaysDate+"_"+gtimeHHMMSS).build().perform();
	
	alarmImage.click();
	
	
	act.sendKeys("Image-Alarm template by resource.").build().perform();
	
	
	descriptionField.click();
	act.sendKeys("checking Alarm template by resource.").build().perform();
	
	
	
	
	reporter.click();
	Thread.sleep(1000);
	reporterName.click();
	
	act.sendKeys("Dr. Sumit ").build().perform();
	
	reporterStreet.click();
	act.sendKeys("Kharbi Road, Nagpur").build().perform();
	reporterZipCode.click();
	act.sendKeys("440009").build().perform();
	
	reporterMobileNo.click();
	act.sendKeys("1122334455").build().perform();
	reporterCallback.click();
	act.sendKeys("10").build().perform();
	
	Robot robot = new Robot();
	
	
	act.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).sendKeys(Keys.TAB).build().perform();
	
	
	
	
	
	
	
	act.sendKeys("fire at hospital.").build().perform();
	
	
	
	
	act.sendKeys(Keys.TAB).sendKeys(Keys.TAB).build().perform();
	Thread.sleep(500);
	robot.mouseWheel(5);
	
	act.sendKeys(Keys.ENTER).build().perform();
	
	
	
	alarmAddress.click();
	act.sendKeys("BAPS Swaminarayan mandir, Wathoda Layout, Nagpur, Maharashtra 440035").build().perform();
		
	
	for (int i=0;i<=9;i++)
	{
		act.sendKeys(Keys.TAB).perform();
		
	}
		
		
		
		additionalAddressInformation.click();
		
		
		
		alarmObject.click();
		act.sendKeys("hospital").perform();
	
	
	alarmFloor.click();
	act.sendKeys("ground floor").perform();
	
	
	
	alarmAnnotation.click();
	act.sendKeys("alarm annotation").perform();
	
	act.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).build().perform();
	
	Thread.sleep(2000);
	
	
	userTypeResource.click();
	Thread.sleep(500);
	
	
	resourceField1.click();

		
	
	act.sendKeys(st01R1).perform();
	Thread.sleep(500);
	act.sendKeys(Keys.ENTER).perform();
	Thread.sleep(500);
	
	resourceField2.click();
		
	
	
	act.sendKeys(st02R1).perform();
	Thread.sleep(500);
	act.sendKeys(Keys.ENTER).perform();
	Thread.sleep(1000);
	

		blankSpace.click();
		Thread.sleep(500);
		
		saveTemplate.click();
		Thread.sleep(500);
		
		yesCreateTemplate.click();
		Thread.sleep(5000);
	
		String expectedTitle = firstItemTitle.getText();
		
		Assert.assertTrue(
				title.contains(expectedTitle),
		        RED+"Template not added."
		);

		
		System.out.println(GREEN+title);
		
		
		
		
		
	}
	
	
	public void createNewAlarmTemplateByFireFighter (WebDriver driver, String gTodaysDate,String gtimeHHMMSS, String St2N, String St1N, String st01V1, String st02V1,String st01FF1, String st02FF1 ) throws Throwable
	{	
		Actions act= new Actions (driver);
		createNewButton.click();
		Thread.sleep(2000);
		alarmTemplateTitleField.click();
		String title = "BG_AT by fire fighter_"+gTodaysDate+"_"+gtimeHHMMSS;
		act.sendKeys(title).perform();
//		selectTemplateStationFiled.click();
		act.sendKeys(Keys.TAB).perform();
		Thread.sleep(1000);

		act.sendKeys(St1N).perform();
		Thread.sleep(1000);
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(1000);
		
//		selectAlarmStationsField.click();
		act.sendKeys(Keys.TAB).perform();
		Thread.sleep(1000);
		
		act.sendKeys(St2N).perform();
		Thread.sleep(1000);
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(1000);
		act.sendKeys(St1N).perform();
		Thread.sleep(1000);
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(1000);
		
		
		
		
		alarmKeyword.click();
		
		 
		
		act.sendKeys("Bg Alarm template by resource -" + gTodaysDate+"_"+gtimeHHMMSS).build().perform();
	
	alarmImage.click();
	
	
	act.sendKeys("Image-Alarm template by resource.").build().perform();
	
	
	descriptionField.click();
	act.sendKeys("checking Alarm template by resource.").build().perform();
	
	
	
	
	reporter.click();
	Thread.sleep(1000);
	reporterName.click();
	
	act.sendKeys("Dr. Sumit ").build().perform();
	
	reporterStreet.click();
	act.sendKeys("Kharbi Road, Nagpur").build().perform();
	reporterZipCode.click();
	act.sendKeys("440009").build().perform();
	
	reporterMobileNo.click();
	act.sendKeys("1122334455").build().perform();
	reporterCallback.click();
	act.sendKeys("10").build().perform();
	
	Robot robot = new Robot();
	
	
	act.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).sendKeys(Keys.TAB).build().perform();
	
	
	
	
	
	
	
	act.sendKeys("fire at hospital.").build().perform();
	
	
	
	
	act.sendKeys(Keys.TAB).sendKeys(Keys.TAB).build().perform();
	Thread.sleep(500);
	robot.mouseWheel(5);
	
	act.sendKeys(Keys.ENTER).build().perform();
	
	
	
	alarmAddress.click();
	act.sendKeys("BAPS Swaminarayan mandir, Wathoda Layout, Nagpur, Maharashtra 440035").build().perform();
		
	
	for (int i=0;i<=9;i++)
	{
		act.sendKeys(Keys.TAB).perform();
		
	}
		
		
		
		additionalAddressInformation.click();
		
		
		
		alarmObject.click();
		act.sendKeys("hospital").perform();
	
	
	alarmFloor.click();
	act.sendKeys("ground floor").perform();
	
	
	
	alarmAnnotation.click();
	act.sendKeys("alarm annotation").perform();
	
	act.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).build().perform();
	
	Thread.sleep(2000);
	
	userTypeFirefighter.click();
	Thread.sleep(1000);
	
	
	vehicleField1.click();
	Thread.sleep(1000);
		
	
	act.sendKeys(st01V1).perform();
	Thread.sleep(1000);
	act.sendKeys(Keys.ENTER).perform();
	Thread.sleep(1000);
	
	act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).build().perform();
	Thread.sleep(500);
	
	act.sendKeys(st02V1).perform();
	Thread.sleep(1000);
	act.sendKeys(Keys.ENTER).perform();
	Thread.sleep(1000);
	
		
		
	
		
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
	
	
	

		blankSpace.click();
		Thread.sleep(500);
		
		saveTemplate.click();
		Thread.sleep(500);
		
		yesCreateTemplate.click();
		Thread.sleep(5000);
		
		String expectedTitle = firstItemTitle.getText();
		Assert.assertTrue(
				title.contains(expectedTitle),
		        RED+"Template not added."
		);

		
		System.out.println(GREEN+title);
		
		
	}
	
	
	public void deleteAlarmTemplate(WebDriver driver ) throws Throwable
	{
		
		itemPepage100.click();
		 Thread.sleep(5000);
		 Actions act = new Actions(driver);
		  titleSearch.click();
		    Thread.sleep(500);
		
		    titleSearchField.click();
		    Thread.sleep(500);
		
		    act.sendKeys("BG_AT by").perform();
	
			Thread.sleep(500);
			titleSearchFieldOk.click();
			Thread.sleep(10000);
			
			int totalTemplateCountCount = 0;
			
		
			
			for (int batch = 1; batch <=15 ; batch++) 
			{
			    int count = BGTemplateCount.size();
			    
			    if (count == 0) {
		            break;
		        }
		    	
		    	 System.out.print("The iteration-"+batch+" still ongoing, please wait."  );
		        System.out.println();
		
		        selectAll.click();
				Thread.sleep(2000);
				
				deleteAll.click();
				Thread.sleep(3000);
				yesDelete.click();
				Thread.sleep(3000);
				
		
				 driver.navigate().refresh();
			     Thread.sleep(3000);
			
			     totalTemplateCountCount += count;
		    }
		

			System.out.println("The iteration has been completed.");
			System.out.println(GREEN+"Total >>>>>" + totalTemplateCountCount + "<<<<< alarms deleted successfully.");
		
		
			    refreshFilter.click();
			    Thread.sleep(2000);
		
			 
			}
	
	
	public void  commonAlarmTemplate (WebDriver driver, String  branchName) throws Throwable
	{
		
		
		
//		manualAlarmModule.click();
		Thread.sleep(2000);
		
		
		if  (branchName.equals("1" ) )
		{
			
			driver.navigate().to("https://admin.retteralarm.de/admin/alarm-template/list");

		
		}
		
		else if (branchName.equals("2"))
		{
			driver.navigate().to("https://development.retteralarm.de/admin/Users/index");
			
		}
		
		else if (branchName.equals("3"))
			{
			driver.navigate().to("https://admin.retteralarm.de/admin/alarm-template/list");
				
				
			}		
		Thread.sleep(2000);
		

		refreshFilter.click();
		Thread.sleep(2000);
			
		
		
		
		
		
		
		
	}
	
	
	
	

}
