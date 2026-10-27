package PradnyaBridalStudioProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class VerifyImageAlignment {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://pradnya-studio.web.app/");
		Thread.sleep(2000);

		Actions action = new Actions(driver);
		WebElement image = driver.findElement(By.tagName("img"));
		action.scrollByAmount(0, 500).perform();

		if (image.isDisplayed()) {

			System.out.println("Images are aligned properly : Pass");

		} else {

			System.out.println("Images are not displayed properly : Fail");
		}

		driver.quit();
	}
}