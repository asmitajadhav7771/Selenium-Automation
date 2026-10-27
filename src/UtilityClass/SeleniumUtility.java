package UtilityClass;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

import zmq.ZError.IOException;

public class SeleniumUtility {
public static void webpageScreenshot(WebDriver driver,String name) throws java.io.IOException   {
	TakesScreenshot ts = (TakesScreenshot)driver;
	File from = ts.getScreenshotAs(OutputType.FILE);
	File to = new File("c:\\Selenium\\"+name+".png");
	try {
		FileHandler.copy(from, to);
	}
	catch (IOException e) {
		//TODO Auto-generated catch block
		e.printStackTrace();
		
	}
}
public static void Element(WebElement element , String name) throws java.io.IOException {
	File from = element.getScreenshotAs(OutputType.FILE);
	File to = new File("C:\\Selenium\\"+name+".png");
	try {
		FileHandler.copy(from, to);
	}catch (IOException e) {
		//TODO Auto-generated catch block
		e.printStackTrace();
	}
}
public static void ElementScreenshot(WebElement zomato_icon, String name) {
	// TODO Auto-generated method stub
	
}
}
