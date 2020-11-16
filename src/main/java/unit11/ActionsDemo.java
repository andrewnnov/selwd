package unit11;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class ActionsDemo {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Projects\\selwd\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://www.labirint.ru/");
        Actions a = new Actions(driver);
        WebElement move = driver.findElement(By.xpath("//a[@class='b-header-b-menu-e-text' and text()='Книги']"));

        //write down capital letter in input field
        a.moveToElement(driver.findElement(By.id("search-field"))).click().keyDown(Keys.SHIFT).sendKeys("hello").build()
                .perform();
        //write down and double click on this element
        a.moveToElement(driver.findElement(By.id("search-field"))).click().keyDown(Keys.SHIFT).sendKeys("doubleclick")
                .doubleClick().build().perform();

        //move to mouse on element - book
        //context click - right btn click
        a.moveToElement(move).contextClick().build().perform();

    }
}
