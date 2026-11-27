package function;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class R_FileSections extends b_baseClass {

	@FindBy(xpath = "//span[text()=\"Documentation\"]")
	private WebElement DocumentationModule;
	@FindBy(xpath = "//a[text()=\"File Section\"]")
	private WebElement fileSection;
	@FindBy(xpath = "//button[text()=\" Create New\"]")
	private WebElement createNew;
	@FindBy(xpath = "//select[@id=\"selectFiredepartment\"]")
	private WebElement selectDepartment;
	@FindBy(xpath = "//select[@id=\"select2Users\"]")
	private WebElement selectStation;
	@FindBy(xpath = "//textarea[@placeholder=\"Enter title\"]")
	private WebElement fileTitle;
	@FindBy(xpath = "//input[@placeholder=\"Enter address\"]")
	private WebElement fileAddress;

	@FindBy(xpath = "//input[@class=\"form-control uploadFile1\"]")
	private WebElement chooseFile1;
	@FindBy(xpath = "//BUTTON[@id=\"addSubmit\"]")
	private WebElement save;

	@FindBy(xpath = "(//td[contains(text(),\"BG_\")])[1]")
	private WebElement firstItemTitle;
	@FindBy(xpath = "//input[@type=\"search\"]")
	private WebElement searchField;
	@FindBy(xpath = "//button[@id=\"dt_actionSearch\"]")
	private WebElement searchButton;

	@FindBy(xpath = "//SELECT[@aria-controls=\"example12\"]")
	private WebElement itemPerPage;
	@FindBy(xpath = "//td[contains(text(),\"BG_\")]")
	private List<WebElement> filesCount;

	@FindBy(xpath = "//button[@id=\"delRec\"]")
	private WebElement deleteYes;
	@FindBy(xpath = "(//i[@class=\"fa fa-trash-o\"])[1]")
	private WebElement delete1;
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

	public R_FileSections(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}

	public void addNewFile(WebDriver driver, String branchName, String deptN, String st01N, String gtimeHHMMSS,
			String infoDocx5MbFile, String infoPdf5MbFile) throws Throwable {

		Actions act = new Actions(driver);

		createNew.click();
		Thread.sleep(2000);

		Select select = new Select(selectDepartment);
		Thread.sleep(500);
		select.selectByVisibleText(deptN);

		Select se1 = new Select(selectStation);
		Thread.sleep(500);
		se1.selectByVisibleText(st01N);
		Thread.sleep(500);

		fileTitle.click();
		Thread.sleep(500);

		String title = "BG_file For Station_" + st01N + "_" + gtimeHHMMSS;
		act.sendKeys(title).perform();

		fileAddress.click();
		Thread.sleep(500);
		act.sendKeys("Mahal Nagpur").perform();
		Thread.sleep(500);

		WebElement upload = driver.findElement(By.cssSelector("input[type='file']"));

		((JavascriptExecutor) driver)
				.executeScript("arguments[0].style.display='block'; arguments[0].style.visibility='visible';", upload);

		upload.sendKeys(infoDocx5MbFile);

		Thread.sleep(1000);

		save.click();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));

		wait.until(ExpectedConditions.visibilityOf(createNew));
		Thread.sleep(3000);

		String expectedTitle = firstItemTitle.getText();

		if (!title.contains(expectedTitle)) {
			System.out.println(RED + title);

			Assert.fail();
		}

		System.out.println(GREEN + title);

	}

	public void deleteFiles(WebDriver driver) throws Throwable {

		Select se = new Select(itemPerPage);
		Thread.sleep(500);
		se.selectByVisibleText("100");
		searchField.click();
		Thread.sleep(1000);
		Actions act = new Actions(driver);
		act.sendKeys("BG_").perform();
		Thread.sleep(500);
		searchButton.click();
		Thread.sleep(2000);

		int count = filesCount.size();

		int total = 0;
		
	
		Thread.sleep(1000);

		if (count == 0) {
			System.out.println("No Files reqest for delete ");

		}

		else {
			System.out.println("Total-"+count+" files available for delete.");

			for (int i = 1; i < count; i++) {
				
				searchField.click();
				Thread.sleep(1000);
				act.sendKeys("BG_").perform();
				Thread.sleep(500);
				searchButton.click();
				Thread.sleep(2000);
		

				Thread.sleep(1000);
				delete1.click();
				Thread.sleep(1000);
				deleteYes.click();
				Thread.sleep(3000);
				total++;
				searchField.clear();
				Thread.sleep(2000);
				System.out.println("File no-"+i+" deleted successfully. ");

			}

		}

		System.out.println(GREEN+"Total-" + total + " files have been deleted successfully.");

	}

	public void commanForDocumentation(WebDriver driver) throws Throwable {
		DocumentationModule.click();
		Thread.sleep(1000);
		fileSection.click();
		Thread.sleep(1000);

	}

}
