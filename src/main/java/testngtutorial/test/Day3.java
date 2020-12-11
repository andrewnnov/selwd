package testngtutorial.test;

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
}
