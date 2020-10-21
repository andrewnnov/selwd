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


        driver.get("https://www.w3schools.com/sql/sql_select.asp");
        WebElement tableElement = driver.findElement(By.xpath("//table[@class='w3-table-all notranslate']"));

       Table table = new Table(tableElement, driver);



        System.out.println(table.getRows().size());

        System.out.println(table.getHeadings().size());

        for(WebElement el: table.getHeadings()) {
            System.out.println(el.getText());
        }








       //button.submit();

        //driver.quit();


    }


}
