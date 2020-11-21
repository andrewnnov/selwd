package ted;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class RandomArticleFromTed {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Projects\\selwd\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.ted.com/topics");


        WebElement allTopic = driver.findElement(By.xpath("//div[@class='main topics-main']"));
        List<WebElement> listOfArticle = allTopic.findElements(By.tagName("a"));
        //System.out.println(listOfArticle.size());

        //Random rand = new Random();
        int min = 1;
        int max = listOfArticle.size() - 1;

        //System.out.println(random_int);
        listOfArticle.get(chooseArticle(min, max)).click();
        String theme = driver.findElement(By.xpath("//div[@class='m1 module']/h1")).getText();
        System.out.println("Today you will read about " + theme);
        driver.findElement(By.xpath("//span[@class='thumb thumb--square']")).click();

    }


    public static int chooseArticle(int min, int max) {
        return (int)(Math.random() * (max - min + 1) + min);
    }

}
