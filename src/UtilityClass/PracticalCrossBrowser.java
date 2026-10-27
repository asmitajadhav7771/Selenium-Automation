package UtilityClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;

public class PracticalCrossBrowser {
public static WebDriver driver = null;
public static void main(String[] args) throws InterruptedException {
String browser = "internet";
if(browser.equalsIgnoreCase("chrome")) {
	driver= new ChromeDriver();
}
else if(browser.equalsIgnoreCase("Edge")) {
	driver = new EdgeDriver();
}
else if(browser.equalsIgnoreCase("fireforx")) {
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
Thread.sleep(2000);
WebElement secondProduct = driver.findElement(By.xpath("(//input[@value='Add to cart'])[2]"));
Actions act = new Actions (driver);
act.scrollToElement(secondProduct).perform();
Thread.sleep(1000);
secondProduct.click();
driver.findElement(By.className("ico-cart")).click();
Thread.sleep(2000);
driver.findElement(By.name("removefromcart"));
Thread.sleep(2000);
driver.findElement(By.name("updatecart"));
Thread.sleep(2000);
driver.quit();

}
}
