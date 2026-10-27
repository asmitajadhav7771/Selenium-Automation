package PradnyaBridalStudioProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SectionBorder {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://pradnya-studio.web.app/");
		Thread.sleep(2000);

		driver.manage().window().maximize();
		Thread.sleep(2000);

		if (driver.findElement(By.tagName("section")).isDisplayed()) {

			System.out.println("PASS: Section borders were displayed properly");

		} else {

			System.out.println("FAIL: Section borders were not displayed properly");
		}

		driver.quit();
	}
}