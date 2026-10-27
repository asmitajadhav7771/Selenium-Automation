package PradnyaBridalStudioProject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Keys;

public class TestimonialsSection {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://pradnya-studio.web.app/");

        driver.findElement(By.tagName("body")).sendKeys(Keys.PAGE_DOWN);
        driver.findElement(By.tagName("body")).sendKeys(Keys.PAGE_DOWN);

        List<WebElement> testimonials =
                driver.findElements(By.xpath("//*[contains(text(),'Testimonials')]"));

        if (testimonials.size() > 0) {
            System.out.println("Testimonials section is displayed - PASS");
        } else {
            System.out.println("Testimonials section is not displayed - FAIL");
        }

        driver.quit();
    }
}
	