package PradnyaBridalStudioProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyPhoneNumberVisibility {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://pradnya-studio.web.app/");

		Thread.sleep(3000);

		driver.findElement(By.tagName("footer")).click();
		Thread.sleep(2000);

		WebElement phone = driver.findElement(By.xpath("//a[text()='Call Studio']"));
	
		if (phone.isDisplayed()) {
			System.out.println("PASS : Phone number is visible");
		} else {
			System.out.println("FAIL : Phone number is not visible");
		}

		driver.quit();
	}
}