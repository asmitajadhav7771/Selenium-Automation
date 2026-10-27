package DropDownMenu;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleSelect {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/Admin/Downloads/demo%20(1).html");
	Thread.sleep(1000);
	WebElement single = driver.findElement(By.id("standard_cars"));
	Select sel = new Select(single);
	sel.selectByVisibleText("BMW");
	Thread.sleep(1000);
	sel.selectByValue("for");
	Thread.sleep(1000);
	sel.selectByIndex(4);
}
}
