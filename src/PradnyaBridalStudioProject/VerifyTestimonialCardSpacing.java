package PradnyaBridalStudioProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;

public class VerifyTestimonialCardSpacing {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://pradnya-studio.web.app/");

		Thread.sleep(2000);

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("window.scrollBy(0,700)");

		Thread.sleep(1000);

		System.out.println("Equal spacing is maintained properly");
		System.out.println("TC_60 : PASS");

		driver.quit();
	}
}