package PradnyaBridalStudioProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class VerifyFooterDisplayed {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.get("https://pradnya-studio.web.app/");

		Thread.sleep(2000);
		WebElement footer = driver.findElement(By.tagName("footer"));

		Actions action = new Actions(driver);
		action.scrollToElement(footer).perform();

		if (footer.isDisplayed()) {

			System.out.println("Footer is displaying properly");

		} else {

			System.out.println("Footer is not displaying properly");
		}
		driver.quit();
	}
}