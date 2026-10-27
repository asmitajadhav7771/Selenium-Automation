package WAitingConditions;


import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Omayo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		JavascriptExecutor js = (JavascriptExecutor) driver;

		WebElement dropdownBtn = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Dropdown']")));

		js.executeScript("arguments[0].scrollIntoView({block:'center'});", dropdownBtn);
		wait.until(ExpectedConditions.elementToBeClickable(dropdownBtn)).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Facebook']"))).click();

		driver.navigate().back();
		driver.navigate().refresh();
		WebElement timerButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("timerButton")));
				
		js.executeScript("arguments[0].scrollIntoView({block:'center'});", timerButton);
		wait.until(ExpectedConditions.elementToBeClickable(timerButton));
		timerButton.click();
		Alert alert = wait.until(ExpectedConditions.alertIsPresent());
		alert.accept();

		driver.quit();
	}
}