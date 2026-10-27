package PradnyaBridalStudioProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTransformationMenu {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://pradnya-studio.web.app/");
		Thread.sleep(2000);
	    driver.findElement(By.xpath("//span[text()='Transformations']")).click();
        Thread.sleep(2000);
		if (driver.getCurrentUrl() != null) {
			System.out.println("Transformation page is open successfully : Pass");

		} else {
			System.out.println("Transformation page is not opened : Fail");
		}

		driver.quit();
	}
}