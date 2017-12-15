package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class TechfiosNewAccountPage {

WebDriver driver;
	
	public TechfiosNewAccountPage(WebDriver ldriver){
		
		this.driver=ldriver;
	}


	@FindBy(how=How.ID,using="account")
	WebElement AccountTitle;
	
	@FindBy(how=How.ID,using="description")
	WebElement Description;
	
	
	@FindBy(how=How.ID,using="balance")
	WebElement Balance;
	
	@FindBy(how=How.XPATH,using=".//*[@id='page-wrapper']/div[3]/div[1]/div/div/div[2]/form/button")
	WebElement Submit;
	
	
	public void FillingForm(){
		
	AccountTitle.sendKeys("savings");
	Description.sendKeys("saving for home");
	Balance.sendKeys("1000");
	Submit.click();	
	
	}

}
