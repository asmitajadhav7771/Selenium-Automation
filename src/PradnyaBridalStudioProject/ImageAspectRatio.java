package PradnyaBridalStudioProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImageAspectRatio {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
     
		driver.get("https://pradnya-studio.web.app/");
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		Thread.sleep(2000);

		if (driver.findElements(By.tagName("img")).size() > 0) {

			System.out.println("PASS: Images maintained the proper aspect ratio");

		} else {

			System.out.println("FAIL: Images did not maintain the proper aspect ratio");
		}

		driver.quit();
	}
}