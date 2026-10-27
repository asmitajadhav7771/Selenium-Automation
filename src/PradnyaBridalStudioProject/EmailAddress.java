package PradnyaBridalStudioProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class EmailAddress {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://pradnya-studio.web.app/");
        Thread.sleep(2000);
        WebElement email = driver.findElement(By.xpath("//a[text()='contact pradnyabridalstudio']"));
        
        Actions act = new Actions(driver);
        act.moveToElement(email).perform();
        email.click();

        if (email.isDisplayed()) {
            System.out.println("Email address is displayed - PASS");
        } else {
            System.out.println("Email address is not displayed - FAIL");
        }

        driver.quit();
    }
}