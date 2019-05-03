package mavenexample;

import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Mavensampletest {
	WebDriver driver;
	
  @Test
  public void openURL(){
  System.setProperty("webdriver.chrome.driver", "D:\\Automation\\chromedriver_win32\\chromedriver.exe");
	 driver = new ChromeDriver();
	//ChromeOptions options = new ChromeOptions();  
    //options.addArguments("test-type");
    //options.addArguments("--disable-extensions");
    //driver = new ChromeDriver(options);
   // caps.setCapability("browser_version", "54.0.2840.87");
	 //extra
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20,  TimeUnit.SECONDS);
     
	  driver.get("http://learn-automation.com/");
	
		System.out.println(driver.getTitle());
		driver.close();
  }
}

