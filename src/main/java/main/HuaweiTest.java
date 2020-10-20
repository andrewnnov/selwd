package main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class HuaweiTest {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Projects\\selwd\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get("https://support.microsoft.com/ru-ru");

        WebDriverWait wait = (new WebDriverWait(driver, 5));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h1[contains(text(), \"Добро пожаловать в службу поддержки Майкрософт!\")]")));

        driver.findElement(By.xpath("//a[@class='ocpExternalLink supHomeAndLandingPageCTA' and text()='ПРОСМОТРЕТЬ ВАРИАНТЫ ОБУЧЕНИЯ']")).click();

        for(String tab: driver.getWindowHandles()) {
            driver.switchTo().window(tab);
            //System.out.println(tab.toString());

        }

        //driver.findElement(By.xpath("//a[@class='ocpExternalLink supHomeAndLandingPageCTA' and text()='ВЫБОР ШАБЛОНА']")).click();
        driver.findElement(By.xpath("//a[text()='Получить советы']")).click();
        //driver.findElement(By.xpath("//a[text()='Все вопросы и ответы']")).click();




    }
}
