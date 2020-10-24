package pageobjectpattern;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignUpPage {

    WebDriver driver;

    private By heading = By.xpath("//div[@class='mb-4 mb-md-8 container-md']//h1");
    ////div[@class='text-mono text-center text-gray-light text-normal mb-3']/following-sibling::h1
    private By userNameSignUpPage = By.xpath("//input[@name='user[login]']");
    private By userEmailSignUpPage = By.xpath("//input[@name='user[email]']");
    private By userPasswordSignUpPage = By.xpath("//input[@name='user[password]']");
    private By createAccountButton = By.xpath("//div[@class='my-3']/button");


    private By headingError = By.xpath("//div[@class='mb-4']//div[@class='flash flash-error my-3']");
    private By errorUserName = By.xpath("//input[@name='user[login]']/ancestor::dd/following-sibling::dd");
    private By errorEmail = By.xpath("//input[@name='user[email]']/ancestor::dd/following-sibling::dd");
    private By errorPassword = By.xpath("//input[@name='user[password]']/ancestor::dd/following-sibling::dd");


    public SignUpPage(WebDriver driver) {
        this.driver = driver;
    }

    public SignUpPage typeUserName(String userName) {
        driver.findElement(userNameSignUpPage).sendKeys(userName);
        return this;
    }

    public SignUpPage typePassword(String password) {
        driver.findElement(userPasswordSignUpPage).sendKeys(password);
        return this;
    }

    public SignUpPage typeEmail(String email) {
        driver.findElement(userEmailSignUpPage).sendKeys(email);
        return this;
    }

    public SignUpPage registerWithInvalidCreds(String userName, String email, String password) {
        this.typeUserName(userName);
        this.typeEmail(email);
        this.typePassword(password);
        driver.findElement(createAccountButton).click();
        return new SignUpPage(driver);
    }

    public String getHeadingText() {
        return driver.findElement(heading).getText();
    }

    public String getErrorUserName() {
        return driver.findElement(errorUserName).getText();
    }

    public String getErrorEmail() {
        return driver.findElement(errorEmail).getText();
    }

    public String getErrorPassword() {
        return driver.findElement(errorPassword).getText();
    }


}
