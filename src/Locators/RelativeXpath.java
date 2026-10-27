package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXpath {
public static void main(String[] args) {
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	//Xpath By Attribute
//	driver.findElement(By.xpath("//input[@value='Add to cart']")).click();
	//Xpath by Group Of Index
//	driver.findElement(By.xpath("(//input[@value='Add to cart'])[2]")).click();
//	//Xpath by text Function
	driver.findElement(By.xpath("span[text()='Shopping cart']")).click();
	WebElement poll=driver.findElement(By.xpath("//strong[text()='Community poll']"));
	System.out.println(poll.getText());
}
}
