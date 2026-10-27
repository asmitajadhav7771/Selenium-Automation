package PradnyaBridalStudioProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BookAppointmentButtonVisibility {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://pradnya-studio.web.app/");

		WebElement button = driver.findElement(By.xpath("//a[contains(@href,'availability')]"));
		if(button.isDisplayed())
		{
			System.out.println("Book Appointment Button is Visible");
		}
		else
		{
			System.out.println("Book Appointment Button is not Visible");
		}

		driver.quit();
	}
}