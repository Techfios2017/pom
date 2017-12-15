package demo;

import org.junit.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class TechfiosLoginPage {
	
	WebDriver driver;
	
	public TechfiosLoginPage(WebDriver ldriver){
		
		this.driver=ldriver;
	}
	
	@FindBy(how=How.ID,using="username")
	WebElement username;
	
	@FindBy(how=How.ID,using="password")
	WebElement password;
	
	@FindBy(how=How.XPATH, using="//button[starts-with(@class,'btn btn-success block full-width')]")
	WebElement submit_button;
	
	
	
	
	public void Techfioslogin(String uName, String pWord){
		
		username.sendKeys(uName);
		password.sendKeys(pWord);
		submit_button.click();
	}
	
    
}
