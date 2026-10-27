package PradnyaBridalStudioProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FooterSection {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://pradnya-studio.web.app/");
        Thread.sleep(2000);

        WebElement footer = driver.findElement(By.tagName("footer"));
        Actions act = new Actions(driver);
        act.moveToElement(footer).perform();

        if (footer.isDisplayed()) {
            System.out.println("Footer section is displayed successfully - PASS");
        } else {
            System.out.println("Footer section is not displayed - FAIL");
        }
        driver.quit();
    }
}