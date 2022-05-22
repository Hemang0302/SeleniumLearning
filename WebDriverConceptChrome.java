package SeleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverConceptChrome {
    public static void main(String[] args) {

        //2.set up chrome driver path
        System.setProperty("webdriver.chrome.driver","C:\\Users\\heman\\IdeaProjects\\Software\\Driver\\chromedriver.exe");

        //1.create and instance for driver
        WebDriver driver = new ChromeDriver();

        //3.navigate to web page
        driver.get("https://www.nopcommerce.com/en/demo");
    }
}
