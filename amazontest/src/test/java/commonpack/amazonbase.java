package commonpack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class amazonbase {
	
	public WebDriver driver;
	
	public void lunchbrowser() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2F%3Ftag%3Damazusnavi-20%26hvadid%3D381823327651%26hvpos%3D%26hvnetw%3Dg%26hvrand%3D3210497165576093323%26hvpone%3D%26hvptwo%3D%26hvqmt%3De%26hvdev%3Dc%26hvdvcmdl%3D%26hvlocint%3D%26hvlocphy%3D9004401%26hvtargid%3Dkwd-10573980%26ref%3Dnav_custrec_signin%26hydadcr%3D28883_11845442%26gclid%3DCjwKCAiA2rOeBhAsEiwA2Pl7Q0_BhaxUAZsTlAsXvWzDl3s9AMu1iUUUr-8oldfSSmNHDoJtK23AOxoC8M8QAvD_BwE&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=usflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
		driver.manage().window().maximize();
		
		
	}
	
	
public void lunchbrowser2() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com/ap/signin");
		driver.manage().window().maximize();
		
}	
	public void closebrowser() {
		
		driver.close();
		
		
		
	}
	
	
	
	

}
