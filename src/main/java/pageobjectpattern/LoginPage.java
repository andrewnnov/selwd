package pageobjectpattern;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    WebDriver driver;
    private By loginField = By.xpath("//input[@id='login_field']");
    private By passwordField = By.xpath("//input[@id='password']");
    private By signInButton = By.xpath("//input[@value='Sign in']");
    private By heading = By.xpath("//div[contains(@class, 'auth-form-header p-0')]/h1");
    private By errorMessage = By.xpath("//div[@class='container-lg px-2']");
    private By linkCreateAnAccount = By.xpath("//a[text()='Create an account']");



    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public LoginPage typeUserName(String userName) {
        driver.findElement(loginField);
        return this;
    }

    public LoginPage typePassword(String password) {
        driver.findElement(passwordField);
        return this;
    }

    public LoginPage loginWithInvalidCreds(String userName, String password) {
        this.typeUserName(userName);
        this.typePassword(password);
        driver.findElement(signInButton).click();

        return new LoginPage(driver);
    }

    public String getHeadingText() {
        return driver.findElement(heading).getText();
    }

    public String getErrorMessage() {
        return driver.findElement(errorMessage).getText();
    }

    public SignUpPage createAccount() {
        driver.findElement(linkCreateAnAccount).click();
        return new SignUpPage(driver);
    }
}
