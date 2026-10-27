package Actionclass;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Try2 {

    public static void main(String[] args) throws Exception {

        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.automationtesting.in/Dynamic.html");
        Thread.sleep(2000);

        Actions act = new Actions(driver);
        Random r = new Random();

        List<WebElement> boxes =driver.findElements(By.xpath("//div[@id='droparea']/div"));
             
        int countS = 0;
        int countAT = 0;
        int countSe = 0;

        for (int i = 0; i < boxes.size(); i++) {

            
            WebElement angular = driver.findElement(By.id("angular"));
            WebElement mongo = driver.findElement(By.id("mongo"));
            WebElement selenium = driver.findElement(By.id("node"));

            int n = r.nextInt(3);

            if (n == 0) {
                act.dragAndDrop(angular, boxes.get(i)).perform();
                countS++;
            }
            else if (n == 1) {
                act.dragAndDrop(mongo, boxes.get(i)).perform();
                countAT++;
            }
            else {
                act.dragAndDrop(selenium, boxes.get(i)).perform();
                countSe++;
            }

            Thread.sleep(500);
        }
       
        System.out.println("S = " + countS);
        System.out.println("AT = " + countAT);
        System.out.println("Se = " + countSe);
    }
}