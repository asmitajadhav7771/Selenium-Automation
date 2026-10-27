package PradnyaBridalStudioProject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyAllImagesLoading {
	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://pradnya-studio.web.app/");

		Thread.sleep(3000);

		List<WebElement> images = driver.findElements(By.tagName("img"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(2000);

		if (images.size() > 0) {
			System.out.println("FAIL : Some images are not displayed properly");
		} else {
			System.out.println("FAIL : Images are not displayed");
		}

		driver.quit();
	}
}