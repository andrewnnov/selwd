package main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class HuaweiTest {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Projects\\selwd\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get("https://www.labirint.ru/");
        WebElement link = driver.findElement(By.xpath("//a[text()='Книги']"));
        WebElement element = driver.findElement(By.xpath("//a[text()='Книги']"));
        Actions actions = new Actions(driver);
        actions.moveToElement(link).build().perform();

        actions.dragAndDrop(element, link).build().perform();

        actions.clickAndHold(element).moveToElement(link).release().build().perform();

        Action action = 




    }
}
