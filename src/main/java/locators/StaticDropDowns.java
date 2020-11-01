package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class StaticDropDowns {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Projects\\selwd\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get("https://www.spicejet.com/");
//        Select select = new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
//        select.selectByValue("USD");
//        select.selectByVisibleText("AED");
//        select.selectByIndex(2);

        driver.findElement(By.id("divpaxinfo")).click();

        Select selectAdult = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
        selectAdult.selectByValue("2");

        Select selectChild = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Child")));
        selectChild.selectByVisibleText("4");

        Select selectInfant = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Infant")));
        selectInfant.selectByValue("2");


    }
}
