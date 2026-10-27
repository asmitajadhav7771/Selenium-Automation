package WebDriverMethod;

import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {
	public static void main(String[] args) throws InterruptedException {
			ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://demowebshop.tricentis.com/");
			Thread.sleep(2000);
			driver.navigate().to("https://www.amazon.in/");
			Thread.sleep(1000);
			driver.navigate().back();
			Thread.sleep(1000);
			driver.navigate().refresh();
			Thread.sleep(1000);
			driver.navigate().forward();
			Thread.sleep(1000);
			driver.close();				
	}
}
