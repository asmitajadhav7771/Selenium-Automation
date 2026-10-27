package PradnyaBridalStudioProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookIcon {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://pradnya-studio.web.app/");
        Thread.sleep(2000);

        if (driver.findElements(By.xpath("//a[contains(@href,'facebook')]")).size() > 0) {
            WebElement facebook = driver.findElement(By.xpath("//a[contains(@href,'facebook')]"));
            Thread.sleep(2000);
            if (facebook.isDisplayed()) {
                System.out.println("Facebook icon is available - PASS");
            }

        } else {
            System.out.println("Facebook icon is not available - FAIL");

        }
        driver.quit();
    }
}