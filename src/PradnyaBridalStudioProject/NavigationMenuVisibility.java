package PradnyaBridalStudioProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationMenuVisibility {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://pradnya-studio.web.app/");
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		Thread.sleep(2000);

		if (driver.findElement(By.tagName("nav")).isDisplayed()) {

			System.out.println("PASS: All menu names were fully visible");

		} else {

			System.out.println("FAIL: All menu names were not fully visible");
		}

		driver.quit();
	}
}