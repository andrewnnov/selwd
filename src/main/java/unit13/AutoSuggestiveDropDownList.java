package unit13;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class AutoSuggestiveDropDownList {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Projects\\selwd\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.makemytrip.com/");

        WebElement fromCity = driver.findElement(By.id("fromCity"));
        fromCity.sendKeys("MUM", Keys.ARROW_DOWN, Keys.ENTER);

//        WebElement toCity = driver.findElement(By.id("toCity"));
//        toCity.sendKeys("del");
//        toCity.sendKeys(Keys.ARROW_DOWN, Keys.ENTER);
        driver.findElement(By.xpath("//div[@class='react-autosuggest__container react-autosuggest__container--open']/input")).sendKeys("del");
        driver.findElement(By.xpath("//div[@class='react-autosuggest__container react-autosuggest__container--open']/input")).sendKeys(Keys.ARROW_DOWN, Keys.ENTER);


    }
}
