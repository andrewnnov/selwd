package pageobject.objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Rediffloginpage {

    WebDriver driver;

    public Rediffloginpage(WebDriver driver) {
        this.driver = driver;
    }


    By username = By.id("login1");
    By password = By.id("password");
    By go = By.name("proceed");


    public WebElement emailId() {
        return driver.findElement(username);
    }

    public WebElement emailpasswordId() {
        return driver.findElement(password);
    }



}
