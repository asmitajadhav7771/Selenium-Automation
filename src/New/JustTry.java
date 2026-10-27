package New;

import org.openqa.selenium.chrome.ChromeDriver;

public class JustTry {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://omayo.blogspot.com/");
	Thread.sleep(2000);
	String currenturl = driver.getCurrentUrl();
	System.out.println(currenturl);
    String currentTitle = driver.getTitle();
    System.out.println(currentTitle);
	
}
}
