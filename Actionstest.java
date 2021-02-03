package First;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Actionstest {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.edureka.co/");
		Actions builder=new Actions(driver);
		builder.moveToElement(driver.findElement(By.id("dropdown dropdown_category_list"))).build().perform();
		Thread.sleep(3000);
		WebElement search=driver.findElement(By.id("search-input"));
		builder.moveToElement(search).build().perform();
		Thread.sleep(3000);
		WebElement click=driver.findElement(By.id("search-input"));
		builder.moveToElement(click);
		Thread.sleep(1000);
		Action seriosofactions;
		seriosofactions= builder.sendKeys(search,"slenium").keyDown(search, Keys.SHIFT).keyUp(click, Keys.SHIFT).build();
		seriosofactions.perform();
		
		
		
	}

}
