package PradnyaBridalStudioProject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

	public class ServicesSection {
	  public static void main(String[] args) throws InterruptedException {

	    WebDriver driver = new ChromeDriver();

	    driver.get("https://pradnya-studio.web.app/");
	    Thread.sleep(2000);
	    WebElement services = driver.findElement(By.xpath("//a[text()='Our Services']"));
	    Actions a = new Actions(driver);
	    a.moveToElement(services).perform();


	        if (services.isDisplayed()) {
	            System.out.println("Services section is displayed - PASS");
	        } else {
	            System.out.println("Services section is not displayed - FAIL");
	        }

	        driver.quit();
	    }
	}

