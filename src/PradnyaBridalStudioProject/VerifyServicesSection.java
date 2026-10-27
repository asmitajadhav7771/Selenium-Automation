package PradnyaBridalStudioProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyServicesSection {
	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://pradnya-studio.web.app/");
		Thread.sleep(3000);

		driver.findElement(By.xpath("//span[text()='Services']")).click();

		Thread.sleep(3000);
		WebElement serviceHeading = driver.findElement(By.xpath("//h1"));

		if (serviceHeading.isDisplayed()) {
			System.out.println("PASS : Services page is displayed");
		} else {
			System.out.println("FAIL : Services page is not displayed");
		}

		driver.quit();
	}
}