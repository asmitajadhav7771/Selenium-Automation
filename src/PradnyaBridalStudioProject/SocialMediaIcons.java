package PradnyaBridalStudioProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SocialMediaIcons {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://pradnya-studio.web.app/");
        Thread.sleep(2000);

        WebElement footer = driver.findElement(By.tagName("footer"));
        Actions act = new Actions(driver);
        act.moveToElement(footer).perform();

        // Instagram Icon
        if (driver.findElements(By.xpath("//a[contains(@href,'instagram')]")).size() > 0) {
            System.out.println("Instagram icon is displayed");
        } else {
            System.out.println("Instagram icon is not available");
        }

        // Facebook Icon
        if (driver.findElements(By.xpath("//a[contains(@href,'facebook')]")).size() > 0) {
            System.out.println("Facebook icon is displayed");
        } else {
            System.out.println("Facebook icon is not available");
        }

        // Overall Result
        if (driver.findElements(By.xpath("//a[contains(@href,'instagram')]")).size() > 0
                && driver.findElements(By.xpath("//a[contains(@href,'facebook')]")).size() > 0) {

            System.out.println("All social media icons are displayed - PASS");

        } else {

            System.out.println("All social media icons are not displayed - FAIL");
        }

        driver.quit();
    }
}