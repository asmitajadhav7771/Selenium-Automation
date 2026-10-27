package PradnyaBridalStudioProject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTextReadable {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://pradnya-studio.web.app/");
        Thread.sleep(2000);
		List<WebElement> text = driver.findElements(By.tagName("p"));

		if (text.size() > 0 && text.get(0).isDisplayed()) {
			System.out.println("Text was readable.");

		} else {
			System.out.println("Text was not readable.");
		}
		driver.quit();
	}
}