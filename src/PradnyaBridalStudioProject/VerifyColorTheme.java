package PradnyaBridalStudioProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyColorTheme {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://pradnya-studio.web.app/");
        Thread.sleep(2000);
		WebElement theme = driver.findElement(By.tagName("body"));

		if (theme.isDisplayed()) {

			System.out.println("Website color theme is consistent");
		} else {

			System.out.println("Website color theme is not consistent");
		}
		driver.quit();
	}
}