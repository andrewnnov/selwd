package e2e;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class E2E {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Projects\\selwd\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.spicejet.com/");

        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
        driver.findElement(By.xpath("//a[@value='DEL']")).click();

        driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_originStation1_CTNR']//a[@value='MAA']")).click();

        driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();

        if(driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5")) {
            System.out.println("It is disabled");
            Assert.assertTrue(true);
        }else {
            Assert.assertTrue(false);
        }

        driver.findElement(By.id("divpaxinfo")).click();

        Select selectAdult = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
        selectAdult.selectByValue("2");

        Select selectChild = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Child")));
        selectChild.selectByVisibleText("4");

        Select selectInfant = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Infant")));
        selectInfant.selectByValue("2");

        Select select = new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
        select.selectByValue("USD");

        driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
    }
}
