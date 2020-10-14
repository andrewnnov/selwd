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

        WebElement link = driver.findElement(By.linkText("Log in"));

        WebElement link2 = driver.findElement(By.partialLinkText("Random"));

        WebElement searchField = driver.findElement(By.name("search"));

        WebElement searchButton = driver.findElement(By.className("searchButton"));

        WebElement id = driver.findElement(By.id("ca-viewsource"));

        WebElement tagNameInput = driver.findElement(By.tagName("input"));

        WebElement element = driver.findElement(By.cssSelector("#searchInput"));

        WebElement xpassElement = driver.findElement(By.xpath("//div[@id='p-logo']"));

        driver.quit();


    }
}
