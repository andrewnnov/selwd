package main;


import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class TestClass {

    public static WebDriver driver;

    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "C:\\Projects\\selwd\\driver\\chromedriver.exe");
        driver = new ChromeDriver();
        //неявное ожидание
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();


        driver.get("https://www.ozon.ru/category/odezhda-obuv-i-aksessuary-7500/?from_global=true&text=%D0%BA%D1%80%D0%BE%D1%81%D1%81%D0%BE%D0%B2%D0%BA%D0%B8+%D0%BC%D1%83%D0%B6%D1%81%D0%BA%D0%B8%D0%B5");

        List<WebElement> arrayCheckBox = driver.findElements(By.xpath("//div[@class='cy7']/a[@class='c0y6 c0z']"));
        for (WebElement webElement : arrayCheckBox) {
            webElement.click();
        }







       //button.submit();

        //driver.quit();


    }


}
