package First;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG {

	public String baseUrl="https://www.facebook.com/";
	String driverpath= "C:\\selenium\\chromedriver.exe";
	public WebDriver driver;
	
	@Test
	public void verifyhomepage() {
		System.setProperty("webdriver.chrome.driver",driverpath);
		
		driver=new ChromeDriver();
		driver.get(baseUrl);
		String title="ishani udara";
		String atitle=driver.getTitle();
		Assert.assertEquals(title, atitle);
		driver.close();
	}
	
}
