package in.amazon.genericutility;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import in.amazon.pomrepository.LoginPage;
import in.amazon.pomrepository.Product;
import in.amazon.pomrepository.Signedup_Page;

public class BaseClass {
	public WebDriver driver;
	public FileUtility filedata;
	public WebDriverutility webelement;
	public LoginPage pom_login;
	public  Signedup_Page pom_signedup;
	public Product pom_Product;
	public ExcelUtility ExcelUtils;
	

	@BeforeMethod
	public void driver_execution() throws Throwable{
		filedata = new FileUtility();
		String value = filedata.read_data_signup_prop("browser");
		if(value.equals("chrome"))
		{
			driver = new ChromeDriver();
		}
		else if(value.equals("edge"))
		{
			driver = new EdgeDriver();
		}
		else if(value.equals("firefox"))
		{
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.get(filedata.read_data_signup_prop("mainurl"));

		String actual_title =driver.getTitle();
		String expected_title = filedata.read_data_signup_prop("mainpagetitle");
		if(actual_title.equals(expected_title))
		{
			Reporter.log("validation upon the home page is passed");
			}
		else{
			Reporter.log("validation upon the homepage is failed");
			}
		webelement = new WebDriverutility();
		pom_login =  new LoginPage(driver);
		pom_signedup = new Signedup_Page(driver);
		ExcelUtils = new ExcelUtility();
		webelement.click_button(driver,pom_login.getHellosigninAccount());
		webelement.textfield_sendtext(driver,pom_login.getEmailtextfield(),filedata.read_data_signup_prop("username"));
		webelement.click_button(driver, pom_login.getcontinuebutton());
		webelement.textfield_sendtext(driver,pom_login.getpasswordtextfield(),filedata.read_data_signup_prop("password"));
		webelement.click_button(driver, pom_login.getloginbutton());
	}
	@AfterMethod
	public void driver_terminate() throws Throwable{
		webelement.moveToElement(driver,pom_login.gethellosigninAcoountandlist());
		webelement.click_button(driver,pom_login.getsignoutbutton());
		driver.navigate().refresh();
		driver.navigate().back();
		driver.manage().window().minimize();
		
	}

}
