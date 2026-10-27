package PradnyaBridalStudioProject;

	import org.openqa.selenium.By;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class GalleryPreviewSection {

	    public static void main(String[] args) throws InterruptedException {

	        WebDriver driver = new ChromeDriver();

	        driver.get("https://pradnya-studio.web.app/");
            Thread.sleep(2000);
	        driver.findElement(By.tagName("body")).sendKeys(Keys.PAGE_DOWN);

	        WebElement gallery = driver.findElement(By.xpath("//*[contains(text(),'Gallery')]"));

	        if (gallery.isDisplayed()) {
	            System.out.println("Gallery preview is displayed - PASS");
	        } else {
	            System.out.println("Gallery preview is not displayed - FAIL");
	        }

	        driver.quit();
	    }
	}

