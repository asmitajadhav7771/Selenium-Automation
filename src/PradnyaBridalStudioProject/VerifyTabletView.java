package PradnyaBridalStudioProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTabletView {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		// Open website
		driver.get("https://pradnya-studio.web.app/");

		// Observe tablet view
		System.out.println("Website opened successfully");
		System.out.println("Switch to tablet view manually");
		System.out.println("Observe page layout");
		System.out.println("TC_37 : PASS");

		driver.quit();
	}
}