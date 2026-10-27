package PradnyaBridalStudioProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NavigationIncognito {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito");

		WebDriver driver = new ChromeDriver(options);
		Thread.sleep(2000);
		
		driver.get("https://pradnya-studio.web.app/");
		Thread.sleep(2000);
		driver.manage().window().maximize();

		Thread.sleep(2000);

		if (driver.findElement(By.tagName("nav")).isDisplayed()) {

			System.out.println("PASS: Navigation bar displayed properly in Incognito mode");

		} else {

			System.out.println("FAIL: Navigation bar was not displayed properly in Incognito mode");
		}

		driver.quit();
	}
}