import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageobjectpattern.LoginPage;
import pageobjectpattern.SignUpPage;

import java.util.concurrent.TimeUnit;

public class SignUpPageTest {

    private WebDriver driver;
    private SignUpPage signUpPage;

    @Before
    public void setUP() {
        System.setProperty("webdriver.chrome.driver", "C:\\Projects\\selwd\\driver\\chromedriver.exe");
        driver = new ChromeDriver();
        //неявное ожидание
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://github.com/join?ref_cta=Sign+up&ref_loc=header+logged+out&ref_page=%2F&source=header-home");
        signUpPage = new SignUpPage(driver);
    }

    @Test
    public void signUpWithShortPass() {
        SignUpPage newSignUpPage = signUpPage.typePassword("111");
        String errorMessagePass = newSignUpPage.getErrorPassword();
        String expResultMessage = "Password is too short (minimum is 8 characters), needs at least 1 lowercase letter, and is in a list of passwords commonly used on other websites";
        Assert.assertEquals(expResultMessage, errorMessagePass);
    }

    @Test
    public void signUpWithExistsUser() {
        SignUpPage newSignUpPage = signUpPage.typeUserName("user");
        String errorMessageUserName = newSignUpPage.getErrorUserName();
        Assert.assertEquals("Username user is not available.", errorMessageUserName);

    }

    @After
    public void tearDown() {
        driver.quit();
    }


}
