package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LocatorExample {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Projects\\selwd\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.facebook.com/");

        driver.findElement(By.xpath("//form[@class='_featuredLogin__formContainer']//a[@role='button']")).click();
        driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Name");
        driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("lastName");


        driver.get("https://www.facebook.com/");
        //tagName[attribute='value']
        driver.findElement(By.cssSelector("form a[role='button']")).click();
        driver.findElement(By.cssSelector("input[name='firstname']")).sendKeys("NameCSS");
        driver.findElement(By.cssSelector("input[name='lastname']")).sendKeys("lastNameCSS");





    }
}
