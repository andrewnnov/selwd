package introduction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DemoEdge {

    public static void main(String[] args) {

        System.setProperty("webdriver.edge.driver", "C:\\Projects\\selwd\\driver\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.google.ru/");
        System.out.println(driver.getTitle());
    }


}
