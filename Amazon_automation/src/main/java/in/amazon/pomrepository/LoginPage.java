package in.amazon.pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage {
	WebDriver driver;

	public  LoginPage(WebDriver driver ) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//a[@data-nav-ref='nav_ya_signin']")
	private WebElement HellosigninAccount ;
	public WebElement getHellosigninAccount()
	{
		return HellosigninAccount;
	}

	@FindBy(xpath="//input[@type='email']")
	private WebElement Emailtextfield ;
	public WebElement getEmailtextfield()
	{
		return Emailtextfield;
	}

	@FindBy(xpath="//input[@class='a-button-input']")
	private WebElement continuebutton ;
	public WebElement getcontinuebutton()
	{
		return continuebutton;
	}

	@FindBy(xpath="//input[@type='password']")
	private WebElement passwordtextfield;
	public WebElement getpasswordtextfield()
	{
		return passwordtextfield;
	}

	@FindBy(xpath="//input[@type='submit']")
	private WebElement loginbutton;
	public WebElement getloginbutton()
	{
		return loginbutton;
	}


	@FindBy(xpath="//a[@aria-label='Open Menu']")
	private WebElement allmenuoptionlink;
	public WebElement getallmenuoptionlink()
	{
		return allmenuoptionlink;
	}

	@FindBy(xpath="//div[@class='nav-sprite hmenu-close-icon']")
	private WebElement allmenuoptionlinkcancel;
	public WebElement getallmenuoptionlinkcancel()
	{
		return allmenuoptionlinkcancel;
	}


	@FindBy(xpath="//*[@id='hmenu-customer-profile']")
	private WebElement hellocustomerprofile;
	public WebElement gethellocustomerprofile()
	{
		return hellocustomerprofile;
	}

	@FindBy(xpath="//span[text()='Sign Out']")
	private WebElement signoutbutton;
	public WebElement getsignoutbutton()
	{
		return signoutbutton;
	}
	@FindBy(xpath="//a[@data-nav-role='signin']")
	private WebElement hellosigninAcoountandlist;
	public WebElement gethellosigninAcoountandlist()
	{

		return hellosigninAcoountandlist;
	}

	@FindBy(css="[class='a-spacing-small']")
	private WebElement SigninText;
	public WebElement getSigninText(){
		return SigninText;
	}


}
