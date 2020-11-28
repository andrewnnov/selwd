package unit14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class BrokenLinks {

    public static void main(String[] args) throws IOException {
        System.setProperty("webdriver.chrome.driver", "C:\\Projects\\selwd\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");

        //broken URL
        //Java method will call URLs and gets the status code

        String url = driver.findElement(By.xpath("//div[@id='gf-BIG']//a[contains(text(), \"Broken Link\")]")).getAttribute("href");
        HttpURLConnection conn = (HttpURLConnection)new URL(url).openConnection();
        conn.setRequestMethod("HEAD");
        conn.connect();
        int respCode = conn.getResponseCode();
        System.out.println(respCode);


        System.out.println("-----------grab all links -----------------------");


        //grab all links on footer
        List<WebElement> listWithATag = driver.findElements(By.xpath("//div[@id='gf-BIG']//a"));
        SoftAssert softAssert = new SoftAssert(); //
        for (WebElement link : listWithATag) {
            String urlFromPage = link.getAttribute("href");
            HttpURLConnection connection = (HttpURLConnection)new URL(urlFromPage).openConnection();
            connection.setRequestMethod("HEAD");
            connection.connect();

            int responseCode = connection.getResponseCode();
            System.out.println(responseCode);
            softAssert.assertTrue(responseCode < 400,"The link with text " + link.getText() + "is broken " + responseCode);

//            if(responseCode > 400) {
//
//                System.out.println("The link with text " + link.getText() + "is broken " + responseCode);
//                Assert.assertTrue(false);
//            }
        }

        softAssert.assertAll(); //if page has broken links assertAll - isFailed

    }
}
