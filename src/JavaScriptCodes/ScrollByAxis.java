package JavaScriptCodes;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollByAxis {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://omayo.blogspot.com/");
	Thread.sleep(2000);
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,500);");
	Thread.sleep(1000);
	js.executeScript("window.scrollBy(0,-500);");
	Thread.sleep(1000);
	js.executeScript("Window.scrollTo(0,1000);");
	driver.quit();
	
}
}
