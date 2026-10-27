package PradnyaBridalStudioProject;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationResize {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.get("https://pradnya-studio.web.app/");
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		Thread.sleep(2000);

		driver.manage().window().setSize(new Dimension(800, 600));
		Thread.sleep(2000);

		if (driver.findElement(By.tagName("nav")).isDisplayed()) {
			System.out.println("PASS: Menu names had proper spacing");

		} else {
			System.out.println("FAIL: Menu names did not have proper spacing");
		}

		driver.quit();
	}
}