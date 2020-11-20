package unit13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class TablePractice {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Projects\\selwd\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");

        WebElement table = driver.findElement(By.id("product"));
        System.out.println("Number of row = " + table.findElements(By.tagName("tr")).size());
        System.out.println("Number of columns = " + table.findElements(By.xpath("//tbody/tr[1]/th")).size());
        //System.out.println(table.findElements(By.tagName("tr")).get(0).findElements(By.tagName("th")).size());

        List<WebElement> list = table.findElements(By.xpath("//tbody/tr[3]/td"));
        for (WebElement textElement: list) {
            System.out.println(textElement.getText());
        }
    }
}
