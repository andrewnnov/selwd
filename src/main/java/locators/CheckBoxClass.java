package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class CheckBoxClass {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Projects\\selwd\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get("https://www.spicejet.com/");
        Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());

        driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).click(); //css selector
        //System.out.println();
        Assert.assertTrue(driver.findElement(By.xpath("//input[contains(@id, 'friendsandfamily')]")).isSelected());
        driver.findElement(By.xpath("//input[contains(@id, 'friendsandfamily')]")).click(); //xpass selector
        //System.out.println();
        Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
        //count of number chechboxes
        List<WebElement> listOfCheckBoxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
        Assert.assertEquals(listOfCheckBoxes.size(), 6);
        System.out.println(listOfCheckBoxes.size());





    }
}
