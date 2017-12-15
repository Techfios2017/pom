package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TechfiosProductForm {

WebDriver driver;
	
	public TechfiosProductForm(WebDriver ldriver){
		
		this.driver=ldriver;
	}


	@FindBy(how=How.ID,using="name")
	WebElement Name;

	@FindBy(how=How.ID,using="sales_price")
	WebElement SalesPrice;

	@FindBy(how=How.ID,using="item_number")
	WebElement ItemNumber;

	@FindBy(how=How.ID,using="description")
	WebElement Description;

	@FindBy(how=How.ID,using="submit")
	WebElement Button;
	
	public void FillingProductForm() throws InterruptedException{
	
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	Thread.sleep(10000);	
	
	WebDriverWait wait=new WebDriverWait(driver, 20);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("name")));
	
	Name.sendKeys("CellPhone");	
	SalesPrice.sendKeys("700");
	ItemNumber.sendKeys("145");
	Description.sendKeys("Samsung");
	
	Button.click();	
		
		
	}
	
	
	
}
