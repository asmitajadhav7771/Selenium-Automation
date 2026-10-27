package PradnyaBridalStudioProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationTabSwitch {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://pradnya-studio.web.app/");
		Thread.sleep(2000);
		driver.manage().window().maximize();

		Thread.sleep(2000);
		String firstTab = driver.getWindowHandle();
		driver.switchTo().newWindow(org.openqa.selenium.WindowType.TAB);

		driver.get("https://pradnya-studio.web.app/");
		Thread.sleep(2000);
		driver.switchTo().window(firstTab);

		Thread.sleep(1000);
		driver.switchTo().window(driver.getWindowHandles().toArray(new String[0])[1]);

		Thread.sleep(1000);

		if (driver.findElement(By.tagName("nav")).isDisplayed()) {

			System.out.println("PASS: Navigation bar remained visible after switching browser tabs");

		} else {

			System.out.println("FAIL: Navigation bar was not visible after switching browser tabs");
		}

		driver.quit();
	}
}