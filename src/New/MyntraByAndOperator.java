package New;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyntraByAndOperator {
public static void main(String[] args) {
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.myntra.com/");
	driver.findElement(By.xpath("//a[@data-group='genz' and @data-reactid='805']")).click();
}
}
