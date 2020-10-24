import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageobjectpattern.LoginPage;
import pageobjectpattern.MainPage;
import pageobjectpattern.SignUpPage;

import java.util.concurrent.TimeUnit;

public class LoginPageTest {

    private WebDriver driver;
    private LoginPage loginPage;

    @Before
    public void setUP() {
        System.setProperty("webdriver.chrome.driver", "C:\\Projects\\selwd\\driver\\chromedriver.exe");
        driver = new ChromeDriver();
        //неявное ожидание
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://github.com/login");
        loginPage = new LoginPage(driver);
    }

    @Test
    public void loginWithEmptyCredsTest() {
        LoginPage loginPageError = loginPage.loginWithInvalidCreds("", "");
        String errorMessage = loginPageError.getErrorMessage();
        Assert.assertEquals("Incorrect username or password.", errorMessage);
    }

    @Test
    public void loginWithInvalidCredsTest() {
        LoginPage loginPageError = loginPage.loginWithInvalidCreds("rerew", "rewrew");
        String errorMessage = loginPageError.getErrorMessage();
        Assert.assertEquals("Incorrect username or password.", errorMessage);
    }

    @Test
    public void createAccountTest() {
        SignUpPage signUpPage = loginPage.createAccount();
        String signUpHeadingText = signUpPage.getHeadingText();
        Assert.assertEquals("Create your account", signUpHeadingText);
    }


    @After
    public void tearDown() {
        driver.quit();
    }


}
