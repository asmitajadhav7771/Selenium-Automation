package PradnyaBridalStudioProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class VerifyBlogPage {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://pradnya-studio.web.app/");
		Thread.sleep(2000);

		driver.findElement(By.linkText("BLOG")).click();
		Thread.sleep(2000);
		
		Actions action = new Actions(driver);
		action.scrollByAmount(0, 500).perform();
		
		WebElement image = driver.findElement(By.tagName("img"));
		Thread.sleep(2000);

		if (image.isDisplayed()) {

			System.out.println("Blog page is open and images are displayed");

		} else {

			System.out.println("Blog page is open but images are not displayed");
		}

		driver.quit();
	}
}