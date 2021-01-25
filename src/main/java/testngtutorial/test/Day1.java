package testngtutorial.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Day1 {




    @Test
    public void demo() {
        System.out.println("hello");
        Assert.assertTrue(false);
    }

    @Test
    public void SecondTest() {
        System.out.println("bye");
    }
}
