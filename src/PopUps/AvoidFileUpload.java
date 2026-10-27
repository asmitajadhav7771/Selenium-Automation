package PopUps;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AvoidFileUpload {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.ilovepdf.com/word_to_pdf");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\selenium Popup\\Automation Testing.docx");

}
}
