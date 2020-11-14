package e2e;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitPractice {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Projects\\selwd\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        WebDriverWait ww = new WebDriverWait(driver, 5); //-explicit wait
        driver.manage().window().maximize();
        driver.get("http://www.itgeared.com/demo/1506-ajax-loading.html");

        driver.findElement(By.xpath("//a[text()=\"Click to load get data via Ajax!\"]")).click();
        ww.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='results']")));
        System.out.println(driver.findElement(By.xpath("//div[@id='results']")).getText());




    }
}
