package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath="//a[@title='My Account']") WebElement myAccount;
	@FindBy(xpath="//a[normalize-space()='Register']") WebElement register;
	@FindBy(xpath="//a[normalize-space()='Login']") WebElement Login;
	
	public void clickAccount() {
		myAccount.click();
	}

	public void cilckRegister() {
		register.click();
	}
	
	public void clickLogin() {
		Login.click();
	}
}
