package testngtutorial.test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day2 {

    @Test
    public void demo() {
        System.out.println("good");
    }

    @BeforeTest
    public void prerequisite() {
        System.out.println("I will execute it first");
    }

}
