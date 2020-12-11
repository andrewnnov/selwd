package testngtutorial.test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Day3 {

    @Test
    public void webLogin() {
        //Selenium
        System.out.println("web");
    }

    @Test
    public void mobileLogin() {
        //Apium
        System.out.println("mobile");
    }

    @Test
    public void mobileSearch() {
        //Apium
        System.out.println("mobileSearch");
    }

    @Test
    public void mobileChrome() {
        //Apium
        System.out.println("mobileChrome");
    }

    @Test
    public void loginAPI() {
        //rest API
        System.out.println("API");
    }

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("I am number one");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("I am number one last");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("before method before day 3 class");
    }

    @BeforeMethod
    public void afterMethod() {
        System.out.println("after method before day 3 class");
    }




}
