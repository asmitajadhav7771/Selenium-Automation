package PradnyaBridalStudioProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBrowserSupport {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new FirefoxDriver();

        driver.get("https://pradnya-studio.web.app/");
        Thread.sleep(2000);

        if (driver.getTitle() != null) {
            System.out.println("Website works properly in Firefox - PASS");
        } else {
            System.out.println("Website does not work properly in Firefox - FAIL");
        }
        driver.quit();
    }
}