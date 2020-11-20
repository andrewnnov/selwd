package unit13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class TableExample {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Projects\\selwd\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.cricbuzz.com/live-cricket-scorecard/30325/krk-vs-lhq-final-pakistan-super-league-2020");

        WebElement table = driver.findElement(By.xpath("(//div[@class='cb-col cb-col-100 cb-ltst-wgt-hdr'])[1]")); //only 1st table
        //WebElement table = driver.findElement(By.xpath("//div[@id='innings_1']//div[@class='cb-col cb-col-100 cb-ltst-wgt-hdr']"));

        int rowCount = table.findElements(By.xpath("//div[@id='innings_1']/div[@class='cb-col cb-col-100 cb-ltst-wgt-hdr'][1]")).size();
        //int rowCount = table.findElements(By.xpath("//div[@class='cb-col cb-col-100 cb-scrd-itms']")).size();
        System.out.println("rowCount - " + rowCount);

        int count = table.findElements(By.xpath("//div[@id='innings_1']/div[@class='cb-col cb-col-100 cb-ltst-wgt-hdr'][1]//div[@class='cb-col cb-col-8 text-right text-bold']")).size();
        System.out.println("count - " + count);
        for (int i = 1; i < count; i++) {
            System.out.println(table.findElements(By.xpath("//div[@id='innings_1']/div[@class='cb-col cb-col-100 cb-ltst-wgt-hdr'][1]//div[@class='cb-col cb-col-8 text-right text-bold']")).get(i).getText());
        }
    }
}
