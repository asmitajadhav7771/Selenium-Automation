package ActualTestCase;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

public class LoginButtonTest {
	public static WebDriver driver = null;
	public static String browser = "chrome";
	public static void main(String[] args) throws Exception {
		String expected_url = "https://demowebshop.tricentis.com/";
		
		if(browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("Edge")) {
			driver = new EdgeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("safari")) {
			driver = new SafariDriver();
		}
		else if(browser.equalsIgnoreCase("internetExplorer")) {
			 driver = new InternetExplorerDriver();
		}
		else {
			 driver = new ChromeDriver();
		}
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
	    List<WebElement> login = driver.findElements(By.className("ico-lohin"));
	    if(login.size()>0) {
	    	System.out.println("Login element is present");
	    	if(login.get(0).isEnabled()) {
	    		System.out.println("login link is enable and Test Case pass");
	    		
	    	}
	    	else {
	    		driver.quit();
	    		throw new Exception("login link is not enable a Test Case Fail");
	    	}
	    }
	    else {
	    	driver.quit();
	    	throw new Exception("Login element is not present and Test Case Fail");
	    }
	    driver.quit();	
}
}

