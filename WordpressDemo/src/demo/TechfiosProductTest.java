package demo;

import java.io.IOException;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import util.BrowserFactory;

public class TechfiosProductTest {


	@Test
	public void NewProduct() throws InterruptedException{
		
		WebDriver driver = BrowserFactory.startBrowser("chrome", "http://techfios.com/test/billing/?ng=login/");
				
		
		TechfiosLoginPage Techfios = PageFactory.initElements(driver, TechfiosLoginPage.class);
		
			
        Techfios.Techfioslogin("techfiosdemo@gmail.com", "abc123");
        
        TechFiosHomePage Homepage = PageFactory.initElements(driver, TechFiosHomePage.class);
        
        Homepage.ClickNewProduct();    
       
        TechfiosProductForm Product = PageFactory.initElements(driver, TechfiosProductForm.class);
        
        Product.FillingProductForm();
        
        driver.close();
       
        driver.quit();

	}












}
