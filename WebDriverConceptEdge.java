package SeleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.sql.Driver;

public class WebDriverConceptEdge {
    public static void main(String[] args) {
      //2.setup edge driver path
        System.setProperty("webdriver.edge.driver","C:\\Users\\heman\\IdeaProjects\\Software\\Driver\\MsEdgeDriver.exe");

        // 1.create and instant for driver
        WebDriver driver = new EdgeDriver();

        //3.navigate to web page
        driver.get("https://www.nopcommerce.com/en");


    }
}
