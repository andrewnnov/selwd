package main;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;



public class HuaweiTest {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Projects\\selwd\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get("https://www.google.com/imghp?hl=EN");
        driver.findElement(By.xpath("//div[@aria-label = 'Search by image']")).click();
        driver.findElement(By.xpath("//a[text()= 'Upload an image']")).click();
        driver.findElement(By.xpath("//input[@type= 'file']")).sendKeys("C:\\Projects\\selwd\\screenshots\\07_36_38.png");




//        searchInput.sendKeys(Keys.chord(Keys.LEFT_SHIFT, "test with shift"));
//        searchInput.sendKeys(Keys.ENTER);



        //driver.quit();










    }
}
