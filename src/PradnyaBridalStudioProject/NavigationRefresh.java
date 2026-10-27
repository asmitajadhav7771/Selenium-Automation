package PradnyaBridalStudioProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationRefresh {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.get("https://pradnya-studio.web.app/");
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		Thread.sleep(2000);

		driver.navigate().refresh();
		Thread.sleep(2000);

		if (driver.findElement(By.tagName("nav")).isDisplayed()) {

			System.out.println("PASS: Navigation bar is visible after page refresh");

		} else {

			System.out.println("FAIL: Navigation bar is not visible after page refresh");
		}

		driver.quit();
	}
}