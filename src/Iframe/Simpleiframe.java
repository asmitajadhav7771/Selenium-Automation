package Iframe;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Simpleiframe {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.automationtesting.in/Frames.html");
	Thread.sleep(2000);
//	driver.switchTo().frame(0);
//	driver.switchTo().frame("singleIframe");
    WebElement singleIframe = driver.findElement(By.id("singleframe"));
    driver.switchTo().frame("singleframe");
    driver.findElement(By.xpath("//input[@type='text']")).sendKeys("How are you?");
    Thread.sleep(2000);
    driver.switchTo().parentFrame();
    driver.findElement(By.xpath("//a[text()='Home']")).click();

}
}
