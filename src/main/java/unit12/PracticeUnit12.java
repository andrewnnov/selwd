package unit12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class PracticeUnit12 {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Projects\\selwd\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");

        String textOfCheckBox = driver.findElement(By.xpath("//label[@for='benz']")).getText();
        System.out.println(textOfCheckBox);
        driver.findElement(By.xpath("//input[@id='checkBoxOption2']")).click();

        Select selectDropDown = new Select(driver.findElement(By.id("dropdown-class-example")));
        selectDropDown.selectByValue(textOfCheckBox.toLowerCase());


        driver.findElement(By.xpath("//input[@id='name']")).sendKeys(textOfCheckBox);
        driver.findElement(By.id("alertbtn")).click();

        String textFromAlert = driver.switchTo().alert().getText();
        System.out.println(driver.switchTo().alert().getText());

        if(textFromAlert.contains(textOfCheckBox)) {
            System.out.println("It is right answer");
            driver.switchTo().alert().accept();
        } else {
            System.out.println("Try again!!!");
        }
    }
}
