package PradnyaBridalStudioProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class VerifyMousePointer {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://pradnya-studio.web.app/");
		Thread.sleep(2000);

		WebElement button = driver.findElement(By.xpath("//a[text()='Book Consultation']"));
        Thread.sleep(2000);
		Actions action = new Actions(driver);
		action.moveToElement(button).perform();

		String cursor = button.getCssValue("cursor");

		if (cursor.equals("pointer")) {
			System.out.println("Mouse pointer changed to a hand cursor");

		} else {
			System.out.println("Mouse pointer not changed to a hand cursor");
		}
		driver.quit();
	}
}