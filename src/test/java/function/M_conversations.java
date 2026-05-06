package function;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.time.Duration;
import java.util.List;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class M_conversations extends b_baseClass {

	@FindBy(xpath = "//a[@href=\"https://admin.retteralarm.de/verify-user?returnUrl=/admin/groups/conversations\"]")
	private WebElement conversationsL;
	@FindBy(xpath = "//a[@href=\"http://admin.testing.retteralarm.de/verify-user?returnUrl=/admin/groups/conversations\"]")
	private WebElement conversationsT;
	@FindBy(xpath = "//button[@class=\"btn-success btn-x30\"]")
	private WebElement manageGroups;
	@FindBy(xpath = "//i[@class=\"ri ri-add-line\"]")
	private WebElement createNew;
	@FindBy(xpath = "//div[@class=\"dx-texteditor-input-container dx-tag-container\"]")
	private WebElement selectStation;
	@FindBy(xpath = "//div[text()=\"Attributes\"]")
	private WebElement userTypeAttribute;
	@FindBy(xpath = "//span[text()=\"Save\"]")
	private WebElement saveChatGroup;
	@FindBy(xpath = "(//td[@role=\"gridcell\"])[4]")
	private WebElement firstItemTitle;
	@FindBy(xpath = "//i[@class=\"dx-icon dx-icon-refresh\"]")
	private WebElement refreshFilter;
	@FindBy(xpath = "//input[@placeholder=\"Search\"]")
	private WebElement searchField;
	@FindBy(xpath = "(//div[@aria-label=\"dropdownbutton\"])[2]")
	private WebElement actionButton;
	@FindBy(xpath = "//dx-button[@class=\"dx-widget dx-button dx-button-mode-text dx-button-normal more-action-button delete-option dx-state-hover\"]")
	private WebElement deleteChat;
	@FindBy(xpath = "//span[text()=\"Yes, Delete\"]")
	private WebElement yesDelete;
	@FindBy(xpath = "(//span[@class=\"dx-checkbox-icon\"])[1]")
	private WebElement selectAll;
	@FindBy(xpath = "//i[@class=\"ri ri-delete-bin-6-line\"]")
	private WebElement deleteAll;

	@FindBy(xpath = "//span[@class=\"dx-datagrid-search-text\" and contains(text(),'BG')]")
	private List<WebElement> availableChatCounts;
	@FindBy(xpath = "//div[@aria-label=\"Items per page: 100\"]")
	private WebElement itemPerPage100;
	@FindBy(xpath = "//span[text()='ChatGroupByAttributeMS']")
	private WebElement chatGroupNameByAttribute;
	@FindBy(xpath = "//textarea[@placeholder=\"Type your message...\"]")
	private WebElement textarea;
	@FindBy(xpath = "//i[@class=\"dx-icon-sendfilled\"]")
	private WebElement sendButton;

	@FindBy(xpath = "//div[text()=\"Resources\"]")
	private WebElement userTypeResource;
	@FindBy(xpath = "//div[text()=\"Alarm loop\"]")
	private WebElement userTypeAlarmLoop;
	@FindBy(xpath = "//div[text()=\"Fire Fighters\"]")
	private WebElement userTypeFireFighter;
	@FindBy(xpath = "(//div[text()=\"Text message sent to the Chat group user created by attribute.\"])[last()]")
	private WebElement textMessageA;
	@FindBy(xpath = "(//div[text()=\"Text message sent to the Chat group user created by resource.\"])[last()]")
	private WebElement textMessageR;
	@FindBy(xpath = "(//div[text()=\"Text message sent to the Chat group user created by alarm loop.\"])[last()]")
	private WebElement textMessageAL;
	@FindBy(xpath = "(//div[text()=\"Text message sent to the Chat group user created by fire fighter.\"])[last()]")
	private WebElement textMessageFF;

	@FindBy(xpath = "(//h2[@_ngcontent-ng-c865457959])[3]")
	private WebElement chatGroupTitle;
	// @FindBy(xpath="") private WebElement ;
	// @FindBy(xpath="") private WebElement ;
	// @FindBy(xpath="") private WebElement ;
	// @FindBy(xpath="") private WebElement ;
	// @FindBy(xpath="") private WebElement ;
	// @FindBy(xpath="") private WebElement ;

	public M_conversations(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void sendMessageToChatGroupCreatedByFireFighter(WebDriver driver, String ChatGroupByFireFighterMS)
			throws Throwable

	{
		Actions act = new Actions(driver);

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		WebElement atrributeGroup = wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//span[normalize-space(text())='" + ChatGroupByFireFighterMS + "']")));

		// hover + click
		act.moveToElement(atrributeGroup).click().perform();

		// check group is open correctly or not
		String expChatGroupName = chatGroupTitle.getText();
		Assert.assertTrue(ChatGroupByFireFighterMS.contains(expChatGroupName), RED + "Message not sent.");
		System.out.println(GREEN + expChatGroupName + " chat group open correctly.");
		Thread.sleep(1000);
		

		// Send message
		Thread.sleep(2000);
		textarea.click();
		Thread.sleep(1000);
		String messageText = "Text message sent to the Chat group user created by fire fighter.";
		act.sendKeys(messageText).perform();
		Thread.sleep(1000);
		sendButton.click();
		Thread.sleep(1000);
		String expTextmessage = textMessageFF.getText();

		Assert.assertTrue(messageText.contains(expTextmessage), RED + "Message not sent.");

		System.out.println(GREEN + messageText + " sent successfuly ");
		Thread.sleep(1000);

	}

	public void sendMessageToChatGroupCreatedByAlarmLoop(WebDriver driver, String ChatGroupByAlarmLoopMS)
			throws Throwable

	{
		Actions act = new Actions(driver);

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		WebElement atrributeGroup = wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//span[normalize-space(text())='" + ChatGroupByAlarmLoopMS + "']")));

		// hover + click
		act.moveToElement(atrributeGroup).click().perform();

		// check group is open correctly or not
		String expChatGroupName = chatGroupTitle.getText();
		Assert.assertTrue(ChatGroupByAlarmLoopMS.contains(expChatGroupName), RED + "Message not sent.");
		System.out.println(GREEN + expChatGroupName + " chat group open correctly.");
		Thread.sleep(1000);

		// Send message
		Thread.sleep(2000);
		textarea.click();
		Thread.sleep(1000);
		String messageText = "Text message sent to the Chat group user created by alarm loop.";
		act.sendKeys(messageText).perform();
		Thread.sleep(1000);
		sendButton.click();
		Thread.sleep(1000);
		String expTextmessage = textMessageAL.getText();

		Assert.assertTrue(messageText.contains(expTextmessage), RED + "Message not sent.");

		System.out.println(GREEN + messageText + " sent successfuly ");
		Thread.sleep(1000);

	}

	public void sendMessageToChatGroupCreatedByResource(WebDriver driver, String ChatGroupByResourceMS) throws Throwable

	{
		Actions act = new Actions(driver);

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		WebElement atrributeGroup = wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//span[normalize-space(text())='" + ChatGroupByResourceMS + "']")));

		// hover + click
		act.moveToElement(atrributeGroup).click().perform();

		// check group is open correctly or not
		String expChatGroupName = chatGroupTitle.getText();
		Assert.assertTrue(ChatGroupByResourceMS.contains(expChatGroupName), RED + "Message not sent.");
		System.out.println(GREEN + expChatGroupName + " chat group open correctly.");
		Thread.sleep(1000);

		// Send message

		Thread.sleep(2000);
		textarea.click();
		Thread.sleep(1000);
		String messageText = "Text message sent to the Chat group user created by resource.";
		act.sendKeys(messageText).perform();
		Thread.sleep(1000);
		sendButton.click();
		Thread.sleep(1000);
		String expTextmessage = textMessageR.getText();

		Assert.assertTrue(messageText.contains(expTextmessage), RED + "Message not sent.");

		System.out.println(GREEN + messageText + " sent successfuly ");
		Thread.sleep(1000);

	}

	public void sendMessageToChatGroupCreatedByAttribute(WebDriver driver, String ChatGroupByAttributeMS)
			throws Throwable

	{
		Actions act = new Actions(driver);

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		WebElement atrributeGroup = wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//span[normalize-space(text())='" + ChatGroupByAttributeMS + "']")));

		// hover + click
		act.moveToElement(atrributeGroup).click().perform();

		// check group is open correctly or not
		String expChatGroupName = chatGroupTitle.getText();
		Assert.assertTrue(ChatGroupByAttributeMS.contains(expChatGroupName), RED + "Message not sent.");
		System.out.println(GREEN + expChatGroupName + " chat group open correctly.");
		Thread.sleep(1000);

		// Send message
		Thread.sleep(2000);
		textarea.click();
		Thread.sleep(1000);
		String messageText = "Text message sent to the Chat group user created by attribute.";
		act.sendKeys(messageText).perform();
		Thread.sleep(1000);
		sendButton.click();
		Thread.sleep(1000);
		String expTextmessage = textMessageA.getText();

		Assert.assertTrue(messageText.contains(expTextmessage), RED + "Message not sent.");

		System.out.println(GREEN + messageText + " sent successfuly ");
		Thread.sleep(1000);

	}

	public void createChatFroupByFireFighterMS(WebDriver driver, String st01N, String st02N, String gTodaysDate,
			String gtimeHHMMSS, String st01FF1, String st02FF1, String filePath) throws Throwable

	{
		Actions act = new Actions(driver);
		manageGroups.click();
		Thread.sleep(2000);
		refreshFilter.click();
		Thread.sleep(1000);
		createNew.click();
		Thread.sleep(2000);
		selectStation.click();
		Thread.sleep(2000);
		act.sendKeys(st01N).perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(500);
		act.sendKeys(st02N).perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(500);
		act.sendKeys(Keys.TAB).perform();
		Thread.sleep(500);
		String title = "BG-chatGroupByFireFighter" + gTodaysDate + "_" + gtimeHHMMSS;
		act.sendKeys(title).perform();
		Thread.sleep(500);

		userTypeFireFighter.click();
		Thread.sleep(2000);
		act.sendKeys(Keys.TAB).perform();
		Thread.sleep(500);
		act.sendKeys(st01FF1).perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(500);
		act.sendKeys(Keys.TAB).perform();
		Thread.sleep(500);
		act.sendKeys(st02FF1).perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(500);
		act.sendKeys(Keys.TAB).perform();
		Thread.sleep(500);
		saveChatGroup.click();
		Thread.sleep(3000);

		FileInputStream in = new FileInputStream(filePath);
		XSSFWorkbook wb = new XSSFWorkbook(in);
		XSSFSheet sheet = wb.getSheetAt(0);

		Row row = sheet.createRow(41); // 41
		row.createCell(1).setCellValue(title);
		in.close();

		FileOutputStream out = new FileOutputStream(filePath);
		wb.write(out);
		out.close();
		wb.close();

		String expectedTitle = firstItemTitle.getText();

		Assert.assertTrue(title.contains(expectedTitle), RED + "Chat group not added.");

		System.out.println(GREEN + title);

	}

	public void createChatFroupByAlarmLoopsMS(WebDriver driver, String st01N, String st02N, String gTodaysDate,
			String gtimeHHMMSS, String st01Al1, String st02Al1, String filePath) throws Throwable

	{

		Actions act = new Actions(driver);
		manageGroups.click();
		Thread.sleep(2000);
		refreshFilter.click();
		Thread.sleep(1000);
		createNew.click();
		Thread.sleep(2000);
		selectStation.click();
		Thread.sleep(2000);
		act.sendKeys(st01N).perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(500);
		act.sendKeys(st02N).perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(500);
		act.sendKeys(Keys.TAB).perform();
		Thread.sleep(500);
		String title = "BG-chatGroupByAlarmLoops" + gTodaysDate + "_" + gtimeHHMMSS;
		act.sendKeys(title).perform();
		Thread.sleep(500);

		userTypeAlarmLoop.click();
		Thread.sleep(2000);
		act.sendKeys(Keys.TAB).perform();
		Thread.sleep(500);
		act.sendKeys(st01Al1).perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(500);
		act.sendKeys(Keys.TAB).perform();
		Thread.sleep(500);
		act.sendKeys(st02Al1).perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(500);
		act.sendKeys(Keys.TAB).perform();
		Thread.sleep(500);
		saveChatGroup.click();
		Thread.sleep(3000);

		FileInputStream in = new FileInputStream(filePath);
		XSSFWorkbook wb = new XSSFWorkbook(in);
		XSSFSheet sheet = wb.getSheetAt(0);

		Row row = sheet.createRow(40); // 41
		row.createCell(1).setCellValue(title);
		in.close();

		FileOutputStream out = new FileOutputStream(filePath);
		wb.write(out);
		out.close();
		wb.close();

		String expectedTitle = firstItemTitle.getText();

		Assert.assertTrue(title.contains(expectedTitle), RED + "Chat group not added.");

		System.out.println(GREEN + title);

	}

	public void createChatFroupByResourceMS(WebDriver driver, String st01N, String st02N, String gTodaysDate,
			String gtimeHHMMSS, String st01R1, String st02R1, String filePath) throws Throwable

	{
		Actions act = new Actions(driver);
		manageGroups.click();
		Thread.sleep(2000);
		refreshFilter.click();
		Thread.sleep(1000);
		createNew.click();
		Thread.sleep(2000);
		selectStation.click();
		Thread.sleep(2000);
		act.sendKeys(st01N).perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(500);
		act.sendKeys(st02N).perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(500);
		act.sendKeys(Keys.TAB).perform();
		Thread.sleep(500);
		String title = "BG-chatGroupByResource" + gTodaysDate + "_" + gtimeHHMMSS;
		act.sendKeys(title).perform();
		Thread.sleep(500);

		userTypeResource.click();
		Thread.sleep(2000);
		act.sendKeys(Keys.TAB).perform();
		Thread.sleep(500);
		act.sendKeys(st01R1).perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(500);
		act.sendKeys(Keys.TAB).perform();
		Thread.sleep(500);
		act.sendKeys(st02R1).perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(500);
		act.sendKeys(Keys.TAB).perform();
		Thread.sleep(500);
		saveChatGroup.click();
		Thread.sleep(3000);

		FileInputStream in = new FileInputStream(filePath);
		XSSFWorkbook wb = new XSSFWorkbook(in);
		XSSFSheet sheet = wb.getSheetAt(0);

		Row row = sheet.createRow(39); // 40
		row.createCell(1).setCellValue(title);
		in.close();

		FileOutputStream out = new FileOutputStream(filePath);
		wb.write(out);
		out.close();
		wb.close();

		String expectedTitle = firstItemTitle.getText();

		Assert.assertTrue(title.contains(expectedTitle), RED + "Chat group not added.");

		System.out.println(GREEN + title);

	}

	public void createChatFroupByAttributeMS(WebDriver driver, String st01N, String st02N, String gTodaysDate,
			String gtimeHHMMSS, String st01A1, String st02A1, String filePath) throws Throwable

	{
		Actions act = new Actions(driver);
		manageGroups.click();
		Thread.sleep(2000);
		refreshFilter.click();
		Thread.sleep(1000);
		createNew.click();
		Thread.sleep(2000);
		selectStation.click();
		Thread.sleep(2000);
		act.sendKeys(st01N).perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(500);
		act.sendKeys(st02N).perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(500);
		act.sendKeys(Keys.TAB).perform();
		Thread.sleep(500);
		String title = "BG-chatGroupByAttribute" + gTodaysDate + "_" + gtimeHHMMSS;
		act.sendKeys(title).perform();
		;
		Thread.sleep(500);
		userTypeAttribute.click();
		Thread.sleep(2000);
		act.sendKeys(Keys.TAB).perform();
		Thread.sleep(500);
		act.sendKeys(st01A1).perform();
		;
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(500);
		act.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).build().perform();
		Thread.sleep(500);
		act.sendKeys(st02A1).perform();
		;
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(500);
		act.sendKeys(Keys.TAB).perform();
		Thread.sleep(500);
		saveChatGroup.click();
		Thread.sleep(3000);

		FileInputStream in = new FileInputStream(filePath);
		XSSFWorkbook wb = new XSSFWorkbook(in);
		XSSFSheet sheet = wb.getSheetAt(0);

		Row row = sheet.createRow(38); // 39
		row.createCell(1).setCellValue(title);
		in.close();

		FileOutputStream out = new FileOutputStream(filePath);
		wb.write(out);
		out.close();
		wb.close();

		String expectedTitle = firstItemTitle.getText();

		Assert.assertTrue(title.contains(expectedTitle), RED + "Chat group not added.");

		System.out.println(GREEN + title);

	}

	public void deleteChatGroups(WebDriver driver) throws Throwable {
		Actions act = new Actions(driver);
		manageGroups.click();
		Thread.sleep(2000);
		refreshFilter.click();
		Thread.sleep(1000);
		itemPerPage100.click();
		Thread.sleep(1000);
		searchField.click();
		act.sendKeys("BG").perform();
		Thread.sleep(2000);

		int chatgroups = 0;

		for (int batch = 1; batch <= 15; batch++) {
			int count = availableChatCounts.size();

			if (count == 0) {
				break;
			}

			System.out.println("The iteration-" + batch + " still ongoing, please wait.");

			selectAll.click();
			Thread.sleep(1000);
			deleteAll.click();
			Thread.sleep(1000);
			yesDelete.click();
			Thread.sleep(2000);

			driver.navigate().refresh();
			Thread.sleep(2000);

			chatgroups += count;
		}

		System.out.println("The iteration has been completed.");
		System.out.println(GREEN + "Total >>>>>" + chatgroups + "<<<<< chat groups deleted successfully.");

		refreshFilter.click();
		Thread.sleep(2000);

	}

	public void commonForChatGroup(WebDriver driver, String branchName) throws Throwable {
		switch (branchName) {
		case "1": {

			conversationsL.click();
			break;

		}
		case "2": {
			conversationsT.click();
			break;
		}
		case "3": {

			break;

		}

		}
		Thread.sleep(5000);

	}

}
