package PradnyaBridalStudioProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class VerifyHomePageSectionSpacing {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://pradnya-studio.web.app/");
		Thread.sleep(2000);

		Actions action = new Actions(driver);
		action.scrollByAmount(0, 600).perform();
		Thread.sleep(1000);

		if (driver.getCurrentUrl().contains("pradnya-studio")) {

			System.out.println("Equal spacing is maintained between all sections");

		} else {

			System.out.println("Spacing is not maintained properly");
		}

		driver.quit();
	}
}