package Assignment2;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MultipleChildBrowser2 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demowebshop.tricentis.com/");

		String parent = driver.getWindowHandle();
		Actions act = new Actions(driver);
		act.sendKeys(Keys.END).perform();
		Thread.sleep(2000);
		List<WebElement> links = driver.findElements(By.xpath("//a[@target='_blank']"));
		// Click all links
		for (WebElement link : links) {
			link.click();
			Thread.sleep(1000);
		}
	
		Set<String> allHandles = driver.getWindowHandles();
		for (String id : allHandles) {

			driver.switchTo().window(id);

			String url = driver.getCurrentUrl();

			if (url.contains("facebook")) {

				System.out.println("Facebook Page");
				System.out.println(driver.getTitle());

			} else if (url.contains("twitter")) {

				System.out.println("Twitter Page");
				System.out.println(driver.getTitle());

			} else if (url.contains("rss")) {

				System.out.println("RSS Page");
				System.out.println(driver.getTitle());

			} else if (url.contains("youtube")) {

				System.out.println("YouTube Page");
				System.out.println(driver.getTitle());
			} else {

				System.out.println("Google Page");
				System.out.println(driver.getTitle());
			}
		}
		for (String id : allHandles) {
			if (!id.equals(parent)) {
				driver.switchTo().window(id);
				driver.close();
			}
		}
		driver.switchTo().window(parent);
		driver.quit();

	}

}