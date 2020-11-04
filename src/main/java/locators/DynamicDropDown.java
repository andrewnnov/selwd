package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class DynamicDropDown {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Projects\\selwd\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get("https://www.spicejet.com/");

        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
        driver.findElement(By.xpath("//a[@value='BLR']")).click();

       // driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
        //driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();  // very bad
        driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_originStation1_CTNR']//a[@value='MAA']")).click();  // very bad
        driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
        System.out.println(driver.findElement(By.id("Div1")).getAttribute("style")); //check enable element of calendar
        driver.findElement(By.xpath("//input[@id='ctl00_mainContent_rbtnl_Trip_1']")).click();
        Assert.assertTrue(driver.findElement(By.xpath("//input[@id='ctl00_mainContent_rbtnl_Trip_1']")).isSelected());
        System.out.println(driver.findElement(By.id("Div1")).getAttribute("style")); //check enable element of calendar

        if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1")) {
            System.out.println("It is enabled");
            Assert.assertTrue(true);
        }else {
            Assert.assertTrue(false);
        }



        //driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
        //System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
        //System.out.println(driver.findElement(By.id("view_fulldate_id_2")).isEnabled());






    }
}
