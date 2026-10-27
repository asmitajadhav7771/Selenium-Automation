package PradnyaBridalStudioProject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HorizontalScroll {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://pradnya-studio.web.app/");
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		Thread.sleep(2000);

		JavascriptExecutor js = (JavascriptExecutor) driver;

		long width = (long) js.executeScript("return document.documentElement.scrollWidth");

		long pageWidth = (long) js.executeScript("return document.documentElement.clientWidth");

		if (width > pageWidth) {

			System.out.println("FAIL: Horizontal scroll bar was displayed");

		} else {

			System.out.println("PASS: Horizontal scroll bar was not displayed");
		}

		driver.quit();
	}
}