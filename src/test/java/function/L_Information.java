	package function;
	
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
	import org.openqa.selenium.support.ui.WebDriverWait;
	import org.testng.Assert;
	
	public class L_Information extends b_baseClass{
	
	@FindBy(xpath="//span[text()=\"Calendar\"]")private WebElement CalendarModule;
	
	@FindBy(xpath="//a[@href=\"http://admin.testing.retteralarm.de/verify-user?returnUrl=/admin/information/list\"]")private WebElement informationT;
	
	
	@FindBy(xpath="//button[@class=\"btn-success btn-x30\"]")private WebElement createNew;
	 @FindBy(xpath="//div[@class=\"dx-texteditor-input-container dx-tag-container\"]")private WebElement StationField ;
	 @FindBy(xpath="(//input[@class=\"dx-texteditor-input\"])[4]")private WebElement selectType;
	 @FindBy(xpath="//div[text()='Information']")private WebElement typeInformation;
	 
	 @FindBy(xpath="//label[text()=\"Description\"]")private WebElement Description;
	@FindBy(xpath="(//input[@class=\"dx-texteditor-input\"])[5]")private WebElement infoTitle;
	@FindBy(xpath="(//input[@class=\"dx-texteditor-input\"])[6]")private WebElement infoLocation;
	 @FindBy(xpath="//div[text()=\"Event\"]")private WebElement typeEvent;
	
	@FindBy(xpath="//div[@class=\"ql-editor ql-blank dx-htmleditor-content\"]")private WebElement InfoDescriptions;
	@FindBy(xpath="//div[text()=\"Attributes\"]")private WebElement userTypeAttribute;
	 @FindBy(xpath="//div[text()=\"Resources\"]")private WebElement userTypeResource ;
	 @FindBy(xpath="//div[text()=\"Fire Fighters\"]")private WebElement userTypeFireFighters ;
	 @FindBy(xpath="//div[text()=\"Stations\"]")private WebElement userTypeStations ;
	
	
	 @FindBy(xpath="//div[@class=\"dx-switch-wrapper\"]")private WebElement monitorOption;
	 @FindBy(xpath="(//div[@class=\"dx-texteditor-input-container dx-tag-container\"])[3]")private WebElement monitorField ;
	 @FindBy(xpath="(//div[@class=\"dx-dropdowneditor-icon\"])[7]")private WebElement infoStartDate;
	
	@FindBy(xpath="//dx-tag-box[@class=\"dx-validator dx-visibility-change-handler dx-show-invalid-badge dx-tagbox dx-selectbox dx-textbox dx-texteditor dx-show-clear-button dx-editor-filled dx-texteditor-empty dx-widget dx-tagbox-default-template dx-dropdowneditor dx-dropdowneditor-field-clickable dx-state-hover\"]")private WebElement selectStation;
	@FindBy(xpath="//dx-select-box[@itemtemplate=\"categoryTemplate\"]")private WebElement eventCategoty ;
	@FindBy(xpath="(//span[text()=\"BhupeshEventCategory\"])[2]")private WebElement BhupeshEventCategory;
	@FindBy(xpath="//div[@aria-label=\"Editor content\"]")private WebElement descriptionField;
	@FindBy(xpath="(//dx-text-box[@validationmessagemode=\"always\"])[2]")private WebElement eventLoction;
	@FindBy(xpath="(//dx-switch[@_ngcontent-ng-c2898262822])[1]")private WebElement fulldayEventSwitch;
	@FindBy(xpath="(//DIV[@class=\"dx-texteditor-buttons-container\"])[12]")private WebElement startDate;
	@FindBy(xpath="(//DIV[@class=\"dx-texteditor-buttons-container\"])[15]")private WebElement endDate;
	@FindBy(xpath="(//DIV[@class=\"dx-texteditor-buttons-container\"])[11]")private WebElement startDateSt;
	@FindBy(xpath="(//DIV[@class=\"dx-texteditor-buttons-container\"])[14]")private WebElement endDateSt;
	 @FindBy(xpath="(//span[text()=\"Today\"])[1]")private WebElement today1;
	 @FindBy(xpath="(//input[@aria-label=\"hours\"])[1]")private WebElement startDateHours;
	 @FindBy(xpath="(//div[@aria-label=\"OK\"])[2]")private WebElement startTimeOk ;
	@FindBy(xpath="(//span[text()=\"Today\"])[2]")private WebElement today2 ;
	 @FindBy(xpath="(//input[@aria-label=\"hours\"])[2]")private WebElement endDateHours;
	@FindBy(xpath="(//div[@aria-label=\"OK\"])[3]")private WebElement endDateTimeOk ;
	@FindBy(xpath="//span[text()=\"Save\"]")private WebElement save;
	 @FindBy(xpath="(//td[contains(translate(text(),'BG','bg'),'bg')])[1]")private WebElement firstInfoTitle;
	 @FindBy(xpath="(//DIV[@class=\"dx-texteditor-input-container dx-tag-container\"])[3]")private WebElement monitorFields;
	
	
		
		
	
		
		
		
	 
	 
	  @FindBy(xpath="//div[@aria-label=\"Refresh\"]")private WebElement refreshFilter;
	 @FindBy(xpath="//input[@placeholder=\"Information Search...\"]")private WebElement searchInfoEventField;
	 @FindBy(xpath="//div[@aria-label=\"Items per page: 100\"]")private WebElement itemsPerPage100;
	 @FindBy(xpath="//span[contains(text(), 'Bg') or contains(text(), 'BG') or contains(text(), 'bg')]")private List<WebElement> availableBGInfoEvent;
	 @FindBy(xpath="//div[@aria-label=\"Select all\"]")private WebElement selectAll;
	@FindBy(xpath="//i[@class=\"ri ri-delete-bin-6-line\"]")private WebElement delete;
	@FindBy(xpath="//div[@aria-label=\"Yes, Delete\"]")private WebElement deleteYes;
	 @FindBy(xpath="//i[@class=\"ri ri-delete-bin-6-line\"]")private WebElement delateAll;
	
	@FindBy(xpath="//h4[text()=\"Alerting Over\"]")private WebElement AlertingOver ;
	 @FindBy(xpath="(//div[@class=\"dx-dropdowneditor-icon\"])[7]")private WebElement startDateStT;
	@FindBy(xpath="(//div[@class=\"dx-dropdowneditor-icon\"])[8]")private WebElement endDateStT;
			
	 @FindBy(xpath="(//input[@placeholder=\"Select...\"])[5]")private WebElement eventCategory;
	 @FindBy(xpath="//span[text()=\"ADSt06Ecat1\"]")private WebElement ADSt06Ecat1;
	 @FindBy(xpath="(//input[@class=\"dx-texteditor-input\"])[11]")private WebElement startDateTimeEvent ;
	 @FindBy(xpath="(//input[@class=\"dx-texteditor-input\"])[14]")private WebElement endDateTimeEvent ;

	@FindBy(xpath="(//input[@placeholder=\"Select...\"])[6]")private WebElement selectReminderType;
	@FindBy(xpath="(//input[@placeholder=\"Select...\"])[9]")private WebElement remindarMin;
	@FindBy(xpath="(//input[@placeholder=\"Select...\"])[8]")private WebElement remindarHrs;
	 @FindBy(xpath="(//input[@placeholder=\"Select...\"])[7]") private WebElement remindarDay;
	 @FindBy(xpath="(//input[@class=\"dx-texteditor-input\"])[12]") private WebElement eventEndTimeStEvent;
	 @FindBy(xpath="//span[text()=\"OK\"]") private WebElement timeOk;
	
	 
	 @FindBy(xpath="(//i[@class=\"dx-icon dx-icon-overflow\"])[2]") private WebElement actionButton;
	@FindBy(xpath="(//div[@class=\"dx-button-content\"])[13]") private WebElement chatOption;
	@FindBy(xpath = "//input[@placeholder=\"Write your message...\"]")private WebElement writemessageField;
	@FindBy(xpath = "//button[@id=\"actionSendMessage\"]")private WebElement sendmessageButton;
	@FindBy(xpath="(//li[@class='replies'])[last()]/p") private WebElement messageText;
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
		
		public L_Information (WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		

		public void SendMessageTo1DayInformationEventByFireFighter(WebDriver driver,String InfoEventNameForChat,String gTodaysDate, String gtimeHHMMSS, String branchName ) throws Throwable 
		{
			Actions act= new Actions (driver);
			searchInfoEventField.click();
			Thread.sleep(500);
			act.sendKeys(InfoEventNameForChat).perform();
			Thread.sleep(2000);
			actionButton.click();
			Thread.sleep(2000);
			chatOption.click();
			Thread.sleep(2000);
			
			writemessageField.click();
		    Thread.sleep(1000);

		    String message = "Message for info-event User_"+gTodaysDate+"_"+gtimeHHMMSS;
		    act.sendKeys(message).perform();
		    sendmessageButton.click();
		    Thread.sleep(2000);
			
			
			
		    String expectedTitle = messageText.getText().split("\\n")[0].trim();
//		    System.out.println(expectedTitle);
			
			 
			
			Assert.assertTrue(
					message.contains(expectedTitle),
					RED + "Message not sent."
			);
	
			System.out.println(GREEN+message+" sent successfuly ");
			
			
			
			
		}
		
		public void createFullDayInformationEventByStation(WebDriver driver,String st01N ,  String st02N, String gTodaysDate,String gtimeHHMMSS,String gTomorrowDate, String branchName ) throws Throwable 
		{
			Actions act= new Actions (driver);
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			
			
			
			createNew.click();
			Thread.sleep(2000);
		
			StationField.click();
			act.sendKeys(st01N).perform();
			Thread.sleep(2000);
			act.sendKeys(Keys.ENTER).perform();
			Thread.sleep(500);
			
			
			act.sendKeys(st02N).perform();
			Thread.sleep(2000);
			act.sendKeys(Keys.ENTER).perform();
			Thread.sleep(500);
			
			
			selectType.click();
			Thread.sleep(2000);
		
			typeEvent.click();
			Thread.sleep(500);
			
			
			act.sendKeys(Keys.PAGE_DOWN).build().perform();
			Thread.sleep(1000);
			infoTitle.click();
			String title="Bg_Full Day Information-Event by Stations (two Station)_"+gTodaysDate+"_"+gtimeHHMMSS ;
			act.sendKeys(title).perform();
			Thread.sleep(500);
			
			infoLocation.click();
			Thread.sleep(1000);
			
			act.sendKeys("Napur").perform();
			Thread.sleep(500);
			
			
			
			InfoDescriptions.click();
			Thread.sleep(1000);
		
			act.sendKeys("Checking full Day Information-Event by Stations (two Station) on "+gTodaysDate+"_"+gtimeHHMMSS+"_"+ gTomorrowDate ).perform();
			Thread.sleep(500);
			
			eventCategory.click();
			Thread.sleep(2000);
			act.sendKeys(Keys.DOWN).sendKeys(Keys.ENTER).build().perform();
			Thread.sleep(1000);
			
			act.sendKeys(Keys.TAB).perform();
			Thread.sleep(500);
			act.sendKeys(Keys.SPACE).perform();
			Thread.sleep(1000);
			
			
			
			startDateTimeEvent.click();
			Thread.sleep(1000);
			today1.click();
			Thread.sleep(500);
			act.sendKeys(Keys.RIGHT,Keys.ENTER,Keys.ENTER).build().perform();
			Thread.sleep(500);
			Thread.sleep(1000);
			

			eventEndTimeStEvent.click();
			Thread.sleep(500);
			today2.click();
			Thread.sleep(500);
			act.sendKeys(Keys.ENTER,Keys.ENTER).build().perform();
			Thread.sleep(500);
			Thread.sleep(1000);

			act.sendKeys(Keys.TAB,Keys.TAB).build().perform();
			Thread.sleep(500);
			
			act.sendKeys(Keys.RIGHT,Keys.RIGHT,Keys.RIGHT,Keys.SPACE).build().perform();
			
			Thread.sleep(500);
			
			
			
			act.sendKeys(Keys.TAB,Keys.TAB).build().perform();
			Thread.sleep(1000);
			act.sendKeys(Keys.ENTER).perform();
			
			
			
			Thread.sleep(5000);
			String expectedTitle = firstInfoTitle.getText();
			
			 
	
			Assert.assertTrue(
					title.contains(expectedTitle),
			        RED+"Info NOT added because title is not available"
			);
	
			System.out.println(GREEN+title);
		}
		
		public void create1DayInformationEventByFireFighter(WebDriver driver,String st01N ,  String st02N, String gTomorrowDate,String gtimeHHMMSS,String st01R1,
				String St01M1,String St01M2, String germanyTimeAfter5MinHH, String germanyTimeAfter5MinMM, 
				String  germanyTimeAfter20MinHH,  String germanyTimeAfter20MinMM ,String st01FF1,String st02FF1, String branchName ) throws Throwable 
		{
			Actions act= new Actions (driver);
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			String filePath = ".\\DataFiles\\DetailsFile.xlsx";
			
			createNew.click();
			Thread.sleep(2000);
		
			StationField.click();
			act.sendKeys(st01N).perform();
			Thread.sleep(2000);
			act.sendKeys(Keys.ENTER).perform();
			Thread.sleep(500);
			
			
			act.sendKeys(st02N).perform();
			Thread.sleep(2000);
			act.sendKeys(Keys.ENTER).perform();
			Thread.sleep(500);
			
			
			selectType.click();
			Thread.sleep(2000);
		
			typeEvent.click();
			Thread.sleep(500);
			
			
			act.sendKeys(Keys.PAGE_DOWN).build().perform();
			Thread.sleep(1000);
			infoTitle.click();
			String title="Bg_1 Day Information-Event by Fire fighter (two Station)_"+gTomorrowDate+"_"+gtimeHHMMSS ;
			act.sendKeys(title).perform();
			Thread.sleep(500);
			
			infoLocation.click();
			Thread.sleep(1000);
			
			act.sendKeys("Napur").perform();
			Thread.sleep(500);
			
			
			
			InfoDescriptions.click();
			Thread.sleep(1000);
		
			act.sendKeys("Checking 1 Day Information-Event by Fire fighter (two Station) on "+gTomorrowDate+"_"+gtimeHHMMSS+" from -"+germanyTimeAfter5MinHH+":"+germanyTimeAfter5MinMM+" To "+germanyTimeAfter20MinHH+":"+germanyTimeAfter20MinMM ).perform();
			Thread.sleep(500);
			
			eventCategory.click();
			Thread.sleep(2000);
			act.sendKeys(Keys.DOWN).sendKeys(Keys.ENTER).build().perform();
			Thread.sleep(1000);
			
			act.sendKeys(Keys.TAB).perform();
			Thread.sleep(500);
			act.sendKeys(Keys.SPACE).perform();
			Thread.sleep(1000);
			act.sendKeys(Keys.SPACE).perform();
			Thread.sleep(1000);
			act.sendKeys(Keys.TAB).perform();
			Thread.sleep(1000);
			
			
			startDateTimeEvent.click();
			Thread.sleep(1000);
			today1.click();
			Thread.sleep(500);
			act.sendKeys(Keys.RIGHT).sendKeys(Keys.ENTER).build().perform();
			Thread.sleep(500);
			startDateHours.click();
			Thread.sleep(500);
			act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
			Thread.sleep(1000);
			act.sendKeys(germanyTimeAfter5MinHH).perform();
			Thread.sleep(200);
			act.keyDown(Keys.TAB).perform();
			Thread.sleep(200);
			act.sendKeys(germanyTimeAfter5MinMM).perform();
			Thread.sleep(200);
			startTimeOk.click();
			Thread.sleep(1000);
			

			
			endDateTimeEvent.click();
			Thread.sleep(500);
			today2.click();
			Thread.sleep(500);
			act.sendKeys(Keys.RIGHT).sendKeys(Keys.ENTER).build().perform();
			Thread.sleep(500);
			endDateHours.click();
			Thread.sleep(500);
			act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
			Thread.sleep(500);
			act.sendKeys(germanyTimeAfter20MinHH).perform();
			Thread.sleep(500);
			act.keyDown(Keys.TAB).perform();
			Thread.sleep(500);
			act.sendKeys(germanyTimeAfter20MinMM).perform();
			Thread.sleep(500);
			endDateTimeOk.click();
			Thread.sleep(1000);
			

			act.sendKeys(Keys.TAB).perform();
			Thread.sleep(500);
			act.sendKeys(Keys.SPACE).perform();// active monitor options 
			Thread.sleep(1000);
			
			selectReminderType.click();
			Thread.sleep(1000);
			act.sendKeys(Keys.DOWN).sendKeys(Keys.ENTER).build().perform();
			Thread.sleep(1000);
			remindarDay.click();
			Thread.sleep(1000);
			act.sendKeys(Keys.DOWN).sendKeys(Keys.ENTER).build().perform();
			Thread.sleep(500);
			
// user type -resource
			act.sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.RIGHT).sendKeys(Keys.RIGHT).sendKeys(Keys.SPACE).build().perform();
			Thread.sleep(3000);
		
			
			act.sendKeys(Keys.TAB).perform();
			Thread.sleep(3000);
					
		
			
			act.sendKeys(st01FF1).perform();
			Thread.sleep(1000);
			
			act.sendKeys(Keys.ENTER).perform();
			Thread.sleep(500);
			
			act.sendKeys(Keys.TAB).perform();
			Thread.sleep(500);
			
			act.sendKeys(st02FF1).perform();
			Thread.sleep(1000);
			
			act.sendKeys(Keys.ENTER).perform();
			Thread.sleep(500);
			
			act.sendKeys(Keys.TAB).perform();
			Thread.sleep(500);
			act.sendKeys(Keys.SPACE).perform();// active monitor options 
			Thread.sleep(500);
			act.sendKeys(Keys.TAB).perform();
			Thread.sleep(1000);
			act.sendKeys(Keys.ENTER).perform();
			

			FileInputStream in = new FileInputStream(filePath);
			XSSFWorkbook wb = new XSSFWorkbook(in);
			XSSFSheet sheet = wb.getSheetAt(0);

			Row row = sheet.createRow(28); 
			row.createCell(1).setCellValue(title); // Cell B

			in.close();

			FileOutputStream out = new FileOutputStream(filePath);
			wb.write(out);
			out.close();
			wb.close();
			
			
			Thread.sleep(5000);
			String expectedTitle = firstInfoTitle.getText();
			
			 
	
			Assert.assertTrue(
					title.contains(expectedTitle),
			        RED+"Info NOT added because title is not available"
			);
	
			
			System.out.println(GREEN+title);
			
			
		}
		public void create1HrInformationEventByResource(WebDriver driver,String st01N ,  String gTodaysDate,String gtimeHHMMSS,String st01R1,
				String St01M1,String St01M2, String germanyTimeAfter1Hrs5MinHH,String germanyTimeAfter1Hrs5MinMM, 
				String germanyTimeAfter1Hrs20MinHH, String germanyTimeAfter1Hrs20MinMM ,String branchName ) throws Throwable 
		{
			Actions act= new Actions (driver);
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			
			createNew.click();
			Thread.sleep(2000);
		
			StationField.click();
			act.sendKeys(st01N).perform();
			Thread.sleep(2000);
			act.sendKeys(Keys.ENTER).perform();
			Thread.sleep(500);
			
			selectType.click();
			Thread.sleep(2000);
		
			typeEvent.click();
			Thread.sleep(500);
			
			
			act.sendKeys(Keys.PAGE_DOWN).build().perform();
			Thread.sleep(1000);
			infoTitle.click();
			String title="Bg_1 hr Information-Event by Resource_"+gTodaysDate+"_"+gtimeHHMMSS ;
			act.sendKeys(title).perform();
			Thread.sleep(500);
			
			infoLocation.click();
			Thread.sleep(1000);
			
			act.sendKeys("Wardha").perform();
			Thread.sleep(500);
			
			
			
			InfoDescriptions.click();
			Thread.sleep(1000);
		
			act.sendKeys("Checking 1 hr Information-Event by Resource on "+gTodaysDate+"_"+gtimeHHMMSS+" from -"+germanyTimeAfter1Hrs5MinHH+":"+germanyTimeAfter1Hrs5MinMM+" To "+germanyTimeAfter1Hrs20MinHH+":"+germanyTimeAfter1Hrs20MinMM ).perform();
			Thread.sleep(500);
			
			eventCategory.click();
			Thread.sleep(2000);
			ADSt06Ecat1.click();
			Thread.sleep(1000);
			
			act.sendKeys(Keys.TAB).perform();
			Thread.sleep(500);
			act.sendKeys(Keys.SPACE).perform();
			Thread.sleep(1000);
			act.sendKeys(Keys.SPACE).perform();
			Thread.sleep(1000);
			act.sendKeys(Keys.TAB).perform();
			Thread.sleep(1000);
			
			
			startDateTimeEvent.click();
			Thread.sleep(1000);
			today1.click();
			Thread.sleep(500);
			startDateHours.click();
			Thread.sleep(500);
			act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
			Thread.sleep(1000);
			act.sendKeys(germanyTimeAfter1Hrs5MinHH).perform();
			Thread.sleep(200);
			act.keyDown(Keys.TAB).perform();
			Thread.sleep(200);
			act.sendKeys(germanyTimeAfter1Hrs5MinMM).perform();
			Thread.sleep(200);
			startTimeOk.click();
			Thread.sleep(1000);
			

			
			endDateTimeEvent.click();
			Thread.sleep(500);
			today2.click();
			Thread.sleep(500);
			endDateHours.click();
			Thread.sleep(500);
			act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
			Thread.sleep(500);
			act.sendKeys(germanyTimeAfter1Hrs20MinHH).perform();
			Thread.sleep(500);
			act.keyDown(Keys.TAB).perform();
			Thread.sleep(500);
			act.sendKeys(germanyTimeAfter1Hrs20MinMM).perform();
			Thread.sleep(500);
			endDateTimeOk.click();
			Thread.sleep(1000);
			

			act.sendKeys(Keys.TAB).perform();
			Thread.sleep(500);
			act.sendKeys(Keys.SPACE).perform();// active monitor options 
			Thread.sleep(1000);
			
			selectReminderType.click();
			Thread.sleep(1000);
			act.sendKeys(Keys.DOWN).sendKeys(Keys.ENTER).build().perform();
			Thread.sleep(1000);
			remindarHrs.click();
			Thread.sleep(1000);
			act.sendKeys(Keys.DOWN).sendKeys(Keys.ENTER).build().perform();
			Thread.sleep(500);
			
// user type -resource
			act.sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.RIGHT).sendKeys(Keys.SPACE).build().perform();
			Thread.sleep(3000);
		
			
			act.sendKeys(Keys.TAB).perform();
			Thread.sleep(500);
					
		
			
			act.sendKeys(st01R1).perform();
			Thread.sleep(1000);
			
			act.sendKeys(Keys.ENTER).perform();
			Thread.sleep(500);
			
			act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).build().perform();
			Thread.sleep(500);
			
			act.sendKeys(Keys.TAB).perform();
			Thread.sleep(500);
			act.sendKeys(Keys.SPACE).perform();// active monitor options 
			Thread.sleep(500);
			act.sendKeys(Keys.TAB).perform();
			Thread.sleep(1000);
			act.sendKeys(Keys.ENTER).perform();
			
			
			
			Thread.sleep(5000);
			String expectedTitle = firstInfoTitle.getText();
			
			 
	
			Assert.assertTrue(
					title.contains(expectedTitle),
			        RED+"Info NOT added because title is not available"
			);
	
			System.out.println(GREEN+title);
			
			
		}
		
		
		
		
		public void create1MinInformationEventByAttribute(WebDriver driver,String st01N ,  String gTodaysDate,String gtimeHHMMSS,String st01A1,
				String St01M1,String St01M2, String germanyTimeAfter5MinHH,String germanyTimeAfter5MinMM, 
				String germanyTimeAfter20MinHH, String germanyTimeAfter20MinMM ,String branchName ) throws Throwable 
		{
			Actions act= new Actions (driver);
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			
			createNew.click();
			Thread.sleep(2000);
		
			StationField.click();
			act.sendKeys(st01N).perform();
			Thread.sleep(2000);
			act.sendKeys(Keys.ENTER).perform();
			Thread.sleep(500);
			
			selectType.click();
			Thread.sleep(2000);
		
	//		typeInformation.click();
			typeEvent.click();
			Thread.sleep(500);
			
			
			act.sendKeys(Keys.PAGE_DOWN).build().perform();
			Thread.sleep(1000);
			infoTitle.click();
			String title="Bg_1 Min Information-Event by Attribute_"+gTodaysDate+"_"+gtimeHHMMSS ;
			act.sendKeys(title).perform();
			Thread.sleep(500);
			
			infoLocation.click();
			Thread.sleep(1000);
			
			act.sendKeys("Pune").perform();
			Thread.sleep(500);
			
			
			
			InfoDescriptions.click();
			Thread.sleep(1000);
		
			act.sendKeys("Checking 1 Min Information-Event by Attribute on "+gTodaysDate+"_"+gtimeHHMMSS+" from -"+germanyTimeAfter5MinHH+":"+germanyTimeAfter5MinMM+" To "+germanyTimeAfter20MinHH+":"+germanyTimeAfter20MinMM ).perform();
			Thread.sleep(500);
			
			eventCategory.click();
			Thread.sleep(2000);
			ADSt06Ecat1.click();
			Thread.sleep(1000);
			
			act.sendKeys(Keys.TAB).perform();
			Thread.sleep(500);
			act.sendKeys(Keys.SPACE).perform();
			Thread.sleep(1000);
			act.sendKeys(Keys.SPACE).perform();
			Thread.sleep(1000);
			act.sendKeys(Keys.TAB).perform();
			Thread.sleep(1000);
			
			
			startDateTimeEvent.click();
			Thread.sleep(1000);
			today1.click();
			Thread.sleep(500);
			startDateHours.click();
			Thread.sleep(500);
			act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
			Thread.sleep(1000);
			act.sendKeys(germanyTimeAfter5MinHH).perform();
			Thread.sleep(200);
			act.keyDown(Keys.TAB).perform();
			Thread.sleep(200);
			act.sendKeys(germanyTimeAfter5MinMM).perform();
			Thread.sleep(200);
			startTimeOk.click();
			Thread.sleep(1000);
			

			
			endDateTimeEvent.click();
			Thread.sleep(500);
			today2.click();
			Thread.sleep(500);
			endDateHours.click();
			Thread.sleep(500);
			act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
			Thread.sleep(500);
			act.sendKeys(germanyTimeAfter20MinHH).perform();
			Thread.sleep(500);
			act.keyDown(Keys.TAB).perform();
			Thread.sleep(500);
			act.sendKeys(germanyTimeAfter20MinMM).perform();
			Thread.sleep(500);
			endDateTimeOk.click();
			Thread.sleep(1000);
			

			act.sendKeys(Keys.TAB).perform();
			Thread.sleep(500);
			act.sendKeys(Keys.SPACE).perform();// active monitor options 
			Thread.sleep(1000);
			
			selectReminderType.click();
			Thread.sleep(1000);
			act.sendKeys(Keys.DOWN).sendKeys(Keys.ENTER).build().perform();
			Thread.sleep(1000);
			remindarMin.click();
			Thread.sleep(1000);
			act.sendKeys(Keys.DOWN).sendKeys(Keys.ENTER).build().perform();
			Thread.sleep(500);
			
//			userTypeAttribute.click();
			act.sendKeys(Keys.TAB).sendKeys(Keys.SPACE).build().perform();
			Thread.sleep(1000);
		
			
			act.sendKeys(Keys.TAB).perform();
			Thread.sleep(500);
			
			
			
			
			act.sendKeys(st01A1).perform();
			Thread.sleep(2000);
			
			act.sendKeys(Keys.ENTER).perform();
			Thread.sleep(500);
			
			act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).build().perform();
			Thread.sleep(500);
			
			act.sendKeys(Keys.TAB).perform();
			Thread.sleep(500);
			act.sendKeys(Keys.SPACE).perform();// active monitor options 
			Thread.sleep(500);
			act.sendKeys(Keys.TAB).perform();
			Thread.sleep(1000);
			act.sendKeys(Keys.ENTER).perform();
			
			
			
			Thread.sleep(5000);
			String expectedTitle = firstInfoTitle.getText();
			
			 
	
			Assert.assertTrue(
					title.contains(expectedTitle),
			        RED+"Info NOT added because title is not available"
			);
	
			System.out.println(GREEN+title);
			
			
		}
		
		
		
		
		public void createMonitorInformationByFireFighterForTwoStation(WebDriver driver,String st01N ,String st02N,  String gTodaysDate,String gtimeHHMMSS,String st01FF1,
				String St01M1,String St01M2, String St02M1,String germanyTimeAfter5MinHH,String germanyTimeAfter5MinMM, 
				String st02FF1,String germanyTimeAfter20MinHH, String germanyTimeAfter20MinMM ,String branchName ) throws Throwable 
		{
			Actions act= new Actions (driver);
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			
			createNew.click();
			Thread.sleep(2000);
		
			StationField.click();
			act.sendKeys(st01N).perform();
			Thread.sleep(2000);
			act.sendKeys(Keys.ENTER).perform();
			Thread.sleep(500);
			act.sendKeys(st02N).perform();
			Thread.sleep(2000);
			act.sendKeys(Keys.ENTER).perform();
			Thread.sleep(500);
			
			
			
			
			selectType.click();
			Thread.sleep(2000);
		
			typeInformation.click();
			Thread.sleep(500);
			Description.click();
			Thread.sleep(500);
			
			act.sendKeys(Keys.PAGE_DOWN).build().perform();
			Thread.sleep(1000);
			infoTitle.click();
			String title="Bg_Monitor information by FireFighter for Two Station_"+gTodaysDate+"_"+gtimeHHMMSS ;
			act.sendKeys(title).perform();
			Thread.sleep(500);
			
			infoLocation.click();
			Thread.sleep(1000);
			
			act.sendKeys("Pune").perform();
			Thread.sleep(500);
			
			
			InfoDescriptions.click();
			Thread.sleep(1000);
		
			act.sendKeys("Checking Monitor information by FireFighter for Two Station on "+gTodaysDate+"_"+gtimeHHMMSS+" from -"+germanyTimeAfter5MinHH+":"+germanyTimeAfter5MinMM+" To "+germanyTimeAfter20MinHH+":"+germanyTimeAfter20MinMM ).perform();
			Thread.sleep(500);
			
	//		
	//		userTypeAttribute.click();
	//		userTypeResource.click();
			userTypeFireFighters.click();
			
			Thread.sleep(1000);
		
			
			act.sendKeys(Keys.TAB).perform();
			Thread.sleep(500);
		
			act.sendKeys(st01FF1).perform();
			Thread.sleep(1000);
			
			act.sendKeys(Keys.ENTER).perform();
			Thread.sleep(500);
			
			
			act.sendKeys(Keys.TAB).perform();
			Thread.sleep(500);
		
			act.sendKeys(st02FF1).perform();
			Thread.sleep(1000);
			
			act.sendKeys(Keys.ENTER).perform();
			Thread.sleep(500);
			
			act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).build().perform();
			Thread.sleep(500);
			
			
			
			
			
			act.sendKeys(Keys.TAB).perform();
			Thread.sleep(500);
			act.sendKeys(Keys.SPACE).perform();// active monitor options 
			Thread.sleep(500);
			act.sendKeys(Keys.TAB).perform();
			Thread.sleep(2000);
			
	//		monitorFields.click();
	//		Thread.sleep(2000);
	//		
			act.sendKeys(St01M1).perform();
			Thread.sleep(1000);
			act.sendKeys(Keys.ENTER).perform();
			Thread.sleep(500);
			act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).build().perform();
			Thread.sleep(500);
			act.sendKeys(St01M2).perform();
			Thread.sleep(1000);
			act.sendKeys(Keys.ENTER).perform();
			Thread.sleep(500);
			act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).build().perform();
			Thread.sleep(500);
			
			act.sendKeys(Keys.TAB).perform();
			Thread.sleep(500);
			act.sendKeys( St02M1).perform();
			Thread.sleep(1000);
			act.sendKeys(Keys.ENTER).perform();
			Thread.sleep(500);
			
			startDateStT.click();
			Thread.sleep(1000);
			today1.click();
			Thread.sleep(500);
			startDateHours.click();
			Thread.sleep(500);
			act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
			Thread.sleep(1000);
			act.sendKeys(germanyTimeAfter5MinHH).perform();
			Thread.sleep(200);
			act.keyDown(Keys.TAB).perform();
			Thread.sleep(200);
			act.sendKeys(germanyTimeAfter5MinMM).perform();
			Thread.sleep(200);
			startTimeOk.click();
			Thread.sleep(1000);
//			done 
			
			endDateStT.click();
			Thread.sleep(500);
			today2.click();
			Thread.sleep(500);
			endDateHours.click();
			Thread.sleep(500);
			act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
			Thread.sleep(500);
			act.sendKeys(germanyTimeAfter20MinHH).perform();
			Thread.sleep(500);
			act.keyDown(Keys.TAB).perform();
			Thread.sleep(500);
			act.sendKeys(germanyTimeAfter20MinMM).perform();
			Thread.sleep(500);
			endDateTimeOk.click();
			Thread.sleep(1000);
			act.sendKeys(Keys.TAB).perform();
			save.click();
			Thread.sleep(5000);
			
			
			String expectedTitle = firstInfoTitle.getText();
			
			 
	
			Assert.assertTrue(
					title.contains(expectedTitle),
			        RED+"Info NOT added because title is not available"
			);
	
			System.out.println(GREEN+title);
			
			
		}
		
		
		public void createMonitorInformationByStations (WebDriver driver,String st01N ,  String gTodaysDate,String gtimeHHMMSS,
				String St01M1,String St01M2, String germanyTimeAfter5MinHH,String germanyTimeAfter5MinMM, 
				String germanyTimeAfter20MinHH, String germanyTimeAfter20MinMM ,String branchName ) throws Throwable 
		{
			Actions act= new Actions (driver);
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			
			createNew.click();
			Thread.sleep(2000);
		
			StationField.click();
			act.sendKeys(st01N).perform();
			Thread.sleep(2000);
			act.sendKeys(Keys.ENTER).perform();
			Thread.sleep(500);
			
			selectType.click();
			Thread.sleep(2000);
		
			typeInformation.click();
			Thread.sleep(500);
			Description.click();
			Thread.sleep(500);
			
			act.sendKeys(Keys.PAGE_DOWN).build().perform();
			Thread.sleep(1000);
			infoTitle.click();
			String title="Bg_Monitor information by Station_"+gTodaysDate+"_"+gtimeHHMMSS ;
			act.sendKeys(title).perform();
			Thread.sleep(500);
			
			infoLocation.click();
			Thread.sleep(1000);
			
			act.sendKeys("Pune").perform();
			Thread.sleep(500);
			
			
			InfoDescriptions.click();
			Thread.sleep(1000);
		
			act.sendKeys("Checking Monitor information by Station_ on "+gTodaysDate+"_"+gtimeHHMMSS+" from -"+germanyTimeAfter5MinHH+":"+germanyTimeAfter5MinMM+" To "+germanyTimeAfter20MinHH+":"+germanyTimeAfter20MinMM ).perform();
			Thread.sleep(500);
			
	//		
	//		userTypeAttribute.click();
	//		userTypeResource.click();
	//		userTypeFireFighters.click();
			userTypeStations .click();
			
			Thread.sleep(1000);
		
			
			
			
			
			
			act.sendKeys(Keys.TAB).perform();
			Thread.sleep(500);
			act.sendKeys(Keys.SPACE).perform();// active monitor options 
			Thread.sleep(2000);
			act.sendKeys(Keys.TAB).perform();
			Thread.sleep(500);
			
	//		monitorFields.click();
	//		Thread.sleep(2000);
			
			act.sendKeys(St01M1).perform();
			Thread.sleep(1000);
			act.sendKeys(Keys.ENTER).perform();
			Thread.sleep(500);
			act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).build().perform();
			Thread.sleep(500);
			act.sendKeys(St01M2).perform();
			Thread.sleep(1000);
			act.sendKeys(Keys.ENTER).perform();
			Thread.sleep(500);
			act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).build().perform();
			Thread.sleep(500);
			
			startDateSt.click();
			Thread.sleep(1000);
			today1.click();
			Thread.sleep(500);
			startDateHours.click();
			Thread.sleep(500);
			act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
			Thread.sleep(1000);
			act.sendKeys(germanyTimeAfter5MinHH).perform();
			Thread.sleep(200);
			act.keyDown(Keys.TAB).perform();
			Thread.sleep(200);
			act.sendKeys(germanyTimeAfter5MinMM).perform();
			Thread.sleep(200);
			startTimeOk.click();
			Thread.sleep(1000);
			
			endDateSt.click();
			Thread.sleep(500);
			today2.click();
			Thread.sleep(500);
			endDateHours.click();
			Thread.sleep(500);
			act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
			Thread.sleep(500);
			act.sendKeys(germanyTimeAfter20MinHH).perform();
			Thread.sleep(500);
			act.keyDown(Keys.TAB).perform();
			Thread.sleep(500);
			act.sendKeys(germanyTimeAfter20MinMM).perform();
			Thread.sleep(500);
			endDateTimeOk.click();
			Thread.sleep(1000);
			act.sendKeys(Keys.TAB).perform();
			Thread.sleep(2000);
			act.sendKeys(Keys.SPACE).perform();
	//		save.click();
			for (int t=1;t<=3;t++)
			{
			act.sendKeys(Keys.TAB).perform();
			Thread.sleep(200);
			}
			act.sendKeys(Keys.ENTER).perform();
			Thread.sleep(5000);
			
			
			String expectedTitle = firstInfoTitle.getText();
			
			 
	
			Assert.assertTrue(
					title.contains(expectedTitle),
			        RED+"Info NOT added because title is not available"
			);
	
			System.out.println(GREEN+title);
			
			
		}
		
		
		public void createMonitorInformationByFireFighter(WebDriver driver,String st01N ,  String gTodaysDate,String gtimeHHMMSS,String st01FF1,
				String St01M1,String St01M2, String germanyTimeAfter5MinHH,String germanyTimeAfter5MinMM, 
				String germanyTimeAfter20MinHH, String germanyTimeAfter20MinMM ,String branchName ) throws Throwable 
		{
			Actions act= new Actions (driver);
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			
			createNew.click();
			Thread.sleep(2000);
		
			StationField.click();
			act.sendKeys(st01N).perform();
			Thread.sleep(2000);
			act.sendKeys(Keys.ENTER).perform();
			Thread.sleep(500);
			
			
			
			
			selectType.click();
			Thread.sleep(2000);
		
			typeInformation.click();
			Thread.sleep(500);
			Description.click();
			Thread.sleep(500);
			
			act.sendKeys(Keys.PAGE_DOWN).build().perform();
			Thread.sleep(1000);
			infoTitle.click();
			String title="Bg_Monitor information by FireFighter_"+gTodaysDate+"_"+gtimeHHMMSS ;
			act.sendKeys(title).perform();
			Thread.sleep(500);
			
			infoLocation.click();
			Thread.sleep(1000);
			
			act.sendKeys("Pune").perform();
			Thread.sleep(500);
			
			
			InfoDescriptions.click();
			Thread.sleep(1000);
		
			act.sendKeys("Checking Monitor information by FireFighter on "+gTodaysDate+"_"+gtimeHHMMSS+" from -"+germanyTimeAfter5MinHH+":"+germanyTimeAfter5MinMM+" To "+germanyTimeAfter20MinHH+":"+germanyTimeAfter20MinMM ).perform();
			Thread.sleep(500);
			
	//		
	//		userTypeAttribute.click();
	//		userTypeResource.click();
			userTypeFireFighters.click();
			
			Thread.sleep(1000);
		
			
			act.sendKeys(Keys.TAB).perform();
			Thread.sleep(500);
			
			
			
			
			act.sendKeys(st01FF1).perform();
			Thread.sleep(1000);
			
			act.sendKeys(Keys.ENTER).perform();
			Thread.sleep(500);
			
			act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).build().perform();
			Thread.sleep(500);
			
			
			
			
			
			act.sendKeys(Keys.TAB).perform();
			Thread.sleep(500);
			act.sendKeys(Keys.SPACE).perform();// active monitor options 
			Thread.sleep(500);
	//		act.sendKeys(Keys.TAB).perform();
			Thread.sleep(2000);
			
			monitorFields.click();
			Thread.sleep(2000);
			
			act.sendKeys(St01M1).perform();
			Thread.sleep(1000);
			act.sendKeys(Keys.ENTER).perform();
			Thread.sleep(500);
			act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).build().perform();
			Thread.sleep(500);
			act.sendKeys(St01M2).perform();
			Thread.sleep(1000);
			act.sendKeys(Keys.ENTER).perform();
			Thread.sleep(500);
			act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).build().perform();
			Thread.sleep(500);
			
			startDate.click();
			Thread.sleep(1000);
			today1.click();
			Thread.sleep(500);
			startDateHours.click();
			Thread.sleep(500);
			act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
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
			act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
			Thread.sleep(500);
			act.sendKeys(germanyTimeAfter20MinHH).perform();
			Thread.sleep(500);
			act.keyDown(Keys.TAB).perform();
			Thread.sleep(500);
			act.sendKeys(germanyTimeAfter20MinMM).perform();
			Thread.sleep(500);
			endDateTimeOk.click();
			Thread.sleep(1000);
			act.sendKeys(Keys.TAB).perform();
			save.click();
			Thread.sleep(5000);
			
			
			String expectedTitle = firstInfoTitle.getText();
			
			 
	
			Assert.assertTrue(
					title.contains(expectedTitle),
			      RED+  "Info NOT added because title is not available"
			);
	
			System.out.println(GREEN+title);
			
			
		}
		
		public void createMonitorInformationByResource(WebDriver driver,String st01N ,  String gTodaysDate,String gtimeHHMMSS,String st01R1,
				String St01M1,String St01M2, String germanyTimeAfter5MinHH,String germanyTimeAfter5MinMM, 
				String germanyTimeAfter20MinHH, String germanyTimeAfter20MinMM ,String branchName ) throws Throwable 
		{
			Actions act= new Actions (driver);
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			
			createNew.click();
			Thread.sleep(2000);
		
			StationField.click();
			act.sendKeys(st01N).perform();
			Thread.sleep(2000);
			act.sendKeys(Keys.ENTER).perform();
			Thread.sleep(500);
			
			selectType.click();
			Thread.sleep(2000);
		
			typeInformation.click();
			Thread.sleep(500);
			Description.click();
			Thread.sleep(500);
			
			act.sendKeys(Keys.PAGE_DOWN).build().perform();
			Thread.sleep(1000);
			infoTitle.click();
			String title="Bg_Monitor information by Resource_"+gTodaysDate+"_"+gtimeHHMMSS ;
			act.sendKeys(title).perform();
			Thread.sleep(500);
			
			infoLocation.click();
			Thread.sleep(1000);
			
			act.sendKeys("Pune").perform();
			Thread.sleep(500);
			
			
			InfoDescriptions.click();
			Thread.sleep(1000);
		
			act.sendKeys("Checking Monitor information by Resource on "+gTodaysDate+"_"+gtimeHHMMSS+" from -"+germanyTimeAfter5MinHH+":"+germanyTimeAfter5MinMM+" To "+germanyTimeAfter20MinHH+":"+germanyTimeAfter20MinMM ).perform();
			Thread.sleep(500);
			
	//		
	//		userTypeAttribute.click();
			userTypeResource.click();
			
			Thread.sleep(1000);
		
			
			act.sendKeys(Keys.TAB).perform();
			Thread.sleep(500);
			
			
			
			
			act.sendKeys(st01R1).perform();
			Thread.sleep(1000);
			
			act.sendKeys(Keys.ENTER).perform();
			Thread.sleep(500);
			
			act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).build().perform();
			Thread.sleep(500);
			
			act.sendKeys(Keys.TAB).perform();
			Thread.sleep(500);
			act.sendKeys(Keys.SPACE).perform();// active monitor options 
			Thread.sleep(500);
	//		act.sendKeys(Keys.TAB).perform();
			Thread.sleep(2000);
			
			monitorFields.click();
			Thread.sleep(2000);
			
			act.sendKeys(St01M1).perform();
			Thread.sleep(1000);
			act.sendKeys(Keys.ENTER).perform();
			Thread.sleep(500);
			act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).build().perform();
			Thread.sleep(500);
			act.sendKeys(St01M2).perform();
			Thread.sleep(1000);
			act.sendKeys(Keys.ENTER).perform();
			Thread.sleep(500);
			act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).build().perform();
			Thread.sleep(500);
			
			startDate.click();
			Thread.sleep(1000);
			today1.click();
			Thread.sleep(500);
			startDateHours.click();
			Thread.sleep(500);
			act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
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
			act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
			Thread.sleep(500);
			act.sendKeys(germanyTimeAfter20MinHH).perform();
			Thread.sleep(500);
			act.keyDown(Keys.TAB).perform();
			Thread.sleep(500);
			act.sendKeys(germanyTimeAfter20MinMM).perform();
			Thread.sleep(500);
			endDateTimeOk.click();
			Thread.sleep(1000);
			act.sendKeys(Keys.TAB).perform();
			save.click();
			Thread.sleep(5000);
			
			
			String expectedTitle = firstInfoTitle.getText();
			
			 
	
			Assert.assertTrue(
					title.contains(expectedTitle),
			        RED+"Info NOT added because title is not available"
			);
	
			System.out.println(GREEN+title);
			
			
		}
		
		public void createMonitorInformationByAttribute(WebDriver driver,String st01N ,  String gTodaysDate,String gtimeHHMMSS,String st01A1,
				String St01M1,String St01M2, String germanyTimeAfter5MinHH,String germanyTimeAfter5MinMM, 
				String germanyTimeAfter20MinHH, String germanyTimeAfter20MinMM ,String branchName ) throws Throwable 
		{
			Actions act= new Actions (driver);
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			
			createNew.click();
			Thread.sleep(2000);
		
			StationField.click();
			act.sendKeys(st01N).perform();
			Thread.sleep(2000);
			act.sendKeys(Keys.ENTER).perform();
			Thread.sleep(500);
			
			selectType.click();
			Thread.sleep(2000);
		
			typeInformation.click();
			Thread.sleep(500);
			Description.click();
			Thread.sleep(500);
			
			act.sendKeys(Keys.PAGE_DOWN).build().perform();
			Thread.sleep(1000);
			infoTitle.click();
			String title="Bg_Monitor information by Attribute_"+gTodaysDate+"_"+gtimeHHMMSS ;
			act.sendKeys(title).perform();
			Thread.sleep(500);
			
			infoLocation.click();
			Thread.sleep(1000);
			
			act.sendKeys("Pune").perform();
			Thread.sleep(500);
			
			
			InfoDescriptions.click();
			Thread.sleep(1000);
		
			act.sendKeys("Checking Monitor information by Attribute on "+gTodaysDate+"_"+gtimeHHMMSS+" from -"+germanyTimeAfter5MinHH+":"+germanyTimeAfter5MinMM+" To "+germanyTimeAfter20MinHH+":"+germanyTimeAfter20MinMM ).perform();
			Thread.sleep(500);
			
			
			userTypeAttribute.click();
			Thread.sleep(1000);
		
			
			act.sendKeys(Keys.TAB).perform();
			Thread.sleep(500);
			
			
			
			
			act.sendKeys(st01A1).perform();
			Thread.sleep(1000);
			
			act.sendKeys(Keys.ENTER).perform();
			Thread.sleep(500);
			
			act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).build().perform();
			Thread.sleep(500);
			
			act.sendKeys(Keys.TAB).perform();
			Thread.sleep(500);
			act.sendKeys(Keys.SPACE).perform();// active monitor options 
			Thread.sleep(500);
	//		act.sendKeys(Keys.TAB).perform();
			Thread.sleep(2000);
			
			monitorFields.click();
			Thread.sleep(2000);
			
			act.sendKeys(St01M1).perform();
			Thread.sleep(1000);
			act.sendKeys(Keys.ENTER).perform();
			Thread.sleep(500);
			act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).build().perform();
			Thread.sleep(500);
			act.sendKeys(St01M2).perform();
			Thread.sleep(1000);
			act.sendKeys(Keys.ENTER).perform();
			Thread.sleep(500);
			act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).build().perform();
			Thread.sleep(500);
			
			startDate.click();
			Thread.sleep(1000);
			today1.click();
			Thread.sleep(500);
			startDateHours.click();
			Thread.sleep(500);
			act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
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
			act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
			Thread.sleep(500);
			act.sendKeys(germanyTimeAfter20MinHH).perform();
			Thread.sleep(500);
			act.keyDown(Keys.TAB).perform();
			Thread.sleep(500);
			act.sendKeys(germanyTimeAfter20MinMM).perform();
			Thread.sleep(500);
			endDateTimeOk.click();
			Thread.sleep(1000);
			act.sendKeys(Keys.TAB).perform();
			save.click();
			Thread.sleep(5000);
			
			
			String expectedTitle = firstInfoTitle.getText();
			
			 
	
			Assert.assertTrue(
					title.contains(expectedTitle),
			       RED+ "Info NOT added because title is not available"
			);
	
			System.out.println(GREEN+title);
			
			
		}
		
		public void delete_infoEvent(WebDriver driver) throws Throwable {
			Actions act= new Actions (driver);
//			refreshFilter.click();
//			Thread.sleep(2000);
			searchInfoEventField.click();
			Thread.sleep(500);
			act.sendKeys("Bg").perform();
			Thread.sleep(2000);
			itemsPerPage100.click();
			Thread.sleep(5000);
			
			
			
			int totalInfoEvents = 0;
	
		    for (int batch = 1; batch <= 15; batch++) {
		        int count = availableBGInfoEvent.size();
	
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
	
		        totalInfoEvents += count;
		    }
	
		    System.out.println("The iteration has been completed.");
		    System.out.println(GREEN+"Total >>>>>" + totalInfoEvents + "<<<<< alarms deleted successfully.");
	
		    refreshFilter.click();
		    Thread.sleep(2000);
			
			
			
			
			
			
		    
		}    
		
		public void common_information(WebDriver driver, String branchName) throws Throwable {
	
		    switch (branchName) {
	
		        case "1":
		            driver.navigate().to("https://admin.retteralarm.de/verify-user?returnUrl=/admin/information/list");
		            Thread.sleep(5000);
		            refreshFilter.click();
					Thread.sleep(3000);
		            break;
	
		        case "2":
		          
		            break;
	
		        case "3":
		            // logic for branch 3 (currently empty)
		            Thread.sleep(5000);
		            break;
	
		        default:
		            System.out.println("Invalid branch name: " + branchName);
		            break;
		    }
		}
	
	
	
	
	
	
	
		
		
		
		
		
		
		
		
	}
