package e2e;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class WaiterImpAndExp {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Projects\\selwd\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        String [] arrayOfVegetAndFruit = {"Brocolli", "Cauliflower", "Beetroot", "Cucumber"};
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
        addItems(driver, arrayOfVegetAndFruit);

        driver.findElement(By.xpath("//img[@alt='Cart']")).click();
        driver.findElement(By.xpath("//div[@class='cart-preview active']//button[text()='PROCEED TO CHECKOUT']")).click();
        driver.findElement(By.xpath("//input[@class='promoCode']")).sendKeys("rahulshettyacademy");
        driver.findElement(By.xpath("//button[@class='promoBtn']")).click();
        String alarmInfo = driver.findElement(By.xpath("//span[@class='promoInfo']")).getText();
        System.out.println(alarmInfo);


    }

    public static void addItems(WebDriver driver, String [] arrayOfVegetAndFruit) {
        List<WebElement> products = driver.findElements(By.xpath("//h4[@class='product-name']"));

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
                if(j==arrayOfVegetAndFruit.length) {
                    break;
                }
            }
        }
    }
}
