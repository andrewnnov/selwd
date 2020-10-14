package main;


import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class TestClass {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Projects\\selwd\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //неявное ожидание
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://en.wikipedia.org/");
        //управление размером экрана
        //driver.manage().window().maximize();

       WebElement buttonSearch = driver.findElement(By.xpath("//input[@id='searchButton']"));
       buttonSearch.click();

       driver.get("https://github.com/");
       //driver.findElement(By.xpath("")).click();

       WebElement button = driver.findElement(By.xpath("//form[@class='home-hero-signup text-gray-dark js-signup-form js-signup-form-submit']//button"));
       if(button.getText().equals("Sign up for GitHub")) {
           System.out.println("Success!!!");
           //button.submit();
       } else {
           System.out.println("Fail!!!");
       }

        driver.get("https://github.com/");


       WebElement button2 = driver.findElement(By.xpath("//div/a[@class='HeaderMenu-link no-underline mr-3']"));
       button2.click();




       //button.submit();

        //driver.quit();


    }
}
