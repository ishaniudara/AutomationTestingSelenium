package First;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		
	}

	@FindBy(how=How.NAME, using="email")
	@CacheLookup
	WebElement username;
	@FindBy(how=How.NAME, using="pass")
	@CacheLookup
	WebElement password;
	@FindBy(how=How.NAME, using="login")
	@CacheLookup
	WebElement login;
	
	public void loginwordpress(String usr, String pass) {
		username.sendKeys(usr);
		password.sendKeys(pass);
		login.click();
		 
	}
	
}
