package New;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShoppersStack {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.shoppersstack.com/");
	Thread.sleep(9000);
	
	 driver.findElement(By.id("loginBtn"));

}
}
