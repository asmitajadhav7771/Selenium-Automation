package PradnyaBridalStudioProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PhoneNumber {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://pradnya-studio.web.app/");
        Thread.sleep(2000);
        WebElement phone = driver.findElement(By.xpath("//a[text()='Call Studio']"));phone.click();

        WebElement number = driver.findElement(By.xpath("PHONE NUMBER CHA XPATH"));

        if (number.isDisplayed()) {
            System.out.println("Phone number is displayed after clicking - PASS");
        } else {
            System.out.println("Phone number is not displayed - FAIL");
        }

        driver.quit();
    }
}