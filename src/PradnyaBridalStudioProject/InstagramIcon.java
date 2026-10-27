package PradnyaBridalStudioProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class InstagramIcon {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://pradnya-studio.web.app/");
        Thread.sleep(2000);
        
        WebElement footer = driver.findElement(By.tagName("footer"));
        Actions act = new Actions(driver);
        act.moveToElement(footer).perform();

        if (driver.findElements(By.xpath("//a[contains(@href,'instagram')]")).size() > 0) {

            WebElement instagram = driver.findElement(By.xpath("//a[contains(@href,'instagram')]"));

            if (instagram.isDisplayed()) {
                System.out.println("Instagram icon is displayed - PASS");
            }

            instagram.click();
            System.out.println("Instagram page is open successfully - PASS");

        } else {

            System.out.println("Instagram icon is not available - FAIL");

        }
        driver.quit();
    }
}
