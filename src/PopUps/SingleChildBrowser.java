package PopUps;

import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SingleChildBrowser {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	String parent_dws = driver.getWindowHandle();
	System.out.println(parent_dws);
	Thread.sleep(2000);
	Actions act = new Actions (driver);
	WebElement facebook = driver.findElement(By.xpath("//a[text()='Facebook']"));
	act.scrollToElement(facebook).click(facebook).perform();
	Thread.sleep(1000);
	Set<String> allhandles = driver.getWindowHandles();
	System.out.println(allhandles);  
	
//with removing parent handle
//	System.out.println("Before remove :"+allhandles);
//	allhandles.remove(parent_dws);
//	System.out.println("After remove :"+allhandles);
//	fro(String str : allhandles){
//		driver.switchTo().window(str);
//	}
	//without removing parent handle
	for(String str : allhandles) {
		driver.switchTo().window(str);
	}
	Thread.sleep(2000);
    driver.findElement(By.xpath("//span[text()='Create new account']")).click();
    driver.close();
}

}
