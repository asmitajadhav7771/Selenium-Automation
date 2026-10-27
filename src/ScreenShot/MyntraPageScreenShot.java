package ScreenShot;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class MyntraPageScreenShot {
public static void main(String[] args) throws InterruptedException, IOException {
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.myntra.com/");
	Thread.sleep(2000);
	TakesScreenshot ts = (TakesScreenshot) driver;
	File from = ts.getScreenshotAs(OutputType.FILE);
	File to = new File("C:\\selenium Popup\\myntra.png");
	FileHandler.copy(from, to);
	Thread.sleep(1000);
	driver.quit();
}
}

