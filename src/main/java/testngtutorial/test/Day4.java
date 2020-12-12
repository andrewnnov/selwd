package testngtutorial.test;

import org.testng.annotations.Parameters;
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

    @Parameters({"URL"})
    @Test
    public void loginAPIHome(String urlName) {
        //rest API
        System.out.println("APIHome");
        System.out.println(urlName);
    }
}
