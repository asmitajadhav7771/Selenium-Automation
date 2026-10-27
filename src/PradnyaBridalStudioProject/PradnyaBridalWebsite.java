package PradnyaBridalStudioProject;

import org.openqa.selenium.chrome.ChromeDriver;

public class PradnyaBridalWebsite {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://pradnya-studio.web.app/");
	Thread.sleep(2000);

	driver.close();
}
}
