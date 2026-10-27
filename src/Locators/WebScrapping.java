package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

 public class WebScrapping {
 public static void main(String[] args) throws InterruptedException {
 ChromeDriver driver = new ChromeDriver();
 driver.manage().window().maximize();
 driver.get("https://demowebshop.tricentis.com/");
 Thread.sleep(2000);
 WebElement reg = driver.findElement(By.className("ico-register"));
 System.out.println("Text of Register is :"+reg.getText());
 WebElement poll = driver.findElement(By.cssSelector(".block.block-poll>div>strong"));
 System.out.println("Text of poll is :"+poll.getText());
 driver.close();
}
}
