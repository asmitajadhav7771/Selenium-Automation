package PradnyaBridalStudioProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserSupport {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://pradnya-studio.web.app/");
        Thread.sleep(2000);

        if (driver.getTitle() != null) {
            System.out.println("Website works properly in Google Chrome - PASS");
        } else {
            System.out.println("Website does not work properly in Google Chrome - FAIL");
        }
        driver.quit();
    }
}