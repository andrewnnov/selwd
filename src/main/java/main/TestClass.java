package main;


import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Projects\\selwd\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.yandex.ru");

        //управление размером экрана
        //driver.manage().window().maximize();

        //определенный размер окна
        driver.manage().window().setSize(new Dimension(900, 600));

        driver.navigate().to("https://www.google.com");
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();

        System.out.println(driver.getTitle());

        System.out.println(driver.getCurrentUrl());

        driver.quit();
    }
}
