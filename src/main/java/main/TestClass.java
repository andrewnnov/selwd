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

        WebElement link = driver.findElement(By.xpath("//li[@id='n-aboutsite']/a"));
        System.out.println(link.getText());
        link.click();

        driver.get("https://www.instagram.com/");
        WebElement linkGit = driver.findElement(By.xpath("(//li[@class='K5OFK']/a)[2]"));
        linkGit.click();



       //button.submit();

        //driver.quit();


    }
}
