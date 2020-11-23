package unit13;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class AutoSuggestive {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Projects\\selwd\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.ksrtc.in");

        WebElement fromPlace = driver.findElement(By.id("fromPlaceName"));
        fromPlace.sendKeys("BENG");
        fromPlace.sendKeys(Keys.ARROW_DOWN);
        //fromPlace.sendKeys(Keys.ARROW_DOWN, Keys.ENTER);


        //it doesn't work need JS executor
        System.out.println(fromPlace.getText());

        //JS DOM can extract hidden elements
        //JavaScript executor
        JavascriptExecutor js = (JavascriptExecutor)driver;
        //get from browser's console
        String script = "return document.getElementById(\"fromPlaceName\").value;";
        String textFromField = (String)js.executeScript(script);
        System.out.println(textFromField);
        int i = 0;

        //BENGALURU INTERNATION AIRPORT
        while (!textFromField.equalsIgnoreCase("BENGALURU INTERNATION AIRPORT")) {
            i++;
            fromPlace.sendKeys(Keys.ARROW_DOWN);
            textFromField = (String)js.executeScript(script);
            System.out.println(textFromField);
            //fromPlace.sendKeys(Keys.ARROW_DOWN);
            if(i > 10) {
                break;
            }
        }

        if(i > 10) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found");
        }






    }
}
