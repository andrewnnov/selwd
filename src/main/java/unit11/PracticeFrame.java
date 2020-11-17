package unit11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class PracticeFrame {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Projects\\selwd\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com");
        driver.findElement(By.xpath("//a[text()='Nested Frames']")).click();

        System.out.println(driver.findElements(By.tagName("frame")).size());
        //switch to first top frame
        driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name='frame-top']")));
        System.out.println(driver.findElements(By.tagName("frame")).size());

        //switch to second middle frame
        driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name='frame-middle']")));
        String noticeOnFrame = driver.findElement(By.xpath("//div[@id='content']")).getText();
        System.out.println(noticeOnFrame);
    }
}
