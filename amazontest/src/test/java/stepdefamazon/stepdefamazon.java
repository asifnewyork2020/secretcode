package stepdefamazon;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import commonpack.amazonbase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageobjectamazon.pageobamaz;

public class stepdefamazon extends amazonbase {
	
   pageobamaz hi;
	
	@Given("I am on Amazon homepage")
	public void i_am_on_amazon_homepage() {
		
		lunchbrowser();
		
		//WebDriverManager.chromedriver().setup();
		//driver = new ChromeDriver();
		//driver.get("https://www.amazon.com/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2Fref%3Dnav_custrec_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=usflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
		//driver.manage().window().maximize();
		
		
	    
	}

	@When("I put my {string}")
	public void i_put_my(String emailid) { 
		
		//WebElement putemail;
		//putemail = driver.findElement(By.xpath("//input[@id=\"ap_email\"]"));
		//putemail.sendKeys(emailid);
		
		hi = new pageobamaz(driver);
				hi.enteremail(emailid);
				
				
	    
	}

	@When("I click on continue button")
	public void i_click_on_continue_button() {
		
		//WebElement clickemail;
		//clickemail = driver.findElement(By.xpath("//input[@id=\"continue\"]"));
		//clickemail.click();
		
	    hi.clickit();;
		
	}

	@When("I am on amazon password page")
	public void i_am_on_amazon_password_page() {
		
		//driver.get("https://www.amazon.com/ap/signin");
		//driver.manage().window().maximize();
		
		lunchbrowser2();
		
	}
	    
	

	@Then("I am putting my {string}")
	public void i_am_putting_my(String pass) {
		
		//WebElement pass1;
		//pass1 = driver.findElement(By.xpath("//input[@id=\"ap_password\"]"));
		//pass1.sendKeys(pass);
		hi = new pageobamaz(driver);
		hi.passcode(pass);
	    
	}

	@Then("I click on sign in button")
	public void i_click_on_sign_in_button() {
		
		//WebElement clickpassbutton;
		//clickpassbutton = driver.findElement(By.xpath("//input[@id=\"signInSubmit\"]"));
		//clickpassbutton.submit();
		
		hi.clickit();
		
	    
	}

}
