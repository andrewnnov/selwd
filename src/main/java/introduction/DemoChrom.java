package introduction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoChrom {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Projects\\selwd\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.ru/");
        System.out.println(driver.getTitle());

        System.out.println(driver.getCurrentUrl()); //validate correct url
        System.out.println(driver.getPageSource());

        driver.get("https://www.yahoo.com/");
        driver.navigate().back();
        driver.navigate().forward();
        driver.close(); //it closes current browser
        //driver.quit(); //it closes all the browsers opened by selenium script




    }


}
