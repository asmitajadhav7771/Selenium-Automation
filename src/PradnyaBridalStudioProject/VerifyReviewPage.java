package PradnyaBridalStudioProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyReviewPage {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.get("https://pradnya-studio.web.app/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Reviews']")).click();
        Thread.sleep(2000);
        
		if (driver.getCurrentUrl() != null) {
			System.out.println("Review page is open successfully");

		} else {
			System.out.println("Review page is not opened");
		}
		driver.quit();
	}
}