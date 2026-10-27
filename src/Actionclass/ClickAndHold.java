package Actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickAndHold {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Dynamic.html");
		Thread.sleep(1000);
	    Actions act = new Actions(driver);
	    WebElement selenium = driver.findElement(By.id("node"));
	    WebElement dropArea = driver.findElement(By.id("droparea"));
	    act.clickAndHold(selenium).release(dropArea).perform();

}
}