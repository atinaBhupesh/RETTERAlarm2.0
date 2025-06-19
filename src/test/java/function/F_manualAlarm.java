		package function;
		
		import java.awt.Robot;
		import java.awt.Toolkit;
		import java.awt.datatransfer.StringSelection;
		import java.awt.event.KeyEvent;
		import java.util.List;
		
		import org.openqa.selenium.By;
		import org.openqa.selenium.Dimension;
		import org.openqa.selenium.Keys;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.interactions.Actions;
		import org.openqa.selenium.support.FindBy;
		import org.openqa.selenium.support.PageFactory;
		import org.openqa.selenium.support.ui.Select;
		import org.testng.Reporter;
		
		public class F_manualAlarm extends b_baseClass{
			
		@FindBy(xpath = "//span[text()=\"Alarm\"]")private WebElement manualAlarmModule;
		
		@FindBy(xpath = "//a[@href=\"https://admin.retteralarm.de/verify-user?returnUrl=/admin/alarm/list\"]")private WebElement manageAlarmL;
		@FindBy(xpath = "//a[@href=\"http://admin.testing.retteralarm.de/verify-user?returnUrl=/admin/alarm/list\"]")private WebElement manageAlarmT;
		@FindBy(xpath = "//a[@href=\"http://development.retteralarm.de/admin/Alarms/index\"]")	private WebElement manageAlarmD;
		
		@FindBy(xpath="//i[@class=\"dx-icon ri ri-settings-3-line\"]")private WebElement setting;
		@FindBy(xpath="//option[text()=\" andrew department \"]")private WebElement andrewDepartment ;
		
		@FindBy(xpath="//option[text()=\" D1 \"]")private WebElement D1;	
		
		
		@FindBy(xpath = "//button[@class=\"btn-success btn-x30\"]") private WebElement createNewButton;
		@FindBy(xpath = "//div[@class=\"dx-texteditor-input-container dx-tag-container\"]") private WebElement fireStationField;
		@FindBy(xpath = "//input[contains(@id,\"keyword\")]")private WebElement alarmKeyword;
		@FindBy(xpath="//input[@name=\"alarmImage\"]")private WebElement alarmImage ;
		@FindBy(xpath = "//textarea[contains(@id,\"alarmDetails\")]")private WebElement descriptionField;
		@FindBy(xpath="//div[text()=\"Reporter\"]")private WebElement reporter ;
		@FindBy(xpath="//input[@name=\"reporter.name\"]")private WebElement reporterName ;
		@FindBy(xpath="//input[@name=\"reporter.street\"]")private WebElement reporterStreet;
		@FindBy(xpath="//input[contains(@id, 'reporter.zipCode')]")private WebElement reporterZipCode;
		@FindBy(xpath="//input[contains(@id, 'reporter.mobileNo')]")private WebElement reporterMobileNo;
		@FindBy(xpath="//input[contains(@id,\"reporter.callback\")]")private WebElement reporterCallback;
		@FindBy(xpath="//div[text()=\"Additional Fields\"]")private WebElement additionalField;
		@FindBy(xpath="//input[@name=\"additionalFields[0]\"]")private WebElement additionalField1;
		@FindBy(xpath="//i[@class=\"dx-icon dx-icon-add\"]")private WebElement addadditionalField;
		@FindBy(xpath="//input[@name=\"additionalFields[1]\"]")private WebElement additionalField2;
		@FindBy(xpath="//span[text()=\"Next\"]")private WebElement 	next;
		@FindBy(xpath="//textarea[@name=\"address\"]")private WebElement alarmAddress;
		@FindBy(xpath="//div[text()=\"Additional address information\"]")private WebElement additionalAddressInformation;
		@FindBy(xpath="//input[@class='dx-texteditor-input' and @name='object']")private WebElement alarmObject;
		@FindBy(xpath="//input[@name=\"floor\"]")private WebElement alarmFloor;
		@FindBy(xpath="//input[@name=\"annotation\"]")private WebElement alarmAnnotation;
		@FindBy(xpath="(//span[@class=\"dx-button-text\"])[2]")private WebElement next2;
		@FindBy(xpath="(//div[@class=\"dx-scrollable-scrollbar dx-widget dx-scrollbar-vertical dx-scrollbar-hoverable\"])[3]")private WebElement scrollDown;
		
		@FindBy(xpath="//div[text()=\"Attributes\"]")private WebElement userTypeAttribute;
		@FindBy(xpath="//input[contains(@id,'selectedVehicles')]")private WebElement vehicleField1;
		@FindBy(xpath="//div[text()=\"Select All\"]")private WebElement selectAllA;
		 @FindBy(xpath="(//span[@class=\"dx-icon dx-icon-clear\"])[3]")private WebElement deselectAll;
		@FindBy(xpath="//input[contains(@id,'selectedVehicles')]")private WebElement deSelectVehicls;
		@FindBy(xpath="//input[contains(@id,'selectedAttributes')]")private WebElement attributeField;
		
		
		@FindBy(xpath="//div[text()=\"Resources\"]")private WebElement userTypeResource;
		 @FindBy(xpath="(//input[contains(@id,\"selectedResources\")])[1]")private WebElement resourceField1;
		 @FindBy(xpath="(//input[contains(@id,\"selectedResources\")])[2]")private WebElement resourceField2;
		
		
		
		@FindBy(xpath="//div[@aria-label=\"Generate Alarm\"]")private WebElement generateAlarm;
		@FindBy(xpath="//div[@aria-label=\"Yes, Create\"]")private WebElement yesCreate;
		
		@FindBy(xpath="(//div[@class=\"menubox dx-template-wrapper dx-item-content dx-treeview-item-content\"])[1]")private WebElement dashbordMenu2;
		@FindBy(xpath="(//div[@class=\"menubox dx-template-wrapper dx-item-content dx-treeview-item-content\"])[2]")private WebElement dashboard2;
		
		
		
		
		
		
		
		
		
		
		@FindBy(xpath="(//i[@class=\"dx-icon-filter filter-icon\"])[1]")private WebElement titleSearch;
		@FindBy(xpath="//dx-text-box[@mode=\"search\"]")private WebElement titleSearchField;
		@FindBy(xpath="//div[@aria-label=\"OK\"]")private WebElement titleSearchFieldOk;
		@FindBy(xpath="(//span[@class=\"dx-checkbox-icon\"])[1]")private WebElement selectAll;
		@FindBy(xpath="//i[@class=\"ri ri-delete-bin-6-line\"]")private WebElement delete;
		@FindBy(xpath="//div[@aria-label=\"Yes, Delete\"]")private WebElement deleteYes;
		@FindBy(xpath="//div[@aria-label=\"Items per page: 100\"]")private WebElement item100;
		
		
		
		
		
		 @FindBy(xpath="//div[text()=\"Fire Fighters\"]")private WebElement userTypeFirefighter;
		 @FindBy(xpath="(//input[contains(@id,\"selectedUsers\")])[1]")private WebElement FirefighterField1;
		 @FindBy(xpath="(//input[contains(@id,\"selectedUsers\")])[2]")private WebElement FirefighterField2;
		 
		 
		 @FindBy(xpath="//span[text()=\"Priority\"]")private WebElement priority;
		 @FindBy(xpath="//td[contains(text(),\"Bg\")]")private  WebElement BGAlams;
		
		 
		 @FindBy(xpath="(//i[@class=\"dx-icon dx-icon-overflow\"])[2]")private WebElement action;
		
		 
		 
		 @FindBy(xpath="(//dx-button[@class=\"dx-widget dx-button dx-button-mode-text dx-button-normal more-action-button\"])[1]")private WebElement addExtension;
		@FindBy(xpath="//input[@placeholder=\"Select Firestation\"]")private WebElement extendStationField;
		@FindBy(xpath="//input[@id=\"inlineRadio2\"]")private WebElement extendUsereTypeResource;
		@FindBy(xpath="//input[@value=\"476\"]")private WebElement D1ST04Esc;
		@FindBy(xpath="//input[@id=\"information_1\"]")private WebElement additionalInformation1;
		@FindBy(xpath="//button[@id=\"addSubmit\"]")private WebElement saveExtend;
		@FindBy(xpath="(//div[@class=\"dx-button-content\"])[3]")private WebElement refreshFilter;
		
		@FindBy(xpath="//input[contains(@id,\"selectedTemplate\")]")private WebElement templateField;
		@FindBy(xpath="//span[text()=\"Next\"]")private WebElement next1;
		@FindBy(xpath="(//span[@class=\"dx-tab-text-span\"])[3]")private WebElement user$resource;
		
		@FindBy(xpath = "//input[@value=\"4625\"]")	private WebElement ADST06REsc;
		 @FindBy(xpath="//div[@aria-label=\"Next\"]")private WebElement next001 ;
		 
		 
			 @FindBy(xpath="//select[@class=\"form-select ng-pristine ng-valid ng-touched\"]")private WebElement selectDepartment;
		 @FindBy(xpath="(//dx-button[@stylingmode=\"text\"])[4]")private WebElement alarmChat;
			@FindBy(xpath="//dx-button[@stylingmode=\"text\"]")private List<WebElement> buttonCount ;
		@FindBy(xpath = "//input[@placeholder=\"Write your message...\"]")private WebElement writemessageField;
		@FindBy(xpath = "//button[@id=\"actionSendMessage\"]")private WebElement sendmessageButton;
		@FindBy(xpath = "//input[@class=\"upload\"]")private WebElement attachFile;
			
			
		
		 @FindBy(xpath="//path[@fill-rule='evenodd' and contains(@d, 'M1 8a.5.5 0 0 1')]")private WebElement back;
		@FindBy(xpath="//SELECT[@class=\"form-select ng-pristine ng-valid ng-touched\"]")private WebElement selectLanguage;
		 @FindBy(xpath="//td[contains(text(), 'Bg') or contains(text(), 'BG')]")private List<WebElement> BGAlarm;
		 @FindBy(xpath="//dx-button[@class=\"dx-widget dx-button dx-button-mode-text dx-button-normal more-action-button delete-option\"]")private WebElement singleDelete ;
		 @FindBy(xpath="(//div [@class=\"dx-item dx-toolbar-item dx-toolbar-button\"])[3]")private WebElement delateAll;
		@FindBy(xpath="//span[text()=\"Yes, Delete\"]")private WebElement deleteAllYes;
		
		
		@FindBy(xpath="//input[@placeholder=\"Select...\"]")private WebElement extendStation;
		@FindBy(xpath="//*[@id=\"dx_dx-82385685-de57-5d40-d943-94596672b55b_selectedResources[6a168ac95312fe3a25e4a6874100a50780715e]\"]")private WebElement extendResourceFiled;
		@FindBy(xpath="//input[@name=\"additionalFields[0]\"]")private WebElement additionalFields;
		@FindBy(xpath="//div[@aria-label=\"Save\"]")private WebElement saveExtendAlarm;
		@FindBy(xpath="//div[@aria-label=\"Yes, Extend\"]")private WebElement yesExtendAlarm;
		@FindBy(xpath="//div[@aria-label=\"Items per page: 100\"]")private WebElement itemPepage100;
	
		// @FindBy(xpath="")private WebElement ;
		// @FindBy(xpath="")private WebElement ;
		// @FindBy(xpath="")private WebElement ;
		// @FindBy(xpath="")private WebElement ;
		// @FindBy(xpath="")private WebElement ;
		// @FindBy(xpath="")private WebElement ;
		// @FindBy(xpath="")private WebElement ;
		
		public F_manualAlarm(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		
		
		public void manualAlarmCommon(WebDriver driver, String deptN,String branchName ) throws Throwable {
		
			manualAlarmModule.click();
			Thread.sleep(500);
			Actions act = new Actions(driver);
		
		
			
			
			
			if  (branchName.equals("1" ) )
		{
			manageAlarmL.click();
			Thread.sleep(2000);
			setting.click();
			Thread.sleep(500);
			
			for (int w=0;w<=3;w++)
				{
				act.sendKeys(Keys.TAB).perform();
				
				}
			
			act.sendKeys(Keys.ENTER).perform();
			Thread.sleep(2000);
				
		andrewDepartment.click();
		
		
		}
		
		else if (branchName.equals("2"))
		{
			
		manageAlarmT.click();
		Thread.sleep(2000);
		setting.click();
		Thread.sleep(500);
		
		for (int w=0;w<=3;w++)
			{
			act.sendKeys(Keys.TAB).perform();
			
			}
		
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);
			
			
			D1.click();
		}
		
		else if (branchName.equals("3"))
			{
				manageAlarmD.click();
				
			}
			
		
			selectLanguage.click();
			Thread.sleep(1000);
			act.keyDown(Keys.SHIFT).perform();
			for (int r=0;r<=1;r++)
			{
			act.sendKeys(Keys.TAB).perform();
			
			}
			act.keyUp(Keys.SHIFT).perform();
		
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);
		
		
		 refreshFilter.click();
		 Thread.sleep(2000);
		
		
			
		
		}
		
		public void sendMessageToManualAlarmUser(WebDriver driver,String branchName ) throws InterruptedException
		{
			Actions act = new Actions(driver);
			titleSearch.click();
			Thread.sleep(500);
			titleSearchField.click();
			Thread.sleep(500);;
			act.sendKeys("BG-manual alarm by attribute for extend").build().perform();
		Thread.sleep(1000);
		titleSearchFieldOk.click();
		Thread.sleep(5000);
		action.click();
		Thread.sleep(1000);
		
int z=buttonCount.size();
		
		if (z==5)
		{
		alarmChat.click();
		Thread.sleep(1000);
		
		writemessageField.click();
		
		act.sendKeys("message-New old alarm users").build().perform();
		
		sendmessageButton.click();
		Thread.sleep(2000);
		
		
		
		manualAlarmModule.click();
		if  (branchName.equals("1" ) || branchName.equals("1.5" ))
		{
			
		manageAlarmL.click();
		Thread.sleep(2000);
		
		}
		
		else if (branchName.equals("2")||branchName.equals("2.5"))
		{
			manageAlarmT.click();
			Thread.sleep(2000);
		}
		
		else if (branchName.equals("3")||branchName.equals("3.5"))
			{
				manageAlarmD.click();
				Thread.sleep(2000);
				
			}
			
			
			
			  refreshFilter.click();
		      Thread.sleep(2000);
		      
		}
		      else {
					
					
					Thread.sleep(2000);
					driver.navigate().refresh();
					 Thread.sleep(2000);
					 Reporter.log("Chat option not found.", true);
			
		      }
			
		}
		
		
		public void sendMessageToOldApiAlarmUser (WebDriver driver,String branchName) throws Throwable
		{ 	Actions act = new Actions(driver);
			titleSearch.click();
			Thread.sleep(500);
			titleSearchField.click();
			Thread.sleep(500);;
			act.sendKeys("BG-LP EX API E-v2 St 06 from 07").build().perform();
		Thread.sleep(1000);
		titleSearchFieldOk.click();
		Thread.sleep(5000);
		action.click();
		Thread.sleep(1000);
		
		int z=buttonCount.size();
		
		if (z==5) {
		
		alarmChat.click();
		Thread.sleep(1000);
		
		writemessageField.click();
		
		act.sendKeys("message-New old alarm users").build().perform();
		
		sendmessageButton.click();
		
		
		
		
		Thread.sleep(2000);
		
		manualAlarmModule.click();
		
		if  (branchName.equals("1" ) || branchName.equals("1.5" ))
		{
			
		manageAlarmL.click();
		Thread.sleep(2000);
		
		}
		
		else if (branchName.equals("2")||branchName.equals("2.5"))
		{
			manageAlarmT.click();
			Thread.sleep(2000);
		}
		
		else if (branchName.equals("3")||branchName.equals("3.5"))
			{
				manageAlarmD.click();
				Thread.sleep(2000);
				
			}
			
			
			  refreshFilter.click();
		      Thread.sleep(2000);
		      
		}
		
		
		else {
			
			
		Thread.sleep(2000);
		 Reporter.log("Chat option not found.", true);
	
		
			
			
		}
		
		
		
		}
		
		
		
		
		
		
		public void sendMessageToNewApiAlarmUser (WebDriver driver,String branchName) throws Throwable
		{ 	Actions act = new Actions(driver);
			titleSearch.click();
			Thread.sleep(500);
			titleSearchField.click();
			Thread.sleep(500);;
			act.sendKeys("BG- New APi ex st 06 from 07 LP").build().perform();
		Thread.sleep(1000);
		titleSearchFieldOk.click();
		Thread.sleep(5000);
		action.click();
		Thread.sleep(1000);
		
		int z=buttonCount.size();
		
		if (z==5) {

		alarmChat.click();
		Thread.sleep(1000);
		
		writemessageField.click();
		
		act.sendKeys("message-New Api alarm users").build().perform();
		
		sendmessageButton.click();
		
		Thread.sleep(1000);
		act.moveToElement(attachFile).click().build().perform();
		Thread.sleep(1000);
		
		StringSelection ss = new StringSelection("C:\\Users\\BHUPESH\\Desktop\\New folder\\Sample Image\\0.98mb.JPG");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		
		Robot rc = new Robot();
		Thread.sleep(2000);
		rc.keyPress(KeyEvent.VK_CONTROL);
		rc.keyPress(KeyEvent.VK_V);
		Thread.sleep(2000);
		rc.keyRelease(KeyEvent.VK_CONTROL);
		rc.keyRelease(KeyEvent.VK_V);
		Thread.sleep(2000);
		rc.keyPress(KeyEvent.VK_ENTER);
		rc.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		
		writemessageField.click();
		
		act.sendKeys("image-alarm users").build().perform();
		Thread.sleep(2000);
		sendmessageButton.click();
		Reporter.log("image attached properly", true);
		
		Thread.sleep(1000);
		act.moveToElement(attachFile).click().build().perform();
		Thread.sleep(1000);
		
		StringSelection ss1 = new StringSelection("C:\\Users\\BHUPESH\\Desktop\\New folder\\Automation Test.pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss1, null);
		
		Thread.sleep(2000);
		rc.keyPress(KeyEvent.VK_CONTROL);
		rc.keyPress(KeyEvent.VK_V);
		Thread.sleep(2000);
		rc.keyRelease(KeyEvent.VK_CONTROL);
		rc.keyRelease(KeyEvent.VK_V);
		Thread.sleep(2000);
		rc.keyPress(KeyEvent.VK_ENTER);
		rc.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		
		writemessageField.click();
		
		act.sendKeys("pdf-alarm users").build().perform();
		Thread.sleep(2000);
		sendmessageButton.click();
		Reporter.log("pdf attached properly", true);
		
		Thread.sleep(1000);
		act.moveToElement(attachFile).click().build().perform();
		Thread.sleep(1000);
		
		StringSelection ss2 = new StringSelection("C:\\Users\\BHUPESH\\Desktop\\New folder\\Notes.docx");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss2, null);
		
		Thread.sleep(2000);
		rc.keyPress(KeyEvent.VK_CONTROL);
		rc.keyPress(KeyEvent.VK_V);
		Thread.sleep(2000);
		rc.keyRelease(KeyEvent.VK_CONTROL);
		rc.keyRelease(KeyEvent.VK_V);
		Thread.sleep(2000);
		rc.keyPress(KeyEvent.VK_ENTER);
		rc.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		
		writemessageField.click();
		
		act.sendKeys("word file -alarm users").build().perform();
		Thread.sleep(2000);
		sendmessageButton.click();
		Reporter.log("word file attached properly", true);
		
		Thread.sleep(2000);
		
		manualAlarmModule.click();
		
		if  (branchName.equals("1" ) || branchName.equals("1.5" ))
		{
			
		manageAlarmL.click();
		Thread.sleep(2000);
		
		}
		
		else if (branchName.equals("2")||branchName.equals("2.5"))
		{
			manageAlarmT.click();
			Thread.sleep(2000);
		}
		
		else if (branchName.equals("3")||branchName.equals("3.5"))
			{
				manageAlarmD.click();
				Thread.sleep(2000);
				
			}		
			
			  refreshFilter.click();
		      Thread.sleep(2000);
		}
		
		else {
			
			
			Thread.sleep(2000);
			Reporter.log("Chat option not found.", true);
		}
		
		}
		
		public void manualAlarmByTemplate (WebDriver driver, String st2t1) throws Throwable
		{
			
			Actions act = new Actions(driver);
			Thread.sleep(2000);
			createNewButton.click();
			Thread.sleep(2000);
			
			templateField.click();
			Thread.sleep(2000);
			
			
			
			act.sendKeys(st2t1).build().perform();
			Thread.sleep(2000);
			
		
			
			act.sendKeys(Keys.ENTER).build().perform();
			Thread.sleep(2000);
			
			user$resource.click();
			Thread.sleep(2000);
			
			
			generateAlarm.click();
			Thread.sleep(2000);
			
			yesCreate.click();
			Thread.sleep(2000);
			
			
			
			
			
			
		}
		
		
		
		
		
		
		public void manualaByAttributeExtend1StStResource (WebDriver driver,String St2N, String gTodaysDate, String gtimeHHMMSS,String St2V1,  String st02A1, String St1N, String branchName,String st01REsc ) throws Throwable
		{
			
			Actions act = new Actions(driver);
		
			createNewButton.click();
			Thread.sleep(100);
		
			fireStationField.click();
			Thread.sleep(500);
			
			
			act.sendKeys(St2N).build().perform();
			Thread.sleep(500);
			act.sendKeys(Keys.ENTER).build().perform();
		
			alarmKeyword.click();
			
			act.sendKeys("BG-manual alarm by attribute for extend-" + gTodaysDate+"_"+gtimeHHMMSS).build().perform();
		
		alarmImage.click();
		
		
		act.sendKeys("Image-manual alarm by attribute for extend.").build().perform();
		
		
		descriptionField.click();
		act.sendKeys("checking manual alarm created by attribute for extend.").build().perform();
		
		
		
		
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
		Thread.sleep(500);
		
		vehicleField1.click();
			
		Thread.sleep(500);
		act.sendKeys(St2V1).perform();
		Thread.sleep(500);
		act.sendKeys(Keys.ENTER).perform();
		
		
		attributeField.click();
		
		act.sendKeys(st02A1).perform();
		Thread.sleep(1000);
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(1000);
		
		act.sendKeys(Keys.TAB).perform();
		
		
		generateAlarm.click();
		Thread.sleep(500);
		yesCreate.click();
		Thread.sleep(500);
		
		System.out.println("Alarm created.");
		
		
		titleSearch.click();
		Thread.sleep(500);
		titleSearchField.click();
		Thread.sleep(500);;
		act.sendKeys("BG-manual alarm by attribute for extend-" + gTodaysDate+"_"+gtimeHHMMSS).build().perform();
		Thread.sleep(1000);
		titleSearchFieldOk.click();
		Thread.sleep(2000);
		action.click();
		Thread.sleep(1000);
		addExtension.click();
		Thread.sleep(2000);
		
		
		extendStation.click();
		Thread.sleep(1000);
		
		act.sendKeys(St1N).build().perform();
		Thread.sleep(1000);
		act.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(1000);
		
		
		userTypeResource.click();
		Thread.sleep(3000);
		
		act.sendKeys(Keys.TAB).perform();
		//		extendResourceFiled.click();
		Thread.sleep(1000);
		act.sendKeys(st01REsc).perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(1000);
		additionalFields.click();
		Thread.sleep(1000);
		act.sendKeys("alarm Additional Information 1 ").perform();
			Thread.sleep(2000);
			saveExtendAlarm.click();
			Thread.sleep(2000);
			yesExtendAlarm.click();
			Thread.sleep(2000);
			
			System.out.println("Alarm extednded.");
			
			
			
			  refreshFilter.click();
		      Thread.sleep(2000);
			
			
			
			
			
			
			
			
		
		
		
		
		
		}
		
		public void manualAlarmByEscResourceMS (WebDriver driver,String St2N, String gTodaysDate, String gtimeHHMMSS,String st02REsc) throws Throwable
		{
			
		
			Actions act = new Actions(driver);
			createNewButton.click();
			Thread.sleep(1000);
		
			fireStationField.click();
			Thread.sleep(500);
			
			
			act.sendKeys(St2N).build().perform();
			Thread.sleep(500);
			act.sendKeys(Keys.ENTER).build().perform();
			
			alarmKeyword.click();
			act.sendKeys("BG-manual alarm by escalation resource MS-" + gTodaysDate+"_"+gtimeHHMMSS).build().perform();
		
		alarmImage.click();
		
		
		act.sendKeys("Image-manual alarm by escalation resource MS").build().perform();
		
		descriptionField.click();
		
		act.sendKeys("Checking manual alarm by escalation resource MS").build().perform();
		
		
		
		priority.click();
		Thread.sleep(500);
		
		
		reporter.click();
		Thread.sleep(1000);
		reporterName.click();
		
		act.sendKeys("Dr. Nikhil").build().perform();
		
		
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
		act.sendKeys("Tapasya Vidya Mandir, 4446+52G, Vinkar Colony, Manewada, Nagpur, Maharashtra 440024").build().perform();
		
		
		
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
			
		
			
			userTypeResource.click();
			Thread.sleep(1000);
			
			
			resourceField1.click();
			Thread.sleep(500);
				
			
			act.sendKeys(st02REsc).perform();
			Thread.sleep(500);
			act.sendKeys(Keys.ENTER).perform();
			
		
			
			
			generateAlarm.click();
			Thread.sleep(1000);
			yesCreate.click();
			Thread.sleep(2000);
			
		
			
			
		
		
		
		
		
		}
		
		
		
		public void manualAlarmByEscResourceSingleStation (WebDriver driver,String St1N, String gTodaysDate, String gtimeHHMMSS,String st01REsc) throws Throwable
		{
			
		
			Actions act = new Actions(driver);
			createNewButton.click();
			Thread.sleep(500);
		
			fireStationField.click();
			Thread.sleep(100);
			
			
			act.sendKeys(St1N).build().perform();
			Thread.sleep(500);
			act.sendKeys(Keys.ENTER).build().perform();
			
			alarmKeyword.click();
			act.sendKeys("BG-manual alarm by escalation resource SS-" + gTodaysDate+"_"+gtimeHHMMSS).build().perform();
		alarmImage.click();
		
		act.sendKeys("Image-manual alarm by escalation resource SS").build().perform();
		
		descriptionField.click();
		
		act.sendKeys("Checking manual alarm by escalation resource SS").build().perform();
		
		
		
		Thread.sleep(2000);
		
		reporter.click();
		Thread.sleep(1000);
		reporterName.click();
		
		act.sendKeys("Dr. Nikhil").build().perform();
		
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
		act.sendKeys("Tapasya Vidya Mandir, 4446+52G, Vinkar Colony, Manewada, Nagpur, Maharashtra 440024").build().perform();
		
		
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
			Thread.sleep(1000);
			
			
			resourceField1.click();
			Thread.sleep(500);
				
			
			act.sendKeys(st01REsc).perform();
			Thread.sleep(500);
			act.sendKeys(Keys.ENTER).perform();
			
		
			
			act.sendKeys(Keys.TAB).perform();
			
			generateAlarm.click();
			Thread.sleep(1000);
			yesCreate.click();
			Thread.sleep(2000);
			
			
			
		
		
		
		
		
		}
		
		
		
		public void manualaByAttributeMSLP (WebDriver driver,String St1N,String St2N, String gTodaysDate, String gtimeHHMMSS,String St1V1, String St1V2,String St2V1, String st01A1,String st02A1 ) throws Throwable
		{
			
		
			Actions act = new Actions(driver);
			createNewButton.click();
			Thread.sleep(1000);
		
			fireStationField.click();
			Thread.sleep(500);
			
			
			act.sendKeys(St1N).build().perform();
			Thread.sleep(500);
			act.sendKeys(Keys.ENTER).build().perform();
			Thread.sleep(1000);
			act.sendKeys(St2N).build().perform();
			Thread.sleep(500);
			act.sendKeys(Keys.ENTER).build().perform();
		
			alarmKeyword.click();
			
			act.sendKeys("BG-manual alarm by attribute-" + gTodaysDate+"_"+gtimeHHMMSS).build().perform();
		
		alarmImage.click();
		
		
		act.sendKeys("Image-manual alarm by checking.").build().perform();
		
		
		descriptionField.click();
		act.sendKeys("BG-manual alarm by attribute checking.").build().perform();
		
		
		priority.click();
		Thread.sleep(500);
		
		reporter.click();
		Thread.sleep(500);
		reporterName.click();
		
		act.sendKeys("Dr. Sumit Raghute").build().perform();
		
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
		Thread.sleep(500);
		
		
		act.sendKeys(St1V1).perform();
		Thread.sleep(500);
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(1000);
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).build().perform();
		
		act.sendKeys(St1V2).perform();
		Thread.sleep(500);
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(1000);
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).build().perform();
		
		act.sendKeys(St2V1).perform();
		Thread.sleep(500);
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(1000);
		
		
		attributeField.click();
		
		act.sendKeys(st01A1).perform();
		Thread.sleep(500);
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(1000);
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).build().perform();
			
			act.sendKeys(st02A1).perform();
			Thread.sleep(500);
		
			act.sendKeys(Keys.ENTER).perform();
			Thread.sleep(1000);
			
			
		
		
			
			act.sendKeys(Keys.TAB).perform();
			
			generateAlarm.click();
			Thread.sleep(500);
			yesCreate.click();
			Thread.sleep(2000);
			
			
			
			
			
		
		
		
		
		
		}
		
		
		public void manualaByAttributeSingleStation (WebDriver driver,String St1N, String gTodaysDate, String gtimeHHMMSS,String St1V1, String St1V2, String st01A1 ) throws Throwable
		{
			
		
			Actions act = new Actions(driver);
			Thread.sleep(2000);
			createNewButton.click();
			Thread.sleep(2000);
		
			fireStationField.click();
			Thread.sleep(2000);
			
			act.sendKeys(St1N).build().perform();
			Thread.sleep(2000);
			act.sendKeys(Keys.ENTER).build().perform();
		
			alarmKeyword.click();
			
			act.sendKeys("BG-manual alarm by attribute-" + gTodaysDate+"_"+gtimeHHMMSS).build().perform();
		
		alarmImage.click();
		
		
		act.sendKeys("Image-manual alarm by attribute checking.").build().perform();
		
		
		descriptionField.click();
		act.sendKeys("BG-manual alarm by attribute checking.").build().perform();
		
		
		
		Thread.sleep(2000);
		
		reporter.click();
		Thread.sleep(2000);
		reporterName.click();
		
		act.sendKeys("Dr. Sumit Raghute").build().perform();
		
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
		act.sendKeys(St1V2).perform();
		Thread.sleep(1000);
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(1000);
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).build().perform();
		
		attributeField.click();
		
		act.sendKeys(st01A1).perform();
		Thread.sleep(1000);
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(1000);
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).build().perform();
			Thread.sleep(1000);
		
			
			act.sendKeys(Keys.TAB).perform();
			
			generateAlarm.click();
			Thread.sleep(1000);
			yesCreate.click();
			Thread.sleep(2000);
			
		
			
			
		
		
		
		
		
		}
		
		
		
		
		public void manualAlarmByResourceMs (WebDriver driver,String St1N,String St2N, String gTodaysDate, String gtimeHHMMSS,String st01R1, String st01R2 ) throws Throwable
		{
			
		
			Actions act = new Actions(driver);
			createNewButton.click();
			Thread.sleep(1000);
		
			fireStationField.click();
			Thread.sleep(500);
			
			
			act.sendKeys(St1N).build().perform();
			Thread.sleep(500);
			act.sendKeys(Keys.ENTER).build().perform();
			Thread.sleep(1000);
			act.sendKeys(St2N).build().perform();
			Thread.sleep(500);
			act.sendKeys(Keys.ENTER).build().perform();
		
			alarmKeyword.click();
			
			act.sendKeys("BG-manual alarm by resource-" + gTodaysDate+"_"+gtimeHHMMSS).build().perform();
		
		alarmImage.click();
		
		
		act.sendKeys("Image-manual alarm by resource checking.").build().perform();
		
		descriptionField.click();
		
		act.sendKeys("BG-manual alarm by resource checking.").build().perform();
		
		
		reporter.click();
		Thread.sleep(500);
		reporterName.click();
		
		act.sendKeys("Dr. Sumit Raghute").build().perform();
		
		reporterStreet.click();
		act.sendKeys("Kharbi Road, Nagpur").build().perform();
		reporterZipCode.click();
		act.sendKeys("440009").build().perform();
		
		reporterMobileNo.click();
		act.sendKeys("1122334455").build().perform();
		reporterCallback.click();
		act.sendKeys("10").build().perform();
				Thread.sleep(500);
				
				Robot robot = new Robot();
		
				
				act.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).sendKeys(Keys.TAB).build().perform();
				
				
				
		
				
				
		act.sendKeys("fire at hospital.").build().perform();
		
		
		
		
		act.sendKeys(Keys.TAB).sendKeys(Keys.TAB).build().perform();
		Thread.sleep(500);
		robot.mouseWheel(5);
		
		act.sendKeys(Keys.ENTER).build().perform();
		
		
		
		alarmAddress.click();
		act.sendKeys("YES Hospital, Plot no. 1 & 1A, Dighori Flyover Square, Dighori, Nagpur, Maharashtra 440017").build().perform();
		
		
		for (int i=0;i<=9;i++)
		{
			act.sendKeys(Keys.TAB).perform();
			
		}
		
		
		
		additionalAddressInformation.click();
		
		Thread.sleep(500);
		
		alarmObject.click();
		act.sendKeys("hospital").perform();
		
		
		alarmFloor.click();
		act.sendKeys("ground floor").perform();
		
		
		alarmAnnotation.click();
		act.sendKeys("alarm annotation").perform();
			Thread.sleep(1000);
			
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
				
			
			act.sendKeys(st01R2).perform();
			Thread.sleep(500);
			act.sendKeys(Keys.ENTER).perform();
			Thread.sleep(1000);
		
		
			
			
		
			
			act.sendKeys(Keys.TAB).perform();
			
			generateAlarm.click();
			Thread.sleep(500);
			yesCreate.click();
			Thread.sleep(500);		
			
			
			
		
		
		
		
		
		}
		
		
		
		public void manualAlarmByFirefighterMs (WebDriver driver,String St1N,String St2N, String gTodaysDate, String gtimeHHMMSS,String St1V1, String St1V2,String St2V1 ,String st01FF1,String st02FF1 ) throws Throwable
		{
			
		
			Actions act = new Actions(driver);
			createNewButton.click();
			Thread.sleep(2000);
		
			fireStationField.click();
			Thread.sleep(500);
			
			
			act.sendKeys(St1N).build().perform();
			Thread.sleep(500);		act.sendKeys(Keys.ENTER).build().perform();
			Thread.sleep(2000);
			act.sendKeys(St2N).build().perform();
			Thread.sleep(500);
			act.sendKeys(Keys.ENTER).build().perform();
		
			alarmKeyword.click();
			act.sendKeys("BG-manual alarm by firefighter-" + gTodaysDate+"_"+gtimeHHMMSS).build().perform();
		alarmImage.click();
		
		act.sendKeys("Image-manual alarm by firefighter checking.").build().perform();
		
		descriptionField.click();
		
		act.sendKeys("BG-manual alarm by firefighter checking.").build().perform();
		
		
		
		
		reporter.click();
		Thread.sleep(1000);
		reporterName.click();
		
		act.sendKeys("Dr. Sumit Raghute").build().perform();
		
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
		act.sendKeys("YES Hospital, Plot no. 1 & 1A, Dighori Flyover Square, Dighori, Nagpur, Maharashtra 440017").build().perform();
		
		
		for (int i=0;i<=9;i++)
		{
			act.sendKeys(Keys.TAB).perform();
			
		}
		
		
		
		additionalAddressInformation.click();
		
		Thread.sleep(500);
		
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
			
		
		act.sendKeys(St1V1).perform();
		Thread.sleep(1000);
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(1000);
		
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).build().perform();
		Thread.sleep(500);
		
		act.sendKeys(St1V2).perform();
		Thread.sleep(1000);
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(1000);
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).build().perform();
			Thread.sleep(500);
			
			
			act.sendKeys(St2V1).perform();
			Thread.sleep(500);
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
		
		
			
			
		
			
			act.sendKeys(Keys.TAB).perform();
			
			generateAlarm.click();
			Thread.sleep(500);
			yesCreate.click();
			Thread.sleep(5000);
			
		
			
			
			
		
		
		
		
		
		}
		
		public void deleteManualAlarm(WebDriver driver) throws Throwable {
		    Actions act = new Actions(driver);
		    
		    
		    
		    Thread.sleep(2000);
		 itemPepage100.click();
		 Thread.sleep(5000);
		
		    titleSearch.click();
		    Thread.sleep(2000);
		
		    titleSearchField.click();
		    Thread.sleep(2000);
		
		    act.sendKeys("BG").perform();
		Thread.sleep(2000);
		
		titleSearchFieldOk.click();
		Thread.sleep(10000);
		
		int totalAlarms = 0;
		
		for (int batch = 1; batch <=15 ; batch++) {
		    int count = BGAlarm.size();
		         
		    
		  
		      
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
		System.out.println("Total >>>>>" + totalAlarms + "<<<<< alarms deleted successfully.");
		
			    refreshFilter.click();
			    Thread.sleep(2000);
		
			    
			}
		
		
			public void backToOld() throws Throwable 
			{
				refreshFilter.click();
		        Thread.sleep(2000);
		
				dashbordMenu2.click();
				Thread.sleep(1000);
				dashboard2.click();
				
				Thread.sleep(2000);
			}
			
			
			
		
		}
