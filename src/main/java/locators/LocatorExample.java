package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LocatorExample {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Projects\\selwd\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.facebook.com/");
        //driver.findElement(By.id("email")).sendKeys("test@test.com");
        driver.findElement(By.cssSelector("#email")).sendKeys("emailAddress");
        driver.findElement(By.name("pass")).sendKeys("123456");
        driver.findElement(By.linkText("Забыли пароль?")).click();
        //driver.close();



        driver.get("https://login.salesforce.com/");
        driver.findElement(By.id("username")).sendKeys("Hello");
        driver.findElement(By.name("pw")).sendKeys("123456");
        //driver.findElement(By.id("Login")).click();

        driver.findElement(By.xpath("//input[@id='Login']")).click();
        Thread.sleep(6000);


        String cssText = driver.findElement(By.cssSelector("div#error.loginError")).getText();
        String cssText2 = driver.findElement(By.cssSelector("form#login_form div#error.loginError")).getText();
        String xpassText = driver.findElement(By.xpath("//*[@id='error']")).getText();
        String xpassText2 = driver.findElement(By.xpath("//form/div[@class='loginError']")).getText();

        System.out.println(cssText + "21");
        System.out.println(cssText2 + "22");
        System.out.println(xpassText + "24");
        System.out.println(xpassText2 + "25");


    }
}
