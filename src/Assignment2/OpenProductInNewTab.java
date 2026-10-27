package Assignment2;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OpenProductInNewTab {
public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demowebshop.tricentis.com/");
        Thread.sleep(1000);
        Actions act = new Actions(driver);
        Thread.sleep(1000);
        act.contextClick(driver.findElement(By.linkText("14.1-inch Laptop")))
        .sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER)
        .perform();
        Thread.sleep(1000);
        act.contextClick(driver.findElement(By.linkText("14.1-inch Laptop")))
        .sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN)
        .sendKeys(Keys.ENTER)
        .perform();
    }
}
