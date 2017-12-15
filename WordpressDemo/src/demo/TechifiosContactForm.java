package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class TechifiosContactForm {

WebDriver driver;
	
	public TechifiosContactForm(WebDriver ldriver){
		
		this.driver=ldriver;
	}

	@FindBy(how=How.ID,using="name")
	WebElement Name;

	@FindBy(how=How.ID,using="company")
	WebElement Company;

	@FindBy(how=How.ID,using="email")
	WebElement Email;
	
	@FindBy(how=How.ID,using="phone")
	WebElement Phone;
	
	@FindBy(how=How.ID,using="address")
	WebElement Adress;
	
	@FindBy(how=How.ID,using="state")
	WebElement State;
	
	@FindBy(how=How.ID,using="zip")
	WebElement Zip;
    
	@FindBy(how=How.ID,using="submit")
	WebElement Submit;


   public void FillContactForm(){
	   
	   Name.sendKeys("John");
	   Company.sendKeys("LockheedMartin");
	   Email.sendKeys("John@lockheedmartin.com");
	   Phone.sendKeys("718860679");
	   Adress.sendKeys("103-11,Dallas");
	   State.sendKeys("Texas");
	   Zip.sendKeys("75062");
	   Submit.click();	   
	   
	   
   }



}

  