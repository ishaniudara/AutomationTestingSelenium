package First;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners(JyperionListener.class)
public class TestCase extends HelperClass {

	@Test
	public void loginto() {
		driver.get("https://www.facebook.com/");
		System.out.println("fddfgf");
		LoginPage loginpage=PageFactory.initElements(driver, LoginPage.class);
		loginpage.loginwordpress("ishaniudra94@gmail.com","1234");
		
	}
	
	
}
