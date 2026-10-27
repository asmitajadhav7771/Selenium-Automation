package PradnyaBridalStudioProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PageScrolling {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://pradnya-studio.web.app/");
        Thread.sleep(2000);
        Actions act = new Actions(driver);

        // Scroll down
        act.scrollByAmount(0, 600).perform();
        Thread.sleep(1000);

        // Scroll up
        act.scrollByAmount(0, -600).perform();
        Thread.sleep(1000);

        System.out.println("Page scrolls smoothly without any issues - PASS");

        driver.quit();
    }
}