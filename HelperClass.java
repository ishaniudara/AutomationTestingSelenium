package First;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;

public class HelperClass {

	public static WebDriver driver;
	Browser b;
	public HelperClass() {}
	
	@BeforeMethod
	public void beforeMethod() {
		HelperClass.driver=Browser.getDriver();
	}
	
	
	
}
