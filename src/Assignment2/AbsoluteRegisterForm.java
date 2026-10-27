package Assignment2;

import org.openqa.selenium.By;
	import org.openqa.selenium.chrome.ChromeDriver;

public class AbsoluteRegisterForm {
	public static void main(String[] args) throws InterruptedException {

   ChromeDriver driver = new ChromeDriver();
   driver.manage().window().maximize();
   driver.get("https://demowebshop.tricentis.com/");

   driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a")).click();
   Thread.sleep(2000);
   driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/form/div/div[2]/div[2]/div[2]/div[1]/div[2]/input")).click();
   driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/form/div/div[2]/div[2]/div[2]/div[2]/input")).sendKeys("Asmita");
   driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/form/div/div[2]/div[2]/div[2]/div[3]/input")).sendKeys("Jadhav");
   driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/form/div/div[2]/div[2]/div[2]/div[4]/input")).sendKeys("asmitajadhav123@gmail.com");
   driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/form/div/div[2]/div[3]/div[2]/div[1]/input")).sendKeys("Asmita@123");
   driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/form/div/div[2]/div[3]/div[2]/div[2]/input")).sendKeys("Asmita@123");
   driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/form/div/div[2]/div[4]/input")).click();
   Thread.sleep(3000);
   driver.close();
		}
	}

