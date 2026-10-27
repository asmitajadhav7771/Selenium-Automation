package PradnyaBridalStudioProject;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class ImagesLoadedOrNot {
	
	public static void main(String[] args) {

	    WebDriver driver = new ChromeDriver();

	    driver.get("https://pradnya-studio.web.app/");

	    List <WebElement> images = driver.findElements(By.tagName("img"));

	    for (WebElement image : images) {

	        if (image.isDisplayed()) {
	            System.out.println("Image is loaded - PASS");
	        } else {
	            System.out.println("Image is not loaded - FAIL");
	        }
	    }

	    driver.quit();
	}
}
