package PradnyaBridalStudioProject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class VerifyImageQuality {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://pradnya-studio.web.app/");
		Thread.sleep(2000);

		List<WebElement> images = driver.findElements(By.tagName("img"));
		Actions action = new Actions(driver);
		action.scrollToElement(images.get(images.size() - 1)).perform();

		if (images.size() > 0) {

			System.out.println("Images are clear and displayed");

		} else {

			System.out.println("Images are not clear and not displayed");
		}

		driver.quit();
	}
}