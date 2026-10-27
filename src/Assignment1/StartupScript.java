package Assignment1;

import org.openqa.selenium.chrome.ChromeDriver;

public class StartupScript {
	public static void main(String[] args) throws InterruptedException {
		//open the browser
		ChromeDriver driver = new ChromeDriver();
		//maximize the browser
		driver.manage().window().maximize();
		//enter into page 
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(3000);
		//close the browser
		driver.close();
	}

}
