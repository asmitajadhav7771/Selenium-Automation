package WebDriverMethod;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FooterSection {
	public static void main(String[] args) throws InterruptedException {
		String expected_url = "https://demowebshop.tricentis.com/news/rss/1";
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
	    Thread.sleep(2000);
	    List<WebElement> links = driver.findElements(By.xpath("//div[@class = 'column follow-us']/ul/li/a"));
	    for(WebElement web : links) {
	    	web.click();
	
	    String actual_url = driver.getCurrentUrl();
	    if(expected_url.equals(actual_url)) {
	    	driver.navigate().back();
	    }
	    Thread.sleep(1000);
	   
}
}
}