package function;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class D_homePage extends b_baseClass{
	
	@FindBy(xpath = "//img[@src=\"/img/logoicon.png\"]")private WebElement retterAlarmimg;
	@FindBy(xpath = "//select[@name=\"data[app_type]\"]")private WebElement languageButton;
//	@FindBy(xpath="//span[text()=\"Dashboard\"]")private WebElement dashboardMenu;
	@FindBy(xpath="//a[@href=\"http://testing.retteralarm.de/admin/dashboard/index\"]")private WebElement dashboardT;
	@FindBy(xpath="//a[@href=\"http://live.retteralarm.de/admin/dashboard/index\"]")private WebElement dashboardL;
	@FindBy(xpath="//a[@href=\"http://development.retteralarm.de/admin/dashboard/index\"]")private WebElement dashboardD;
	

	public D_homePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void langChange(WebDriver driver) throws Throwable {
		Select se = new Select(languageButton);
		se.selectByVisibleText("English");
		Thread.sleep(3000);

	}

	public void backToHomePage(WebDriver driver, String branchName) throws Throwable {
		Actions act = new Actions(driver);
		
	
		
		
		
		
		switch (branchName)
		{
		case "1":
		{
		driver.navigate().to("https://live.retteralarm.de/");
		 break;
		}
		
		case "2":
		{
		driver.navigate().to("https://testing.retteralarm.de/");
		 break;
		}
		
		case "3":
		{
		driver.navigate().to("https://development.retteralarm.de/");
		 break;
		}
		default:
	         System.out.println("Branch not matched. Staying on current page.");
	         break;
		
		}
		
		
		
		
		
		
		
		
		Thread.sleep(4000);
		
		

	}

	
	

}
