package PradnyaBridalStudioProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FooterAlignment {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://pradnya-studio.web.app/");
        Thread.sleep(2000);

        WebElement footer = driver.findElement(By.tagName("footer"));
        Actions act = new Actions(driver);
        act.moveToElement(footer).perform();

        if (footer.isDisplayed()) {
            System.out.println("Footer elements are properly aligned - PASS");
        } else {
            System.out.println("Footer alignment is not proper - FAIL");
        }
        driver.quit();
    }
}