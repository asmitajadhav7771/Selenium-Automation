package PradnyaBridalStudioProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class VerifyCustomerName {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://pradnya-studio.web.app/");
		Thread.sleep(2000);

		WebElement name = driver.findElement(By.xpath("//cite[text()='Priyanka Joshi']"));
        Thread.sleep(2000);
        
		Actions action = new Actions(driver);
		action.scrollToElement(name).perform();

		if (name.isDisplayed()) {
			System.out.println("Customer name is displayed in home page");

		} else {
			System.out.println("Customer name is not displayed");
		}

		driver.quit();
	}
}