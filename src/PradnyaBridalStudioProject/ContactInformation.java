package PradnyaBridalStudioProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ContactInformation {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://pradnya-studio.web.app/");
        Thread.sleep(2000);
        WebElement contact = driver.findElement(By.xpath("//span[text()='Contact']"));

        if (contact.isDisplayed()) {
            System.out.println("Contact details are displayed - PASS");
        } else {
            System.out.println("Contact details are not displayed - FAIL");
        }

        driver.quit();
    }
}
