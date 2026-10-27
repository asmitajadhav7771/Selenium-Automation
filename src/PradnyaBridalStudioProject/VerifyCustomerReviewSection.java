package PradnyaBridalStudioProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class VerifyCustomerReviewSection {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.get("https://pradnya-studio.web.app/");
		Thread.sleep(2000);
		WebElement review = driver.findElement(By.xpath("//*[contains(text(),'Reviews')]"));

		Actions action = new Actions(driver);
		action.scrollToElement(review).perform();

		if (review.isDisplayed()) {

			System.out.println("Customer review section is displayed properly");

		} else {

			System.out.println("Customer review section is not displayed");
		}

		driver.quit();
	}
}