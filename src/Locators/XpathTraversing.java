package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathTraversing {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(1000);
		//Parent To Child
		driver.findElement(By.xpath("//ul[@class='poll-options']/li[1]/label")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//ul[@class='poll-options']/li[2]/label")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//ul[@class='poll-options']/li[3]/label")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//ul[@class='poll-options']/li[4]/label")).click();
        //Child To Parent
		WebElement poll = driver.findElement(By.xpath("//input[@id='pollanswers-1']/../.."));
		System.out.println(poll.getText());
		Thread.sleep(1000);
		// Backward sibling Traversing
		driver.findElement(By.xpath("//label[@for='pollanswers-1']/preceding-sibling::input[1]")).click();
        Thread.sleep(1000);
        //Forward sibling traversing
 		driver.findElement(By.xpath("//input[@id='pollanswers-2']/following-sibling::label[1]")).click();
        driver.close();

}
}