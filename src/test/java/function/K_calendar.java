package function;

import java.awt.RenderingHints.Key;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.Reporter;

public class K_calendar extends b_baseClass{

	
	
	

		
	
		@FindBy(xpath="//span[text()=\"Create New\"]")private WebElement createNew;
		 @FindBy(xpath="(//input[@class=\"dx-texteditor-input\"])[9]")private WebElement eventLocation;
		 @FindBy(xpath="(//div[@class=\"dx-dropdowneditor-icon\"])[7]")private WebElement startDate;
		@FindBy(xpath="(//div[@class=\"dx-dropdowneditor-icon\"])[8]")private WebElement endDate;
		@FindBy(xpath="(//DIV[@class=\"dx-texteditor-buttons-container\"])[11]")private WebElement startDateSt;
		@FindBy(xpath="(//DIV[@class=\"dx-texteditor-buttons-container\"])[14]")private WebElement endDateSt;
		 @FindBy(xpath="(//span[text()=\"Today\"])[2]")private WebElement today1;
		 @FindBy(xpath="(//input[@aria-label=\"hours\"])[1]")private WebElement startDateHours;
		 @FindBy(xpath="(//div[@aria-label=\"OK\"])[2]")private WebElement startTimeOk ;
		@FindBy(xpath="(//span[text()=\"Today\"])[3]")private WebElement today2 ;
		 @FindBy(xpath="(//input[@aria-label=\"hours\"])[2]")private WebElement endDateHours;
		@FindBy(xpath="(//div[@aria-label=\"OK\"])[3]")private WebElement endDateTimeOk ;
		
		@FindBy(xpath="//div[text()=\"Attributes\"]")private WebElement userTypeAttribute;

			
		 @FindBy(xpath="//div[text()=\"Resources\"]")private WebElement userTypeResource;
		 @FindBy(xpath="//div[text()=\"Fire Fighters\"]")private WebElement userTypeFireFighters ;
		 @FindBy(xpath="//div[text()=\"Stations\"]")private WebElement userTypeStations;
		 @FindBy(xpath="(//input[@class=\"dx-texteditor-input\"])[5]")private WebElement endDate1;
		 @FindBy(xpath="//span[@class=\"dx-badge retter-defualt-badge\"]")private WebElement manageEventCategory;
		 
		 @FindBy(xpath="//div[@aria-label=\"Refresh\"]")private WebElement refreshFilter;
		 @FindBy(xpath="//input[@placeholder=\"Information Search...\"]")private WebElement searchInfoEventField;
		 @FindBy(xpath="//div[@aria-label=\"Items per page: 100\"]")private WebElement itemsPerPage100;
	@FindBy(xpath="//input[@placeholder=\"Search\"]")private WebElement searchField1;
	 @FindBy(xpath="//div[@aria-label=\"Select all\"]")private WebElement selectAll;
		@FindBy(xpath="//i[@class=\"ri ri-delete-bin-6-line\"]")private WebElement delete;
		@FindBy(xpath="//div[@aria-label=\"Yes, Delete\"]")private WebElement deleteYes;
		 @FindBy(xpath="//i[@class=\"ri ri-delete-bin-6-line\"]")private WebElement delateAll;
		 @FindBy(xpath="//span[contains(text(), 'Bg') or contains(text(), 'BG') or contains(text(), 'bg')]")private List<WebElement> availableBGInfoEvent;
		 @FindBy(xpath="//button[@class=\"btn-success btn-x30\"]")private WebElement createNew1;
		 @FindBy(xpath="(//div[@_ngcontent-ng-c1008411559])[18]")private WebElement firstItemTitle;
		@FindBy(xpath="(//i[@class=\"dx-icon dx-icon-overflow\"])[2]")private WebElement actionButton;
		 @FindBy(xpath="//dx-button[contains(@class,'delete-option')]")private WebElement deleteButton;
		@FindBy(xpath="//span[text()=\"Yes, Delete\"]")private WebElement yesDelete;
		 @FindBy(xpath="(//span[contains(text(), 'Bg') or contains(text(), 'BG') or contains(text(), 'bg')])[1]")private WebElement firstEventCategory;
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
	// @FindBy(xpath="")private WebElement ;	// @FindBy(xpath="")private WebElement ;
	// @FindBy(xpath="")private WebElement ;
	// @FindBy(xpath="")private WebElement ;
	// @FindBy(xpath="")private WebElement ;
	// @FindBy(xpath="")private WebElement ;
	// @FindBy(xpath="")private WebElement ;
	// @FindBy(xpath="")private WebElement ;
		
	//Delete
	@FindBy(xpath = "//div[@aria-label='Previous page']")
	private WebElement backMonth;

	@FindBy(xpath = "(//span[@class=\"dx-button-text\"])[5]") private WebElement getMonthName;

	@FindBy(xpath = "//div[@class='title' and contains(translate(text(),'BG','bg'),'bg')]")
	private List<WebElement> getEventCount;

	@FindBy(xpath = "//div[@aria-label='Next page']")
	private WebElement nextMonth;

	@FindBy(xpath = "(//div[@class='title' and contains(translate(text(),'BG','bg'),'bg')])[1]")
	private WebElement firstEvent;

	@FindBy(xpath = "//i[contains(@class,'dx-icon-trash')]")
	private WebElement deleteEvent;

	@FindBy(xpath = "//span[text()='Yes, Delete']")
	private WebElement deleteEventYes;

	@FindBy(xpath = "//span[text()='Today']")
	private WebElement todayButton;
		
	
	public K_calendar (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	public void createEventCategory(WebDriver driver, String gTodaysDate , String gtimeHHMMSS) throws Throwable 
	{
		Actions act= new Actions (driver);
		manageEventCategory.click();
		Thread.sleep(2000);
		createNew1.click();
		Thread.sleep(1000);
	
		String title = "BG_EventCatogery_"+gTodaysDate + "_" + gtimeHHMMSS;
		String title1 = title+" GLOBAL ";
		act.sendKeys(title).perform();
		Thread.sleep(1000);
		act.sendKeys(Keys.TAB,Keys.DOWN,Keys.DOWN,Keys.DOWN,Keys.TAB,Keys.TAB,Keys.ENTER).perform();
		Thread.sleep(4000);
		
		String expectedTitle = firstItemTitle.getText();
		 
		
		Assert.assertTrue(
				title1.contains(expectedTitle),
		        RED+"Alarm not added."
		);

		
		System.out.println(GREEN+title1);
		
	}
	
	
	public void deleteEventCatogery (WebDriver driver) throws Throwable
	{
		Actions act= new Actions (driver);
		manageEventCategory.click();
		Thread.sleep(2000);
		refreshFilter.click();
		Thread.sleep(2000);
		searchField1.click();
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
	        
	        else
	
	        System.out.println("The iteration-" + batch + " still ongoing, please wait.");
	        actionButton.click();
	        Thread.sleep(3000);
	        deleteButton.click();
	        Thread.sleep(2000);
	        yesDelete.click();
	        Thread.sleep(4000);
	       
	      
	        
	      
	        totalInfoEvents  ++;
	    }

	    System.out.println("The iteration has been completed.");
	    System.out.println(GREEN+"Total >>>>>" + totalInfoEvents + "<<<<< event category deleted successfully.");

	    refreshFilter.click();
	    Thread.sleep(2000);
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	public void createCalendarEventByStationsMS (WebDriver driver, String st01N,String st02N, String  gTodaysDate,String gtimeHHMMSS
			) throws Throwable
	{
		Actions act= new Actions (driver);
		createNew.click();
		Thread.sleep(1000);
		act.sendKeys(Keys.TAB, Keys.TAB).perform();
		Thread.sleep(1000);
		act.sendKeys(st01N).perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(1000);
		act.sendKeys(st02N).perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER,Keys.TAB).perform();
		Thread.sleep(1000);
		
		
		
		String title="BG-Calendar event by Stations "+gTodaysDate + "_" + gtimeHHMMSS;
		act.sendKeys(title).perform();
		Thread.sleep(1000);
		act.sendKeys(Keys.TAB,Keys.UP).perform();
		Thread.sleep(1000);
		
		for (int i=0;i<=18;i++)
		{
			act.sendKeys(Keys.TAB).build().perform();
		}
		Thread.sleep(1000);
		
		act.sendKeys("Calendar event by Stations "+gTodaysDate + "_" + gtimeHHMMSS).perform();
		Thread.sleep(1000);
		
		act.sendKeys(Keys.PAGE_DOWN).perform();
		Thread.sleep(1000);
		
		eventLocation.click();
		act.sendKeys("KP ground Nagpur").perform();;
		Thread.sleep(1000);
		
		act.sendKeys(Keys.TAB,Keys.SPACE).perform();
		Thread.sleep(1000);
		
		startDate.click();
		Thread.sleep(1000);
		today1.click();
		Thread.sleep(500);
		act.sendKeys(Keys.RIGHT,Keys.ENTER).perform();
		Thread.sleep(1000);
		
		endDate.click();
		Thread.sleep(500);
	
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(1000);
		
		act.sendKeys(Keys.TAB, Keys.SPACE).perform();
		Thread.sleep(500);
		act.sendKeys(Keys.TAB, Keys.DOWN).perform();
		Thread.sleep(500);
		act.sendKeys(Keys.TAB,Keys.TAB,Keys.TAB, Keys.DOWN).perform();
		
		
//		act.sendKeys(Keys.TAB).perform();
//		Thread.sleep(500);
//		act.sendKeys(Keys.TAB, Keys.DOWN).perform();
//		Thread.sleep(500);
//		act.sendKeys(Keys.TAB, Keys.DOWN).perform();
//		Thread.sleep(1000);
		
		
//		suserTypeAttribute.click();
//		userTypeResource.click();
//		userTypeFireFighters.click();
		userTypeStations.click();
		
//		Thread.sleep(4000);
//		act.sendKeys(Keys.TAB,st01FF1).perform();
//		Thread.sleep(1000);
//		act.sendKeys(Keys.ENTER).perform();
//		Thread.sleep(500);
//		act.sendKeys(Keys.TAB,st02FF1).perform();
//		Thread.sleep(1000);
//		act.sendKeys(Keys.ENTER).perform();
//		Thread.sleep(500);
		
		
		act.sendKeys(Keys.TAB).perform();
		Thread.sleep(1000);
		act.sendKeys(Keys.TAB, Keys.TAB,Keys.ENTER).perform();
		Thread.sleep(5000);
		System.out.println(GREEN+title+" added successfuly.");
		
		
//	
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void createCalendarEventByFireFughterMS (WebDriver driver, String st01N,String st02N, String  gTodaysDate,String gtimeHHMMSS, 
			String germanyTimeAfter5MinHH, String germanyTimeAfter5MinMM,String germanyTimeAfter20MinHH,String germanyTimeAfter20MinMM
			,String st01FF1,String st02FF1) throws Throwable
	{
		Actions act= new Actions (driver);
		createNew.click();
		Thread.sleep(1000);
		act.sendKeys(Keys.TAB, Keys.TAB).perform();
		Thread.sleep(1000);
		act.sendKeys(st01N).perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(1000);
		act.sendKeys(st02N).perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER,Keys.TAB).perform();
		Thread.sleep(1000);
		
		
		
		String title="BG-Calendar event by firefighter "+gTodaysDate + "_" + gtimeHHMMSS;
		act.sendKeys(title).perform();
		Thread.sleep(1000);
		act.sendKeys(Keys.TAB,Keys.UP).perform();
		Thread.sleep(1000);
		
		for (int i=0;i<=18;i++)
		{
			act.sendKeys(Keys.TAB).build().perform();
		}
		Thread.sleep(1000);
		
		act.sendKeys("Calendar event by firefighter "+gTodaysDate + "_" + gtimeHHMMSS).perform();
		Thread.sleep(1000);
		
		act.sendKeys(Keys.PAGE_DOWN).perform();
		Thread.sleep(1000);
		
		eventLocation.click();
		act.sendKeys("KP ground Nagpur").perform();;
		Thread.sleep(1000);
		
		
		startDate.click();
		Thread.sleep(1000);
		today1.click();
		Thread.sleep(500);
		act.sendKeys(Keys.RIGHT,Keys.ENTER).perform();
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
		act.sendKeys(Keys.ENTER).perform();
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
		
		act.sendKeys(Keys.TAB, Keys.SPACE).perform();
		Thread.sleep(500);
		act.sendKeys(Keys.TAB, Keys.DOWN).perform();
		Thread.sleep(500);
		act.sendKeys(Keys.TAB, Keys.DOWN).perform();
		Thread.sleep(1000);
		
		
//		suserTypeAttribute.click();
//		userTypeResource.click();
		userTypeFireFighters.click();
		
		Thread.sleep(4000);
		act.sendKeys(Keys.TAB,st01FF1).perform();
		Thread.sleep(1000);
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(500);
		act.sendKeys(Keys.TAB,st02FF1).perform();
		Thread.sleep(1000);
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(500);
		
		
		act.sendKeys(Keys.TAB,Keys.SPACE).perform();
		Thread.sleep(1000);
		act.sendKeys(Keys.TAB, Keys.TAB,Keys.ENTER).perform();
		Thread.sleep(5000);
		System.out.println(GREEN+title+" added successfuly.");
		
		
//	
		
		
		
	}
	
	public void createCalendarEventByResource (WebDriver driver, String st01N,String gTodaysDate,String gtimeHHMMSS, 
			String germanyTimeAfter1Hrs5MinHH, String germanyTimeAfter1Hrs5MinMM,String germanyTimeAfter1Hrs20MinHH,String germanyTimeAfter1Hrs20MinMM
			,String st01R1) throws Throwable
	{
		Actions act= new Actions (driver);
		createNew.click();
		Thread.sleep(1000);
		act.sendKeys(Keys.TAB, Keys.TAB).perform();
		Thread.sleep(1000);
		act.sendKeys(st01N).perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER,Keys.TAB).perform();
		Thread.sleep(1000);
		String title="BG-Calendar event by resource__"+gTodaysDate + "_" + gtimeHHMMSS;
		act.sendKeys(title).perform();
		Thread.sleep(1000);
		act.sendKeys(Keys.TAB,Keys.UP).perform();
		Thread.sleep(1000);
		
		for (int i=0;i<=18;i++)
		{
			act.sendKeys(Keys.TAB).build().perform();
		}
		Thread.sleep(1000);
		
		act.sendKeys("Calendar event by resource "+gTodaysDate + "_" + gtimeHHMMSS).perform();
		Thread.sleep(1000);
		
		act.sendKeys(Keys.PAGE_DOWN).perform();
		Thread.sleep(1000);
		
		eventLocation.click();
		act.sendKeys("KP ground Nagpur").perform();;
		Thread.sleep(1000);
		
		
		startDate.click();
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
		
		endDate.click();
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
		
		act.sendKeys(Keys.TAB, Keys.SPACE).perform();
		Thread.sleep(500);
		act.sendKeys(Keys.TAB, Keys.DOWN).perform();
		Thread.sleep(500);
		act.sendKeys(Keys.TAB,Keys.TAB, Keys.DOWN).perform();
		Thread.sleep(1000);
		
		
//		suserTypeAttribute.click();
		userTypeResource.click();
		Thread.sleep(2000);
		act.sendKeys(Keys.TAB,st01R1).perform();
		Thread.sleep(1000);
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(500);
		act.sendKeys(Keys.TAB, Keys.SPACE).perform();
		Thread.sleep(1000);
		act.sendKeys(Keys.TAB, Keys.TAB,Keys.ENTER).perform();
		Thread.sleep(5000);
		System.out.println(GREEN+title+" added successfuly.");
		
		
//	
		
		
		
	}
	
	
	public void createCalendarEventByAttribute (WebDriver driver, String st01N,String gTodaysDate,String gtimeHHMMSS, 
			String germanyTimeAfter5MinHH, String germanyTimeAfter5MinMM,String germanyTimeAfter20MinHH,String germanyTimeAfter20MinMM
			,String st01A1) throws Throwable
	{
		Actions act= new Actions (driver);
		createNew.click();
		Thread.sleep(1000);
		act.sendKeys(Keys.TAB, Keys.TAB).perform();
		Thread.sleep(1000);
		act.sendKeys(st01N).perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER,Keys.TAB).perform();
		Thread.sleep(1000);
		String title="BG-Calendar event by attribute_"+gTodaysDate + "_" + gtimeHHMMSS;
		act.sendKeys(title).perform();
		Thread.sleep(1000);
		act.sendKeys(Keys.TAB,Keys.UP).perform();
		Thread.sleep(1000);
		
		for (int i=0;i<=18;i++)
		{
			act.sendKeys(Keys.TAB).build().perform();
		}
		Thread.sleep(1000);
		
		act.sendKeys("Calendar event by attribute_"+gTodaysDate + "_" + gtimeHHMMSS).perform();
		Thread.sleep(1000);
		
		act.sendKeys(Keys.PAGE_DOWN).perform();
		Thread.sleep(1000);
		
		eventLocation.click();
		act.sendKeys("KP ground Nagpur").perform();;
		Thread.sleep(1000);
		
		
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
		
		act.sendKeys(Keys.TAB, Keys.SPACE).perform();
		Thread.sleep(500);
		act.sendKeys(Keys.TAB, Keys.DOWN).perform();
		Thread.sleep(500);
		act.sendKeys(Keys.TAB,Keys.TAB,Keys.TAB, Keys.DOWN).perform();
		Thread.sleep(1000);
		
		userTypeAttribute.click();
		Thread.sleep(2000);
		act.sendKeys(Keys.TAB,st01A1).perform();
		Thread.sleep(1000);
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(500);
		act.sendKeys(Keys.TAB, Keys.SPACE).perform();
		Thread.sleep(1000);
		act.sendKeys(Keys.TAB, Keys.TAB,Keys.ENTER).perform();
		Thread.sleep(5000);
		System.out.println(GREEN+title+" added successfuly.");
		
		
//	
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void common_calendar(WebDriver driver, String branchName) throws Throwable {

	    switch (branchName) {

	        case "1":
	            driver.navigate().to("https://admin.retteralarm.de/admin/event/calendar");
	           
	            break;

	        case "2":
	    
	           driver.navigate().to("https://admin.testing.retteralarm.de/admin/event/calendar");
	            break;

	        case "3":
	        	  driver.navigate().to("https://admin.development.retteralarm.de/admin/event/calendar");
	            
	            break;

	        default:
	            System.out.println("Invalid branch name: " + branchName);
	            break;
	            
	            
	            
	           
	    }
	    Thread.sleep(5000);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	
	
	
	
	public void deleteCalendarEvent (WebDriver driver) throws Throwable 
	{
		int totalCount = 0;

	    todayButton.click();
	    Thread.sleep(3000);

	    // Go back 2 months
	    for (int i = 0; i < 2; i++) {
	        backMonth.click();
	        Thread.sleep(1500);
	    }

	    // Loop for 3 months
	    for (int m = 1; m <= 4; m++) {

	        String monthName = getMonthName.getText();
	        Thread.sleep(1000);

	        int monthCount = 0;
	        System.out.println(monthName);
	        // Delete all events in current month
	        while (getEventCount.size() > 0) {
	        	
	        	firstEvent.click();        // always first event
	            Thread.sleep(1000);

	            deleteEvent.click();
	            Thread.sleep(1000);

	            deleteEventYes.click();
	            Thread.sleep(4000);
	           
	            monthCount++;
	            System.out.println("Event no-"+monthCount+" Deleted successfully.");
	            totalCount++;
	            
	        }

	        if (monthCount == 0) {
	            System.out.println("**No events available in " + monthName+"**");
	           
	
	        } else {
	            System.out.println(monthCount + " events deleted from " + monthName);
	           
	        }

	        // Move to next month
	        nextMonth.click();
	        Thread.sleep(2000);
	    }

	    System.out.println(GREEN+">>>>TOTAL EVENTS DELETED: " + totalCount+" <<<<<");
	   
	    
	}
		 
	
    
	
	

	
}
