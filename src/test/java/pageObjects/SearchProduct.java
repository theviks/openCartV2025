package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchProduct extends BasePage {

	public SearchProduct(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//input[@placeholder='Search']") WebElement searchBar;
	@FindBy(xpath="//button[@class='btn btn-default btn-lg']") WebElement searchBtn;

	
	public void sendValue(String value) {
		searchBar.sendKeys(value);
	}
	
	public void clickSearch() {
		searchBtn.click();
	}
}
