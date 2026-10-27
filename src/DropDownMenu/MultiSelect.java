package DropDownMenu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelect {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Admin/Downloads/demo%20(1).html");
		Thread.sleep(1000);
		WebElement multiple = driver.findElement(By.id("multiple_cars"));
	    //Select
		 Select sel = new Select (multiple);
		//sel.selectByVisibleText("BMW");
		//Thread.sleep(1000);
		//sel.selectByValue("for");
		//Thread.sleep(1000);
		//sel.selectByIndex(4);
		
		//Deselect
		//sel.deselectByVisibleText("BMW");
		/*Thread.sleep(1000);
		sel.deselectByValue("for");
		Thread.sleep(1000);
		sel.deselectByIndex(4);
		sel.deselectAll();*/
		
		//verify dropdown
		sel.selectByIndex(1);
		if(sel.isMultiple()) {
		  sel.deselectByIndex(1);
		System.out.println("Deselect is performed....");
	}
	else {
		System.out.println("deselect can't be performed Because it is a single Select dropdown menu");
		
	}
	}
}
