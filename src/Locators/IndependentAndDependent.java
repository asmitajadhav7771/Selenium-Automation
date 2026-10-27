package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IndependentAndDependent {
	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[contains(text(),'Digital downloads')]")).click();
		Thread.sleep(1000);
		WebElement album3rd=driver.findElement(By.xpath("//a[text()='3rd Album']/../../div[3]/div/span"));
		System.out.println(album3rd.getText());
}
}
