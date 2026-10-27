package PradnyaBridalStudioProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CopyrightText {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://pradnya-studio.web.app/");
        Thread.sleep(2000);
        
        WebElement copyright = driver.findElement(By.xpath("//p"));
        Actions act = new Actions(driver);
        act.moveToElement(copyright).perform();

        if (copyright.isDisplayed()) {
            System.out.println("Copyright text is displayed correctly - PASS");
        } else {
            System.out.println("Copyright text is not displayed - FAIL");
        }
        driver.quit();
    }
}
