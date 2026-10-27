package PopUps;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownCalender {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.automationtesting.in/Datepicker.html");
	Thread.sleep(2000);
	driver.findElement(By.id("datepicker2"));

	
}
}
