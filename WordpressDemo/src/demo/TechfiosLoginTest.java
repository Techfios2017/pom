package demo;

import java.io.IOException;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import util.BrowserFactory;

public class TechfiosLoginTest {

	@Test
	public void TechfiosloginTest() throws IOException{
		
		WebDriver driver = BrowserFactory.startBrowser("chrome", "http://techfios.com/test/billing/?ng=login/");
				
		
		TechfiosLoginPage Techfios = PageFactory.initElements(driver, TechfiosLoginPage.class);
		
			
        Techfios.Techfioslogin("techfiosdemo@gmail.com", "abc123");
        
        driver.close();
        driver.quit();
		
		
	}


}
