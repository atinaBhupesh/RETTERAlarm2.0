package function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class R_FileSections extends b_baseClass {

	@FindBy(xpath = "//span[text()=\"Documentation\"]")
	private WebElement DocumentationModule;
	@FindBy(xpath = "//a[text()=\"File Section\"]")
	private WebElement fileSection;
	@FindBy(xpath = "//button[text()=\" Create New\"]")
	private WebElement createNew;
	@FindBy(xpath = "//select[@name=\"data[FileSection][department_id]\"]")
	private WebElement selectDepartment;
	@FindBy(xpath = "//select[@id=\"select2Users\"]")
	private WebElement selectStation;
	 @FindBy(xpath="//textarea[@placeholder=\"Enter title\"]")private WebElement fileTitle;
	 @FindBy(xpath="//input[@placeholder=\"Enter address\"]")private WebElement fileAddress;

	@FindBy(xpath="//input[@class=\"form-control uploadFile1\"]")private WebElement file1;
	// @FindBy(xpath="")private WebElement ;
	// @FindBy(xpath="")private WebElement ;

	// @FindBy(xpath="")private WebElement ;
	// @FindBy(xpath="")private WebElement ;
	// @FindBy(xpath="")private WebElement ;

	public R_FileSections(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}

	public void addNewFile(WebDriver driver, String branchName, String deptN, String st01N, String gtimeHHMMSS) throws Throwable {

		Actions act = new Actions (driver);
	
		
		createNew.click();
		Thread.sleep(2000);
		selectDepartment.click();
		Thread.sleep(500);
		Select se = new Select(selectDepartment);
		se.selectByVisibleText(deptN);
		Thread.sleep(500);

		selectStation.click();
		Thread.sleep(500);
		Select se1 = new Select(selectStation);
		se1.selectByVisibleText(st01N);
		Thread.sleep(500);
		
		fileTitle.click();
		Thread.sleep(500);
		
		act.sendKeys("BG_file For Station"+st01N+"_"+gtimeHHMMSS).perform();
		
		fileAddress.click();
		Thread.sleep(500);
		act.sendKeys("Mahal Nagpur").perform();
		Thread.sleep(500);
		file1.click();
		
		

	}

	public void commanForDocumentation(WebDriver driver) throws Throwable {
		DocumentationModule.click();
		Thread.sleep(1000);
		fileSection.click();
		Thread.sleep(1000);

	}

}
