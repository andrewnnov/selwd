package pageobject.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pageobject.objectrepository.Rediffloginpage;

import java.util.concurrent.TimeUnit;

public class LoginAppApplication {

    @Test
    public void Login() {

        System.setProperty("webdriver.chrome.driver", "C:\\Projects\\selwd\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        Rediffloginpage rd = new Rediffloginpage(driver);

        rd.emailId().sendKeys("hello");
        rd.emailpasswordId().sendKeys("111111");




    }
}
