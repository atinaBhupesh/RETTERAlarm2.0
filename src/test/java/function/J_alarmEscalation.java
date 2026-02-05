package function;

import java.io.File;
import java.io.FileInputStream;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class J_alarmEscalation extends b_baseClass{
	
			@FindBy(xpath = "//span[text()=\"Alarm\"]")private WebElement manualAlarmModule;
			@FindBy(xpath="//a[@href=\"https://admin.retteralarm.de/verify-user?returnUrl=/admin/alarm-escalation/list\"]")private WebElement alarmEsclationL;
			@FindBy(xpath="//a[@href=\"href=\"http://admin.testing.retteralarm.de/verify-user?returnUrl=/admin/alarm-escalation/list\"]")private WebElement alarmEsclationT;
			@FindBy(xpath="//a[@href=\"href=\"https://admin.development.retteralarm.de/verify-user?returnUrl=/admin/alarm-escalation/list\"]")private WebElement alarmEsclationD;
			
			@FindBy(xpath="//i[@class=\"dx-icon ri ri-settings-3-line\"]")private WebElement setting;
			@FindBy(xpath="//option[text()=\" andrew department \"]")private WebElement andrewDepartment ;
			@FindBy(xpath="//option[text()=\" D1 \"]")private WebElement D1;
			@FindBy(xpath="//SELECT[@class=\"form-select ng-pristine ng-valid ng-touched\"]")private WebElement selectLanguage;
			@FindBy(xpath="//i[@class=\"dx-icon dx-icon-refresh\"]")private WebElement refreshFilter;
			
			@FindBy(xpath = "//button[@class=\"btn-success btn-x30\"]") private WebElement createNewButton;
			@FindBy(xpath="//label[text()=\"Stations *\"]")private WebElement sation;
			
			 @FindBy(xpath="(//input[@placeholder=\"Select...\"])[3]")private WebElement selectStation;
			@FindBy(xpath="//div[@class=\"dx-switch-handle\"]")private WebElement selectTimeFrame ;
			 @FindBy(xpath="//input[@placeholder=\"Select Parent Resource\"]")private WebElement selectParentResource;
			 @FindBy(xpath="(//input[@placeholder=\"Select...\"])[4]")private WebElement select1stChildResource;
			@FindBy(xpath="//dx-button[@title=\"Define Time Frame\"]")private WebElement timeBetweenResource1st;
			
			@FindBy(xpath="//span[text()=\"Anzahl der Benutzer\" or text()=\"No. of User\"]")private WebElement noOfUsers;
			 @FindBy(xpath="//dx-select-box[@class=\"dx-validator dx-visibility-change-handler dx-show-invalid-badge dx-selectbox dx-textbox dx-texteditor dx-dropdowneditor-button-visible dx-editor-filled dx-widget dx-dropdowneditor dx-dropdowneditor-field-clickable dx-state-hover\"]")private WebElement selectMin;
			@FindBy(xpath="(//span[text()=\"Speichern\" or text()=\"Save\"])[2]")private WebElement saveTime;
			@FindBy(xpath="//span[text()=\"Attributes and Quantity\" or text()=\"Attribute und Menge\"]")private WebElement atrributeQuantity;
			 @FindBy(xpath="(//div[@class=\"dx-switch-inner\"])[2]")private WebElement matchCount;
				@FindBy(xpath="(//span[text()=\"Speichern\" or text()=\"Save\"])[1]")private WebElement saveTime1;
			
				
				@FindBy(xpath="//div[@aria-label=\"Items per page: 100\"]")private WebElement itemPepage100;
				@FindBy(xpath="//input[@placeholder=\"Search\"]")private WebElement searchField;
				
				@FindBy(xpath="//td[contains(text(),\"BG_ResourceEsc\")]")private List<WebElement> BgRespurceEsc;
				
				@FindBy(xpath="(//span[@class=\"dx-checkbox-icon\"])[1]")private WebElement selectAll;
				 @FindBy(xpath="(//div [@class=\"dx-item dx-toolbar-item dx-toolbar-button\"])[3]")private WebElement delateAll;
					@FindBy(xpath="//div[@aria-label=\"Yes, Delete\"]")private WebElement deleteYes;
					@FindBy(xpath="(//td[@role=\"gridcell\"])[4]")private WebElement firstItemTitle;
			
			// @FindBy(xpath="")private WebElement ;
			// @FindBy(xpath="")private WebElement ;
			// @FindBy(xpath="")private WebElement ;
			// @FindBy(xpath="")private WebElement ;
			// @FindBy(xpath="")private WebElement ;
			// @FindBy(xpath="")private WebElement ;
			// @FindBy(xpath="")private WebElement ;
			// @FindBy(xpath="")private WebElement ;
			
			public J_alarmEscalation(WebDriver driver) {
				PageFactory.initElements(driver, this);
			}
			
			public void smokeForEscalation()
			{
				if(createNewButton.isDisplayed()) {
				    System.out.println(GREEN+"Create New button for escalation is visible");
				} else {
				    Assert.fail(RED+"Create New button is NOT displayed");
				}
				
			}
			
			
			public void alarmEscaltionComman(WebDriver driver, String branchName ) throws Throwable 
			{
				
					
				switch (branchName)
				{
				case "1" :
				{
					driver.navigate().to("https://admin.retteralarm.de/admin/alarm-escalation/list");
					break;
				}
				
				case "2" :
				{
					driver.navigate().to("https://admin.testing.retteralarm.de/admin/alarm-escalation/list");
					break;
				}
				
				case "3" :
				{
					driver.navigate().to("https://admin.development.retteralarm.de/admin/alarm-escalation/list");
					break;
				}
				
				 
				}
				
				
				
				
			}
				

			
				
				
				
		
			
		public void createNewAlarmEscalation(WebDriver driver,String st01N, String NewResourceEsc,String branchNam ) throws Throwable 
		{
			Actions act = new Actions(driver);
			createNewButton.click();
			Thread.sleep(1000);
			
			
			selectStation.click();
			Thread.sleep(1000);
			
			act.sendKeys(st01N).build().perform();
			Thread.sleep(500);
			act.sendKeys(Keys.ENTER).build().perform();
			Thread.sleep(1000);
			
			selectTimeFrame.click();
			
			selectParentResource.click();
			Thread.sleep(1000);
		
			
			
			
			String title= NewResourceEsc;
			act.sendKeys(title).perform();
			Thread.sleep(500);
			act.sendKeys(Keys.ENTER).perform();
			
			
			
			select1stChildResource.click();
			Thread.sleep(1000);
			
			act.sendKeys(Keys.UP).build().perform();
			Thread.sleep(500);
			act.sendKeys(Keys.ENTER).build().perform();
			Thread.sleep(1000);
			
			
			timeBetweenResource1st.click();
			Thread.sleep(1000);
			
			
			act.sendKeys(Keys.TAB).sendKeys(Keys.TAB).build().perform();
			act.sendKeys(Keys.DOWN).perform();
			Thread.sleep(1000);
			noOfUsers.click();
			atrributeQuantity.click();
			Thread.sleep(1000);
			
			act.sendKeys(Keys.TAB).perform();
			
			act.sendKeys("5").perform();
			Thread.sleep(1000);
			
			act.sendKeys(Keys.TAB).sendKeys(Keys.UP).build().perform();
			Thread.sleep(1000);
			act.sendKeys(Keys.TAB).perform();
			
			act.sendKeys("3").perform();
			Thread.sleep(1000);
			
			act.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).build().perform();
			Thread.sleep(1000);
			act.sendKeys(Keys.TAB).sendKeys(Keys.UP).sendKeys(Keys.UP).build().perform();
			Thread.sleep(1000);
			act.sendKeys(Keys.TAB).perform();
			act.sendKeys("2").perform();
			Thread.sleep(1000);
			matchCount.click();
			Thread.sleep(1000);
			
			saveTime.click();
			
			Thread.sleep(2000);
			
			saveTime1.click();
			
			

			String expectedTitle = firstItemTitle.getText();
			
			 
			
			Assert.assertTrue(
					title.contains(expectedTitle),
			        RED+"Alarm loop not added."
			);
	
			
			System.out.println(GREEN+title);
			
			
			
			
			
			
			
			
			
		}
			
		
		
		
		
		
		
		
		
		public void deleteAlarmEscalation(WebDriver driver ) throws Throwable 
		{
			Actions act = new Actions(driver);   
		    Thread.sleep(2000);
		    
		    searchField.click();
		    Thread.sleep(2000);
		    act.sendKeys("bg").perform();
		    Thread.sleep(2000);
		  
		  
		int totalAlarms = 0;
		
	
		
		for (int batch = 1; batch <=15 ; batch++) {
		    int count = BgRespurceEsc.size();
		         
		
	
		      
		    	if (count == 0) {
		            break;
		        }
		    	
		    	 System.out.print("The iteration-"+batch+" still ongoing, please wait."  );
		        System.out.println();
		
		        selectAll.click();
		        Thread.sleep(2000);
		
		        delateAll.click();
		        Thread.sleep(2000);
		
		        deleteYes.click();
		        Thread.sleep(5000);
		
		        driver.navigate().refresh();
		        Thread.sleep(30000);
		
		        totalAlarms += count;
		    }
		
		System.out.println("The iteration has been completed.");
		System.out.println(GREEN +"Total >>>>>" + totalAlarms + "<<<<< alarms escaltion deleted successfully.");
		
			    refreshFilter.click();
			    Thread.sleep(2000);
			
			
		}
		
		
		
		
			
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
