package PradnyaBridalStudioProject;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTestimonialsSection {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://pradnya-studio.web.app/");

		Thread.sleep(3000);

		if (driver.findElements(By.linkText("Testimonials")).size() > 0) {
			System.out.println("PASS : Testimonials section is displayed");
		} else {
			System.out.println("FAIL : Testimonials section is not displayed");
		}

		driver.quit();
	}
}