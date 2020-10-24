package pageobjectpattern;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class MainClass {

    static WebDriver driver;

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Projects\\selwd\\driver\\chromedriver.exe");
        driver = new ChromeDriver();
        //неявное ожидание
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://github.com/");


        MainPage mainPage = new MainPage(driver);
        mainPage.registration("!!!!!", "Affff", "Sfdfdfdsfd3345666@");

    }
}
