package PopUps;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MultipleTab {

	public static void main(String[] args) throws InterruptedException {
        String expected_url = "https://www.facebook.com/nopCommerce";
		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);

		Actions act = new Actions(driver);
		act.scrollByAmount(0, 1000).perform();
		Thread.sleep(2000);

		List<WebElement> links = driver.findElements(By.xpath("//a[@target='_blank']"));

		for (WebElement web : links) {
			web.click();
			Thread.sleep(2000);
		}
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.google.com");
		Thread.sleep(2000);

		Set<String> childs = driver.getWindowHandles();

		for (String str : childs) {

			driver.switchTo().window(str);
			String actual_url = driver.getCurrentUrl();

			if (actual_url.contains("facebook")) {
				System.out.println("Facebook Window");
				driver.findElement(By.xpath("//span[text()='Create new account']")).click();
				Thread.sleep(2000);

			}

			else if (actual_url.contains("twitter") || actual_url.contains("x.com")) {

				driver.findElement(By.xpath("//input[@aria-label='Search query']")).sendKeys("Selenium");
				driver.findElement(By.xpath("//input[@aria-label='Search query']")).sendKeys(Keys.ENTER);

				Thread.sleep(2000);

			}

			else if (actual_url.contains("youtube")) {
				
				driver.findElement(By.name("search_query")).sendKeys("Java Tutorial");
				driver.findElement(By.name("search_query")).sendKeys(Keys.ENTER);
				Thread.sleep(2000);

			}

			else if (actual_url.contains("google")) {

				driver.findElement(By.name("q")).sendKeys("Automation Testing");
				driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
				Thread.sleep(2000);

			}

			else {

				System.out.println("No Action");

			}
		}

		driver.quit();
	}
}
