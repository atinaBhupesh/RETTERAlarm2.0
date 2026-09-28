package function;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class T_checkList extends b_baseClass {
	
	
	
	
	@FindBy(xpath="//span[text()=\"Documentation\"]")private WebElement documentationModule;
		 @FindBy(xpath="//a[text()=\"Checklist\"]")private WebElement checkList;
		@FindBy(xpath="//button[text()=\" Create New\"]")private WebElement createNew;
		@FindBy(xpath="//select[@id=\"selectFiredepartment\"]")private WebElement selectDepartment;
		 @FindBy(xpath="//span[@class=\"select2-selection__placeholder\"]")private WebElement selectStation;
	 @FindBy(xpath="//input[@value=\"1\"]")private WebElement normalCheckList;
			 @FindBy(xpath="//input[@value=\"2\"]")private WebElement alarmCheckList;
			 @FindBy(xpath="//input[@placeholder=\"Enter title\"]")private WebElement checkListTitle;
			
	 @FindBy(xpath="//button[text()=\"Add Points\"]")private WebElement addPoint;
			 @FindBy(xpath="(//input[@placeholder=\"Enter points\"])[last()]")private WebElement enterPoint;
			 @FindBy(xpath="//button[@id=\"addSubmit\"]")private WebElement saveCheckList;
			 @FindBy(xpath="(//td[@style=\" width: 5%\"])[2]")private WebElement firstTitle;
			 @FindBy(xpath="//input[@type=\"search\"]")private WebElement searchField ;
			 @FindBy(xpath="//select[@name=\"example12_length\"]")private WebElement itemPerPage ;
				 @FindBy(xpath="//span[text()=\"Active\"]")private List<WebElement> activeButton;
				@FindBy(xpath="//button[@data-action=\"yes\"]")private WebElement deleteYes;
				 @FindBy(xpath="//button[@id=\"dt_actionSearch\"]")private WebElement searchButton;
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

		public T_checkList(WebDriver driver) {
			PageFactory.initElements(driver, this);

		}

	
		
		public void commanCheckList (WebDriver driver, String deptN, String st01N, String checkListType, String timeHHMMSSG) throws Throwable 
		{
			
			
			documentationModule.click();
			Thread.sleep(2000);
			checkList.click();
			Thread.sleep(2000);
			createNew.click();
			Thread.sleep(2000);
			
			
			selectDepartment.click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//option[text()='" + deptN + "']")).click();
			
			selectStation.click();
			Thread.sleep(1000);
			Actions act = new Actions (driver);
			act.sendKeys(st01N).sendKeys(Keys.ENTER).build().perform();
			
			
			switch (checkListType)
			{
			case "NormalChecklists":
				normalCheckList.click();
				
				break;
				
				
			case "AlarmChecklists":
				alarmCheckList.click();
				
				break;
				
				
				
			}
			
			checkListTitle.click();
			String  title = "BG-"+checkListType+"-"+timeHHMMSSG;
			
			act.sendKeys(title).perform();
			enterPoint.click();
			act.sendKeys(checkListType+"-pont 01").perform();
			
			
			for (int i=2;i<=5;i++)
			{
			addPoint.click();
			enterPoint.click();
			act.sendKeys(checkListType+"-pont 0"+i).perform();
			}
			
			
			saveCheckList.click();
			
			String actualTite = firstTitle.getText();

			Assert.assertTrue(actualTite.contains(title), RED + "Station not found.");

			System.out.println(GREEN + checkListType + " added successfully.");
			
		}
		
		
		
		
		
		
		
		public void deleteCheckList (WebDriver driver) throws Throwable
		{
			Actions act = new Actions (driver);
			documentationModule.click();
			checkList.click();
			Thread.sleep(2000);
			itemPerPage.click();
			Select se = new Select(itemPerPage);
			se.selectByVisibleText("100");
			Thread.sleep(2000);
			searchField.click();
			act.sendKeys("BG").perform();
			searchButton.click();
			Thread.sleep(2000);
			
			int totalCount =0;
			
			if (activeButton.size()==0)
			{
				System.out.println("no check list for delete ");
			}
			
			else 
			{
				int availabeCount = activeButton.size();
				System.out.println("Total-"+availabeCount+" available for delete.");
				
				for (int i=1;i<=availabeCount;i++)
				{
					System.out.println("check list no-"+i+" deleting process going on.");
					driver.findElement(By.xpath("(//i[@class=\"fa fa-trash-o\"])["+i+"]")).click();
					Thread.sleep(1000);
					deleteYes.click();
					Thread.sleep(1000);
					
					totalCount++;
					
				}
				
				System.out.println("Total-"+totalCount+" check list deleted successfully.");
				
			}
			
			
		}
	
	
	
	
	
	

}
