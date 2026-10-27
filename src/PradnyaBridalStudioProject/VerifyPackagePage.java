package PradnyaBridalStudioProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyPackagePage {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://pradnya-studio.web.app/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Packages']")).click();
        Thread.sleep(2000);
        
		if (driver.getCurrentUrl() != null) {
			System.out.println("Package page is visible properly : Pass");

		} else {
			System.out.println("Package page is not visible : Fail");
		}

		driver.quit();
	}
}