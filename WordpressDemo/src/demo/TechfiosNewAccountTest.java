package demo;

import java.io.IOException;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import util.BrowserFactory;

public class TechfiosNewAccountTest {

	@Test
	public void NewAccount() throws IOException{
		
		WebDriver driver = BrowserFactory.startBrowser("chrome", "http://techfios.com/test/billing/?ng=login/");
				
		
		TechfiosLoginPage Techfios = PageFactory.initElements(driver, TechfiosLoginPage.class);
		
			
        Techfios.Techfioslogin("techfiosdemo@gmail.com", "abc123");
        
        TechFiosHomePage Homepage = PageFactory.initElements(driver, TechFiosHomePage.class);
        
        Homepage.ClickNewAccount();
        
        TechfiosNewAccountPage Account = PageFactory.initElements(driver, TechfiosNewAccountPage.class);
        
        Account.FillingForm();
       
        driver.close();
       
        driver.quit();

	}

}
