package ActualTestCase;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginWithValidCreditential {

    public static WebDriver driver = null;
    public static String browser = "chrome";

    public static void main(String[] args) throws Exception {

        String expected_url = "https://demowebshop.tricentis.com/";

        if (browser.equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("edge")) {
            driver = new EdgeDriver();
        } else if (browser.equalsIgnoreCase("firefox")) {
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("safari")) {
            driver = new SafariDriver();
        } else if (browser.equalsIgnoreCase("internetExplorer")) {
            driver = new InternetExplorerDriver();
        } else {
            driver = new ChromeDriver();
        }

        driver.manage().window().maximize();
        driver.get(expected_url);

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

        // Login
        driver.findElement(By.className("ico-login")).click();
        driver.findElement(By.id("Email")).sendKeys("manu2305@gmail.com");
        driver.findElement(By.id("Password")).sendKeys("manu2305");
        driver.findElement(By.cssSelector(".button-1.login-button")).click();

        // Scroll to product
        WebElement product2 = driver.findElement(By.xpath("(//input[@value='Add to cart'])[2]"));

        Actions act = new Actions(driver);
        act.scrollToElement(product2).perform();

        wait.until(ExpectedConditions.elementToBeClickable(product2));
        product2.click();

        // Open cart
        WebElement cart = driver.findElement(By.className("ico-cart"));
        wait.until(ExpectedConditions.elementToBeClickable(cart));
        cart.click();

        // Verify product
        List<WebElement> laptop14inch = driver.findElements(By.xpath("//a[text()='14.1-inch Laptop']"));

        if (laptop14inch.size() > 0) {
            System.out.println("14.1-inch Laptop is added successfully Test Case is Passed");
        } else {
            System.out.println("Product is not added Test Case is Failed");
        }

        // Verify Login
        if (driver.findElements(By.className("account")).size() > 0) {
            System.out.println("Login Successful Test Case Passed");
        } else {
            throw new Exception("Login Failed Test Case Failed");
        }

        driver.quit();
    }
}