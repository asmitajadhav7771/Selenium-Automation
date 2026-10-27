package PradnyaBridalStudioProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyContactPage {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.get("https://pradnya-studio.web.app/");
		Thread.sleep(2000);

		driver.findElement(By.linkText("CONTACT")).click();
        Thread.sleep(2000);
        
		WebElement form = driver.findElement(By.tagName("form"));
		Thread.sleep(2000);
		
		if (form.isDisplayed()) {
			System.out.println("Contact page is open successfully and form is visible");
	
		} else {
			System.out.println("Contact form is not visible");
	
		}

		driver.quit();
	}
}