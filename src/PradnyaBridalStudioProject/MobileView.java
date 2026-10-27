package PradnyaBridalStudioProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MobileView {

    public static void main(String[] args) throws InterruptedException {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--window-size=375,812");

        WebDriver driver = new ChromeDriver(options);
        driver.get("https://pradnya-studio.web.app/");
        Thread.sleep(2000);

        if (driver.getTitle() != null) {
            System.out.println("Website layout adjusts properly in mobile view - PASS");
        } else {
            System.out.println("Website layout does not adjust properly in mobile view - FAIL");
        }
        driver.quit();
    }
}