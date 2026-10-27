package PradnyaBridalStudioProject;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyGalleryPreviewSection {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://pradnya-studio.web.app/");

		Thread.sleep(3000);

		if (driver.findElements(By.linkText("Gallery")).size() > 0) {
			System.out.println("PASS : Gallery section is displayed");
		} else {
			System.out.println("FAIL : Gallery section is not displayed");
		}

		driver.quit();
	}
}