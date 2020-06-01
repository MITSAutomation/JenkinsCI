package stepdefinationpackage;

import org.apache.log4j.Logger;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;


public class stepdefination {
	
	
	
	
	@Given("^User will open Browser$")
	public void user_will_open_Browser()  {
		
		System.setProperty("webdriver.chrome.driver", "C:\\EclipseWorkspace\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
		
		
	    
	}

	
}
