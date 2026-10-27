package PradnyaBridalStudioProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class VerifyTestimonialText {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.get("https://pradnya-studio.web.app/");
		Thread.sleep(2000);

		WebElement testimonial = driver.findElement(By.xpath("//button[text()='View All Reviews']"));

		Actions action = new Actions(driver);
		action.scrollToElement(testimonial).perform();

		if (testimonial.isDisplayed()) {
			System.out.println("Testimonial text is clear and readable");
			
		} else {
			System.out.println("Testimonial text is not readable");
			}

		driver.quit();
	}
}