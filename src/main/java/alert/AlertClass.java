package alert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class AlertClass {

    public static void main(String[] args) {

        String text = "My name";
        System.setProperty("webdriver.chrome.driver", "C:\\Projects\\selwd\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        driver.findElement(By.xpath("//input[@id='name']")).sendKeys(text);
        driver.findElement(By.xpath("//input[@id='alertbtn']")).click();

        //grab text from Alert
        System.out.println(driver.switchTo().alert().getText());
        //accept alert
        driver.switchTo().alert().accept();


        driver.findElement(By.xpath("//input[@id='name']")).sendKeys(text);
        driver.findElement(By.xpath("//input[@id='confirmbtn']")).click();
        System.out.println(driver.switchTo().alert().getText());

        //
        driver.switchTo().alert().dismiss();


    }
}
