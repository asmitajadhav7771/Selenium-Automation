package JavaScriptCodes;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingUsingElement {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.redbus.in/");
	Thread.sleep(2000);
	JavascriptExecutor js = (JavascriptExecutor)driver;
	WebElement bookNow = driver.findElement(By.xpath("//button[@class='bookNowBtn']"));
	js.executeScript("arguments[0].scrollIntoView(true);",bookNow);
}
}
