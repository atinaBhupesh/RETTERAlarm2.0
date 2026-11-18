package function;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.List;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Q_attribute extends b_baseClass {

	@FindBy(xpath = "//span[text()=\"Attributes\"]")
	private WebElement attributeModel;
	@FindBy(xpath = "//a[text()=\"Manage Attributes\"]")
	private WebElement manageAttribute;
	@FindBy(xpath = "//button[@class=\"btn btn-success\"]")
	private WebElement createNew;
	@FindBy(xpath = "//select[@id=\"sectionDepartment\"]")
	private WebElement selectDepartment;
	@FindBy(xpath = "//input[@id=\"AlarmAttributeTitle\"]")
	private WebElement atributTitle;
	@FindBy(xpath = "//input[@id=\"AlarmAttributeShortName\"]")
	private WebElement attributShorName;
	@FindBy(xpath = "//button[@id=\"addSubmit\"]")
	private WebElement saveAttribute;
	@FindBy(xpath = "(//td[contains(text(),\"BG_Attribute\")])[1]")
	private WebElement firstTitle;
	@FindBy(xpath = "//input[@type=\"search\"]")
	private WebElement searchField;
	@FindBy(xpath = "//button[@id=\"dt_actionSearch\"]")
	private WebElement searchButton;
	@FindBy(xpath = "//td[contains(text(),\"BG_Attribute\")]")
	private List<WebElement> availableBGAttribute;
	@FindBy(xpath = "//i[@class=\"fa fa-pencil-square-o\"]")
	private WebElement editAttribute;
	@FindBy(xpath = "(//i[@class=\"fa fa-trash-o\"])[1]")
	private WebElement deleteAttribute;
	@FindBy(xpath = "//button[@type=\"submit\"]")
	private WebElement deleteYes;
	// @FindBy(xpath="")private WebElement ;
	// @FindBy(xpath="")private WebElement ;
	// @FindBy(xpath="")private WebElement ;

	public Q_attribute(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void commonAttribute(WebDriver driver) throws Throwable {
		attributeModel.click();
		Thread.sleep(2000);
		manageAttribute.click();
		Thread.sleep(2000);

	}

	public void deleteAttribute(WebDriver driver) throws Throwable {
		searchField.click();
		Actions act = new Actions(driver);
		int count = 0;

		act.sendKeys("BG_Attribute").perform();
		Thread.sleep(1000);
		searchButton.click();
		int availabeAttribute = availableBGAttribute.size();
		System.out.println("Total Attribute availabe for Delete-" + availabeAttribute);

		driver.navigate().refresh();
		Thread.sleep(2000);
		for (int i = 0; i < availabeAttribute; i++) {
			searchField.click();
			act.sendKeys("BG_Attribute").perform();
			Thread.sleep(1000);
			searchButton.click();
			Thread.sleep(4000);
			deleteAttribute.click();
			Thread.sleep(4000);

			deleteYes.click();
			Thread.sleep(4000);
			count++;
		}

		System.out.println(GREEN + "Total deleted attribute-" + count);
	}

	public void updateAttribute(WebDriver driver, String newAttribute) throws Throwable {
		searchField.click();
		Actions act = new Actions(driver);

		act.sendKeys(newAttribute).perform();
		Thread.sleep(1000);
		searchButton.click();
		Thread.sleep(3000);
		editAttribute.click();
		Thread.sleep(2000);
		atributTitle.clear();
		atributTitle.click();
		String title = newAttribute + "_updated";
		act.sendKeys(title).perform();
		String attributeShortName = attributShorName.getDomProperty("value");
		attributShorName.clear();
		attributShorName.click();
		act.sendKeys(attributeShortName + "_" + "updated").perform();
		Thread.sleep(3000);

		saveAttribute.click();
		Thread.sleep(3000);

		String actualTite = firstTitle.getText();

		Assert.assertTrue(actualTite.contains(title), RED + "Station not found.");

		System.out.println(GREEN + " Attribute-" + title + " successfully.");
	}

	public void addNewAttribute(WebDriver driver, String filePath, String deptN, String todaysDateG, String timeHHMMSS)
			throws Throwable {

		createNew.click();
		Thread.sleep(2000);
		Select se = new Select(selectDepartment);
		se.selectByVisibleText(deptN);

		Thread.sleep(1000);
		atributTitle.click();
		Actions act = new Actions(driver);

		String title = "BG_Attribute_" + todaysDateG + "_" + timeHHMMSS;
		act.sendKeys(title).perform();
		attributShorName.click();
		act.sendKeys("BG_Attri_" + todaysDateG + "_" + timeHHMMSS).perform();
		Thread.sleep(2000);
		saveAttribute.click();
		Thread.sleep(3000);

		String actualTite = firstTitle.getText();

		Assert.assertTrue(actualTite.contains(title), RED + "Station not found.");

		FileInputStream in = new FileInputStream(filePath);

		XSSFWorkbook wb = new XSSFWorkbook(in);
		XSSFSheet sheet = wb.getSheetAt(0);

		Row row = sheet.getRow(108);

		if (row == null) {
			row = sheet.createRow(108);
		}

		row.createCell(0).setCellValue("newAttribute");
		row.createCell(1).setCellValue(title);

		in.close();

		FileOutputStream out = new FileOutputStream(filePath);
		wb.write(out);

		out.close();
		wb.close();

		System.out.println(GREEN + "New Attribute-" + title + " created successfully.");

	}

}
