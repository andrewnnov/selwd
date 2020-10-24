package pageobjectpattern;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage {

    private WebDriver driver;

    @FindBy(xpath = "//div[@class='d-lg-flex flex-items-center px-3 px-lg-0 text-center text-lg-left']//a[@class='HeaderMenu-link no-underline mr-3']")
    private WebElement signInButton;

    @FindBy(xpath = "//div[@class='d-lg-flex flex-items-center px-3 px-lg-0 text-center text-lg-left']//a[@class='HeaderMenu-link d-inline-block no-underline border border-gray-dark rounded-1 px-2 py-1']")
    private WebElement signUpButton;

    @FindBy(xpath = "//input[@id='user[login]']")
    private WebElement userLoginButton;

    @FindBy(xpath = "//input[@id='user[email]']")
    private WebElement userEmailButton;

    @FindBy(xpath = "//input[@id='user[password]']")
    private WebElement userPasswordButton;

    @FindBy(xpath = "//button[text()='Sign up for GitHub']")
    private WebElement signUpForGitHubButton;


    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    private LoginPage clickSignIn() {
        signInButton.click();
        return new LoginPage(driver);
    }

    private SignUpPage clickSignUp() {
        signUpButton.click();
        return new SignUpPage(driver);
    }

    private SignUpPage clickSignUpForGitHubButton() {
        signUpForGitHubButton.click();
        return new SignUpPage(driver);
    }

    public MainPage typeUserName(String userName) {
        userLoginButton.sendKeys(userName);
        return this;
    }

    public MainPage typePassword(String password) {
        userPasswordButton.sendKeys(password);
        return this;
    }

    public MainPage typeEmail(String email) {
        userEmailButton.sendKeys(email);
        return this;
    }

    public SignUpPage registration(String userName, String email, String pass) {
        this.typeUserName(userName);
        this.typeEmail(email);
        this.typePassword(pass);
        this.clickSignUpForGitHubButton();
        return new SignUpPage(driver);
    }




}
