package Actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class SendValues {
public static void main(String[] args) throws InterruptedException {
    WebDriver driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	Thread.sleep(2000);
	Actions act = new Actions (driver);
    WebElement searchField = driver.findElement(By.id("small-searchterms"));
//	act.sendKeys(searchField,"computer").perform();
	act.click(searchField).sendKeys("computer").perform();
	Thread.sleep(1000);
	act.keyDown(Keys.ARROW_DOWN).keyDown(Keys.ARROW_DOWN).keyDown(Keys.ENTER).perform();
	

}
}
