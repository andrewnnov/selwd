package e2e;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class AddingItemsInToCart {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Projects\\selwd\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");


        //driver.findElement(By.xpath("//h4[@class='product-name' and text()='Cucumber - 1 Kg']/following-sibling::div[@class='product-action']/button")).click();

        String [] arrayOfVegetAndFruit = {"Cucumber", "Carrot "};
        List<WebElement> products = driver.findElements(By.xpath("//h4[@class='product-name']"));

        for (int i = 0; i < products.size(); i++) {
            String name = products.get(i).getText();
            if(name.contains("Cucumber")) {
                driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
                break;
            }
        }

        Thread.sleep(3000);

        driver.findElement(By.xpath("//h4[@class='product-name' and text()='Banana - 1 Kg']/following-sibling::div[@class='product-action']/button")).click();

    }
}
