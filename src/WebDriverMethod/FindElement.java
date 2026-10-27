package WebDriverMethod;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElement {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[contains(text(),'Digital downloads')]")).click();
		Thread.sleep(1000);
		List<WebElement>footerLinks = driver.findElements(By.xpath("//input[@value='Add to cart']"));
	    for (WebElement web : footerLinks) {
	    	web.click();
	    	Thread.sleep(1000);		
	    }
	    Thread.sleep(1000);
	    driver.findElement(By.linkText("Shopping cart")).click();
	    Thread.sleep(1000);
	    List<WebElement>remove = driver.findElements(By.xpath("//input[@name='removefromcart']"));
	    for (WebElement web : remove) {
	    	web.click();
	    	Thread.sleep(1000);		
	    }
	    driver.findElement(By.xpath("//input[@name='updatecart']")).click();
	 }
	}
