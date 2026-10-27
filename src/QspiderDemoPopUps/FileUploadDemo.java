package QspiderDemoPopUps;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.Select;

	public class FileUploadDemo {

		public static void main(String[] args) throws InterruptedException {
			ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://demoapps.qspiders.com/ui/fileUpload?sublist=0");
            Thread.sleep(2000);			
			driver.findElement(By.xpath("//input[@id='fullName']")).sendKeys("Asmita Jadhav");
			 Thread.sleep(1000);		
			driver.findElement(By.xpath("//input[@type='email']")).sendKeys("asmita123@gmail.com");
			 Thread.sleep(1000);
		     driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Asmita@123");
			 Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@id='mobile']")).sendKeys("9876543210");
			 Thread.sleep(1000);
			
			WebElement city = driver.findElement(By.id("city"));
			Select sel = new Select(city);
			sel.selectByVisibleText("Pune");
			 Thread.sleep(1000);
	
			driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\selenium Popup\\Automation Testing.docx");
		    Thread.sleep(1000);
		    
		    WebElement skills = driver.findElement(By.xpath("//select[@aria-invalid='false']"));
			Select s1 = new Select(skills);
			s1.selectByValue("HTML");
			s1.selectByValue("CSS");
			 Thread.sleep(1000);
		    
			driver.findElement(By.xpath("//input[@type='checkbox']")).click();
			 Thread.sleep(1000);
			driver.findElement(By.xpath("//button[text()='Create Profile']")).click();
			Thread.sleep(1000);
			driver.quit();
		}
	}

