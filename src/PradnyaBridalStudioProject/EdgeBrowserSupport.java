package PradnyaBridalStudioProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeBrowserSupport {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new EdgeDriver();
        
        driver.get("https://pradnya-studio.web.app/");
        Thread.sleep(2000);

        if (driver.getTitle() != null) {
            System.out.println("Website works properly in Microsoft Edge - PASS");
        } else {
            System.out.println("Website does not work properly in Microsoft Edge - FAIL");
        }
        driver.quit();
    }
}