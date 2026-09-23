package function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Q_Attribute extends b_baseClass{

	
		 @FindBy(xpath="//span[text()=\"Attributes\"]")private WebElement attributeModul;
		 @FindBy(xpath="//a[text()=\"Manage Attributes\"]")private WebElement  manageAttribute;
		 @FindBy(xpath="//button[text()=\" Create New\"]")private WebElement createNew ;
		 @FindBy(xpath="//select[@name=\"data[AlarmAttribute][department_id]\"]")private WebElement selectDepartment;
		 @FindBy(xpath="//input[@name=\"data[AlarmAttribute][title]\"]")private WebElement attributeTitle ;
		 
		// @FindBy(xpath="")private WebElement ;
		// @FindBy(xpath="")private WebElement ;
		// @FindBy(xpath="")private WebElement ;
		// @FindBy(xpath="")private WebElement ;

		public Q_Attribute(WebDriver driver) {
			PageFactory.initElements(driver, this);

		}
		
		
		public void commanAttribute (WebDriver driver) throws Throwable
		{
			
			attributeModul.click();
			Thread.sleep(2000);
			manageAttribute.click();
			Thread.sleep(2000);
			
		}
		
		
		
		

		public void Bhupes_addAttribute (WebDriver driver,String branchName, String deptN ) throws Throwable
		{
			
			Actions act = new Actions (driver );
			
			createNew.click();
			Thread.sleep(2000);
			selectDepartment.click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//option[text()='" + deptN + "']")).click();
			Thread.sleep(1000);
			attributeTitle.click();
		
			
			
			
			
		}
		
	
	
	
	
	
	
	
	
}
