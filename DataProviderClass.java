package First;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderClass {
	
	@Test(dataProvider="testData")
	public void test1(String uname, String pass) {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(uname);
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(pass);

		
	}
	@DataProvider(name="testData")
	public Object[][] feedData(){
		Object[][] object= new Object[1][2];
		object[0][0]="ishani@gmail.com";
		object[0][1]="1124";
		return object;
		
	}

}
