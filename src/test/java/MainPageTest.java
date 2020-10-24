import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageobjectpattern.LoginPage;
import pageobjectpattern.MainPage;
import pageobjectpattern.SignUpPage;

import java.util.concurrent.TimeUnit;

public class MainPageTest {

    private WebDriver driver;
    private MainPage mainPage;

    @Before
    public void setUP() {
        System.setProperty("webdriver.chrome.driver", "C:\\Projects\\selwd\\driver\\chromedriver.exe");
        driver = new ChromeDriver();
        //неявное ожидание
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://github.com/");
        mainPage = new MainPage(driver);
    }

    @Test
    public void signInTest() {
        LoginPage loginPage = mainPage.clickSignIn();
        String heading = loginPage.getHeadingText();
        Assert.assertEquals("Sign in to GitHub", heading);
    }

    @Test
    public void registrationFailedTest() {
        SignUpPage signUpPage = mainPage.registration("test", "aser@test.com", "AerrtyFr3453@");
        String mainError = signUpPage.getHeadingErrorText();
        Assert.assertEquals("There were problems creating your account.", mainError);

    }

    @Test
    public void signUpEmptyUserNameTest() {
        SignUpPage signUpPage = mainPage.registration("", "aser@test.com", "AerrtyFr3453@");
        String emptyUserNameError = signUpPage.getErrorUserName();
        Assert.assertEquals("Username can't be blank", emptyUserNameError);

    }

    @Test
    public void signUpInvalidEmailTest() {
        SignUpPage signUpPage = mainPage.registration("f45666655", "", "AerrtyFr3453@");
        String emptyEmailError = signUpPage.getErrorEmail();
        Assert.assertEquals("Email can't be blank", emptyEmailError);
    }


    @After
    public void tearDown() {
        driver.quit();
    }


}
