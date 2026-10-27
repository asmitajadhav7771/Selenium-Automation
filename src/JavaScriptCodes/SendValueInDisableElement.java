package JavaScriptCodes;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendValueInDisableElement {
	public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.automationtesting.in/Datepicker.html");
	Thread.sleep(2000);
	JavascriptExecutor js = (JavascriptExecutor)driver;
	WebElement disableField = driver.findElement(By.id("datepicker1"));
	js.executeScript("arguments[0].value='03/12/2003';",disableField);
	
}
}