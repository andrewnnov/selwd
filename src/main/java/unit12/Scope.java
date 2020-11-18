package unit12;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class Scope {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Projects\\selwd\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");

        //1. Give me the count of links
        //a
        System.out.println(driver.findElements(By.tagName("a")).size());


        //create sub driver for footer section
        WebElement footDriver = driver.findElement(By.id("gf-BIG"));
        System.out.println(footDriver.findElements(By.tagName("a")).size());


        WebElement columnDriver = footDriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
        System.out.println(columnDriver.findElements(By.tagName("a")).size());


        //click on each link the column and check if page are opening
        for(int i = 1; i < columnDriver.findElements(By.tagName("a")).size(); i++ ) {

            String clickOnLink = Keys.chord(Keys.CONTROL, Keys.ENTER);
            columnDriver.findElements(By.tagName("a")).get(i).sendKeys(clickOnLink);
            }

        Set<String> titlesPage =  driver.getWindowHandles();
        Iterator<String> it = titlesPage.iterator();
        while (it.hasNext()) {
            driver.switchTo().window(it.next());
            System.out.println(driver.getTitle());
        }

    }
}
