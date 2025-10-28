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
		
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(4000);
		
		
		
		if  (branchName.equals("1"))
		{
//			dashboardL.click();
			driver.navigate().to("https://live.retteralarm.de/admin/dashboard/index");
		}
		
		else if (branchName.equals("2"))
		{
			dashboardT.click();
		}
		
		else if (branchName.equals("3"))
		{
			dashboardD.click();
			
		}
		
		
		
		
		
		
		Thread.sleep(3000);
		
		

	}

	
	

}
