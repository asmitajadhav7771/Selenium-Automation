package PradnyaBridalStudioProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyEmailAddress {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://pradnya-studio.web.app/");

		Thread.sleep(3000);
		driver.executeScript("window.scrollBy(0,7000)");
		Thread.sleep(2000);

		WebElement email = driver.findElement(By.xpath("//a[contains(@href,'mailto')]"));
		email.click();

		Thread.sleep(2000);

		if (email.isDisplayed()) {
			System.out.println("PASS : Email address is visible");
		} else {
			System.out.println("FAIL : Email address is not visible");
		}

		driver.quit();
	}
}
