package PopUpAssignment;
import java.time.LocalDate;       
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

     public class EasyTrip {
		public static void main(String[] args) {
//			ChromeDriver driver= new ChromeDriver();
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--disable-notifications");
			WebDriver driver = new ChromeDriver(options);
			driver.manage().window().maximize();
			driver.get("https://www.easemytrip.com/");
			driver.findElement(By.xpath("//div[text()='Departure']")).click();
			driver.findElement(By.xpath("//div[contains(@class,'today')]")).click();
			LocalDate future = LocalDate.now().plusDays(120);

			String day = String.valueOf(future.getDayOfMonth());
			String month = future.getMonth().name().substring(0,1)
					+ future.getMonth().name().substring(1).toLowerCase();

			String year = String.valueOf(future.getYear());
			while (true) {
				String currentMonth = driver.findElement(By.xpath("(//div[contains(@class,'month-title')])[2]")).getText();
				if(currentMonth.contains(month) && currentMonth.contains(year))
					break;
				driver.findElement(By.xpath("//div[@data-testid='rightArrow']")).click();
			}
			driver.findElement(By.xpath("//div[text()='"+day+"']")).click();

		}
	}

