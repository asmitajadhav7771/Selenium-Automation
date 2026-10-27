package PopUpAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DisabledCalendar {
	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Datepicker.html");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		WebElement month = driver.findElement(By.className("ui-datepicker-month"));
		Select s1 = new Select(month);
		s1.selectByVisibleText("December");
		WebElement year = driver.findElement(By.className("ui-datepicker-year"));
		Select s2 = new Select(year);
		s2.selectByVisibleText("2012");
		driver.findElement(By.xpath("//a[text()='12']")).click();

	}

}

