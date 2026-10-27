package PradnyaBridalStudioProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BannerImage {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://pradnya-studio.web.app/");

		WebElement banner = driver.findElement(By.xpath("//section/div/div/div[2]//img"));
		if(banner.isDisplayed())
		{
			System.out.println("Banner page is Displayed");
		}
		else
		{
			System.out.println("Banner page is not Displayed");
		}

		driver.quit();
	}
}