package PradnyaBridalStudioProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PhoneNumberVisibility {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.get("https://pradnya-studio.web.app/");
        Thread.sleep(2000);
        WebElement phone = driver.findElement(By.xpath("//span[text()='Call Studio']"));

        if (phone.isDisplayed()) {
            System.out.println("Phone number is clearly visible - PASS");
        } else {
            System.out.println("Phone number is not visible - FAIL");
        }

        driver.quit();
    }
}
