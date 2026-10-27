package Assignment2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RegisterUsingActionsClass {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demowebshop.tricentis.com/register");
        Thread.sleep(2000);
        Actions act = new Actions(driver);
        act.click(driver.findElement(By.id("gender-female")))
		   .click(driver.findElement(By.id("FirstName")))
		   .sendKeys("Asmita")
		   .sendKeys(Keys.TAB)
		   .sendKeys("Jadhav")
		   .sendKeys(Keys.TAB)
		   .sendKeys("asmita123@gmail.com")
		   .sendKeys(Keys.TAB)
		   .sendKeys("Asmita@123")
		   .sendKeys(Keys.TAB)
		   .sendKeys("Asmita@123")
		   .sendKeys(Keys.TAB)
		   .sendKeys(Keys.ENTER)
		   .perform();

		Thread.sleep(3000);
		driver.quit();
       
    }
}