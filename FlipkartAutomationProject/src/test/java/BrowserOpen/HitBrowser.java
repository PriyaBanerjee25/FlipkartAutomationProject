package BrowserOpen;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import java.util.concurrent.TimeUnit;

//import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.firefox.*;

public class HitBrowser {
	
	public static WebDriver driver;
	  @Test
	  public void f() {
		  driver.navigate().to("https://www.flipkart.com");	
	  }
	  @BeforeClass
	  public void beforeClass() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\priya\\eclipse-workspace\\FlipkartAutomationProject\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
			
	  }
	  @AfterClass
	  public void afterClass() {
		  driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(45, TimeUnit.SECONDS);
		  driver.quit();
	  }


}
