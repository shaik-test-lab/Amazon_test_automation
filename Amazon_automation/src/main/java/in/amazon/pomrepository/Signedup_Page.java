package in.amazon.pomrepository;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Signedup_Page {
	WebDriver driver;

	public  Signedup_Page(WebDriver driver ) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//input[contains(@placeholder,'Search')]")
	private WebElement search_textfield ;
	public WebElement getsearch_textfield()
	{

		return search_textfield;
	}

	@FindBy(xpath ="//span[@data-component-type='s-product-image']/a")
	private List<WebElement> mousewirelesspagelinks ;
	public List<WebElement> getmousewirelesspagelinks()
	{

		return mousewirelesspagelinks;
	}

	@FindBy(xpath ="//a[@id='nav-cart']")
	private WebElement carticon ;
	public WebElement getcarticon()
	{

		return carticon;
	}

	@FindBy(css = "input[id='nav-search-submit-button']")
	private WebElement search_TXT_button ;
	public WebElement getsearch_TXT_button()
	{

		return search_TXT_button;
	}
	@FindBy(xpath = "//span[text()='₹1,000 - ₹5,000']")
	private WebElement price_filter;
	public WebElement getPrice_filter(){
		return price_filter;
	}
	
	
}