package unit13;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class AutoSuggestivePractice {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Projects\\selwd\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
        WebElement country = driver.findElement(By.id("autocomplete"));
        country.sendKeys("ind");

        JavascriptExecutor js = (JavascriptExecutor)driver;
        String script = "return document.getElementById(\"autocomplete\").value;";
        String textFromField = (String)js.executeScript(script);

        int i = 0;
        while (!textFromField.equalsIgnoreCase("India")) {
            i++;
            country.sendKeys(Keys.ARROW_DOWN);
            if (i > 5) {
                break;
            }

        }
        textFromField = (String)js.executeScript(script);
        System.out.println(textFromField);


    }
}
