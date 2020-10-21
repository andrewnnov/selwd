package pageobjectpattern;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage {

    private WebDriver driver;

    private By signInButton = By.xpath("//div[@class='d-lg-flex flex-items-center px-3 px-lg-0 text-center text-lg-left']//a[@class='HeaderMenu-link no-underline mr-3']");
    private By signUpButton = By.xpath("//div[@class='d-lg-flex flex-items-center px-3 px-lg-0 text-center text-lg-left']//a[@class='HeaderMenu-link d-inline-block no-underline border border-gray-dark rounded-1 px-2 py-1']");
    private By userLoginButton = By.xpath("//input[@id='user[login]']");
    private By userEmailButton = By.xpath("//input[@id='user[email]']");
    private By userPasswordButton = By.xpath("//input[@id='user[password]']");
    private By signUpForGitHubButton = By.xpath("//button[text()='Sign up for GitHub']");


    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    private LoginPage clickSignIn() {
        driver.findElement(signInButton);
        return new LoginPage(driver);
    }

    private SignUpPage clickSignUp() {
        driver.findElement(signUpButton);
        return new SignUpPage(driver);
    }

    private SignUpPage clickSignUpForGitHubButton() {
        driver.findElement(signUpForGitHubButton);
        return new SignUpPage(driver);
    }

    public MainPage typeUserName(String userName) {
        driver.findElement(userLoginButton).sendKeys(userName);
        return this;
    }

    public MainPage typePassword(String password) {
        driver.findElement(userPasswordButton).sendKeys(password);
        return this;
    }

    public MainPage typeEmail(String email) {
        driver.findElement(userEmailButton).sendKeys(email);
        return this;
    }

    private SignUpPage registration(String userName, String email, String pass) {
        this.typeUserName(userName);
        this.typeEmail(email);
        this.typePassword(pass);
        this.clickSignUpForGitHubButton();
        return new SignUpPage(driver);
    }




}
