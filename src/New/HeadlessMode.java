package New;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessMode {
	public static void main(String[] args) {
		System.out.println("open");
		ChromeOptions options = new ChromeOptions();
		List<String> str = new ArrayList<String>();
		str.add("--incognito");
		str.add("--headless");
		options.addArguments(str);
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		System.out.println(14/0);
		driver.quit();
		System.out.println("close");
		
	}
}
