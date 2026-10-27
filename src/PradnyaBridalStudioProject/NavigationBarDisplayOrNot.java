package PradnyaBridalStudioProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationBarDisplayOrNot {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://pradnya-studio.web.app/");
	Thread.sleep(2000);
	WebElement navigation = driver.findElement(By.xpath("//nav[@class='flex items-center justify-center']"));
	if(navigation.isDisplayed()) {
		System.out.println("Navigation Bar is Displayed");
	}
	else {
		System.out.println("Navigation Bar is Not Displayed");
	}
	driver.close();

}
}
