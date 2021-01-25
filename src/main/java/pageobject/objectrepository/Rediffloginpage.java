package pageobject.objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Rediffloginpage {

    WebDriver driver;


    By username = By.id("login1");
    By password = By.id("password");
    By go = By.name("proceed");
    By home = By.linkText("home");

    public Rediffloginpage(WebDriver driver) {
        this.driver = driver;
    }


    public WebElement emailId() {
        return driver.findElement(username);
    }

    public WebElement passwordId() {
        return driver.findElement(password);
    }

    public WebElement submit() {
        return driver.findElement(go);
    }



}
