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

public class CommunityPollTest {
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
	    List<WebElement> poll = driver.findElements(By.xpath("//div[@class='block block-poll']"));
		if(poll.size()>0) {
			System.out.println("Community poll is displayed And Test case is Pass");
			if(poll.get(0).isDisplayed()) {
				System.out.println("Community poll is present");
			}
			
		else {
			driver.quit();
			throw new Exception("Community poll is not displayed And Test case is Fail");
		}
	}
		else {
			driver.quit();
			throw new Exception ("Community poll element is not present");
		}
		driver.quit();
}
}