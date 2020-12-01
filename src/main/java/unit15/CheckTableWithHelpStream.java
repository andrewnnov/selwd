package unit15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class CheckTableWithHelpStream {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Projects\\selwd\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");

        //click on column
        driver.findElement(By.xpath("//span[contains(text(), \"Veg/fruit name\")]")).click();

        //capture all webelement into list
        List<WebElement> listVegAndFruit = driver.findElements(By.xpath("//tbody//tr/td[1]"));

        //capture text of all webelement inByto new list
        List<String> listName = listVegAndFruit.stream().map(s -> s.getText()).collect(Collectors.toList());

        //sort in the list з
        List<String> listNameSorted = listName.stream().sorted().collect(Collectors.toList());
        Assert.assertTrue(listName.equals(listNameSorted));

        //scan the name column with get text Rice -> price
        List<String> price = listVegAndFruit.stream().filter(s -> s.getText().contains("Beans")).map(s -> getPriceVeg(s)).collect(Collectors.toList());
        //price.stream().forEach(s -> System.out.println(s));
        price.forEach(s -> System.out.println(s));

    }

    private static String getPriceVeg(WebElement s) {
        String priceValue = s.findElement(By.xpath("following-sibling::td[1]")).getText();
        return priceValue;

    }
}
