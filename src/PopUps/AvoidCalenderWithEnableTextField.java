package PopUps;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

public class AvoidCalenderWithEnableTextField {
	public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.automationtesting.in/Datepicker.html");
	Thread.sleep(3000);
	driver.findElement(By.id("datepicker2")).sendKeys("05/23/2000");
		
	
}
}
