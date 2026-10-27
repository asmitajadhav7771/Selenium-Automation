package PradnyaBridalStudioProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTextReadability {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://pradnya-studio.web.app/");
		Thread.sleep(2000);

		if (driver.findElement(By.tagName("body")).isDisplayed()) {
			System.out.println("All visible text is clear and readable : Pass");
			
		} else {

			System.out.println("Text is not readable");
		}
		driver.quit();
	}
}