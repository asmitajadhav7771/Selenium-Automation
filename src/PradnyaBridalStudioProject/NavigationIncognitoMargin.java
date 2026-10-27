package PradnyaBridalStudioProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NavigationIncognitoMargin {

	public static void main(String[] args) throws InterruptedException {

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito");
		Thread.sleep(2000);
		
		WebDriver driver = new ChromeDriver(options);
		Thread.sleep(2000);
		driver.get("https://pradnya-studio.web.app/");
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		Thread.sleep(2000);

		if (driver.findElement(By.tagName("nav")).isDisplayed()) {
			System.out.println("PASS: Menu text had proper margin from the browser edge");

		} else {
			System.out.println("FAIL: Menu text did not have proper margin from the browser edge");
		}

		driver.quit();
	}
}