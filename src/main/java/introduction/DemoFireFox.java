package introduction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoFireFox {

    public static void main(String[] args) {

        System.setProperty("webdriver.gecko.driver", "C:\\Projects\\selwd\\driver\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

        driver.get("https://www.google.ru/");
        System.out.println(driver.getTitle());
    }


}
