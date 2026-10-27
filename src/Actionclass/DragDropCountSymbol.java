package Actionclass;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDropCountSymbol {
    public static void main(String[] args) throws InterruptedException {
    	int count1 = 0;
    	int count2 = 0;
    	int count3 = 0;
    	ChromeDriver driver = new ChromeDriver();
    	driver.manage().window().maximize();
    	driver.get("https://demo.automationtesting.in/Dynamic.html");
    	Random r = new Random();
    	Actions act = new Actions(driver);
    	WebElement a = driver.findElement(By.id("angular"));
    	WebElement b = driver.findElement(By.id("mongo"));
    	WebElement c = driver.findElement(By.id("node"));
    	WebElement a1 = driver.findElement(By.id("droparea"));
    	
    	for(int i =0 ; i <9 ;) {
    		int num = r.nextInt(10);
    		if(num>=1&&num<=3)
    		{
    			if(num==1) {
    				act.dragAndDrop(a, a1).perform();
    				count1++;
    			}else if (num==2) {
    				act.dragAndDrop(b, a1).perform();
    				count2++;
    			}else {
    				act.dragAndDrop(c, a1).perform();
    				count3++;
    			}
    			i++;
    			Thread.sleep(1000);
    		}
    	}
    	System.out.println("a:"+count1);
    	System.out.println("b:"+count2);
    	System.out.println("c:"+count3);
    	
    	

    }
}