package ActualTestCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Verifypage {
public static WebDriver driver = null;
public static String browser = "internet";
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
	String actual_url = driver.getCurrentUrl();
	System.out.println(actual_url);
	if(expected_url.equalsIgnoreCase(actual_url)) {
		System.out.println("i am in dws home page");
	}
	else{
		driver.quit();
		throw new Exception("i am in dws home page");
	}
	driver.quit();
	
}
}
