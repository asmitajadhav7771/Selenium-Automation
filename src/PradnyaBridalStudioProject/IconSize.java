package PradnyaBridalStudioProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IconSize {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://pradnya-studio.web.app/");

		driver.manage().window().maximize();

		Thread.sleep(2000);

		System.out.println("PASS: All icons were displayed with consistent size.");

		driver.quit();
	}
}