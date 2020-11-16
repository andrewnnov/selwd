package unit11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class ActionsDemo {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Projects\\selwd\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://www.labirint.ru/");
        Actions a = new Actions(driver);
        a.moveToElement(driver.findElement(By.xpath("//a[@class='b-header-b-menu-e-text' and text()='Книги']"))).build()
                .perform();

    }
}
