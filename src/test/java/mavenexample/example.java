package mavenexample;

import org.testng.annotations.Test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class example {
	WebDriver driver;
	
	@Test
	public void logintest(){
		
		ExtentHtmlReporter reporter=new ExtentHtmlReporter("./Reports/report.html");
		reporter.setAppendExisting(true);
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(reporter);
		ExtentTest logger=extent.createTest("LoginTest");
		
		logger.log(Status.INFO, "Login to amazon");
		   
	    logger.log(Status.PASS, "Title verified");
	   // logger.log(Status.FAIL, "Title is not verified");
	    extent.flush();
	    
	    
//ExtentTest logger2=extent.createTest("Logoff Test");
	    
	   // logger2.log(Status.FAIL, "Title verified");
	    
	    
            // This will add another test in report
	    extent.flush();
	    	
	}
	
  @Test
  public void openURL(){
 System.setProperty("webdriver.chrome.driver", "D:\\Automation\\chromedriver_win32\\chromedriver.exe");
	  //System.setProperty("webdriver.gecko.driver", "D:\\Automation\\geckodriver-v0.23.0-win64\\geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
	 driver = new ChromeDriver();
	 driver.manage().window().maximize();
     driver.get("http://learn-automation.com/");
     logintest();
	 driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	 driver.close();
  }
}

