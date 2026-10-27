package PradnyaBridalStudioProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyMajorHomePageFeatures {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://pradnya-studio.web.app/");
        Thread.sleep(2000);
        
		WebElement logo = driver.findElement(By.tagName("img"));
		WebElement navigation = driver.findElement(By.tagName("nav"));
		WebElement banner = driver.findElement(By.tagName("body"));
		WebElement services = driver.findElement(By.tagName("body"));
		WebElement footer = driver.findElement(By.tagName("footer"));

		if (logo.isDisplayed() && navigation.isDisplayed() && banner.isDisplayed()
				&& services.isDisplayed() && footer.isDisplayed()) {
			System.out.println("All major features are working properly");

		} else {
			System.out.println("Some major features are not working properly");
		}
		driver.quit();
	}
}