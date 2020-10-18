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
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //driver.get("https://en.wikipedia.org/");
        //управление размером экрана
        driver.manage().window().maximize();

//        driver.findElement(By.xpath("//input[@id='searchInput']")).sendKeys("Selenium WebDriver");
//        driver.findElement(By.xpath("//input[@id='searchButton']")).click();
//        //get text field
//        System.out.println(driver.findElement(By.xpath("//div[@id='searchText']/input")).getAttribute("value"));
//        driver.findElement(By.xpath("//div[@id='searchText']/input")).clear();
        //driver.get("https://yandex.ru/");
        //System.out.println(driver.getWindowHandle());

//
//        driver.findElement(By.xpath("//div[text()='Маркет']")).click();
//
//        for (String tab : driver.getWindowHandles()) {
//           driver.switchTo().window(tab);
//            //System.out.println(tab);
//        }



        //System.out.println(driver.getWindowHandle());

        //WebElement webElement1 = driver.findElement(By.xpath("//div[@class='_3t-zItniCq']//button"));
        //webElement1.submit();
        //driver.findElement(By.xpath("//button/span[text()='Да, спасибо']")).click();
//        if(elementGeoLocation.isEnabled()) {
//            elementGeoLocation.click();
//        }
        //elementGeoLocation.click();

        driver.get("https://www.udemy.com/");

        driver.findElement(By.xpath("//div[@class='header--gap-auth-button--7KoL0']")).click();
        //driver.findElement(By.xpath("//span[text()='Бытовая техника']")).click();


        driver.findElement(By.xpath("//input[@id='email--1']")).sendKeys("*******");
        driver.findElement(By.xpath("//input[@id='id_password']")).sendKeys("******");
        driver.findElement(By.xpath("//input[@id='submit-id-submit']")).submit();
        driver.findElement(By.xpath("//span[@class='udlite-text-sm header--dropdown-button-text--2jtIM' and text()='Мое обучение']")).click();
        driver.findElement(By.xpath("//strong[@class='details__name' and text()='Full Stack: Angular and Spring Boot']")).click();
        driver.findElement(By.xpath("//div[@data-purpose='curriculum-item-9-2']/label[@class='curriculum-item-link--progress-toggle--1CMcg checkbox-inline']/input")).click();
        System.out.println(driver.findElement(By.xpath("//div[@data-purpose='curriculum-item-9-2']/label[@class='curriculum-item-link--progress-toggle--1CMcg checkbox-inline']/input")).isSelected());
        driver.findElement(By.xpath("//div[@data-purpose='curriculum-item-9-2']/label[@class='curriculum-item-link--progress-toggle--1CMcg checkbox-inline']/input")).click();

        System.out.println(driver.findElement(By.xpath("//div[@data-purpose='curriculum-item-9-2']/label[@class='curriculum-item-link--progress-toggle--1CMcg checkbox-inline']/input")).isSelected());




       //button.submit();

        //driver.quit();


    }
}
