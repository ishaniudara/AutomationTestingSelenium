package First;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class ListnerMainClass {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		EventFiringWebDriver eventHandler=new EventFiringWebDriver(driver);
		EventCapture ecapture= new EventCapture();
		eventHandler.register(ecapture);
		eventHandler.navigate().to("http://lms.appsc.sab.ac.lk/");
		js.executeScript("window.scrollBy(0,400)");
		Thread.sleep(2000);
		eventHandler.findElement(By.linkText("Go to calender"));
		eventHandler.quit();
		

	}

}
