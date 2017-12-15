package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class TechFiosHomePage {

WebDriver driver;
	
	public TechFiosHomePage(WebDriver ldriver){
		
		this.driver=ldriver;
	}

	
	@FindBy(how=How.XPATH, using="//span[@class='nav-label' and text()='Bank & Cash']")
	WebElement BankAndCash;
	
	@FindBy(how=How.XPATH, using="//a[@href='http://techfios.com/test/billing/?ng=accounts/add/' and text()='New Account']")
	WebElement NewAccount;
	
	@FindBy(how=How.XPATH, using=".//*[@id='side-menu']/li[6]/a/span[1]")
	WebElement ProductServices;
	
	@FindBy(how=How.XPATH, using=".//*[@id='side-menu']/li[6]/ul/li[2]/a")
	WebElement NewProduct;
	
	@FindBy(how=How.XPATH, using=".//*[@id='side-menu']/li[2]/a/span[1]")
	WebElement Crm;
	
	@FindBy(how=How.XPATH, using=".//*[@id='side-menu']/li[2]/ul/li[1]/a")
	WebElement AddContacts;
	
	public void ClickNewAccount(){
		
	BankAndCash.click();
	NewAccount.click();		
		
	}

	public void ClickNewProduct(){
		
		ProductServices.click();
		NewProduct.click();		
			
	}

	public void ClickAddContacts(){
		
		Crm.click();
		AddContacts.click();
	}
	
}
