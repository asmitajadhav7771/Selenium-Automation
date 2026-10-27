package DropDownMenu;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectAll {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Admin/Downloads/demo%20(2).html");
		Thread.sleep(1000);
		WebElement single = driver.findElement(By.id("standard_cars"));
	    Select sel = new Select (single);
	    //selectAll without inbuild method
//	    List<WebElement> options = driver.findElements(By.xpath("//select[@id='standard_cars']/option"));
//        int optionCount= options.size();
//	    for(int i= 0; i<optionCount; i++) {
//	    	sel.selectByIndex(i);
//	    	Thread.sleep(1000);
//	    }
//	    driver.close();
	    //selectAll with inbuild method
	    List<WebElement> options = sel.getOptions();
	    int i = 0;
	    for(WebElement web : options) {
	    	sel.selectByIndex(i++);
	    	Thread.sleep(1000);
	    	
	    }
	    
	    	
	    }
}
