package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class CheckBoxPractice {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Projects\\selwd\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        Assert.assertFalse(driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).isSelected());
        driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).click();
        Assert.assertTrue(driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).isSelected());
        driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).click();
        Assert.assertFalse(driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).isSelected());

        System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());
    }




}
