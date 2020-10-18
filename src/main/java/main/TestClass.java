package main;


import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class TestClass {

    public static WebDriver driver;

    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "C:\\Projects\\selwd\\driver\\chromedriver.exe");
        driver = new ChromeDriver();
        //неявное ожидание
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();


        driver.get("https://auto.ru/");

        chooseMoto("Год от", "2012");


       //button.submit();

        //driver.quit();


    }

    public static void chooseMoto(String parameter1, String parameter2) {

        String xpassParam1 = String.format("//span[@class='Button__text' and text()='%s']", parameter1);
        String xpassParam2 = String.format("//div[@class='MenuItem MenuItem_size_m' and text()='%s']", parameter2);
        driver.findElement(By.xpath(xpassParam1)).click();
        driver.findElement(By.xpath(xpassParam2)).click();

    }
}
