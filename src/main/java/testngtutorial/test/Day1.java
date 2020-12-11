package testngtutorial.test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

public class Day1 {

    @Test
    public void demo() {
        System.out.println("hello");
    }

    @AfterSuite
    public void SecondTest() {
        System.out.println("bye");
    }
}
