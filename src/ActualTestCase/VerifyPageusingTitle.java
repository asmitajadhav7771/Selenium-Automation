package ActualTestCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

public class VerifyPageusingTitle {
	public static WebDriver driver = null;
	public static String browser = "internet";
	public static void main(String[] args) throws Exception {
		String expected_title = "Demo Web Shop";
		
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
		String actual_title = driver.getTitle();
		System.out.println(actual_title);
		if(expected_title.equalsIgnoreCase(actual_title)) {
			System.out.println("i am in dws home page");
		}
		else{
			driver.quit();
			throw new Exception("i am not in dws home page");
		}
		driver.quit();
		
 	}
}
