package ClassTask;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver =  new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//a[contains(text(),'Digital downloads')]")).click();
	Thread.sleep(1000);
	WebElement sort = driver.findElement(By.id("products-orderby"));
	Select sel = new Select (sort);
	List <WebElement> options = sel.getOptions();
	int i=0;
	for(WebElement web : options) {
		sel.selectByIndex(i++);
		Thread.sleep(1000);
		sort = driver.findElement(By.id("products-orderby"));
		sel=new Select(sort);
	}
	Thread.sleep(1000);
	driver.close();
	
  
}
}