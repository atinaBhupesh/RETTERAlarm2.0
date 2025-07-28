	package function;
	
	import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
	
	public class H_alarmLoop extends b_baseClass {
		
		
		@FindBy(xpath = "//span[text()=\"Alarm\"]")private WebElement manualAlarmModule;
		
		 @FindBy(xpath="//a[@href=\"https://admin.retteralarm.de/verify-user?returnUrl=/admin/alarm-loop/list\"]")private WebElement manageAlarmLoopL;
		@FindBy(xpath="//a[@href=\"http://admin.testing.retteralarm.de/verify-user?returnUrl=/admin/alarm-loop/list\"]")private WebElement manageAlarmLoopT ;
		@FindBy(xpath="//a[@href=\"https://admin.development.retteralarm.de/verify-user?returnUrl=/admin/alarm-loop/list\"]")private WebElement  manageAlarmLoopD;
		
		@FindBy(xpath="//i[@class=\"dx-icon dx-icon-refresh\"]")private WebElement refreshFilter;
		@FindBy(xpath="//button[@class=\"btn-success btn-x30\"]")private WebElement createNew;
		@FindBy(xpath="//span[text()=\"Stations\"   or text()=\"Wache/Stationen\" ]")private WebElement alarmLoopStation;
		@FindBy(xpath="//input[@name=\"nickname\"]")private WebElement alarmLoopNickName;
		@FindBy(xpath="//input[@name=\"alarmcode\"]")private WebElement alarmLoopCode ;
		@FindBy(xpath="//input[@placeholder=\"Select Resources\"]")private WebElement alarmLoopResource;
		@FindBy(xpath="//span[text()=\"Save\"]")private WebElement saveAlarmLoop;
		
		@FindBy(xpath="//div[@aria-label=\"Items per page: 100\"]")private WebElement itemPepage100;
		@FindBy(xpath="(//i[@class=\"dx-icon-filter filter-icon\"])[1]")private WebElement titleSearch;
		@FindBy(xpath="//dx-text-box[@mode=\"search\"]")private WebElement titleSearchField;
		@FindBy(xpath="//div[@aria-label=\"OK\"]")private WebElement titleSearchFieldOk;
		@FindBy(xpath="(//i[@class=\"dx-icon dx-icon-overflow\"])[2]")private WebElement actionButton;
		@FindBy(xpath="(//span[@class=\"dx-checkbox-icon\"])[1]")private WebElement selectAll;
		@FindBy(xpath="//i[@class=\"ri ri-delete-bin-6-line\"]")private WebElement deleteAll;
		@FindBy(xpath="//span[text()=\"Yes, Delete\"]")private WebElement yesDelete;
		@FindBy(xpath="//td[contains (text(),'BG')]")private List<WebElement> BGAlarmLoop ;
		// @FindBy(xpath="")private WebElement ;
		// @FindBy(xpath="")private WebElement ;
		// @FindBy(xpath="")private WebElement ;
		// @FindBy(xpath="")private WebElement ;
		// @FindBy(xpath="")private WebElement ;
		// @FindBy(xpath="")private WebElement ;
		// @FindBy(xpath="")private WebElement ;
		// @FindBy(xpath="")private WebElement ;
		// @FindBy(xpath="")private WebElement ;		
				
				
				
				
			
			public H_alarmLoop (WebDriver driver)
			{
				PageFactory.initElements(driver, this);
				
			}
			
			
			
			public void  commonAlarmLoop (WebDriver driver, String  branchName) throws Throwable
			{
				
				
				
				manualAlarmModule.click();
				Thread.sleep(2000);
				
				
				if  (branchName.equals("1" ) )
				{
					
					manageAlarmLoopL.click();

				
				}
				
				else if (branchName.equals("2"))
				{
					manageAlarmLoopT.click();
					
				}
				
				else if (branchName.equals("3"))
					{
					manageAlarmLoopD.click();
						
						
					}		
				Thread.sleep(2000);
				

				refreshFilter.click();
				Thread.sleep(2000);
					
				
				
				
				
				
				
				
			}
			
			
			public void createNewAlarmLoop (WebDriver driver, String St2N,String St1N,String gTodaysDate, String gtimeHHMMSS,String st01R1,   String St2R1 ) throws Throwable
			{
				Actions act = new Actions(driver);
				
				createNew.click();
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
				String nickName = "BG_AL_"+gTodaysDate+"_"+gtimeHHMMSS;
				act.sendKeys(nickName).perform();
				Thread.sleep(500);
				alarmLoopCode.click();
				act.sendKeys("AL_"+gTodaysDate+"_"+gtimeHHMMSS).perform();
				
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
				Thread.sleep(3000);
				
				System.out.println("Alarm loop-"+nickName+" added.");
				
				
				
			}
			
			public void deleteAlarmLoop(WebDriver driver ) throws Throwable
			{
				
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
					
				
					
					for (int batch = 1; batch <=15 ; batch++) 
					{
					    int count = BGAlarmLoop.size();
					    
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
					
					     totalAlarmLoopCount += count;
				    }
				
					System.out.println("The iteration has been completed.");
					System.out.println("Total >>>>>" + totalAlarmLoopCount + "<<<<< alarms deleted successfully.");
				
					    refreshFilter.click();
					    Thread.sleep(2000);
				
				
					}
		
	
	}
