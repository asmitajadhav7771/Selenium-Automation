package PradnyaBridalStudioProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class VerifyPageScroll {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://pradnya-studio.web.app/");

		Thread.sleep(2000);

		Actions action = new Actions(driver);

		action.scrollByAmount(0, 1000).perform();

		Thread.sleep(1000);

		System.out.println("Page is scroll smoothly");

		driver.quit();
	}
}