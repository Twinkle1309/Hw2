package ie;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Web2 {
    public static void main(String[] args) {
        System.setProperty("Webdriver.gecko.driver","C:\\software\\Driver\\geckodriver.exe ");
        WebDriver driver= new FirefoxDriver();
driver.get("https://demo.nopcommerce.com/");
driver.close();
driver.quit();
    }
}
