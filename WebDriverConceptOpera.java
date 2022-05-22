package SeleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;

public class WebDriverConceptOpera {
    public static void main(String[] args) {
        System.setProperty("webdriver.opera.driver","C:\\Users\\heman\\IdeaProjects\\Software\\Driver\\operadriver.exe");
        WebDriver driver = new OperaDriver();
        driver.get("https://www.nopcommerce.com/en");
    }
}
