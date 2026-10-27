package PradnyaBridalStudioProject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class VerifyTestimonialImages {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://pradnya-studio.web.app/");
		Thread.sleep(2000);

		List<WebElement> images = driver.findElements(
				By.xpath("//section[contains(@class,'py-16')]//img"));

		Actions action = new Actions(driver);
		action.scrollToElement(images.get(0)).perform();

		if (images.get(0).isDisplayed()) {
			System.out.println("All images are loaded without distortion");

		} else {

			System.out.println("Images are not loaded properly");
		}
		driver.quit();
	}
}