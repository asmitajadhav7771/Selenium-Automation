package PradnyaBridalStudioProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyPageFonts {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://pradnya-studio.web.app/");

		Thread.sleep(3000);

		WebElement heading = driver.findElement(By.tagName("h1"));
		
		if (heading.isDisplayed()) {
			System.out.println("PASS : Font is displayed properly");
		} else {
			System.out.println("FAIL : Font is not displayed");
		}

		driver.quit();
	}
}