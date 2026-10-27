package PradnyaBridalStudioProject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyButtonDesign {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://pradnya-studio.web.app/");
        Thread.sleep(2000);
		List<WebElement> buttons = driver.findElements(By.tagName("button"));

		if (buttons.size() > 0) {

			System.out.println("Button design is consistent");

		} else {

			System.out.println("Button design is not consistent");
		}

		driver.quit();
	}
}