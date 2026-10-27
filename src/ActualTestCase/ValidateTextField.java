package ActualTestCase;

import java.io.File;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ValidateTextField {
	public static WebDriver driver = null;
	public static String browser = "chrome";
	public static void main(String[] args) throws Exception {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito");
		
		if(browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver(options);
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
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		driver.findElement(By.className("ico-login")).click();
		driver.findElement(By.id("Email")).sendKeys("manu2305@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("manu2305");
		driver.findElement(By.cssSelector(".button-1.login-button")).click();
		WebElement product2 = driver.findElement(By.xpath("(//input[@value='Add to cart'])[2]"));
		Actions act = new Actions(driver);
		act.scrollToElement(product2).perform();
		wait.until(ExpectedConditions.elementToBeClickable(product2));
		//product2.click();
		  WebElement cart= driver.findElement(By.className("ico-cart"));
		  wait.until(ExpectedConditions.elementToBeClickable(cart));
		  cart.click();
		 List <WebElement> laptop14inch= driver.findElements(By.xpath("//a[text()='14.1-inch laptop']"));
		 if(laptop14inch.size()>0) {
			 System.out.println("laptop14 inch is added successfully and test case pass");
			 //below this step is not comes under thetest case because i am lazy to remove manually
			 driver.findElement(By.xpath("//a[text()='14.1-inch Laptop'])[2]/../preceding-sibling::td/input")).click();
			 driver.findElement(By.name("updatecart")).click();
			 driver.findElement(By.className("ico-logout")).click();
		 }
		 else {
			 
			 TakesScreenshot ts = (TakesScreenshot)driver;
			 String datetime = LocalDateTime.now().toString().replace(':', '-');
			 File from = ts.getScreenshotAs(OutputType.FILE);
			 File to = new File("c:\\Selenium\\productSuccessfullAdded"+datetime+".png");
			 FileHandler.copy(from, to);
			
			 driver.quit();
			 throw new Exception ("latop14 inch is not added and test case fail");
		 }
		  driver.quit();
		  
	}		  
}	  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		
		