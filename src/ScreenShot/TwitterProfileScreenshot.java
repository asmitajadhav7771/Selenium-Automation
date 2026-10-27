package ScreenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import com.google.common.io.Files;

public class TwitterProfileScreenshot {
	public static void main(String[] args) throws IOException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://x.com/actorvijay");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		WebElement profile = driver.findElement(By.xpath("//a[@aria-label='Opens profile photo']//img"));		// Take screenshot of WebElement
		File to = profile.getScreenshotAs(OutputType.FILE);
		File from = new File("C:\\selenium Popup\\ProfileIcon.png");
		Files.copy(to, from);
		driver.quit();
	}
}