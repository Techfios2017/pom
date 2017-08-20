package demo;

import java.io.IOException;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


import util.BrowserFactory;

public class LoginTest {

	
	
	@Test
	public void loginTest() throws IOException{
		
		WebDriver driver = BrowserFactory.startBrowser("chrome", "http://demosite.center/wordpress/wp-login.php?loggedout=true");
				
		
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		
			
		loginPage.login_demo("admin", "demo123");
		
		
		Homepage home = PageFactory.initElements(driver, Homepage.class);
		
		home.publish();
		home.validatehomepage();
		
			
	
	}
}
