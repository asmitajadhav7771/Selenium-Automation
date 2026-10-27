package WebDriverMethod;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTheHandle {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/digital-downloads");
	    Thread.sleep(1000);
	    String dwshandle = driver.getWindowHandle();
	    System.out.println(dwshandle);
	    driver.findElement(By.xpath("//a[text()='Facebook']")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//a[text()='Twitter']")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//a[text()='YouTube']")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//a[text()='Google+']")).click();
	    Thread.sleep(1000);
	    Set<String> allhandles = driver.getWindowHandles();
	    System.out.println(allhandles);
}
}
