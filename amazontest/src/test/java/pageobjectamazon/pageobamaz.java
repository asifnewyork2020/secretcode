package pageobjectamazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pageobamaz {

	WebDriver driver;
	
	public pageobamaz(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}

	
	@FindBy(id="ap_email")
	WebElement putemail;
	public void enteremail(String string) {
		
		putemail.sendKeys(string);
	
		
		
	}
	
	@FindBy(id="ap_password")
    WebElement pass;
	public void passcode(String string1) {
		
		pass.sendKeys(string1);
		
	}
	
	@FindBy(id="signInSubmit")
	WebElement click;
	public void clickit() {
		click.submit();
	}
	
	
}
