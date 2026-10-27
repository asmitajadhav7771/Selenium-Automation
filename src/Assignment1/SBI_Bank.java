package Assignment1;

import org.openqa.selenium.chrome.ChromeDriver;

public class SBI_Bank {
	public static void main(String[] args) throws InterruptedException{
		//open the browser
		ChromeDriver driver = new ChromeDriver();
		//maximize the browser
		driver.manage().window().maximize();
		//enter into page
		driver.get("https://onlinesbi.sbi.bank.in/");
		Thread.sleep(4000);
		//close the browser
		driver.close();
	}

}
