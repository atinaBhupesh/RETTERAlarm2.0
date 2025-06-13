	package function;
	
	import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
	
	public class G_resource extends b_baseClass{
		
		@FindBy(xpath = "//span[text()=\"Alarm\"]")private WebElement manualAlarmModule;
		
		
	 @FindBy(xpath="//a[@href=\"https://admin.retteralarm.de/verify-user?returnUrl=/admin/alarm-resource/list\"]")private WebElement manageResourceL;
	 @FindBy(xpath="//a[@href=\"http://admin.testing.retteralarm.de/verify-user?returnUrl=/admin/alarm-resource/list\"]")private WebElement manageResourceT;
	 @FindBy(xpath="//a[@href=\"https://admin.development.retteralarm.de/verify-user?returnUrl=/admin/alarm-resource/list\"]")private WebElement manageResourceD;
	 
		@FindBy(xpath="(//div[@class=\"dx-button-content\"])[3]")private WebElement refreshFilter;
	@FindBy(xpath="//button[@class=\"btn-success btn-x30\"]")private WebElement createNew;
	@FindBy(xpath="//input[@placeholder=\"Stations\"]")private WebElement resourceStation;
	@FindBy(xpath="//input[@name=\"name\"]")private WebElement resourceNameField;
	@FindBy(xpath="//input[@placeholder=\"Select Vehicles/Cars\"]")private WebElement vehicleField ;
	@FindBy(xpath="(//input[@placeholder=\"Select...\"])[1]")private WebElement station1FirefighterField;
	@FindBy(xpath="(//input[@placeholder=\"Select...\"])[2]")private WebElement station2FirefighterField;
	@FindBy(xpath="//span[text()=\"Save\"]")private WebElement saveResource;

	@FindBy(xpath="//div[@aria-label=\"Items per page: 100\"]")private WebElement itemPepage100;
	@FindBy(xpath="//input[@placeholder=\"Search\"]")private WebElement searchField;
	@FindBy(xpath="(//i[@class=\"dx-icon dx-icon-overflow\"])[2]")private WebElement actionButton;
	@FindBy(xpath="//div[@aria-label=\"Select all\"]")private WebElement selectAll;
	@FindBy(xpath="//i[@class=\"ri ri-delete-bin-6-line\"]")private WebElement deleteAll;
	@FindBy(xpath="//div[@aria-label=\"Yes, Delete\"]")private WebElement yesDelete;
	@FindBy(xpath="//span[contains(text(), 'Bg') or contains(text(), 'BG')]")private List<WebElement> BGResource;
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
		
		
		
		
		
	
	public G_resource(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	
	public void commonResource( WebDriver driver, String branchName ) throws Throwable
	{
		
	manualAlarmModule.click();
	Thread.sleep(2000);
	

	if  (branchName.equals("1" ) )
	{
		
		manageResourceL.click();

	
	}
	
	else if (branchName.equals("2"))
	{
		manageResourceT.click();
		
	}
	
	else if (branchName.equals("3"))
		{
		manageResourceD.click();
			
			
		}		
	Thread.sleep(2000);
	

	refreshFilter.click();
	Thread.sleep(2000);
		
		
		
		
		
	}
	
	
	public void createNewResource(WebDriver driver,String St2N,String St1N,String gTodaysDate, String gtimeHHMMSS,String St2V1,String St1V1,String st01FF1, String st02FF1 ) throws Throwable
	{
		Actions act = new Actions(driver);
		
	
		createNew.click();
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
		String resourceName= "BG_Resource_"+gTodaysDate+"_"+gtimeHHMMSS;
		act.sendKeys(resourceName).perform();
	
		vehicleField.click();
	
		act.sendKeys(St2V1).perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).perform();
		act.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).build().perform();

		act.sendKeys(St1V1).perform();
		Thread.sleep(1000);
		act.sendKeys(Keys.ENTER).perform();

		act.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).build().perform();
		
		station1FirefighterField.click();
		act.sendKeys(st01FF1).perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).perform();
	
		act.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).build().perform();
		station2FirefighterField.click();
		act.sendKeys(st02FF1).perform();
		Thread.sleep(1000);
		act.sendKeys(Keys.ENTER).perform();
		
		
		Thread.sleep(3000);
		saveResource.click();
		
		System.out.println("Resource-"+resourceName+" added.");
		
		Thread.sleep(3000);
	
		
	}
	
	public void deleteResource(WebDriver driver ) throws Throwable
	{
		
		 itemPepage100.click();
		 Thread.sleep(5000);
		Actions act = new Actions(driver);
		searchField.click();
		act.sendKeys("BG").perform();
		Thread.sleep(5000);
		
		
		int totalResourceCount =0 ;
		
		
		
		
		
		
		for (int batch = 1; batch <=15 ; batch++) {
		    int count = BGResource.size();
		         
		    
		  
		      
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
				refreshFilter.click();
				Thread.sleep(2000);
		
				 driver.navigate().refresh();
			     Thread.sleep(3000);
			
			     totalResourceCount += count;
		    }
		
		System.out.println("The iteration has been completed.");
		System.out.println("Total >>>>>" + totalResourceCount + "<<<<< alarms deleted successfully.");
		
			    refreshFilter.click();
			    Thread.sleep(2000);
		
		
			}
		
		
		
		
		
	
		
		
		
		
		
	
	
	
	
	
	
	

	}