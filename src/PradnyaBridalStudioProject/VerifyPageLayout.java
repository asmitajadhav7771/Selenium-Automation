package PradnyaBridalStudioProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyPageLayout {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://pradnya-studio.web.app/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(1000);

		if (driver.getTitle().isEmpty()) {
			System.out.println("Page layout remained  proper after maximizing the browser");

		} else {
			System.out.println("Page layout remained not proper after maximizing the browser");
		}

		driver.quit();
	}
}