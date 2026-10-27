package PradnyaBridalStudioProject;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class VerifyPageHeading {

		public static void main(String[] args) throws InterruptedException {

			ChromeDriver driver = new ChromeDriver();

			driver.manage().window().maximize();
			driver.get("https://pradnya-studio.web.app/");

			Thread.sleep(3000);

			// Home page heading
			WebElement heading = driver.findElement(By.tagName("h1"));

			if (heading.isDisplayed()) {
				System.out.println("PASS : Page heading is displayed");
				System.out.println("Heading : " + heading.getText());
			} else {
				System.out.println("FAIL : Page heading is not displayed");
			}

			driver.quit();
		}
	}
