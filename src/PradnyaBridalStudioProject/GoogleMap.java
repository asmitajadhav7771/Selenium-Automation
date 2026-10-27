package PradnyaBridalStudioProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GoogleMap {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://pradnya-studio.web.app/");
        Thread.sleep(2000);
        WebElement map = driver.findElement(By.xpath("//span[text()='Pune']"));
        Actions act = new Actions(driver);
        act.moveToElement(map).perform();
        map.click();
        if (map.isDisplayed()) {
            System.out.println("Google Map icon is displayed - PASS");
        }
        try {
            map.click();
            System.out.println("Google Map is Not clickable - FAIL");
        } catch (Exception e) {
            System.out.println("Google Map is not clickable - FAIL");
        }

        driver.quit();
    }
}