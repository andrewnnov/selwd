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
        driver.manage().window().maximize();

//        driver.findElement(By.xpath("//input[@id='searchInput']")).sendKeys("Selenium WebDriver");
//        driver.findElement(By.xpath("//input[@id='searchButton']")).click();
//        //get text field
//        System.out.println(driver.findElement(By.xpath("//div[@id='searchText']/input")).getAttribute("value"));
//        driver.findElement(By.xpath("//div[@id='searchText']/input")).clear();

        driver.get("https://github.com/");
        driver.findElement(By.xpath("//input[@id='user[login]']")).clear();
        driver.findElement(By.xpath("//input[@id='user[login]']")).sendKeys("NewUser111111111111");

        driver.findElement(By.xpath("//input[@id='user[password]']")).clear();
        driver.findElement(By.xpath("//input[@id='user[password]']")).sendKeys("Testpass111@");

        driver.findElement(By.xpath("//form[@class='home-hero-signup text-gray-dark js-signup-form js-signup-form-submit']//button")).click();


        driver.get("https://www.instagram.com/");
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Вася");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Assddee123@");

        System.out.println(driver.findElement(By.xpath("//input[@name='password']")).getAttribute("value"));

        driver.findElement(By.xpath("//form[@class='HmktE']//button")).submit();




       //button.submit();

        //driver.quit();


    }
}
