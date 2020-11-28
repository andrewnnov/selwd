package unit14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
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
        //URLConnection connection = new URL(url).openConnection();
        HttpURLConnection conn = (HttpURLConnection)new URL(url).openConnection();
        conn.setRequestMethod("HEAD");
        conn.connect();

        int respCode = conn.getResponseCode();
        System.out.println(respCode);

    }
}
