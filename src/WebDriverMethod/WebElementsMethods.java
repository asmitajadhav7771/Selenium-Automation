package WebDriverMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

class WebElementsMethods {
public static void main(String[] args) throws InterruptedException {
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--disable-notifications");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://www.myntra.com/");
	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
    WebElement men = driver.findElement(By.xpath("//a[@data-reactid='21'and text()='Men']"));
    //check men section is displayed
	System.out.println(men.isDisplayed());
	//step to move the cursor to the men so that sweatshirts element will be displayed
	Actions act = new Actions(driver);
	act.moveToElement(men).perform();
    WebElement sweatshirts = driver.findElement(By.xpath("//a[@data-reactid='37'and text()='Sweatshirts']"));
    //check Sweatshirt is displayed
    wait.until(ExpectedConditions.visibilityOf(sweatshirts));
	System.out.println("Sewatshirts product:"+sweatshirts.isDisplayed());
	sweatshirts.click();
	
	WebElement first_checkbox1 = driver.findElement(By.xpath("//div[@class='common-checkboxIndicator'])[1]"));
	WebElement first_checkbox2 = driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
	//find Enable
	System.out.println("check enability:"+first_checkbox1.isEnabled());

	//before selection
    System.out.println("checkbox before select :"+first_checkbox2.isSelected());
    //after selection
    wait.until(ExpectedConditions.elementToBeClickable(first_checkbox1));
    first_checkbox1.click();
    wait.until(ExpectedConditions.elementToBeClickable(first_checkbox2));
    System.out.println("checkbox after select :"+first_checkbox2.isSelected());
    
    
    
}
}
