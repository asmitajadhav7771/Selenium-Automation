package ActualTestCase;

import java.io.File;
import java.time.Duration;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
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

public class AfterUpdateQtyCheckTotal {
	public static WebDriver driver = null;
	public static String browser = "chrome";
	public static void main(String[] args) throws Exception {
		ChromeOptions options = new ChromeOptions();
	
		options.addArguments("--incognito");
		
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
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		//login the page 
		driver.findElement(By.className("ico-login")).click();
		driver.findElement(By.id("Email")).sendKeys("mani2305@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("mani2305");
		driver.findElement(By.cssSelector(".button-1.login-button")).click();
	
		//Adding 14 inch laptop
	    WebElement product2 = driver.findElement(By.xpath("(//input[@value='Add to cart'])[2]"));
		Actions act = new Actions (driver);
		act.scrollToElement(product2).perform();
		wait.until(ExpectedConditions.elementToBeClickable(product2));
		product2.click();
		WebElement cart = driver.findElement(By.className("ico-cart"));
		wait.until(ExpectedConditions.elementToBeClickable(cart));
		cart.click();
		
		//change Quantity
		driver.findElement(By.xpath("(//a[text()='14.1-inch Laptop'])[2]/../following-sibling::td[2]/input)")).clear();
		driver.findElement(By.xpath("(//a[text()='14.1-inch Laptop'])[2]/../following-sibling::td[2]/input")).sendKeys("3",Keys.ENTER);
		//read the price from textfield
		WebElement price = driver.findElement(By.xpath("(//a[text()='14.1-inch Laptop'])[2]/../following-sibling::td/span[2]"));
		String actual_price = price.getText();
		//Read the Quantity
		String actual_qty = driver.findElement(By.xpath("(//a[text()='14.1-inch Laptop'])[2]/../following-sibling::td[2]/input")).getAttribute(actual_price);
		System.out.println(actual_qty);
		//Buidling a logic to find Expected Total
		int p = (int)Double.parseDouble(actual_price);
		int q = Integer.parseInt(actual_qty);
		String expected_totel = p*q+"";	
	    System.out.println(expected_totel);
	    //read Total from Total textfield
	    WebElement total = driver.findElement(By.xpath("//a[text()='14.1-inch Laptop']/../following-sibling::td[3]/span[2]"));
	    String actual_totel = total.getText();
	    System.out.println(actual_totel);
	    //Testing part whether the expected and actual is same
	    if(actual_totel.contains(expected_totel)) {
	    	System.out.println("Total is same and test case pass");
	    	driver.findElement(By.className("ico-logout")).click();
	    	
	    }
	    else {
	    	TakesScreenshot ts = (TakesScreenshot)driver;
	    	String datetime = LocalDateTime.now().toString().replace(':', '-');
	    	File from = ts.getScreenshotAs(OutputType.FILE);
	    	File to = new File("C:\\Selenium\\ProductSuccessfullyRemoved"+datetime+".png");
	    	FileHandler.copy(from, to);
	    	driver.quit();
	    	throw new Exception("Total is not same and test case fail");
	    }
	    driver.quit();
	    
	    
}
}
