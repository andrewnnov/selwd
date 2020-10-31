package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class RediffE2E {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Projects\\selwd\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://www.rediff.com/");
        driver.findElement(By.cssSelector("a[title*='Sign in']")).click(); //- CSS reg exp
        driver.findElement(By.xpath("//input[@id='login1']")).sendKeys("Username1");
        driver.findElement(By.cssSelector("input#password")).sendKeys("Password");

        driver.findElement(By.xpath("//input[contains(@value, 'Sign')]")).click();

    }
}
