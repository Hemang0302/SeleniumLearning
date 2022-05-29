package SeleniumSession;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginFunctionality {
    public static void main(String[] args) throws InterruptedException {
       // 1) Google Chrome Boni Gracia
        WebDriverManager.chromedriver().setup();
                WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/");
        Thread.sleep(2000);
        driver.findElement(By.className("ico-login")).click();
        Thread.sleep(1000);
        driver.findElement(By.className("email")).sendKeys("hemangpatel@gmail.com");
        driver.findElement(By.id("Password")).sendKeys("test123");
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button")).click();




     //   2) Edge Boni Gracia
//        WebDriverManager.edgedriver().setup();
//        WebDriver driver = new EdgeDriver();
//        driver.manage().window().maximize();
//        driver.get("https://demo.nopcommerce.com/");
//        Thread.sleep(2000);
//        driver.findElement(By.className("ico-login")).click();
//        Thread.sleep(1000);
//        driver.findElement(By.className("email")).sendKeys("hemangpatel@gmail.com");
//        driver.findElement(By.id("Password")).sendKeys("test123");
//        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button")).click();

        // 3) |Firefox Boni Gracia

//        WebDriverManager.firefoxdriver().setup();
//        WebDriver driver = new FirefoxDriver();
//        driver.manage().window().maximize();
//        driver.get("https://demo.nopcommerce.com/");
//        Thread.sleep(2000);
//        driver.findElement(By.className("ico-login")).click();
//        Thread.sleep(1000);
//        driver.findElement(By.className("email")).sendKeys("hemangpatel@gmail.com");
//        driver.findElement(By.id("Password")).sendKeys("test123");
//        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button")).click();
    }


}
