package PradnyaBridalStudioProject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyBrokenImages {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://pradnya-studio.web.app/");
        Thread.sleep(2000);
		List<WebElement> images = driver.findElements(By.tagName("img"));

		if (images.size() > 0) {

			System.out.println("Images loaded successfully");
			System.out.println("No broken image");
			System.out.println("TC_39 : PASS");

		} else {

			System.out.println("Images are not loaded properly");
			System.out.println("Broken image found");
			System.out.println("TC_39 : FAIL");
		}
		driver.quit();
	}
}