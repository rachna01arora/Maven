package mavenexample;

import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class example {
	WebDriver driver;
	
  @Test
  public void openURL(){
 System.setProperty("webdriver.chrome.driver", "D:\\Automation\\chromedriver_win32\\chromedriver.exe");
	  //System.setProperty("webdriver.gecko.driver", "D:\\Automation\\geckodriver-v0.23.0-win64\\geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
	 driver = new ChromeDriver();
	 driver.manage().window().maximize();
     driver.get("http://learn-automation.com/");
	 driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	 driver.close();
  }
}

