package e2e;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Arrays;
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

        String [] arrayOfVegetAndFruit = {"Brocolli", "Cauliflower", "Beetroot", "Cucumber"};
        Thread.sleep(3000);
        //List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
        List<WebElement> products = driver.findElements(By.xpath("//h4[@class='product-name']"));
//        for (WebElement el: products) {
//            System.out.println(el.getText());
//        }

        for (int i = 0; i < products.size(); i++) {

            //formatting string
            String[] name = products.get(i).getText().split("-");
            String formattingName = name[0].trim();
            //convert array into arrayList for easy search ??? strange
            List listOfChoose = Arrays.asList(arrayOfVegetAndFruit);


            int j = 0;
            if(listOfChoose.contains(formattingName)) {
                j++;
                driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
                //System.out.println(driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).getText());

                //3times
                if(j==arrayOfVegetAndFruit.length) {
                    break;
                }
            }
        }

        //driver.findElement(By.xpath("//h4[@class='product-name' and text()='Banana - 1 Kg']/following-sibling::div[@class='product-action']/button")).click();

    }
}
