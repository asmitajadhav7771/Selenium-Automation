package PradnyaBridalStudioProject;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class VerifyBookAppointmentButtonVisibility {

		public static void main(String[] args) throws InterruptedException {

			ChromeDriver driver = new ChromeDriver();

			driver.manage().window().maximize();
			driver.get("https://pradnya-studio.web.app/");

			Thread.sleep(3000);

			WebElement bookAppointment = driver.findElement(By.xpath("//a[contains(text(),'Book')]"));

			if (bookAppointment.isDisplayed()) {
				System.out.println("PASS : Book Appointment button is visible");
			} else {
				System.out.println("FAIL : Book Appointment button is not visible");
			}

			driver.quit();
		}
	}

