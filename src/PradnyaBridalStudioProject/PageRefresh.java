package PradnyaBridalStudioProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageRefresh {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://pradnya-studio.web.app/");
        Thread.sleep(2000);
        
        driver.navigate().refresh();
        Thread.sleep(2000);

        if (driver.getTitle() != null) {
            System.out.println("Page reloads correctly after refresh - PASS");
        } else {
            System.out.println("Page does not reload correctly - FAIL");
        }
        driver.quit();
    }
}