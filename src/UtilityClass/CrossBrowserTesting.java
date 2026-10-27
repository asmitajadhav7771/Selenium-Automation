package UtilityClass;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

public class CrossBrowserTesting {
public static void main(String[] args) {
	String browser = "firefox";
	
	if(browser.equalsIgnoreCase("chrome")) {
		ChromeDriver driver= new ChromeDriver();
	}
	else if(browser.equalsIgnoreCase("Edge")) {
		EdgeDriver driver = new EdgeDriver();
	}
	else if(browser.equalsIgnoreCase("fireforx")) {
		FirefoxDriver driver = new FirefoxDriver();
	}
	else if(browser.equalsIgnoreCase("safari")) {
		SafariDriver driver = new SafariDriver();
	}
	else if(browser.equalsIgnoreCase("internetExplorer")) {
		InternetExplorerDriver driver = new InternetExplorerDriver();
	}
	else {
		ChromeDriver driver = new ChromeDriver();
	}
	System.out.println("execution done");
}
}
