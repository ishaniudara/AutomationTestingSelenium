package First;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElements {

	public static void main(String[] args)throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		Thread.sleep(4000);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 11");
		Thread.sleep(4000);
		driver.findElement(By.id("nav-search-submit-button")).click();
		// TODO Auto-generated method stub

	}

}
