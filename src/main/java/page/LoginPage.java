package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
	WebDriver driver;

	// Every Page must have a constructor to invite the driver
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	// Element Library
	@FindBy(how = How.ID, using = "username")
	WebElement UserName;
	@FindBy(how = How.ID, using = "password")
	WebElement Password;
	@FindBy(how = How.NAME, using = "login")
	WebElement SignInButton;

	// Methods to interact with the elements
	public void login(String userName, String password) throws InterruptedException {
		UserName.sendKeys(userName);
		Thread.sleep(1000);
		Password.sendKeys(password);
		Thread.sleep(1000);
		SignInButton.click();
		Thread.sleep(3000);
	}

	public String getPageTitle() {
		return driver.getTitle();
	}
}
