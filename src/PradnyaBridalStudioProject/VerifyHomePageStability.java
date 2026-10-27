package PradnyaBridalStudioProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyHomePageStability {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://pradnya-studio.web.app/");
        Thread.sleep(2000);
        
		String homePage = driver.getCurrentUrl();
		driver.get("https://www.google.com/");
		driver.get(homePage);

		if (driver.getCurrentUrl().equals(homePage)) {
			System.out.println("Home page remains stable after multiple page navigations");

		} else {
			System.out.println("Home page is not stable");
		}

		driver.quit();
	}
}