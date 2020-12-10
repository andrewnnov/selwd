package testngtutorial.test;

import org.testng.annotations.Test;

public class Day4 {

    @Test
    public void webLoginHome() {
        //Selenium
        System.out.println("webHome");
    }

    @Test
    public void mobileLoginHome() {
        //Apium
        System.out.println("mobileHome");
    }

    @Test
    public void loginAPIHome() {
        //rest API
        System.out.println("APIHome");
    }
}
