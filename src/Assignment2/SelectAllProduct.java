package Assignment2;
import org.openqa.selenium.By;		
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectAllProduct {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("asmita1419@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("asmita@12");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='RememberMe']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[contains(text(),'Digital downloads')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@value='Add to cart'])")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@value='Add to cart'])")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@value='Add to cart'])")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@name='removefromcart'])")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@name='removefromcart'])")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@name='removefromcart'])")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@name='updatecart'])")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//a[text()='Log out'])")).click();
		Thread.sleep(2000);
		driver.close();
	}
}

	