package in.amazon.genericutility;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverutility 
{
	public void click_button(WebDriver driver , WebElement element){
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOf(element)).click();
	}
	
	public void textfield_sendtext(WebDriver driver , WebElement element,String text)
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOf(element)).sendKeys(text);
	}

	public  void moveToElement(WebDriver driver , WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(element));
		Actions actions = new Actions(driver);
		actions.moveToElement(element).perform();
	}
	
	public void Window_id_control_tran(WebDriver driver , WebElement element , int scrollamount ) 
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Set<String> windows = driver.getWindowHandles();
		ArrayList list = new ArrayList(windows);
		driver.switchTo().window((String)list.get(1));
		Actions action = new Actions(driver);
		action.scrollByAmount(0, scrollamount);
		element.click();
	}
	public void List_products_click(WebDriver driver , List<WebElement> element , int index , int scrollamount,WebElement filter)
	{
		JavascriptExecutor jsp = (JavascriptExecutor)driver;
		jsp.executeScript("window.scrollTo(0,"+scrollamount+")");
		filter.click();

		for(int i=0;i<element.size();i++)
		{
			if(i==index) 
			{
				JavascriptExecutor jsp1 = (JavascriptExecutor)driver;
				jsp1.executeScript("window.scrollTo(0,"+scrollamount+")");
				element.get(index).click();
			}
		}

	}
	public void cart_item_quantity_select(WebDriver driver , WebElement element,int index)
	{
				Select select = new Select(element);
				select.selectByIndex(index);
			}
	
	public String getcostvalue(WebElement element){
		return element.getText();
	}

	public void select_delete_product(WebDriver driver, List<WebElement> element, int index,
			int scrollamount) {
		JavascriptExecutor jsp = (JavascriptExecutor)driver;
		jsp.executeScript("window.scrollTo(0,"+scrollamount+")");
		for(int i=0;i<element.size();i++)
		{
			if(i==index) 
			{
				JavascriptExecutor jsp1 = (JavascriptExecutor)driver;
				jsp1.executeScript("window.scrollTo(0,"+scrollamount+")");
			    WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
				 wait.until(ExpectedConditions.stalenessOf(element.get(index)));
				 element.get(index).click();
			}
		}
		
	}
}

