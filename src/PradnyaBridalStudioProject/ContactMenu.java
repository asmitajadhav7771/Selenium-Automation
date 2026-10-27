package PradnyaBridalStudioProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ContactMenu {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://pradnya-studio.web.app/");
		Thread.sleep(2000);		
		driver.findElement(By.xpath("//span[text()='Contact']")).click();

		String url = driver.getCurrentUrl();
		if(url.contains("contact"))
		{
			System.out.println("Test Case is Pass");
		}
		else
		{
			System.out.println("Test Case is Fail");
		}

		driver.quit();
	}
}



