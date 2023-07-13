package in.amazon.pomrepository;



import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Product {
	WebDriver driver;

	public Product(WebDriver driver ) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath ="(//select[@id='quantity'])[1]")
	private WebElement quantitydropdown ;
	public WebElement getquantitydropdown()
	{
		return quantitydropdown;
	}
	@FindBy(xpath="//div[contains(text(),'Proceed to Buy')]/../../../../../..//span[@class='a-size-medium a-color-base sc-price sc-white-space-nowrap']")
	private WebElement totalcost;
	public WebElement getcost(){
		return totalcost;
	}

	@FindBy(xpath ="//input[@value='Add to Cart']")
	private WebElement Addtocartbutton ;
	public WebElement getAddtocartbutton()
	{

		return Addtocartbutton;
	}

	@FindBy(xpath ="//input[@aria-labelledby ='attach-sidesheet-view-cart-button-announce' ]")
	private WebElement cartbutton ;
	public WebElement getcartbutton()
	{

		return cartbutton;
	}
	@FindBy(xpath ="//input[@value='Delete']")
	private List<WebElement> deletebutton ;
	public List<WebElement> get_deletebutton()
	{
        
		return deletebutton;
	}



}

