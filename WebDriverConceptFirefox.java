package SeleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverConceptFirefox {
    public static void main(String[] args) {
        System.setProperty("webdrive.edge.driver","C:\\Users\\heman\\IdeaProjects\\Software\\Driver\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver() ;
        driver.get("https://www.nopcommerce.com/en");



    }
}
