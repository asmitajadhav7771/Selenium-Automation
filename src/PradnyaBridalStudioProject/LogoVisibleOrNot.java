package PradnyaBridalStudioProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogoVisibleOrNot {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://pradnya-studio.web.app/");
	Thread.sleep(2000);
    WebElement logo = driver.findElement(By.xpath("//img[@class='h-16 w-16 object-cover']"));
if(logo.isDisplayed()) {
	System.out.println("Logo is Visible");
}
else {
	System.out.println("Logo is not Visible");
}
//Navigation Bar
WebElement navigationbar = driver.findElement(By.xpath("//nav[@class='flex items-center justify-center']"));
if(navigationbar.isDisplayed()) {
	  System.out.println("Navigationbar Page Is Displayed");
}
else {
	  System.out.println("Navigation Page Is Not Displayed");
}
//Each Section Is Display OR Not In Navigation Bar

//Services
  WebElement services = driver.findElement(By.xpath("//span[text()='Services']"));
  if(services.isDisplayed()) {
	  System.out.println("Services Page Is Displayed");
  }
  else {
	  System.out.println("Services Page Is Not Displayed");
  }
  //Portfolio
  
  WebElement portfolio = driver.findElement(By.xpath("//span[text()='Portfolio']"));
  if(portfolio.isDisplayed()) {
	  System.out.println("Portfolio Page Is Displayed");
  }
  else {
	  System.out.println("Portfolio Page Is Not Displayed");
  }
  
  //Transformations
  WebElement transformations = driver.findElement(By.xpath("//span[text()='Transformations']"));
  if(transformations.isDisplayed()) {
	  System.out.println("Transformations Page Is Displayed");
  }
  else {
	  System.out.println("Transformations Page Is Not Displayed");
  }
  //Package
  WebElement packages = driver.findElement(By.xpath("//span[text()='Packages']"));
  if(packages.isDisplayed()) {
	  System.out.println("Packages Page Is Displayed");
  }
  else {
	  System.out.println("Packages Page Is Not Displayed");
  }
  //About
  WebElement about = driver.findElement(By.xpath("//span[text()='About']"));
  if(about.isDisplayed()) {
	  System.out.println("About Page Is Displayed");
  }
  else {
	  System.out.println("About Page Is Not Displayed");
  }
  //Review
  WebElement reviews = driver.findElement(By.xpath("//span[text()='Reviews']"));
  if(reviews.isDisplayed()) {
	  System.out.println("Review Page Is Displayed");
  }
  else {
	  System.out.println("Review Page Is Not Displayed");
  }
  //Blog
  WebElement blog = driver.findElement(By.xpath("//span[text()='Blog']"));
  if(blog.isDisplayed()) {
	  System.out.println("Blog Page Is Displayed");
  }
  else {
	  System.out.println("Blog Page Is Not Displayed");
  }
  //Contact
  WebElement contact = driver.findElement(By.xpath("//span[text()='Contact']"));
  if(contact.isDisplayed()) {
	  System.out.println("Contact Page Is Displayed");
  }
  else {
	  System.out.println("Contact Page Is Not Displayed");
  }
  
  driver.close();
}
}