package WebDriverMethod;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleElement {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
	    Thread.sleep(1000);
	    //By using common attribute
	    List<WebElement>footerLinks = driver.findElements(By.xpath("//a[@target='_blank']"));
	    for (WebElement web : footerLinks) {
	    	web.click();
	    	Thread.sleep(1000);	
	    	}
	    //By using traversing from common parent to targeted elements
	    List<WebElement>headerLinks = driver.findElements(By.xpath("//div[@class='header-links']/ul/li/a"));
	    for (WebElement web : headerLinks) {
	    	web.click();
	    	Thread.sleep(1000);
	    	driver.navigate().back();
	    	Thread.sleep(1000);
	}
}
}