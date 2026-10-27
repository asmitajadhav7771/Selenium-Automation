package PradnyaBridalStudioProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyGoogleMap {
	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://pradnya-studio.web.app/");

		Thread.sleep(3000);
		driver.executeScript("window.scrollBy(0,7000)");
		Thread.sleep(2000);
		WebElement map = driver.findElement(By.xpath("//span[text()='Pune']"));

		if (map.isDisplayed()) {
			System.out.println("PASS : Google Map is displayed");
		} else {
			System.out.println("FAIL : Google Map is not displayed");
		}
		// Click on Google Map
		map.click();
		Thread.sleep(2000);
		System.out.println("FAIL : Google Map is displayed but not clickable");
		driver.quit();
	}
}