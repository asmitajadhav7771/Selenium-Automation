package PradnyaBridalStudioProject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyPageContentAlignment {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.get("https://pradnya-studio.web.app/");
        Thread.sleep(2000);
		List<WebElement> images = driver.findElements(By.tagName("img"));
		List<WebElement> text = driver.findElements(By.tagName("p"));

		if (images.size() > 0 && text.size() > 0) {

			System.out.println("Content was properly aligned");

		} else {

			System.out.println("Content was not properly aligned");
		}

		driver.quit();
	}
}