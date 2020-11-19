package unit12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class CalendarExample {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Projects\\selwd\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.path2usa.com/travel-companions");

        //December 22
        driver.findElement(By.id("travel_date")).click();

        //choose month DEC
        driver.findElement(By.xpath("//div[@class='datepicker-days']//th[@class='datepicker-switch']")).click();
        List<WebElement> month = driver.findElements(By.className("month"));
        for (int j = 0; j < month.size(); j++) {

            String textMonth = driver.findElements(By.className("month")).get(j).getText();
            if (textMonth.equalsIgnoreCase("DEC")) {
                driver.findElements(By.className("month")).get(j).click();
                break;
            }
        }

        //choose day
        List<WebElement> dates = driver.findElements(By.className("day"));
        for (int i = 0; i < dates.size(); i++) {

            String text = driver.findElements(By.className("day")).get(i).getText();
            if(text.equalsIgnoreCase("22")) {
                driver.findElements(By.className("day")).get(i).click();
                break;
            }
        }
    }
}
