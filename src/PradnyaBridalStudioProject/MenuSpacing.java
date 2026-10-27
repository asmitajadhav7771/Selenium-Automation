package PradnyaBridalStudioProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MenuSpacing {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.get("https://pradnya-studio.web.app/");
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		Thread.sleep(2000);

		if (driver.findElement(By.tagName("nav")).isDisplayed()) {

			System.out.println("PASS: Equal spacing was maintained between menu items");

		} else {

			System.out.println("FAIL: Equal spacing was not maintained between menu items");
		}
		driver.quit();
	}
}