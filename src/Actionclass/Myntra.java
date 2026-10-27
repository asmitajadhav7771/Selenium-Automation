package Actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Myntra{
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/?utm_source=gh_ht&utm_medium=ht_rev&utm_campaign=gh_ht_listicle50j&gad_source=1");
		Thread.sleep(2000);
		Actions act = new Actions(driver);
		WebElement kids = driver.findElement(By.xpath("//a[text()='Kids']"));
		act.moveToElement(kids).perform();
		Thread.sleep(1000);
		WebElement jeans = driver.findElement(By.xpath("//a[@data-reactid='351']"));
		act.click(jeans).perform();
		
	}
	
}
