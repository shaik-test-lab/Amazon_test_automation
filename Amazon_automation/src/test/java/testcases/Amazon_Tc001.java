package testcases;
import java.io.File;
import java.time.LocalDateTime;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;
import in.amazon.genericutility.BaseClass;
import in.amazon.pomrepository.Product;

public class Amazon_Tc001 extends BaseClass {
	@Test
	public void AM001() throws Throwable{
			webelement.click_button(driver,pom_signedup.getsearch_textfield());
			webelement.textfield_sendtext(driver,pom_signedup.getsearch_textfield(),ExcelUtils.readStrinDataFromExcel("mouse_product",1,1));
			webelement.click_button(driver,pom_signedup.getsearch_TXT_button());
			webelement.List_products_click(driver,pom_signedup.getmousewirelesspagelinks(),2,70,pom_signedup.getPrice_filter());
			WebElement element = driver.findElement(By.xpath("//span[@data-component-type='s-product-image']/a"));
			File tempfile = element.getScreenshotAs(OutputType.FILE);
			String timestamp = LocalDateTime.now().toString().replace(':', '-');
			File file = new File("./Element_screenshot/all products"+timestamp+".png");
			FileUtils.copyFile(tempfile, file);
			pom_Product = new Product(driver);
			webelement.Window_id_control_tran(driver,pom_Product.getAddtocartbutton(),700);
			webelement.click_button(driver,pom_Product.getcartbutton());
			String cost1 = webelement.getcostvalue(pom_Product.getcost());
		    webelement.cart_item_quantity_select(driver,pom_Product.getquantitydropdown(),2);
		    String cost2 = webelement.getcostvalue(pom_Product.getcost());
		    if(cost1.equals(cost2)){
		    	
		    	Reporter.log("total cost increased from "+cost1+"to"+cost2);
		    }
		    else {
		    	Reporter.log("quantity not increased, check once");
		    }
		    webelement.select_delete_product(driver,pom_Product.get_deletebutton(),0,0);

	}	
}


