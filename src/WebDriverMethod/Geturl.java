package WebDriverMethod;

import org.openqa.selenium.chrome.ChromeDriver;

public class Geturl {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/digital-downloads");
		String currenturl = driver.getCurrentUrl();
		System.out.println(currenturl);
        String currentTitle = driver.getTitle();
        System.out.println(currentTitle);
}
}