package function;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Y_extra {

	public static void main(String[] args) throws Throwable {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://production.dev.weber-rescue.com/users/login");
		Thread.sleep(1500);
		driver.findElement(By.xpath("//input[@placeholder=\"RFID Nummer\"]")).click();
		Actions act = new Actions(driver);
		act.sendKeys("1121").perform();
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		Thread.sleep(2000);

		WebElement lang = driver.findElement(By.xpath("//select[@ng-model=\"lang_string.selected_language\"]"));

		lang.click();

		Select se = new Select(lang);
		se.selectByVisibleText("English");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()=\" Settings\"]")).click();
		Thread.sleep(2000);
		act.sendKeys(Keys.PAGE_DOWN).perform();

		driver.findElement(By.xpath("//a[text()=\" Firmware Updates\"]")).click();

		Thread.sleep(1500);

		for (int i = 4; i <= 15; i++)
			
		{
			driver.findElement(By.xpath("//a[text()=\" Add New\"]")).click();
			Thread.sleep(500);

			driver.findElement(By.xpath("//input[@ng-model=\"record.title_en\"]")).click();
			Thread.sleep(500);
			act.sendKeys("ATE" + i).perform();
			Thread.sleep(500);
			act.sendKeys(Keys.TAB).perform();
			act.sendKeys("ATG" + i).perform();
			Thread.sleep(500);
			act.sendKeys(Keys.TAB).perform();
			act.sendKeys("ADE" + i).perform();
			Thread.sleep(500);
			act.sendKeys(Keys.TAB).perform();
			act.sendKeys("ADG" + i).perform();
			Thread.sleep(500);
			act.sendKeys(Keys.TAB).perform();
			act.sendKeys("AFV" + i).perform();
			Thread.sleep(500);
			driver.findElement(By.xpath("//span[@class=\"custom-file-upload__button ng-binding\"]")).click();

			Thread.sleep(500);
			
			
			
			StringSelection ss = new StringSelection("D:\\sample_firmware_dummy (1).gbl");
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);

			Robot rc = new Robot();
			Thread.sleep(1000);
			rc.keyPress(KeyEvent.VK_CONTROL);
			rc.keyPress(KeyEvent.VK_V);
			Thread.sleep(1000);
			rc.keyRelease(KeyEvent.VK_CONTROL);
			rc.keyRelease(KeyEvent.VK_V);
			Thread.sleep(1000);
			rc.keyPress(KeyEvent.VK_ENTER);
			rc.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//button[text()=\"Submit\"]")).click();
			Thread.sleep(5000);
		}
		
		
		driver.quit();

	}

}
