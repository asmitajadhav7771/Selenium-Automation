package PradnyaBridalStudioProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyBrowserForwardButton {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://pradnya-studio.web.app/");
        Thread.sleep(2000);
        
		driver.get("https://www.google.com/");
        Thread.sleep(2000);
		String nextPage = driver.getCurrentUrl();

		driver.navigate().back();
		driver.navigate().forward();
		
		if (driver.getCurrentUrl().equals(nextPage)) {
			System.out.println("Next page opens successfully : Test Case Pass");

		} else {
			System.out.println("Next page is not opened : Test Case Fail");
		}
		driver.quit();
	}
}