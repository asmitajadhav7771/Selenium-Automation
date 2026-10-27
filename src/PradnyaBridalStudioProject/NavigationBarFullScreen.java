package PradnyaBridalStudioProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationBarFullScreen {
    public static void main(String[] args) throws InterruptedException {
    	
        WebDriver driver = new ChromeDriver();
        driver.get("https://pradnya-studio.web.app/");
        Thread.sleep(2000);
        driver.manage().window().maximize();
        Thread.sleep(2000);
        
         WebElement navBar = driver.findElement(By.xpath("//nav"));

        if (navBar.isDisplayed()) {
            System.out.println("PASS - Navigation bar is visible");
        } else {
            System.out.println("FAIL - Navigation bar is not visible");
        }

        driver.quit();
    }
}