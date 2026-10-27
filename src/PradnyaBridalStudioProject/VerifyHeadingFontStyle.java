package PradnyaBridalStudioProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyHeadingFontStyle {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.get("https://pradnya-studio.web.app/");

		WebElement heading = driver.findElement(By.xpath(""));

		if (heading.isDisplayed()) {

			System.out.println("Font style is visible and consistent");

		} else {

			System.out.println("Font style is not consistent");
		}

		driver.quit();
	}
}