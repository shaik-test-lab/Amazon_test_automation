package in.amazon.pomrepository;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_page_product {
WebDriver driver;
Home_page_product(WebDriver driver){
	this.driver = driver;
	PageFactory.initElements(driver,this);
}
@FindBy(css = "input[aria-label='Search Amazon.in']")
private WebElement search_textfield;

@FindBy(css = "input[id='nav-search-submit-button']")
private WebElement search_TXT_button;

@FindBy(xpath = "//a[contains(@data-csa-c-slot-id,'nav_cs')]")
private List<WebElement> menubar;

@FindBy(xpath = "//div[contains(@class,'nav-search-scope nav-sprite')]")
private WebElement AllDropdown;
}
