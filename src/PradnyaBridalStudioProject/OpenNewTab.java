package PradnyaBridalStudioProject;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenNewTab {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://pradnya-studio.web.app/");
		Thread.sleep(2000);
		driver.manage().window().maximize();

		Thread.sleep(2000);
		driver.switchTo().newWindow(org.openqa.selenium.WindowType.TAB);

		driver.get("https://pradnya-studio.web.app/");

		Thread.sleep(2000);

		Set<String> tabs = driver.getWindowHandles();

		if (tabs.size() == 2) {

			System.out.println("PASS: Home page opened successfully in a new browser tab");

		} else {

			System.out.println("FAIL: Home page did not open in a new browser tab");
		}

		driver.quit();
	}
}