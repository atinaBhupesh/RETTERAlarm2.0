package function;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class U_MonitorLogIn extends b_baseClass {

	@FindBy(xpath = "//input[@id=\"username\"]")
	private WebElement userName;
	@FindBy(xpath = "//input[@id=\"password\"]")
	private WebElement password;
	@FindBy(xpath = "//button[@type=\"submit\"]")
	private WebElement logInButton;
	@FindBy(xpath = "//span[@class=\"titletext ng-tns-c3911627336-0\"]")
	private List<WebElement> alarmTitle;
	 @FindBy(xpath="(//i[@class=\"fa fa-times ng-tns-c3911627336-0\"])[1]")private WebElement cloeseAlarm;
	 @FindBy(xpath="//button[text()=\"Bestätigen\" or text()=\"Yes, close it!\"]")private WebElement yesCloseAlarm;
	 @FindBy(xpath="(//span[@class=\"titletext ng-tns-c3911627336-0\"])[1]")private WebElement alarmTitle1; ;
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

	public U_MonitorLogIn(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void loginToMonitors(WebDriver driver, String branchName, String St01M1
			) throws Throwable {
		String parentWindow = driver.getWindowHandle();

		Actions act = new Actions(driver);
		driver.switchTo().newWindow(WindowType.TAB);
		
		String password1 = null ;

		switch (branchName) {
		case "1": {
			driver.navigate().to("https://am2.retteralarm.de/");
			password1="Atina@123";
			break;
		}

		case "1.1": {
			driver.navigate().to("https://am2.retteralarm.de/");
			break;
		}

		case "2": {
			driver.navigate().to("https://am2.testing.retteralarm.de/monitor/dashboard");
			password1="Qwerty@123";
			
			break;
		}

		case "3": {
			driver.navigate().to("https://am2.testing.retteralarm.de/monitor/dashboard");
			break;
		}

		}

		userName.click();
		Thread.sleep(1000);
		act.sendKeys(St01M1).perform();

		password.click();

		act.sendKeys(password1).perform();
		logInButton.click();
		Thread.sleep(2000);
		
	}
	
	
	public void checkAlarmDisplayedOnMonitors(WebDriver driver, String branchName, String St01M1,
			List<String> createdAlarmTitles) throws Throwable {
		String parentWindow = driver.getWindowHandle();
				
		loginToMonitors( driver,  branchName,  St01M1);
		
		

		int alarmCount = alarmTitle.size();
		Thread.sleep(2000);

		System.out.println("Number of alarms displayed on monitor: " + alarmCount);

		// Create array according to alarm count
		String[] actualTitles = new String[alarmCount];

		// Store all alarm titles in array
		for (int i = 0; i < alarmCount; i++) {

		    
		    actualTitles[i] = alarmTitle1.getText().trim();
		    Thread.sleep(1000);
		    System.out.println("actualTitles[" + i + "] = " + actualTitles[i]);
//		    driver.findElement(By.xpath("//span[text()=\"" + actualTitles[1] + "\"]")).click();
		    Thread.sleep(2000);
		    cloeseAlarm.click();
		    Thread.sleep(2000);
		    yesCloseAlarm.click();
		    Thread.sleep(2000);
		    
		    
		    
		}
		System.out.println();
		
		String[] createdAlarms = createdAlarmTitles.toArray(new String[0]);	
		
		for (String expectedTitle : createdAlarms) {

		    if (Arrays.asList(actualTitles).contains(expectedTitle.trim())) {
		        System.out.println(GREEN + expectedTitle + " - Available");
		    } else {
		        System.out.println(RED + expectedTitle + " - Not Available");
		    }
		}
		
		driver.close();
		driver.switchTo().window(parentWindow);
	}
	
	
	
	public void cloesedAlarmFromMonitor (WebDriver driver, String branchName, String St01M1) throws Throwable
	{
		String parentWindow = driver.getWindowHandle();
		
		loginToMonitors( driver,  branchName,  St01M1);
		
		int alarmCount = alarmTitle.size();
		Thread.sleep(2000);
		int totalAlarms = 0;

		System.out.println("Number of alarms displayed on monitor: " + alarmCount);
		
		if (alarmCount==0)
		{
			  System.out.println(GREEN+"No alarms for closed on monitor");
		}
		
		else {
		for (int i = 0; i < alarmCount; i++) {

		    
		    
		   
		    Thread.sleep(2000);
		    cloeseAlarm.click();
		    Thread.sleep(2000);
		    yesCloseAlarm.click();
		    Thread.sleep(2000);
		    System.out.println(GREEN+"Alarm no-" + i + " closed successfully");
		    totalAlarms++;
		    
		    
		    
		}
		
	}
		System.out.println(GREEN+"Total alarms closed from monitor: " + totalAlarms);
		System.out.println();
		driver.close();
		driver.switchTo().window(parentWindow);
		
	}

}
