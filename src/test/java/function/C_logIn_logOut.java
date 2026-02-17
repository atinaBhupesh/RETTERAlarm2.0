package function;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class C_logIn_logOut extends b_baseClass {

	@FindBy(xpath = "//input[@id=\"u\"]")
	private WebElement userNameField;
	@FindBy(xpath = "//input[@id=\"p\"]")
	private WebElement passwordField;
	@FindBy(xpath = "//button[@id=\"addSubmit\"]")
	private WebElement logInButton;
	@FindBy(xpath = "//a[@href=\"/admin/users/logout\"]")
	private WebElement logOutButton;

	public C_logIn_logOut(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void logInUser(String userName, String password, WebDriver driver) throws Throwable {
		Actions act = new Actions(driver);

		userNameField.click();
		act.sendKeys(userName).build().perform();
//		Thread.sleep(3000);

		passwordField.click();

		act.sendKeys(password).build().perform();

//		Thread.sleep(3000);
		logInButton.click();
//		Thread.sleep(3000);

	}

	public void logOut(WebDriver driver) throws Throwable

	{

		logOutButton.click();
		Thread.sleep(3000);
	}

}
